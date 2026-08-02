package com.sofascore.results.tutorial.wizard;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a3k;
import defpackage.ao2;
import defpackage.b0a;
import defpackage.b3k;
import defpackage.f5p;
import defpackage.f6;
import defpackage.ma9;
import defpackage.p6;
import defpackage.tgj;
import defpackage.y2k;
import defpackage.z1g;
import defpackage.z2k;
import defpackage.zjj;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R(\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0005\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\t¨\u0006'"}, d2 = {"Lcom/sofascore/results/tutorial/wizard/TutorialWizardView;", "Landroid/view/View;", "Landroid/view/View$OnLayoutChangeListener;", "", a.q, "Z", "getShouldOverrideClickBehaviour", "()Z", "setShouldOverrideClickBehaviour", "(Z)V", "shouldOverrideClickBehaviour", "Lkotlin/Function0;", "", "d", "Lkotlin/jvm/functions/Function0;", "getSkipCallback", "()Lkotlin/jvm/functions/Function0;", "setSkipCallback", "(Lkotlin/jvm/functions/Function0;)V", "skipCallback", "e", "getClickCallback", "setClickCallback", "clickCallback", InneractiveMediationDefs.GENDER_FEMALE, "getRemoveCallback", "setRemoveCallback", "removeCallback", "La3k;", U3.i.X, j.b, "La3k;", "setHighlightDrawData", "(La3k;)V", "highlightDrawData", TtmlNode.TAG_P, "getShouldRoundHighlightView", "setShouldRoundHighlightView", "shouldRoundHighlightView", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TutorialWizardView extends View implements View.OnLayoutChangeListener {
    public static final /* synthetic */ int r = 0;
    public final int a;
    public final Point2D b;

    /* renamed from: c, reason: from kotlin metadata */
    public boolean shouldOverrideClickBehaviour;

    /* renamed from: d, reason: from kotlin metadata */
    public Function0 skipCallback;

    /* renamed from: e, reason: from kotlin metadata */
    public Function0 clickCallback;

    /* renamed from: f, reason: from kotlin metadata */
    public Function0 removeCallback;
    public final Paint g;
    public final Paint h;
    public final Paint i;

    /* renamed from: j, reason: from kotlin metadata */
    public a3k highlightDrawData;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public Float o;

    /* renamed from: p, reason: from kotlin metadata */
    public boolean shouldRoundHighlightView;
    public ValueAnimator q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialWizardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        context.getClass();
        this.a = ao2.s(12, context);
        ao2.s(8, context);
        ao2.u(16, context);
        this.b = new Point2D(-1.0f, -1.0f);
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.tutorial_wizard_overlay));
        this.g = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        this.h = paint2;
        new Paint(1).setColor(context.getColor(R.color.surface_1));
        Paint paint3 = new Paint(1);
        paint3.setColor(0);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.i = paint3;
        new Paint(1).setColor(context.getColor(R.color.primary_default));
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(context.getColor(R.color.on_color_primary));
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(ao2.u(14, context));
        try {
            typeface = z1g.a(R.font.sofascore_sans_regular, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextAlign(Paint.Align.LEFT);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(context.getColor(R.color.on_color_secondary));
        textPaint2.setStyle(Paint.Style.FILL);
        textPaint2.setTextSize(ao2.u(12, context));
        try {
            typeface2 = z1g.a(R.font.sofascore_sans_medium, context);
        } catch (Exception unused2) {
            typeface2 = Typeface.DEFAULT;
        }
        textPaint2.setTypeface(typeface2);
        textPaint2.setTextAlign(Paint.Align.LEFT);
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setColor(context.getColor(R.color.primary_default));
        textPaint3.setStyle(Paint.Style.FILL);
        textPaint3.setTextSize(ao2.u(12, context));
        try {
            typeface3 = z1g.a(R.font.sofascore_sans_medium, context);
        } catch (Exception unused3) {
            typeface3 = Typeface.DEFAULT;
        }
        textPaint3.setTypeface(typeface3);
        textPaint3.setTextAlign(Paint.Align.LEFT);
        this.m = true;
        this.n = true;
        this.shouldRoundHighlightView = true;
        setWillNotDraw(false);
        setLayerType(2, null);
        setOnTouchListener(new f6(this, 5));
    }

    public static /* synthetic */ void b(TutorialWizardView tutorialWizardView, View view, boolean z, boolean z2, Float f, int i) {
        boolean z3 = (i & 2) != 0;
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            f = null;
        }
        tutorialWizardView.a(view, z3, z, z2, f);
    }

    private final void setHighlightDrawData(a3k a3kVar) {
        Function0 function0;
        this.highlightDrawData = a3kVar;
        invalidate();
        if (a3kVar != null || (function0 = this.removeCallback) == null) {
            return;
        }
        function0.invoke();
    }

    public final void a(View view, boolean z, boolean z2, boolean z3, Float f) {
        zjj zjjVar;
        this.m = z2;
        this.n = z3;
        this.o = f;
        View view2 = this.k;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this);
        }
        this.k = view;
        this.l = view;
        getContext().getClass();
        if (b0a.k == null) {
            zjjVar = null;
        } else {
            if (y2k.a[0] != 1) {
                zzl.b();
                return;
            }
            zjjVar = new zjj();
        }
        if (view == null || zjjVar == null || getWidth() == 0) {
            setHighlightDrawData(null);
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (iArr[0] == 0 && iArr[1] == 0 && !view.isLaidOut()) {
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new b3k(this, view, z, z2, z3, f));
                return;
            } else {
                a(view, z, z2, z3, f);
                return;
            }
        }
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        ma9 u = f5p.u(iArr2, iArr, getWidth(), view.getWidth(), view.getHeight(), this.a, z2, f);
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.q = null;
        getContext().getResources().getConfiguration().getLayoutDirection();
        setHighlightDrawData(new a3k(u));
        View view3 = this.k;
        if (view3 != null) {
            view3.addOnLayoutChangeListener(this);
        }
        if (z3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setRepeatCount(200);
            ofFloat.setDuration(1000L);
            ofFloat.addUpdateListener(new p6(9, this, ofFloat));
            ofFloat.start();
            this.q = ofFloat;
        }
        if (z) {
            tgj.p(this, 300L, 2);
        }
    }

    @Nullable
    public final Function0<Unit> getClickCallback() {
        return this.clickCallback;
    }

    @Nullable
    public final Function0<Unit> getRemoveCallback() {
        return this.removeCallback;
    }

    public final boolean getShouldOverrideClickBehaviour() {
        return this.shouldOverrideClickBehaviour;
    }

    public final boolean getShouldRoundHighlightView() {
        return this.shouldRoundHighlightView;
    }

    @Nullable
    public final Function0<Unit> getSkipCallback() {
        return this.skipCallback;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.k;
        if (view != null) {
            view.post(new z2k(this, 0));
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        a3k a3kVar = this.highlightDrawData;
        if (a3kVar != null) {
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.g);
            a3kVar.a.a(canvas, this.i, this.h, this.shouldRoundHighlightView);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != null) {
            view.post(new z2k(this, 1));
        }
    }

    public final void setClickCallback(@Nullable Function0<Unit> function0) {
        this.clickCallback = function0;
    }

    public final void setRemoveCallback(@Nullable Function0<Unit> function0) {
        this.removeCallback = function0;
    }

    public final void setShouldOverrideClickBehaviour(boolean z) {
        this.shouldOverrideClickBehaviour = z;
    }

    public final void setShouldRoundHighlightView(boolean z) {
        this.shouldRoundHighlightView = z;
        invalidate();
    }

    public final void setSkipCallback(@Nullable Function0<Unit> function0) {
        this.skipCallback = function0;
    }
}
