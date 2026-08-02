package com.vk.clips.design.view.timeline;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Scroller;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.editor.timeline.entity.Animation;
import com.vk.editor.timeline.entity.Edge;
import com.vk.editor.timeline.state.TracksFilter;
import com.vk.media.MediaUtils;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.acs;
import xsna.ads;
import xsna.afs;
import xsna.am;
import xsna.b05;
import xsna.bfs;
import xsna.bfs.a;
import xsna.bmk;
import xsna.c5g;
import xsna.ckt0;
import xsna.cxo0;
import xsna.dbj0;
import xsna.dn70;
import xsna.e43;
import xsna.e5;
import xsna.efl;
import xsna.epx;
import xsna.fot;
import xsna.ftm;
import xsna.fxo0;
import xsna.g05;
import xsna.g2f;
import xsna.g7;
import xsna.gip0;
import xsna.gom;
import xsna.gp6;
import xsna.gwo0;
import xsna.gxo0;
import xsna.gzs;
import xsna.h7i0;
import xsna.hfm0;
import xsna.iah0;
import xsna.igs;
import xsna.ik;
import xsna.iu4;
import xsna.iut0;
import xsna.iwo0;
import xsna.izs;
import xsna.j5g;
import xsna.jfp0;
import xsna.k05;
import xsna.kcj0;
import xsna.kcw0;
import xsna.l6n0;
import xsna.lj5;
import xsna.mwe0;
import xsna.mwo0;
import xsna.mz;
import xsna.n290;
import xsna.n9m0;
import xsna.oh;
import xsna.org0;
import xsna.oy4;
import xsna.oz;
import xsna.ph3;
import xsna.pwo0;
import xsna.qcy;
import xsna.qpj;
import xsna.qto0;
import xsna.r7l0;
import xsna.rwo0;
import xsna.s3q0;
import xsna.shh0;
import xsna.swe0;
import xsna.swo0;
import xsna.tb;
import xsna.tf;
import xsna.vd7;
import xsna.vwo0;
import xsna.wm4;
import xsna.wwo0;
import xsna.wzs;
import xsna.x8a;
import xsna.xm4;
import xsna.y9q;
import xsna.ym4;
import xsna.ywo0;
import xsna.z4h0;
import xsna.z6l;
import xsna.zes;

/* compiled from: TimelineView.kt */
/* loaded from: classes16.dex */
public final class TimelineView extends View implements GestureDetector.OnGestureListener {
    public static final /* synthetic */ int y = 0;
    public final RectF b;
    public final Rect c;
    public final a d;
    public final mwo0 e;
    public final bfs f;
    public final vwo0 g;
    public final qto0 h;
    public final k05 i;
    public final gip0 j;
    public final org0 k;
    public final igs l;
    public final mwe0 m;
    public final bmk n;
    public final z6l o;
    public final n290 p;
    public final xm4 q;
    public final wm4 r;
    public final kcw0 s;
    public final ScaleGestureDetector t;
    public final fot u;
    public final ads v;
    public boolean w;
    public final ym4 x;

    /* compiled from: TimelineView.kt */
    public final class a extends y9q {
        public a() {
            super(TimelineView.this);
        }

