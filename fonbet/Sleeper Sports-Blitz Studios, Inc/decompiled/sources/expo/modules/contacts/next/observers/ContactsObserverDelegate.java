package expo.modules.contacts.next.observers;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.ContactsContract;
import expo.modules.contacts.next.ContactsNextModule;
import expo.modules.contacts.next.ContactsObserverException;
import expo.modules.contacts.next.ContentResolverNotObtainedException;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.UtilsKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsObserverDelegate.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/observers/ContactsObserverDelegate;", "", "appContext", "Lexpo/modules/kotlin/AppContext;", "module", "Lexpo/modules/contacts/next/ContactsNextModule;", "<init>", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/contacts/next/ContactsNextModule;)V", "contactsHandlerThread", "Landroid/os/HandlerThread;", "contactsHandler", "Landroid/os/Handler;", "observer", "Lexpo/modules/contacts/next/observers/ContactsObserver;", "weakAppContextRef", "Ljava/lang/ref/WeakReference;", "weakModuleRef", "resolver", "Landroid/content/ContentResolver;", "startObservingContactChanges", "", "stopObservingContactChanges", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactsObserverDelegate {
    public static final String ON_CONTACTS_CHANGE_EVENT_NAME = "onContactsChange";
    private Handler contactsHandler;
    private HandlerThread contactsHandlerThread;
    private ContactsObserver observer;
    private final ContentResolver resolver;
    private final WeakReference<AppContext> weakAppContextRef;
    private final WeakReference<ContactsNextModule> weakModuleRef;

    public ContactsObserverDelegate(AppContext appContext, ContactsNextModule module) {
        Context reactContext;
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(module, "module");
        WeakReference<AppContext> weak = UtilsKt.weak(appContext);
        this.weakAppContextRef = weak;
        this.weakModuleRef = UtilsKt.weak(module);
        AppContext appContext2 = weak.get();
        if (appContext2 != null && (reactContext = appContext2.getReactContext()) != null && (contentResolver = reactContext.getContentResolver()) != null) {
            this.resolver = contentResolver;
            return;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    public final void startObservingContactChanges() {
        if (this.observer != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ContactsObserverThread");
        handlerThread.start();
        if (!handlerThread.isAlive()) {
            throw new ContactsObserverException("The observer thread failed to start", null, 2, null);
        }
        this.contactsHandlerThread = handlerThread;
        this.contactsHandler = new Handler(handlerThread.getLooper());
        ContactsNextModule contactsNextModule = this.weakModuleRef.get();
        if (contactsNextModule == null) {
            throw new ContactsObserverException("The module has not been initialized", null, 2, null);
        }
        Handler handler = this.contactsHandler;
        if (handler != null) {
            this.observer = new ContactsObserver(contactsNextModule, handler);
            for (Uri uri : CollectionsKt.listOf((Object[]) new Uri[]{ContactsContract.Contacts.CONTENT_URI, ContactsContract.RawContacts.CONTENT_URI})) {
                ContentResolver contentResolver = this.resolver;
                ContactsObserver contactsObserver = this.observer;
                if (contactsObserver != null) {
                    contentResolver.registerContentObserver(uri, true, contactsObserver);
                } else {
                    throw new ContactsObserverException("Failed to register content observer", null, 2, null);
                }
            }
            return;
        }
        throw new ContactsObserverException("Failed to get the thread handler", null, 2, null);
    }

    public final void stopObservingContactChanges() {
        ContactsObserver contactsObserver = this.observer;
        if (contactsObserver != null) {
            this.resolver.unregisterContentObserver(contactsObserver);
            this.observer = null;
        }
        this.contactsHandler = null;
        HandlerThread handlerThread = this.contactsHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.contactsHandlerThread = null;
    }
}
