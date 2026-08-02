package expo.modules.contacts.next;

import expo.modules.contacts.next.Contact;
import expo.modules.contacts.next.domain.ContactRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180", f = "ContactsNextModule.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    int label;
    final /* synthetic */ ContactsNextModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180(Continuation continuation, ContactsNextModule contactsNextModule) {
        super(3, continuation);
        this.this$0 = contactsNextModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        return new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$180(continuation, this.this$0).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContactRepository contactRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Contact.Companion companion = Contact.INSTANCE;
        contactRepository = this.this$0.getContactRepository();
        this.label = 1;
        Object count = companion.getCount(contactRepository, this);
        return count == coroutine_suspended ? coroutine_suspended : count;
    }
}
