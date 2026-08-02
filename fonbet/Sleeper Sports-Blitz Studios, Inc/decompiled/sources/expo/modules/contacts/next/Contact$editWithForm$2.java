package expo.modules.contacts.next;

import android.net.Uri;
import expo.modules.contacts.next.intents.ContactIntentDelegate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Contact.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.Contact$editWithForm$2", f = "Contact.kt", i = {}, l = {137, 137}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class Contact$editWithForm$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ Contact this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Contact$editWithForm$2(Contact contact, Continuation<? super Contact$editWithForm$2> continuation) {
        super(2, continuation);
        this.this$0 = contact;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Contact$editWithForm$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((Contact$editWithForm$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r6 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ContactIntentDelegate intentDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            intentDelegate = this.this$0.getIntentDelegate();
            this.L$0 = intentDelegate;
            this.label = 1;
            obj = this.this$0.getLookupKeyUri(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            intentDelegate = (ContactIntentDelegate) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        Object launchEditContact = intentDelegate.launchEditContact((Uri) obj, this);
        return launchEditContact == coroutine_suspended ? coroutine_suspended : launchEditContact;
    }
}
