package expo.modules.contacts.next.intents;

import android.content.ContentValues;
import android.net.Uri;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactIntentDelegate.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0086@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u001aR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "", "<init>", "()V", "editContactLauncher", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/contacts/next/intents/EditContactInput;", "", "addContactLauncher", "Lexpo/modules/contacts/next/intents/AddContactInput;", "pickContactLauncher", "Lexpo/modules/contacts/next/intents/PickContactInput;", "Landroid/net/Uri;", "registerContactContracts", "", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchEditContact", "lookupKeyUri", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchAddContact", "contentValues", "", "Landroid/content/ContentValues;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchPickContact", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactIntentDelegate {
    private AppContextActivityResultLauncher<AddContactInput, Boolean> addContactLauncher;
    private AppContextActivityResultLauncher<EditContactInput, Boolean> editContactLauncher;
    private AppContextActivityResultLauncher<PickContactInput, Uri> pickContactLauncher;

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerContactContracts(AppContextActivityResultCaller appContextActivityResultCaller, Continuation<? super Unit> continuation) {
        ContactIntentDelegate$registerContactContracts$1 contactIntentDelegate$registerContactContracts$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AppContextActivityResultCaller appContextActivityResultCaller2;
        ContactIntentDelegate contactIntentDelegate;
        ContactIntentDelegate contactIntentDelegate2;
        ContactIntentDelegate contactIntentDelegate3;
        if (continuation instanceof ContactIntentDelegate$registerContactContracts$1) {
            contactIntentDelegate$registerContactContracts$1 = (ContactIntentDelegate$registerContactContracts$1) continuation;
            if ((contactIntentDelegate$registerContactContracts$1.label & Integer.MIN_VALUE) != 0) {
                contactIntentDelegate$registerContactContracts$1.label -= Integer.MIN_VALUE;
                ContactIntentDelegate$registerContactContracts$1 contactIntentDelegate$registerContactContracts$12 = contactIntentDelegate$registerContactContracts$1;
                obj = contactIntentDelegate$registerContactContracts$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contactIntentDelegate$registerContactContracts$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    EditContactContract editContactContract = new EditContactContract();
                    contactIntentDelegate$registerContactContracts$12.L$0 = appContextActivityResultCaller;
                    contactIntentDelegate$registerContactContracts$12.L$1 = this;
                    contactIntentDelegate$registerContactContracts$12.label = 1;
                    appContextActivityResultCaller2 = appContextActivityResultCaller;
                    obj = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, editContactContract, null, contactIntentDelegate$registerContactContracts$12, 2, null);
                    if (obj != coroutine_suspended) {
                        contactIntentDelegate = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        contactIntentDelegate3 = (ContactIntentDelegate) contactIntentDelegate$registerContactContracts$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        contactIntentDelegate3.pickContactLauncher = (AppContextActivityResultLauncher) obj;
                        return Unit.INSTANCE;
                    }
                    contactIntentDelegate2 = (ContactIntentDelegate) contactIntentDelegate$registerContactContracts$12.L$1;
                    appContextActivityResultCaller2 = (AppContextActivityResultCaller) contactIntentDelegate$registerContactContracts$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    contactIntentDelegate2.addContactLauncher = (AppContextActivityResultLauncher) obj;
                    PickContactContract pickContactContract = new PickContactContract();
                    contactIntentDelegate$registerContactContracts$12.L$0 = this;
                    contactIntentDelegate$registerContactContracts$12.L$1 = null;
                    contactIntentDelegate$registerContactContracts$12.label = 3;
                    obj = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, pickContactContract, null, contactIntentDelegate$registerContactContracts$12, 2, null);
                    if (obj != coroutine_suspended) {
                        contactIntentDelegate3 = this;
                        contactIntentDelegate3.pickContactLauncher = (AppContextActivityResultLauncher) obj;
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                contactIntentDelegate = (ContactIntentDelegate) contactIntentDelegate$registerContactContracts$12.L$1;
                appContextActivityResultCaller2 = (AppContextActivityResultCaller) contactIntentDelegate$registerContactContracts$12.L$0;
                ResultKt.throwOnFailure(obj);
                contactIntentDelegate.editContactLauncher = (AppContextActivityResultLauncher) obj;
                AddContactContract addContactContract = new AddContactContract();
                contactIntentDelegate$registerContactContracts$12.L$0 = appContextActivityResultCaller2;
                contactIntentDelegate$registerContactContracts$12.L$1 = this;
                contactIntentDelegate$registerContactContracts$12.label = 2;
                obj = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, addContactContract, null, contactIntentDelegate$registerContactContracts$12, 2, null);
                if (obj != coroutine_suspended) {
                    contactIntentDelegate2 = this;
                    contactIntentDelegate2.addContactLauncher = (AppContextActivityResultLauncher) obj;
                    PickContactContract pickContactContract2 = new PickContactContract();
                    contactIntentDelegate$registerContactContracts$12.L$0 = this;
                    contactIntentDelegate$registerContactContracts$12.L$1 = null;
                    contactIntentDelegate$registerContactContracts$12.label = 3;
                    obj = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, pickContactContract2, null, contactIntentDelegate$registerContactContracts$12, 2, null);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        contactIntentDelegate$registerContactContracts$1 = new ContactIntentDelegate$registerContactContracts$1(this, continuation);
        ContactIntentDelegate$registerContactContracts$1 contactIntentDelegate$registerContactContracts$122 = contactIntentDelegate$registerContactContracts$1;
        obj = contactIntentDelegate$registerContactContracts$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contactIntentDelegate$registerContactContracts$122.label;
        if (i != 0) {
        }
        contactIntentDelegate.editContactLauncher = (AppContextActivityResultLauncher) obj;
        AddContactContract addContactContract2 = new AddContactContract();
        contactIntentDelegate$registerContactContracts$122.L$0 = appContextActivityResultCaller2;
        contactIntentDelegate$registerContactContracts$122.L$1 = this;
        contactIntentDelegate$registerContactContracts$122.label = 2;
        obj = AppContextActivityResultCaller.DefaultImpls.registerForActivityResult$default(appContextActivityResultCaller2, addContactContract2, null, contactIntentDelegate$registerContactContracts$122, 2, null);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final Object launchEditContact(Uri uri, Continuation<? super Boolean> continuation) {
        AppContextActivityResultLauncher<EditContactInput, Boolean> appContextActivityResultLauncher = this.editContactLauncher;
        if (appContextActivityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editContactLauncher");
            appContextActivityResultLauncher = null;
        }
        return appContextActivityResultLauncher.launch((AppContextActivityResultLauncher<EditContactInput, Boolean>) new EditContactInput(uri), continuation);
    }

    public final Object launchAddContact(List<ContentValues> list, Continuation<? super Boolean> continuation) {
        AppContextActivityResultLauncher<AddContactInput, Boolean> appContextActivityResultLauncher = this.addContactLauncher;
        if (appContextActivityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addContactLauncher");
            appContextActivityResultLauncher = null;
        }
        return appContextActivityResultLauncher.launch((AppContextActivityResultLauncher<AddContactInput, Boolean>) new AddContactInput(list), continuation);
    }

    public final Object launchPickContact(Continuation<? super Uri> continuation) {
        AppContextActivityResultLauncher<PickContactInput, Uri> appContextActivityResultLauncher = this.pickContactLauncher;
        if (appContextActivityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickContactLauncher");
            appContextActivityResultLauncher = null;
        }
        return appContextActivityResultLauncher.launch((AppContextActivityResultLauncher<PickContactInput, Uri>) new PickContactInput(), continuation);
    }
}
