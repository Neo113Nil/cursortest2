package com.vk.movika.sdk.android.defaultplayer.view;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.an10;
import xsna.kxt0;
import xsna.lby;
import xsna.zjh0;

/* loaded from: classes3.dex */
public final class b extends ViewGroup {

    public static final class a extends ViewGroup.LayoutParams {
        public final double a;
        public final double b;
        public final double c;
        public final double d;

        public a(double d, double d2, double d3, double d4) {
            super(-1, -1);
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0 && Double.compare(this.c, aVar.c) == 0 && Double.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.d) + zjh0.b(this.c, zjh0.b(this.b, Double.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder a = lby.a("RatioCoordinateLayoutParams(ratioX=", this.a, ", ratioY=");
            a.append(this.b);
            com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", ratioWidth=", this.c, ", ratioHeight=");
            a.append(this.d);
            a.append(")");
            return a.toString();
        }

        public a() {
            this(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        }
    }

    public final void a(int i, int i2) {
        kxt0 kxt0Var = new kxt0(this);
        while (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            if (next.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = next.getLayoutParams();
                a aVar = layoutParams instanceof a ? (a) layoutParams : null;
                if (aVar != null) {
                    int a2 = an10.a(aVar.c * i);
                    int a3 = an10.a(aVar.d * i2);
                    ViewGroup.LayoutParams layoutParams2 = next.getLayoutParams();
                    if (a2 != layoutParams2.width || a3 != layoutParams2.height) {
                        layoutParams2.width = a2;
                        layoutParams2.height = a3;
                        next.setLayoutParams(layoutParams2);
                    }
                    next.measure(View.MeasureSpec.makeMeasureSpec(a2, 1073741824), View.MeasureSpec.makeMeasureSpec(a3, 1073741824));
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, 1.0d);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, 1.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3 - i5;
        int i8 = i4 - i6;
        kxt0 kxt0Var = new kxt0(this);
        while (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            if (next.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = next.getLayoutParams();
                a aVar = layoutParams instanceof a ? (a) layoutParams : null;
                if (aVar != null) {
                    double d = i7;
                    int a2 = an10.a((aVar.a * d) + i5);
                    double d2 = i8;
                    int a3 = an10.a((aVar.b * d2) + i6);
                    int i9 = i7;
                    int a4 = an10.a((aVar.c * d) + a2);
                    int a5 = an10.a((aVar.d * d2) + a3);
                    int i10 = a4 - a2;
                    int i11 = a5 - a3;
                    ViewGroup.LayoutParams layoutParams2 = next.getLayoutParams();
                    if (i10 != layoutParams2.width || i11 != layoutParams2.height) {
                        layoutParams2.width = i10;
                        layoutParams2.height = i11;
                        next.setLayoutParams(layoutParams2);
                    }
                    next.layout(a2, a3, a4, a5);
                    i7 = i9;
                }
            }
            i5 = i;
            i6 = i2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        Pair pair = new Pair(Integer.valueOf(View.MeasureSpec.getSize(i)), Integer.valueOf(View.MeasureSpec.getSize(i2)));
        a(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? layoutParams : new a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, 1.0d);
    }
}
