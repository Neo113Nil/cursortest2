package expo.modules.blur;

import android.content.Context;
import eightbitlab.com.blurview.BlurTarget;
import expo.modules.kotlin.AppContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UIManagerCompatibleBlurTarget.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\tH\u0017¨\u0006\u0012"}, d2 = {"Lexpo/modules/blur/UIManagerCompatibleBlurTarget;", "Leightbitlab/com/blurview/BlurTarget;", "appContext", "Lexpo/modules/kotlin/AppContext;", "context", "Landroid/content/Context;", "<init>", "(Lexpo/modules/kotlin/AppContext;Landroid/content/Context;)V", "onLayout", "", "changed", "", "left", "", "top", "right", "bottom", "requestLayout", "expo-blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UIManagerCompatibleBlurTarget extends BlurTarget {
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIManagerCompatibleBlurTarget(AppContext appContext, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
