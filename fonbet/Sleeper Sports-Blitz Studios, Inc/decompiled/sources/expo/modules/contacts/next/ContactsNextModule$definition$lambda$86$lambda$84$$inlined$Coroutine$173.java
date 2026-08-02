package expo.modules.contacts.next;

import expo.modules.contacts.next.Contact;
import expo.modules.contacts.next.intents.ContactIntentDelegate;
import expo.modules.contacts.next.mappers.ContactRecordDomainMapper;
import expo.modules.contacts.next.records.contact.CreateContactRecord;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173", f = "ContactsNextModule.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactsNextModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173(Continuation continuation, ContactsNextModule contactsNextModule) {
        super(3, continuation);
        this.this$0 = contactsNextModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173 contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173 = new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173(continuation, this.this$0);
        contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173.L$0 = objArr;
        return contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$173.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContactRecordDomainMapper contactMapper;
        ContactIntentDelegate contactIntentDelegate;
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
        CreateContactRecord createContactRecord = (CreateContactRecord) ((Object[]) this.L$0)[0];
        Contact.Companion companion = Contact.INSTANCE;
        contactMapper = this.this$0.getContactMapper();
        contactIntentDelegate = this.this$0.contactIntentDelegate;
        this.label = 1;
        Object presentCreateForm = companion.presentCreateForm(createContactRecord, contactMapper, contactIntentDelegate, this);
        return presentCreateForm == coroutine_suspended ? coroutine_suspended : presentCreateForm;
    }
}
