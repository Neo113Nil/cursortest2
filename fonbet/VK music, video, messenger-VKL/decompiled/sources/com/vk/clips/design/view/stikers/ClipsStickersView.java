package com.vk.clips.design.view.stikers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.ao8;
import xsna.blj;
import xsna.bpn0;
import xsna.fn2;
import xsna.fot;
import xsna.gn2;
import xsna.h5f;
import xsna.iah0;
import xsna.ial0;
import xsna.jwf0;
import xsna.lc30;
import xsna.lg2;
import xsna.lhg;
import xsna.lyd;
import xsna.mbl0;
import xsna.nov;
import xsna.omv;
import xsna.q;
import xsna.q500;
import xsna.qc;
import xsna.s3q0;
import xsna.s4h0;
import xsna.sc80;
import xsna.t8l0;
import xsna.ymg0;
import xsna.yzs;
import xsna.z5l0;

/* loaded from: classes16.dex */
public class ClipsStickersView extends ViewGroup implements s4h0.a, lc30.b, ymg0.a, GestureDetector.OnGestureListener {
    public static final int Q = iah0.a(5);
    public int A;
    public final PointF B;
    public final boolean C;
    public final float D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;

    @Nullable
    public nov M;
    public final boolean N;
    public final PointF O;
    public final PointF P;
    public final Rect b;
    public final Rect c;
    public mbl0 d;
    public ao8 e;

    @Nullable
    public ial0 f;
    public final gn2 g;
    public final ArrayList<jwf0> h;
    public h5f i;

    @Nullable
    public final ImageView j;

    @Nullable
    public final t8l0 k;
    public b l;
    public e m;
    public c n;
    public d o;
    public f p;
    public final lc30 q;
    public final s4h0 r;
    public final ymg0 s;
    public final fot t;
    public nov u;
    public nov v;
    public int w;
    public int x;
    public long y;
    public int z;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ nov b;
        public final /* synthetic */ yzs c;

