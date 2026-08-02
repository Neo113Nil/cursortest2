package expo.modules.contacts.next;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Contact.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.Contact", f = "Contact.kt", i = {0}, l = {122, 125}, m = "update", n = {"newContactRecord"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class Contact$update$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Contact this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Contact$update$1(Contact contact, Continuation<? super Contact$update$1> continuation) {
        super(continuation);
        this.this$0 = contact;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.update(null, this);
    }
}
