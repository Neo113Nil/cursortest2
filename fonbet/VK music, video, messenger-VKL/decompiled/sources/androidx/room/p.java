package androidx.room;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: RoomTrackingLiveData.android.kt */
@b6l(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", l = {82}, m = ToolBar.REFRESH)
/* loaded from: classes.dex */
public final class p extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return o.l(this.this$0, this);
    }
}