        public a(nov novVar, yzs yzsVar) {
            this.b = novVar;
            this.c = yzsVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ClipsStickersView clipsStickersView = ClipsStickersView.this;
            clipsStickersView.getViewTreeObserver().removeOnPreDrawListener(this);
            nov novVar = this.b;
            if (novVar instanceof View) {
                View view = (View) novVar;
                if (view.getParent() != null) {
                    return false;
                }
                int i = ClipsStickersView.Q;
                clipsStickersView.addView(view, ((nov) view).getStickerLayerType() < 4 ? -1 : 0);
            }
            yzs yzsVar = this.c;
            if (yzsVar != null) {
                int measuredWidth = clipsStickersView.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = iah0.f().widthPixels;
                }
                int measuredHeight = clipsStickersView.getMeasuredHeight();
                if (measuredHeight == 0) {
                    measuredHeight = iah0.f().heightPixels;
                }
                novVar.w0(measuredWidth, measuredHeight);
                yzsVar.invoke(Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight), novVar);
            }
            clipsStickersView.i.a(novVar);
            clipsStickersView.h(novVar);
            clipsStickersView.invalidate();
            return false;
        }
    }

    public interface b {
        void a(nov novVar);

        boolean b();
    }

    public interface c {
        void onClick();
    }

    public interface d {
        void d(MotionEvent motionEvent);
    }

    public interface e extends sc80 {
        void a();

        void c();
    }

    public interface f {
        void f(@NonNull nov novVar);
    }

    public ClipsStickersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = new Rect();
        this.f = null;
        this.g = new gn2(this);
        this.h = new ArrayList<>();
        this.w = -1;
        this.x = -1;
        this.y = -1L;
        this.B = new PointF();
        this.C = true;
        this.D = 1.0f;
        this.E = true;
        this.F = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.N = true;
        this.O = new PointF();
        this.P = new PointF();
        this.t = new fot(getContext(), this, null);
        lc30 lc30Var = new lc30(this);
        this.q = lc30Var;
        lc30Var.f = 100;
        s4h0 s4h0Var = new s4h0(context, this);
        this.r = s4h0Var;
        s4h0Var.d = false;
        s4h0Var.k = 10;
        this.s = new ymg0(this);
        ImageView imageView = new ImageView(context);
        this.j = imageView;
        this.k = new t8l0();
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.j);
    }

    @Override // xsna.ymg0.a
    public final void a(float f2, float f3, float f4) {
        nov novVar = this.u;
        if (novVar == null || this.z < novVar.getMovePointersCount()) {
            return;
        }
        if (this.A != 3) {
            this.A = 3;
            e eVar = this.m;
            if (eVar != null) {
                eVar.f();
            }
        }
        ial0 ial0Var = this.f;
        boolean z = true;
        boolean z2 = ial0Var == null || ial0Var.c();
        ial0 ial0Var2 = this.f;
        if (ial0Var2 != null && !ial0Var2.e()) {
            z = false;
        }
        if (!z2 && !z) {
            f3 = this.f.a();
        }
        if (!z2 && !z) {
            f4 = this.f.d();
        }
        this.u.y0(-f2, f3, f4, false);
        invalidate();
    }

    @Override // xsna.lc30.b
    public final void b(float f2, float f3) {
        nov novVar = this.u;
        if (novVar == null || this.z < novVar.getMovePointersCount()) {
            return;
        }
        ial0 ial0Var = this.f;
        boolean z = true;
        boolean z2 = ial0Var == null || ial0Var.c();
        ial0 ial0Var2 = this.f;
        if (ial0Var2 != null && !ial0Var2.e()) {
            z = false;
        }
        nov novVar2 = this.u;
        if (!z2) {
            f2 = 0.0f;
        }
        if (!z) {
            f3 = 0.0f;
        }
        novVar2.e(f2, f3);
        invalidate();
    }

    @Override // xsna.ymg0.a
    public final void c() {
        this.A = 0;
    }

    @Override // xsna.s4h0.a
    public final void d() {
        this.A = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentPosition;
        nov novVar;
        h5f h5fVar = this.i;
        q qVar = h5fVar.a;
        if (qVar != null) {
            currentPosition = ((Number) qVar.invoke()).intValue();
        } else {
            omv c2 = h5fVar.c();
            currentPosition = c2 != null ? (int) c2.getCurrentPosition() : -1;
        }
        h5fVar.c = currentPosition;
        ImageView imageView = this.j;
        if (imageView != null && drawChild(canvas, imageView, 0L)) {
            invalidate();
        }
        h5f h5fVar2 = this.i;
        if (h5fVar2 != null) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = h5fVar2.b;
            int size = copyOnWriteArrayList.size();
            for (int i = 0; i < size; i++) {
                nov novVar2 = copyOnWriteArrayList.get(i);
                novVar2.setTimestampMsValue(h5fVar2.c);
                if ((novVar2.getStickerLayerType() < 4 && !novVar2.getInEditMode() && novVar2.H0() && !h5f.f(novVar2, h5fVar2.c)) || novVar2.getInDraggingMode()) {
                    novVar2.F0(canvas, false);
                }
            }
        }
        h5f h5fVar3 = this.i;
        if (h5fVar3 != null) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = h5fVar3.b;
            int size2 = copyOnWriteArrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                nov novVar3 = copyOnWriteArrayList2.get(i2);
                novVar3.setTimestampMsValue(h5fVar3.c);
                if (novVar3.getStickerLayerType() > 4 && !novVar3.getInEditMode() && novVar3.H0() && !h5f.f(novVar3, h5fVar3.c)) {
                    novVar3.F0(canvas, false);
                }
            }
            if (this.e != null && (novVar = this.u) != null && ((!this.J || novVar == this.M) && !i(novVar) && this.G)) {
                this.f.draw(canvas);
            }
            if (this.i.b.size() > 1) {
                h5f h5fVar4 = this.i;
                CopyOnWriteArrayList<nov> copyOnWriteArrayList3 = h5fVar4.b;
                if (copyOnWriteArrayList3.size() > 1) {
                    nov novVar4 = copyOnWriteArrayList3.get(copyOnWriteArrayList3.size() - 1);
                    novVar4.setTimestampMsValue(h5fVar4.c);
                    if (!h5f.f(novVar4, h5fVar4.c) && novVar4.getStickerLayerType() >= 4) {
                        novVar4.F0(canvas, false);
                    }
                }
            }
            if (this.e != null && i(this.u) && this.G) {
                this.f.draw(canvas);
            }
        }
    }

    @Override // xsna.s4h0.a
    public final void e(s4h0 s4h0Var) {
        nov novVar = this.u;
        if (novVar == null || this.z < novVar.getMovePointersCount()) {
            return;
        }
        if (this.A != 3) {
            this.A = 3;
            e eVar = this.m;
            if (eVar != null) {
                eVar.f();
            }
        }
        ial0 ial0Var = this.f;
        boolean z = ial0Var == null || ial0Var.c();
        ial0 ial0Var2 = this.f;
        this.u.a(s4h0Var.a(), z ? s4h0Var.b : this.f.a(), ial0Var2 == null || ial0Var2.e() ? s4h0Var.c : this.f.d());
        invalidate();
    }

    public final void f(@NonNull nov novVar, @Nullable yzs<Integer, Integer, nov, s3q0> yzsVar) {
        novVar.setInvalidator(new qc(this, 20));
        if (novVar instanceof omv) {
            ((omv) novVar).setMute(false);
        }
        getViewTreeObserver().addOnPreDrawListener(new a(novVar, yzsVar));
        invalidate();
    }

    public final boolean g(int i, int i2) {
        if (this.N && (i < 0 || i2 < 0 || i > getMeasuredWidth() || i2 > getMeasuredHeight())) {
            return true;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.b;
        rect.set(0, 0, measuredWidth, measuredHeight);
        int i3 = 0;
        while (true) {
            ArrayList<jwf0> arrayList = this.h;
            if (i3 >= arrayList.size()) {
                return false;
            }
            jwf0 jwf0Var = arrayList.get(i3);
            Context context = getContext();
            Rect rect2 = this.c;
            jwf0Var.a(rect, rect2, context);
            if (rect2.contains(i, i2)) {
                return true;
            }
            i3++;
        }
    }

    public fn2 getAnimationChoreographer() {
        return this.g;
    }

    public List<nov> getCurrentStickers() {
        return this.i.b;
    }

    @Nullable
    public ial0 getGuidesDrawer() {
        return this.f;
    }

    public nov getMovingSticker() {
        return this.u;
    }

    public int getStateSize() {
        h5f h5fVar = this.i;
        if (h5fVar != null) {
            return h5fVar.b.size();
        }
        return 0;
    }

    public h5f getStickersState() {
        return this.i;
    }

    public final void h(@NonNull nov novVar) {
        k();
        if (novVar instanceof omv) {
            omv omvVar = (omv) novVar;
            omvVar.setNeedRequestAudioFocus(this.C);
            omvVar.setMute(false);
            omvVar.setVolume(this.D);
        }
        this.e.n(novVar, true);
        setKeepScreenOn(this.i.c() != null);
    }

    public final boolean i(nov novVar) {
        if (novVar == null) {
            return false;
        }
        this.e.getClass();
        return (novVar instanceof blj) || (novVar instanceof omv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(nov novVar) {
        this.i.b.remove(novVar);
        this.d.c(novVar);
        if (novVar instanceof View) {
            removeView((View) novVar);
        }
        k();
        this.e.n(novVar, false);
        f fVar = this.p;
        if (fVar != null) {
            fVar.f(novVar);
        }
        setKeepScreenOn(this.i.c() != null);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        nov novVar;
        boolean z;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.i.b;
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                novVar = null;
                break;
            } else {
                if (copyOnWriteArrayList.get(i).z0()) {
                    novVar = copyOnWriteArrayList.get(i);
                    break;
                }
                i++;
            }
        }
        if (novVar == null) {
            h5f h5fVar = this.i;
            if (h5fVar.c() == null && h5fVar.a == null) {
                z = false;
                gn2 gn2Var = this.g;
                gn2Var.e = z;
                gn2Var.b();
                if (z) {
                    return;
                }
                List<nov> currentStickers = getCurrentStickers();
                int i2 = 30;
                for (int i3 = 0; i3 != currentStickers.size(); i3++) {
                    ao8 ao8Var = this.e;
                    nov novVar2 = currentStickers.get(i3);
                    ao8Var.getClass();
                    Integer valueOf = novVar2 instanceof lg2 ? Integer.valueOf(((lg2) novVar2).p()) : null;
                    if (valueOf != null && i2 > valueOf.intValue()) {
                        i2 = valueOf.intValue();
                    }
                }
                gn2Var.g = i2 - 6;
                return;
            }
        }
        z = true;
        gn2 gn2Var2 = this.g;
        gn2Var2.e = z;
        gn2Var2.b();
        if (z) {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        for (int i7 = 0; i7 != childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt == this.j) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            } else {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h5f h5fVar = this.i;
        if (h5fVar != null) {
            h5fVar.d(i, i2);
        }
        invalidate();
        ial0 ial0Var = this.f;
        if (ial0Var != null) {
            ial0Var.g(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:6|(3:186|(2:192|(4:196|(3:198|(5:209|(4:211|(1:213)(2:234|(1:236)(1:237))|214|(3:216|217|(2:220|(5:224|(1:226)|227|228|229)(1:230))))|238|217|(1:233)(7:220|(1:223)(1:231)|224|(0)|227|228|229))|207)|240|229))|243)(1:(25:142|(2:146|(2:152|(1:(1:162))(1:156)))|163|(3:180|(1:182)|183)|167|(1:169)|170|(1:172)|173|16|(1:88)(1:21)|22|(6:24|(4:27|(2:29|30)(2:32|(1:51)(4:34|(1:49)|38|(2:47|48)))|31|25)|86|52|53|(1:56))(1:87)|57|(1:61)|62|63|(6:68|(1:70)|72|(1:74)|75|(1:82)(1:81))|83|(0)|72|(0)|75|(1:77)|82)(2:13|(4:89|(4:99|(2:101|(2:103|(1:107)))|108|(4:112|(1:134)(1:118)|119|(3:123|(3:125|(1:127)|128)(3:130|(1:132)|133)|129)))|135|(1:141))))|15|16|(1:18)|88|22|(0)(0)|57|(2:59|61)|62|63|(8:65|68|(0)|72|(0)|75|(0)|82)|83|(0)|72|(0)|75|(0)|82) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0343, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0344, code lost:
    
        xsna.lyd.a.g(r0, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032e A[Catch: Exception -> 0x0343, TRY_LEAVE, TryCatch #0 {Exception -> 0x0343, blocks: (B:63:0x0317, B:65:0x0323, B:70:0x032e), top: B:62:0x0317 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0308  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        nov novVar;
        e eVar;
        int currentPosition;
        int i;
        boolean z;
        boolean z2;
        nov novVar2;
        d dVar;
        boolean z3;
        boolean z4;
        nov novVar3;
        c cVar;
        b bVar;
        nov novVar4;
        char c2 = 0;
        if (!this.E) {
            return false;
        }
        float f2 = 0;
        motionEvent.offsetLocation(f2, f2);
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i2 = 4;
        boolean z5 = true;
        if ((action == 0 || action == 5) && this.u == null) {
            h5f h5fVar = this.i;
            if (h5fVar != null && !h5fVar.b.isEmpty() && !this.L) {
                for (int size = this.i.b.size() - 1; size >= 0 && this.u == null; size--) {
                    nov novVar5 = this.i.b.get(size);
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        if (novVar5.A0(motionEvent.getX(i3), motionEvent.getY(i3)) && (!this.I || (this.e != null && !i(novVar5)))) {
                            q500 o = novVar5.getCommons().o();
                            if (o != null) {
                                h5f h5fVar2 = this.i;
                                q qVar = h5fVar2.a;
                                if (qVar != null) {
                                    currentPosition = ((Number) qVar.invoke()).intValue();
                                } else {
                                    omv c3 = h5fVar2.c();
                                    currentPosition = c3 != null ? (int) c3.getCurrentPosition() : -1;
                                }
                                if (!o.f(currentPosition)) {
                                    objArr = false;
                                    if (novVar5.H0() && objArr != false) {
                                        this.v = novVar5;
                                        novVar = this.M;
                                        if (novVar != null || novVar == novVar5) {
                                            this.u = novVar5;
                                            eVar = this.m;
                                            if (eVar != null) {
                                                eVar.b(novVar5);
                                            }
                                            invalidate();
                                        }
                                    }
                                }
                            }
                            objArr = true;
                            if (novVar5.H0()) {
                                this.v = novVar5;
                                novVar = this.M;
                                if (novVar != null) {
                                }
                                this.u = novVar5;
                                eVar = this.m;
                                if (eVar != null) {
                                }
                                invalidate();
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            this.w = x;
            this.x = y;
            this.y = System.currentTimeMillis();
            this.A = 0;
        } else {
            if (action == 1 || action == 3) {
                int i4 = this.w;
                i = -1;
                if (i4 != -1 && this.x != -1) {
                    int abs = Math.abs(i4 - x);
                    int i5 = Q;
                    if (abs < i5 && Math.abs(this.x - y) < i5 && System.currentTimeMillis() - this.y < 500) {
                        nov novVar6 = this.v;
                        if (novVar6 != null && (bVar = this.l) != null) {
                            bVar.a(novVar6);
                        } else if ((novVar6 == null || novVar6.getMovePointersCount() > motionEvent.getPointerCount()) && (cVar = this.n) != null) {
                            cVar.onClick();
                        }
                    }
                }
                b bVar2 = this.l;
                if ((bVar2 == null || bVar2.b()) && this.A != 3 && g(x, y) && (novVar3 = this.u) != null) {
                    if (novVar3.v0()) {
                        j(this.u);
                    }
                    this.u = null;
                }
                if (this.G) {
                    this.f.b();
                }
                this.A = 0;
                e eVar2 = this.m;
                if (eVar2 != null) {
                    eVar2.h(this.u);
                }
                this.u = null;
                this.v = null;
                z = !this.F && this.u == null && pointerCount > 1;
                lyd.a.e(Arrays.copyOf(new Object[]{lhg.a(pointerCount, "Pointers count: ")}, 1));
                lyd.a.e(Arrays.copyOf(new Object[]{"Need check intersection: " + z}, 1));
                if (z) {
                    z2 = true;
                } else {
                    float x2 = motionEvent.getX(0);
                    float y2 = motionEvent.getY(0);
                    float x3 = motionEvent.getX(1);
                    float y3 = motionEvent.getY(1);
                    float f3 = Float.MAX_VALUE;
                    int i6 = i;
                    int i7 = 0;
                    while (i7 < this.i.b.size()) {
                        nov novVar7 = this.i.b.get(i7);
                        if (novVar7.H0()) {
                            PointF[] fillPoints = novVar7.getFillPoints();
                            if (fillPoints.length != i2) {
                                break;
                            }
                            PointF pointF = this.O;
                            pointF.set(x2, y2);
                            PointF pointF2 = this.P;
                            pointF2.set(x3, y3);
                            bpn0 bpn0Var = z5l0.a;
                            z4 = z5;
                            PointF pointF3 = fillPoints[c2];
                            PointF pointF4 = fillPoints[2];
                            PointF pointF5 = this.B;
                            if (!z5l0.e(pointF5, pointF, pointF2, pointF3, pointF4) && !z5l0.e(pointF5, pointF, pointF2, fillPoints[z4 ? 1 : 0], fillPoints[3])) {
                            }
                            float max = Math.max(z5l0.b(x2, y2, pointF5.x, pointF5.y), z5l0.b(x3, y3, pointF5.x, pointF5.y));
                            if ((!i(novVar7) || !this.I) && (f3 > max || i7 > i6)) {
                                this.u = novVar7;
                                f3 = max;
                                i6 = i7;
                            }
                        } else {
                            z4 = z5;
                        }
                        i7++;
                        z5 = z4;
                        c2 = 0;
                        i2 = 4;
                    }
                    z2 = z5;
                    if (this.u != null && i6 >= 0) {
                        invalidate();
                    }
                }
                novVar2 = this.u;
                if (novVar2 != null && novVar2.d()) {
                    this.u = null;
                }
                this.z = motionEvent.getPointerCount();
                nov novVar8 = this.u;
                if (this.J && novVar8 != this.M) {
                    z3 = false;
                    if (z3) {
                        this.t.a(motionEvent);
                        this.q.a(motionEvent);
                        this.r.c(motionEvent);
                        this.s.a(motionEvent);
                    }
                    dVar = this.o;
                    if (dVar != null) {
                        dVar.d(motionEvent);
                    }
                    if (!this.H && this.u == null && this.v == null) {
                        return false;
                    }
                    return z2;
                }
                z3 = z2;
                if (z3) {
                }
                dVar = this.o;
                if (dVar != null) {
                }
                if (!this.H) {
                }
                return z2;
            }
            if (action == 2) {
                if (this.u != null && System.currentTimeMillis() - this.y > 150 && !this.u.d() && this.A != 3 && motionEvent.getPointerCount() >= this.u.getMovePointersCount()) {
                    if (this.A == 0) {
                        this.A = 4;
                        e eVar3 = this.m;
                        if (eVar3 != null) {
                            nov novVar9 = this.u;
                            if (!this.J || novVar9 == this.M) {
                                eVar3.g();
                            }
                        }
                    }
                    b bVar3 = this.l;
                    if (bVar3 == null || bVar3.b()) {
                        int i8 = (g(x, y) && this.u.v0() && motionEvent.getPointerCount() <= this.u.getMovePointersCount()) ? 2 : 1;
                        if (i8 != this.A && this.m != null) {
                            if (i8 == 2) {
                                nov novVar10 = this.u;
                                if (!this.K) {
                                    novVar10.setStickerAlpha(163);
                                }
                                this.d.b();
                                this.m.a();
                            } else {
                                nov novVar11 = this.u;
                                if (!this.K) {
                                    novVar11.setStickerAlpha(255);
                                }
                                this.m.c();
                            }
                            this.A = i8;
                        }
                    }
                }
                if (this.G && (novVar4 = this.u) != null && !novVar4.d()) {
                    this.f.h(this.u, motionEvent);
                }
            }
        }
        i = -1;
        if (this.F) {
        }
        lyd.a.e(Arrays.copyOf(new Object[]{lhg.a(pointerCount, "Pointers count: ")}, 1));
        lyd.a.e(Arrays.copyOf(new Object[]{"Need check intersection: " + z}, 1));
        if (z) {
        }
        novVar2 = this.u;
        if (novVar2 != null) {
            this.u = null;
        }
        this.z = motionEvent.getPointerCount();
        nov novVar82 = this.u;
        if (this.J) {
            z3 = false;
            if (z3) {
            }
            dVar = this.o;
            if (dVar != null) {
            }
            if (!this.H) {
            }
            return z2;
        }
        z3 = z2;
        if (z3) {
        }
        dVar = this.o;
        if (dVar != null) {
        }
        if (!this.H) {
        }
        return z2;
    }

    public void setAllowedStickerToMove(@Nullable nov novVar) {
        this.M = novVar;
    }

    public void setBackgroundState(Bitmap bitmap) {
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            t8l0 t8l0Var = this.k;
            if (t8l0Var != null) {
                t8l0Var.b = null;
                t8l0Var.c = null;
                t8l0Var.a = bitmap;
            }
        }
        invalidate();
    }

    public void setCallback(b bVar) {
        this.l = bVar;
    }

    public void setGuidesDrawer(@Nullable ial0 ial0Var) {
        this.f = ial0Var;
    }

    public void setIgnoreStickerTouches(boolean z) {
        this.L = z;
    }

    public void setLockAllStickersMovement(boolean z) {
        this.J = z;
    }

    public void setLockContentStickers(boolean z) {
        this.I = z;
    }

    public void setLockStickersAlpha(boolean z) {
        this.K = z;
    }

    public void setOnEmptySpaceClickListener(@Nullable c cVar) {
        this.n = cVar;
    }

    public void setOnMotionEventListener(@Nullable d dVar) {
        this.o = dVar;
    }

    public void setOnStickerMoveListener(@Nullable e eVar) {
        this.m = eVar;
    }

    public void setStickerListener(@Nullable f fVar) {
        this.p = fVar;
    }

    public void setStickersProvider(@NonNull mbl0 mbl0Var) {
        if (this.d == null) {
            this.d = mbl0Var;
            this.e = mbl0Var.a();
            this.i = new h5f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStickersState(@NonNull h5f h5fVar) {
        int childCount = getChildCount();
        for (int i = 0; i != childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof omv) {
                ((omv) childAt).b();
            }
            if (childAt instanceof nov) {
                removeView(childAt);
            }
        }
        this.i = h5fVar;
        Iterator<nov> it = h5fVar.b.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            next.setInvalidator(new com.vk.movika.sdk.base.presenter.b(this, 17));
            if (next instanceof View) {
                View view = (View) next;
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view, ((nov) view).getStickerLayerType() < 4 ? -1 : 0);
            }
        }
        int width = getWidth();
        int height = getHeight();
        h5f h5fVar2 = this.i;
        if (h5fVar2 != null) {
            h5fVar2.d(width, height);
        }
        invalidate();
        invalidate();
    }

    public void setTouchEnabled(boolean z) {
        this.E = z;
    }

    public void setTouchFalseIfNoSticker(boolean z) {
        this.H = z;
    }

    public void setBackgroundState(Drawable drawable) {
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            t8l0 t8l0Var = this.k;
            if (t8l0Var != null) {
                t8l0Var.a = null;
                t8l0Var.c = null;
                t8l0Var.b = drawable;
            }
        }
        invalidate();
    }

    public void setBackgroundState(int i) {
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setBackgroundColor(i);
            t8l0 t8l0Var = this.k;
            if (t8l0Var != null) {
                t8l0Var.a = null;
                t8l0Var.b = null;
                t8l0Var.c = Integer.valueOf(i);
            }
        }
        invalidate();
    }

    public void setBackgroundState(t8l0 t8l0Var) {
        if (this.j != null) {
            Bitmap bitmap = t8l0Var.a;
            if (bitmap == null && t8l0Var.b == null && t8l0Var.c == null) {
                return;
            }
            if (bitmap != null) {
                setBackgroundState(bitmap);
                return;
            }
            Drawable drawable = t8l0Var.b;
            if (drawable != null) {
                setBackgroundState(drawable);
                return;
            }
            Integer num = t8l0Var.c;
            if (num != null) {
                setBackgroundState(num.intValue());
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
