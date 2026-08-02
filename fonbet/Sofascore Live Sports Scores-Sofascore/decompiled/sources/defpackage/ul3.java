package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ul3 implements do1 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public ul3(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean c(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // defpackage.do1
    public final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ConstraintLayout constraintLayout = this.a;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            constraintLayout.getChildAt(i);
        }
        arrayList = constraintLayout.mConstraintHelpers;
        int size = arrayList.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2 = constraintLayout.mConstraintHelpers;
                ((ql3) arrayList2.get(i2)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    @Override // defpackage.do1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(wm3 wm3Var, co1 co1Var) {
        int makeMeasureSpec;
        int i;
        int C;
        int makeMeasureSpec2;
        xm3 xm3Var;
        int max;
        int max2;
        int i2;
        ConstraintLayout constraintLayout;
        boolean z;
        int baseline;
        int i3;
        int i4;
        if (wm3Var == null) {
            return;
        }
        nl3 nl3Var = wm3Var.L;
        nl3 nl3Var2 = wm3Var.J;
        if (wm3Var.h0 == 8) {
            co1Var.e = 0;
            co1Var.f = 0;
            co1Var.g = 0;
            return;
        }
        if (wm3Var.U == null) {
            return;
        }
        ConstraintLayout constraintLayout2 = this.h;
        ConstraintLayout.access$000(constraintLayout2);
        int i5 = co1Var.a;
        int i6 = co1Var.b;
        int i7 = co1Var.c;
        int i8 = co1Var.d;
        int i9 = this.b + this.c;
        int i10 = this.d;
        View view = (View) wm3Var.g0;
        int C2 = wt3.C(i5);
        if (C2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (C2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i10, -2);
        } else {
            if (C2 != 2) {
                if (C2 != 3) {
                    i = 0;
                } else {
                    int i11 = this.f;
                    int i12 = nl3Var2 != null ? nl3Var2.g : 0;
                    if (nl3Var != null) {
                        i12 += nl3Var.g;
                    }
                    i = ViewGroup.getChildMeasureSpec(i11, i10 + i12, -1);
                }
                C = wt3.C(i6);
                if (C != 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else if (C == 1) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i9, -2);
                } else if (C == 2) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i9, -2);
                    boolean z2 = wm3Var.t == 1;
                    int i13 = co1Var.j;
                    if (i13 == 1 || i13 == 2) {
                        boolean z3 = view.getMeasuredWidth() == wm3Var.r();
                        if (co1Var.j == 2 || !z2 || ((z2 && z3) || wm3Var.C())) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(wm3Var.l(), 1073741824);
                        }
                    }
                } else if (C != 3) {
                    makeMeasureSpec2 = 0;
                } else {
                    int i14 = this.g;
                    int i15 = nl3Var2 != null ? wm3Var.K.g : 0;
                    if (nl3Var != null) {
                        i15 += wm3Var.M.g;
                    }
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i9 + i15, -1);
                }
                xm3Var = wm3Var.U;
                if (xm3Var != null) {
                    i4 = constraintLayout2.mOptimizationLevel;
                    if (zm2.u(i4, NotificationCompat.FLAG_LOCAL_ONLY) && view.getMeasuredWidth() == wm3Var.r() && view.getMeasuredWidth() < xm3Var.r() && view.getMeasuredHeight() == wm3Var.l() && view.getMeasuredHeight() < xm3Var.l() && view.getBaseline() == wm3Var.b0 && !wm3Var.A() && c(wm3Var.H, i, wm3Var.r()) && c(wm3Var.I, makeMeasureSpec2, wm3Var.l())) {
                        co1Var.e = wm3Var.r();
                        co1Var.f = wm3Var.l();
                        co1Var.g = wm3Var.b0;
                        return;
                    }
                }
                boolean z4 = i5 != 3;
                boolean z5 = i6 != 3;
                boolean z6 = i6 != 4 || i6 == 1;
                boolean z7 = i5 != 4 || i5 == 1;
                boolean z8 = !z4 && wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                boolean z9 = !z5 && wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (view != null) {
                    return;
                }
                tl3 tl3Var = (tl3) view.getLayoutParams();
                int i16 = co1Var.j;
                if (i16 != 1 && i16 != 2 && z4 && wm3Var.s == 0 && z5 && wm3Var.t == 0) {
                    constraintLayout = constraintLayout2;
                    z = false;
                    baseline = 0;
                    i3 = -1;
                    max = 0;
                    max2 = 0;
                } else {
                    if ((view instanceof xvk) && (wm3Var instanceof yvk)) {
                        ((xvk) view).l((yvk) wm3Var, i, makeMeasureSpec2);
                    } else {
                        view.measure(i, makeMeasureSpec2);
                    }
                    wm3Var.H = i;
                    wm3Var.I = makeMeasureSpec2;
                    wm3Var.g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i17 = wm3Var.v;
                    max = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                    int i18 = wm3Var.w;
                    if (i18 > 0) {
                        max = Math.min(i18, max);
                    }
                    int i19 = wm3Var.y;
                    max2 = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
                    int i20 = makeMeasureSpec2;
                    int i21 = wm3Var.z;
                    if (i21 > 0) {
                        max2 = Math.min(i21, max2);
                    }
                    i2 = constraintLayout2.mOptimizationLevel;
                    constraintLayout = constraintLayout2;
                    if (!zm2.u(i2, 1)) {
                        if (z8 && z6) {
                            max = (int) ((max2 * wm3Var.X) + 0.5f);
                        } else if (z9 && z7) {
                            max2 = (int) ((max / wm3Var.X) + 0.5f);
                        }
                    }
                    if (measuredWidth == max && measuredHeight == max2) {
                        baseline = baseline2;
                        z = false;
                    } else {
                        if (measuredWidth != max) {
                            i = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i20;
                        view.measure(i, makeMeasureSpec3);
                        wm3Var.H = i;
                        wm3Var.I = makeMeasureSpec3;
                        z = false;
                        wm3Var.g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        max = measuredWidth2;
                        max2 = measuredHeight2;
                    }
                    i3 = -1;
                }
                boolean z10 = baseline != i3 ? true : z;
                co1Var.i = (max == co1Var.c && max2 == co1Var.d) ? z : true;
                if (tl3Var.c0) {
                    z10 = true;
                }
                if (z10 && baseline != -1 && wm3Var.b0 != baseline) {
                    co1Var.i = true;
                }
                co1Var.e = max;
                co1Var.f = max2;
                co1Var.h = z10;
                co1Var.g = baseline;
                ConstraintLayout.access$000(constraintLayout);
                return;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i10, -2);
            boolean z11 = wm3Var.s == 1;
            int i22 = co1Var.j;
            if (i22 == 1 || i22 == 2) {
                boolean z12 = view.getMeasuredHeight() == wm3Var.l();
                if (co1Var.j == 2 || !z11 || ((z11 && z12) || wm3Var.B())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(wm3Var.r(), 1073741824);
                }
            }
        }
        i = makeMeasureSpec;
        C = wt3.C(i6);
        if (C != 0) {
        }
        xm3Var = wm3Var.U;
        if (xm3Var != null) {
        }
        if (i5 != 3) {
        }
        if (i6 != 3) {
        }
        if (i6 != 4) {
        }
        if (i5 != 4) {
        }
        if (z4) {
        }
        if (z5) {
        }
        if (view != null) {
        }
    }
}
