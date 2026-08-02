package com.bytedance.adsdk.ugeno.kj;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
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
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.fc6;
import defpackage.me4;
import defpackage.mz1;
import defpackage.zzl;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends ViewGroup {
    private boolean atb;
    private vj bg;
    private int dax;
    private boolean erj;
    private int ew;
    private EdgeEffect fmh;
    private float fum;
    private boolean gbb;
    private boolean gd;
    private final Runnable gdh;
    com.bytedance.adsdk.ugeno.kj.sf gm;
    private int gpj;
    private Scroller hc;
    private oo hoh;
    private EdgeEffect hpk;
    private int iv;
    private wh jr;
    private boolean jsj;
    private final sf kj;
    private VelocityTracker kun;
    private int kz;
    private float lo;
    private int lq;
    private int lrr;
    private int lu;
    private boolean mk;
    private float mu;
    private Drawable nac;
    private float nn;
    private int of;
    int oo;
    private int ork;
    private int otd;
    private int pcc;
    private float pq;
    private List<oo> ptr;
    private oo qcw;
    private final ArrayList<sf> qf;
    private boolean qy;
    private boolean ri;
    private int rj;
    private float rnn;
    private int se;
    private ClassLoader tmg;
    private ArrayList<View> tmh;
    private int tsx;
    private int tsz;
    private int tz;
    private Parcelable vh;
    private List<Object> vr;
    private final Rect vy;
    private int xb;
    private int ye;
    private boolean yt;
    private boolean zsj;
    private int zti;
    static final int[] sf = {R.attr.layout_gravity};
    private static final Comparator<sf> vj = new Comparator<sf>() { // from class: com.bytedance.adsdk.ugeno.kj.gm.1
        @Override // java.util.Comparator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compare(sf sfVar, sf sfVar2) {
            return sfVar.sf - sfVar2.sf;
        }
    };
    private static final Interpolator wh = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.kj.gm.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final kj gh = new kj();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class kj implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0030gm c0030gm = (C0030gm) view.getLayoutParams();
            C0030gm c0030gm2 = (C0030gm) view2.getLayoutParams();
            boolean z = c0030gm.pcc;
            return z != c0030gm2.pcc ? z ? 1 : -1 : c0030gm.vj - c0030gm2.vj;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface oo {
        void hc(int i);

        void pcc(int i, float f, int i2);

        void tmg(int i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface pcc {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf {
        boolean gm;
        float oo;
        Object pcc;
        int sf;
        float vj;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface vj {
        void pcc(View view, float f);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class wh extends DataSetObserver {
        public wh() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            gm.this.sf();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            gm.this.sf();
        }
    }

    public gm(Context context) {
        super(context);
        this.qf = new ArrayList<>();
        this.kj = new sf();
        this.vy = new Rect();
        this.ork = -1;
        this.vh = null;
        this.tmg = null;
        this.lo = -3.4028235E38f;
        this.fum = Float.MAX_VALUE;
        this.tsz = 1;
        this.tsx = -1;
        this.zsj = true;
        this.gd = false;
        this.gdh = new Runnable() { // from class: com.bytedance.adsdk.ugeno.kj.gm.3
            @Override // java.lang.Runnable
            public void run() {
                gm.this.setScrollState(0);
                gm.this.gm();
            }
        };
        this.otd = 0;
        pcc();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean kj() {
        this.tsx = -1;
        ork();
        this.hpk.onRelease();
        this.fmh.onRelease();
        return this.hpk.isFinished() || this.fmh.isFinished();
    }

    private boolean oo(int i) {
        if (this.qf.size() == 0) {
            if (this.zsj) {
                return false;
            }
            this.erj = false;
            pcc(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            if (this.erj) {
                return false;
            }
            a70.r("onPageScrolled did not call superclass implementation");
            return false;
        }
        sf vy = vy();
        int clientWidth = getClientWidth();
        int i2 = this.dax;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = vy.sf;
        float f2 = ((i / f) - vy.vj) / (vy.oo + (i2 / f));
        this.erj = false;
        pcc(i4, f2, (int) (i3 * f2));
        if (this.erj) {
            return true;
        }
        a70.r("onPageScrolled did not call superclass implementation");
        return false;
    }

    private void ork() {
        this.mk = false;
        this.atb = false;
        VelocityTracker velocityTracker = this.kun;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.kun = null;
        }
    }

    private void qf() {
        if (this.ew != 0) {
            ArrayList<View> arrayList = this.tmh;
            if (arrayList == null) {
                this.tmh = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.tmh.add(getChildAt(i));
            }
            Collections.sort(this.tmh, gh);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.qy != z) {
            this.qy = z;
        }
    }

    private void vj(int i) {
        oo ooVar = this.hoh;
        if (ooVar != null) {
            ooVar.tmg(i);
        }
        List<oo> list = this.ptr;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                oo ooVar2 = this.ptr.get(i2);
                if (ooVar2 != null) {
                    ooVar2.tmg(i);
                }
            }
        }
        oo ooVar3 = this.qcw;
        if (ooVar3 != null) {
            ooVar3.tmg(i);
        }
    }

    private sf vy() {
        int i;
        int clientWidth = getClientWidth();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.dax / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        sf sfVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.qf.size()) {
            sf sfVar2 = this.qf.get(i2);
            if (!z && sfVar2.sf != (i = i3 + 1)) {
                sfVar2 = this.kj;
                sfVar2.vj = f + f3 + f2;
                sfVar2.sf = i;
                sfVar2.oo = this.gm.pcc(i);
                i2--;
            }
            sf sfVar3 = sfVar2;
            f = sfVar3.vj;
            float f4 = sfVar3.oo + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i2 == this.qf.size() - 1) {
                return sfVar3;
            }
            int i4 = sfVar3.sf;
            float f5 = sfVar3.oo;
            i2++;
            i3 = i4;
            f3 = f5;
            sfVar = sfVar3;
            z = false;
        }
        return sfVar;
    }

    private void wh(int i) {
        oo ooVar = this.hoh;
        if (ooVar != null) {
            ooVar.hc(i);
        }
        List<oo> list = this.ptr;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                oo ooVar2 = this.ptr.get(i2);
                if (ooVar2 != null) {
                    ooVar2.hc(i);
                }
            }
        }
        oo ooVar3 = this.qcw;
        if (ooVar3 != null) {
            ooVar3.hc(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        sf pcc2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (pcc2 = pcc(childAt)) != null && pcc2.sf == this.oo) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        sf pcc2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (pcc2 = pcc(childAt)) != null && pcc2.sf == this.oo) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0030gm c0030gm = (C0030gm) layoutParams;
        boolean gm = c0030gm.pcc | gm(view);
        c0030gm.pcc = gm;
        if (!this.yt) {
            super.addView(view, i, layoutParams);
        } else if (gm) {
            a70.r("Cannot add pager decor view during layout");
        } else {
            c0030gm.oo = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.gm == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.lo)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.fum));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0030gm) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.gbb = true;
        if (this.hc.isFinished() || !this.hc.computeScrollOffset()) {
            pcc(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.hc.getCurrX();
        int currY = this.hc.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!oo(currX)) {
                this.hc.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || pcc(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        sf pcc2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (pcc2 = pcc(childAt)) != null && pcc2.sf == this.oo && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.kj.sf sfVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (sfVar = this.gm) != null && sfVar.pcc() > 1)) {
            if (!this.hpk.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.lo * width);
                this.hpk.setSize(height, width);
                z = this.hpk.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.fmh.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.fum + 1.0f)) * width2);
                this.fmh.setSize(height2, width2);
                z |= this.fmh.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.hpk.finish();
            this.fmh.finish();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.nac;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0030gm();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0030gm(getContext(), attributeSet);
    }

    public com.bytedance.adsdk.ugeno.kj.sf getAdapter() {
        return this.gm;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.ew == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0030gm) this.tmh.get(i2).getLayoutParams()).wh;
    }

    public int getCurrentItem() {
        return this.oo;
    }

    public int getOffscreenPageLimit() {
        return this.tsz;
    }

    public int getPageMargin() {
        return this.dax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r5 != 2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean gm(int i) {
        View findNextFocus;
        boolean oo2;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i != 17 || i == 1) {
                    oo2 = oo();
                } else {
                    if (i != 66) {
                    }
                    oo2 = vj();
                }
            } else if (i == 17) {
                oo2 = (findFocus == null || pcc(this.vy, findNextFocus).left < pcc(this.vy, findFocus).left) ? findNextFocus.requestFocus() : oo();
            } else {
                if (i == 66) {
                    int i2 = pcc(this.vy, findNextFocus).left;
                    int i3 = pcc(this.vy, findFocus).left;
                    if (findFocus == null || i2 > i3) {
                        oo2 = findNextFocus.requestFocus();
                    }
                    oo2 = vj();
                }
                oo2 = false;
            }
            if (oo2) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return oo2;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null) {
        }
        if (i != 17) {
        }
        oo2 = oo();
        if (oo2) {
        }
        return oo2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.zsj = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.gdh);
        Scroller scroller = this.hc;
        if (scroller != null && !scroller.isFinished()) {
            this.hc.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        super.onDraw(canvas);
        if (this.dax <= 0 || this.nac == null || this.qf.size() <= 0 || this.gm == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.dax / width;
        int i3 = 0;
        sf sfVar = this.qf.get(0);
        float f3 = sfVar.vj;
        int size = this.qf.size();
        int i4 = sfVar.sf;
        int i5 = this.qf.get(size - 1).sf;
        while (i4 < i5) {
            while (true) {
                i = sfVar.sf;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                sfVar = this.qf.get(i3);
            }
            if (i4 == i) {
                float f4 = sfVar.vj;
                float f5 = sfVar.oo;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                float pcc2 = this.gm.pcc(i4);
                f = (f3 + pcc2) * width;
                f3 = pcc2 + f2 + f3;
            }
            if (this.dax + f > scrollX) {
                i2 = scrollX;
                this.nac.setBounds(Math.round(f), this.lu, Math.round(this.dax + f), this.gpj);
                this.nac.draw(canvas);
            } else {
                i2 = scrollX;
            }
            if (f > i2 + r2) {
                return;
            }
            i4++;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            kj();
            return false;
        }
        if (action != 0) {
            if (this.mk) {
                return true;
            }
            if (this.atb) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.nn = x;
            this.pq = x;
            float y = motionEvent.getY();
            this.rnn = y;
            this.mu = y;
            this.tsx = motionEvent.getPointerId(0);
            this.atb = false;
            this.gbb = true;
            this.hc.computeScrollOffset();
            if (this.otd != 2 || Math.abs(this.hc.getFinalX() - this.hc.getCurrX()) <= this.xb) {
                pcc(false);
                this.mk = false;
            } else {
                this.hc.abortAnimation();
                this.jsj = false;
                gm();
                this.mk = true;
                gm(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.tsx;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.pq;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.rnn);
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !pcc(this.pq, f) && pcc(this, false, (int) f, (int) x2, (int) y2)) {
                    this.pq = x2;
                    this.mu = y2;
                    this.atb = true;
                    return false;
                }
                int i2 = this.zti;
                if (abs > i2 && abs * 0.5f > abs2) {
                    this.mk = true;
                    gm(true);
                    setScrollState(1);
                    float f2 = this.nn;
                    this.pq = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f2 + this.zti : f2 - this.zti;
                    this.mu = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i2) {
                    this.atb = true;
                }
                if (this.mk && sf(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            pcc(motionEvent);
        }
        VelocityTracker velocityTracker = this.kun;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.kun = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        return this.mk;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        sf pcc2;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0030gm c0030gm = (C0030gm) childAt.getLayoutParams();
                if (c0030gm.pcc) {
                    int i11 = c0030gm.sf;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    if (i12 != 1) {
                        if (i12 == 3) {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            i5 = paddingLeft;
                        } else {
                            max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i13 == 16) {
                            if (i13 == 48) {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i13 != 80) {
                                i6 = paddingTop;
                            } else {
                                max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i14 = paddingLeft + scrollX;
                            childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        } else {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i15 = max2;
                        i6 = paddingTop;
                        paddingTop = i15;
                        int i142 = paddingLeft + scrollX;
                        childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    } else {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i5 = paddingLeft;
                    paddingLeft = i16;
                    if (i13 == 16) {
                    }
                    int i152 = max2;
                    i6 = paddingTop;
                    paddingTop = i152;
                    int i1422 = paddingLeft + scrollX;
                    childAt.layout(i1422, paddingTop, childAt.getMeasuredWidth() + i1422, childAt.getMeasuredHeight() + paddingTop);
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        int i17 = (i7 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                C0030gm c0030gm2 = (C0030gm) childAt2.getLayoutParams();
                if (!c0030gm2.pcc && (pcc2 = pcc(childAt2)) != null) {
                    float f = i17;
                    int i19 = ((int) (pcc2.vj * f)) + paddingLeft;
                    if (c0030gm2.oo) {
                        c0030gm2.oo = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0030gm2.gm), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.lu = paddingTop;
        this.gpj = i8 - paddingBottom;
        this.se = i9;
        if (this.zsj) {
            z2 = false;
            pcc(this.oo, false, 0, false);
        } else {
            z2 = false;
        }
        this.zsj = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0030gm c0030gm;
        C0030gm c0030gm2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.lq = Math.min(measuredWidth / 10, this.ye);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c0030gm2 = (C0030gm) childAt.getLayoutParams()) != null && c0030gm2.pcc) {
                int i6 = c0030gm2.sf;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c0030gm2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c0030gm2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.tz = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.of = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.yt = true;
        gm();
        this.yt = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0030gm = (C0030gm) childAt2.getLayoutParams()) == null || !c0030gm.pcc)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0030gm.gm), 1073741824), this.of);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        sf pcc2;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (pcc2 = pcc(childAt)) != null && pcc2.sf == this.oo && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qf qfVar = (qf) parcelable;
        super.onRestoreInstanceState(qfVar.pcc());
        com.bytedance.adsdk.ugeno.kj.sf sfVar = this.gm;
        int i = qfVar.sf;
        if (sfVar != null) {
            pcc(i, false, true);
            return;
        }
        this.ork = i;
        this.vh = qfVar.gm;
        this.tmg = qfVar.oo;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        qf qfVar = new qf(super.onSaveInstanceState());
        qfVar.sf = this.oo;
        com.bytedance.adsdk.ugeno.kj.sf sfVar = this.gm;
        if (sfVar != null) {
            qfVar.gm = sfVar.sf();
        }
        return qfVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.dax;
            pcc(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.kj.sf sfVar;
        int findPointerIndex;
        if (this.ri) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (sfVar = this.gm) == null || sfVar.pcc() == 0) {
            return false;
        }
        VelocityTracker velocityTracker = this.kun;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.kun = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.hc.abortAnimation();
            this.jsj = false;
            gm();
            float x = motionEvent.getX();
            this.nn = x;
            this.pq = x;
            float y = motionEvent.getY();
            this.rnn = y;
            this.mu = y;
            this.tsx = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mk) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.tsx);
                    if (findPointerIndex2 == -1) {
                        z = kj();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex2);
                        float abs = Math.abs(x2 - this.pq);
                        float y2 = motionEvent.getY(findPointerIndex2);
                        float abs2 = Math.abs(y2 - this.mu);
                        if (abs > this.zti && abs > abs2) {
                            this.mk = true;
                            gm(true);
                            float f = this.nn;
                            float f2 = x2 - f;
                            int i = this.zti;
                            this.pq = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f + i : f - i;
                            this.mu = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mk && (findPointerIndex = motionEvent.findPointerIndex(this.tsx)) != -1) {
                    z = sf(motionEvent.getX(findPointerIndex));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex != -1) {
                        this.pq = motionEvent.getX(actionIndex);
                        this.tsx = motionEvent.getPointerId(actionIndex);
                    }
                } else if (action == 6) {
                    pcc(motionEvent);
                    int findPointerIndex3 = motionEvent.findPointerIndex(this.tsx);
                    if (findPointerIndex3 != -1) {
                        this.pq = motionEvent.getX(findPointerIndex3);
                    }
                }
            } else if (this.mk) {
                pcc(this.oo, true, 0, false);
                z = kj();
            }
        } else if (this.mk) {
            VelocityTracker velocityTracker2 = this.kun;
            velocityTracker2.computeCurrentVelocity(1000, this.lrr);
            int xVelocity = (int) velocityTracker2.getXVelocity(this.tsx);
            this.jsj = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            sf vy = vy();
            float f3 = clientWidth;
            int i2 = vy.sf;
            float f4 = ((scrollX / f3) - vy.vj) / (vy.oo + (this.dax / f3));
            int findPointerIndex4 = motionEvent.findPointerIndex(this.tsx);
            if (findPointerIndex4 != -1) {
                pcc(pcc(i2, f4, xVelocity, (int) (motionEvent.getX(findPointerIndex4) - this.nn)), true, true, xVelocity);
                z = kj();
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r9 == r10) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(int i) {
        sf sfVar;
        String hexString;
        sf sfVar2;
        sf pcc2;
        sf sfVar3;
        int i2 = this.oo;
        if (i2 != i) {
            sfVar = sf(i2);
            this.oo = i;
        } else {
            sfVar = null;
        }
        if (this.gm == null) {
            qf();
            return;
        }
        if (this.jsj) {
            qf();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.tsz;
        int max = Math.max(0, this.oo - i3);
        int pcc3 = this.gm.pcc();
        int min = Math.min(pcc3 - 1, this.oo + i3);
        if (pcc3 != this.pcc) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            me4.q(sb, this.pcc, ", found: ", pcc3, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            zzl.m(sb, this.gm.getClass());
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.qf.size()) {
                break;
            }
            sfVar2 = this.qf.get(i4);
            int i5 = sfVar2.sf;
            int i6 = this.oo;
            if (i5 < i6) {
                i4++;
            }
        }
        sfVar2 = null;
        if (sfVar2 == null && pcc3 > 0) {
            sfVar2 = pcc(this.oo, i4);
        }
        if (sfVar2 != null) {
            int i7 = i4 - 1;
            sf sfVar4 = i7 >= 0 ? this.qf.get(i7) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - sfVar2.oo);
            float f = 0.0f;
            for (int i8 = this.oo - 1; i8 >= 0; i8--) {
                if (f >= paddingLeft && i8 < max) {
                    if (sfVar4 == null) {
                        break;
                    }
                    if (i8 == sfVar4.sf && !sfVar4.gm) {
                        this.qf.remove(i7);
                        this.gm.pcc((ViewGroup) this, i8, sfVar4.pcc);
                        i7--;
                        i4--;
                        if (i7 >= 0) {
                            sfVar3 = this.qf.get(i7);
                            sfVar4 = sfVar3;
                        }
                        sfVar3 = null;
                        sfVar4 = sfVar3;
                    }
                } else if (sfVar4 == null || i8 != sfVar4.sf) {
                    f += pcc(i8, i7 + 1).oo;
                    i4++;
                    if (i7 >= 0) {
                        sfVar3 = this.qf.get(i7);
                        sfVar4 = sfVar3;
                    }
                    sfVar3 = null;
                    sfVar4 = sfVar3;
                } else {
                    f += sfVar4.oo;
                    i7--;
                    if (i7 >= 0) {
                        sfVar3 = this.qf.get(i7);
                        sfVar4 = sfVar3;
                    }
                    sfVar3 = null;
                    sfVar4 = sfVar3;
                }
            }
            float f2 = sfVar2.oo;
            int i9 = i4 + 1;
            if (f2 < 2.0f) {
                sf sfVar5 = i9 < this.qf.size() ? this.qf.get(i9) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i10 = this.oo;
                while (true) {
                    i10++;
                    if (i10 >= pcc3) {
                        break;
                    }
                    if (f2 >= paddingRight && i10 > min) {
                        if (sfVar5 == null) {
                            break;
                        }
                        if (i10 == sfVar5.sf && !sfVar5.gm) {
                            this.qf.remove(i9);
                            this.gm.pcc((ViewGroup) this, i10, sfVar5.pcc);
                            if (i9 < this.qf.size()) {
                                sfVar5 = this.qf.get(i9);
                            }
                        }
                    } else if (sfVar5 == null || i10 != sfVar5.sf) {
                        sf pcc4 = pcc(i10, i9);
                        i9++;
                        f2 += pcc4.oo;
                        sfVar5 = i9 < this.qf.size() ? this.qf.get(i9) : null;
                    } else {
                        f2 += sfVar5.oo;
                        i9++;
                        if (i9 < this.qf.size()) {
                            sfVar5 = this.qf.get(i9);
                        }
                    }
                }
            }
            pcc(sfVar2, i4, sfVar);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0030gm c0030gm = (C0030gm) childAt.getLayoutParams();
            c0030gm.wh = i11;
            if (!c0030gm.pcc && c0030gm.gm == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (pcc2 = pcc(childAt)) != null) {
                c0030gm.gm = pcc2.oo;
                c0030gm.vj = pcc2.sf;
            }
        }
        qf();
        if (hasFocus()) {
            View findFocus = findFocus();
            sf sf2 = findFocus != null ? sf(findFocus) : null;
            if (sf2 == null || sf2.sf != this.oo) {
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt2 = getChildAt(i12);
                    sf pcc5 = pcc(childAt2);
                    if (pcc5 != null && pcc5.sf == this.oo && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.yt) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.kj.sf sfVar) {
        ArrayList<sf> arrayList;
        com.bytedance.adsdk.ugeno.kj.sf sfVar2 = this.gm;
        if (sfVar2 != null) {
            sfVar2.pcc((DataSetObserver) null);
            int i = 0;
            while (true) {
                int size = this.qf.size();
                arrayList = this.qf;
                if (i >= size) {
                    break;
                }
                sf sfVar3 = arrayList.get(i);
                this.gm.pcc((ViewGroup) this, sfVar3.sf, sfVar3.pcc);
                i++;
            }
            arrayList.clear();
            wh();
            this.oo = 0;
            scrollTo(0, 0);
        }
        this.gm = sfVar;
        this.pcc = 0;
        if (sfVar != null) {
            wh whVar = this.jr;
            if (whVar == null) {
                whVar = new wh();
                this.jr = whVar;
            }
            this.gm.pcc((DataSetObserver) whVar);
            this.jsj = false;
            boolean z = this.zsj;
            this.zsj = true;
            this.pcc = this.gm.pcc();
            int i2 = this.ork;
            if (i2 >= 0) {
                pcc(i2, false, true);
                this.ork = -1;
                this.vh = null;
                this.tmg = null;
            } else if (z) {
                requestLayout();
            } else {
                gm();
            }
        }
        List<Object> list = this.vr;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size2 = this.vr.size();
        for (int i3 = 0; i3 < size2; i3++) {
            this.vr.get(i3);
        }
    }

    public void setCurrentItem(int i) {
        this.jsj = false;
        pcc(i, !this.zsj, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.tsz) {
            this.tsz = i;
            gm();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(oo ooVar) {
        this.hoh = ooVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.dax;
        this.dax = i;
        int width = getWidth();
        pcc(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.nac = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.otd == i) {
            return;
        }
        this.otd = i;
        if (this.bg != null) {
            sf(i != 0);
        }
        wh(i);
    }

    public void setScroller(Scroller scroller) {
        this.hc = scroller;
    }

    public void sf() {
        ArrayList<sf> arrayList;
        int pcc2 = this.gm.pcc();
        this.pcc = pcc2;
        boolean z = this.qf.size() < (this.tsz * 2) + 1 && this.qf.size() < pcc2;
        int i = this.oo;
        int i2 = 0;
        while (true) {
            int size = this.qf.size();
            arrayList = this.qf;
            if (i2 >= size) {
                break;
            }
            sf sfVar = arrayList.get(i2);
            int pcc3 = this.gm.pcc(sfVar.pcc);
            if (pcc3 != -1) {
                if (pcc3 == -2) {
                    this.qf.remove(i2);
                    i2--;
                    this.gm.pcc((ViewGroup) this, sfVar.sf, sfVar.pcc);
                    int i3 = this.oo;
                    if (i3 == sfVar.sf) {
                        i = Math.max(0, Math.min(i3, pcc2 - 1));
                    }
                } else {
                    int i4 = sfVar.sf;
                    if (i4 != pcc3) {
                        if (i4 == this.oo) {
                            i = pcc3;
                        }
                        sfVar.sf = pcc3;
                    }
                }
                z = true;
            }
            i2++;
        }
        Collections.sort(arrayList, vj);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0030gm c0030gm = (C0030gm) getChildAt(i5).getLayoutParams();
                if (!c0030gm.pcc) {
                    c0030gm.gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            pcc(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.nac;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.kj.gm$gm, reason: collision with other inner class name */
    public static class C0030gm extends ViewGroup.LayoutParams {
        float gm;
        boolean oo;
        public boolean pcc;
        public int sf;
        int vj;
        int wh;

        public C0030gm(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gm.sf);
            this.sf = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }

        public C0030gm() {
            super(-1, -1);
            this.gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class qf extends com.bytedance.adsdk.ugeno.kj.pcc {
        public static final Parcelable.Creator<qf> CREATOR = new Parcelable.ClassLoaderCreator<qf>() { // from class: com.bytedance.adsdk.ugeno.kj.gm.qf.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public qf createFromParcel(Parcel parcel) {
                return new qf(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public qf createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new qf(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public qf[] newArray(int i) {
                return new qf[i];
            }
        };
        Parcelable gm;
        ClassLoader oo;
        int sf;

        public qf(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.sf = parcel.readInt();
            this.gm = parcel.readParcelable(classLoader);
            this.oo = classLoader;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return fc6.h(this.sf, "}", sb);
        }

        @Override // com.bytedance.adsdk.ugeno.kj.pcc, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.sf);
            parcel.writeParcelable(this.gm, i);
        }

        public qf(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void wh() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0030gm) getChildAt(i).getLayoutParams()).pcc) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public boolean vj() {
        com.bytedance.adsdk.ugeno.kj.sf sfVar = this.gm;
        if (sfVar == null || this.oo >= sfVar.pcc() - 1) {
            return false;
        }
        pcc(this.oo + 1, true);
        return true;
    }

    public boolean oo() {
        int i = this.oo;
        if (i <= 0) {
            return false;
        }
        pcc(i - 1, true);
        return true;
    }

    public void sf(oo ooVar) {
        List<oo> list = this.ptr;
        if (list != null) {
            list.remove(ooVar);
        }
    }

    public sf sf(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return pcc(view);
            }
        }
    }

    public sf sf(int i) {
        for (int i2 = 0; i2 < this.qf.size(); i2++) {
            sf sfVar = this.qf.get(i2);
            if (sfVar.sf == i) {
                return sfVar;
            }
        }
        return null;
    }

    private void sf(int i, float f, int i2) {
        oo ooVar = this.hoh;
        if (ooVar != null) {
            ooVar.pcc(i, f, i2);
        }
        List<oo> list = this.ptr;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                oo ooVar2 = this.ptr.get(i3);
                if (ooVar2 != null) {
                    ooVar2.pcc(i, f, i2);
                }
            }
        }
        oo ooVar3 = this.qcw;
        if (ooVar3 != null) {
            ooVar3.pcc(i, f, i2);
        }
    }

    private void sf(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.kz : 0, null);
        }
    }

    private static boolean gm(View view) {
        return view.getClass().getAnnotation(pcc.class) != null;
    }

    private boolean sf(float f) {
        boolean z;
        boolean z2;
        float f2 = this.pq - f;
        this.pq = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.lo * clientWidth;
        float f4 = this.fum * clientWidth;
        boolean z3 = false;
        sf sfVar = this.qf.get(0);
        sf sfVar2 = (sf) mz1.h(this.qf, 1);
        if (sfVar.sf != 0) {
            f3 = sfVar.vj * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (sfVar2.sf != this.gm.pcc() - 1) {
            f4 = sfVar2.vj * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.hpk.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.fmh.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.pq = (scrollX - i) + this.pq;
        scrollTo(i, getScrollY());
        oo(i);
        return z3;
    }

    private void gm(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void gm() {
        pcc(this.oo);
    }

    public void pcc(int i, boolean z) {
        this.jsj = false;
        pcc(i, z, false);
    }

    public void pcc(int i, boolean z, boolean z2) {
        pcc(i, z, z2, 0);
    }

    public void pcc(int i, boolean z, boolean z2, int i2) {
        com.bytedance.adsdk.ugeno.kj.sf sfVar = this.gm;
        if (sfVar != null && sfVar.pcc() > 0) {
            if (!z2 && this.oo == i && this.qf.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.gm.pcc()) {
                i = this.gm.pcc() - 1;
            }
            int i3 = this.tsz;
            int i4 = this.oo;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.qf.size(); i5++) {
                    this.qf.get(i5).gm = true;
                }
            }
            boolean z3 = this.oo != i;
            if (this.zsj) {
                this.oo = i;
                if (z3) {
                    vj(i);
                }
                requestLayout();
                return;
            }
            pcc(i);
            pcc(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    private void pcc(int i, boolean z, int i2, boolean z2) {
        int i3;
        sf sf2 = sf(i);
        if (sf2 != null) {
            i3 = (int) (Math.max(this.lo, Math.min(sf2.vj, this.fum)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            pcc(i3, 0, i2);
            if (z2) {
                vj(i);
                return;
            }
            return;
        }
        if (z2) {
            vj(i);
        }
        pcc(false);
        scrollTo(i3, 0);
        oo(i3);
    }

    public void pcc(oo ooVar) {
        List list = this.ptr;
        if (list == null) {
            list = new ArrayList();
            this.ptr = list;
        }
        list.add(ooVar);
    }

    public void pcc(boolean z, vj vjVar) {
        pcc(z, vjVar, 2);
    }

    public void pcc(boolean z, vj vjVar, int i) {
        boolean z2 = vjVar != null;
        boolean z3 = z2 != (this.bg != null);
        this.bg = vjVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.ew = z ? 2 : 1;
            this.kz = i;
        } else {
            this.ew = 0;
        }
        if (z3) {
            gm();
        }
    }

    public float pcc(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public void pcc(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.hc;
        if (scroller != null && !scroller.isFinished()) {
            boolean z = this.gbb;
            Scroller scroller2 = this.hc;
            scrollX = z ? scroller2.getCurrX() : scroller2.getStartX();
            this.hc.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            pcc(false);
            gm();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float pcc2 = (pcc(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2) + f2;
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(pcc2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((this.gm.pcc(this.oo) * f) + this.dax)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.gbb = false;
        this.hc.startScroll(i4, scrollY, i5, i6, min);
        postInvalidateOnAnimation();
    }

    public sf pcc(int i, int i2) {
        sf sfVar = new sf();
        sfVar.sf = i;
        sfVar.pcc = this.gm.pcc((ViewGroup) this, i);
        sfVar.oo = this.gm.pcc(i);
        if (i2 >= 0 && i2 < this.qf.size()) {
            this.qf.add(i2, sfVar);
            return sfVar;
        }
        this.qf.add(sfVar);
        return sfVar;
    }

    public void pcc() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.hc = new Scroller(context, wh);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.zti = viewConfiguration.getScaledPagingTouchSlop();
        this.rj = (int) (400.0f * f);
        this.lrr = viewConfiguration.getScaledMaximumFlingVelocity();
        this.hpk = new EdgeEffect(context);
        this.fmh = new EdgeEffect(context);
        this.iv = (int) (25.0f * f);
        this.xb = (int) (2.0f * f);
        this.ye = (int) (f * 16.0f);
    }

    private void pcc(sf sfVar, int i, sf sfVar2) {
        int i2;
        int i3;
        sf sfVar3;
        sf sfVar4;
        int pcc2 = this.gm.pcc();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.dax / clientWidth : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (sfVar2 != null) {
            int i4 = sfVar2.sf;
            int i5 = sfVar.sf;
            if (i4 < i5) {
                float f2 = sfVar2.vj + sfVar2.oo + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= sfVar.sf && i7 < this.qf.size()) {
                    sf sfVar5 = this.qf.get(i7);
                    while (true) {
                        sfVar4 = sfVar5;
                        if (i6 <= sfVar4.sf || i7 >= this.qf.size() - 1) {
                            break;
                        }
                        i7++;
                        sfVar5 = this.qf.get(i7);
                    }
                    while (i6 < sfVar4.sf) {
                        f2 += this.gm.pcc(i6) + f;
                        i6++;
                    }
                    sfVar4.vj = f2;
                    f2 += sfVar4.oo + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.qf.size() - 1;
                float f3 = sfVar2.vj;
                while (true) {
                    i4--;
                    if (i4 < sfVar.sf || size < 0) {
                        break;
                    }
                    sf sfVar6 = this.qf.get(size);
                    while (true) {
                        sfVar3 = sfVar6;
                        if (i4 >= sfVar3.sf || size <= 0) {
                            break;
                        }
                        size--;
                        sfVar6 = this.qf.get(size);
                    }
                    while (i4 > sfVar3.sf) {
                        f3 -= this.gm.pcc(i4) + f;
                        i4--;
                    }
                    f3 -= sfVar3.oo + f;
                    sfVar3.vj = f3;
                }
            }
        }
        int size2 = this.qf.size();
        float f4 = sfVar.vj;
        int i8 = sfVar.sf;
        int i9 = i8 - 1;
        this.lo = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = pcc2 - 1;
        this.fum = i8 == i10 ? (sfVar.oo + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            sf sfVar7 = this.qf.get(i11);
            while (true) {
                i3 = sfVar7.sf;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.gm.pcc(i9) + f;
                i9--;
            }
            f4 -= sfVar7.oo + f;
            sfVar7.vj = f4;
            if (i3 == 0) {
                this.lo = f4;
            }
            i11--;
            i9--;
        }
        float f5 = sfVar.vj + sfVar.oo + f;
        int i12 = sfVar.sf + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            sf sfVar8 = this.qf.get(i13);
            while (true) {
                i2 = sfVar8.sf;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.gm.pcc(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.fum = (sfVar8.oo + f5) - 1.0f;
            }
            sfVar8.vj = f5;
            f5 += sfVar8.oo + f;
            i13++;
            i12++;
        }
        this.gd = false;
    }

    public sf pcc(View view) {
        for (int i = 0; i < this.qf.size(); i++) {
            sf sfVar = this.qf.get(i);
            if (this.gm.pcc(view, sfVar.pcc)) {
                return sfVar;
            }
        }
        return null;
    }

    private void pcc(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.qf.isEmpty()) {
            if (!this.hc.isFinished()) {
                this.hc.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        sf sf2 = sf(this.oo);
        int min = (int) ((sf2 != null ? Math.min(sf2.vj, this.fum) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            pcc(false);
            scrollTo(min, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.se > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C0030gm c0030gm = (C0030gm) childAt.getLayoutParams();
                if (c0030gm.pcc) {
                    int i5 = c0030gm.sf & 7;
                    if (i5 == 1) {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        sf(i, f, i2);
        if (this.bg != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C0030gm) childAt2.getLayoutParams()).pcc) {
                    this.bg.pcc(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.erj = true;
    }

    private void pcc(boolean z) {
        boolean z2 = this.otd == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.hc.isFinished()) {
                this.hc.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.hc.getCurrX();
                int currY = this.hc.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        oo(currX);
                    }
                }
            }
        }
        this.jsj = false;
        for (int i = 0; i < this.qf.size(); i++) {
            sf sfVar = this.qf.get(i);
            if (sfVar.gm) {
                sfVar.gm = false;
                z2 = true;
            }
        }
        if (z2) {
            Runnable runnable = this.gdh;
            if (z) {
                postOnAnimation(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private boolean pcc(float f, float f2) {
        if (f >= this.lq || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f > ((float) (getWidth() - this.lq)) && f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    private int pcc(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.iv || Math.abs(i2) <= this.rj) {
            i += (int) (f + (i >= this.oo ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.qf.size() > 0) {
            return Math.max(this.qf.get(0).sf, Math.min(i, ((sf) mz1.h(this.qf, 1)).sf));
        }
        return i;
    }

    private void pcc(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.tsx) {
            int i = actionIndex == 0 ? 1 : 0;
            this.pq = motionEvent.getX(i);
            this.tsx = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.kun;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean pcc(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && pcc(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public boolean pcc(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return oo();
            }
            return gm(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return vj();
            }
            return gm(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return gm(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return gm(1);
        }
        return false;
    }

    private Rect pcc(Rect rect, View view) {
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
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
