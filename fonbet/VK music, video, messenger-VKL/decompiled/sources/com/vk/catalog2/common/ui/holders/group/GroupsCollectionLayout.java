package com.vk.catalog2.common.ui.holders.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iah0;
import xsna.rqi;
import xsna.x9;

/* compiled from: GroupsCollectionLayout.kt */
/* loaded from: classes16.dex */
public final class GroupsCollectionLayout extends ConstraintLayout {
    public int t;
    public final int u;
    public final int v;

    public GroupsCollectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = e3m.a(R.dimen.catalog_event_cover_width, context);
        this.v = iah0.a(16) * 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int getParentWidth() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
            while (viewGroup != null && viewGroup.getWidth() == 0) {
                ViewParent parent2 = viewGroup.getParent();
                if (parent2 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent2;
                }
            }
            if (viewGroup != null) {
                return (viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
            }
            return 0;
        }
        viewGroup = null;
    }

    public final int getTotalItemsCount() {
        return this.t;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int b;
        int parentWidth = getParentWidth();
        int i3 = this.t;
        if (i3 == 0 || parentWidth <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i4 = this.v;
        if (i3 == 1) {
            b = parentWidth - i4;
        } else {
            int a = iah0.a(8) * (i3 - 1);
            int i5 = this.t;
            int i6 = this.u;
            int a2 = rqi.a(i5, i6, i4, a);
            b = a2 < parentWidth ? x9.b(parentWidth, a2, i5, i6) : i6;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(b, 1073741824), i2);
    }

    public final void setTotalItemsCount(int i) {
        this.t = i;
    }
}
