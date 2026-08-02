package expo.modules.contacts.next;

import expo.modules.contacts.next.intents.ContactIntentDelegate;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ContactsNextModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.ContactsNextModule$definition$1$5", f = "ContactsNextModule.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactsNextModule$definition$1$5 extends SuspendLambda implements Function2<AppContextActivityResultCaller, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactsNextModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsNextModule$definition$1$5(ContactsNextModule contactsNextModule, Continuation<? super ContactsNextModule$definition$1$5> continuation) {
        super(2, continuation);
        this.this$0 = contactsNextModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactsNextModule$definition$1$5 contactsNextModule$definition$1$5 = new ContactsNextModule$definition$1$5(this.this$0, continuation);
        contactsNextModule$definition$1$5.L$0 = obj;
        return contactsNextModule$definition$1$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppContextActivityResultCaller appContextActivityResultCaller, Continuation<? super Unit> continuation) {
        return ((ContactsNextModule$definition$1$5) create(appContextActivityResultCaller, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContactIntentDelegate contactIntentDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppContextActivityResultCaller appContextActivityResultCaller = (AppContextActivityResultCaller) this.L$0;
            contactIntentDelegate = this.this$0.contactIntentDelegate;
            this.label = 1;
            if (contactIntentDelegate.registerContactContracts(appContextActivityResultCaller, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
