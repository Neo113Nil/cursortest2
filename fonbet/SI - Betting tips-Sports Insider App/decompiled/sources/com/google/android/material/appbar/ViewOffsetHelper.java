package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.z0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class ViewOffsetHelper {
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private final View view;
    private boolean verticalOffsetEnabled = true;
    private boolean horizontalOffsetEnabled = true;

    public ViewOffsetHelper(View view) {
        this.view = view;
    }

    public void applyOffsets() {
        View view = this.view;
        int top = this.offsetTop - (view.getTop() - this.layoutTop);
        WeakHashMap weakHashMap = z0.f1413a;
        view.offsetTopAndBottom(top);
        View view2 = this.view;
        view2.offsetLeftAndRight(this.offsetLeft - (view2.getLeft() - this.layoutLeft));
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.horizontalOffsetEnabled;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.verticalOffsetEnabled;
    }

    public void onViewLayout() {
        this.layoutTop = this.view.getTop();
        this.layoutLeft = this.view.getLeft();
    }

    public void setHorizontalOffsetEnabled(boolean z5) {
        this.horizontalOffsetEnabled = z5;
    }

    public boolean setLeftAndRightOffset(int i5) {
        if (!this.horizontalOffsetEnabled || this.offsetLeft == i5) {
            return false;
        }
        this.offsetLeft = i5;
        applyOffsets();
        return true;
    }

    public boolean setTopAndBottomOffset(int i5) {
        if (!this.verticalOffsetEnabled || this.offsetTop == i5) {
            return false;
        }
        this.offsetTop = i5;
        applyOffsets();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z5) {
        this.verticalOffsetEnabled = z5;
    }
}
