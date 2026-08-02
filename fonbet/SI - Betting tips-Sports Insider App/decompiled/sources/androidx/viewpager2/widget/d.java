package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p1;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public f f2891a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f2892b;

    /* renamed from: c, reason: collision with root package name */
    public final m f2893c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f2894d;

    /* renamed from: e, reason: collision with root package name */
    public int f2895e;

    /* renamed from: f, reason: collision with root package name */
    public int f2896f;

    /* renamed from: g, reason: collision with root package name */
    public final c f2897g;

    /* renamed from: h, reason: collision with root package name */
    public int f2898h;

    /* renamed from: i, reason: collision with root package name */
    public int f2899i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2900k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2901l;

    public d(ViewPager2 viewPager2) {
        this.f2892b = viewPager2;
        m mVar = viewPager2.j;
        this.f2893c = mVar;
        this.f2894d = (LinearLayoutManager) mVar.getLayoutManager();
        this.f2897g = new c();
        b();
    }

    public final void a(int i5) {
        if ((this.f2895e == 3 && this.f2896f == 0) || this.f2896f == i5) {
            return;
        }
        this.f2896f = i5;
        f fVar = this.f2891a;
        if (fVar != null) {
            fVar.onPageScrollStateChanged(i5);
        }
    }

    public final void b() {
        this.f2895e = 0;
        this.f2896f = 0;
        c cVar = this.f2897g;
        cVar.f2888a = -1;
        cVar.f2889b = 0.0f;
        cVar.f2890c = 0;
        this.f2898h = -1;
        this.f2899i = -1;
        this.j = false;
        this.f2900k = false;
        this.f2901l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        r1 = r0.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        if (r3 >= r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
    
        if (androidx.viewpager2.widget.a.a(r0.getChildAt(r3)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013f, code lost:
    
        r1 = java.util.Locale.US;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
    
        throw new java.lang.IllegalStateException(androidx.appcompat.widget.c1.i(r2.f2890c, "Page can only be offset by a positive amount, not by "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
    
        if (r0.getChildCount() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int top;
        int top2;
        int i5;
        int bottom;
        int i10;
        LinearLayoutManager linearLayoutManager = this.f2894d;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        c cVar = this.f2897g;
        cVar.f2888a = findFirstVisibleItemPosition;
        int i11 = 0;
        if (findFirstVisibleItemPosition == -1) {
            cVar.f2888a = -1;
            cVar.f2889b = 0.0f;
            cVar.f2890c = 0;
            return;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            cVar.f2888a = -1;
            cVar.f2889b = 0.0f;
            cVar.f2890c = 0;
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
        m mVar = this.f2893c;
        if (orientation == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - mVar.getPaddingLeft();
            if (this.f2892b.f2872g.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - mVar.getPaddingTop();
        }
        int i12 = -top;
        cVar.f2890c = i12;
        if (i12 >= 0) {
            cVar.f2889b = height != 0 ? i12 / height : 0.0f;
            return;
        }
        int childCount = linearLayoutManager.getChildCount();
        if (childCount != 0) {
            boolean z5 = linearLayoutManager.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = linearLayoutManager.getChildAt(i13);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : a.f2887a;
                int[] iArr2 = iArr[i13];
                if (z5) {
                    top2 = childAt.getLeft();
                    i5 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i5 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i5;
                int[] iArr3 = iArr[i13];
                if (z5) {
                    bottom = childAt.getRight();
                    i10 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i10 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i10;
            }
            Arrays.sort(iArr, new androidx.coordinatorlayout.widget.i(1));
            int i14 = 1;
            while (true) {
                if (i14 >= childCount) {
                    int[] iArr4 = iArr[0];
                    int i15 = iArr4[1];
                    int i16 = iArr4[0];
                    int i17 = i15 - i16;
                    if (i16 <= 0) {
                    }
                } else if (iArr[i14 - 1][1] != iArr[i14][0]) {
                    break;
                } else {
                    i14++;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.p1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i5) {
        f fVar;
        f fVar2;
        int i10 = this.f2895e;
        if (!(i10 == 1 && this.f2896f == 1) && i5 == 1) {
            this.f2895e = 1;
            int i11 = this.f2899i;
            if (i11 != -1) {
                this.f2898h = i11;
                this.f2899i = -1;
            } else if (this.f2898h == -1) {
                this.f2898h = this.f2894d.findFirstVisibleItemPosition();
            }
            a(1);
            return;
        }
        if ((i10 == 1 || i10 == 4) && i5 == 2) {
            if (this.f2900k) {
                a(2);
                this.j = true;
                return;
            }
            return;
        }
        c cVar = this.f2897g;
        if ((i10 == 1 || i10 == 4) && i5 == 0) {
            c();
            if (!this.f2900k) {
                int i12 = cVar.f2888a;
                if (i12 != -1 && (fVar2 = this.f2891a) != null) {
                    fVar2.onPageScrolled(i12, 0.0f, 0);
                }
            } else if (cVar.f2890c == 0) {
                int i13 = this.f2898h;
                int i14 = cVar.f2888a;
                if (i13 != i14 && (fVar = this.f2891a) != null) {
                    fVar.onPageSelected(i14);
                }
            }
            a(0);
            b();
        }
        if (this.f2895e == 2 && i5 == 0 && this.f2901l) {
            c();
            if (cVar.f2890c == 0) {
                int i15 = this.f2899i;
                int i16 = cVar.f2888a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    f fVar3 = this.f2891a;
                    if (fVar3 != null) {
                        fVar3.onPageSelected(i16);
                    }
                }
                a(0);
                b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r7 < 0) == (r5.f2892b.f2872g.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // androidx.recyclerview.widget.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        int i11;
        f fVar;
        this.f2900k = true;
        c();
        boolean z5 = this.j;
        c cVar = this.f2897g;
        if (z5) {
            this.j = false;
            if (i10 <= 0) {
                if (i10 == 0) {
                }
                i11 = cVar.f2888a;
                this.f2899i = i11;
                if (this.f2898h != i11 && (fVar = this.f2891a) != null) {
                    fVar.onPageSelected(i11);
                }
            }
            if (cVar.f2890c != 0) {
                i11 = cVar.f2888a + 1;
                this.f2899i = i11;
                if (this.f2898h != i11) {
                    fVar.onPageSelected(i11);
                }
            }
            i11 = cVar.f2888a;
            this.f2899i = i11;
            if (this.f2898h != i11) {
            }
        } else if (this.f2895e == 0) {
            int i12 = cVar.f2888a;
            if (i12 == -1) {
                i12 = 0;
            }
            f fVar2 = this.f2891a;
            if (fVar2 != null) {
                fVar2.onPageSelected(i12);
            }
        }
        int i13 = cVar.f2888a;
        if (i13 == -1) {
            i13 = 0;
        }
        float f6 = cVar.f2889b;
        int i14 = cVar.f2890c;
        f fVar3 = this.f2891a;
        if (fVar3 != null) {
            fVar3.onPageScrolled(i13, f6, i14);
        }
        int i15 = cVar.f2888a;
        int i16 = this.f2899i;
        if ((i15 == i16 || i16 == -1) && cVar.f2890c == 0 && this.f2896f != 1) {
            a(0);
            b();
        }
    }
}
