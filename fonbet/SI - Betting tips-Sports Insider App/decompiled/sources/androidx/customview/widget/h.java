package androidx.customview.widget;

import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h {
    public abstract int clampViewPositionHorizontal(View view, int i5, int i10);

    public abstract int clampViewPositionVertical(View view, int i5, int i10);

    public int getViewHorizontalDragRange(@NonNull View view) {
        return 0;
    }

    public int getViewVerticalDragRange(@NonNull View view) {
        return 0;
    }

    public boolean onEdgeLock(int i5) {
        return false;
    }

    public abstract void onViewDragStateChanged(int i5);

    public abstract void onViewPositionChanged(View view, int i5, int i10, int i11, int i12);

    public abstract void onViewReleased(View view, float f6, float f10);

    public abstract boolean tryCaptureView(View view, int i5);

    public int getOrderedChildIndex(int i5) {
        return i5;
    }

    public void onEdgeDragStarted(int i5, int i10) {
    }

    public void onEdgeTouched(int i5, int i10) {
    }

    public void onViewCaptured(@NonNull View view, int i5) {
    }
}
