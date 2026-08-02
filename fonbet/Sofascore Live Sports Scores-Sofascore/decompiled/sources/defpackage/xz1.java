package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xz1 extends wba {
    public final /* synthetic */ int f;
    public final /* synthetic */ us3 g;

    public /* synthetic */ xz1(us3 us3Var, int i) {
        this.f = i;
        this.g = us3Var;
    }

    @Override // defpackage.wba
    public final void E(int i) {
        int i2 = this.f;
        us3 us3Var = this.g;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) us3Var;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.N(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) us3Var;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.x(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.wba
    public final void F(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.f;
        us3 us3Var = this.g;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) us3Var).A(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) us3Var;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.T(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.a.g(i);
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((bgh) it.next()).getClass();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r6.a.C(r7) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (java.lang.Math.abs(r8 - r6.a.r()) < java.lang.Math.abs(r8 - r6.a.s())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r8 > r6.F) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (java.lang.Math.abs(r7.getTop() - r6.E()) < java.lang.Math.abs(r7.getTop() - r6.F)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        if (java.lang.Math.abs(r8 - r6.F) < java.lang.Math.abs(r8 - r6.H)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0114, code lost:
    
        if (java.lang.Math.abs(r8 - r6.E) < java.lang.Math.abs(r8 - r6.H)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
    
        if (r8 < java.lang.Math.abs(r8 - r6.H)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        if (java.lang.Math.abs(r8 - r9) < java.lang.Math.abs(r8 - r6.H)) goto L48;
     */
    @Override // defpackage.wba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(View view, float f, float f2) {
        int i = this.f;
        int i2 = 3;
        us3 us3Var = this.g;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) us3Var;
                if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        break;
                    }
                    bottomSheetBehavior.P(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.J && bottomSheetBehavior.O(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.E() + bottomSheetBehavior.X) / 2) {
                            if (!bottomSheetBehavior.b) {
                                break;
                            }
                            bottomSheetBehavior.P(view, i2, true);
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.P(view, i2, true);
                } else {
                    if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.F;
                            if (top2 >= i3) {
                                break;
                            } else {
                                break;
                            }
                            i2 = 6;
                        }
                    } else {
                        if (!bottomSheetBehavior.b) {
                            int top3 = view.getTop();
                            break;
                        }
                        i2 = 4;
                    }
                    bottomSheetBehavior.P(view, i2, true);
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) us3Var;
                if (!sideSheetBehavior.a.B(f)) {
                    if (sideSheetBehavior.a.L(view, f)) {
                        if (!sideSheetBehavior.a.D(f, f2)) {
                            break;
                        }
                        i2 = 5;
                    } else {
                        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            break;
                        }
                        i2 = 5;
                    }
                }
                sideSheetBehavior.z(view, i2, true);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r0.canScrollVertically(-1) != false) goto L41;
     */
    @Override // defpackage.wba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T(int i, View view) {
        WeakReference weakReference;
        int i2 = this.f;
        us3 us3Var = this.g;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) us3Var;
                int i3 = bottomSheetBehavior.P;
                if (i3 != 1 && !bottomSheetBehavior.g0) {
                    if (i3 == 3 && bottomSheetBehavior.d0 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.e) {
                            WeakReference weakReference2 = bottomSheetBehavior.f0;
                            if (weakReference2 != null) {
                                view2 = (View) weakReference2.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.Z;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.Y;
                    if (weakReference3 != null && weakReference3.get() == view) {
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) us3Var;
                if (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.wba
    public final int o(int i, View view) {
        switch (this.f) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.g;
                return s6a.t(i, sideSheetBehavior.a.w(), sideSheetBehavior.a.v());
        }
    }

    @Override // defpackage.wba
    public final int p(int i, View view) {
        switch (this.f) {
            case 0:
                return s6a.t(i, ((BottomSheetBehavior) this.g).E(), z());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.wba
    public int y(View view) {
        switch (this.f) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.g;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.y(view);
        }
    }

    @Override // defpackage.wba
    public int z() {
        switch (this.f) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.g;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            default:
                return super.z();
        }
    }
}
