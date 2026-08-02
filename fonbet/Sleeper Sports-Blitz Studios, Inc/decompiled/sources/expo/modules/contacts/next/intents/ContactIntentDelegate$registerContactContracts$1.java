package expo.modules.contacts.next.intents;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContactIntentDelegate.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.intents.ContactIntentDelegate", f = "ContactIntentDelegate.kt", i = {0, 1}, l = {14, 15, 16}, m = "registerContactContracts", n = {"$this$registerContactContracts", "$this$registerContactContracts"}, s = {"L$0", "L$0"})
/* loaded from: classes8.dex */
final class ContactIntentDelegate$registerContactContracts$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactIntentDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactIntentDelegate$registerContactContracts$1(ContactIntentDelegate contactIntentDelegate, Continuation<? super ContactIntentDelegate$registerContactContracts$1> continuation) {
        super(continuation);
        this.this$0 = contactIntentDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.registerContactContracts(null, this);
    }
}
