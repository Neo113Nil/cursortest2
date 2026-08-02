package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import androidx.core.view.F0;
import androidx.core.view.J;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l0.AbstractC5338c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.z;

/* loaded from: classes.dex */
public abstract class ViewPager extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f23628A;

    /* renamed from: B, reason: collision with root package name */
    public int f23629B;

    /* renamed from: C, reason: collision with root package name */
    public int f23630C;

    /* renamed from: D, reason: collision with root package name */
    public float f23631D;

    /* renamed from: E, reason: collision with root package name */
    public float f23632E;

    /* renamed from: F, reason: collision with root package name */
    public float f23633F;

    /* renamed from: G, reason: collision with root package name */
    public float f23634G;

    /* renamed from: H, reason: collision with root package name */
    public int f23635H;

    /* renamed from: I, reason: collision with root package name */
    public VelocityTracker f23636I;

    /* renamed from: J, reason: collision with root package name */
    public int f23637J;

    /* renamed from: K, reason: collision with root package name */
    public int f23638K;

    /* renamed from: L, reason: collision with root package name */
    public int f23639L;

    /* renamed from: O, reason: collision with root package name */
    public int f23640O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f23641P;

    /* renamed from: R, reason: collision with root package name */
    public EdgeEffect f23642R;

    /* renamed from: T, reason: collision with root package name */
    public EdgeEffect f23643T;

    /* renamed from: T1, reason: collision with root package name */
    public List f23644T1;

    /* renamed from: V, reason: collision with root package name */
    public boolean f23645V;

    /* renamed from: V1, reason: collision with root package name */
    public int f23646V1;

    /* renamed from: W, reason: collision with root package name */
    public boolean f23647W;

    /* renamed from: a, reason: collision with root package name */
    public int f23648a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23649b;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f23650b1;

    /* renamed from: b2, reason: collision with root package name */
    public ArrayList f23651b2;

    /* renamed from: c, reason: collision with root package name */
    public final f f23652c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23653d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.viewpager.widget.a f23654e;

    /* renamed from: f, reason: collision with root package name */
    public int f23655f;

    /* renamed from: g, reason: collision with root package name */
    public int f23656g;

    /* renamed from: g1, reason: collision with root package name */
    public int f23657g1;

    /* renamed from: g2, reason: collision with root package name */
    public final Runnable f23658g2;

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f23659h;

    /* renamed from: i, reason: collision with root package name */
    public ClassLoader f23660i;

    /* renamed from: j, reason: collision with root package name */
    public Scroller f23661j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23662k;

    /* renamed from: l, reason: collision with root package name */
    public k f23663l;

    /* renamed from: m, reason: collision with root package name */
    public int f23664m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f23665n;

    /* renamed from: o, reason: collision with root package name */
    public int f23666o;

    /* renamed from: p, reason: collision with root package name */
    public int f23667p;

    /* renamed from: p1, reason: collision with root package name */
    public List f23668p1;

    /* renamed from: p2, reason: collision with root package name */
    public int f23669p2;

    /* renamed from: q, reason: collision with root package name */
    public float f23670q;

    /* renamed from: r, reason: collision with root package name */
    public float f23671r;

    /* renamed from: s, reason: collision with root package name */
    public int f23672s;

    /* renamed from: t, reason: collision with root package name */
    public int f23673t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23674u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f23675v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23676w;

    /* renamed from: x, reason: collision with root package name */
    public int f23677x;

    /* renamed from: x1, reason: collision with root package name */
    public j f23678x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23679y;

    /* renamed from: y1, reason: collision with root package name */
    public j f23680y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f23681z;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};

    /* renamed from: x2, reason: collision with root package name */
    public static final Comparator f23626x2 = new a();

    /* renamed from: y2, reason: collision with root package name */
    public static final Interpolator f23627y2 = new b();

    /* renamed from: P4, reason: collision with root package name */
    public static final l f23625P4 = new l();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f23682c;

        /* renamed from: d, reason: collision with root package name */
        public Parcelable f23683d;

        /* renamed from: e, reason: collision with root package name */
        public ClassLoader f23684e;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f23682c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f23682c);
            parcel.writeParcelable(this.f23683d, i10);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f23682c = parcel.readInt();
            this.f23683d = parcel.readParcelable(classLoader);
            this.f23684e = classLoader;
        }
    }

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f23689b - fVar2.f23689b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.D();
        }
    }

    public class d implements J {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f23686a = new Rect();

        public d() {
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            F0 X10 = AbstractC2082d0.X(view, f02);
            if (X10.p()) {
                return X10;
            }
            Rect rect = this.f23686a;
            rect.left = X10.k();
            rect.top = X10.m();
            rect.right = X10.l();
            rect.bottom = X10.j();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                F0 h10 = AbstractC2082d0.h(ViewPager.this.getChildAt(i10), X10);
                rect.left = Math.min(h10.k(), rect.left);
                rect.top = Math.min(h10.m(), rect.top);
                rect.right = Math.min(h10.l(), rect.right);
                rect.bottom = Math.min(h10.j(), rect.bottom);
            }
            return X10.r(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public Object f23688a;

        /* renamed from: b, reason: collision with root package name */
        public int f23689b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f23690c;

        /* renamed from: d, reason: collision with root package name */
        public float f23691d;

        /* renamed from: e, reason: collision with root package name */
        public float f23692e;
    }

    public class h extends C2075a {
        public h() {
        }

        public final boolean c() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f23654e;
            return aVar != null && aVar.d() > 1;
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(c());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f23654e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.d());
            accessibilityEvent.setFromIndex(ViewPager.this.f23655f);
            accessibilityEvent.setToIndex(ViewPager.this.f23655f);
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.w0(ViewPager.class.getName());
            zVar.T0(c());
            if (ViewPager.this.canScrollHorizontally(1)) {
                zVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                zVar.a(8192);
            }
        }

        @Override // androidx.core.view.C2075a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f23655f + 1);
                return true;
            }
            if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f23655f - 1);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.h();
        }
    }

    public static class l implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f23693a;
            return z10 != gVar2.f23693a ? z10 ? 1 : -1 : gVar.f23697e - gVar2.f23697e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23649b = new ArrayList();
        this.f23652c = new f();
        this.f23653d = new Rect();
        this.f23656g = -1;
        this.f23659h = null;
        this.f23660i = null;
        this.f23670q = -3.4028235E38f;
        this.f23671r = Float.MAX_VALUE;
        this.f23677x = 1;
        this.f23635H = -1;
        this.f23645V = true;
        this.f23647W = false;
        this.f23658g2 = new c();
        this.f23669p2 = 0;
        u();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f23675v != z10) {
            this.f23675v = z10;
        }
    }

    public static boolean v(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public boolean A() {
        androidx.viewpager.widget.a aVar = this.f23654e;
        if (aVar == null || this.f23655f >= aVar.d() - 1) {
            return false;
        }
        M(this.f23655f + 1, true);
        return true;
    }

    public final boolean B(int i10) {
        if (this.f23649b.size() == 0) {
            if (this.f23645V) {
                return false;
            }
            this.f23650b1 = false;
            x(0, 0.0f, 0);
            if (this.f23650b1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f s10 = s();
        int clientWidth = getClientWidth();
        int i11 = this.f23664m;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = s10.f23689b;
        float f11 = ((i10 / f10) - s10.f23692e) / (s10.f23691d + (i11 / f10));
        this.f23650b1 = false;
        x(i13, f11, (int) (i12 * f11));
        if (this.f23650b1) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean C(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f23631D - f10;
        this.f23631D = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f23670q * clientWidth;
        float f13 = this.f23671r * clientWidth;
        boolean z12 = false;
        f fVar = (f) this.f23649b.get(0);
        ArrayList arrayList = this.f23649b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f23689b != 0) {
            f12 = fVar.f23692e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f23689b != this.f23654e.d() - 1) {
            f13 = fVar2.f23692e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f23642R.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f23643T.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f23631D += scrollX - i10;
        scrollTo(i10, getScrollY());
        B(i10);
        return z12;
    }

    public void D() {
        E(this.f23655f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(int i10) {
        f fVar;
        String hexString;
        f fVar2;
        f r10;
        f fVar3;
        int i11 = this.f23655f;
        if (i11 != i10) {
            fVar = t(i11);
            this.f23655f = i10;
        } else {
            fVar = null;
        }
        if (this.f23654e == null) {
            Q();
            return;
        }
        if (this.f23676w) {
            Q();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f23654e.q(this);
        int i12 = this.f23677x;
        int max = Math.max(0, this.f23655f - i12);
        int d10 = this.f23654e.d();
        int min = Math.min(d10 - 1, this.f23655f + i12);
        if (d10 != this.f23648a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f23648a + ", found: " + d10 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f23654e.getClass());
        }
        int i13 = 0;
        while (true) {
            if (i13 >= this.f23649b.size()) {
                break;
            }
            fVar2 = (f) this.f23649b.get(i13);
            int i14 = fVar2.f23689b;
            int i15 = this.f23655f;
            if (i14 < i15) {
                i13++;
            }
        }
        if (fVar2 == null && d10 > 0) {
            fVar2 = a(this.f23655f, i13);
        }
        if (fVar2 != null) {
            int i16 = i13 - 1;
            f fVar4 = i16 >= 0 ? (f) this.f23649b.get(i16) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVar2.f23691d) + (getPaddingLeft() / clientWidth);
            float f10 = 0.0f;
            for (int i17 = this.f23655f - 1; i17 >= 0; i17--) {
                if (f10 >= paddingLeft && i17 < max) {
                    if (fVar4 == null) {
                        break;
                    }
                    if (i17 == fVar4.f23689b && !fVar4.f23690c) {
                        this.f23649b.remove(i16);
                        this.f23654e.a(this, i17, fVar4.f23688a);
                        i16--;
                        i13--;
                        if (i16 >= 0) {
                            fVar3 = (f) this.f23649b.get(i16);
                            fVar4 = fVar3;
                        }
                        fVar3 = null;
                        fVar4 = fVar3;
                    }
                } else if (fVar4 == null || i17 != fVar4.f23689b) {
                    f10 += a(i17, i16 + 1).f23691d;
                    i13++;
                    if (i16 >= 0) {
                        fVar3 = (f) this.f23649b.get(i16);
                        fVar4 = fVar3;
                    }
                    fVar3 = null;
                    fVar4 = fVar3;
                } else {
                    f10 += fVar4.f23691d;
                    i16--;
                    if (i16 >= 0) {
                        fVar3 = (f) this.f23649b.get(i16);
                        fVar4 = fVar3;
                    }
                    fVar3 = null;
                    fVar4 = fVar3;
                }
            }
            float f11 = fVar2.f23691d;
            int i18 = i13 + 1;
            if (f11 < 2.0f) {
                f fVar5 = i18 < this.f23649b.size() ? (f) this.f23649b.get(i18) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i19 = this.f23655f;
                while (true) {
                    i19++;
                    if (i19 >= d10) {
                        break;
                    }
                    if (f11 >= paddingRight && i19 > min) {
                        if (fVar5 == null) {
                            break;
                        }
                        if (i19 == fVar5.f23689b && !fVar5.f23690c) {
                            this.f23649b.remove(i18);
                            this.f23654e.a(this, i19, fVar5.f23688a);
                            if (i18 < this.f23649b.size()) {
                                fVar5 = (f) this.f23649b.get(i18);
                            }
                        }
                    } else if (fVar5 == null || i19 != fVar5.f23689b) {
                        f a10 = a(i19, i18);
                        i18++;
                        f11 += a10.f23691d;
                        fVar5 = i18 < this.f23649b.size() ? (f) this.f23649b.get(i18) : null;
                    } else {
                        f11 += fVar5.f23691d;
                        i18++;
                        if (i18 < this.f23649b.size()) {
                            fVar5 = (f) this.f23649b.get(i18);
                        }
                    }
                }
            }
            e(fVar2, i13, fVar);
            this.f23654e.n(this, this.f23655f, fVar2.f23688a);
        }
        this.f23654e.c(this);
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f23698f = i20;
            if (!gVar.f23693a && gVar.f23695c == 0.0f && (r10 = r(childAt)) != null) {
                gVar.f23695c = r10.f23691d;
                gVar.f23697e = r10.f23689b;
            }
        }
        Q();
        if (hasFocus()) {
            View findFocus = findFocus();
            f q10 = findFocus != null ? q(findFocus) : null;
            if (q10 == null || q10.f23689b != this.f23655f) {
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    f r11 = r(childAt2);
                    if (r11 != null && r11.f23689b == this.f23655f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void F(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f23649b.isEmpty()) {
            if (!this.f23661j.isFinished()) {
                this.f23661j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f t10 = t(this.f23655f);
        int min = (int) ((t10 != null ? Math.min(t10.f23692e, this.f23671r) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            g(false);
            scrollTo(min, getScrollY());
        }
    }

    public final void G() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f23693a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    public void H(i iVar) {
        List list = this.f23644T1;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void I(j jVar) {
        List list = this.f23668p1;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public final void J(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final boolean K() {
        this.f23635H = -1;
        n();
        this.f23642R.onRelease();
        this.f23643T.onRelease();
        return this.f23642R.isFinished() || this.f23643T.isFinished();
    }

    public final void L(int i10, boolean z10, int i11, boolean z11) {
        f t10 = t(i10);
        int clientWidth = t10 != null ? (int) (getClientWidth() * Math.max(this.f23670q, Math.min(t10.f23692e, this.f23671r))) : 0;
        if (z10) {
            P(clientWidth, 0, i11);
            if (z11) {
                k(i10);
                return;
            }
            return;
        }
        if (z11) {
            k(i10);
        }
        g(false);
        scrollTo(clientWidth, 0);
        B(clientWidth);
    }

    public void M(int i10, boolean z10) {
        this.f23676w = false;
        N(i10, z10, false);
    }

    public void N(int i10, boolean z10, boolean z11) {
        O(i10, z10, z11, 0);
    }

    public void O(int i10, boolean z10, boolean z11, int i11) {
        androidx.viewpager.widget.a aVar = this.f23654e;
        if (aVar == null || aVar.d() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f23655f == i10 && this.f23649b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f23654e.d()) {
            i10 = this.f23654e.d() - 1;
        }
        int i12 = this.f23677x;
        int i13 = this.f23655f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f23649b.size(); i14++) {
                ((f) this.f23649b.get(i14)).f23690c = true;
            }
        }
        boolean z12 = this.f23655f != i10;
        if (!this.f23645V) {
            E(i10);
            L(i10, z10, i11, z12);
        } else {
            this.f23655f = i10;
            if (z12) {
                k(i10);
            }
            requestLayout();
        }
    }

    public void P(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f23661j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f23662k ? this.f23661j.getCurrX() : this.f23661j.getStartX();
            this.f23661j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            g(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float m10 = f11 + (m(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int abs = Math.abs(i12);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m10 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i14) / ((f10 * this.f23654e.g(this.f23655f)) + this.f23664m)) + 1.0f) * 100.0f), 600);
        this.f23662k = false;
        this.f23661j.startScroll(i13, scrollY, i14, i15, min);
        AbstractC2082d0.c0(this);
    }

    public final void Q() {
        if (this.f23646V1 != 0) {
            ArrayList arrayList = this.f23651b2;
            if (arrayList == null) {
                this.f23651b2 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f23651b2.add(getChildAt(i10));
            }
            Collections.sort(this.f23651b2, f23625P4);
        }
    }

    public f a(int i10, int i11) {
        f fVar = new f();
        fVar.f23689b = i10;
        fVar.f23688a = this.f23654e.h(this, i10);
        fVar.f23691d = this.f23654e.g(i10);
        if (i11 < 0 || i11 >= this.f23649b.size()) {
            this.f23649b.add(fVar);
            return fVar;
        }
        this.f23649b.add(i11, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        f r10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (r10 = r(childAt)) != null && r10.f23689b == this.f23655f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f r10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (r10 = r(childAt)) != null && r10.f23689b == this.f23655f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean v10 = gVar.f23693a | v(view);
        gVar.f23693a = v10;
        if (!this.f23674u) {
            super.addView(view, i10, layoutParams);
        } else {
            if (v10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f23696d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(i iVar) {
        if (this.f23644T1 == null) {
            this.f23644T1 = new ArrayList();
        }
        this.f23644T1.add(iVar);
    }

    public void c(j jVar) {
        if (this.f23668p1 == null) {
            this.f23668p1 = new ArrayList();
        }
        this.f23668p1.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f23654e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f23670q)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f23671r));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f23662k = true;
        if (this.f23661j.isFinished() || !this.f23661j.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f23661j.getCurrX();
        int currY = this.f23661j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.f23661j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AbstractC2082d0.c0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i10) {
        View findNextFocus;
        boolean z10;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i10 != 17 || i10 == 1) {
                    z10 = z();
                } else {
                    if (i10 == 66 || i10 == 2) {
                        z10 = A();
                    }
                    z10 = false;
                }
            } else if (i10 == 17) {
                z10 = (findFocus == null || p(this.f23653d, findNextFocus).left < p(this.f23653d, findFocus).left) ? findNextFocus.requestFocus() : z();
            } else {
                if (i10 == 66) {
                    z10 = (findFocus == null || p(this.f23653d, findNextFocus).left > p(this.f23653d, findFocus).left) ? findNextFocus.requestFocus() : A();
                }
                z10 = false;
            }
            if (z10) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
            }
            return z10;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        if (findNextFocus != null) {
        }
        if (i10 != 17) {
        }
        z10 = z();
        if (z10) {
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f r10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (r10 = r(childAt)) != null && r10.f23689b == this.f23655f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f23654e) != null && aVar.d() > 1)) {
            if (!this.f23642R.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f23670q * width);
                this.f23642R.setSize(height, width);
                z10 = this.f23642R.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f23643T.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f23671r + 1.0f)) * width2);
                this.f23643T.setSize(height2, width2);
                z10 |= this.f23643T.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f23642R.finish();
            this.f23643T.finish();
        }
        if (z10) {
            AbstractC2082d0.c0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f23665n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int d10 = this.f23654e.d();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f23664m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f23689b;
            int i14 = fVar.f23689b;
            if (i13 < i14) {
                float f11 = fVar2.f23692e + fVar2.f23691d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f23689b && i16 < this.f23649b.size()) {
                    Object obj = this.f23649b.get(i16);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i15 <= fVar4.f23689b || i16 >= this.f23649b.size() - 1) {
                            break;
                        }
                        i16++;
                        obj = this.f23649b.get(i16);
                    }
                    while (i15 < fVar4.f23689b) {
                        f11 += this.f23654e.g(i15) + f10;
                        i15++;
                    }
                    fVar4.f23692e = f11;
                    f11 += fVar4.f23691d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f23649b.size() - 1;
                float f12 = fVar2.f23692e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f23689b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f23649b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i13 >= fVar3.f23689b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f23649b.get(size);
                    }
                    while (i13 > fVar3.f23689b) {
                        f12 -= this.f23654e.g(i13) + f10;
                        i13--;
                    }
                    f12 -= fVar3.f23691d + f10;
                    fVar3.f23692e = f12;
                }
            }
        }
        int size2 = this.f23649b.size();
        float f13 = fVar.f23692e;
        int i17 = fVar.f23689b;
        int i18 = i17 - 1;
        this.f23670q = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = d10 - 1;
        this.f23671r = i17 == i19 ? (fVar.f23691d + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar5 = (f) this.f23649b.get(i20);
            while (true) {
                i12 = fVar5.f23689b;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.f23654e.g(i18) + f10;
                i18--;
            }
            f13 -= fVar5.f23691d + f10;
            fVar5.f23692e = f13;
            if (i12 == 0) {
                this.f23670q = f13;
            }
            i20--;
            i18--;
        }
        float f14 = fVar.f23692e + fVar.f23691d + f10;
        int i21 = fVar.f23689b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar6 = (f) this.f23649b.get(i22);
            while (true) {
                i11 = fVar6.f23689b;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.f23654e.g(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f23671r = (fVar6.f23691d + f14) - 1.0f;
            }
            fVar6.f23692e = f14;
            f14 += fVar6.f23691d + f10;
            i22++;
            i21++;
        }
        this.f23647W = false;
    }

    public boolean f(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && f(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public final void g(boolean z10) {
        boolean z11 = this.f23669p2 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f23661j.isFinished()) {
                this.f23661j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f23661j.getCurrX();
                int currY = this.f23661j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.f23676w = false;
        for (int i10 = 0; i10 < this.f23649b.size(); i10++) {
            f fVar = (f) this.f23649b.get(i10);
            if (fVar.f23690c) {
                fVar.f23690c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                AbstractC2082d0.d0(this, this.f23658g2);
            } else {
                this.f23658g2.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f23654e;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f23646V1 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) ((View) this.f23651b2.get(i11)).getLayoutParams()).f23698f;
    }

    public int getCurrentItem() {
        return this.f23655f;
    }

    public int getOffscreenPageLimit() {
        return this.f23677x;
    }

    public int getPageMargin() {
        return this.f23664m;
    }

    public void h() {
        int d10 = this.f23654e.d();
        this.f23648a = d10;
        boolean z10 = this.f23649b.size() < (this.f23677x * 2) + 1 && this.f23649b.size() < d10;
        int i10 = this.f23655f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f23649b.size()) {
            f fVar = (f) this.f23649b.get(i11);
            int e10 = this.f23654e.e(fVar.f23688a);
            if (e10 != -1) {
                if (e10 == -2) {
                    this.f23649b.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f23654e.q(this);
                        z11 = true;
                    }
                    this.f23654e.a(this, fVar.f23689b, fVar.f23688a);
                    int i12 = this.f23655f;
                    if (i12 == fVar.f23689b) {
                        i10 = Math.max(0, Math.min(i12, d10 - 1));
                    }
                } else {
                    int i13 = fVar.f23689b;
                    if (i13 != e10) {
                        if (i13 == this.f23655f) {
                            i10 = e10;
                        }
                        fVar.f23689b = e10;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f23654e.c(this);
        }
        Collections.sort(this.f23649b, f23626x2);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f23693a) {
                    gVar.f23695c = 0.0f;
                }
            }
            N(i10, false, true);
            requestLayout();
        }
    }

    public final int i(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f23639L || Math.abs(i11) <= this.f23637J) {
            i10 += (int) (f10 + (i10 >= this.f23655f ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f23649b.size() <= 0) {
            return i10;
        }
        return Math.max(((f) this.f23649b.get(0)).f23689b, Math.min(i10, ((f) this.f23649b.get(r4.size() - 1)).f23689b));
    }

    public final void j(int i10, float f10, int i11) {
        j jVar = this.f23678x1;
        if (jVar != null) {
            jVar.a(i10, f10, i11);
        }
        List list = this.f23668p1;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = (j) this.f23668p1.get(i12);
                if (jVar2 != null) {
                    jVar2.a(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.f23680y1;
        if (jVar3 != null) {
            jVar3.a(i10, f10, i11);
        }
    }

    public final void k(int i10) {
        j jVar = this.f23678x1;
        if (jVar != null) {
            jVar.c(i10);
        }
        List list = this.f23668p1;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f23668p1.get(i11);
                if (jVar2 != null) {
                    jVar2.c(i10);
                }
            }
        }
        j jVar3 = this.f23680y1;
        if (jVar3 != null) {
            jVar3.c(i10);
        }
    }

    public final void l(int i10) {
        j jVar = this.f23678x1;
        if (jVar != null) {
            jVar.b(i10);
        }
        List list = this.f23668p1;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f23668p1.get(i11);
                if (jVar2 != null) {
                    jVar2.b(i10);
                }
            }
        }
        j jVar3 = this.f23680y1;
        if (jVar3 != null) {
            jVar3.b(i10);
        }
    }

    public float m(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void n() {
        this.f23679y = false;
        this.f23681z = false;
        VelocityTracker velocityTracker = this.f23636I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23636I = null;
        }
    }

    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? z() : d(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? A() : d(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return d(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return d(1);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23645V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f23658g2);
        Scroller scroller = this.f23661j;
        if (scroller != null && !scroller.isFinished()) {
            this.f23661j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.f23664m <= 0 || this.f23665n == null || this.f23649b.size() <= 0 || this.f23654e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f23664m / width;
        int i12 = 0;
        f fVar = (f) this.f23649b.get(0);
        float f12 = fVar.f23692e;
        int size = this.f23649b.size();
        int i13 = fVar.f23689b;
        int i14 = ((f) this.f23649b.get(size - 1)).f23689b;
        while (i13 < i14) {
            while (true) {
                i10 = fVar.f23689b;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                fVar = (f) this.f23649b.get(i12);
            }
            if (i13 == i10) {
                float f13 = fVar.f23692e;
                float f14 = fVar.f23691d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float g10 = this.f23654e.g(i13);
                f10 = (f12 + g10) * width;
                f12 += g10 + f11;
            }
            if (this.f23664m + f10 > scrollX) {
                i11 = scrollX;
                this.f23665n.setBounds(Math.round(f10), this.f23666o, Math.round(this.f23664m + f10), this.f23667p);
                this.f23665n.draw(canvas);
            } else {
                i11 = scrollX;
            }
            if (f10 > i11 + r2) {
                return;
            }
            i13++;
            scrollX = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            K();
            return false;
        }
        if (action != 0) {
            if (this.f23679y) {
                return true;
            }
            if (this.f23681z) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f23633F = x10;
            this.f23631D = x10;
            float y10 = motionEvent.getY();
            this.f23634G = y10;
            this.f23632E = y10;
            this.f23635H = motionEvent.getPointerId(0);
            this.f23681z = false;
            this.f23662k = true;
            this.f23661j.computeScrollOffset();
            if (this.f23669p2 != 2 || Math.abs(this.f23661j.getFinalX() - this.f23661j.getCurrX()) <= this.f23640O) {
                g(false);
                this.f23679y = false;
            } else {
                this.f23661j.abortAnimation();
                this.f23676w = false;
                D();
                this.f23679y = true;
                J(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f23635H;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.f23631D;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f23634G);
                if (f10 != 0.0f && !w(this.f23631D, f10) && f(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f23631D = x11;
                    this.f23632E = y11;
                    this.f23681z = true;
                    return false;
                }
                int i11 = this.f23630C;
                if (abs > i11 && abs * 0.5f > abs2) {
                    this.f23679y = true;
                    J(true);
                    setScrollState(1);
                    float f11 = this.f23633F;
                    float f12 = this.f23630C;
                    this.f23631D = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f23632E = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i11) {
                    this.f23681z = true;
                }
                if (this.f23679y && C(x11)) {
                    AbstractC2082d0.c0(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.f23636I == null) {
            this.f23636I = VelocityTracker.obtain();
        }
        this.f23636I.addMovement(motionEvent);
        return this.f23679y;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        f r10;
        int max;
        int i14;
        int max2;
        int i15;
        int childCount = getChildCount();
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f23693a) {
                    int i20 = gVar.f23694b;
                    int i21 = i20 & 7;
                    int i22 = i20 & 112;
                    if (i21 != 1) {
                        if (i21 == 3) {
                            i14 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i21 != 5) {
                            i14 = paddingLeft;
                        } else {
                            max = (i16 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i22 == 16) {
                            if (i22 == 48) {
                                i15 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i22 != 80) {
                                i15 = paddingTop;
                            } else {
                                max2 = (i17 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                            i18++;
                            paddingTop = i15;
                            paddingLeft = i14;
                        } else {
                            max2 = Math.max((i17 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = max2;
                        i15 = paddingTop;
                        paddingTop = i24;
                        int i232 = paddingLeft + scrollX;
                        childAt.layout(i232, paddingTop, childAt.getMeasuredWidth() + i232, paddingTop + childAt.getMeasuredHeight());
                        i18++;
                        paddingTop = i15;
                        paddingLeft = i14;
                    } else {
                        max = Math.max((i16 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i25 = max;
                    i14 = paddingLeft;
                    paddingLeft = i25;
                    if (i22 == 16) {
                    }
                    int i242 = max2;
                    i15 = paddingTop;
                    paddingTop = i242;
                    int i2322 = paddingLeft + scrollX;
                    childAt.layout(i2322, paddingTop, childAt.getMeasuredWidth() + i2322, paddingTop + childAt.getMeasuredHeight());
                    i18++;
                    paddingTop = i15;
                    paddingLeft = i14;
                }
            }
        }
        int i26 = (i16 - paddingLeft) - paddingRight;
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt2 = getChildAt(i27);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f23693a && (r10 = r(childAt2)) != null) {
                    float f10 = i26;
                    int i28 = ((int) (r10.f23692e * f10)) + paddingLeft;
                    if (gVar2.f23696d) {
                        gVar2.f23696d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * gVar2.f23695c), 1073741824), View.MeasureSpec.makeMeasureSpec((i17 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i28, paddingTop, childAt2.getMeasuredWidth() + i28, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f23666o = paddingTop;
        this.f23667p = i17 - paddingBottom;
        this.f23657g1 = i18;
        if (this.f23645V) {
            z11 = false;
            L(this.f23655f, false, 0, false);
        } else {
            z11 = false;
        }
        this.f23645V = z11;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f23629B = Math.min(measuredWidth / 10, this.f23628A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f23693a) {
                int i15 = gVar2.f23694b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f23672s = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f23673t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f23674u = true;
        D();
        this.f23674u = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f23693a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f23695c), 1073741824), this.f23673t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f r10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (r10 = r(childAt)) != null && r10.f23689b == this.f23655f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        androidx.viewpager.widget.a aVar = this.f23654e;
        if (aVar != null) {
            aVar.l(savedState.f23683d, savedState.f23684e);
            N(savedState.f23682c, false, true);
        } else {
            this.f23656g = savedState.f23682c;
            this.f23659h = savedState.f23683d;
            this.f23660i = savedState.f23684e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23682c = this.f23655f;
        androidx.viewpager.widget.a aVar = this.f23654e;
        if (aVar != null) {
            savedState.f23683d = aVar.m();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f23664m;
            F(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.f23641P) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f23654e) == null || aVar.d() == 0) {
            return false;
        }
        if (this.f23636I == null) {
            this.f23636I = VelocityTracker.obtain();
        }
        this.f23636I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f23661j.abortAnimation();
            this.f23676w = false;
            D();
            float x10 = motionEvent.getX();
            this.f23633F = x10;
            this.f23631D = x10;
            float y10 = motionEvent.getY();
            this.f23634G = y10;
            this.f23632E = y10;
            this.f23635H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f23679y) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f23635H);
                    if (findPointerIndex == -1) {
                        z10 = K();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.f23631D);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.f23632E);
                        if (abs > this.f23630C && abs > abs2) {
                            this.f23679y = true;
                            J(true);
                            float f10 = this.f23633F;
                            this.f23631D = x11 - f10 > 0.0f ? f10 + this.f23630C : f10 - this.f23630C;
                            this.f23632E = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f23679y) {
                    z10 = C(motionEvent.getX(motionEvent.findPointerIndex(this.f23635H)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f23631D = motionEvent.getX(actionIndex);
                    this.f23635H = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    y(motionEvent);
                    this.f23631D = motionEvent.getX(motionEvent.findPointerIndex(this.f23635H));
                }
            } else if (this.f23679y) {
                L(this.f23655f, true, 0, false);
                z10 = K();
            }
        } else if (this.f23679y) {
            VelocityTracker velocityTracker = this.f23636I;
            velocityTracker.computeCurrentVelocity(1000, this.f23638K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f23635H);
            this.f23676w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f s10 = s();
            float f11 = clientWidth;
            O(i(s10.f23689b, ((scrollX / f11) - s10.f23692e) / (s10.f23691d + (this.f23664m / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f23635H)) - this.f23633F)), true, true, xVelocity);
            z10 = K();
        }
        if (z10) {
            AbstractC2082d0.c0(this);
        }
        return true;
    }

    public final Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public f q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public f r(View view) {
        for (int i10 = 0; i10 < this.f23649b.size(); i10++) {
            f fVar = (f) this.f23649b.get(i10);
            if (this.f23654e.i(view, fVar.f23688a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f23674u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final f s() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f23664m / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        f fVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f23649b.size()) {
            f fVar2 = (f) this.f23649b.get(i11);
            if (!z10 && fVar2.f23689b != (i10 = i12 + 1)) {
                fVar2 = this.f23652c;
                fVar2.f23692e = f10 + f12 + f11;
                fVar2.f23689b = i10;
                fVar2.f23691d = this.f23654e.g(i10);
                i11--;
            }
            f fVar3 = fVar2;
            f10 = fVar3.f23692e;
            float f13 = fVar3.f23691d + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.f23649b.size() - 1) {
                return fVar3;
            }
            int i13 = fVar3.f23689b;
            float f14 = fVar3.f23691d;
            i11++;
            i12 = i13;
            f12 = f14;
            fVar = fVar3;
            z10 = false;
        }
        return fVar;
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f23654e;
        if (aVar2 != null) {
            aVar2.o(null);
            this.f23654e.q(this);
            for (int i10 = 0; i10 < this.f23649b.size(); i10++) {
                f fVar = (f) this.f23649b.get(i10);
                this.f23654e.a(this, fVar.f23689b, fVar.f23688a);
            }
            this.f23654e.c(this);
            this.f23649b.clear();
            G();
            this.f23655f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f23654e;
        this.f23654e = aVar;
        this.f23648a = 0;
        if (aVar != null) {
            if (this.f23663l == null) {
                this.f23663l = new k();
            }
            this.f23654e.o(this.f23663l);
            this.f23676w = false;
            boolean z10 = this.f23645V;
            this.f23645V = true;
            this.f23648a = this.f23654e.d();
            if (this.f23656g >= 0) {
                this.f23654e.l(this.f23659h, this.f23660i);
                N(this.f23656g, false, true);
                this.f23656g = -1;
                this.f23659h = null;
                this.f23660i = null;
            } else if (z10) {
                requestLayout();
            } else {
                D();
            }
        }
        List list = this.f23644T1;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f23644T1.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((i) this.f23644T1.get(i11)).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f23676w = false;
        N(i10, !this.f23645V, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f23677x) {
            this.f23677x = i10;
            D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f23678x1 = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f23664m;
        this.f23664m = i10;
        int width = getWidth();
        F(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f23665n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f23669p2 == i10) {
            return;
        }
        this.f23669p2 = i10;
        l(i10);
    }

    public f t(int i10) {
        for (int i11 = 0; i11 < this.f23649b.size(); i11++) {
            f fVar = (f) this.f23649b.get(i11);
            if (fVar.f23689b == i10) {
                return fVar;
            }
        }
        return null;
    }

    public void u() {
        setWillNotDraw(false);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        setFocusable(true);
        Context context = getContext();
        this.f23661j = new Scroller(context, f23627y2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f23630C = viewConfiguration.getScaledPagingTouchSlop();
        this.f23637J = (int) (400.0f * f10);
        this.f23638K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23642R = new EdgeEffect(context);
        this.f23643T = new EdgeEffect(context);
        this.f23639L = (int) (25.0f * f10);
        this.f23640O = (int) (2.0f * f10);
        this.f23628A = (int) (f10 * 16.0f);
        AbstractC2082d0.l0(this, new h());
        if (AbstractC2082d0.x(this) == 0) {
            AbstractC2082d0.t0(this, 1);
        }
        AbstractC2082d0.x0(this, new d());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f23665n;
    }

    public final boolean w(float f10, float f11) {
        if (f10 >= this.f23629B || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.f23629B)) && f11 < 0.0f;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(int i10, float f10, int i11) {
        int max;
        int i12;
        int left;
        if (this.f23657g1 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f23693a) {
                    int i14 = gVar.f23694b & 7;
                    if (i14 != 1) {
                        if (i14 == 3) {
                            i12 = childAt.getWidth() + paddingLeft;
                        } else if (i14 != 5) {
                            i12 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i12;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = max;
                    i12 = paddingLeft;
                    paddingLeft = i15;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i12;
                }
            }
        }
        j(i10, f10, i11);
        this.f23650b1 = true;
    }

    public final void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f23635H) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f23631D = motionEvent.getX(i10);
            this.f23635H = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f23636I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean z() {
        int i10 = this.f23655f;
        if (i10 <= 0) {
            return false;
        }
        M(i10 - 1, true);
        return true;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23693a;

        /* renamed from: b, reason: collision with root package name */
        public int f23694b;

        /* renamed from: c, reason: collision with root package name */
        public float f23695c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f23696d;

        /* renamed from: e, reason: collision with root package name */
        public int f23697e;

        /* renamed from: f, reason: collision with root package name */
        public int f23698f;

        public g() {
            super(-1, -1);
            this.f23695c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23695c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f23694b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(AbstractC5338c.getDrawable(getContext(), i10));
    }
}
