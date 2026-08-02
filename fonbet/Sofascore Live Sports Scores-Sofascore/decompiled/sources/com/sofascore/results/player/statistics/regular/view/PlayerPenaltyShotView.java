package com.sofascore.results.player.statistics.regular.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ironsource.U3;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryData;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ao2;
import defpackage.joa;
import defpackage.k13;
import defpackage.km5;
import defpackage.n6;
import defpackage.nzd;
import defpackage.que;
import defpackage.rue;
import defpackage.v9g;
import defpackage.wzb;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001e)R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018¨\u0006*"}, d2 = {"Lcom/sofascore/results/player/statistics/regular/view/PlayerPenaltyShotView;", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "r", "Ljoa;", "getGloveDrawable", "()Landroid/graphics/drawable/Drawable;", "gloveDrawable", "Lkotlin/Function1;", "", "", "E", "Lkotlin/jvm/functions/Function1;", "getOnShotSelected", "()Lkotlin/jvm/functions/Function1;", "setOnShotSelected", "(Lkotlin/jvm/functions/Function1;)V", "onShotSelected", "", "F", "Z", "getDrawBackground", "()Z", "setDrawBackground", "(Z)V", "drawBackground", "G", "getUseRoundedCorners", "setUseRoundedCorners", "useRoundedCorners", "Lque;", U3.i.X, "H", "Lque;", "getCurrentPerspective", "()Lque;", "currentPerspective", "I", "getSelectionEnabled", "setSelectionEnabled", "selectionEnabled", "rue", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerPenaltyShotView extends View {
    public static final /* synthetic */ int J = 0;
    public RectF A;
    public RectF B;
    public final Path C;
    public final Path D;

    /* renamed from: E, reason: from kotlin metadata */
    public Function1 onShotSelected;

    /* renamed from: F, reason: from kotlin metadata */
    public boolean drawBackground;

    /* renamed from: G, reason: from kotlin metadata */
    public boolean useRoundedCorners;

    /* renamed from: H, reason: from kotlin metadata */
    public que currentPerspective;

    /* renamed from: I, reason: from kotlin metadata */
    public boolean selectionEnabled;
    public List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final double k;
    public final double l;
    public final float m;
    public final float n;
    public final float o;
    public final Drawable p;
    public final Drawable q;

    /* renamed from: r, reason: from kotlin metadata */
    public final joa gloveDrawable;
    public rue s;
    public PlayerPenaltyHistoryData t;
    public final Paint u;
    public final Paint v;
    public final Paint w;
    public final Paint x;
    public Rect y;
    public Rect z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlayerPenaltyShotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.a = km5.a;
        int s = ao2.s(8, context);
        this.b = s;
        this.c = ao2.s(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, context);
        this.d = ao2.s(40, context);
        int s2 = ao2.s(280, context);
        this.e = s2;
        int s3 = ao2.s(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, context);
        this.f = s3;
        int s4 = ao2.s(168, context);
        this.g = s4;
        int s5 = ao2.s(89, context);
        this.h = s5;
        this.i = (s2 - s4) / 2;
        this.j = s3 - s5;
        this.k = s2 / 100.0d;
        this.l = s3 / 100.0d;
        float v = ao2.v(1, context);
        this.m = ao2.v(8, context);
        this.n = ao2.v(10, context);
        this.o = ao2.v(16, context);
        float v2 = ao2.v(172, context);
        this.p = context.getDrawable(R.drawable.penalty_goal);
        this.q = context.getDrawable(R.drawable.ic_ball_football_16_no_padding);
        this.gloveDrawable = ypa.a(ysa.c, new nzd(context, 9));
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(context.getColor(R.color.terrain_football));
        this.u = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(context.getColor(R.color.surface_2));
        this.v = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(context.getColor(R.color.on_color_secondary));
        paint3.setAlpha(255);
        this.w = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(v);
        paint4.setColor(context.getColor(R.color.primary_default));
        this.x = paint4;
        this.C = new Path();
        this.D = new Path();
        this.drawBackground = true;
        this.useRoundedCorners = true;
        this.currentPerspective = que.a;
        this.selectionEnabled = true;
        setWillNotDraw(false);
        setMinimumHeight(wzb.b(v2) + s);
    }

    public static float[] d(PlayerPenaltyShotView playerPenaltyShotView, int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        float f = playerPenaltyShotView.o;
        float f2 = z ? f : 0.0f;
        float f3 = z ? f : 0.0f;
        float f4 = z2 ? f : 0.0f;
        float f5 = z2 ? f : 0.0f;
        float f6 = z3 ? f : 0.0f;
        float f7 = z3 ? f : 0.0f;
        float f8 = z4 ? f : 0.0f;
        if (!z4) {
            f = 0.0f;
        }
        return new float[]{f2, f3, f4, f5, f6, f7, f8, f};
    }

    public static ValueAnimator e(PlayerPenaltyShotView playerPenaltyShotView, float f, float f2, Function1 function1) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new n6(function1, ofFloat, playerPenaltyShotView, 3));
        return ofFloat;
    }

    private final Drawable getGloveDrawable() {
        return (Drawable) this.gloveDrawable.getValue();
    }

    public final PlayerPenaltyHistoryData a(PlayerPenaltyHistoryData playerPenaltyHistoryData) {
        float f = this.m;
        double d = f / this.k;
        double d2 = f / this.l;
        double d3 = 100.0d - d;
        double d4 = 100.0d - d2;
        Double d5 = null;
        Double valueOf = playerPenaltyHistoryData.getX() < d ? Double.valueOf(d) : playerPenaltyHistoryData.getX() > d3 ? Double.valueOf(d3) : null;
        if (playerPenaltyHistoryData.getY() < d2) {
            d5 = Double.valueOf(d2);
        } else if (playerPenaltyHistoryData.getY() > d4) {
            d5 = Double.valueOf(d4);
        }
        if (valueOf == null && d5 == null) {
            return playerPenaltyHistoryData;
        }
        return PlayerPenaltyHistoryData.copy$default(playerPenaltyHistoryData, 0, null, null, valueOf != null ? valueOf.doubleValue() : playerPenaltyHistoryData.getX(), d5 != null ? d5.doubleValue() : playerPenaltyHistoryData.getY(), null, 39, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (r1 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(PlayerPenaltyHistoryData playerPenaltyHistoryData) {
        Unit unit;
        PlayerPenaltyHistoryData a = a(playerPenaltyHistoryData);
        PlayerPenaltyHistoryData playerPenaltyHistoryData2 = this.t;
        if (playerPenaltyHistoryData2 != null) {
            final rue rueVar = this.s;
            if (rueVar != null) {
                final int i = 0;
                ValueAnimator e = e(this, (float) playerPenaltyHistoryData2.getX(), (float) a.getX(), new Function1() { // from class: pue
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i2 = i;
                        rue rueVar2 = rueVar;
                        float floatValue = ((Float) obj).floatValue();
                        switch (i2) {
                            case 0:
                                int i3 = PlayerPenaltyShotView.J;
                                rueVar2.a = floatValue;
                                break;
                            default:
                                int i4 = PlayerPenaltyShotView.J;
                                rueVar2.b = floatValue;
                                break;
                        }
                        return Unit.a;
                    }
                });
                final int i2 = 1;
                ValueAnimator e2 = e(this, (float) playerPenaltyHistoryData2.getY(), (float) a.getY(), new Function1() { // from class: pue
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i22 = i2;
                        rue rueVar2 = rueVar;
                        float floatValue = ((Float) obj).floatValue();
                        switch (i22) {
                            case 0:
                                int i3 = PlayerPenaltyShotView.J;
                                rueVar2.a = floatValue;
                                break;
                            default:
                                int i4 = PlayerPenaltyShotView.J;
                                rueVar2.b = floatValue;
                                break;
                        }
                        return Unit.a;
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(e, e2);
                animatorSet.start();
                unit = Unit.a;
            } else {
                unit = null;
            }
        }
        float x = (float) a.getX();
        float y = (float) a.getY();
        rue rueVar2 = new rue();
        rueVar2.a = x;
        rueVar2.b = y;
        this.s = rueVar2;
        for (PlayerPenaltyHistoryData playerPenaltyHistoryData3 : this.a) {
            if (playerPenaltyHistoryData3.getId() == playerPenaltyHistoryData.getId()) {
                this.t = playerPenaltyHistoryData3;
            }
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r7.equals(com.sofascore.model.newNetwork.FootballShotmapItem.SHOT_TYPE_SAVE) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        r9 = com.sofascore.results.R.color.error;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r7.equals(com.sofascore.model.newNetwork.FootballShotmapItem.SHOT_TYPE_POST) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r7.equals(com.sofascore.model.newNetwork.FootballShotmapItem.SHOT_TYPE_MISS) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r11.currentPerspective == defpackage.que.a) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, PlayerPenaltyHistoryData playerPenaltyHistoryData, boolean z) {
        if (this.z == null) {
            Intrinsics.i("areaRect");
            throw null;
        }
        double x = (playerPenaltyHistoryData.getX() * this.k) + r0.left;
        if (this.z == null) {
            Intrinsics.i("areaRect");
            throw null;
        }
        double y = (playerPenaltyHistoryData.getY() * this.l) + r0.top;
        int i = (z || !this.selectionEnabled) ? 255 : 156;
        Paint paint = this.w;
        paint.setAlpha(i);
        float f = this.m;
        canvas.drawCircle((float) x, (float) y, f, paint);
        boolean z2 = this.currentPerspective == que.b && Intrinsics.c(playerPenaltyHistoryData.getOutcome(), FootballShotmapItem.SHOT_TYPE_SAVE);
        Drawable gloveDrawable = z2 ? getGloveDrawable() : this.q;
        if (gloveDrawable != null) {
            if (!z2) {
                String outcome = playerPenaltyHistoryData.getOutcome();
                int hashCode = outcome.hashCode();
                int i2 = R.color.secondary_default;
                switch (hashCode) {
                    case 3178259:
                        if (outcome.equals("goal")) {
                            break;
                        }
                        break;
                    case 3351804:
                        break;
                    case 3446944:
                        break;
                    case 3522941:
                        break;
                }
                v9g.K(gloveDrawable, getContext().getColor(i2));
            }
            double d = f;
            gloveDrawable.setBounds(wzb.a(x - d), wzb.a(y - d), wzb.a(x + d), wzb.a(y + d));
            if (!z2 || playerPenaltyHistoryData.getX() > 50.0d) {
                gloveDrawable.draw(canvas);
            } else {
                v9g.C(gloveDrawable, canvas);
            }
        }
    }

    public final void f(List list, que queVar) {
        list.getClass();
        queVar.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((PlayerPenaltyHistoryData) it.next()));
        }
        this.a = arrayList;
        if (list.isEmpty()) {
            this.s = null;
        }
        this.currentPerspective = queVar;
        invalidate();
    }

    @NotNull
    public final que getCurrentPerspective() {
        return this.currentPerspective;
    }

    public final boolean getDrawBackground() {
        return this.drawBackground;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnShotSelected() {
        return this.onShotSelected;
    }

    public final boolean getSelectionEnabled() {
        return this.selectionEnabled;
    }

    public final boolean getUseRoundedCorners() {
        return this.useRoundedCorners;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        dispatchDraw(canvas);
        if (this.drawBackground) {
            Path path = this.C;
            path.reset();
            boolean z = this.useRoundedCorners;
            RectF rectF = this.A;
            if (z) {
                if (rectF == null) {
                    Intrinsics.i("topRect");
                    throw null;
                }
                path.addRoundRect(rectF, d(this, 12), Path.Direction.CW);
            } else {
                if (rectF == null) {
                    Intrinsics.i("topRect");
                    throw null;
                }
                path.addRect(rectF, Path.Direction.CW);
            }
            canvas.drawPath(path, this.v);
        }
        Path path2 = this.D;
        path2.reset();
        boolean z2 = this.useRoundedCorners;
        RectF rectF2 = this.B;
        if (z2) {
            if (rectF2 == null) {
                Intrinsics.i("bottomRect");
                throw null;
            }
            path2.addRoundRect(rectF2, d(this, 3), Path.Direction.CW);
        } else {
            if (rectF2 == null) {
                Intrinsics.i("bottomRect");
                throw null;
            }
            path2.addRect(rectF2, Path.Direction.CW);
        }
        canvas.drawPath(path2, this.u);
        Drawable drawable = this.p;
        if (drawable != null) {
            Rect rect = this.y;
            if (rect == null) {
                Intrinsics.i("goalRect");
                throw null;
            }
            drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
            drawable.draw(canvas);
        }
        for (PlayerPenaltyHistoryData playerPenaltyHistoryData : this.a) {
            PlayerPenaltyHistoryData playerPenaltyHistoryData2 = this.t;
            if (playerPenaltyHistoryData2 == null || playerPenaltyHistoryData.getId() != playerPenaltyHistoryData2.getId()) {
                c(canvas, playerPenaltyHistoryData, false);
            }
        }
        if (this.s != null) {
            if (this.z == null) {
                Intrinsics.i("areaRect");
                throw null;
            }
            canvas.drawCircle((float) ((r0.a * this.k) + r2.left), (float) ((r0.b * this.l) + r2.top), this.n, this.x);
        }
        PlayerPenaltyHistoryData playerPenaltyHistoryData3 = this.t;
        if (playerPenaltyHistoryData3 != null) {
            c(canvas, playerPenaltyHistoryData3, true);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), this.c);
        RectF rectF = this.A;
        if (rectF == null) {
            Intrinsics.i("topRect");
            throw null;
        }
        float f = rectF.bottom;
        float width = getWidth();
        RectF rectF2 = this.A;
        if (rectF2 == null) {
            Intrinsics.i("topRect");
            throw null;
        }
        this.B = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, width, rectF2.bottom + this.d);
        int width2 = getWidth();
        int i5 = this.e;
        int i6 = (width2 - i5) / 2;
        int i7 = this.f;
        int i8 = this.b;
        Rect rect = new Rect(i6, i8, i5 + i6, i7 + i8);
        this.z = rect;
        int i9 = rect.left + this.i;
        int i10 = this.g + i9;
        int i11 = rect.top + this.j;
        this.y = new Rect(i9, i11, i10, this.h + i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.selectionEnabled) {
            return false;
        }
        boolean z = true;
        if (motionEvent == null || motionEvent.getActionMasked() != 1) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        double d = Double.MAX_VALUE;
        PlayerPenaltyHistoryData playerPenaltyHistoryData = null;
        for (PlayerPenaltyHistoryData playerPenaltyHistoryData2 : this.a) {
            if (this.z == null) {
                Intrinsics.i("areaRect");
                throw null;
            }
            boolean z2 = z;
            double x2 = (playerPenaltyHistoryData2.getX() * this.k) + r11.left;
            if (this.z == null) {
                Intrinsics.i("areaRect");
                throw null;
            }
            double d2 = d;
            double hypot = Math.hypot(Math.abs(x - x2), Math.abs(y - ((playerPenaltyHistoryData2.getY() * this.l) + r1.top)));
            if (hypot >= d2 || hypot >= this.o) {
                d = d2;
            } else {
                d = hypot;
                playerPenaltyHistoryData = playerPenaltyHistoryData2;
            }
            z = z2;
        }
        boolean z3 = z;
        if (playerPenaltyHistoryData == null) {
            return false;
        }
        Function1 function1 = this.onShotSelected;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(playerPenaltyHistoryData.getId()));
        }
        b(playerPenaltyHistoryData);
        super.performClick();
        return z3;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    public final void setOnShotSelected(@Nullable Function1<? super Integer, Unit> function1) {
        this.onShotSelected = function1;
    }

    public final void setSelectionEnabled(boolean z) {
        this.selectionEnabled = z;
    }

    public final void setUseRoundedCorners(boolean z) {
        this.useRoundedCorners = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerPenaltyShotView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
