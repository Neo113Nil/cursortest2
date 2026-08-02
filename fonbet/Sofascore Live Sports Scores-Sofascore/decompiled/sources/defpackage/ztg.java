package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ztg extends RecyclerView.OnScrollListener {
    public j41 a;
    public final ViewPager2 b;
    public final ruk c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final ytg g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public ztg(ViewPager2 viewPager2) {
        this.b = viewPager2;
        ruk rukVar = viewPager2.j;
        this.c = rukVar;
        this.d = (LinearLayoutManager) rukVar.getLayoutManager();
        this.g = new ytg();
        f();
    }

    public final void b(int i) {
        j41 j41Var = this.a;
        if (j41Var != null) {
            j41Var.c(i);
        }
    }

    public final void d(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        j41 j41Var = this.a;
        if (j41Var != null) {
            j41Var.a(i);
        }
    }

    public final void f() {
        this.e = 0;
        this.f = 0;
        ytg ytgVar = this.g;
        ytgVar.b = -1;
        ytgVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ytgVar.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public final void g(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = this.d.findFirstVisibleItemPosition();
        }
        d(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        r12 = r0.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        if (r3 >= r12) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
    
        if (defpackage.b60.a(r0.getChildAt(r3)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        defpackage.a70.r("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        r12 = java.util.Locale.US;
        defpackage.a70.r(defpackage.ljg.j(r2.c, "Page can only be offset by a positive amount, not by "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (r4[r12 - 1][1] >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
    
        if (r0.getChildCount() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        int top;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        ytg ytgVar = this.g;
        ytgVar.b = findFirstVisibleItemPosition;
        int i3 = 0;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (findFirstVisibleItemPosition == -1) {
            ytgVar.b = -1;
            ytgVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ytgVar.c = 0;
            return;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            ytgVar.b = -1;
            ytgVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ytgVar.c = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = linearLayoutManager.getOrientation();
        ruk rukVar = this.c;
        if (orientation == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - rukVar.getPaddingLeft();
            if (this.b.g.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - rukVar.getPaddingTop();
        }
        int i4 = -top;
        ytgVar.c = i4;
        if (i4 >= 0) {
            if (height != 0) {
                f = i4 / height;
            }
            ytgVar.a = f;
            return;
        }
        int childCount = linearLayoutManager.getChildCount();
        if (childCount != 0) {
            boolean z = linearLayoutManager.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = linearLayoutManager.getChildAt(i5);
                if (childAt == null) {
                    a70.r("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : b60.a;
                int[] iArr2 = iArr[i5];
                if (z) {
                    top2 = childAt.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i5];
                if (z) {
                    bottom = childAt.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new qe8(10));
            int i6 = 1;
            while (true) {
                if (i6 >= childCount) {
                    int[] iArr4 = iArr[0];
                    int i7 = iArr4[1];
                    int i8 = iArr4[0];
                    int i9 = i7 - i8;
                    if (i8 <= 0) {
                    }
                } else if (iArr[i6 - 1][1] != iArr[i6][0]) {
                    break;
                } else {
                    i6++;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        j41 j41Var;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            g(false);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                d(2);
                this.j = true;
                return;
            }
            return;
        }
        ytg ytgVar = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            h();
            if (!this.k) {
                int i3 = ytgVar.b;
                if (i3 != -1 && (j41Var = this.a) != null) {
                    j41Var.b(i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                }
            } else if (ytgVar.c == 0) {
                int i4 = this.h;
                int i5 = ytgVar.b;
                if (i4 != i5) {
                    b(i5);
                }
            }
            d(0);
            f();
        }
        if (this.e == 2 && i == 0 && this.l) {
            h();
            if (ytgVar.c == 0) {
                int i6 = this.i;
                int i7 = ytgVar.b;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    b(i7);
                }
                d(0);
                f();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r7 < 0) == (r5.b.g.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.k = true;
        h();
        boolean z = this.j;
        ytg ytgVar = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                i3 = ytgVar.b;
                this.i = i3;
                if (this.h != i3) {
                    b(i3);
                }
            }
            if (ytgVar.c != 0) {
                i3 = ytgVar.b + 1;
                this.i = i3;
                if (this.h != i3) {
                }
            }
            i3 = ytgVar.b;
            this.i = i3;
            if (this.h != i3) {
            }
        } else if (this.e == 0) {
            int i4 = ytgVar.b;
            if (i4 == -1) {
                i4 = 0;
            }
            b(i4);
        }
        int i5 = ytgVar.b;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = ytgVar.a;
        int i6 = ytgVar.c;
        j41 j41Var = this.a;
        if (j41Var != null) {
            j41Var.b(i5, f, i6);
        }
        int i7 = ytgVar.b;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && ytgVar.c == 0 && this.f != 1) {
            d(0);
            f();
        }
    }
}
