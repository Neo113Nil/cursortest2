package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;
import java.util.Arrays;
import xsna.ig2;
import xsna.jg2;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes12.dex */
public final class e extends RecyclerView.t {
    public androidx.viewpager2.widget.a b;

    @NonNull
    public final ViewPager2 c;

    @NonNull
    public final RecyclerView d;

    @NonNull
    public final LinearLayoutManager e;
    public int f;
    public int g;
    public final a h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;

    /* compiled from: ScrollEventAdapter.java */
    public static final class a {
        public int a;
        public float b;
        public int c;
    }

    public e(@NonNull ViewPager2 viewPager2) {
        this.c = viewPager2;
        RecyclerView recyclerView = viewPager2.k;
        this.d = recyclerView;
        this.e = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.h = new a();
        n();
    }

    public final void l(int i) {
        if ((this.f == 3 && this.g == 0) || this.g == i) {
            return;
        }
        this.g = i;
        androidx.viewpager2.widget.a aVar = this.b;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i);
        }
    }

    public final void m(int i, boolean z) {
        androidx.viewpager2.widget.a aVar;
        this.f = z ? 2 : 3;
        boolean z2 = this.j != i;
        this.j = i;
        l(2);
        if (!z2 || (aVar = this.b) == null) {
            return;
        }
        aVar.onPageSelected(i);
    }

    public final void n() {
        this.f = 0;
        this.g = 0;
        a aVar = this.h;
        aVar.a = -1;
        aVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.c = 0;
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.l = false;
        this.m = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        r1 = r0.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        if (r3 >= r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (xsna.jg2.a(r0.getChildAt(r3)) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013a, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        r1 = java.util.Locale.US;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        throw new java.lang.IllegalStateException(xsna.lhg.a(r2.c, "Page can only be offset by a positive amount, not by "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011e, code lost:
    
        if (r0.getChildCount() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        int top;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.e;
        int v = linearLayoutManager.v();
        a aVar = this.h;
        aVar.a = v;
        int i3 = 0;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (v == -1) {
            aVar.a = -1;
            aVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar.c = 0;
            return;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(v);
        if (findViewByPosition == null) {
            aVar.a = -1;
            aVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar.c = 0;
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
        int i4 = linearLayoutManager.b;
        RecyclerView recyclerView = this.d;
        if (i4 == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - recyclerView.getPaddingLeft();
            if (this.c.h.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - recyclerView.getPaddingTop();
        }
        int i5 = -top;
        aVar.c = i5;
        if (i5 >= 0) {
            if (height != 0) {
                f = i5 / height;
            }
            aVar.b = f;
            return;
        }
        int childCount = linearLayoutManager.getChildCount();
        if (childCount != 0) {
            boolean z = linearLayoutManager.b == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = linearLayoutManager.getChildAt(i6);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : jg2.a;
                int[] iArr2 = iArr[i6];
                if (z) {
                    top2 = childAt.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i6];
                if (z) {
                    bottom = childAt.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new ig2(0));
            int i7 = 1;
            while (true) {
                if (i7 >= childCount) {
                    int[] iArr4 = iArr[0];
                    int i8 = iArr4[1];
                    int i9 = iArr4[0];
                    int i10 = i8 - i9;
                    if (i9 <= 0) {
                    }
                } else if (iArr[i7 - 1][1] != iArr[i7][0]) {
                    break;
                } else {
                    i7++;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        androidx.viewpager2.widget.a aVar;
        androidx.viewpager2.widget.a aVar2;
        int i2 = this.f;
        if (!(i2 == 1 && this.g == 1) && i == 1) {
            this.f = 1;
            int i3 = this.j;
            if (i3 != -1) {
                this.i = i3;
                this.j = -1;
            } else if (this.i == -1) {
                this.i = this.e.v();
            }
            l(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.l) {
                l(2);
                this.k = true;
                return;
            }
            return;
        }
        a aVar3 = this.h;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            o();
            if (!this.l) {
                int i4 = aVar3.a;
                if (i4 != -1 && (aVar2 = this.b) != null) {
                    aVar2.onPageScrolled(i4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                }
            } else if (aVar3.c == 0) {
                int i5 = this.i;
                int i6 = aVar3.a;
                if (i5 != i6 && (aVar = this.b) != null) {
                    aVar.onPageSelected(i6);
                }
            }
            l(0);
            n();
        }
        if (this.f == 2 && i == 0 && this.m) {
            o();
            if (aVar3.c == 0) {
                int i7 = this.j;
                int i8 = aVar3.a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    androidx.viewpager2.widget.a aVar4 = this.b;
                    if (aVar4 != null) {
                        aVar4.onPageSelected(i8);
                    }
                }
                l(0);
                n();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r7 < 0) == (r5.c.h.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        int i3;
        androidx.viewpager2.widget.a aVar;
        this.l = true;
        o();
        boolean z = this.k;
        a aVar2 = this.h;
        if (z) {
            this.k = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                i3 = aVar2.a;
                this.j = i3;
                if (this.i != i3 && (aVar = this.b) != null) {
                    aVar.onPageSelected(i3);
                }
            }
            if (aVar2.c != 0) {
                i3 = aVar2.a + 1;
                this.j = i3;
                if (this.i != i3) {
                    aVar.onPageSelected(i3);
                }
            }
            i3 = aVar2.a;
            this.j = i3;
            if (this.i != i3) {
            }
        } else if (this.f == 0) {
            int i4 = aVar2.a;
            if (i4 == -1) {
                i4 = 0;
            }
            androidx.viewpager2.widget.a aVar3 = this.b;
            if (aVar3 != null) {
                aVar3.onPageSelected(i4);
            }
        }
        int i5 = aVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = aVar2.b;
        int i6 = aVar2.c;
        androidx.viewpager2.widget.a aVar4 = this.b;
        if (aVar4 != null) {
            aVar4.onPageScrolled(i5, f, i6);
        }
        int i7 = aVar2.a;
        int i8 = this.j;
        if ((i7 == i8 || i8 == -1) && aVar2.c == 0 && this.g != 1) {
            l(0);
            n();
        }
    }
}
