package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.movika.tools.controls.seekbar.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.an10;
import xsna.e43;
import xsna.epx;
import xsna.msy;
import xsna.qcy;
import xsna.rl3;
import xsna.swe0;
import xsna.x9;

/* loaded from: classes3.dex */
public class DefaultSeekBarView extends FrameLayout implements y {
    public final com.vk.movika.sdk.android.defaultplayer.utils.c A;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c B;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c C;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c D;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c E;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c F;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c G;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c H;
    public Object I;
    public final x J;
    public boolean K;
    public long L;
    public final a0 b;
    public a0 c;
    public final int[] d;
    public final TreeSet<a0> e;
    public final Path f;
    public final Paint g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public final b m;
    public final Object n;
    public final Object o;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c p;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c q;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c r;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c s;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c t;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c u;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c v;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c w;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c x;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c y;
    public final com.vk.movika.sdk.android.defaultplayer.utils.c z;
    public static final /* synthetic */ qcy<Object>[] M = {defpackage.b.a("activeThumbSize", "getActiveThumbSize()F"), defpackage.b.a("nonActiveThumbSize", "getNonActiveThumbSize()F"), defpackage.b.a("isThumbEnabled", "isThumbEnabled()Z"), defpackage.b.a("seekIsEnabledAlpha", "getSeekIsEnabledAlpha()I"), defpackage.b.a("seekIsDisabledAlpha", "getSeekIsDisabledAlpha()I"), defpackage.b.a("isSeekEnabled", "isSeekEnabled()Z"), defpackage.b.a("thumbColor", "getThumbColor()Ljava/lang/String;"), defpackage.b.a("corner", "getCorner()F"), defpackage.b.a("segmentsMargin", "getSegmentsMargin()F"), defpackage.b.a("seekBarCurrentColor", "getSeekBarCurrentColor()Ljava/lang/String;"), defpackage.b.a("seekBarSecondColor", "getSeekBarSecondColor()Ljava/lang/String;"), defpackage.b.a("seekBarBackgroundColor", "getSeekBarBackgroundColor()Ljava/lang/String;"), defpackage.b.a("seekBarWidth", "getSeekBarWidth()F"), defpackage.b.a("seekBarActiveWidth", "getSeekBarActiveWidth()F"), defpackage.b.a("internalCurrent", "getInternalCurrent()J"), defpackage.b.a("second", "getSecond()J"), defpackage.b.a("maxCurrent", "getMaxCurrent()J"), defpackage.b.a("maxSeek", "getMaxSeek()Ljava/lang/Long;"), defpackage.b.a("minSeek", "getMinSeek()Ljava/lang/Long;"), defpackage.b.a("isPointerDown", "isPointerDown()Z")};
    public static final a Companion = new a();
    public static final Object N = msy.a(LazyThreadSafetyMode.NONE, new n(0));

    public static final class a {
    }