        public final ListBuilder a() {
            ListBuilder e = e43.e();
            TimelineView timelineView = TimelineView.this;
            igs igsVar = timelineView.l;
            gip0 gip0Var = timelineView.j;
            ywo0 ywo0Var = igsVar.b;
            List<ckt0> list = ywo0Var.f;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            int i = 0;
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                arrayList.add(new igs.a(1000 + i2, (ckt0) obj, i2, ywo0Var.f.size(), igsVar.a));
                i2 = i3;
            }
            e.addAll(arrayList);
            ArrayList v = c5g.v(timelineView.getState().g);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = v.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof oy4) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                jfp0 e2 = gip0Var.e((gp6) next2);
                if (e2 != null) {
                    e2.g = i4 + 2000;
                }
                if (e2 != null) {
                    e2.i = timelineView.getContext().getString(R.string.accessibility_timeline_audio_fragment, Integer.valueOf(i5), Integer.valueOf(arrayList2.size()));
                }
                if (e2 != null) {
                    e.add(e2);
                }
                i4 = i5;
            }
            ArrayList v2 = c5g.v(timelineView.getState().g);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = v2.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                if (next3 instanceof r7l0) {
                    arrayList3.add(next3);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object next4 = it4.next();
                int i6 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                jfp0 e3 = gip0Var.e((gp6) next4);
                if (e3 != null) {
                    e3.g = i + IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
                }
                if (e3 != null) {
                    e3.i = timelineView.getContext().getString(R.string.accessibility_timeline_sticker_fragment, Integer.valueOf(i6), Integer.valueOf(arrayList3.size()));
                }
                if (e3 != null) {
                    e.add(e3);
                }
                i = i6;
            }
            e.addAll(Collections.singletonList(timelineView.h));
            return e.g();
        }

        @Override // xsna.y9q
        public final int getVirtualViewAt(float f, float f2) {
            Object obj;
            ListIterator listIterator = a().listIterator(0);
            while (true) {
                ListBuilder.a aVar = (ListBuilder.a) listIterator;
                if (!aVar.hasNext()) {
                    obj = null;
                    break;
                }
                obj = aVar.next();
                if (((ik) obj).d.contains(f, f2)) {
                    break;
                }
            }
            ik ikVar = (ik) obj;
            if (ikVar != null) {
                return ikVar.e();
            }
            return -1;
        }

        @Override // xsna.y9q
        public final void getVisibleVirtualViews(List<Integer> list) {
            if (list == null) {
                return;
            }
            ListBuilder a = a();
            ArrayList arrayList = new ArrayList(c5g.u(a, 10));
            ListIterator listIterator = a.listIterator(0);
            while (true) {
                ListBuilder.a aVar = (ListBuilder.a) listIterator;
                if (!aVar.hasNext()) {
                    list.addAll(arrayList);
                    return;
                }
                arrayList.add(Integer.valueOf(((ik) aVar.next()).e()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [xsna.ckt0] */
        /* JADX WARN: Type inference failed for: r2v3, types: [xsna.gp6] */
        /* JADX WARN: Type inference failed for: r2v4, types: [xsna.gp6] */
        /* JADX WARN: Type inference failed for: r2v6, types: [xsna.ckt0] */
        /* JADX WARN: Type inference failed for: r2v8, types: [xsna.gp6] */
        /* JADX WARN: Type inference failed for: r2v9, types: [xsna.gp6] */
        /* JADX WARN: Type inference failed for: r6v3, types: [xsna.mwo0] */
        /* JADX WARN: Type inference failed for: r6v4, types: [xsna.mwo0] */
        @Override // xsna.y9q
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            Object obj;
            ckt0 a;
            ckt0 a2;
            ListIterator listIterator = a().listIterator(0);
            while (true) {
                ListBuilder.a aVar = (ListBuilder.a) listIterator;
                if (!aVar.hasNext()) {
                    obj = null;
                    break;
                }
                obj = aVar.next();
                if (((ik) obj).e() == i) {
                    break;
                }
            }
            ik ikVar = (ik) obj;
            if (ikVar != null) {
                if (ikVar instanceof jfp0) {
                    jfp0 jfp0Var = (jfp0) ikVar;
                    ?? r6 = jfp0Var.a;
                    RectF rectF = jfp0Var.d;
                    if (i2 == 16) {
                        float centerX = rectF.centerX();
                        float centerY = rectF.centerY();
                        ywo0 ywo0Var = r6.d;
                        Iterator<ckt0> it = ywo0Var.f.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                a2 = ywo0Var.a(centerX, centerY);
                                break;
                            }
                            a2 = it.next();
                            if (a2.l.contains(centerX, centerY)) {
                                break;
                            }
                        }
                        r6.e(a2);
                        r6.a();
                        return true;
                    }
                    if (i2 == 32) {
                        r6.b(rectF.centerX(), rectF.centerY());
                        return true;
                    }
                } else if (ikVar instanceof igs.a) {
                    igs.a aVar2 = (igs.a) ikVar;
                    ?? r62 = aVar2.a;
                    ckt0 ckt0Var = aVar2.h;
                    if (i2 == 16) {
                        float centerX2 = ckt0Var.l.centerX();
                        float centerY2 = ckt0Var.l.centerY();
                        ywo0 ywo0Var2 = r62.d;
                        Iterator<ckt0> it2 = ywo0Var2.f.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                a = ywo0Var2.a(centerX2, centerY2);
                                break;
                            }
                            a = it2.next();
                            if (a.l.contains(centerX2, centerY2)) {
                                break;
                            }
                        }
                        r62.e(a);
                        r62.a();
                        return true;
                    }
                    if (i2 == 32) {
                        r62.b(ckt0Var.l.centerX(), ckt0Var.l.centerY());
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // xsna.y9q
        public final void onPopulateNodeForVirtualView(int i, am amVar) {
            Object obj;
            ListIterator listIterator = a().listIterator(0);
            while (true) {
                ListBuilder.a aVar = (ListBuilder.a) listIterator;
                if (!aVar.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = aVar.next();
                    if (((ik) obj).e() == i) {
                        break;
                    }
                }
            }
            ik ikVar = (ik) obj;
            if (ikVar == null) {
                amVar.t(false);
                amVar.r("");
                amVar.j(new Rect(0, 0, 1, 1));
                return;
            }
            if (ikVar instanceof jfp0) {
                jfp0 jfp0Var = (jfp0) ikVar;
                RectF rectF = jfp0Var.d;
                if (rectF.isEmpty()) {
                    amVar.t(false);
                    amVar.r("");
                    amVar.j(new Rect(0, 0, 1, 1));
                    return;
                }
                amVar.t(true);
                amVar.o(true);
                amVar.r(jfp0Var.i);
                Rect rect = new Rect();
                rectF.roundOut(rect);
                amVar.j(rect);
                amVar.a(1);
                amVar.a(16);
                return;
            }
            if (ikVar instanceof igs.a) {
                igs.a aVar2 = (igs.a) ikVar;
                ckt0 ckt0Var = aVar2.h;
                if (ckt0Var.l.isEmpty()) {
                    amVar.t(false);
                    amVar.r("");
                    amVar.j(new Rect(0, 0, 1, 1));
                    return;
                }
                amVar.t(true);
                amVar.o(true);
                amVar.a.setLongClickable(true);
                amVar.r(aVar2.f());
                RectF rectF2 = ckt0Var.l;
                Rect rect2 = new Rect();
                rectF2.roundOut(rect2);
                amVar.j(rect2);
                amVar.a(1);
                amVar.a(16);
                amVar.a(32);
                return;
            }
            int d = ikVar.d();
            RectF rectF3 = ikVar.d;
            if (d == 1) {
                amVar.t(true);
                amVar.r(ikVar.f());
                Rect rect3 = new Rect();
                rectF3.roundOut(rect3);
                amVar.j(rect3);
                amVar.a(1);
                return;
            }
            if (d != 16) {
                amVar.t(false);
                amVar.r("");
                amVar.j(new Rect(0, 0, 1, 1));
                return;
            }
            amVar.t(true);
            amVar.o(true);
            amVar.r(ikVar.f());
            Rect rect4 = new Rect();
            rectF3.roundOut(rect4);
            amVar.j(rect4);
            amVar.a(16);
        }
    }

    /* compiled from: TimelineView.kt */
    public final class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public b() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            mwo0 mwo0Var = TimelineView.this.e;
            ywo0 ywo0Var = mwo0Var.d;
            z4h0 z4h0Var = ywo0Var.r;
            float f = 1.0f;
            if (scaleFactor == 1.0f) {
                z4h0Var.getClass();
                return true;
            }
            float f2 = z4h0Var.b * scaleFactor;
            int i = z4h0Var.a;
            long[] jArr = z4h0.f;
            if (i == 7 && f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 >= (i < 7 ? z4h0Var.b() / jArr[z4h0Var.a + 1] : 2.0f)) {
                i = Math.min(z4h0Var.a + 1, 7);
            } else if (f2 < 1.0f) {
                int i2 = z4h0Var.a;
                if (i2 != 0) {
                    i = Math.max(i2 - 1, 0);
                    f = jArr[z4h0Var.a - 1] / z4h0Var.b();
                }
            } else {
                f = f2;
            }
            if (z4h0Var.b == f && i == z4h0Var.a) {
                return true;
            }
            z4h0Var.b = f;
            z4h0Var.a = i;
            z4h0Var.a();
            int d = (int) ywo0Var.r.d(ywo0Var.e);
            ywo0Var.c = d;
            if (ywo0Var.a > d) {
                ywo0Var.a = d;
            }
            ywo0Var.m();
            ywo0Var.o();
            ywo0Var.n();
            mwo0Var.a();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            int i = TimelineView.y;
            TimelineView timelineView = TimelineView.this;
            if (timelineView.b() || timelineView.x.c != ym4.a.IDLE) {
                return false;
            }
            vwo0 vwo0Var = timelineView.g;
            vwo0Var.b.forceFinished(true);
            vwo0Var.b(vwo0.a.IDLE);
            rwo0 rwo0Var = timelineView.e.j;
            if (rwo0Var != null) {
                rwo0Var.j();
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            rwo0 rwo0Var = TimelineView.this.e.j;
        }
    }

    public TimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new RectF();
        this.c = new Rect();
        a aVar = new a();
        this.d = aVar;
        mwo0 mwo0Var = new mwo0(context, this, new vd7(this));
        this.e = mwo0Var;
        bfs bfsVar = new bfs(mwo0Var);
        this.f = bfsVar;
        this.g = new vwo0(mwo0Var);
        this.h = new qto0(mwo0Var);
        g05 g05Var = new g05(mwo0Var);
        k05 k05Var = new k05(mwo0Var);
        this.i = k05Var;
        this.j = new gip0(mwo0Var, g05Var, k05Var);
        this.k = new org0(mwo0Var);
        this.l = new igs(mwo0Var, bfsVar);
        this.m = new mwe0(mwo0Var);
        this.n = new bmk(mwo0Var);
        z6l z6lVar = new z6l(mwo0Var);
        new RectF();
        new RectF();
        Edge edge = Edge.None;
        mwo0Var.d.getClass();
        this.o = z6lVar;
        this.p = new n290(mwo0Var);
        this.q = new xm4(mwo0Var);
        this.r = new wm4(mwo0Var, g05Var);
        this.s = new kcw0(mwo0Var);
        this.t = new ScaleGestureDetector(context, new b());
        this.v = new ads(mwo0Var, z6lVar);
        int i = 5;
        this.x = new ym4(mwo0Var, new l6n0(this, i), new hfm0(this, i));
        this.u = new fot(context, this, null);
        iut0.q(this, aVar);
    }

    private final float getMarginBottomRule() {
        return this.j.a.d.f(TracksFilter.ALL) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? igs.r : org0.l;
    }

    public final boolean b() {
        return this.v.i || this.x.c != ym4.a.IDLE;
    }

    public final void c() {
        int size = getItems().size();
        setContentDescription(size > 0 ? getContext().getString(R.string.accessibility_timeline_with_fragment_count, Integer.valueOf(size)) : null);
    }

    @Override // android.view.View
    public final void computeScroll() {
        ym4 ym4Var = this.x;
        Scroller scroller = ym4Var.h;
        if (!scroller.isFinished()) {
            scroller.computeScrollOffset();
            int currX = scroller.getCurrX();
            if (ym4Var.d == 0) {
                ym4Var.d = scroller.getStartX();
            }
            ym4Var.d(currX - ym4Var.d);
            ym4Var.d = currX;
            if (scroller.isFinished()) {
                ym4Var.e(ym4.a.IDLE);
            }
        }
        vwo0 vwo0Var = this.g;
        Scroller scroller2 = vwo0Var.b;
        if (scroller2.isFinished()) {
            return;
        }
        scroller2.computeScrollOffset();
        int currX2 = scroller2.getCurrX();
        int currY = scroller2.getCurrY();
        if (vwo0Var.d == 0) {
            vwo0Var.d = scroller2.getStartX();
        }
        if (vwo0Var.e == 0) {
            vwo0Var.e = scroller2.getStartY();
        }
        vwo0Var.a(currX2 - vwo0Var.d, currY - vwo0Var.e);
        vwo0Var.d = currX2;
        vwo0Var.e = currY;
        if (scroller2.isFinished()) {
            vwo0Var.b(vwo0.a.IDLE);
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.d.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.d.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getAreControlsLocked() {
        return !(getState().l instanceof swo0.a);
    }

    public final ywo0.a getCursorItemInfo() {
        Integer num;
        ywo0 state = getState();
        gp6 gp6Var = state.w;
        if (gp6Var == null || (num = state.y) == null) {
            return null;
        }
        return new ywo0.a(num.intValue(), gp6Var.E() + state.x, gp6Var);
    }

    public final oy4 getEditingAudioItem() {
        return getState().e();
    }

    public final List<ckt0> getItems() {
        return getState().f;
    }

    public final gp6 getSelectedItem() {
        return getState().j;
    }

    public final wwo0 getSettings() {
        return getState().k;
    }

    public final ywo0 getState() {
        return this.e.d;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x086b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        long j;
        float f;
        long j2;
        ckt0 ckt0Var;
        int save;
        float f2;
        igs igsVar;
        int i;
        float f3;
        int i2;
        float f4;
        Path path;
        RectF rectF;
        z4h0 z4h0Var;
        Iterator<ckt0> it;
        bfs.a aVar;
        int i3;
        ckt0 ckt0Var2;
        Bitmap value;
        int i4;
        TimelineView timelineView = this;
        super.onDraw(canvas);
        qto0 qto0Var = timelineView.h;
        qto0Var.b.getClass();
        Paint paint = qto0Var.q;
        Paint paint2 = qto0Var.t;
        mwo0 mwo0Var = qto0Var.a;
        long max = Math.max(mwo0Var.d.s, 0L);
        if (max != qto0Var.i) {
            qto0Var.i = max;
            StringBuilder sb = cxo0.a;
            StringBuilder sb2 = cxo0.a;
            sb2.setLength(0);
            sb2.append(JwtParser.SEPARATOR_CHAR);
            j = 0;
            sb2.append((max % 1000) / 100);
            qto0Var.l = sb2.toString();
            String a2 = cxo0.a(max, false, false);
            qto0Var.k = a2;
            qto0Var.n = paint.measureText(a2);
            qto0Var.o = paint2.measureText(qto0Var.l);
        } else {
            j = 0;
        }
        long j3 = mwo0Var.d.e;
        if (j3 != qto0Var.j) {
            qto0Var.j = j3;
            StringBuilder sb3 = cxo0.a;
            String a3 = cxo0.a(j3, true, true);
            qto0Var.m = a3;
            qto0Var.p = paint2.measureText(a3);
        }
        RectF rectF2 = qto0Var.d;
        float f5 = rectF2.left + qto0.z;
        float f6 = qto0.v;
        Paint.FontMetrics fontMetrics = qto0Var.u;
        float f7 = rectF2.top + (((f6 - fontMetrics.descent) - fontMetrics.ascent) / 2.0f);
        canvas.drawText(qto0Var.k, f5, f7, paint);
        float f8 = f5 + qto0Var.n;
        paint2.setColor(qto0Var.r);
        canvas.drawText(qto0Var.l, f8, f7, paint2);
        float f9 = f8 + qto0Var.o;
        paint2.setColor(qto0Var.s);
        canvas.drawText(qto0Var.m, f9, f7, paint2);
        if (timelineView.getState().i()) {
            org0 org0Var = timelineView.k;
            ywo0 ywo0Var = org0Var.b;
            if (ywo0Var.i()) {
                org0Var.b.getClass();
                Paint paint3 = org0Var.h;
                float f10 = org0Var.d.top + org0Var.i;
                int i5 = ywo0Var.c;
                RectF rectF3 = ywo0Var.o;
                z4h0 z4h0Var2 = ywo0Var.r;
                float f11 = i5;
                f = 2.0f;
                j2 = 1000;
                int min = (int) (Math.min(Math.max(ywo0Var.a - rectF3.centerX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), f11) / z4h0Var2.e);
                int min2 = ((int) (Math.min(rectF3.centerX() + ywo0Var.a, f11) / z4h0Var2.e)) + 1;
                int i6 = ((min2 - min) + 1) * 8;
                if (org0Var.j.length < i6) {
                    org0Var.j = new float[i6];
                }
                float d = ywo0Var.d();
                float f12 = f11 + d;
                StringBuilder sb4 = cxo0.a;
                String b2 = cxo0.b(z4h0Var2.b() * min);
                float measureText = paint3.measureText(b2);
                if (min <= min2) {
                    int i7 = 0;
                    while (true) {
                        float f13 = (min * z4h0Var2.e) + d;
                        float f14 = measureText / 2.0f;
                        if (f13 - f14 > f12) {
                            break;
                        }
                        canvas.drawText(b2, f13, f10, paint3);
                        StringBuilder sb5 = cxo0.a;
                        int i8 = min + 1;
                        float f15 = f10;
                        String b3 = cxo0.b(z4h0Var2.b() * i8);
                        float measureText2 = paint3.measureText(b3);
                        float f16 = ((z4h0Var2.e - (measureText2 / 2.0f)) - f14) / 5;
                        float f17 = f13 + f14;
                        int i9 = 0;
                        while (i9 < 4) {
                            f17 += f16;
                            if (f17 > f12) {
                                break;
                            }
                            float[] fArr = org0Var.j;
                            int i10 = i7 + 1;
                            fArr[i7] = f17;
                            i7 += 2;
                            fArr[i10] = (paint3.getFontMetrics().descent / 2.0f) + (paint3.getFontMetrics().ascent / 2.0f) + f15;
                            i9++;
                            d = d;
                        }
                        float f18 = d;
                        if (min == min2) {
                            break;
                        }
                        b2 = b3;
                        measureText = measureText2;
                        min = i8;
                        f10 = f15;
                        d = f18;
                    }
                    i4 = i7;
                } else {
                    i4 = 0;
                }
                canvas.drawPoints(org0Var.j, 0, i4, org0Var.g);
            } else {
                f = 2.0f;
                j2 = 1000;
            }
            gip0 gip0Var = timelineView.j;
            RectF rectF4 = gip0Var.d;
            ywo0 ywo0Var2 = gip0Var.b;
            if (ywo0Var2.i()) {
                save = canvas.save();
                canvas.clipRect(rectF4);
                ywo0.b bVar = ywo0Var2.n;
                ywo0.b.C4142b c4142b = bVar instanceof ywo0.b.C4142b ? (ywo0.b.C4142b) bVar : null;
                gp6 gp6Var = c4142b != null ? c4142b.a : null;
                ArrayList arrayList = new ArrayList();
                for (List<gp6> list : j5g.y0(ywo0Var2.g)) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((gp6) it2.next()).J()) {
                                arrayList.add(list);
                                break;
                            }
                        }
                    }
                    for (gp6 gp6Var2 : list) {
                        if (!epx.f(gp6Var2.m(), gp6Var != null ? gp6Var.m() : null)) {
                            gip0Var.d(gp6Var2, canvas);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    float f19 = rectF4.bottom;
                    float f20 = ywo0Var2.f(TracksFilter.ONLY_FIXED);
                    RectF rectF5 = ywo0Var2.o;
                    float f21 = f19 - f20;
                    float f22 = gip0.o;
                    RectF rectF6 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f21 + f22, iah0.f().widthPixels, rectF4.bottom);
                    RectF rectF7 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF6.top - f22, iah0.f().widthPixels, ywo0Var2.q.bottom);
                    Paint paint4 = gip0Var.l;
                    paint4.setShader(new LinearGradient(rectF5.centerX(), rectF6.top - f22, rectF5.centerX(), rectF6.top, 0, -16777216, Shader.TileMode.REPEAT));
                    canvas.drawRect(rectF6, gip0Var.k);
                    canvas.drawRect(rectF7, paint4);
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    for (gp6 gp6Var3 : (List) it3.next()) {
                        if (!epx.f(gp6Var3.m(), gp6Var != null ? gp6Var.m() : null)) {
                            gip0Var.d(gp6Var3, canvas);
                        }
                    }
                }
                if (gp6Var != null) {
                    gip0Var.d(gp6Var, canvas);
                }
            }
            igs igsVar2 = timelineView.l;
            igsVar2.f.setColor(1157562623);
            igsVar2.b.getClass();
            float f23 = igs.o;
            float f24 = igs.m;
            RectF rectF8 = igsVar2.l;
            Path path2 = igsVar2.h;
            RectF rectF9 = igsVar2.k;
            int save2 = canvas.save();
            RectF rectF10 = igsVar2.d;
            canvas.clipRect(rectF10);
            ywo0 ywo0Var3 = igsVar2.b;
            List<ckt0> list3 = ywo0Var3.f;
            z4h0 z4h0Var3 = ywo0Var3.r;
            Iterator<ckt0> it4 = list3.iterator();
            while (it4.hasNext()) {
                ckt0 next = it4.next();
                RectF rectF11 = next.l;
                ywo0 ywo0Var4 = ywo0Var2;
                float f25 = next.j;
                String str = next.i;
                if (RectF.intersects(rectF10, rectF11)) {
                    gip0 gip0Var2 = gip0Var;
                    igs igsVar3 = igsVar2;
                    String str2 = str;
                    int floor = (int) Math.floor(r0);
                    float f26 = ((next.b / z4h0Var3.c) - floor) * f24;
                    rectF9.set(rectF11);
                    igs igsVar4 = igsVar3;
                    rectF9.right = Math.max(rectF9.right - next.k, rectF9.left);
                    int save3 = canvas.save();
                    path2.rewind();
                    path2.addRoundRect(rectF9, f23, f23, Path.Direction.CCW);
                    canvas.clipPath(path2);
                    float f27 = (-f26) + rectF11.left;
                    float f28 = f27 + f24;
                    int ceil = ((int) Math.ceil(next.c / z4h0Var3.c)) - floor;
                    int i11 = 0;
                    while (i11 < ceil) {
                        rectF8.left = (int) f27;
                        rectF8.right = (int) f28;
                        float f29 = f28 + f24;
                        if (RectF.intersects(rectF10, rectF8)) {
                            f2 = f29;
                            igsVar = igsVar4;
                            i = ceil;
                            bfs bfsVar = igsVar.g;
                            f3 = f28;
                            i2 = i11;
                            f4 = f24;
                            long j4 = ((long) z4h0Var3.c) * (floor + i11);
                            bfsVar.getClass();
                            HashMap<String, bfs.a> hashMap = bfsVar.b;
                            path = path2;
                            String str3 = str2;
                            bfs.a aVar2 = hashMap.get(str3);
                            if (aVar2 == null) {
                                rectF = rectF10;
                                z4h0Var = z4h0Var3;
                                it = it4;
                                aVar = bfsVar.new a(str3, (long) (next.g * f25));
                                hashMap.put(str3, aVar);
                            } else {
                                rectF = rectF10;
                                z4h0Var = z4h0Var3;
                                it = it4;
                                aVar = aVar2;
                            }
                            long j5 = (long) (j4 * f25);
                            TreeMap<Long, Bitmap> treeMap = aVar.b;
                            final long j6 = j5 - (j5 % aVar.d);
                            HashMap<Long, bfs.b> hashMap2 = aVar.c;
                            bfs.b bVar2 = hashMap2.get(Long.valueOf(j6));
                            if ((bVar2 instanceof bfs.e) || (bVar2 instanceof bfs.d)) {
                                str2 = str3;
                                i3 = save2;
                                ckt0Var2 = next;
                            } else if (bVar2 instanceof bfs.c) {
                                value = ((bfs.c) bVar2).a;
                                str2 = str3;
                                i3 = save2;
                                ckt0Var2 = next;
                                if (value == null) {
                                    canvas.drawBitmap(value, rectF8.left, rectF8.top, (Paint) null);
                                } else {
                                    canvas.drawRect(rectF8, igsVar.j);
                                }
                            } else {
                                final efl eflVar = aVar.a;
                                bfs bfsVar2 = bfs.this;
                                str2 = str3;
                                g2f g2fVar = bfsVar2.a.k;
                                if (g2fVar == null) {
                                    eflVar.getClass();
                                    throw new IllegalStateException("utility provider isn't settled");
                                }
                                ckt0Var2 = next;
                                w wVar = eflVar.c;
                                if (wVar == null) {
                                    i3 = save2;
                                    wVar = g2fVar.e(1, "io-timeline-load-frames");
                                } else {
                                    i3 = save2;
                                }
                                eflVar.c = wVar;
                                hashMap2.put(Long.valueOf(j6), new bfs.e(new v(new Callable() { // from class: xsna.dfl
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        it80 it80Var;
                                        efl eflVar2 = efl.this;
                                        long j7 = j6;
                                        synchronized (eflVar2.b) {
                                            it80Var = new it80(MediaUtils.a.i(j7, (MediaMetadataRetriever) eflVar2.b.getValue(), efl.d));
                                        }
                                        return it80Var;
                                    }
                                }).q(wVar).l(new g7(new qpj(aVar, 11), 18)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tf(new gom(aVar, j6, bfsVar2), 24), new afs(new zes(aVar, j6), 0))));
                            }
                            Map.Entry<Long, Bitmap> floorEntry = treeMap.floorEntry(Long.valueOf(j6));
                            if (floorEntry == null) {
                                floorEntry = treeMap.ceilingEntry(Long.valueOf(j6));
                            }
                            value = floorEntry != null ? floorEntry.getValue() : null;
                            if (value == null) {
                            }
                        } else {
                            f2 = f29;
                            f3 = f28;
                            i2 = i11;
                            f4 = f24;
                            path = path2;
                            i3 = save2;
                            ckt0Var2 = next;
                            rectF = rectF10;
                            z4h0Var = z4h0Var3;
                            it = it4;
                            igsVar = igsVar4;
                            i = ceil;
                        }
                        i11 = i2 + 1;
                        ceil = i;
                        f28 = f2;
                        f24 = f4;
                        path2 = path;
                        rectF10 = rectF;
                        z4h0Var3 = z4h0Var;
                        it4 = it;
                        next = ckt0Var2;
                        save2 = i3;
                        igsVar4 = igsVar;
                        f27 = f3;
                    }
                    igs igsVar5 = igsVar4;
                    canvas.restoreToCount(save3);
                    canvas.drawRoundRect(rectF9, f23, f23, igsVar5.i);
                    igsVar2 = igsVar5;
                    ywo0Var2 = ywo0Var4;
                    gip0Var = gip0Var2;
                } else {
                    ywo0Var2 = ywo0Var4;
                }
            }
            gip0 gip0Var3 = gip0Var;
            ywo0 ywo0Var5 = ywo0Var2;
            canvas.restoreToCount(save2);
            swo0 swo0Var = getState().l;
            if (swo0Var instanceof swo0.b) {
                timelineView = this;
                n290 n290Var = timelineView.p;
                canvas.drawRect(n290Var.d, n290Var.g);
                xm4 xm4Var = timelineView.q;
                RectF rectF12 = xm4Var.d;
                StaticLayout staticLayout = xm4Var.h;
                if (staticLayout != null) {
                    save = canvas.save();
                    try {
                        canvas.translate(rectF12.centerX(), rectF12.top + xm4.i);
                        staticLayout.draw(canvas);
                        canvas.restoreToCount(save);
                    } finally {
                    }
                }
                wm4 wm4Var = timelineView.r;
                h7i0 h7i0Var = wm4Var.h;
                RectF rectF13 = wm4Var.d;
                ywo0 ywo0Var6 = wm4Var.b;
                oy4 e = ywo0Var6.e();
                z4h0 z4h0Var4 = ywo0Var6.r;
                if (e != null) {
                    RectF rectF14 = e.v;
                    rectF13.set(rectF14);
                    RectF rectF15 = h7i0Var.d;
                    rectF15.set(rectF14);
                    rectF15.right -= e.u;
                    s3q0 s3q0Var = s3q0.a;
                    h7i0Var.b();
                    Paint paint5 = wm4Var.m;
                    b05 a4 = wm4Var.g.a(e);
                    if (a4 != null) {
                        float f30 = e.g;
                        float f31 = e.t;
                        a4.c(0L, (long) (f30 * f31), z4h0Var4.d / f31);
                        float d2 = z4h0Var4.d(e.b);
                        save = canvas.save();
                        try {
                            canvas.translate(rectF13.left - d2, rectF13.top);
                            paint5.setColor(wm4Var.k);
                            canvas.drawLines(a4.c, 0, a4.d, paint5);
                            float[] fArr2 = a4.h != null ? a4.i : null;
                            if (fArr2 != null) {
                                paint5.setColor(wm4Var.l);
                                canvas.drawLines(fArr2, paint5);
                            }
                            Drawable drawable = wm4Var.i;
                            if (drawable != null) {
                                drawable.setBounds(wm4Var.d(a4, wm4Var.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                                drawable.setAlpha(ywo0Var6.m ? 102 : 255);
                                drawable.draw(canvas);
                            }
                            canvas.restoreToCount(save);
                        } finally {
                        }
                    }
                    h7i0Var.d(canvas);
                    StringBuilder sb6 = cxo0.a;
                    String a5 = cxo0.a(e.b, false, false);
                    String a6 = cxo0.a(e.c, false, false);
                    Paint paint6 = wm4Var.n;
                    float width = rectF13.width() - ((paint6.measureText(a5) + paint6.measureText(a6)) / f);
                    float f32 = rectF13.left;
                    float f33 = rectF13.right;
                    float f34 = wm4.q;
                    if (width < f34) {
                        float f35 = (f34 - width) / f;
                        f32 -= f35;
                        f33 += f35;
                    }
                    float f36 = h7i0Var.h.bottom + wm4.p + wm4Var.o;
                    canvas.drawText(a5, f32, f36, paint6);
                    canvas.drawText(a6, f33, f36, paint6);
                }
            } else {
                timelineView = this;
                if (swo0Var instanceof swo0.c) {
                    kcw0 kcw0Var = timelineView.s;
                    RectF rectF16 = kcw0Var.d;
                    ywo0 ywo0Var7 = kcw0Var.b;
                    swo0 swo0Var2 = ywo0Var7.l;
                    if (swo0Var2 instanceof swo0.c) {
                        canvas.drawRect(kcw0Var.g, kcw0Var.j);
                        if (((swo0.c) swo0Var2).b) {
                            oy4 e2 = ywo0Var7.e();
                            if (e2 != null) {
                                rectF16.set(e2.v);
                                s3q0 s3q0Var2 = s3q0.a;
                                RectF rectF17 = kcw0Var.i;
                                rectF17.top = rectF16.top;
                                rectF17.bottom = rectF16.bottom;
                                float f37 = kcw0Var.h.right;
                                rectF17.left = f37;
                                rectF17.right = f37 + dn70.b(40);
                                long duration = e2.getDuration();
                                canvas.drawText(String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(duration)), Long.valueOf((duration / 1000) % 60)}, 2)), rectF17.left + kcw0.n, ((kcw0Var.l / f) + rectF17.centerY()) - kcw0.m, kcw0Var.k);
                            }
                        }
                        ywo0Var7.getClass();
                    }
                    if (ywo0Var5.i()) {
                        save = canvas.save();
                        canvas.clipRect(gip0Var3.d);
                        oy4 e3 = ywo0Var5.e();
                        oy4 oy4Var = (e3 == null || !e3.r) ? null : e3;
                        if (oy4Var != null) {
                            gip0Var3.d(oy4Var, canvas);
                        }
                    }
                } else {
                    mwe0 mwe0Var = timelineView.m;
                    RectF rectF18 = mwe0Var.g;
                    Bitmap bitmap = mwe0Var.k;
                    RectF rectF19 = mwe0Var.d;
                    h7i0 h7i0Var2 = mwe0Var.n;
                    gp6 gp6Var4 = mwe0Var.b.j;
                    if (gp6Var4 != null) {
                        rectF19.set(gp6Var4.u().left, gp6Var4.u().top, gp6Var4.u().right - gp6Var4.I(), gp6Var4.u().bottom);
                        RectF rectF20 = h7i0Var2.d;
                        RectF rectF21 = h7i0Var2.h;
                        rectF20.set(rectF19);
                        h7i0Var2.b();
                        h7i0Var2.d(canvas);
                        boolean z = gp6Var4 instanceof r7l0;
                        if (z || gp6Var4.E() != j) {
                            Bitmap bitmap2 = mwe0Var.j;
                            if (bitmap2 != null) {
                                canvas.drawBitmap(bitmap2, ((h7i0.k / f) + rectF21.left) - (bitmap2.getWidth() / f), rectF21.centerY() - (bitmap2.getHeight() / 2), (Paint) null);
                            }
                        } else if (bitmap != null) {
                            canvas.drawBitmap(bitmap, ((h7i0.k / f) + rectF21.left) - (bitmap.getWidth() / f), rectF21.centerY() - (bitmap.getHeight() / 2), (Paint) null);
                        }
                        if (z || gp6Var4.x() != gp6Var4.G()) {
                            Bitmap bitmap3 = mwe0Var.i;
                            if (bitmap3 != null) {
                                canvas.drawBitmap(bitmap3, (rectF21.right - (h7i0.k / f)) - (bitmap3.getWidth() / f), rectF21.centerY() - (bitmap3.getHeight() / 2), (Paint) null);
                                if (gp6Var4.y()) {
                                    Paint paint7 = mwe0Var.m;
                                    Paint paint8 = mwe0Var.l;
                                    StringBuilder sb7 = cxo0.a;
                                    long duration2 = gp6Var4.getDuration();
                                    long j7 = duration2 / 60000;
                                    long j8 = (duration2 / j2) % 60;
                                    StringBuilder sb8 = cxo0.a;
                                    sb8.setLength(0);
                                    if (j7 != j) {
                                        sb8.append(j7);
                                        sb8.append(':');
                                    }
                                    sb8.append(j8);
                                    sb8.append(',');
                                    sb8.append((duration2 % j2) / 100);
                                    String sb9 = sb8.toString();
                                    float f38 = (mwe0.u * f) + mwe0.v;
                                    float measureText3 = (mwe0.t * f) + paint8.measureText(sb9);
                                    float f39 = rectF19.left;
                                    float f40 = mwe0.s;
                                    rectF18.left = f39 + f40;
                                    rectF18.bottom = rectF19.bottom - f40;
                                    rectF18.top = rectF19.bottom - f38;
                                    float f41 = rectF19.left + measureText3;
                                    rectF18.right = f41;
                                    float f42 = swe0.f((rectF19.right - f41) / (rectF18.width() / f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                    paint7.setAlpha((int) (mwe0Var.p * f42));
                                    paint8.setAlpha((int) (f42 * 255));
                                    save = canvas.save();
                                    try {
                                        canvas.clipRect(rectF19);
                                        float f43 = mwe0.r;
                                        canvas.drawRoundRect(rectF18, f43, f43, paint7);
                                        canvas.drawText(sb9, rectF18.centerX(), rectF18.centerY() + mwe0Var.o, paint8);
                                        canvas.restoreToCount(save);
                                    } finally {
                                    }
                                }
                                ckt0Var = !(gp6Var4 instanceof ckt0) ? (ckt0) gp6Var4 : null;
                                if (ckt0Var != null) {
                                    mwe0Var.h.a(canvas, ckt0Var.j, rectF19, rectF18.right, rectF18.centerY());
                                }
                            }
                            if (gp6Var4.y()) {
                            }
                            if (!(gp6Var4 instanceof ckt0)) {
                            }
                            if (ckt0Var != null) {
                            }
                        } else {
                            if (bitmap != null) {
                                canvas.drawBitmap(bitmap, (rectF21.right - (h7i0.k / f)) - (bitmap.getWidth() / f), rectF21.centerY() - (bitmap.getHeight() / 2), (Paint) null);
                                if (gp6Var4.y()) {
                                }
                                if (!(gp6Var4 instanceof ckt0)) {
                                }
                                if (ckt0Var != null) {
                                }
                            }
                            if (gp6Var4.y()) {
                            }
                            if (!(gp6Var4 instanceof ckt0)) {
                            }
                            if (ckt0Var != null) {
                            }
                        }
                    }
                }
            }
            timelineView.o.a.d.getClass();
        }
        bmk bmkVar = timelineView.n;
        RectF rectF22 = bmkVar.d;
        canvas.drawLine(rectF22.centerX(), rectF22.top, rectF22.centerX(), rectF22.bottom, bmkVar.g);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.t.isInProgress() || b() || this.x.c != ym4.a.IDLE) {
            return false;
        }
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        vwo0 vwo0Var = this.g;
        if (abs < abs2) {
            vwo0.a aVar = vwo0Var.c;
            vwo0.a aVar2 = vwo0.a.FLING_X;
            if (aVar != aVar2) {
                if (Math.abs(f2) <= Math.abs(f) && vwo0Var.c != vwo0.a.FLING_Y) {
                    return true;
                }
                mwo0 mwo0Var = vwo0Var.a;
                if (vwo0Var.c == aVar2) {
                    return true;
                }
                vwo0Var.e = 0;
                vwo0Var.d = 0;
                vwo0Var.b(vwo0.a.FLING_Y);
                Scroller scroller = vwo0Var.b;
                ywo0 ywo0Var = mwo0Var.d;
                scroller.fling(0, ywo0Var.b, 0, -((int) f2), 0, 0, ywo0Var.d, 0);
                mwo0Var.a();
                return true;
            }
        }
        mwo0 mwo0Var2 = vwo0Var.a;
        if (vwo0Var.c == vwo0.a.FLING_Y) {
            return true;
        }
        vwo0Var.d = 0;
        vwo0Var.e = 0;
        vwo0Var.b(vwo0.a.FLING_X);
        Scroller scroller2 = vwo0Var.b;
        ywo0 ywo0Var2 = mwo0Var2.d;
        scroller2.fling(ywo0Var2.a, 0, -((int) f), 0, 0, ywo0Var2.c, 0, 0);
        mwo0Var2.a();
        return true;
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.d.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.b;
        rectF.left = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.right = getWidth();
        rectF.bottom = getHeight();
        qto0 qto0Var = this.h;
        RectF rectF2 = qto0Var.d;
        rectF2.left = rectF.left + qto0.y;
        float f = qto0.w + rectF.top;
        rectF2.top = f;
        rectF2.right = rectF.right;
        rectF2.bottom = f + qto0.v;
        s3q0 s3q0Var = s3q0.a;
        qto0Var.b();
        igs igsVar = this.l;
        RectF rectF3 = igsVar.d;
        rectF3.left = rectF.left;
        rectF3.right = rectF.right;
        float f2 = rectF.bottom - igs.s;
        rectF3.bottom = f2;
        rectF3.top = f2 - igs.q;
        igsVar.b();
        gip0 gip0Var = this.j;
        RectF rectF4 = gip0Var.d;
        rectF4.left = rectF.left;
        rectF4.right = rectF.right;
        float f3 = igsVar.d.top;
        rectF4.bottom = f3;
        rectF4.top = (f3 - gip0Var.a.d.f(TracksFilter.ALL)) - getMarginBottomRule();
        org0 org0Var = this.k;
        RectF rectF5 = org0Var.d;
        rectF5.left = rectF.left;
        RectF rectF6 = gip0Var.d;
        float f4 = rectF6.top;
        rectF5.bottom = f4;
        rectF5.top = f4 - org0.k;
        rectF5.right = rectF.right;
        n9m0 n9m0Var = new n9m0(this, 8);
        bmk bmkVar = this.n;
        n9m0Var.invoke(bmkVar.d);
        RectF rectF7 = this.p.d;
        rectF7.left = rectF.left;
        rectF7.right = rectF.right;
        RectF rectF8 = org0Var.d;
        rectF7.top = rectF8.bottom;
        rectF7.bottom = rectF.bottom;
        kcw0 kcw0Var = this.s;
        RectF rectF9 = kcw0Var.g;
        rectF9.left = rectF.left;
        rectF9.right = rectF.right;
        rectF9.top = rectF8.bottom;
        RectF rectF10 = igsVar.d;
        rectF9.bottom = rectF10.top;
        kcw0Var.h.set(bmkVar.d);
        xm4 xm4Var = this.q;
        xm4Var.d.set(rectF10);
        xm4Var.b();
        mwo0 mwo0Var = this.e;
        ywo0 ywo0Var = mwo0Var.d;
        ywo0Var.o.set(rectF);
        ywo0Var.p.set(rectF10);
        ywo0Var.q.set(rectF6);
        ywo0Var.l(true);
        mwo0Var.a();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (getAreControlsLocked()) {
            return;
        }
        float x = motionEvent.getX();
        float y2 = motionEvent.getY();
        ads adsVar = this.v;
        mwo0 mwo0Var = adsVar.c;
        gp6 a2 = mwo0Var.d.a(x, y2);
        if (a2 != null) {
            ((PointF) adsVar.a).set(x, y2);
            if (a2.K() && a2.J()) {
                mwo0Var.e(null);
                this.e.b(motionEvent.getX(), motionEvent.getY());
            }
            acs acsVar = (acs) adsVar.f.getValue();
            mwo0 mwo0Var2 = acsVar.a;
            acsVar.c = false;
            lj5 lj5Var = acsVar.b;
            g2f g2fVar = lj5Var.a.k;
            if (g2fVar != null) {
                f<shh0> fVar = lj5Var.d.a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int i = 2;
                io.reactivex.rxjava3.disposables.c subscribe = new i0(fVar.y(3L, timeUnit).a0(g2fVar.d()), new iu4(new tb(lj5Var, 12), i)).subscribe(new ph3(new mz(lj5Var, 7), i));
                x8a x8aVar = lj5Var.f;
                qcy<Object>[] qcyVarArr = lj5.h;
                qcy<Object> qcyVar = qcyVarArr[0];
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) x8aVar.b;
                if (cVar != null) {
                    cVar.dispose();
                }
                x8aVar.b = subscribe;
                io.reactivex.rxjava3.disposables.c subscribe2 = lj5Var.e.a.y(3L, timeUnit).a0(g2fVar.d()).subscribe(new oz(new e5(lj5Var, 5), 2));
                x8a x8aVar2 = lj5Var.g;
                qcy<Object> qcyVar2 = qcyVarArr[1];
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) x8aVar2.b;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                x8aVar2.b = subscribe2;
            }
            rwo0 rwo0Var = mwo0Var2.j;
            if (rwo0Var != null) {
                rwo0Var.a();
            }
            mwo0Var2.e(null);
            if (a2 instanceof oy4) {
                ((oy4) a2).k.h = 0.7f;
            }
            if (a2 instanceof r7l0) {
                ((r7l0) a2).h.h = 0.7f;
            }
            mwo0Var2.d.n = new ywo0.b.C4142b(a2);
            a2.o(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            a2.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            adsVar.h = a2;
            mwo0Var.c.h();
        }
        adsVar.i = false;
        Edge edge = Edge.None;
        adsVar.d.getClass();
        adsVar.g = edge;
        this.e.b(motionEvent.getX(), motionEvent.getY());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.j.a.d.f(TracksFilter.ALL);
        setMeasuredDimension(size, (int) (qto0.w + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + qto0.v + qto0.x + org0.k + f + (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? igs.r : 0.0f) + igs.q + igs.s));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        vwo0.a aVar;
        Pair pair;
        if (this.t.isInProgress() || b() || this.x.c != ym4.a.IDLE) {
            return false;
        }
        int i = (int) f;
        int i2 = (int) f2;
        vwo0 vwo0Var = this.g;
        vwo0.a aVar2 = vwo0Var.c;
        if (aVar2 == vwo0.a.FLING_X || aVar2 == vwo0.a.FLING_Y) {
            vwo0Var.b.forceFinished(true);
            vwo0Var.b(vwo0.a.IDLE);
        }
        vwo0.a aVar3 = vwo0Var.c;
        vwo0.a aVar4 = vwo0.a.IDLE;
        if ((aVar3 == aVar4 && Math.abs(i) >= Math.abs(i2)) || (aVar = vwo0Var.c) == vwo0.a.TOUCH_SCROLL_X) {
            vwo0Var.b(vwo0.a.TOUCH_SCROLL_X);
            pair = new Pair(Integer.valueOf(i), 0);
        } else if ((aVar != aVar4 || Math.abs(i2) <= Math.abs(i)) && vwo0Var.c != vwo0.a.TOUCH_SCROLL_Y) {
            pair = new Pair(0, 0);
        } else {
            vwo0Var.b(vwo0.a.TOUCH_SCROLL_Y);
            pair = new Pair(0, Integer.valueOf(i2));
        }
        vwo0Var.a(((Number) pair.i()).intValue(), ((Number) pair.j()).intValue());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.mwo0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [xsna.gp6] */
    /* JADX WARN: Type inference failed for: r5v2, types: [xsna.gp6] */
    /* JADX WARN: Type inference failed for: r5v4, types: [xsna.ckt0] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ckt0 a2;
        if (getAreControlsLocked()) {
            return false;
        }
        float x = motionEvent.getX();
        float y2 = motionEvent.getY();
        ?? r2 = this.e;
        ywo0 ywo0Var = r2.d;
        Iterator<ckt0> it = ywo0Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                a2 = ywo0Var.a(x, y2);
                break;
            }
            a2 = it.next();
            if (a2.l.contains(x, y2)) {
                break;
            }
        }
        boolean e = r2.e(a2);
        r2.a();
        if (!e) {
            return true;
        }
        performHapticFeedback(0);
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = this.c;
            rect.set(0, 0, i, i2);
            setSystemGestureExclusionRects(Collections.singletonList(rect));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vwo0.a aVar;
        if (!this.w && ((this.e.d.l instanceof swo0.c) || !this.x.c(motionEvent))) {
            boolean e = this.v.e(motionEvent);
            boolean onTouchEvent = this.t.onTouchEvent(motionEvent);
            boolean onTouchEvent2 = this.u.a.onTouchEvent(motionEvent);
            vwo0 vwo0Var = this.g;
            if (e) {
                vwo0Var.b.forceFinished(true);
                vwo0Var.b(vwo0.a.IDLE);
            }
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && ((aVar = vwo0Var.c) == vwo0.a.TOUCH_SCROLL_X || aVar == vwo0.a.TOUCH_SCROLL_Y)) {
                vwo0Var.b(vwo0.a.IDLE);
            }
            if (!e && !onTouchEvent && !onTouchEvent2 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        this.g.a(i, i2);
    }

    public final void setChangeCursorItemListener(izs<? super gp6, s3q0> izsVar) {
        this.e.d.u = izsVar;
    }

    public final void setChangePositionListener(izs<? super ywo0.a, s3q0> izsVar) {
        this.e.d.v = izsVar;
    }

    public final void setEditingAudioItem(String str) {
        mwo0 mwo0Var = this.e;
        ywo0 ywo0Var = mwo0Var.d;
        if (str != null) {
            ywo0Var.l = new swo0.b(str);
            rwo0 rwo0Var = mwo0Var.j;
            if (rwo0Var != null) {
                rwo0Var.b();
            }
        } else {
            ywo0Var.l = swo0.a.a;
        }
        mwo0Var.a();
        this.q.d();
    }

    public final void setMultitrackItems(gwo0 gwo0Var) {
        ValueAnimator valueAnimator;
        mwo0 mwo0Var = this.e;
        mwo0Var.e(null);
        gxo0 gxo0Var = mwo0Var.n;
        if (gxo0Var != null && (valueAnimator = gxo0Var.d) != null) {
            valueAnimator.cancel();
        }
        ywo0 ywo0Var = mwo0Var.d;
        ywo0Var.getClass();
        ywo0Var.f = gwo0Var.a;
        ArrayList arrayList = gwo0Var.b;
        ArrayList arrayList2 = gwo0Var.c;
        ywo0Var.g = j5g.u0(arrayList2, arrayList);
        ywo0Var.h = arrayList;
        ywo0Var.i = arrayList2;
        ywo0Var.l(true);
        mwo0Var.a();
        mwo0Var.b.requestLayout();
        c();
        gip0 gip0Var = this.j;
        gip0Var.i.resize(c5g.v(gip0Var.b.g).size() + 10);
        post(new oh(this, 15));
    }

    public final void setOnCropStartedListener(gzs<s3q0> gzsVar) {
        this.e.i = gzsVar;
    }

    public final void setOnOffsetFromStartChangeListener(izs<? super Integer, s3q0> izsVar) {
        this.e.g = izsVar;
    }

    public final void setOnScrollEndListener(gzs<s3q0> gzsVar) {
        this.e.h = gzsVar;
    }

    public final void setSelectedListener(wzs<? super pwo0, ? super gp6, Boolean> wzsVar) {
        this.e.f = wzsVar;
    }

    public final void setSettings(wwo0 wwo0Var) {
        ywo0 ywo0Var = this.e.d;
        List<iwo0> list = ywo0Var.k.i;
        List<iwo0> list2 = wwo0Var.i;
        if (epx.f(list, list2)) {
            list2 = ywo0Var.k.i;
        }
        ywo0Var.k = new wwo0(wwo0Var.a, wwo0Var.b, wwo0Var.c, wwo0Var.d, wwo0Var.e, wwo0Var.f, wwo0Var.g, wwo0Var.h, list2, wwo0Var.j);
    }

    public final void setTimelineListener(rwo0 rwo0Var) {
        this.e.j = rwo0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVideoItemsWithAnimations(gwo0 gwo0Var) {
        ValueAnimator valueAnimator;
        mwo0 mwo0Var = this.e;
        mwo0Var.e(null);
        int i = 8;
        kcj0 kcj0Var = new kcj0(this, i);
        gxo0 gxo0Var = mwo0Var.n;
        if (gxo0Var != null && (valueAnimator = gxo0Var.d) != null) {
            valueAnimator.cancel();
        }
        List<List<gp6>> c = mwo0Var.d.c();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Collections.singletonList(gwo0Var.a));
        arrayList.addAll(gwo0Var.b);
        arrayList.addAll(gwo0Var.c);
        ftm ftmVar = new ftm(mwo0Var, gwo0Var, kcj0Var, i);
        final gxo0 gxo0Var2 = new gxo0(c, arrayList, ftmVar, new dbj0(mwo0Var, 7));
        mwo0Var.n = gxo0Var2;
        List O0 = j5g.O0(c);
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = gxo0Var2.e;
        arrayList3.clear();
        ArrayList arrayList4 = gxo0Var2.g;
        arrayList4.clear();
        ArrayList arrayList5 = gxo0Var2.f;
        arrayList5.clear();
        int size = O0.size();
        for (int i2 = 0; i2 < size; i2++) {
            int size2 = ((Collection) O0.get(i2)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                gp6 gp6Var = (gp6) ((List) O0.get(i2)).get(i3);
                if (!gxo0.a(arrayList2, (gp6) ((List) O0.get(i2)).get(i3))) {
                    arrayList3.add(gp6Var);
                    arrayList4.add(new pwo0(i3, i2));
                }
            }
        }
        int size3 = arrayList2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            int size4 = ((Collection) arrayList2.get(i4)).size();
            for (int i5 = 0; i5 < size4; i5++) {
                gp6 gp6Var2 = (gp6) ((List) arrayList2.get(i4)).get(i5);
                if (!gxo0.a(O0, gp6Var2)) {
                    arrayList5.add(gp6Var2);
                    gxo0Var2.h.add(new pwo0(i5, i4));
                }
            }
        }
        if (arrayList3.isEmpty() && arrayList5.isEmpty()) {
            ftmVar.invoke(arrayList2);
            return;
        }
        if (arrayList3.size() == 1 && arrayList5.size() == 2) {
            gp6 gp6Var3 = (gp6) arrayList3.get(0);
            gp6 gp6Var4 = (gp6) arrayList5.get(0);
            if (gxo0.b(gp6Var3, gp6Var4, (gp6) arrayList5.get(1))) {
                gp6Var4.A(new Animation(Animation.Type.Split));
                arrayList3.clear();
                arrayList5.clear();
            }
        }
        if (arrayList3.size() == 2 && arrayList5.size() == 1 && gxo0.b((gp6) arrayList5.get(0), (gp6) arrayList3.get(0), (gp6) arrayList3.get(1))) {
            arrayList3.clear();
            arrayList5.clear();
        }
        int size5 = arrayList3.size();
        int i6 = 0;
        while (i6 < size5) {
            ((gp6) arrayList3.get(i6)).A(new Animation(Animation.Type.Delete));
            pwo0 pwo0Var = (pwo0) arrayList4.get(i6);
            int size6 = arrayList2.size();
            int i7 = pwo0Var.b;
            if (size6 > i7 && i7 < ((List) arrayList2.get(i7)).size()) {
                arrayList2.add(i7, arrayList2.size() >= i6 ? new ArrayList(j5g.u0(e43.o(arrayList3.get(i6)), (Collection) arrayList2.get(i7))) : e43.o(arrayList3.get(i6)));
            }
            i6++;
        }
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            ((gp6) it.next()).A(new Animation(Animation.Type.Add));
        }
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            ArrayList arrayList7 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Animation C = ((gp6) it3.next()).C();
                if (C != null) {
                    arrayList7.add(C);
                }
            }
            arrayList6.add(arrayList7);
        }
        final ArrayList v = c5g.v(arrayList6);
        ftmVar.invoke(arrayList2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.exo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                Iterator it4 = v.iterator();
                while (it4.hasNext()) {
                    ((Animation) it4.next()).b = floatValue;
                }
                gxo0Var2.c.invoke();
            }
        });
        ofFloat.addListener(new fxo0(arrayList2, gxo0Var2));
        ofFloat.start();
        gxo0Var2.d = ofFloat;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
