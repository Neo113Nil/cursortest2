package expo.modules.contacts.next;

import expo.modules.contacts.next.Contact;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Contact.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.Contact$Companion", f = "Contact.kt", i = {0}, l = {210}, m = "getAllWithDetails", n = {"contactMapper"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class Contact$Companion$getAllWithDetails$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Contact.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Contact$Companion$getAllWithDetails$1(Contact.Companion companion, Continuation<? super Contact$Companion$getAllWithDetails$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAllWithDetails(null, null, null, null, this);
    }
}
