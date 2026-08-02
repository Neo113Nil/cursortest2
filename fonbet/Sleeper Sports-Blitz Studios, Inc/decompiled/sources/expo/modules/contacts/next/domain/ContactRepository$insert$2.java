package expo.modules.contacts.next.domain;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import expo.modules.contacts.next.ContactIdNotFoundException;
import expo.modules.contacts.next.domain.model.contact.NewContact;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.extensions.ContentProviderResultExtensionsKt;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$insert$2", f = "ContactRepository.kt", i = {}, l = {36, 38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$insert$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ContactId>, Object> {
    final /* synthetic */ NewContact $contact;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$insert$2(NewContact newContact, ContactRepository contactRepository, Continuation<? super ContactRepository$insert$2> continuation) {
        super(2, continuation);
        this.$contact = newContact;
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactRepository$insert$2(this.$contact, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContactId> continuation) {
        return ((ContactRepository$insert$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r8 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r8 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m11753getContactIdFromRawContactId5WPtcSs;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<ContentProviderOperation> insertOperations = this.$contact.toInsertOperations();
            this.label = 1;
            obj = ContentResolverExtensionsKt.safeApplyBatch(this.this$0.getContentResolver(), "com.android.contacts", insertOperations, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ContactId contactId = (ContactId) obj;
                m11753getContactIdFromRawContactId5WPtcSs = contactId != null ? contactId.m11737unboximpl() : null;
                String str = (String) m11753getContactIdFromRawContactId5WPtcSs;
                if (str != null) {
                    return ContactId.m11731boximpl(str);
                }
                throw new ContactIdNotFoundException(null, 1, null);
            }
            ResultKt.throwOnFailure(obj);
        }
        String m11746constructorimpl = RawContactId.m11746constructorimpl(ContentProviderResultExtensionsKt.extractId((ContentProviderResult[]) obj));
        this.label = 2;
        m11753getContactIdFromRawContactId5WPtcSs = ContentResolverExtensionsKt.m11753getContactIdFromRawContactId5WPtcSs(this.this$0.getContentResolver(), m11746constructorimpl, this);
    }
}
