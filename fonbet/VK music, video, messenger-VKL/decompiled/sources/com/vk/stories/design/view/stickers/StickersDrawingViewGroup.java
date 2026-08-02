package com.vk.stories.design.view.stickers;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.camera.stickers.R$styleable;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableLink;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableReply;
import com.vk.dto.stories.model.clickable.ClickableServiceYcItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.photo.editor.markup.view.DrawingView;
import com.vk.rlottie.RLottieDrawable;
import com.vk.toggle.features.StoriesFeatures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.abm0;
import xsna.blj;
import xsna.bpn0;
import xsna.d7g0;
import xsna.e3m;
import xsna.f2l0;
import xsna.f5h0;
import xsna.fn2;
import xsna.fot;
import xsna.g4m0;
import xsna.g880;
import xsna.gkc0;
import xsna.gn2;
import xsna.gr9;
import xsna.grt0;
import xsna.iah0;
import xsna.ial0;
import xsna.ikk0;
import xsna.irc0;
import xsna.iut0;
import xsna.izs;
import xsna.j6i;
import xsna.j96;
import xsna.jwf0;
import xsna.k9l0;
import xsna.kdl0;
import xsna.l140;
import xsna.lba0;
import xsna.lg2;
import xsna.lhg;
import xsna.lo9;
import xsna.m7m;
import xsna.mc30;
import xsna.mgi;
import xsna.nov;
import xsna.os30;
import xsna.ov;
import xsna.ox0;
import xsna.q500;
import xsna.qah0;
import xsna.r4g0;
import xsna.r8m0;
import xsna.r9l0;
import xsna.rkc;
import xsna.s3q0;
import xsna.s4h0;
import xsna.sc80;
import xsna.t690;
import xsna.t8l0;
import xsna.tbe0;
import xsna.u76;
import xsna.v800;
import xsna.vlo;
import xsna.vvr0;
import xsna.w8i;
import xsna.w9l0;
import xsna.wx30;
import xsna.xcl0;
import xsna.xmp0;
import xsna.yjm0;
import xsna.yzs;
import xsna.z5l0;
import xsna.z7c0;
import xsna.zcl0;
import xsna.zmg0;
import xsna.zrl0;

/* loaded from: classes6.dex */
public class StickersDrawingViewGroup extends ViewGroup implements s4h0.a, mc30.a, zmg0.b, GestureDetector.OnGestureListener {
    public static final int j0 = iah0.a(5);
    public zmg0 A;
    public fot B;
    public View.OnTouchListener C;
    public nov D;
    public int E;
    public int F;
    public long G;
    public int H;
    public int I;
    public PointF J;
    public boolean K;
    public boolean L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final PointF a0;
    public final int b;
    public final PointF b0;
    public boolean c;
    public boolean c0;
    public r9l0 d;

    @Nullable
    public k d0;

    @Nullable
    public ov e;

    @Nullable
    public Transition e0;
    public int f;

    @Nullable
    public Transition f0;
    public int g;

    @Nullable
    public c g0;
    public final a h;

    @Nullable
    public d h0;

    @Nullable
    public rkc i;
    public kdl0 i0;
    public final Rect j;
    public final Rect k;

    @Nullable
    public ial0 l;
    public final gn2 m;
    public final ArrayList<jwf0> n;
    public final ArrayList o;
    public final HashSet p;

    @NonNull
    public zcl0 q;
    public zrl0 r;

    @Nullable
    public VKImageView s;

