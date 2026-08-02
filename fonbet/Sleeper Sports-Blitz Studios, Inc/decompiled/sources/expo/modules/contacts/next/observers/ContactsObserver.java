package expo.modules.contacts.next.observers;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import expo.modules.contacts.next.ContactsNextModule;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.modules.Module;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsObserver.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0012\u001a\u00020\r*\u00020\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/observers/ContactsObserver;", "Landroid/database/ContentObserver;", "module", "Lexpo/modules/contacts/next/ContactsNextModule;", "handler", "Landroid/os/Handler;", "<init>", "(Lexpo/modules/contacts/next/ContactsNextModule;Landroid/os/Handler;)V", "moduleRef", "Ljava/lang/ref/WeakReference;", "getModuleRef", "()Ljava/lang/ref/WeakReference;", "onChange", "", "selfChange", "", "uri", "Landroid/net/Uri;", "handleContactChange", "Lexpo/modules/kotlin/modules/Module;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactsObserver extends ContentObserver {
    private final WeakReference<ContactsNextModule> moduleRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsObserver(ContactsNextModule module, Handler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.moduleRef = UtilsKt.weak(module);
    }

    public final WeakReference<ContactsNextModule> getModuleRef() {
        return this.moduleRef;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);
        ContactsNextModule contactsNextModule = this.moduleRef.get();
        if (contactsNextModule != null) {
            handleContactChange(contactsNextModule);
        }
    }

    public final void handleContactChange(Module module) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        module.sendEvent("onContactsChange", MapsKt.mapOf(TuplesKt.to("body", null)));
    }
}