    public final class b implements View.OnTouchListener {
        public float b;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r1 != 3) goto L79;
         */
        /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Iterable, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Iterable, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Iterable, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.Collection] */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            DefaultSeekBarView defaultSeekBarView = DefaultSeekBarView.this;
            com.vk.movika.sdk.android.defaultplayer.utils.c cVar = defaultSeekBarView.u;
            qcy<Object> qcyVar = DefaultSeekBarView.M[5];
            if (!((Boolean) cVar.b).booleanValue()) {
                return false;
            }
            if (motionEvent.getPointerCount() > 1) {
                return true;
            }
            DefaultSeekBarView.Companion.getClass();
            if (!rl3.G((Integer[]) DefaultSeekBarView.N.getValue(), Integer.valueOf(motionEvent.getAction()))) {
                defaultSeekBarView.setPointerDown(false);
                defaultSeekBarView.K = false;
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (!defaultSeekBarView.K) {
                            return !defaultSeekBarView.I.isEmpty();
                        }
                        long b = defaultSeekBarView.b(motionEvent);
                        Long minSeek = defaultSeekBarView.getMinSeek();
                        boolean z = b < (minSeek != null ? minSeek.longValue() : Long.MIN_VALUE);
                        Long maxSeek = defaultSeekBarView.getMaxSeek();
                        boolean z2 = b > (maxSeek != null ? maxSeek.longValue() : Long.MAX_VALUE);
                        ?? r5 = defaultSeekBarView.I;
                        if (z) {
                            Iterator it = r5.iterator();
                            while (it.hasNext()) {
                                ((y.a) it.next()).getClass();
                            }
                        } else if (z2) {
                            Iterator it2 = r5.iterator();
                            while (it2.hasNext()) {
                                ((y.a) it2.next()).getClass();
                            }
                        }
                        if (!z && !z2) {
                            Iterator it3 = defaultSeekBarView.I.iterator();
                            boolean z3 = true;
                            while (it3.hasNext()) {
                                z3 &= ((y.a) it3.next()).b(defaultSeekBarView, b, true);
                            }
                            if (z3) {
                                defaultSeekBarView.setInternalCurrent(b);
                            }
                        }
                        Iterator it4 = defaultSeekBarView.I.iterator();
                        while (it4.hasNext()) {
                            ((y.a) it4.next()).c(motionEvent.getRawY() - this.b);
                        }
                    }
                }
                defaultSeekBarView.j(motionEvent);
            } else if (!defaultSeekBarView.K) {
                this.b = motionEvent.getRawY();
                long b2 = !defaultSeekBarView.I.isEmpty() ? defaultSeekBarView.b(motionEvent) : 0L;
                Iterator it5 = defaultSeekBarView.I.iterator();
                boolean z4 = true;
                while (it5.hasNext()) {
                    z4 &= ((y.a) it5.next()).d(defaultSeekBarView, b2);
                }
                if (!z4) {
                    return !defaultSeekBarView.I.isEmpty();
                }
                defaultSeekBarView.K = true;
                defaultSeekBarView.setPointerDown(true);
                defaultSeekBarView.L = defaultSeekBarView.getInternalCurrent();
                defaultSeekBarView.setInternalCurrent(b2);
            }
            return !defaultSeekBarView.I.isEmpty();
        }
    }

    public DefaultSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new a0(0L);
        this.c = new a0(0L);
        this.d = new int[2];
        this.e = new TreeSet<>(new e(0, new o(0)));
        this.f = new Path();
        this.g = x9.c(true);
        this.m = new b();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        int i = 0;
        this.n = msy.a(lazyThreadSafetyMode, new f(i, context, this));
        this.o = msy.a(lazyThreadSafetyMode, new g(i, context, this));
        int i2 = 0;
        this.p = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Float.valueOf(com.vk.movika.sdk.android.utils.a.a(this, 16.0f)), new h(this, i2), 2);
        this.q = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Float.valueOf(com.vk.movika.sdk.android.utils.a.a(this, 12.0f)), new i(this, i2), 2);
        Boolean bool = Boolean.TRUE;
        this.r = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, bool, new j(this, i2), 2);
        this.s = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, 255, new k(this, i), 2);
        this.t = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, 102, new l(this, i), 2);
        this.u = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, bool, new m(this, 0), 2);
        this.v = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#FFFFFF", new p(this, 0), 6);
        this.w = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Float.valueOf(com.vk.movika.sdk.android.utils.a.a(this, 1.5f)), null, 14);
        int i3 = 0;
        this.x = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Float.valueOf(com.vk.movika.sdk.android.utils.a.a(this, 2.0f)), new q(this, i3), 2);
        this.y = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#528BCC", new r(this, 0), 6);
        this.z = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#3DFFFFFF", new s(this, 0), 6);
        this.A = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, "#1FFFFFFF", new t(this, 0), 6);
        this.B = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Float.valueOf(com.vk.movika.sdk.android.utils.a.a(this, 3.0f)), new u(this, i3), 2);
        this.C = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, Float.valueOf(com.vk.movika.sdk.android.utils.a.a(this, 5.0f)), null, 14);
        this.D = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, 0L, new v(this, 0), 2);
        this.E = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, 0L, null, 14);
        this.F = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, 100L, new w(this, 0), 6);
        this.G = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, null, null, 14);
        this.H = com.vk.movika.sdk.android.defaultplayer.utils.d.d(this, null, null, 14);
        this.I = EmptyList.b;
        this.J = new x(this);
        setWillNotDraw(false);
        e(getSeekIsDisabledAlpha(), getSeekIsEnabledAlpha());
        l();
    }

    public static final FrameLayout d(Context context, DefaultSeekBarView defaultSeekBarView) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(defaultSeekBarView.getThumbView(), -2, -2);
        frameLayout.setOnTouchListener(defaultSeekBarView.m);
        frameLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getInternalCurrent() {
        qcy<Object> qcyVar = M[14];
        return ((Number) this.D.b).longValue();
    }

    private final float getOriginY() {
        return (Math.max(Math.max(getActiveThumbSize(), getSeekBarWidth()), getSeekBarActiveWidth()) / 2.0f) + getPaddingTop();
    }

    private final float getThumbCenterX() {
        return (getActiveThumbSize() / 2.0f) + ((((getWidth() - getPaddingStart()) - getPaddingEnd()) - (getActiveThumbSize() / 2.0f)) * (getInternalCurrent() / getMaxCurrent())) + getPaddingStart();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getThumbLayout() {
        return (FrameLayout) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageView getThumbView() {
        return (ImageView) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInternalCurrent(long j) {
        qcy<Object> qcyVar = M[14];
        this.D.c(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPointerDown(boolean z) {
        this.J.setValue(this, M[19], Boolean.valueOf(z));
    }

    public final float a(long j) {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        long maxCurrent = getMaxCurrent();
        if (j > maxCurrent) {
            j = maxCurrent;
        }
        return ((j / getMaxCurrent()) * width) + getPaddingStart();
    }

    public final long b(MotionEvent motionEvent) {
        float x = (((motionEvent.getX() - getPaddingStart()) - (getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r0).getMarginStart() : 0)) / ((getWidth() - getPaddingStart()) - getPaddingEnd())) * getMaxCurrent();
        Float valueOf = Float.valueOf(x);
        if (Float.isNaN(x)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return swe0.i(an10.c(valueOf.floatValue()), 0L, getMaxCurrent());
        }
        return 0L;
    }

    public final void e(int i, int i2) {
        qcy<Object> qcyVar = M[5];
        setAlpha((((Boolean) this.u.b).booleanValue() ? i2 : i) / 255.0f);
    }

    public float getActiveThumbSize() {
        qcy<Object> qcyVar = M[0];
        return ((Number) this.p.b).floatValue();
    }

    public float getCorner() {
        qcy<Object> qcyVar = M[7];
        return ((Number) this.w.b).floatValue();
    }

    public long getCurrent() {
        return k() ? this.L : getInternalCurrent();
    }

    @Override // com.vk.movika.tools.controls.seekbar.y
    public long getMaxCurrent() {
        qcy<Object> qcyVar = M[16];
        return ((Number) this.F.b).longValue();
    }

    public Long getMaxSeek() {
        qcy<Object> qcyVar = M[17];
        return (Long) this.G.b;
    }

    public Long getMinSeek() {
        qcy<Object> qcyVar = M[18];
        return (Long) this.H.b;
    }

    public float getNonActiveThumbSize() {
        qcy<Object> qcyVar = M[1];
        return ((Number) this.q.b).floatValue();
    }

    public Collection<a0> getPoints() {
        return this.e;
    }

    public long getSecond() {
        qcy<Object> qcyVar = M[15];
        return ((Number) this.E.b).longValue();
    }

    public float getSeekBarActiveWidth() {
        qcy<Object> qcyVar = M[13];
        return ((Number) this.C.b).floatValue();
    }

    public String getSeekBarBackgroundColor() {
        qcy<Object> qcyVar = M[11];
        return (String) this.A.b;
    }

    public String getSeekBarCurrentColor() {
        qcy<Object> qcyVar = M[9];
        return (String) this.y.b;
    }

    public String getSeekBarSecondColor() {
        qcy<Object> qcyVar = M[10];
        return (String) this.z.b;
    }

    public float getSeekBarWidth() {
        qcy<Object> qcyVar = M[12];
        return ((Number) this.B.b).floatValue();
    }

    public int getSeekIsDisabledAlpha() {
        qcy<Object> qcyVar = M[4];
        return ((Number) this.t.b).intValue();
    }

    public int getSeekIsEnabledAlpha() {
        qcy<Object> qcyVar = M[3];
        return ((Number) this.s.b).intValue();
    }

    public float getSegmentsMargin() {
        qcy<Object> qcyVar = M[8];
        return ((Number) this.x.b).floatValue();
    }

    public View getThumb() {
        return getThumbLayout();
    }

    public String getThumbColor() {
        qcy<Object> qcyVar = M[6];
        return (String) this.v.b;
    }

    public final void h(Float f) {
        int b2;
        if (this.l) {
            qcy<Object> qcyVar = M[2];
            if (((Boolean) this.r.b).booleanValue()) {
                b2 = an10.b(f != null ? f.floatValue() : k() ? getActiveThumbSize() : getNonActiveThumbSize());
            } else {
                b2 = 0;
            }
            ImageView thumbView = getThumbView();
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.setIntrinsicWidth(b2);
            shapeDrawable.setIntrinsicHeight(b2);
            shapeDrawable.getPaint().setColor(this.k);
            thumbView.setImageDrawable(shapeDrawable);
        }
    }

    public final void i() {
        ViewGroup viewGroup = this;
        while (true) {
            ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof ViewGroup)) {
                viewGroup.addView(getThumbLayout(), new ViewGroup.LayoutParams(-1, an10.b(TypedValue.applyDimension(1, 40, getContext().getResources().getDisplayMetrics()))));
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.vk.movika.tools.controls.seekbar.d
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                        DefaultSeekBarView defaultSeekBarView = DefaultSeekBarView.this;
                        defaultSeekBarView.h(null);
                        defaultSeekBarView.m();
                    }
                });
                return;
            }
            viewGroup = (ViewGroup) parent;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void j(MotionEvent motionEvent) {
        boolean z;
        setPointerDown(false);
        Long valueOf = motionEvent != null ? Long.valueOf(!this.I.isEmpty() ? b(motionEvent) : 0L) : null;
        boolean z2 = true;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            z = true;
            for (y.a aVar : this.I) {
                getInternalCurrent();
                z &= aVar.a(this, longValue);
            }
        } else {
            z = false;
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            z2 &= ((y.a) it.next()).e(getInternalCurrent(), valueOf != null ? valueOf.longValue() : getInternalCurrent());
        }
        if (this.K) {
            this.K = false;
            if (z && z2) {
                return;
            }
            setInternalCurrent(this.L);
        }
    }

    public final boolean k() {
        return ((Boolean) this.J.getValue(this, M[19])).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        int i;
        boolean z;
        int i2;
        float f;
        float segmentsMargin;
        this.f.reset();
        TreeSet<a0> treeSet = this.e;
        int i3 = 1;
        int size = treeSet.size() + 1;
        float originY = getOriginY();
        float seekBarWidth = originY - (getSeekBarWidth() / 2.0f);
        float seekBarActiveWidth = k() ? originY - (getSeekBarActiveWidth() / 2.0f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        a0 a0Var = this.c;
        a0 a0Var2 = this.b;
        if (a0Var2 != null) {
            i = 1;
        } else {
            a0Var2 = null;
            i = 0;
        }
        int i4 = 0;
        for (Object obj : treeSet) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            int i6 = i + 1;
            a0 a0Var3 = (a0) obj;
            Long valueOf = a0Var2 != null ? Long.valueOf(a0Var2.a) : null;
            if (valueOf == null) {
                f = seekBarActiveWidth;
            } else {
                if (k()) {
                    long j = a0Var3.a;
                    long internalCurrent = getInternalCurrent();
                    if (valueOf.longValue() <= internalCurrent && internalCurrent <= j) {
                        i2 = i3;
                        float seekBarWidth2 = (i2 != 0 || this.l) ? getSeekBarWidth() : getSeekBarActiveWidth();
                        if (i != i3) {
                            segmentsMargin = getPaddingStart();
                            f = seekBarActiveWidth;
                        } else {
                            f = seekBarActiveWidth;
                            segmentsMargin = (getSegmentsMargin() / 2.0f) + a(valueOf.longValue());
                        }
                        float f2 = segmentsMargin;
                        float width = i != size ? getWidth() - getPaddingEnd() : a(a0Var3.a) - (getSegmentsMargin() / 2.0f);
                        float f3 = (i2 != 0 || this.l) ? seekBarWidth : f;
                        float f4 = f3 + seekBarWidth2;
                        if (this.l) {
                            this.f.addRoundRect(f2, f3, width, f4, getCorner(), getCorner(), Path.Direction.CW);
                        } else {
                            this.f.addRect(f2, f3, width, f4, Path.Direction.CW);
                        }
                    }
                }
                i2 = 0;
                if (i2 != 0) {
                }
                if (i != i3) {
                }
                float f22 = segmentsMargin;
                float width2 = i != size ? getWidth() - getPaddingEnd() : a(a0Var3.a) - (getSegmentsMargin() / 2.0f);
                if (i2 != 0) {
                }
                float f42 = f3 + seekBarWidth2;
                if (this.l) {
                }
            }
            i = i6;
            a0Var2 = a0Var3;
            i4 = i5;
            seekBarActiveWidth = f;
            i3 = 1;
        }
        float f5 = seekBarActiveWidth;
        if (a0Var == null) {
            return;
        }
        long j2 = a0Var.a;
        Long valueOf2 = a0Var2 != null ? Long.valueOf(a0Var2.a) : null;
        if (valueOf2 == null) {
            return;
        }
        if (k()) {
            long internalCurrent2 = getInternalCurrent();
            if (valueOf2.longValue() <= internalCurrent2 && internalCurrent2 <= j2) {
                z = true;
                float seekBarWidth3 = (z || this.l) ? getSeekBarWidth() : getSeekBarActiveWidth();
                float paddingStart = i != 1 ? getPaddingStart() : a(valueOf2.longValue()) + (getSegmentsMargin() / 2.0f);
                float width3 = i != size ? getWidth() - getPaddingEnd() : a(j2) - (getSegmentsMargin() / 2.0f);
                float f6 = (z || this.l) ? seekBarWidth : f5;
                if (this.l) {
                    this.f.addRoundRect(paddingStart, f6, width3, f6 + seekBarWidth3, getCorner(), getCorner(), Path.Direction.CW);
                    return;
                } else {
                    this.f.addRect(paddingStart, f6, width3, f6 + seekBarWidth3, Path.Direction.CW);
                    return;
                }
            }
        }
        z = false;
        if (z) {
        }
        float paddingStart2 = i != 1 ? getPaddingStart() : a(valueOf2.longValue()) + (getSegmentsMargin() / 2.0f);
        float width32 = i != size ? getWidth() - getPaddingEnd() : a(j2) - (getSegmentsMargin() / 2.0f);
        if (z) {
        }
        if (this.l) {
        }
    }

    public final void m() {
        if (getMaxCurrent() == 0 || !this.l) {
            return;
        }
        getLocationOnScreen(this.d);
        getThumbLayout().setTranslationY((r0[1] + getOriginY()) - (getThumbView().getDrawable().getIntrinsicHeight() / 2.0f));
        getThumbView().setTranslationX((r0[0] + getThumbCenterX()) - (getThumbView().getDrawable().getIntrinsicHeight() / 2.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l) {
            if (this.h == 0 || epx.f(getSeekBarCurrentColor(), "#528BCC")) {
                setSeekBarCurrentColor("#0077FF");
            }
            if (getSeekBarWidth() == 3.0f) {
                setSeekBarWidth(1.0f);
            }
            i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.l) {
            ViewParent parent = getThumbLayout().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(getThumbLayout());
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        super.onDraw(canvas);
        if (k()) {
            l();
        }
        float a2 = a((this.l && k()) ? this.L : getInternalCurrent());
        float a3 = a(getSecond());
        int save = canvas.save();
        canvas.clipPath(this.f);
        try {
            long internalCurrent = getInternalCurrent();
            Paint paint = this.g;
            if (internalCurrent > 0) {
                paint.setColor(this.h);
                canvas2 = canvas;
                try {
                    canvas2.drawRect(getPaddingStart(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a2, canvas.getHeight(), paint);
                    a2 = a2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    canvas2.restoreToCount(save);
                    throw th2;
                }
            } else {
                canvas2 = canvas;
            }
            if (getSecond() > getInternalCurrent()) {
                paint.setColor(this.i);
                f = a3;
                canvas2.drawRect(a2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, canvas2.getHeight(), paint);
            } else {
                f = a3;
            }
            if (getSecond() <= getMaxCurrent()) {
                paint.setColor(this.j);
                Canvas canvas3 = canvas2;
                try {
                    canvas3.drawRect(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas2.getWidth() - getPaddingEnd(), canvas2.getHeight(), paint);
                    paint = paint;
                } catch (Throwable th3) {
                    th = th3;
                    canvas2 = canvas3;
                    Throwable th22 = th;
                    canvas2.restoreToCount(save);
                    throw th22;
                }
            }
            canvas2.restoreToCount(save);
            qcy<Object>[] qcyVarArr = M;
            qcy<Object> qcyVar = qcyVarArr[2];
            com.vk.movika.sdk.android.defaultplayer.utils.c cVar = this.r;
            if (((Boolean) cVar.b).booleanValue() && !this.l) {
                paint.setColor(this.k);
                canvas2.drawCircle(getThumbCenterX(), getOriginY(), getActiveThumbSize() / 2.0f, paint);
            }
            if (this.l) {
                qcy<Object> qcyVar2 = qcyVarArr[2];
                if (((Boolean) cVar.b).booleanValue()) {
                    m();
                }
            }
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        float size = View.MeasureSpec.getSize(i);
        float size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            size2 = Math.max(Math.max(getActiveThumbSize(), getSeekBarWidth()), getSeekBarActiveWidth()) + getPaddingBottom() + getPaddingTop();
        }
        setMeasuredDimension(View.resolveSize(an10.b(size), i), View.resolveSize(an10.b(size2), i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        l();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.l ? super.onTouchEvent(motionEvent) : this.m.onTouch(this, motionEvent);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !k()) {
            return;
        }
        j(null);
    }

    public void setActiveThumbSize(float f) {
        qcy<Object> qcyVar = M[0];
        this.p.c(Float.valueOf(f));
    }

    public void setCorner(float f) {
        qcy<Object> qcyVar = M[7];
        this.w.c(Float.valueOf(f));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    public void setCurrent(long j) {
        if (!k()) {
            setInternalCurrent(j);
        }
        this.L = j;
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((y.a) it.next()).b(this, j, false);
        }
    }

    public final void setDesign2Enabled(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        if (isAttachedToWindow()) {
            if (z) {
                if (this.h == 0 || epx.f(getSeekBarCurrentColor(), "#528BCC")) {
                    setSeekBarCurrentColor("#0077FF");
                }
                if (getSeekBarWidth() == 3.0f) {
                    setSeekBarWidth(1.0f);
                }
                i();
            } else {
                if (epx.f(getSeekBarCurrentColor(), "#0077FF")) {
                    setSeekBarCurrentColor("#528BCC");
                }
                if (getSeekBarWidth() == 1.0f) {
                    setSeekBarWidth(3.0f);
                }
                ViewParent parent = getThumbLayout().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(getThumbLayout());
                }
            }
            invalidate();
        }
    }

    public void setMaxCurrent(long j) {
        qcy<Object> qcyVar = M[16];
        this.F.c(Long.valueOf(j));
    }

    public void setMaxSeek(Long l) {
        qcy<Object> qcyVar = M[17];
        this.G.c(l);
    }

    public void setMinSeek(Long l) {
        qcy<Object> qcyVar = M[18];
        this.H.c(l);
    }

    public void setNonActiveThumbSize(float f) {
        qcy<Object> qcyVar = M[1];
        this.q.c(Float.valueOf(f));
    }

    public void setSecond(long j) {
        qcy<Object> qcyVar = M[15];
        this.E.c(Long.valueOf(j));
    }

    public void setSeekBarActiveWidth(float f) {
        qcy<Object> qcyVar = M[13];
        this.C.c(Float.valueOf(f));
    }

    public void setSeekBarBackgroundColor(String str) {
        qcy<Object> qcyVar = M[11];
        this.A.c(str);
    }

    public void setSeekBarCurrentColor(String str) {
        qcy<Object> qcyVar = M[9];
        this.y.c(str);
    }

    public void setSeekBarSecondColor(String str) {
        qcy<Object> qcyVar = M[10];
        this.z.c(str);
    }

    public void setSeekBarWidth(float f) {
        qcy<Object> qcyVar = M[12];
        this.B.c(Float.valueOf(f));
    }

    public void setSeekEnabled(boolean z) {
        qcy<Object> qcyVar = M[5];
        this.u.c(Boolean.valueOf(z));
    }

    public void setSeekIsDisabledAlpha(int i) {
        qcy<Object> qcyVar = M[4];
        this.t.c(Integer.valueOf(i));
    }

    public void setSeekIsEnabledAlpha(int i) {
        qcy<Object> qcyVar = M[3];
        this.s.c(Integer.valueOf(i));
    }

    public void setSegmentsMargin(float f) {
        qcy<Object> qcyVar = M[8];
        this.x.c(Float.valueOf(f));
    }

    public void setThumbColor(String str) {
        qcy<Object> qcyVar = M[6];
        this.v.c(str);
    }

    public void setThumbEnabled(boolean z) {
        qcy<Object> qcyVar = M[2];
        this.r.c(Boolean.valueOf(z));
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        if (isAttachedToWindow()) {
            m();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (isAttachedToWindow()) {
            m();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.l) {
            getThumbLayout().setVisibility(i);
        }
    }
}
