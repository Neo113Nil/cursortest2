package expo.modules.contacts.next;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Contact.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.Contact", f = "Contact.kt", i = {}, l = {140}, m = "getLookupKeyUri", n = {}, s = {})
/* loaded from: classes8.dex */
final class Contact$getLookupKeyUri$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Contact this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Contact$getLookupKeyUri$1(Contact contact, Continuation<? super Contact$getLookupKeyUri$1> continuation) {
        super(continuation);
        this.this$0 = contact;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object lookupKeyUri;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        lookupKeyUri = this.this$0.getLookupKeyUri(this);
        return lookupKeyUri;
    }
}
