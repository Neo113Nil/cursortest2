package expo.modules.contacts.next.services.properties;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MutableDataProperty.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.services.properties.MutableDataProperty", f = "MutableDataProperty.kt", i = {0, 2}, l = {18, 24, 26, 29}, m = "set", n = {"newValue", "newValue"}, s = {"L$0", "L$0"})
/* loaded from: classes8.dex */
final class MutableDataProperty$set$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MutableDataProperty<TDomain, TDto> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableDataProperty$set$1(MutableDataProperty<TDomain, TDto> mutableDataProperty, Continuation<? super MutableDataProperty$set$1> continuation) {
        super(continuation);
        this.this$0 = mutableDataProperty;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.set(null, this);
    }
}
