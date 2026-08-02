package com.my.target.nativeads.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import xsna.c1z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class CollageView extends FrameLayout {
    public final ArrayList b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public CollageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    @Nullable
    public final FrameLayout a(int i) {
        return (FrameLayout) this.b.get(i);
    }

    public int getPlaceholderHeight() {
        return this.e;
    }

    public int getPlaceholderWidth() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int mode = View.MeasureSpec.getMode(i);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : c1z0.d(280, getContext());
        int i6 = (int) ((size / this.d) * this.e);
        setMeasuredDimension(size, i6);
        ArrayList arrayList = this.b;
        boolean z = true;
        int i7 = 0;
        if (arrayList.size() == 3) {
            int i8 = (size - this.f) / 2;
            View view = (FrameLayout) arrayList.get(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = i8;
            layoutParams.height = i6;
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            view.setLayoutParams(layoutParams);
            measureChild(view, i, i2);
            View view2 = (FrameLayout) arrayList.get(1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int i9 = size - i8;
            int i10 = this.f;
            layoutParams2.width = i9 - i10;
            layoutParams2.height = i8;
            layoutParams2.leftMargin = i10 + i8;
            layoutParams2.topMargin = 0;
            view2.setLayoutParams(layoutParams2);
            measureChild(view2, i, i2);
            View view3 = (FrameLayout) arrayList.get(2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            int i11 = this.f;
            layoutParams3.width = i9 - i11;
            layoutParams3.height = (i6 - i8) - i11;
            int i12 = i8 + i11;
            layoutParams3.leftMargin = i12;
            layoutParams3.topMargin = i12;
            view3.setLayoutParams(layoutParams3);
            measureChild(view3, i, i2);
            return;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i13 >= iArr.length) {
                return;
            }
            int i16 = iArr[i13];
            int i17 = i16 - 1;
            int i18 = (size - r12) / i16;
            int i19 = (size - (i16 * i18)) - (this.f * i17);
            boolean z2 = z;
            int i20 = i7;
            int i21 = i20;
            while (i21 < i16) {
                View view4 = (FrameLayout) arrayList.get(i14);
                int i22 = size;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view4.getLayoutParams();
                if (i21 == 0) {
                    i5 = i19 / 2;
                } else if (i21 == i17) {
                    i5 = i19 - (i19 / 2);
                } else {
                    i3 = i6;
                    i4 = i18;
                    layoutParams4.width = i4;
                    int i23 = i4;
                    layoutParams4.height = i13 != this.c.length + (-1) ? i3 - i15 : i18;
                    layoutParams4.leftMargin = i20;
                    layoutParams4.topMargin = i15;
                    view4.setLayoutParams(layoutParams4);
                    i20 += i23 + this.f;
                    i14++;
                    measureChild(view4, i, i2);
                    i21++;
                    i6 = i3;
                    size = i22;
                }
                int i24 = i5 + i18;
                i3 = i6;
                i4 = i24;
                layoutParams4.width = i4;
                int i232 = i4;
                layoutParams4.height = i13 != this.c.length + (-1) ? i3 - i15 : i18;
                layoutParams4.leftMargin = i20;
                layoutParams4.topMargin = i15;
                view4.setLayoutParams(layoutParams4);
                i20 += i232 + this.f;
                i14++;
                measureChild(view4, i, i2);
                i21++;
                i6 = i3;
                size = i22;
            }
            i15 += i18 + this.f;
            i13++;
            z = z2;
            size = size;
            i7 = 0;
        }
    }

    public void setCollageSize(int i) {
        removeAllViews();
        ArrayList arrayList = this.b;
        arrayList.clear();
        Context context = getContext();
        for (int i2 = 0; i2 < i; i2++) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.setForegroundGravity(17);
            addView(frameLayout);
            arrayList.add(frameLayout);
        }
        switch (i) {
            case 2:
                this.d = 280;
                this.e = 139;
                this.c = new int[]{2};
                break;
            case 3:
                this.d = 280;
                this.e = 280;
                this.c = new int[]{1, 2};
                break;
            case 4:
                this.d = 280;
                this.e = 280;
                this.c = new int[]{2, 2};
                break;
            case 5:
                this.d = 280;
                this.e = 233;
                this.c = new int[]{2, 3};
                break;
            case 6:
                this.d = 280;
                this.e = 186;
                this.c = new int[]{3, 3};
                break;
            case 7:
                this.d = 280;
                this.e = 196;
                this.c = new int[]{2, 5};
                break;
            case 8:
                this.d = 280;
                this.e = 186;
                this.c = new int[]{2, 6};
                break;
            case 9:
                this.d = 280;
                this.e = 280;
                this.c = new int[]{3, 3, 3};
                break;
            case 10:
                this.d = 280;
                this.e = 175;
                this.c = new int[]{2, 8};
                break;
            default:
                this.d = 0;
                this.e = 0;
                this.c = new int[0];
                break;
        }
    }

    public void setFrameSpace(int i) {
        this.f = i;
    }

    public CollageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CollageView(@NonNull Context context) {
        this(context, null);
    }

    public CollageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList();
        this.c = new int[0];
        this.d = 0;
        this.e = 0;
        this.f = c1z0.d(2, getContext());
    }
}
