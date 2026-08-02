package com.sofascore.results.view.header.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.setting.i;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.task.g;
import defpackage.ao2;
import defpackage.g6b;
import defpackage.i6;
import defpackage.j6;
import defpackage.me4;
import defpackage.o13;
import defpackage.rq4;
import defpackage.s2;
import defpackage.u6b;
import defpackage.v5g;
import defpackage.w5g;
import defpackage.wzb;
import defpackage.z1g;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u00023GJ\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010,R\"\u00102\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\u0014R\"\u0010:\u001a\u0002038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/sofascore/results/view/header/widget/RollingTextView;", "Landroid/view/View;", "Lrq4;", "", "getText", "()Ljava/lang/String;", "", "getTextSize", "()F", "", "color", "", "setTextColor", "(I)V", "Landroid/graphics/Typeface;", "typeface", "setTextTypeface", "(Landroid/graphics/Typeface;)V", "textSize", "setTextSize", "(F)V", "Lu6b;", "b", "Lu6b;", "getLifecycleOwner", "()Lu6b;", "setLifecycleOwner", "(Lu6b;)V", "lifecycleOwner", a.q, "I", "getSize", "()I", "size", "Landroid/text/TextPaint;", "e", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "textPaint", g.e, "Ljava/lang/String;", "getTextNext", "setTextNext", "(Ljava/lang/String;)V", "textNext", h.b, "F", "getYAnimate", "setYAnimate", "yAnimate", "Lw5g;", i.a, "Lw5g;", "getRollDirection", "()Lw5g;", "setRollDirection", "(Lw5g;)V", "rollDirection", "", j.b, "Z", "getWasActivityStopped", "()Z", "setWasActivityStopped", "(Z)V", "wasActivityStopped", "Landroid/graphics/Paint$FontMetrics;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetrics;", "fontMetrics", "v5g", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public class RollingTextView extends View implements rq4 {
    public static final /* synthetic */ int k = 0;
    public ArrayList a;

    /* renamed from: b, reason: from kotlin metadata */
    public u6b lifecycleOwner;

    /* renamed from: c, reason: from kotlin metadata */
    public final int size;
    public final Rect d;

    /* renamed from: e, reason: from kotlin metadata */
    public final TextPaint textPaint;
    public String f;

    /* renamed from: g, reason: from kotlin metadata */
    public String textNext;

    /* renamed from: h, reason: from kotlin metadata */
    public float yAnimate;

    /* renamed from: i, reason: from kotlin metadata */
    public w5g rollDirection;

    /* renamed from: j, reason: from kotlin metadata */
    public boolean wasActivityStopped;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RollingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Typeface typeface;
        context.getClass();
        this.a = new ArrayList();
        this.size = ao2.s(28, context);
        this.d = new Rect();
        TextPaint textPaint = new TextPaint();
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(getSize());
        this.textPaint = textPaint;
        this.rollDirection = w5g.a;
        if (context instanceof u6b) {
            u6b u6bVar = (u6b) context;
            this.lifecycleOwner = u6bVar;
            u6bVar.getLifecycle().a(this);
        }
    }

    private final Paint.FontMetrics getFontMetrics() {
        Paint.FontMetrics fontMetrics = getTextPaint().getFontMetrics();
        fontMetrics.getClass();
        return fontMetrics;
    }

    public final void a() {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((v5g) it.next()).b.cancel();
        }
        this.a = new ArrayList();
    }

    public void b() {
        String str = this.textNext;
        this.f = str;
        setContentDescription(str);
        o13.C(this.a);
        v5g v5gVar = (v5g) CollectionsKt.firstOrNull(this.a);
        if (v5gVar != null) {
            v5gVar.b.start();
        }
    }

    public final CharSequence c(String str) {
        CharSequence ellipsize = TextUtils.ellipsize(str, getTextPaint(), (getWidth() - getPaddingStart()) - getPaddingEnd(), TextUtils.TruncateAt.END);
        getTextPaint().getTextBounds(ellipsize.toString(), 0, ellipsize.length(), this.d);
        return ellipsize;
    }

    public void d(String str, boolean z, boolean z2) {
        if (!z || this.wasActivityStopped) {
            a();
            this.f = str;
            this.yAnimate = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.textNext = null;
            requestLayout();
            invalidate();
            if (z2) {
                this.wasActivityStopped = false;
                return;
            }
            return;
        }
        if (this.a.isEmpty() && Intrinsics.c(str, this.f)) {
            return;
        }
        if (!this.a.isEmpty()) {
            v5g v5gVar = (v5g) CollectionsKt.j0(this.a);
            if (Intrinsics.c(str, v5gVar != null ? v5gVar.a : null)) {
                return;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setStartDelay(350L);
        ofFloat.addUpdateListener(new s2(this, 15));
        ofFloat.addListener(new i6(3, this, str));
        ofFloat.addListener(new j6(this, 5));
        if (this.a.size() < 1) {
            this.a.add(new v5g(str, ofFloat));
            ofFloat.start();
            return;
        }
        while (true) {
            int size = this.a.size();
            ArrayList arrayList = this.a;
            if (size <= 1) {
                arrayList.add(new v5g(str, ofFloat));
                return;
            }
            arrayList.remove(b.i(arrayList));
        }
    }

    @Nullable
    public final u6b getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final w5g getRollDirection() {
        return this.rollDirection;
    }

    public int getSize() {
        return this.size;
    }

    @Nullable
    /* renamed from: getText, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Nullable
    public final String getTextNext() {
        return this.textNext;
    }

    @NotNull
    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final float getTextSize() {
        return getTextPaint().getTextSize();
    }

    public final boolean getWasActivityStopped() {
        return this.wasActivityStopped;
    }

    public final float getYAnimate() {
        return this.yAnimate;
    }

    @Override // defpackage.rq4
    public void onDestroy(u6b u6bVar) {
        g6b lifecycle;
        a();
        u6b u6bVar2 = this.lifecycleOwner;
        if (u6bVar2 == null || (lifecycle = u6bVar2.getLifecycle()) == null) {
            return;
        }
        lifecycle.d(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        String str2;
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        getTextPaint().getTextBounds("0", 0, 1, this.d);
        float height = (r7.height() + getHeight()) / 2.0f;
        int ordinal = this.rollDirection.ordinal();
        if (ordinal == 0) {
            String str3 = this.textNext;
            if (str3 != null) {
                CharSequence c = c(str3);
                canvas.drawText(c, 0, c.length(), width - (r7.width() / 2.0f), height * this.yAnimate, getTextPaint());
            }
            if (this.yAnimate >= 1.0f || (str = this.f) == null) {
                return;
            }
            CharSequence c2 = c(str);
            canvas.drawText(c2, 0, c2.length(), width - (r7.width() / 2.0f), (this.yAnimate * height) + height, getTextPaint());
            return;
        }
        if (ordinal != 1) {
            zzl.b();
            return;
        }
        String str4 = this.textNext;
        if (str4 != null) {
            CharSequence c3 = c(str4);
            canvas.drawText(c3, 0, c3.length(), width - (r7.width() / 2.0f), me4.b(1.0f, this.yAnimate, height, height), getTextPaint());
        }
        if (this.yAnimate >= 1.0f || (str2 = this.f) == null) {
            return;
        }
        CharSequence c4 = c(str2);
        canvas.drawText(c4, 0, c4.length(), width - (r7.width() / 2.0f), (1.0f - this.yAnimate) * height, getTextPaint());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = getTextPaint();
        String str = this.textNext;
        if (str == null) {
            str = "";
        }
        int measureText = (int) textPaint.measureText(str);
        TextPaint textPaint2 = getTextPaint();
        String str2 = this.f;
        setMeasuredDimension(getPaddingEnd() + getPaddingStart() + Math.max(measureText, (int) textPaint2.measureText(str2 != null ? str2 : "")), getPaddingBottom() + getPaddingTop() + wzb.b(getFontMetrics().descent - getFontMetrics().ascent));
    }

    @Override // defpackage.rq4
    public void onStop(u6b u6bVar) {
        this.wasActivityStopped = true;
        a();
    }

    public final void setLifecycleOwner(@Nullable u6b u6bVar) {
        this.lifecycleOwner = u6bVar;
    }

    public final void setRollDirection(@NotNull w5g w5gVar) {
        w5gVar.getClass();
        this.rollDirection = w5gVar;
    }

    public final void setTextColor(int color) {
        getTextPaint().setColor(color);
    }

    public final void setTextNext(@Nullable String str) {
        this.textNext = str;
    }

    public final void setTextSize(float textSize) {
        getTextPaint().setTextSize(textSize);
        requestLayout();
        invalidate();
    }

    public final void setTextTypeface(@Nullable Typeface typeface) {
        getTextPaint().setTypeface(typeface);
    }

    public final void setWasActivityStopped(boolean z) {
        this.wasActivityStopped = z;
    }

    public final void setYAnimate(float f) {
        this.yAnimate = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RollingTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
