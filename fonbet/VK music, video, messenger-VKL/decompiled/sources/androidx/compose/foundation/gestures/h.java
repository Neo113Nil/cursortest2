package androidx.compose.foundation.gestures;

import com.unity3d.mediation.LevelPlayAdError;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: Draggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID}, m = "processDragStop", v = 1)
/* loaded from: classes11.dex */
public final class h extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.n2(this.this$0, null, this);
    }
}
