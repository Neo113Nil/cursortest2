package expo.modules.contacts.next.domain;

import expo.modules.contacts.next.domain.wrappers.ContactId;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContactRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository", f = "ContactRepository.kt", i = {}, l = {34}, m = "insert-Hoartsk", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$insert$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$insert$1(ContactRepository contactRepository, Continuation<? super ContactRepository$insert$1> continuation) {
        super(continuation);
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m11649insertHoartsk = this.this$0.m11649insertHoartsk(null, this);
        return m11649insertHoartsk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m11649insertHoartsk : ContactId.m11731boximpl((String) m11649insertHoartsk);
    }
}
