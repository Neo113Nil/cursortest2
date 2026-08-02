package expo.modules.contacts.next.domain;

import expo.modules.contacts.next.domain.wrappers.DataId;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContactRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository", f = "ContactRepository.kt", i = {}, l = {110}, m = "append-4zbj8jY", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$append$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$append$1(ContactRepository contactRepository, Continuation<? super ContactRepository$append$1> continuation) {
        super(continuation);
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m11641append4zbj8jY = this.this$0.m11641append4zbj8jY(null, this);
        return m11641append4zbj8jY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m11641append4zbj8jY : DataId.m11738boximpl((String) m11641append4zbj8jY);
    }
}
