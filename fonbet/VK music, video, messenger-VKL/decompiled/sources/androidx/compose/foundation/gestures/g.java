package androidx.compose.foundation.gestures;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: Draggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 619}, m = "processDragStart", v = 1)
/* loaded from: classes11.dex */
public final class g extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.m2(this.this$0, null, this);
    }
}
