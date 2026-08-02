package expo.modules.contacts.next.domain;

import expo.modules.contacts.next.domain.model.contact.UpdateContact;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContactRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository", f = "ContactRepository.kt", i = {}, l = {97}, m = "update", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$update$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$update$1(ContactRepository contactRepository, Continuation<? super ContactRepository$update$1> continuation) {
        super(continuation);
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.update((UpdateContact) null, this);
    }
}
