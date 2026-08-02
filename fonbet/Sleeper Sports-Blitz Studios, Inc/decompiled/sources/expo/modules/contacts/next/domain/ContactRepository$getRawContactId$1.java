package expo.modules.contacts.next.domain;

import expo.modules.contacts.next.domain.wrappers.RawContactId;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContactRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository", f = "ContactRepository.kt", i = {}, l = {283}, m = "getRawContactId-K3SHF88", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$getRawContactId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getRawContactId$1(ContactRepository contactRepository, Continuation<? super ContactRepository$getRawContactId$1> continuation) {
        super(continuation);
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m11648getRawContactIdK3SHF88 = this.this$0.m11648getRawContactIdK3SHF88(null, this);
        if (m11648getRawContactIdK3SHF88 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return m11648getRawContactIdK3SHF88;
        }
        String str = (String) m11648getRawContactIdK3SHF88;
        if (str != null) {
            return RawContactId.m11745boximpl(str);
        }
        return null;
    }
}
