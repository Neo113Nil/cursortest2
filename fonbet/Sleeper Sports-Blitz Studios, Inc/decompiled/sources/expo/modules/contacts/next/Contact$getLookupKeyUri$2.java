package expo.modules.contacts.next;

import android.net.Uri;
import android.provider.ContactsContract;
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
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.Contact$getLookupKeyUri$2", f = "Contact.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class Contact$getLookupKeyUri$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    int label;
    final /* synthetic */ Contact this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Contact$getLookupKeyUri$2(Contact contact, Continuation<? super Contact$getLookupKeyUri$2> continuation) {
        super(2, continuation);
        this.this$0 = contact;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Contact$getLookupKeyUri$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((Contact$getLookupKeyUri$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getRepository().m11647getLookupKeyD2TBaGg(this.this$0.getContactId(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ContactsContract.Contacts.getLookupUri(Long.parseLong(this.this$0.getContactId()), (String) obj);
    }
}
