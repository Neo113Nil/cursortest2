package expo.modules.contacts.next;

import com.facebook.GraphRequest;
import expo.modules.contacts.next.Contact;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.mappers.ContactRecordDomainMapper;
import expo.modules.contacts.next.records.ContactQueryOptions;
import expo.modules.contacts.next.records.SkipFormatter;
import expo.modules.contacts.next.records.contact.GetContactDetailsRecord;
import expo.modules.contacts.next.records.fields.ContactField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179", f = "ContactsNextModule.kt", i = {0}, l = {271}, m = "invokeSuspend", n = {GraphRequest.FIELDS_PARAM}, s = {"L$0"})
/* loaded from: classes8.dex */
public final class ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactsNextModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179(Continuation continuation, ContactsNextModule contactsNextModule) {
        super(3, continuation);
        this.this$0 = contactsNextModule;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179 contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179 = new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179(continuation, this.this$0);
        contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179.L$0 = objArr;
        return contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$179.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContactRepository contactRepository;
        ContactRecordDomainMapper contactMapper;
        Set<? extends ContactField> set;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            ContactQueryOptions contactQueryOptions = (ContactQueryOptions) objArr[1];
            Set<? extends ContactField> set2 = (Set) obj2;
            Contact.Companion companion = Contact.INSTANCE;
            contactRepository = this.this$0.getContactRepository();
            contactMapper = this.this$0.getContactMapper();
            this.L$0 = set2;
            this.label = 1;
            obj = companion.getAllWithDetails(contactRepository, contactMapper, set2, contactQueryOptions, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            set = set2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new SkipFormatter(set).format((GetContactDetailsRecord) it.next()));
        }
        return arrayList;
    }
}
