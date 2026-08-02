package com.sofascore.results.view.graph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.gv9;
import defpackage.hkg;
import defpackage.km5;
import defpackage.n6j;
import defpackage.ok3;
import defpackage.s6j;
import defpackage.u6h;
import defpackage.w5j;
import defpackage.z1g;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/view/graph/TennisPowerGraph;", "Landroid/view/View;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TennisPowerGraph extends View {
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Rect J;
    public final Bitmap K;
    public float L;
    public final boolean a;
    public final Path b;
    public n6j c;
    public TennisEvent d;
    public boolean e;
    public boolean f;
    public int g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TennisPowerGraph(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        Typeface typeface4;
        context.getClass();
        this.a = hkg.c0(context);
        this.b = new Path();
        this.e = true;
        this.h = ao2.u(80, context);
        this.i = ao2.u(6, context);
        float u = ao2.u(8, context);
        this.j = u;
        this.k = ao2.u(1, context);
        this.l = ao2.u(4, context);
        this.m = ao2.u(24, context);
        float u2 = ao2.u(1, context);
        this.n = u2;
        this.o = ao2.u(2, context);
        this.p = ao2.u(4, context);
        this.q = ao2.u(40, context);
        int color = context.getColor(R.color.n_lv_1);
        this.r = color;
        this.s = context.getColor(R.color.n_lv_3);
        this.t = context.getColor(R.color.n_lv_4);
        int color2 = context.getColor(R.color.home_primary);
        this.u = color2;
        this.v = context.getColor(R.color.home_primary_highlight);
        int color3 = context.getColor(R.color.away_primary);
        this.w = color3;
        this.x = context.getColor(R.color.away_primary_highlight);
        this.y = context.getColor(R.color.surface_2);
        this.z = context.getColor(R.color.live);
        Paint paint = new Paint();
        paint.setColor(color3);
        paint.setStrokeWidth(u);
        this.A = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(u2);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(color);
        this.B = paint2;
        Paint paint3 = new Paint();
        paint3.setStrokeWidth(u2);
        paint3.setStyle(style);
        paint3.setColor(color2);
        paint3.setAlpha(102);
        this.C = paint3;
        Paint paint4 = new Paint();
        paint4.setStrokeWidth(u2);
        paint4.setStyle(style);
        paint4.setColor(color3);
        paint4.setAlpha(102);
        this.D = paint4;
        Paint paint5 = new Paint();
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint5.setTypeface(typeface);
        paint5.setTextSize(ao2.u(14, context));
        paint5.setColor(this.z);
        paint5.setStrokeWidth(this.o);
        this.E = paint5;
        this.F = new Paint();
        Paint paint6 = new Paint();
        try {
            typeface2 = z1g.a(R.font.sofascore_sans_bold, context);
        } catch (Exception unused2) {
            typeface2 = Typeface.DEFAULT;
        }
        paint6.setTypeface(typeface2);
        paint6.setTextSize(ao2.u(14, context));
        paint6.setColor(this.r);
        this.G = paint6;
        Paint paint7 = new Paint();
        try {
            typeface3 = z1g.a(R.font.sofascore_sans_bold, context);
        } catch (Exception unused3) {
            typeface3 = Typeface.DEFAULT;
        }
        paint7.setTypeface(typeface3);
        paint7.setTextSize(ao2.u(28, context));
        paint7.setTextAlign(Paint.Align.CENTER);
        paint7.setColor(this.r);
        this.H = paint7;
        Paint paint8 = new Paint();
        try {
            typeface4 = z1g.a(R.font.sofascore_sans_medium, context);
        } catch (Exception unused4) {
            typeface4 = Typeface.DEFAULT;
        }
        paint8.setTypeface(typeface4);
        paint8.setTextSize(ao2.u(10, context));
        paint8.setColor(this.r);
        this.I = paint8;
        this.J = new Rect();
        Drawable drawable = context.getDrawable(R.drawable.ic_tp_break_point);
        this.K = drawable != null ? u6h.U(drawable, 0, 0, 7) : null;
    }

    public final void a(Canvas canvas, s6j s6jVar, String str, Paint paint, boolean z, boolean z2, int i) {
        float f;
        float f2;
        float f3;
        int i2;
        Integer valueOf = Integer.valueOf(this.v);
        if (i != 48) {
            valueOf = null;
        }
        int i3 = this.x;
        int intValue = valueOf != null ? valueOf.intValue() : i3;
        Paint paint2 = this.F;
        paint2.setColor(intValue);
        int i4 = s6jVar.c;
        gv9 gv9Var = s6jVar.e;
        float f4 = this.h;
        float f5 = f4 / 2.0f;
        if (i == 80) {
            paint2.setColor(i3);
            i4 = s6jVar.d;
            f2 = f4;
            f = f5;
        } else {
            f4 = f5;
            f = 0.0f;
            f2 = 0.0f;
        }
        int i5 = i4;
        float size = (gv9Var.size() != 1 || z) ? gv9Var.size() : 2;
        float f6 = this.j;
        float f7 = this.k;
        float f8 = ((size * f7) + (f6 * size)) - 1.0f;
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f8, f4, paint2);
        if (i == 48) {
            this.L += f8;
        }
        Path path = this.b;
        path.reset();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        float f9 = f8 - (this.n / 2.0f);
        path.lineTo(f9, f2);
        path.lineTo(f9, (i == 48 ? -f6 : f6) + f2);
        canvas.drawPath(path, paint);
        int alpha = this.f ? paint.getAlpha() : 255;
        Paint paint3 = this.G;
        paint3.setAlpha(alpha);
        int alpha2 = paint3.getAlpha();
        Paint paint4 = this.I;
        paint4.setAlpha(alpha2);
        int save = canvas.save();
        boolean z3 = this.a;
        if (z3) {
            try {
                f3 = f8;
                canvas.scale(-1.0f, 1.0f, getMeasuredWidth() / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i2 = 48;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        } else {
            f3 = f8;
            i2 = 48;
        }
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i == i2 ? (-f6) - (f7 * 2.0f) : paint3.getTextSize() + f2 + f6);
        float measuredWidth = z3 ? getMeasuredWidth() - f3 : f3 - paint3.measureText(str);
        if (this.f && i5 > 0 && !z2) {
            String valueOf2 = String.valueOf(i5);
            float measureText = paint3.measureText(valueOf2) / 2.0f;
            canvas.drawText(valueOf2, z3 ? (getMeasuredWidth() - f3) - measureText : f3 - measureText, (-f6) * 0.5f, paint4);
            measuredWidth = z3 ? measuredWidth + measureText : measuredWidth - measureText;
        }
        if (!z || this.f) {
            canvas.drawText(str, measuredWidth, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint3);
        }
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0252 A[EDGE_INSN: B:96:0x0252->B:97:0x0252 BREAK  A[LOOP:1: B:69:0x01a3->B:87:0x023f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0267  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        gv9 gv9Var;
        Integer scoreByPeriodName;
        int i6;
        boolean z;
        Paint paint;
        float f2;
        gv9 gv9Var2;
        boolean z2;
        float f3;
        int size;
        int i7;
        float f4;
        boolean z3;
        boolean z4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float height;
        TennisPowerGraph tennisPowerGraph = this;
        Canvas canvas2 = canvas;
        canvas2.getClass();
        super.onDraw(canvas);
        tennisPowerGraph.L = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        n6j n6jVar = tennisPowerGraph.c;
        if (n6jVar == null) {
            return;
        }
        gv9 gv9Var3 = n6jVar.a;
        TennisEvent tennisEvent = tennisPowerGraph.d;
        if (tennisEvent == null) {
            return;
        }
        Integer display = Event.getHomeScore$default(tennisEvent, null, 1, null).getDisplay();
        int intValue = display != null ? display.intValue() : -1;
        Integer display2 = Event.getAwayScore$default(tennisEvent, null, 1, null).getDisplay();
        int intValue2 = display2 != null ? display2.intValue() : -1;
        boolean c = Intrinsics.c(tennisEvent.getStatusType(), StatusKt.STATUS_IN_PROGRESS);
        int i8 = intValue + intValue2;
        tennisPowerGraph.g = gv9Var3.size();
        float f15 = tennisPowerGraph.h;
        float f16 = f15 / 2.0f;
        canvas2.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tennisPowerGraph.m);
        float f17 = 1.0f;
        float f18 = -1.0f;
        boolean z5 = tennisPowerGraph.a;
        if (z5) {
            canvas2.scale(-1.0f, 1.0f, tennisPowerGraph.getMeasuredWidth() / 2.0f, tennisPowerGraph.getMeasuredHeight() / 2.0f);
        }
        Iterator it = gv9Var3.iterator();
        int i9 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            int i10 = tennisPowerGraph.r;
            float f19 = f15;
            Paint paint2 = tennisPowerGraph.B;
            float f20 = tennisPowerGraph.j;
            if (!hasNext) {
                float f21 = f18;
                boolean z6 = z5;
                int i11 = i10;
                TennisEvent tennisEvent2 = tennisEvent;
                float f22 = f16;
                float f23 = f17;
                if (c || !tennisPowerGraph.e) {
                    return;
                }
                if (intValue == -1 && intValue2 == -1) {
                    return;
                }
                String valueOf = String.valueOf(intValue);
                String valueOf2 = String.valueOf(intValue2);
                Integer winnerCode$default = Event.getWinnerCode$default(tennisEvent2, null, 1, null);
                canvas2.translate(f20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float measuredWidth = (tennisPowerGraph.getMeasuredWidth() - tennisPowerGraph.L) - (f20 * 2.0f);
                float f24 = tennisPowerGraph.q;
                if (f24 < measuredWidth) {
                    f24 = measuredWidth;
                }
                int length = valueOf.length();
                Paint paint3 = tennisPowerGraph.H;
                paint3.getTextBounds(valueOf, 0, length, tennisPowerGraph.J);
                if (z6) {
                    canvas2.scale(f21, f23, f24 / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                int i12 = tennisPowerGraph.y;
                int i13 = (winnerCode$default != null && winnerCode$default.intValue() == 1) ? tennisPowerGraph.v : i12;
                Paint paint4 = tennisPowerGraph.F;
                paint4.setColor(i13);
                canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f24, f22, paint4);
                Path path = tennisPowerGraph.b;
                path.reset();
                float f25 = tennisPowerGraph.n / 2.0f;
                path.moveTo(f25, f20);
                path.lineTo(f25, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.lineTo(f24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i14 = tennisPowerGraph.t;
                if (winnerCode$default == null) {
                    f = f24;
                    i = 1;
                } else {
                    f = f24;
                    i = 1;
                    if (winnerCode$default.intValue() == 1) {
                        i2 = i11;
                        paint2.setColor(i2);
                        canvas2.drawPath(path, paint2);
                        int i15 = tennisPowerGraph.s;
                        paint3.setColor((winnerCode$default != null && winnerCode$default.intValue() == i) ? i11 : i15);
                        float f26 = f / 2.0f;
                        canvas2.drawText(valueOf, f26, f22 + r15.centerY(), paint3);
                        if (winnerCode$default != null && winnerCode$default.intValue() == 2) {
                            i12 = tennisPowerGraph.x;
                        }
                        paint4.setColor(i12);
                        float f27 = f;
                        canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f22, f27, tennisPowerGraph.h, paint4);
                        path.reset();
                        path.moveTo(f25, f19);
                        float f28 = f27 - f25;
                        path.lineTo(f28, f19);
                        path.lineTo(f28, f19 - f20);
                        if (winnerCode$default == null) {
                            i3 = 2;
                        } else {
                            i3 = 2;
                            if (winnerCode$default.intValue() == 2) {
                                i4 = i11;
                                paint2.setColor(i4);
                                canvas2.drawPath(path, paint2);
                                if (winnerCode$default != null || winnerCode$default.intValue() != i3) {
                                    i11 = i15;
                                }
                                paint3.setColor(i11);
                                canvas2.drawText(valueOf2, f26, f19 + r15.centerY(), paint3);
                                return;
                            }
                        }
                        i4 = i14;
                        paint2.setColor(i4);
                        canvas2.drawPath(path, paint2);
                        if (winnerCode$default != null) {
                        }
                        i11 = i15;
                        paint3.setColor(i11);
                        canvas2.drawText(valueOf2, f26, f19 + r15.centerY(), paint3);
                        return;
                    }
                }
                i2 = i14;
                paint2.setColor(i2);
                canvas2.drawPath(path, paint2);
                int i152 = tennisPowerGraph.s;
                if (winnerCode$default != null) {
                    paint3.setColor((winnerCode$default != null && winnerCode$default.intValue() == i) ? i11 : i152);
                    float f262 = f / 2.0f;
                    canvas2.drawText(valueOf, f262, f22 + r15.centerY(), paint3);
                    if (winnerCode$default != null) {
                        i12 = tennisPowerGraph.x;
                    }
                    paint4.setColor(i12);
                    float f272 = f;
                    canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f22, f272, tennisPowerGraph.h, paint4);
                    path.reset();
                    path.moveTo(f25, f19);
                    float f282 = f272 - f25;
                    path.lineTo(f282, f19);
                    path.lineTo(f282, f19 - f20);
                    if (winnerCode$default == null) {
                    }
                    i4 = i14;
                    paint2.setColor(i4);
                    canvas2.drawPath(path, paint2);
                    if (winnerCode$default != null) {
                    }
                    i11 = i152;
                    paint3.setColor(i11);
                    canvas2.drawText(valueOf2, f262, f19 + r15.centerY(), paint3);
                    return;
                }
                paint3.setColor((winnerCode$default != null && winnerCode$default.intValue() == i) ? i11 : i152);
                float f2622 = f / 2.0f;
                canvas2.drawText(valueOf, f2622, f22 + r15.centerY(), paint3);
                if (winnerCode$default != null) {
                }
                paint4.setColor(i12);
                float f2722 = f;
                canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f22, f2722, tennisPowerGraph.h, paint4);
                path.reset();
                path.moveTo(f25, f19);
                float f2822 = f2722 - f25;
                path.lineTo(f2822, f19);
                path.lineTo(f2822, f19 - f20);
                if (winnerCode$default == null) {
                }
                i4 = i14;
                paint2.setColor(i4);
                canvas2.drawPath(path, paint2);
                if (winnerCode$default != null) {
                }
                i11 = i152;
                paint3.setColor(i11);
                canvas2.drawText(valueOf2, f2622, f19 + r15.centerY(), paint3);
                return;
            }
            Object next = it.next();
            int i16 = i9 + 1;
            if (i9 < 0) {
                b.q();
                throw null;
            }
            s6j s6jVar = (s6j) next;
            boolean z7 = z5;
            Integer scoreByPeriodName2 = Event.getHomeScore$default(tennisEvent, null, 1, null).getScoreByPeriodName("period" + i16);
            if (scoreByPeriodName2 != null) {
                if (scoreByPeriodName2.intValue() < 0) {
                    scoreByPeriodName2 = null;
                }
                if (scoreByPeriodName2 != null) {
                    i5 = scoreByPeriodName2.intValue();
                    gv9Var = gv9Var3;
                    scoreByPeriodName = Event.getAwayScore$default(tennisEvent, null, 1, null).getScoreByPeriodName("period" + i16);
                    if (scoreByPeriodName != null) {
                        if (scoreByPeriodName.intValue() < 0) {
                            scoreByPeriodName = null;
                        }
                        if (scoreByPeriodName != null) {
                            i6 = scoreByPeriodName.intValue();
                            boolean z8 = (i9 == gv9Var.size() - 1 || s6jVar.e.size() != 1 || c) ? false : true;
                            int i17 = i5 + i6;
                            String valueOf3 = (z8 && s6jVar.e.size() == i17) ? String.valueOf(s6jVar.a) : String.valueOf(i5);
                            String valueOf4 = (z8 && s6jVar.e.size() == i17) ? String.valueOf(s6jVar.b) : String.valueOf(i6);
                            int i18 = tennisPowerGraph.g - 1;
                            boolean z9 = i9 >= i18 || z8 || i9 < i8 || !c;
                            tennisPowerGraph.f = z9;
                            boolean z10 = z9 || (c && i9 == i18);
                            int i19 = i8;
                            Integer firstToServe$default = ServableEvent.getFirstToServe$default(tennisEvent, null, 1, null);
                            paint2.setColor(i10);
                            z = tennisPowerGraph.f;
                            Paint paint5 = tennisPowerGraph.C;
                            Paint paint6 = tennisPowerGraph.D;
                            if (!z) {
                                paint2 = paint5;
                            } else if (s6jVar.a <= s6jVar.b) {
                                paint = paint2;
                                paint2 = paint5;
                                canvas2 = canvas;
                                Paint paint7 = paint2;
                                String str = valueOf3;
                                f2 = f19;
                                a(canvas2, s6jVar, str, paint7, z10, z8, 48);
                                gv9Var2 = s6jVar.e;
                                tennisPowerGraph = this;
                                String str2 = str;
                                tennisPowerGraph.a(canvas2, s6jVar, valueOf4, paint, z10, z8, 80);
                                z2 = z10;
                                f3 = f20 / 2.0f;
                                canvas2.translate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                size = gv9Var2.size();
                                i7 = 0;
                                while (true) {
                                    f4 = tennisPowerGraph.k;
                                    if (i7 < size) {
                                        break;
                                    }
                                    gv9 gv9Var4 = gv9Var2;
                                    float f29 = f3;
                                    w5j w5jVar = (w5j) gv9Var4.get(i7);
                                    int i20 = size;
                                    float f30 = w5jVar.b / 100.0f;
                                    if (i7 > 0) {
                                        f13 = f30;
                                        f14 = f20 + f4;
                                    } else {
                                        f13 = f30;
                                        f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    }
                                    int i21 = i7;
                                    canvas2.translate(f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    int i22 = w5jVar.b;
                                    Bitmap bitmap = tennisPowerGraph.K;
                                    Paint paint8 = tennisPowerGraph.A;
                                    if (i22 > 0) {
                                        paint8.setColor(tennisPowerGraph.u);
                                        height = f16 + f4;
                                    } else {
                                        paint8.setColor(tennisPowerGraph.w);
                                        height = (f16 - f4) - (bitmap != null ? bitmap.getHeight() : 0);
                                    }
                                    float f31 = f16 - (f16 * f13);
                                    boolean z11 = z2;
                                    Iterator it2 = it;
                                    TennisEvent tennisEvent3 = tennisEvent;
                                    float f32 = f2;
                                    float f33 = height;
                                    float f34 = f16;
                                    canvas2 = canvas;
                                    canvas2.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f34, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f31, paint8);
                                    if (w5jVar.a && bitmap != null) {
                                        canvas2.drawBitmap(bitmap, (-tennisPowerGraph.i) / 2.0f, f33, (Paint) null);
                                    }
                                    if (gv9Var4.size() == 1 && !z11) {
                                        canvas2.translate(f20 + f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    }
                                    i7 = i21 + 1;
                                    f3 = f29;
                                    z2 = z11;
                                    size = i20;
                                    it = it2;
                                    gv9Var2 = gv9Var4;
                                    f2 = f32;
                                    tennisEvent = tennisEvent3;
                                    f16 = f34;
                                }
                                z3 = z2;
                                float f35 = f2;
                                TennisEvent tennisEvent4 = tennisEvent;
                                Iterator it3 = it;
                                float f36 = f16;
                                float f37 = f3;
                                z4 = i9 >= gv9Var.size() - 1;
                                canvas2.translate(f37, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                if (z4) {
                                    float f38 = f4 * 2.0f;
                                    canvas2.translate(f38, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    tennisPowerGraph.L = f38 + tennisPowerGraph.L;
                                }
                                if (z3) {
                                    f5 = 1.0f;
                                    f6 = -1.0f;
                                } else {
                                    Paint paint9 = tennisPowerGraph.E;
                                    if (tennisPowerGraph.f) {
                                        canvas2.translate(f4 * 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    }
                                    Paint paint10 = tennisPowerGraph.G;
                                    float measureText = paint10.measureText(str2);
                                    float f39 = tennisPowerGraph.f ? f4 : (-measureText) / 2.0f;
                                    float f40 = -f20;
                                    float f41 = f4 * 2.0f;
                                    float f42 = f40 - f41;
                                    float f43 = f35 + f20;
                                    float textSize = paint10.getTextSize() + f43;
                                    float f44 = tennisPowerGraph.f ? measureText : measureText / 2.0f;
                                    float f45 = tennisPowerGraph.p;
                                    if (firstToServe$default == null) {
                                        f7 = f40;
                                    } else {
                                        f7 = f40;
                                        if (firstToServe$default.intValue() == 1) {
                                            f8 = f42 - f45;
                                            f9 = f8 - f4;
                                            int save = canvas2.save();
                                            if (z7) {
                                                try {
                                                    f10 = f41;
                                                    f11 = f43;
                                                    f12 = f44;
                                                    f5 = 1.0f;
                                                    f6 = -1.0f;
                                                    canvas2.scale(-1.0f, 1.0f, tennisPowerGraph.f ? (measureText / 2.0f) + f4 : f4 / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                } catch (Throwable th) {
                                                    canvas2.restoreToCount(save);
                                                    throw th;
                                                }
                                            } else {
                                                f10 = f41;
                                                f11 = f43;
                                                f12 = f44;
                                                f5 = 1.0f;
                                                f6 = -1.0f;
                                            }
                                            String str3 = "0";
                                            if (tennisPowerGraph.f) {
                                                str2 = "0";
                                            }
                                            canvas2.drawText(str2, f39, f42, paint9);
                                            if (!tennisPowerGraph.f) {
                                                str3 = valueOf4;
                                            }
                                            canvas2.drawText(str3, f39, textSize, paint9);
                                            canvas2.restoreToCount(save);
                                            float f46 = f4 / 2.0f;
                                            canvas2.drawLine(f46, f7, f46, f11, paint9);
                                            canvas2.drawCircle(f12 + f45 + f10, f9, f45, paint9);
                                        }
                                    }
                                    if (firstToServe$default != null && firstToServe$default.intValue() == 2) {
                                        f8 = textSize - f45;
                                        f9 = f8 - f4;
                                        int save2 = canvas2.save();
                                        if (z7) {
                                        }
                                        String str32 = "0";
                                        if (tennisPowerGraph.f) {
                                        }
                                        canvas2.drawText(str2, f39, f42, paint9);
                                        if (!tennisPowerGraph.f) {
                                        }
                                        canvas2.drawText(str32, f39, textSize, paint9);
                                        canvas2.restoreToCount(save2);
                                        float f462 = f4 / 2.0f;
                                        canvas2.drawLine(f462, f7, f462, f11, paint9);
                                        canvas2.drawCircle(f12 + f45 + f10, f9, f45, paint9);
                                    } else {
                                        f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        int save22 = canvas2.save();
                                        if (z7) {
                                        }
                                        String str322 = "0";
                                        if (tennisPowerGraph.f) {
                                        }
                                        canvas2.drawText(str2, f39, f42, paint9);
                                        if (!tennisPowerGraph.f) {
                                        }
                                        canvas2.drawText(str322, f39, textSize, paint9);
                                        canvas2.restoreToCount(save22);
                                        float f4622 = f4 / 2.0f;
                                        canvas2.drawLine(f4622, f7, f4622, f11, paint9);
                                        canvas2.drawCircle(f12 + f45 + f10, f9, f45, paint9);
                                    }
                                }
                                f17 = f5;
                                f18 = f6;
                                i9 = i16;
                                z5 = z7;
                                gv9Var3 = gv9Var;
                                i8 = i19;
                                it = it3;
                                f15 = f35;
                                tennisEvent = tennisEvent4;
                                f16 = f36;
                            }
                            paint = paint6;
                            canvas2 = canvas;
                            Paint paint72 = paint2;
                            String str4 = valueOf3;
                            f2 = f19;
                            a(canvas2, s6jVar, str4, paint72, z10, z8, 48);
                            gv9Var2 = s6jVar.e;
                            tennisPowerGraph = this;
                            String str22 = str4;
                            tennisPowerGraph.a(canvas2, s6jVar, valueOf4, paint, z10, z8, 80);
                            z2 = z10;
                            f3 = f20 / 2.0f;
                            canvas2.translate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            size = gv9Var2.size();
                            i7 = 0;
                            while (true) {
                                f4 = tennisPowerGraph.k;
                                if (i7 < size) {
                                }
                                i7 = i21 + 1;
                                f3 = f29;
                                z2 = z11;
                                size = i20;
                                it = it2;
                                gv9Var2 = gv9Var4;
                                f2 = f32;
                                tennisEvent = tennisEvent3;
                                f16 = f34;
                            }
                            z3 = z2;
                            float f352 = f2;
                            TennisEvent tennisEvent42 = tennisEvent;
                            Iterator it32 = it;
                            float f362 = f16;
                            float f372 = f3;
                            if (i9 >= gv9Var.size() - 1) {
                            }
                            canvas2.translate(f372, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            if (z4) {
                            }
                            if (z3) {
                            }
                            f17 = f5;
                            f18 = f6;
                            i9 = i16;
                            z5 = z7;
                            gv9Var3 = gv9Var;
                            i8 = i19;
                            it = it32;
                            f15 = f352;
                            tennisEvent = tennisEvent42;
                            f16 = f362;
                        }
                    }
                    i6 = 0;
                    if (i9 == gv9Var.size() - 1) {
                    }
                    int i172 = i5 + i6;
                    if (z8) {
                    }
                    String valueOf42 = (z8 && s6jVar.e.size() == i172) ? String.valueOf(s6jVar.b) : String.valueOf(i6);
                    int i182 = tennisPowerGraph.g - 1;
                    if (i9 >= i182) {
                    }
                    tennisPowerGraph.f = z9;
                    if (z9) {
                    }
                    int i192 = i8;
                    Integer firstToServe$default2 = ServableEvent.getFirstToServe$default(tennisEvent, null, 1, null);
                    paint2.setColor(i10);
                    z = tennisPowerGraph.f;
                    Paint paint52 = tennisPowerGraph.C;
                    Paint paint62 = tennisPowerGraph.D;
                    if (!z) {
                    }
                    paint = paint62;
                    canvas2 = canvas;
                    Paint paint722 = paint2;
                    String str42 = valueOf3;
                    f2 = f19;
                    a(canvas2, s6jVar, str42, paint722, z10, z8, 48);
                    gv9Var2 = s6jVar.e;
                    tennisPowerGraph = this;
                    String str222 = str42;
                    tennisPowerGraph.a(canvas2, s6jVar, valueOf42, paint, z10, z8, 80);
                    z2 = z10;
                    f3 = f20 / 2.0f;
                    canvas2.translate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    size = gv9Var2.size();
                    i7 = 0;
                    while (true) {
                        f4 = tennisPowerGraph.k;
                        if (i7 < size) {
                        }
                        i7 = i21 + 1;
                        f3 = f29;
                        z2 = z11;
                        size = i20;
                        it = it2;
                        gv9Var2 = gv9Var4;
                        f2 = f32;
                        tennisEvent = tennisEvent3;
                        f16 = f34;
                    }
                    z3 = z2;
                    float f3522 = f2;
                    TennisEvent tennisEvent422 = tennisEvent;
                    Iterator it322 = it;
                    float f3622 = f16;
                    float f3722 = f3;
                    if (i9 >= gv9Var.size() - 1) {
                    }
                    canvas2.translate(f3722, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (z4) {
                    }
                    if (z3) {
                    }
                    f17 = f5;
                    f18 = f6;
                    i9 = i16;
                    z5 = z7;
                    gv9Var3 = gv9Var;
                    i8 = i192;
                    it = it322;
                    f15 = f3522;
                    tennisEvent = tennisEvent422;
                    f16 = f3622;
                }
            }
            i5 = 0;
            gv9Var = gv9Var3;
            scoreByPeriodName = Event.getAwayScore$default(tennisEvent, null, 1, null).getScoreByPeriodName("period" + i16);
            if (scoreByPeriodName != null) {
            }
            i6 = 0;
            if (i9 == gv9Var.size() - 1) {
            }
            int i1722 = i5 + i6;
            if (z8) {
            }
            String valueOf422 = (z8 && s6jVar.e.size() == i1722) ? String.valueOf(s6jVar.b) : String.valueOf(i6);
            int i1822 = tennisPowerGraph.g - 1;
            if (i9 >= i1822) {
            }
            tennisPowerGraph.f = z9;
            if (z9) {
            }
            int i1922 = i8;
            Integer firstToServe$default22 = ServableEvent.getFirstToServe$default(tennisEvent, null, 1, null);
            paint2.setColor(i10);
            z = tennisPowerGraph.f;
            Paint paint522 = tennisPowerGraph.C;
            Paint paint622 = tennisPowerGraph.D;
            if (!z) {
            }
            paint = paint622;
            canvas2 = canvas;
            Paint paint7222 = paint2;
            String str422 = valueOf3;
            f2 = f19;
            a(canvas2, s6jVar, str422, paint7222, z10, z8, 48);
            gv9Var2 = s6jVar.e;
            tennisPowerGraph = this;
            String str2222 = str422;
            tennisPowerGraph.a(canvas2, s6jVar, valueOf422, paint, z10, z8, 80);
            z2 = z10;
            f3 = f20 / 2.0f;
            canvas2.translate(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            size = gv9Var2.size();
            i7 = 0;
            while (true) {
                f4 = tennisPowerGraph.k;
                if (i7 < size) {
                }
                i7 = i21 + 1;
                f3 = f29;
                z2 = z11;
                size = i20;
                it = it2;
                gv9Var2 = gv9Var4;
                f2 = f32;
                tennisEvent = tennisEvent3;
                f16 = f34;
            }
            z3 = z2;
            float f35222 = f2;
            TennisEvent tennisEvent4222 = tennisEvent;
            Iterator it3222 = it;
            float f36222 = f16;
            float f37222 = f3;
            if (i9 >= gv9Var.size() - 1) {
            }
            canvas2.translate(f37222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (z4) {
            }
            if (z3) {
            }
            f17 = f5;
            f18 = f6;
            i9 = i16;
            z5 = z7;
            gv9Var3 = gv9Var;
            i8 = i1922;
            it = it3222;
            f15 = f35222;
            tennisEvent = tennisEvent4222;
            f16 = f36222;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Iterable iterable;
        float f;
        float f2;
        n6j n6jVar = this.c;
        if (n6jVar == null || (iterable = n6jVar.a) == null) {
            iterable = km5.a;
        }
        Iterator it = iterable.iterator();
        int i3 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            f = this.k;
            f2 = this.j;
            if (!hasNext) {
                break;
            } else {
                i3 += (int) ((f2 + f) * ((s6j) it.next()).e.size());
            }
        }
        float f3 = i3 + f + this.l;
        TennisEvent tennisEvent = this.d;
        int i4 = (int) (f3 + (Intrinsics.c(tennisEvent != null ? Boolean.valueOf(ok3.D(tennisEvent)) : null, Boolean.TRUE) ? (f2 + f) * 2.0f : this.e ? (f2 * 2.0f) + this.q : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        int size = View.MeasureSpec.getSize(i);
        if (i4 < size) {
            i4 = size;
        }
        setMeasuredDimension(i4, (int) ((2.0f * this.m) + this.h));
    }
}
