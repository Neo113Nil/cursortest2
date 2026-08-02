package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1106a;

    /* renamed from: b, reason: collision with root package name */
    public int f1107b;

    /* renamed from: c, reason: collision with root package name */
    public int f1108c;

    /* renamed from: d, reason: collision with root package name */
    public int f1109d;

    /* renamed from: e, reason: collision with root package name */
    public int f1110e;

    /* renamed from: f, reason: collision with root package name */
    public int f1111f;

    /* renamed from: g, reason: collision with root package name */
    public int f1112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f1113h;

    public e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f1113h = constraintLayout;
        this.f1106a = constraintLayout2;
    }

    public static boolean a(int i5, int i10, int i11) {
        if (i5 == i10) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(x.d dVar, y.b bVar) {
        int makeMeasureSpec;
        int i5;
        int d10;
        int makeMeasureSpec2;
        int i10;
        x.e eVar;
        int baseline;
        int max;
        int max2;
        int i11;
        ConstraintLayout constraintLayout;
        boolean z5;
        int i12;
        int i13;
        if (dVar == null) {
            return;
        }
        x.c cVar = dVar.K;
        x.c cVar2 = dVar.I;
        if (dVar.f25305g0 == 8) {
            bVar.f25482e = 0;
            bVar.f25483f = 0;
            bVar.f25484g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        ConstraintLayout constraintLayout2 = this.f1113h;
        ConstraintLayout.access$000(constraintLayout2);
        int i14 = bVar.f25478a;
        int i15 = bVar.f25479b;
        int i16 = bVar.f25480c;
        int i17 = bVar.f25481d;
        int i18 = this.f1107b + this.f1108c;
        int i19 = this.f1109d;
        View view = dVar.f25303f0;
        int d11 = v.f.d(i14);
        if (d11 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        } else if (d11 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1111f, i19, -2);
        } else if (d11 != 2) {
            if (d11 != 3) {
                i5 = 0;
            } else {
                int i20 = this.f1111f;
                int i21 = cVar2 != null ? cVar2.f25290g : 0;
                if (cVar != null) {
                    i21 += cVar.f25290g;
                }
                i5 = ViewGroup.getChildMeasureSpec(i20, i19 + i21, -1);
            }
            d10 = v.f.d(i15);
            if (d10 != 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
            } else if (d10 == 1) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1112g, i18, -2);
            } else {
                if (d10 != 2) {
                    if (d10 != 3) {
                        i10 = 0;
                    } else {
                        int i22 = this.f1112g;
                        int i23 = cVar2 != null ? dVar.J.f25290g : 0;
                        if (cVar != null) {
                            i23 += dVar.L.f25290g;
                        }
                        i10 = ViewGroup.getChildMeasureSpec(i22, i18 + i23, -1);
                    }
                    eVar = (x.e) dVar.T;
                    if (eVar != null) {
                        i13 = constraintLayout2.mOptimizationLevel;
                        if (x.j.c(i13, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f25294a0 && !dVar.z() && a(dVar.G, i5, dVar.q()) && a(dVar.H, i10, dVar.k())) {
                            bVar.f25482e = dVar.q();
                            bVar.f25483f = dVar.k();
                            bVar.f25484g = dVar.f25294a0;
                            return;
                        }
                    }
                    boolean z7 = i14 == 3;
                    boolean z10 = i15 == 3;
                    boolean z11 = i15 != 4 || i15 == 1;
                    boolean z12 = i14 != 4 || i14 == 1;
                    boolean z13 = !z7 && dVar.W > 0.0f;
                    boolean z14 = !z10 && dVar.W > 0.0f;
                    if (view == null) {
                        return;
                    }
                    d dVar2 = (d) view.getLayoutParams();
                    int i24 = bVar.j;
                    if (i24 != 1 && i24 != 2 && z7 && dVar.f25321r == 0 && z10 && dVar.f25322s == 0) {
                        constraintLayout = constraintLayout2;
                        max2 = 0;
                        z5 = false;
                        i12 = -1;
                        baseline = 0;
                        max = 0;
                    } else {
                        if ((view instanceof u) && (dVar instanceof x.g)) {
                            ((u) view).j((x.g) dVar, i5, i10);
                        } else {
                            view.measure(i5, i10);
                        }
                        dVar.G = i5;
                        dVar.H = i10;
                        dVar.f25304g = false;
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        int i25 = dVar.f25324u;
                        max = i25 > 0 ? Math.max(i25, measuredWidth) : measuredWidth;
                        int i26 = dVar.f25325v;
                        if (i26 > 0) {
                            max = Math.min(i26, max);
                        }
                        int i27 = dVar.f25327x;
                        max2 = i27 > 0 ? Math.max(i27, measuredHeight) : measuredHeight;
                        int i28 = i10;
                        int i29 = dVar.f25328y;
                        if (i29 > 0) {
                            max2 = Math.min(i29, max2);
                        }
                        i11 = constraintLayout2.mOptimizationLevel;
                        constraintLayout = constraintLayout2;
                        if (!x.j.c(i11, 1)) {
                            if (z13 && z11) {
                                max = (int) ((max2 * dVar.W) + 0.5f);
                            } else if (z14 && z12) {
                                max2 = (int) ((max / dVar.W) + 0.5f);
                            }
                        }
                        if (measuredWidth == max && measuredHeight == max2) {
                            z5 = false;
                        } else {
                            if (measuredWidth != max) {
                                i5 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                            }
                            int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i28;
                            view.measure(i5, makeMeasureSpec3);
                            dVar.G = i5;
                            dVar.H = makeMeasureSpec3;
                            z5 = false;
                            dVar.f25304g = false;
                            max = view.getMeasuredWidth();
                            max2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i12 = -1;
                    }
                    boolean z15 = baseline != i12 ? true : z5;
                    bVar.f25486i = (max == bVar.f25480c && max2 == bVar.f25481d) ? z5 : true;
                    if (dVar2.f1074c0) {
                        z15 = true;
                    }
                    if (z15 && baseline != -1 && dVar.f25294a0 != baseline) {
                        bVar.f25486i = true;
                    }
                    bVar.f25482e = max;
                    bVar.f25483f = max2;
                    bVar.f25485h = z15;
                    bVar.f25484g = baseline;
                    ConstraintLayout.access$000(constraintLayout);
                    return;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1112g, i18, -2);
                boolean z16 = dVar.f25322s == 1;
                int i30 = bVar.j;
                if (i30 == 1 || i30 == 2) {
                    boolean z17 = view.getMeasuredWidth() == dVar.q();
                    if (bVar.j == 2 || !z16 || ((z16 && z17) || dVar.B())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                    }
                }
            }
            i10 = makeMeasureSpec2;
            eVar = (x.e) dVar.T;
            if (eVar != null) {
            }
            if (i14 == 3) {
            }
            if (i15 == 3) {
            }
            if (i15 != 4) {
            }
            if (i14 != 4) {
            }
            if (z7) {
            }
            if (z10) {
            }
            if (view == null) {
            }
        } else {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1111f, i19, -2);
            boolean z18 = dVar.f25321r == 1;
            int i31 = bVar.j;
            if (i31 == 1 || i31 == 2) {
                boolean z19 = view.getMeasuredHeight() == dVar.k();
                if (bVar.j == 2 || !z18 || ((z18 && z19) || dVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        }
        i5 = makeMeasureSpec;
        d10 = v.f.d(i15);
        if (d10 != 0) {
        }
        i10 = makeMeasureSpec2;
        eVar = (x.e) dVar.T;
        if (eVar != null) {
        }
        if (i14 == 3) {
        }
        if (i15 == 3) {
        }
        if (i15 != 4) {
        }
        if (i14 != 4) {
        }
        if (z7) {
        }
        if (z10) {
        }
        if (view == null) {
        }
    }
}
