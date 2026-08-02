package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i5b extends l4a {
    public final /* synthetic */ int f;
    public final SideSheetBehavior g;

    public /* synthetic */ i5b(SideSheetBehavior sideSheetBehavior, int i) {
        this.f = i;
        this.g = sideSheetBehavior;
    }

    @Override // defpackage.l4a
    public final boolean B(float f) {
        switch (this.f) {
            case 0:
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                break;
            default:
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.l4a
    public final boolean C(View view) {
        switch (this.f) {
            case 0:
                if (view.getRight() < (r() - s()) / 2) {
                    break;
                }
                break;
            default:
                if (view.getLeft() > (r() + this.g.m) / 2) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.l4a
    public final boolean D(float f, float f2) {
        switch (this.f) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.l4a
    public final boolean L(View view, float f) {
        int i = this.f;
        SideSheetBehavior sideSheetBehavior = this.g;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.k) + view.getLeft()) > 0.5f) {
                    break;
                }
                break;
            default:
                if (Math.abs((f * sideSheetBehavior.k) + view.getRight()) > 0.5f) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.l4a
    public final void S(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.f) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.l4a
    public final void T(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.f;
        SideSheetBehavior sideSheetBehavior = this.g;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i4 = sideSheetBehavior.m;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.l4a
    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.l4a
    public final float g(int i) {
        switch (this.f) {
            case 0:
                float s = s();
                return (i - s) / (r() - s);
            default:
                float f = this.g.m;
                return (f - i) / (f - r());
        }
    }

    @Override // defpackage.l4a
    public final int p(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.l4a
    public final int r() {
        int i = this.f;
        SideSheetBehavior sideSheetBehavior = this.g;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.l4a
    public final int s() {
        int i = this.f;
        SideSheetBehavior sideSheetBehavior = this.g;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.l4a
    public final int v() {
        int i = this.f;
        SideSheetBehavior sideSheetBehavior = this.g;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.l4a
    public final int w() {
        switch (this.f) {
            case 0:
                return -this.g.l;
            default:
                return r();
        }
    }

    @Override // defpackage.l4a
    public final int x(View view) {
        int i = this.f;
        SideSheetBehavior sideSheetBehavior = this.g;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.l4a
    public final int y(CoordinatorLayout coordinatorLayout) {
        switch (this.f) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.l4a
    public final int z() {
        switch (this.f) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
