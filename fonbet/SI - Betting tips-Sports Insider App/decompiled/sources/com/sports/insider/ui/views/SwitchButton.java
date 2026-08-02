package com.sports.insider.ui.views;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.lifecycle.d1;
import com.google.android.material.card.MaterialCardViewHelper;
import com.sports.insider.MyApp;
import com.sports.insider.ui.settings.SettingFragment;
import d9.e;
import da.s;
import ec.z;
import eg.c0;
import eg.y;
import hd.g;
import io.sentry.android.core.f;
import jg.q;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oe.i;
import oe.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rc.b0;
import ve.o0;
import ve.p0;
import ve.q0;
import ve.r0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0012\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/sports/insider/ui/views/SwitchButton;", "Landroid/view/View;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "checked", "", "setChecked", "(Z)V", "shadowEffect", "setShadowEffect", "enable", "setEnableEffect", "Lve/o0;", "l", "setOnCheckedChangeListener", "(Lve/o0;)V", "Lve/p0;", "viewState", "setUncheckViewState", "(Lve/p0;)V", "setCheckedViewState", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchButton extends View implements Checkable {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f7947w0 = 0;
    public final int A;
    public final int B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final int G;
    public final int H;
    public float I;
    public float J;
    public final Paint K;
    public final Paint L;

    /* renamed from: a, reason: collision with root package name */
    public final float f7948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7950c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7951d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7952e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7953f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7954g;

    /* renamed from: g0, reason: collision with root package name */
    public final p0 f7955g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f7956h;

    /* renamed from: h0, reason: collision with root package name */
    public final p0 f7957h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f7958i;

    /* renamed from: i0, reason: collision with root package name */
    public final p0 f7959i0;
    public final int j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f7960k;
    public final ValueAnimator k0;

    /* renamed from: l, reason: collision with root package name */
    public float f7961l;

    /* renamed from: l0, reason: collision with root package name */
    public final ArgbEvaluator f7962l0;

    /* renamed from: m, reason: collision with root package name */
    public float f7963m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f7964m0;

    /* renamed from: n, reason: collision with root package name */
    public float f7965n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f7966n0;

    /* renamed from: o, reason: collision with root package name */
    public float f7967o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f7968o0;

    /* renamed from: p, reason: collision with root package name */
    public float f7969p;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f7970p0;
    public float q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f7971q0;

    /* renamed from: r, reason: collision with root package name */
    public float f7972r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f7973r0;

    /* renamed from: s, reason: collision with root package name */
    public float f7974s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f7975s0;

    /* renamed from: t, reason: collision with root package name */
    public final int f7976t;

    /* renamed from: t0, reason: collision with root package name */
    public o0 f7977t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f7978u;

    /* renamed from: u0, reason: collision with root package name */
    public long f7979u0;

    /* renamed from: v, reason: collision with root package name */
    public final int f7980v;

    /* renamed from: v0, reason: collision with root package name */
    public final f f7981v0;

    /* renamed from: w, reason: collision with root package name */
    public final int f7982w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7983x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7984y;

    /* renamed from: z, reason: collision with root package name */
    public final float f7985z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        float f6;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7948a = 1.0f;
        this.f7949b = 58;
        this.f7950c = 36;
        this.f7951d = 1;
        this.f7952e = 2;
        this.f7953f = 3;
        this.f7954g = 4;
        this.f7956h = 5;
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new Paint(1);
        this.j0 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        this.k0 = ofFloat;
        this.f7962l0 = new ArgbEvaluator();
        this.f7981v0 = new f(16, this);
        r0 r0Var = new r0(this);
        q0 q0Var = new q0(this);
        float f10 = context.getResources().getDisplayMetrics().density;
        f10 = f10 < 0.1f ? 0.1f : f10;
        this.f7948a = f10;
        this.f7949b = (int) (58.0f * f10);
        this.f7950c = (int) (36.0f * f10);
        TypedArray obtainStyledAttributes = attributeSet != null ? context.obtainStyledAttributes(attributeSet, s.f8357g) : null;
        this.f7968o0 = obtainStyledAttributes == null ? true : obtainStyledAttributes.getBoolean(11, true);
        this.A = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(16, -5592406) : -5592406;
        int i5 = (int) (this.f7948a * 1.5f);
        this.B = obtainStyledAttributes != null ? obtainStyledAttributes.getDimensionPixelOffset(18, i5) : i5;
        float f11 = this.f7948a;
        this.C = 10.0f * f11;
        float f12 = f11 * 4.0f;
        if (obtainStyledAttributes == null) {
            f6 = 1.5f;
        } else {
            f6 = 1.5f;
            f12 = obtainStyledAttributes.getDimension(17, f12);
        }
        this.D = f12;
        float f13 = this.f7948a;
        float f14 = 4.0f * f13;
        this.E = f14;
        this.F = f14;
        int i10 = (int) (2.5f * f13);
        this.f7958i = obtainStyledAttributes != null ? obtainStyledAttributes.getDimensionPixelOffset(13, i10) : i10;
        int i11 = (int) (f6 * this.f7948a);
        this.j = obtainStyledAttributes != null ? obtainStyledAttributes.getDimensionPixelOffset(12, i11) : i11;
        this.f7960k = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(10, 855638016) : 855638016;
        this.f7978u = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(19, -2236963) : -2236963;
        this.f7980v = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(7, -11414681) : -11414681;
        int i12 = (int) (this.f7948a * 1.0f);
        this.f7982w = obtainStyledAttributes != null ? obtainStyledAttributes.getDimensionPixelOffset(1, i12) : i12;
        this.f7983x = obtainStyledAttributes == null ? -1 : obtainStyledAttributes.getColor(3, -1);
        int i13 = (int) (this.f7948a * 1.0f);
        this.f7984y = obtainStyledAttributes != null ? obtainStyledAttributes.getDimensionPixelOffset(4, i13) : i13;
        this.f7985z = 6.0f * this.f7948a;
        int color = obtainStyledAttributes == null ? -1 : obtainStyledAttributes.getColor(2, -1);
        this.G = obtainStyledAttributes == null ? color : obtainStyledAttributes.getColor(15, color);
        this.H = obtainStyledAttributes == null ? color : obtainStyledAttributes.getColor(6, color);
        int i14 = obtainStyledAttributes != null ? obtainStyledAttributes.getInt(8, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION) : MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION;
        this.f7964m0 = obtainStyledAttributes == null ? false : obtainStyledAttributes.getBoolean(5, false);
        this.f7970p0 = obtainStyledAttributes == null ? false : obtainStyledAttributes.getBoolean(14, false);
        this.f7976t = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(0, -1) : -1;
        this.f7966n0 = obtainStyledAttributes == null ? true : obtainStyledAttributes.getBoolean(9, true);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        paint.setColor(color);
        if (this.f7968o0) {
            paint.setShadowLayer(this.f7958i, 0.0f, this.j, this.f7960k);
        }
        this.f7955g0 = new p0();
        this.f7957h0 = new p0();
        this.f7959i0 = new p0();
        ofFloat.setDuration(i14);
        ofFloat.setRepeatCount(0);
        ofFloat.addUpdateListener(r0Var);
        ofFloat.addListener(q0Var);
        setClickable(true);
        super.setPadding(0, 0, 0, 0);
        setLayerType(1, null);
    }

    private final void setCheckedViewState(p0 viewState) {
        Intrinsics.checkNotNull(viewState);
        viewState.f24759d = this.f7961l;
        viewState.f24757b = this.f7980v;
        viewState.f24758c = this.f7983x;
        viewState.f24756a = this.J;
        this.K.setColor(this.H);
    }

    private final void setUncheckViewState(p0 viewState) {
        Intrinsics.checkNotNull(viewState);
        viewState.f24759d = 0.0f;
        viewState.f24757b = this.f7978u;
        viewState.f24758c = 0;
        viewState.f24756a = this.I;
        this.K.setColor(this.G);
    }

    public final void a() {
        o0 o0Var = this.f7977t0;
        if (o0Var != null) {
            this.f7975s0 = true;
            boolean z5 = this.f7964m0;
            SettingFragment settingFragment = (SettingFragment) o0Var;
            z zVar = (z) settingFragment.f22459a;
            Continuation continuation = null;
            if (Intrinsics.areEqual(this, zVar != null ? zVar.f9080i : null)) {
                settingFragment.M().getClass();
                new b0().c("SETTINGS_FUNC_USES", new JSONObject().put("funcName", "clickNotifyLiveStatus"));
                c0.t(d1.g(settingFragment), q.f18523a, null, new g(settingFragment, this, z5, (Continuation) null), 2);
            } else {
                z zVar2 = (z) settingFragment.f22459a;
                if (Intrinsics.areEqual(this, zVar2 != null ? zVar2.f9084n : null)) {
                    settingFragment.M().getClass();
                    new b0().c("SETTINGS_FUNC_USES", new JSONObject().put("funcName", "clickNotifyNewPrediction"));
                    k M = settingFragment.M();
                    M.getClass();
                    c0.t(MyApp.f6830c, new y("onChangePushChecked"), null, new i(M, z5, continuation, 1), 2);
                } else {
                    z zVar3 = (z) settingFragment.f22459a;
                    if (Intrinsics.areEqual(this, zVar3 != null ? zVar3.f9075d : null)) {
                        settingFragment.M().getClass();
                        new b0().c("SETTINGS_FUNC_USES", new JSONObject().put("funcName", "clickAlternativePayment"));
                        k M2 = settingFragment.M();
                        M2.getClass();
                        c0.t(MyApp.f6830c, new y("onChangePriorityAPaymentChecked"), null, new i(M2, z5, continuation, 0), 2);
                    }
                }
            }
        }
        this.f7975s0 = false;
    }

    public final boolean b() {
        int i5 = this.j0;
        return i5 == this.f7951d || i5 == this.f7953f;
    }

    public final void c() {
        if (this.j0 == this.f7952e || b()) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            this.j0 = this.f7953f;
            p0 p0Var = this.f7957h0;
            Intrinsics.checkNotNull(p0Var);
            p0Var.a(this.f7955g0);
            if (this.f7964m0) {
                setCheckedViewState(this.f7959i0);
            } else {
                setUncheckViewState(this.f7959i0);
            }
            valueAnimator.start();
        }
    }

    public final void d(boolean z5, boolean z7) {
        if (isEnabled()) {
            if (this.f7975s0) {
                throw new RuntimeException("should NOT switch the state in method: [onCheckedChanged]!");
            }
            if (!this.f7973r0) {
                this.f7964m0 = !this.f7964m0;
                if (z7) {
                    a();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            if (this.f7966n0 && z5) {
                this.j0 = this.f7956h;
                p0 p0Var = this.f7957h0;
                Intrinsics.checkNotNull(p0Var);
                p0Var.a(this.f7955g0);
                if (this.f7964m0) {
                    setUncheckViewState(this.f7959i0);
                } else {
                    setCheckedViewState(this.f7959i0);
                }
                valueAnimator.start();
                return;
            }
            boolean z10 = this.f7964m0;
            this.f7964m0 = !z10;
            if (z10) {
                setUncheckViewState(this.f7955g0);
            } else {
                setCheckedViewState(this.f7955g0);
            }
            postInvalidate();
            if (z7) {
                a();
            }
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f7964m0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f6 = this.f7982w;
        Paint paint = this.L;
        paint.setStrokeWidth(f6);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(this.f7976t);
        float f10 = this.f7967o;
        float f11 = this.f7969p;
        float f12 = this.q;
        float f13 = this.f7972r;
        float f14 = this.f7961l;
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, paint);
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
        paint.setColor(this.f7978u);
        float f15 = this.f7967o;
        float f16 = this.f7969p;
        float f17 = this.q;
        float f18 = this.f7972r;
        float f19 = this.f7961l;
        canvas.drawRoundRect(f15, f16, f17, f18, f19, f19, paint);
        if (this.f7970p0) {
            float f20 = this.B;
            float f21 = this.q - this.C;
            float f22 = this.f7974s;
            paint.setStyle(style2);
            paint.setColor(this.A);
            paint.setStrokeWidth(f20);
            canvas.drawCircle(f21, f22, this.D, paint);
        }
        p0 p0Var = this.f7955g0;
        Intrinsics.checkNotNull(p0Var);
        float f23 = p0Var.f24759d * 0.5f;
        paint.setStyle(style2);
        p0 p0Var2 = this.f7955g0;
        Intrinsics.checkNotNull(p0Var2);
        paint.setColor(p0Var2.f24757b);
        paint.setStrokeWidth((2.0f * f23) + this.f7982w);
        float f24 = this.f7967o + f23;
        float f25 = this.f7969p + f23;
        float f26 = this.q - f23;
        float f27 = this.f7972r - f23;
        float f28 = this.f7961l;
        canvas.drawRoundRect(f24, f25, f26, f27, f28, f28, paint);
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        float f29 = this.f7967o;
        float f30 = this.f7969p;
        float f31 = 2;
        float f32 = this.f7961l;
        canvas.drawArc(f29, f30, (f31 * f32) + f29, (f32 * f31) + f30, 90.0f, 180.0f, true, paint);
        float f33 = this.f7967o + this.f7961l;
        float f34 = this.f7969p;
        p0 p0Var3 = this.f7955g0;
        Intrinsics.checkNotNull(p0Var3);
        canvas.drawRect(f33, f34, p0Var3.f24756a, this.f7969p + (f31 * this.f7961l), paint);
        if (this.f7970p0) {
            p0 p0Var4 = this.f7955g0;
            Intrinsics.checkNotNull(p0Var4);
            int i5 = p0Var4.f24758c;
            float f35 = this.f7984y;
            float f36 = this.f7967o + this.f7961l;
            float f37 = f36 - this.E;
            float f38 = this.f7974s;
            float f39 = this.f7985z;
            paint.setStyle(style2);
            paint.setColor(i5);
            paint.setStrokeWidth(f35);
            canvas.drawLine(f37, f38 - f39, f36 - this.F, f38 + f39, paint);
        }
        p0 p0Var5 = this.f7955g0;
        Intrinsics.checkNotNull(p0Var5);
        float f40 = p0Var5.f24756a;
        float f41 = this.f7974s;
        canvas.drawCircle(f40, f41, this.f7963m, this.K);
        paint.setStyle(style2);
        paint.setStrokeWidth(1.0f);
        paint.setColor(-2236963);
        canvas.drawCircle(f40, f41, this.f7963m, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(this.f7949b, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f7950c, 1073741824);
        }
        super.onMeasure(i5, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        float max = Math.max(this.f7958i + this.j, this.f7982w);
        float f6 = i10 - max;
        float f10 = i5 - max;
        this.f7965n = f10 - max;
        float f11 = (f6 - max) * 0.5f;
        this.f7961l = f11;
        this.f7963m = f11 - this.f7982w;
        this.f7967o = max;
        this.f7969p = max;
        this.q = f10;
        this.f7972r = f6;
        this.f7974s = (f6 + max) * 0.5f;
        this.I = max + f11;
        this.J = f10 - f11;
        if (this.f7964m0) {
            setCheckedViewState(this.f7955g0);
        } else {
            setUncheckViewState(this.f7955g0);
        }
        this.f7973r0 = true;
        postInvalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        f fVar = this.f7981v0;
        if (actionMasked == 0) {
            this.f7971q0 = true;
            this.f7979u0 = System.currentTimeMillis();
            removeCallbacks(fVar);
            postDelayed(fVar, 100L);
            return true;
        }
        int i5 = this.f7952e;
        if (actionMasked == 1) {
            this.f7971q0 = false;
            removeCallbacks(fVar);
            if (System.currentTimeMillis() - this.f7979u0 <= 300) {
                d(true, true);
                return true;
            }
            if (this.j0 == i5) {
                boolean z5 = Math.max(0.0f, Math.min(1.0f, event.getX() / this.f7965n)) > 0.5f;
                if (z5 == this.f7964m0) {
                    c();
                    return true;
                }
                this.f7964m0 = z5;
                ValueAnimator valueAnimator = this.k0;
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                this.j0 = this.f7954g;
                p0 p0Var = this.f7957h0;
                Intrinsics.checkNotNull(p0Var);
                p0Var.a(this.f7955g0);
                if (this.f7964m0) {
                    setCheckedViewState(this.f7959i0);
                } else {
                    setUncheckViewState(this.f7959i0);
                }
                valueAnimator.start();
                return true;
            }
            if (b()) {
                c();
            }
        } else {
            if (actionMasked == 2) {
                float x10 = event.getX();
                if (b()) {
                    float max = Math.max(0.0f, Math.min(1.0f, x10 / this.f7965n));
                    p0 p0Var2 = this.f7955g0;
                    Intrinsics.checkNotNull(p0Var2);
                    float f6 = this.I;
                    p0Var2.f24756a = e.w(this.J, f6, max, f6);
                    return true;
                }
                if (this.j0 == i5) {
                    float max2 = Math.max(0.0f, Math.min(1.0f, x10 / this.f7965n));
                    p0 p0Var3 = this.f7955g0;
                    Intrinsics.checkNotNull(p0Var3);
                    float f10 = this.I;
                    p0Var3.f24756a = e.w(this.J, f10, max2, f10);
                    p0 p0Var4 = this.f7955g0;
                    Intrinsics.checkNotNull(p0Var4);
                    Object evaluate = this.f7962l0.evaluate(max2, Integer.valueOf(this.f7978u), Integer.valueOf(this.f7980v));
                    Intrinsics.checkNotNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
                    p0Var4.f24757b = ((Integer) evaluate).intValue();
                    postInvalidate();
                }
                return true;
            }
            if (actionMasked == 3) {
                this.f7971q0 = false;
                removeCallbacks(fVar);
                if (!b() && this.j0 != i5) {
                    return true;
                }
                c();
                return true;
            }
        }
        return true;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (checked == this.f7964m0) {
            postInvalidate();
        } else {
            d(this.f7966n0, false);
        }
    }

    public final void setEnableEffect(boolean enable) {
        this.f7966n0 = enable;
    }

    public final void setOnCheckedChangeListener(@Nullable o0 l6) {
        this.f7977t0 = l6;
    }

    @Override // android.view.View
    public final void setPadding(int i5, int i10, int i11, int i12) {
        super.setPadding(0, 0, 0, 0);
    }

    public final void setShadowEffect(boolean shadowEffect) {
        if (this.f7968o0 == shadowEffect) {
            return;
        }
        this.f7968o0 = shadowEffect;
        Paint paint = this.K;
        if (shadowEffect) {
            paint.setShadowLayer(this.f7958i, 0.0f, this.j, this.f7960k);
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        d(true, true);
    }
}