    @Nullable
    public t8l0 t;
    public j u;
    public g v;
    public i<nov> w;
    public l x;
    public mc30 y;
    public s4h0 z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            StickersDrawingViewGroup stickersDrawingViewGroup = StickersDrawingViewGroup.this;
            int i2 = stickersDrawingViewGroup.f;
            if (i2 <= 0 || (i = stickersDrawingViewGroup.g) <= 0) {
                return;
            }
            if (i2 > 0 && i > 0) {
                stickersDrawingViewGroup.q.n(i2, i);
                stickersDrawingViewGroup.invalidate();
            }
            stickersDrawingViewGroup.f = 0;
            stickersDrawingViewGroup.g = 0;
        }
    }

    public class b implements w8i {
    }

    public class c extends xmp0 {
        public c() {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            StickersDrawingViewGroup stickersDrawingViewGroup = StickersDrawingViewGroup.this;
            stickersDrawingViewGroup.c0 = false;
            Transition transition2 = stickersDrawingViewGroup.e0;
            if (transition2 != null) {
                transition2.removeListener(this);
            }
        }
    }

    public class d extends xmp0 {
        public d() {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            StickersDrawingViewGroup stickersDrawingViewGroup = StickersDrawingViewGroup.this;
            stickersDrawingViewGroup.c0 = false;
            Transition transition2 = stickersDrawingViewGroup.f0;
            if (transition2 != null) {
                transition2.removeListener(this);
            }
        }

        @Override // xsna.xmp0, android.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
            StickersDrawingViewGroup.this.c0 = true;
        }
    }

    public class e implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ nov b;
        public final /* synthetic */ yzs c;

        public e(nov novVar, yzs yzsVar) {
            this.b = novVar;
            this.c = yzsVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            StickersDrawingViewGroup stickersDrawingViewGroup = StickersDrawingViewGroup.this;
            int measuredWidth = stickersDrawingViewGroup.getMeasuredWidth();
            int measuredHeight = stickersDrawingViewGroup.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                return true;
            }
            stickersDrawingViewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            stickersDrawingViewGroup.p.remove(this);
            nov novVar = this.b;
            if (novVar instanceof View) {
                View view = (View) novVar;
                if (view.getParent() != null) {
                    return false;
                }
                stickersDrawingViewGroup.h(view);
            }
            yzs yzsVar = this.c;
            if (yzsVar != null) {
                novVar.w0(measuredWidth, measuredHeight);
                yzsVar.invoke(Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight), novVar);
            }
            stickersDrawingViewGroup.q.a(novVar);
            stickersDrawingViewGroup.m(novVar);
            stickersDrawingViewGroup.invalidate();
            return false;
        }
    }

    public interface f {
    }

    public interface g {
        boolean onClick();
    }

    public interface h {
    }

    public interface i<T extends nov> {
        boolean d(T t);
    }

    public interface j extends sc80 {
        void a();

        void c();

        void e();

        void i();
    }

    public interface k {
    }

    public interface l {
        void M(@NonNull nov novVar);

        void f(@NonNull nov novVar);
    }

    static {
        iah0.a(8);
    }

    public StickersDrawingViewGroup(Context context) {
        super(context);
        this.b = -iah0.a(88);
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = new a();
        this.j = new Rect();
        this.k = new Rect();
        this.l = null;
        this.m = new gn2(this);
        this.n = new ArrayList<>();
        this.o = new ArrayList();
        this.p = new HashSet();
        this.q = new zcl0();
        this.E = -1;
        this.F = -1;
        this.G = -1L;
        this.J = new PointF();
        this.K = false;
        this.L = true;
        this.M = 1.0f;
        this.N = true;
        this.O = false;
        this.P = true;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = true;
        this.a0 = new PointF();
        this.b0 = new PointF();
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        l(context);
    }

    @NonNull
    private rkc getStickerUtils() {
        if (this.i == null) {
            this.i = ((CommonEditorComponent) j6i.b(m7m.f(new b()), CommonEditorComponent.class)).Z1();
        }
        return this.i;
    }

    private void setMoveSticker(@Nullable nov novVar) {
        if (this.D != null && novVar == null) {
            this.c = true;
        }
        this.D = novVar;
    }

    private void setOnStickerClickListener(@NonNull i<nov> iVar) {
        this.w = iVar;
    }

    @Override // xsna.zmg0.b
    public final void a(float f2, float f3, float f4) {
        nov novVar = this.D;
        if (novVar == null || this.H < novVar.getMovePointersCount()) {
            return;
        }
        if (this.I != 3) {
            this.I = 3;
            j jVar = this.u;
            if (jVar != null) {
                jVar.f();
            }
        }
        ial0 ial0Var = this.l;
        boolean z = true;
        boolean z2 = ial0Var == null || ial0Var.c();
        ial0 ial0Var2 = this.l;
        if (ial0Var2 != null && !ial0Var2.e()) {
            z = false;
        }
        if (!z2 && !z) {
            f3 = this.l.a();
        }
        if (!z2 && !z) {
            f4 = this.l.d();
        }
        this.D.y0(-f2, f3, f4, false);
        invalidate();
    }

    @Override // xsna.mc30.a
    public final void b(float f2, float f3) {
        nov novVar = this.D;
        if (novVar == null || this.H < novVar.getMovePointersCount()) {
            return;
        }
        ial0 ial0Var = this.l;
        boolean z = true;
        boolean z2 = ial0Var == null || ial0Var.c();
        ial0 ial0Var2 = this.l;
        if (ial0Var2 != null && !ial0Var2.e()) {
            z = false;
        }
        nov novVar2 = this.D;
        if (!z2) {
            f2 = 0.0f;
        }
        if (!z) {
            f3 = 0.0f;
        }
        novVar2.e(f2, f3);
        invalidate();
    }

    @Override // xsna.zmg0.b
    public final void c() {
        this.I = 0;
        j jVar = this.u;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // xsna.s4h0.a
    public final void d() {
        this.I = 0;
        j jVar = this.u;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        zcl0 zcl0Var = this.q;
        grt0 j2 = zcl0Var.j();
        zcl0Var.b = j2 != null ? (int) j2.getCurrentPosition() : -1;
        VKImageView vKImageView = this.s;
        if (vKImageView != null && drawChild(canvas, vKImageView, 0L)) {
            invalidate();
        }
        zcl0 zcl0Var2 = this.q;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var2.a;
        int i2 = 0;
        for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
            nov novVar = copyOnWriteArrayList.get(i3);
            novVar.setTimestampMsValue(zcl0Var2.b);
            if ((novVar.getStickerLayerType() < 4 && !novVar.getInEditMode() && novVar.H0() && !zcl0.x(novVar, zcl0Var2.b)) || novVar.getInDraggingMode()) {
                novVar.F0(canvas, false);
            }
        }
        zrl0 zrl0Var = this.r;
        if (zrl0Var != null) {
            zrl0Var.draw(canvas);
        }
        zcl0 zcl0Var3 = this.q;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = zcl0Var3.a;
        for (int i4 = 0; i4 < copyOnWriteArrayList2.size(); i4++) {
            nov novVar2 = copyOnWriteArrayList2.get(i4);
            novVar2.setTimestampMsValue(zcl0Var3.b);
            if (novVar2.getStickerLayerType() > 4 && !novVar2.getInEditMode() && novVar2.H0() && !zcl0.x(novVar2, zcl0Var3.b)) {
                novVar2.F0(canvas, false);
            }
        }
        if (!(this.D instanceof blj) && this.Q) {
            this.l.draw(canvas);
        }
        if ((this.D instanceof blj) && this.Q) {
            this.l.draw(canvas);
        }
        while (true) {
            ArrayList arrayList = this.o;
            if (i2 == arrayList.size()) {
                break;
            }
            ((gr9) arrayList.get(i2)).draw(canvas);
            i2++;
        }
        ov ovVar = this.e;
        if (ovVar != null) {
            ovVar.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.i0.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i0.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // xsna.s4h0.a
    public final void e(s4h0 s4h0Var) {
        nov novVar = this.D;
        if (novVar == null || this.H < novVar.getMovePointersCount()) {
            return;
        }
        if (this.I != 3) {
            this.I = 3;
            j jVar = this.u;
            if (jVar != null) {
                jVar.f();
            }
        }
        ial0 ial0Var = this.l;
        boolean z = ial0Var == null || ial0Var.c();
        ial0 ial0Var2 = this.l;
        this.D.a(s4h0Var.a(), z ? s4h0Var.b : this.l.a(), ial0Var2 == null || ial0Var2.e() ? s4h0Var.c : this.l.d());
        invalidate();
    }

    public final void f(@NonNull nov novVar) {
        float f2 = f2l0.a;
        g(novVar, new mgi(2));
    }

    public final void g(@NonNull nov novVar, @Nullable yzs<Integer, Integer, nov, s3q0> yzsVar) {
        novVar.setInvalidator(new qah0(this, 6));
        novVar.setStickerAccessibilityListener(this.i0);
        if (novVar instanceof grt0) {
            ((grt0) novVar).setMute(this.K);
        }
        e eVar = new e(novVar, yzsVar);
        this.p.add(eVar);
        getViewTreeObserver().addOnPreDrawListener(eVar);
        invalidate();
    }

    public fn2 getAnimationChoreographer() {
        return this.m;
    }

    @Nullable
    public t8l0 getBackgroundState() {
        return this.t;
    }

    public k9l0 getClickableCounter() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        HashSet hashSet = new HashSet();
        ClickableStickers clickableStickers = getClickableStickers();
        int i12 = 0;
        if (clickableStickers != null) {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            int i13 = 0;
            i8 = 0;
            int i14 = 0;
            int i15 = 0;
            for (ClickableSticker clickableSticker : clickableStickers.d) {
                if (clickableSticker instanceof ClickableHashtag) {
                    i2++;
                } else if (clickableSticker instanceof ClickableMention) {
                    UserId userId = ((ClickableMention) clickableSticker).e;
                    if (userId != null) {
                        hashSet.add(userId);
                    }
                } else if (clickableSticker instanceof ClickableQuestion) {
                    i5++;
                } else if (clickableSticker instanceof ClickableMusic) {
                    i6++;
                } else if (clickableSticker instanceof ClickableMarketItem) {
                    Good good = ((ClickableMarketItem) clickableSticker).j;
                    if (good == null || !good.V) {
                        i7++;
                    } else {
                        i13++;
                    }
                } else if (clickableSticker instanceof ClickableReply) {
                    i8++;
                } else if (clickableSticker instanceof ClickableLink) {
                    if (Boolean.TRUE.equals(((ClickableLink) clickableSticker).j)) {
                        i4++;
                    } else {
                        i3++;
                    }
                } else if (clickableSticker instanceof ClickableServiceYcItem) {
                    i14++;
                } else if (clickableSticker instanceof ClickableGeo) {
                    i15++;
                }
            }
            i10 = i14;
            i11 = i15;
            i9 = i13;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        Iterator<nov> it = this.q.a.iterator();
        int i16 = 0;
        int i17 = 0;
        int i18 = i2;
        int i19 = i3;
        int i20 = i4;
        int i21 = i5;
        int i22 = i6;
        int i23 = i7;
        int i24 = i8;
        int i25 = 0;
        while (it.hasNext()) {
            nov next = it.next();
            HashSet hashSet2 = hashSet;
            if (next instanceof yjm0) {
                i12++;
            } else if (next instanceof g4m0) {
                i25++;
            } else if (next instanceof r8m0) {
                i16++;
            } else if (next instanceof abm0) {
                i17++;
            }
            hashSet = hashSet2;
        }
        return new k9l0(hashSet, i18, i19, i20, i21, i22, i23, i24, i12, i25, i16, i9, i10, i11, i17);
    }

    @Nullable
    public ClickableStickers getClickableStickers() {
        List<ClickableSticker> b2;
        ArrayList arrayList = new ArrayList();
        rkc stickerUtils = getStickerUtils();
        Iterator<nov> it = this.q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (stickerUtils.a(next) && (b2 = stickerUtils.b(next)) != null) {
                arrayList.addAll(b2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ClickableStickers(getWidth(), getHeight(), arrayList);
    }

    public List<nov> getCurrentStickers() {
        return this.q.a;
    }

    @Nullable
    public ial0 getGuidesDrawer() {
        return this.l;
    }

    public View.OnTouchListener getInterceptTouchListener() {
        return this.C;
    }

    public nov getMovingSticker() {
        return this.D;
    }

    @Nullable
    public grt0 getPlayingVideoSticker() {
        return this.q.j();
    }

    public int getStateSize() {
        return this.q.a.size();
    }

    @NonNull
    public zcl0 getStickersState() {
        return this.q;
    }

    public zcl0 getStickersStateCopy() {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.q.a;
        zcl0 zcl0Var = new zcl0();
        for (int i2 = 0; i2 < copyOnWriteArrayList.size(); i2++) {
            zcl0Var.a.add(copyOnWriteArrayList.get(i2).copy());
        }
        return zcl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(@NonNull View view) {
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 != childCount) {
                boolean z = getChildAt(i2) instanceof DrawingView;
                if (z || z) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (((nov) view).getStickerLayerType() >= 4) {
            i2++;
        }
        addView(view, i2);
    }

    public final void i() {
        HashSet hashSet = this.p;
        if (hashSet.isEmpty()) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) it.next());
        }
        hashSet.clear();
    }

    public final void j(@NonNull izs<grt0, s3q0> izsVar) {
        Iterator<nov> it = this.q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (next instanceof grt0) {
                izsVar.invoke((grt0) next);
            }
            if (next instanceof r4g0) {
                izsVar.invoke(((r4g0) next).getVideo());
            }
        }
    }

    public final boolean k(int i2, int i3) {
        if (this.W && (i2 < 0 || i3 < 0 || i2 > getMeasuredWidth() || i3 > getMeasuredHeight())) {
            return true;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.j;
        rect.set(0, 0, measuredWidth, measuredHeight);
        int i4 = 0;
        while (true) {
            ArrayList<jwf0> arrayList = this.n;
            if (i4 >= arrayList.size()) {
                return false;
            }
            jwf0 jwf0Var = arrayList.get(i4);
            Context context = getContext();
            Rect rect2 = this.k;
            jwf0Var.a(rect, rect2, context);
            if (rect2.contains(i2, i3)) {
                return true;
            }
            i4++;
        }
    }

    public final void l(Context context) {
        this.B = new fot(getContext(), this, null);
        mc30 mc30Var = new mc30(this);
        this.y = mc30Var;
        mc30Var.f = 100;
        s4h0 s4h0Var = new s4h0(context, this);
        this.z = s4h0Var;
        s4h0Var.d = false;
        s4h0Var.k = 10;
        this.A = new zmg0(this);
        if (this.R) {
            VKImageView vKImageView = new VKImageView(context);
            this.s = vKImageView;
            this.t = new t8l0();
            vKImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.s.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.s.setActualScaleType(f5h0.f.a);
            addView(this.s);
        }
        zrl0 zrl0Var = new zrl0(context, 0);
        this.r = zrl0Var;
        zrl0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.r);
        int i2 = 12;
        kdl0 kdl0Var = new kdl0(this, new g880(this, 27), new ikk0(this, 1), new tbe0(this, i2), new irc0(this, i2), new os30(this, 25));
        this.i0 = kdl0Var;
        iut0.q(this, kdl0Var);
    }

    public final void m(@NonNull nov novVar) {
        u();
        if (novVar instanceof grt0) {
            grt0 grt0Var = (grt0) novVar;
            grt0Var.setNeedRequestAudioFocus(this.L);
            grt0Var.setMute(this.K);
            if (!this.K) {
                grt0Var.setVolume(this.M);
            }
        }
        if (novVar instanceof v800) {
            ((v800) novVar).h.b();
        }
        l lVar = this.x;
        if (lVar != null) {
            lVar.M(novVar);
        }
        setKeepScreenOn(this.q.u());
        w();
    }

    public final boolean n() {
        zcl0 zcl0Var = this.q;
        zcl0Var.getClass();
        ArrayList arrayList = new ArrayList();
        zcl0Var.a.forEach(new xcl0(arrayList, 0));
        if (arrayList.size() <= 1 && (arrayList.size() != 1 || (arrayList.get(0) instanceof d7g0))) {
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
            storiesFeatures.getClass();
            if (com.vk.toggle.b.A.a(storiesFeatures)) {
                return false;
            }
        }
        return true;
    }

    public final void o() {
        j(new wx30(13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity h2 = e3m.h(getContext());
        Transition transition = this.e0;
        if (transition != null) {
            transition.removeListener(this.g0);
            this.g0 = null;
            this.e0 = null;
        }
        Transition transition2 = this.f0;
        if (transition2 != null) {
            transition2.removeListener(this.h0);
            this.h0 = null;
            this.f0 = null;
        }
        if (h2 == null) {
            return;
        }
        Transition sharedElementEnterTransition = h2.getWindow().getSharedElementEnterTransition();
        this.e0 = sharedElementEnterTransition;
        if (sharedElementEnterTransition == null) {
            return;
        }
        c cVar = new c();
        this.g0 = cVar;
        sharedElementEnterTransition.addListener(cVar);
        Transition sharedElementReturnTransition = h2.getWindow().getSharedElementReturnTransition();
        this.f0 = sharedElementReturnTransition;
        if (sharedElementReturnTransition == null) {
            return;
        }
        d dVar = new d();
        this.h0 = dVar;
        sharedElementReturnTransition.addListener(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Transition transition = this.e0;
        if (transition != null) {
            transition.removeListener(this.g0);
            this.g0 = null;
            this.e0 = null;
        }
        Transition transition2 = this.f0;
        if (transition2 != null) {
            transition2.removeListener(this.h0);
            this.h0 = null;
            this.f0 = null;
        }
        StoriesFeatures storiesFeatures = StoriesFeatures.IDEAS_STORY_VIEWER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            i();
        } else {
            this.p.clear();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        try {
            float y = motionEvent2.getY() - motionEvent.getY();
            if (this.D != null || this.c || this.d0 == null || y >= this.b || Math.abs(f3) <= 100.0f) {
                return false;
            }
            ((u76) ((j96) ((ox0) this.d0).c).e.invoke()).i4();
            return true;
        } catch (Throwable th) {
            L.g("error on swipe ", th);
            return false;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i2, @Nullable Rect rect) {
        super.onFocusChanged(z, i2, rect);
        this.i0.onFocusChanged(z, i2, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        for (int i8 = 0; i8 != childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt == this.s) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            } else {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        j jVar = this.u;
        if (jVar != null) {
            jVar.i();
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
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        if (!this.c0) {
            a aVar = this.h;
            removeCallbacks(aVar);
            this.f = i2;
            this.g = i3;
            postDelayed(aVar, 80L);
        }
        ial0 ial0Var = this.l;
        if (ial0Var != null) {
            ial0Var.g(i2, i3, i4, i5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:11|(1:13)(1:229)|14|(1:16)(1:228)|17|(5:183|(2:185|(3:189|(1:(1:1)(3:191|(5:199|(4:201|(1:203)(1:216)|204|(3:206|207|(3:210|211|212)))|217|207|(1:215)(3:210|211|212))|198))|213))|222|(1:226)|227)(1:(22:136|(2:140|(2:146|(2:153|(1:159))(1:152)))|160|(2:171|(3:173|(1:175)|176))|164|(1:166)|167|(1:169)|170|26|(1:89)(1:31)|32|(6:34|(4:37|(2:39|40)(2:42|(1:60)(2:44|(2:49|(2:58|59))(1:48)))|41|35)|87|61|62|(1:65))(1:88)|66|(1:70)|71|72|(1:74)|75|76|77|(1:82)(1:81))(2:23|(4:90|(6:100|(3:102|(1:104)|105)|106|(1:128)(1:112)|113|(3:117|(3:119|(1:121)|122)(3:124|(1:126)|127)|123))|129|(1:135))))|25|26|(1:28)|89|32|(0)(0)|66|(2:68|70)|71|72|(0)|75|76|77|(1:79)|82) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0350, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0355, code lost:
    
        com.vk.log.L.i(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0339 A[Catch: Exception -> 0x0350, TryCatch #0 {Exception -> 0x0350, blocks: (B:72:0x032f, B:74:0x0339, B:76:0x0352), top: B:71:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        nov novVar;
        char c2;
        boolean z4;
        boolean z5;
        g gVar;
        nov novVar2;
        nov novVar3;
        View.OnTouchListener onTouchListener = this.C;
        if (onTouchListener != null && this.D == null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        boolean z6 = false;
        if (!this.N) {
            return false;
        }
        motionEvent.offsetLocation(this.O ? -iah0.l(this) : 0, this.O ? -iah0.m(this) : 0);
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction() & 255;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        char c3 = 3;
        boolean z7 = true;
        if ((action == 0 || action == 5) && this.D == null) {
            if (!this.q.a.isEmpty()) {
                for (int size = this.q.a.size() - 1; size >= 0 && this.D == null; size--) {
                    nov novVar4 = this.q.a.get(size);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= pointerCount) {
                            break;
                        }
                        if (novVar4.A0(motionEvent.getX(i3), motionEvent.getY(i3)) && (!this.T || !(novVar4 instanceof blj))) {
                            q500 o = novVar4.getCommons().o();
                            if (o != null) {
                                if (!o.f(this.q.j() != null ? (int) r15.getCurrentPosition() : -1)) {
                                    objArr = false;
                                    if (novVar4.H0() && objArr != false) {
                                        setMoveSticker(novVar4);
                                        this.q.c(size);
                                        invalidate();
                                        break;
                                    }
                                }
                            }
                            objArr = true;
                            if (novVar4.H0()) {
                                setMoveSticker(novVar4);
                                this.q.c(size);
                                invalidate();
                                break;
                                break;
                            }
                            continue;
                        }
                        i3++;
                    }
                }
            }
            if (this.D != null && motionEvent.getPointerCount() < this.D.getMovePointersCount()) {
                setMoveSticker(null);
            }
            this.E = x;
            this.F = y;
            this.G = System.currentTimeMillis();
            this.I = 0;
        } else {
            if (action == 1 || action == 3) {
                int i4 = this.E;
                i2 = -1;
                if (i4 != -1 && this.F != -1) {
                    int abs = Math.abs(i4 - x);
                    int i5 = j0;
                    if (abs < i5 && Math.abs(this.F - y) < i5 && System.currentTimeMillis() - this.G < 500) {
                        if (this.D != null && n() && this.w.d(this.D)) {
                            w();
                        } else {
                            nov novVar5 = this.D;
                            if ((novVar5 == null || novVar5.getMovePointersCount() > motionEvent.getPointerCount()) && (gVar = this.v) != null) {
                                gVar.onClick();
                            }
                        }
                    }
                }
                StoriesFeatures storiesFeatures = StoriesFeatures.IDEAS_STORY_VIEWER;
                storiesFeatures.getClass();
                if (!com.vk.toggle.b.A.a(storiesFeatures) ? !(this.I == 3 || !k(x, y)) : this.I == 2) {
                    nov novVar6 = this.D;
                    if (novVar6 != null) {
                        if (novVar6.v0()) {
                            t(this.D);
                        }
                        setMoveSticker(null);
                    }
                }
                j jVar = this.u;
                if (jVar != null) {
                    jVar.h(this.D);
                }
                v(true);
                w();
                if (this.Q) {
                    this.l.b();
                }
                setMoveSticker(null);
                z = !this.P && this.D == null && pointerCount > 1;
                L.e(lhg.a(pointerCount, "Pointers count: "));
                L.e("Need check intersection: " + z);
                if (z) {
                    z2 = false;
                    z3 = true;
                } else {
                    float x2 = motionEvent.getX(0);
                    float y2 = motionEvent.getY(0);
                    float x3 = motionEvent.getX(1);
                    float y3 = motionEvent.getY(1);
                    int i6 = i2;
                    float f2 = Float.MAX_VALUE;
                    int i7 = 0;
                    while (i7 < this.q.a.size()) {
                        nov novVar7 = this.q.a.get(i7);
                        if (novVar7.H0()) {
                            PointF[] fillPoints = novVar7.getFillPoints();
                            c2 = c3;
                            if (fillPoints.length != 4) {
                                break;
                            }
                            PointF pointF = this.a0;
                            pointF.set(x2, y2);
                            PointF pointF2 = this.b0;
                            pointF2.set(x3, y3);
                            bpn0 bpn0Var = z5l0.a;
                            z4 = z7;
                            z5 = z6;
                            if (z5l0.e(this.J, pointF, pointF2, fillPoints[z5 ? 1 : 0], fillPoints[2]) || z5l0.e(this.J, pointF, pointF2, fillPoints[z4 ? 1 : 0], fillPoints[c2])) {
                                PointF pointF3 = this.J;
                                float b2 = z5l0.b(x2, y2, pointF3.x, pointF3.y);
                                PointF pointF4 = this.J;
                                float max = Math.max(b2, z5l0.b(x3, y3, pointF4.x, pointF4.y));
                                if ((!(novVar7 instanceof blj) || !this.T) && (f2 > max || i7 > i6)) {
                                    setMoveSticker(novVar7);
                                    f2 = max;
                                    i6 = i7;
                                }
                            }
                        } else {
                            z5 = z6;
                            c2 = c3;
                            z4 = z7;
                        }
                        i7++;
                        c3 = c2;
                        z7 = z4;
                        z6 = z5;
                    }
                    z2 = z6;
                    z3 = z7;
                    if (this.D != null && i6 >= 0) {
                        invalidate();
                        this.q.c(i6);
                    }
                }
                novVar = this.D;
                if (novVar != null && novVar.d()) {
                    setMoveSticker(null);
                }
                this.H = motionEvent.getPointerCount();
                if (!this.U) {
                    this.B.a(motionEvent);
                    this.y.a(motionEvent);
                    this.z.c(motionEvent);
                    this.A.a(motionEvent);
                }
                this.c = z2;
                if (this.S || this.D != null) {
                    return z3;
                }
                return false;
            }
            if (action == 2) {
                if (System.currentTimeMillis() - this.G > 150 && (novVar3 = this.D) != null && !novVar3.d() && this.I != 3 && motionEvent.getPointerCount() >= this.D.getMovePointersCount()) {
                    if (this.I == 0) {
                        j jVar2 = this.u;
                        if (jVar2 != null) {
                            jVar2.g();
                        }
                        v(false);
                    }
                    int i8 = (k(x, y) && this.D.v0() && motionEvent.getPointerCount() <= this.D.getMovePointersCount()) ? 2 : 1;
                    if (i8 != this.I && this.u != null) {
                        if (i8 == 2) {
                            nov novVar8 = this.D;
                            if (!this.V) {
                                novVar8.setStickerAlpha(163);
                            }
                            vvr0.c();
                            this.u.a();
                        } else {
                            nov novVar9 = this.D;
                            if (!this.V) {
                                novVar9.setStickerAlpha(255);
                            }
                            this.u.c();
                        }
                        this.I = i8;
                    }
                }
                if (this.Q && (novVar2 = this.D) != null && !novVar2.d()) {
                    this.l.h(this.D, motionEvent);
                }
            }
        }
        i2 = -1;
        if (this.P) {
        }
        L.e(lhg.a(pointerCount, "Pointers count: "));
        L.e("Need check intersection: " + z);
        if (z) {
        }
        novVar = this.D;
        if (novVar != null) {
            setMoveSticker(null);
        }
        this.H = motionEvent.getPointerCount();
        if (!this.U) {
        }
        this.c = z2;
        if (this.S) {
        }
        return z3;
    }

    public final void p() {
        j(new w9l0(0));
    }

    public final void q() {
        j(new l140(15));
    }

    public final void r() {
        s();
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.q.a;
        for (int i2 = 0; i2 != copyOnWriteArrayList.size(); i2++) {
            nov novVar = copyOnWriteArrayList.get(i2);
            if (novVar instanceof t690) {
                ((RLottieDrawable) ((t690) novVar).h.b).k();
            }
            if (novVar instanceof lo9) {
                ((lo9) novVar).w();
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 != childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof grt0) {
                ((grt0) childAt).y();
            }
            if (childAt instanceof nov) {
                removeView(childAt);
            }
        }
    }

    public void setAuthorNameForRepost(String str) {
        Iterator<nov> it = this.q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (next instanceof z7c0) {
                ((z7c0) next).n.setText(str);
            }
            if (next instanceof lba0) {
                ((lba0) next).l.setText(str);
            }
            if (next instanceof r4g0) {
                ((r4g0) next).m.setText(str);
            }
        }
    }

    public void setBackgroundState(Bitmap bitmap) {
        VKImageView vKImageView = this.s;
        if (vKImageView != null) {
            vKImageView.setImageBitmap(bitmap);
            t8l0 t8l0Var = this.t;
            if (t8l0Var != null) {
                t8l0Var.b = null;
                t8l0Var.c = null;
                t8l0Var.a = bitmap;
            }
        }
        invalidate();
    }

    public void setDrawingSemiTransparent(boolean z) {
        zrl0 zrl0Var = this.r;
        if (zrl0Var != null) {
            if (z) {
                zrl0Var.i = Color.argb(163, 0, 0, 0);
            } else {
                zrl0Var.i = Color.argb(255, 0, 0, 0);
            }
        }
    }

    public void setDrawingState(vlo vloVar) {
        if (this.r == null) {
            zrl0 zrl0Var = new zrl0(getContext(), 0);
            zrl0 zrl0Var2 = this.r;
            if (zrl0Var2 != null) {
                removeView(zrl0Var2);
            }
            this.r = zrl0Var;
            zrl0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            addView(this.r);
        }
        this.r.b(vloVar);
    }

    public void setGuidesDrawer(@Nullable ial0 ial0Var) {
        this.l = ial0Var;
    }

    public void setInterceptTouchListener(View.OnTouchListener onTouchListener) {
        this.C = onTouchListener;
    }

    public void setLockAllStickersMovement(boolean z) {
        this.U = z;
    }

    public void setLockContentStickers(boolean z) {
        this.T = z;
    }

    public void setLockStickersAlpha(boolean z) {
        this.V = z;
    }

    public void setMoveAllowedPointersCount(int i2) {
        this.y.d = i2;
    }

    public void setNeedRequestAudioFocus(boolean z) {
        this.L = z;
        Iterator<nov> it = this.q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (next instanceof grt0) {
                ((grt0) next).setNeedRequestAudioFocus(z);
                s3q0 s3q0Var = s3q0.a;
            }
            if (next instanceof r4g0) {
                ((r4g0) next).getVideo().setNeedRequestAudioFocus(z);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    public void setOnEmptySpaceClickListener(@NonNull g gVar) {
        this.v = gVar;
    }

    public void setOnStickerMoveListener(@Nullable j jVar) {
        this.u = jVar;
    }

    public void setStickerFlingListener(@Nullable k kVar) {
        this.d0 = kVar;
    }

    public void setStickerListener(@Nullable l lVar) {
        this.x = lVar;
    }

    public void setStickersAboveDrawingSemiTransparent(boolean z) {
        for (int size = this.q.a.size() - 1; size >= 0; size--) {
            nov novVar = this.q.a.get(size);
            if (novVar.getStickerLayerType() < 4) {
                break;
            }
            int i2 = z ? 163 : 255;
            if (!this.V) {
                novVar.setStickerAlpha(i2);
            }
        }
        invalidate();
    }

    public void setStickersActionsDelegate(@NonNull r9l0 r9l0Var) {
        this.d = r9l0Var;
        setOnStickerMoveListener(r9l0Var);
        setOnEmptySpaceClickListener(r9l0Var);
        setOnEmptySpaceLongPressListener(r9l0Var);
        setOnStickerClickListener(r9l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStickersState(@NonNull zcl0 zcl0Var) {
        s();
        this.q = zcl0Var;
        Iterator<nov> it = zcl0Var.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            next.setInvalidator(new gkc0(this, 11));
            if (next instanceof View) {
                View view = (View) next;
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                h(view);
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            this.q.n(width, height);
            invalidate();
        }
        u();
        invalidate();
        this.e = new ov(this, 14);
    }

    public void setSupportMoveStickersByTwoFingers(boolean z) {
        this.P = z;
        if (z) {
            this.J = new PointF();
        }
    }

    public void setSupportViewOffset(boolean z) {
        this.O = z;
    }

    public void setTouchEnabled(boolean z) {
        this.N = z;
    }

    public void setTouchFalseIfNoSticker(boolean z) {
        this.S = z;
    }

    public void setUseOutsideAreasAsRemoveAreas(boolean z) {
        this.W = z;
    }

    public void setVideoStickersMute(boolean z) {
        this.K = z;
        Iterator<nov> it = this.q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (next instanceof grt0) {
                ((grt0) next).setMute(z);
                s3q0 s3q0Var = s3q0.a;
            }
            if (next instanceof r4g0) {
                ((r4g0) next).getVideo().setMute(z);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    public void setVideoStickersVolume(float f2) {
        this.M = f2;
        Iterator<nov> it = this.q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (next instanceof grt0) {
                ((grt0) next).setVolume(f2);
                s3q0 s3q0Var = s3q0.a;
            }
            if (next instanceof r4g0) {
                ((r4g0) next).getVideo().setVolume(f2);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(nov novVar) {
        this.q.w(novVar);
        if (novVar instanceof View) {
            removeView((View) novVar);
        }
        u();
        if (novVar instanceof v800) {
            ((v800) novVar).h.a();
        }
        l lVar = this.x;
        if (lVar != null) {
            lVar.f(novVar);
        }
        setKeepScreenOn(this.q.u());
        w();
        invalidate();
    }

    public final void u() {
        nov novVar;
        int p;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.q.a;
        int i2 = 0;
        while (true) {
            if (i2 == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            } else {
                if (copyOnWriteArrayList.get(i2).z0()) {
                    novVar = copyOnWriteArrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        boolean z = (novVar == null && this.q.j() == null) ? false : true;
        gn2 gn2Var = this.m;
        gn2Var.e = z;
        gn2Var.b();
        if (z) {
            List<nov> currentStickers = getCurrentStickers();
            int i3 = 30;
            for (int i4 = 0; i4 != currentStickers.size(); i4++) {
                if ((currentStickers.get(i4) instanceof lg2) && i3 > (p = ((lg2) currentStickers.get(i4)).p())) {
                    i3 = p;
                }
            }
            gn2Var.g = i3 - 6;
        }
    }

    public final void v(boolean z) {
        Iterator<nov> it = this.q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (next instanceof z7c0) {
                ((z7c0) next).setMetaHeaderVisibility(z);
            }
            if (next instanceof lba0) {
                ((lba0) next).setMetaHeaderVisibility(z);
            }
            if (next instanceof r4g0) {
                ((r4g0) next).setMetaHeaderVisibility(z);
            }
        }
    }

    public final void w() {
        this.i0.invalidateRoot();
    }

    public void setBackgroundState(Drawable drawable) {
        VKImageView vKImageView = this.s;
        if (vKImageView != null) {
            vKImageView.setImageDrawable(drawable);
            t8l0 t8l0Var = this.t;
            if (t8l0Var != null) {
                t8l0Var.a = null;
                t8l0Var.c = null;
                t8l0Var.b = drawable;
            }
        }
        invalidate();
    }

    public void setBackgroundState(int i2) {
        VKImageView vKImageView = this.s;
        if (vKImageView != null) {
            vKImageView.setBackgroundColor(i2);
            t8l0 t8l0Var = this.t;
            if (t8l0Var != null) {
                t8l0Var.a = null;
                t8l0Var.b = null;
                t8l0Var.c = Integer.valueOf(i2);
            }
        }
        invalidate();
    }

    public void setBackgroundState(t8l0 t8l0Var) {
        if (this.s != null) {
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
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public void setCallback(f fVar) {
    }

    public void setOnEmptySpaceLongPressListener(@NonNull h hVar) {
    }

    public StickersDrawingViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -iah0.a(88);
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = new a();
        this.j = new Rect();
        this.k = new Rect();
        this.l = null;
        this.m = new gn2(this);
        this.n = new ArrayList<>();
        this.o = new ArrayList();
        this.p = new HashSet();
        this.q = new zcl0();
        this.E = -1;
        this.F = -1;
        this.G = -1L;
        this.J = new PointF();
        this.K = false;
        this.L = true;
        this.M = 1.0f;
        this.N = true;
        this.O = false;
        this.P = true;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = true;
        this.a0 = new PointF();
        this.b0 = new PointF();
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            this.R = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            l(context);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
