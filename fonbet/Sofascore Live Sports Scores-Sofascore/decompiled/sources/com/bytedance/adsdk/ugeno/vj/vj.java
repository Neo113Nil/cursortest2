package com.bytedance.adsdk.ugeno.vj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.ugeno.qf.qf;
import com.bytedance.adsdk.ugeno.vj.oo;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends ViewGroup implements com.bytedance.adsdk.ugeno.vj.pcc {
    private List<gm> dax;
    private SparseIntArray gbb;
    private int gm;
    private int[] hc;
    private oo jr;
    private Drawable kj;
    private oo.pcc lu;
    private com.bytedance.adsdk.ugeno.oo nac;
    private int oo;
    private int ork;
    private int pcc;
    private Drawable qf;
    private int sf;
    private int tmg;
    private int vh;
    private int vj;
    private int vy;
    private int wh;

    public vj(Context context) {
        super(context, null);
        this.wh = -1;
        this.jr = new oo(this);
        this.dax = new ArrayList();
        this.lu = new oo.pcc();
    }

    private void gm(int i, int i2) {
        this.dax.clear();
        this.lu.pcc();
        this.jr.sf(this.lu, i, i2);
        this.dax = this.lu.pcc;
        this.jr.pcc(i, i2);
        this.jr.sf(i, i2, getPaddingRight() + getPaddingLeft());
        this.jr.pcc();
        pcc(this.pcc, i, i2, this.lu.sf);
    }

    private boolean oo(int i) {
        if (i >= 0 && i < this.dax.size()) {
            if (vj(i)) {
                return pcc() ? (this.vy & 1) != 0 : (this.ork & 1) != 0;
            }
            if (pcc()) {
                return (this.vy & 2) != 0;
            }
            if ((this.ork & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        gm gmVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i10 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.dax.size();
        for (int i11 = 0; i11 < size; i11++) {
            gm gmVar2 = this.dax.get(i11);
            if (oo(i11)) {
                int i12 = this.vh;
                paddingBottom -= i12;
                paddingTop += i12;
            }
            int i13 = paddingBottom;
            int i14 = this.gm;
            char c = 4;
            int i15 = 2;
            boolean z3 = true;
            if (i14 == 0) {
                f = paddingLeft;
                f2 = i10 - paddingRight;
            } else if (i14 == 1) {
                int i16 = gmVar2.vj;
                f2 = i16 - paddingLeft;
                f = (i10 - i16) + paddingRight;
            } else if (i14 != 2) {
                if (i14 == 3) {
                    f = paddingLeft;
                    f3 = (i10 - gmVar2.vj) / (gmVar2.sf() != 1 ? r7 - 1 : 1.0f);
                    f2 = i10 - paddingRight;
                } else if (i14 == 4) {
                    int sf = gmVar2.sf();
                    float f4 = sf != 0 ? (i10 - gmVar2.vj) / sf : 0.0f;
                    float f5 = f4 / 2.0f;
                    f = paddingLeft + f5;
                    float f6 = (i10 - paddingRight) - f5;
                    f3 = f4;
                    f2 = f6;
                } else {
                    if (i14 != 5) {
                        zzl.q(this.gm, "Invalid justifyContent is set: ");
                        return;
                    }
                    f3 = gmVar2.sf() != 0 ? (i10 - gmVar2.vj) / (r3 + 1) : 0.0f;
                    f = paddingLeft + f3;
                    f2 = (i10 - paddingRight) - f3;
                }
                float max = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i5 = 0;
                while (i5 < gmVar2.kj) {
                    int i17 = gmVar2.jr + i5;
                    View gm = gm(i17);
                    char c2 = c;
                    if (gm != null) {
                        boolean z4 = z3;
                        if (gm.getVisibility() != 8) {
                            pcc pccVar = (pcc) gm.getLayoutParams();
                            float f7 = f + ((ViewGroup.MarginLayoutParams) pccVar).leftMargin;
                            float f8 = f2 - ((ViewGroup.MarginLayoutParams) pccVar).rightMargin;
                            if (oo(i17, i5)) {
                                int i18 = this.tmg;
                                float f9 = i18;
                                f7 += f9;
                                f8 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            float f10 = f8;
                            int i19 = (i5 != gmVar2.kj + (-1) || (this.ork & 4) <= 0) ? 0 : this.tmg;
                            if (this.sf == i15) {
                                int i20 = i15;
                                oo ooVar = this.jr;
                                if (z) {
                                    i6 = i20;
                                    i7 = i5;
                                    view = gm;
                                    z2 = z4;
                                    ooVar.pcc(view, gmVar2, Math.round(f10) - gm.getMeasuredWidth(), i13 - gm.getMeasuredHeight(), Math.round(f10), i13);
                                } else {
                                    i7 = i5;
                                    view = gm;
                                    z2 = z4;
                                    i6 = i20;
                                    ooVar.pcc(view, gmVar2, Math.round(f7), i13 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f7), i13);
                                }
                                i8 = i13;
                            } else {
                                i7 = i5;
                                view = gm;
                                z2 = z4;
                                i6 = i15;
                                i8 = i13;
                                oo ooVar2 = this.jr;
                                if (z) {
                                    ooVar2.pcc(view, gmVar2, Math.round(f10) - view.getMeasuredWidth(), paddingTop, Math.round(f10), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i21 = paddingTop;
                                    ooVar2.pcc(view, gmVar2, Math.round(f7), i21, view.getMeasuredWidth() + Math.round(f7), view.getMeasuredHeight() + i21);
                                    paddingTop = i21;
                                }
                            }
                            f = f7 + view.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) pccVar).rightMargin;
                            float measuredWidth = f10 - ((view.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) pccVar).leftMargin);
                            if (z) {
                                gmVar = gmVar2;
                                gmVar.pcc(view, i19, 0, i9, 0);
                            } else {
                                gmVar = gmVar2;
                                gmVar.pcc(view, i9, 0, i19, 0);
                            }
                            gmVar2 = gmVar;
                            f2 = measuredWidth;
                            i5 = i7 + 1;
                            c = c2;
                            i15 = i6;
                            z3 = z2;
                            i13 = i8;
                        } else {
                            z2 = z4;
                        }
                    } else {
                        z2 = z3;
                    }
                    i6 = i15;
                    i7 = i5;
                    i8 = i13;
                    i5 = i7 + 1;
                    c = c2;
                    i15 = i6;
                    z3 = z2;
                    i13 = i8;
                }
                int i22 = gmVar2.qf;
                paddingTop += i22;
                paddingBottom = i13 - i22;
            } else {
                int i23 = gmVar2.vj;
                f = paddingLeft + ((i10 - i23) / 2.0f);
                f2 = (i10 - paddingRight) - ((i10 - i23) / 2.0f);
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i5 = 0;
            while (i5 < gmVar2.kj) {
            }
            int i222 = gmVar2.qf;
            paddingTop += i222;
            paddingBottom = i13 - i222;
        }
    }

    private void sf(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.dax.size();
        for (int i = 0; i < size; i++) {
            gm gmVar = this.dax.get(i);
            for (int i2 = 0; i2 < gmVar.kj; i2++) {
                int i3 = gmVar.jr + i2;
                View gm = gm(i3);
                if (gm != null && gm.getVisibility() != 8) {
                    pcc pccVar = (pcc) gm.getLayoutParams();
                    if (oo(i3, i2)) {
                        sf(canvas, gmVar.pcc, z2 ? gm.getBottom() + ((ViewGroup.MarginLayoutParams) pccVar).bottomMargin : (gm.getTop() - ((ViewGroup.MarginLayoutParams) pccVar).topMargin) - this.vh, gmVar.qf);
                    }
                    if (i2 == gmVar.kj - 1 && (this.vy & 4) > 0) {
                        sf(canvas, gmVar.pcc, z2 ? (gm.getTop() - ((ViewGroup.MarginLayoutParams) pccVar).topMargin) - this.vh : gm.getBottom() + ((ViewGroup.MarginLayoutParams) pccVar).bottomMargin, gmVar.qf);
                    }
                }
            }
            if (oo(i)) {
                pcc(canvas, z ? gmVar.gm : gmVar.pcc - this.tmg, paddingTop, max);
            }
            if (wh(i) && (this.ork & 4) > 0) {
                pcc(canvas, z ? gmVar.pcc - this.tmg : gmVar.gm, paddingTop, max);
            }
        }
    }

    private boolean vj(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View gm = gm(i - i3);
            if (gm != null && gm.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean wh(int i) {
        if (i >= 0 && i < this.dax.size()) {
            for (int i2 = i + 1; i2 < this.dax.size(); i2++) {
                if (this.dax.get(i2).sf() > 0) {
                    return false;
                }
            }
            if (pcc()) {
                return (this.vy & 4) != 0;
            }
            if ((this.ork & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.gbb;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.gbb = sparseIntArray;
        }
        this.hc = this.jr.pcc(view, i, layoutParams, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pcc;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pcc ? new pcc((pcc) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new pcc((ViewGroup.MarginLayoutParams) layoutParams) : new pcc(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getAlignContent() {
        return this.vj;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getAlignItems() {
        return this.oo;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.qf;
    }

    public Drawable getDividerDrawableVertical() {
        return this.kj;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getFlexDirection() {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<gm> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.dax.size());
        for (gm gmVar : this.dax) {
            if (gmVar.sf() != 0) {
                arrayList.add(gmVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public List<gm> getFlexLinesInternal() {
        return this.dax;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getFlexWrap() {
        return this.sf;
    }

    public int getJustifyContent() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getLargestMainSize() {
        Iterator<gm> it = this.dax.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i = Math.max(i, it.next().vj);
        }
        return i;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getMaxLine() {
        return this.wh;
    }

    public int getShowDividerHorizontal() {
        return this.vy;
    }

    public int getShowDividerVertical() {
        return this.ork;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int getSumOfCrossSize() {
        int size = this.dax.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            gm gmVar = this.dax.get(i2);
            if (oo(i2)) {
                i += pcc() ? this.vh : this.tmg;
            }
            if (wh(i2)) {
                i += pcc() ? this.vh : this.tmg;
            }
            i += gmVar.qf;
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.kj == null && this.qf == null) {
            return;
        }
        if (this.vy == 0 && this.ork == 0) {
            return;
        }
        int pcc2 = qf.pcc(this);
        int i = this.pcc;
        if (i == 0) {
            pcc(canvas, pcc2 == 1, this.sf == 2);
            return;
        }
        if (i == 1) {
            pcc(canvas, pcc2 != 1, this.sf == 2);
            return;
        }
        if (i == 2) {
            boolean z = pcc2 == 1;
            if (this.sf == 2) {
                z = !z;
            }
            sf(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = pcc2 == 1;
        if (this.sf == 2) {
            z2 = !z2;
        }
        sf(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        vj vjVar;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        vj vjVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            ooVar.wh();
        }
        int pcc2 = qf.pcc(this);
        int i13 = this.pcc;
        if (i13 == 0) {
            if (pcc2 == 1) {
                z2 = true;
                vjVar = this;
                i5 = i;
                i8 = i2;
                i7 = i4;
                i6 = i3;
            } else {
                z2 = false;
                vjVar = this;
                i5 = i;
                i6 = i3;
                i7 = i4;
                i8 = i2;
            }
            vjVar.pcc(z2, i5, i8, i6, i7);
        } else if (i13 == 1) {
            if (pcc2 != 1) {
                z3 = true;
                vjVar2 = this;
                i9 = i;
                i12 = i2;
                i11 = i4;
                i10 = i3;
            } else {
                z3 = false;
                vjVar2 = this;
                i9 = i;
                i10 = i3;
                i11 = i4;
                i12 = i2;
            }
            vjVar2.pcc(z3, i9, i12, i10, i11);
        } else if (i13 == 2) {
            z4 = pcc2 == 1;
            if (this.sf == 2) {
                z4 = !z4;
            }
            pcc(z4, false, i, i2, i3, i4);
        } else {
            if (i13 != 3) {
                zzl.q(this.pcc, "Invalid flex direction is set: ");
                return;
            }
            z4 = pcc2 == 1;
            if (this.sf == 2) {
                z4 = !z4;
            }
            pcc(z4, true, i, i2, i3, i4);
        }
        com.bytedance.adsdk.ugeno.oo ooVar2 = this.nac;
        if (ooVar2 != null) {
            ooVar2.pcc(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            int[] pcc2 = ooVar.pcc(i, i2);
            pcc(pcc2[0], pcc2[1]);
        } else {
            pcc(i, i2);
        }
        com.bytedance.adsdk.ugeno.oo ooVar2 = this.nac;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.oo ooVar = this.nac;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setAlignContent(int i) {
        if (this.vj != i) {
            this.vj = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.oo != i) {
            this.oo = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.qf) {
            return;
        }
        this.qf = drawable;
        if (drawable != null) {
            this.vh = drawable.getIntrinsicHeight();
        } else {
            this.vh = 0;
        }
        sf();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.kj) {
            return;
        }
        this.kj = drawable;
        if (drawable != null) {
            this.tmg = drawable.getIntrinsicWidth();
        } else {
            this.tmg = 0;
        }
        sf();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.pcc != i) {
            this.pcc = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public void setFlexLines(List<gm> list) {
        this.dax = list;
    }

    public void setFlexWrap(int i) {
        if (this.sf != i) {
            this.sf = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.gm != i) {
            this.gm = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.wh != i) {
            this.wh = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.vy) {
            this.vy = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.ork) {
            this.ork = i;
            requestLayout();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends ViewGroup.MarginLayoutParams implements sf {
        public static final Parcelable.Creator<pcc> CREATOR = new Parcelable.Creator<pcc>() { // from class: com.bytedance.adsdk.ugeno.vj.vj.pcc.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public pcc createFromParcel(Parcel parcel) {
                return new pcc(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public pcc[] newArray(int i) {
                return new pcc[i];
            }
        };
        private float gm;
        private int kj;
        private int oo;
        private boolean ork;
        private int pcc;
        private int qf;
        private float sf;
        private float vj;
        private int vy;
        private int wh;

        public pcc(Parcel parcel) {
            super(0, 0);
            this.pcc = 1;
            this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = 16777215;
            this.vy = 16777215;
            this.pcc = parcel.readInt();
            this.sf = parcel.readFloat();
            this.gm = parcel.readFloat();
            this.oo = parcel.readInt();
            this.vj = parcel.readFloat();
            this.wh = parcel.readInt();
            this.qf = parcel.readInt();
            this.kj = parcel.readInt();
            this.vy = parcel.readInt();
            this.ork = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int dax() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int gbb() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int gm() {
            return this.pcc;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int hc() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int jr() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int kj() {
            return this.qf;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public float oo() {
            return this.sf;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int ork() {
            return this.vy;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int pcc() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int qf() {
            return this.wh;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int sf() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public float tmg() {
            return this.vj;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public boolean vh() {
            return this.ork;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public float vj() {
            return this.gm;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int vy() {
            return this.kj;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public int wh() {
            return this.oo;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.pcc);
            parcel.writeFloat(this.sf);
            parcel.writeFloat(this.gm);
            parcel.writeInt(this.oo);
            parcel.writeFloat(this.vj);
            parcel.writeInt(this.wh);
            parcel.writeInt(this.qf);
            parcel.writeInt(this.kj);
            parcel.writeInt(this.vy);
            parcel.writeByte(this.ork ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public void gm(int i) {
            this.pcc = i;
        }

        public void oo(int i) {
            this.oo = i;
        }

        public void pcc(float f) {
            this.sf = f;
        }

        public void sf(float f) {
            this.gm = f;
        }

        public void gm(float f) {
            this.vj = f;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public void pcc(int i) {
            this.wh = i;
        }

        @Override // com.bytedance.adsdk.ugeno.vj.sf
        public void sf(int i) {
            this.qf = i;
        }

        public pcc(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.pcc = 1;
            this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = 16777215;
            this.vy = 16777215;
        }

        public pcc(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.pcc = 1;
            this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = 16777215;
            this.vy = 16777215;
        }

        public pcc(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.pcc = 1;
            this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = 16777215;
            this.vy = 16777215;
        }

        public pcc(pcc pccVar) {
            super((ViewGroup.MarginLayoutParams) pccVar);
            this.pcc = 1;
            this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.oo = -1;
            this.vj = -1.0f;
            this.wh = -1;
            this.qf = -1;
            this.kj = 16777215;
            this.vy = 16777215;
            this.pcc = pccVar.pcc;
            this.sf = pccVar.sf;
            this.gm = pccVar.gm;
            this.oo = pccVar.oo;
            this.vj = pccVar.vj;
            this.wh = pccVar.wh;
            this.qf = pccVar.qf;
            this.kj = pccVar.kj;
            this.vy = pccVar.vy;
            this.ork = pccVar.ork;
        }
    }

    private boolean vj(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.dax.get(i2).sf() > 0) {
                return false;
            }
        }
        return true;
    }

    public View gm(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.hc;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    private boolean oo(int i, int i2) {
        return vj(i, i2) ? pcc() ? (this.ork & 1) != 0 : (this.vy & 1) != 0 : pcc() ? (this.ork & 2) != 0 : (this.vy & 2) != 0;
    }

    private void sf(int i, int i2) {
        this.dax.clear();
        this.lu.pcc();
        this.jr.pcc(this.lu, i, i2);
        this.dax = this.lu.pcc;
        this.jr.pcc(i, i2);
        if (this.oo == 3) {
            for (gm gmVar : this.dax) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < gmVar.kj; i4++) {
                    View gm = gm(gmVar.jr + i4);
                    if (gm != null && gm.getVisibility() != 8) {
                        pcc pccVar = (pcc) gm.getLayoutParams();
                        int i5 = this.sf;
                        int i6 = gmVar.tmg;
                        if (i5 != 2) {
                            i3 = Math.max(i3, gm.getMeasuredHeight() + Math.max(i6 - gm.getBaseline(), ((ViewGroup.MarginLayoutParams) pccVar).topMargin) + ((ViewGroup.MarginLayoutParams) pccVar).bottomMargin);
                        } else {
                            i3 = Math.max(i3, gm.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) pccVar).topMargin + Math.max(gm.getBaseline() + (i6 - gm.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) pccVar).bottomMargin));
                        }
                    }
                }
                gmVar.qf = i3;
            }
        }
        this.jr.sf(i, i2, getPaddingBottom() + getPaddingTop());
        this.jr.pcc();
        pcc(this.pcc, i, i2, this.lu.sf);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public View sf(int i) {
        return gm(i);
    }

    private void sf(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.qf;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.vh + i2);
        this.qf.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int sf(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    private void sf() {
        if (this.qf == null && this.kj == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private void pcc(int i, int i2) {
        SparseIntArray sparseIntArray = this.gbb;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.gbb = sparseIntArray;
        }
        if (this.jr.sf(sparseIntArray)) {
            this.hc = this.jr.pcc(this.gbb);
        }
        int i3 = this.pcc;
        if (i3 == 0 || i3 == 1) {
            sf(i, i2);
        } else if (i3 != 2 && i3 != 3) {
            zzl.q(this.pcc, "Invalid value for the flex direction is set: ");
        } else {
            gm(i, i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public View pcc(int i) {
        return getChildAt(i);
    }

    private void pcc(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                a70.p("Invalid flex direction: ".concat(String.valueOf(i)));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, C.DEFAULT_MUXED_BUFFER_SIZE);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, C.DEFAULT_MUXED_BUFFER_SIZE);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            a70.r("Unknown width mode is set: ".concat(String.valueOf(mode)));
            return;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, NotificationCompat.FLAG_LOCAL_ONLY);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            a70.r("Unknown height mode is set: ".concat(String.valueOf(mode2)));
            return;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public boolean pcc() {
        int i = this.pcc;
        return i == 0 || i == 1;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int pcc(View view) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        gm gmVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.dax.size();
        for (int i12 = 0; i12 < size; i12++) {
            gm gmVar2 = this.dax.get(i12);
            if (oo(i12)) {
                int i13 = this.tmg;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = i11;
            int i15 = this.gm;
            char c2 = 4;
            int i16 = 1;
            if (i15 == 0) {
                f = paddingTop;
                f2 = i10 - paddingBottom;
            } else if (i15 == 1) {
                int i17 = gmVar2.vj;
                f2 = i17 - paddingTop;
                f = (i10 - i17) + paddingBottom;
            } else if (i15 == 2) {
                int i18 = gmVar2.vj;
                f = paddingTop + ((i10 - i18) / 2.0f);
                f2 = (i10 - paddingBottom) - ((i10 - i18) / 2.0f);
            } else {
                if (i15 == 3) {
                    f = paddingTop;
                    f3 = (i10 - gmVar2.vj) / (gmVar2.sf() != 1 ? r13 - 1 : 1.0f);
                    f2 = i10 - paddingBottom;
                } else if (i15 == 4) {
                    int sf = gmVar2.sf();
                    f3 = sf != 0 ? (i10 - gmVar2.vj) / sf : 0.0f;
                    float f4 = f3 / 2.0f;
                    f = paddingTop + f4;
                    f2 = (i10 - paddingBottom) - f4;
                } else if (i15 == 5) {
                    f3 = gmVar2.sf() != 0 ? (i10 - gmVar2.vj) / (r5 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i10 - paddingBottom) - f3;
                } else {
                    zzl.q(this.gm, "Invalid justifyContent is set: ");
                    return;
                }
                float max = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i5 = 0;
                while (i5 < gmVar2.kj) {
                    int i19 = gmVar2.jr + i5;
                    int i20 = i16;
                    View gm = gm(i19);
                    if (gm != null) {
                        c = c2;
                        if (gm.getVisibility() != 8) {
                            pcc pccVar = (pcc) gm.getLayoutParams();
                            float f5 = f + ((ViewGroup.MarginLayoutParams) pccVar).topMargin;
                            float f6 = f2 - ((ViewGroup.MarginLayoutParams) pccVar).bottomMargin;
                            if (oo(i19, i5)) {
                                i9 = this.vh;
                                float f7 = i9;
                                f5 += f7;
                                f6 -= f7;
                            } else {
                                i9 = 0;
                            }
                            float f8 = f6;
                            int i21 = (i5 != gmVar2.kj - i20 || (this.vy & 4) <= 0) ? 0 : this.vh;
                            if (z) {
                                int i22 = i5;
                                oo ooVar = this.jr;
                                if (z2) {
                                    i7 = i20;
                                    i6 = i22;
                                    ooVar.pcc(gm, gmVar2, true, i14 - gm.getMeasuredWidth(), Math.round(f8) - gm.getMeasuredHeight(), i14, Math.round(f8));
                                } else {
                                    i6 = i22;
                                    i7 = i20;
                                    ooVar.pcc(gm, gmVar2, true, i14 - gm.getMeasuredWidth(), Math.round(f5), i14, gm.getMeasuredHeight() + Math.round(f5));
                                }
                                i8 = i14;
                            } else {
                                i6 = i5;
                                i7 = i20;
                                i8 = i14;
                                oo ooVar2 = this.jr;
                                if (z2) {
                                    ooVar2.pcc(gm, gmVar2, false, paddingLeft, Math.round(f8) - gm.getMeasuredHeight(), gm.getMeasuredWidth() + paddingLeft, Math.round(f8));
                                } else {
                                    int i23 = paddingLeft;
                                    ooVar2.pcc(gm, gmVar2, false, i23, Math.round(f5), gm.getMeasuredWidth() + i23, gm.getMeasuredHeight() + Math.round(f5));
                                    paddingLeft = i23;
                                }
                            }
                            f = f5 + gm.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) pccVar).bottomMargin;
                            float measuredHeight = f8 - ((gm.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) pccVar).topMargin);
                            if (z2) {
                                gmVar = gmVar2;
                                gmVar.pcc(gm, 0, i21, 0, i9);
                            } else {
                                gmVar = gmVar2;
                                gmVar.pcc(gm, 0, i9, 0, i21);
                            }
                            gmVar2 = gmVar;
                            f2 = measuredHeight;
                            i5 = i6 + 1;
                            c2 = c;
                            i16 = i7;
                            i14 = i8;
                        }
                    } else {
                        c = c2;
                    }
                    i6 = i5;
                    i7 = i20;
                    i8 = i14;
                    i5 = i6 + 1;
                    c2 = c;
                    i16 = i7;
                    i14 = i8;
                }
                int i24 = gmVar2.qf;
                paddingLeft += i24;
                i11 = i14 - i24;
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i5 = 0;
            while (i5 < gmVar2.kj) {
            }
            int i242 = gmVar2.qf;
            paddingLeft += i242;
            i11 = i14 - i242;
        }
    }

    private void pcc(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.dax.size();
        for (int i3 = 0; i3 < size; i3++) {
            gm gmVar = this.dax.get(i3);
            for (int i4 = 0; i4 < gmVar.kj; i4++) {
                int i5 = gmVar.jr + i4;
                View gm = gm(i5);
                if (gm != null && gm.getVisibility() != 8) {
                    pcc pccVar = (pcc) gm.getLayoutParams();
                    if (oo(i5, i4)) {
                        if (z) {
                            left = gm.getRight() + ((ViewGroup.MarginLayoutParams) pccVar).rightMargin;
                        } else {
                            left = (gm.getLeft() - ((ViewGroup.MarginLayoutParams) pccVar).leftMargin) - this.tmg;
                        }
                        pcc(canvas, left, gmVar.sf, gmVar.qf);
                    }
                    if (i4 == gmVar.kj - 1 && (this.ork & 4) > 0) {
                        if (z) {
                            right = (gm.getLeft() - ((ViewGroup.MarginLayoutParams) pccVar).leftMargin) - this.tmg;
                        } else {
                            right = gm.getRight() + ((ViewGroup.MarginLayoutParams) pccVar).rightMargin;
                        }
                        pcc(canvas, right, gmVar.sf, gmVar.qf);
                    }
                }
            }
            if (oo(i3)) {
                if (z2) {
                    i2 = gmVar.oo;
                } else {
                    i2 = gmVar.sf - this.vh;
                }
                sf(canvas, paddingLeft, i2, max);
            }
            if (wh(i3) && (this.vy & 4) > 0) {
                if (z2) {
                    i = gmVar.sf - this.vh;
                } else {
                    i = gmVar.oo;
                }
                sf(canvas, paddingLeft, i, max);
            }
        }
    }

    private void pcc(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.kj;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.tmg + i, i3 + i2);
        this.kj.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int pcc(View view, int i, int i2) {
        int i3;
        int i4;
        if (pcc()) {
            i3 = oo(i, i2) ? this.tmg : 0;
            if ((this.ork & 4) <= 0) {
                return i3;
            }
            i4 = this.tmg;
        } else {
            i3 = oo(i, i2) ? this.vh : 0;
            if ((this.vy & 4) <= 0) {
                return i3;
            }
            i4 = this.vh;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public void pcc(gm gmVar) {
        if (pcc()) {
            if ((this.ork & 4) > 0) {
                int i = gmVar.vj;
                int i2 = this.tmg;
                gmVar.vj = i + i2;
                gmVar.wh += i2;
                return;
            }
            return;
        }
        if ((this.vy & 4) > 0) {
            int i3 = gmVar.vj;
            int i4 = this.vh;
            gmVar.vj = i3 + i4;
            gmVar.wh += i4;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public int pcc(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.vj.pcc
    public void pcc(View view, int i, int i2, gm gmVar) {
        if (oo(i, i2)) {
            if (pcc()) {
                int i3 = gmVar.vj;
                int i4 = this.tmg;
                gmVar.vj = i3 + i4;
                gmVar.wh += i4;
                return;
            }
            int i5 = gmVar.vj;
            int i6 = this.vh;
            gmVar.vj = i5 + i6;
            gmVar.wh += i6;
        }
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.nac = gmVar;
    }
}
