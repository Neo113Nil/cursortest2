package com.blaze.blazesdk.widgets.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.unity3d.services.UnityAdsConstants;
import defpackage.abm;
import defpackage.l5m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/widgets/ui/ShimmeringView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ShimmeringView extends FrameLayout {
    public final l5m a;
    public final Paint b;
    public boolean c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Keep
    public ShimmeringView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.a = new l5m();
        this.b = new Paint();
    }

    public final void a() {
        ValueAnimator valueAnimator;
        if (isAttachedToWindow()) {
            boolean z = true;
            this.c = true;
            l5m l5mVar = this.a;
            l5mVar.setCallback(this);
            abm abmVar = new abm.a().a;
            abmVar.getClass();
            try {
                int[] iArr = abmVar.b;
                int i = abmVar.d;
                iArr[0] = i;
                int i2 = abmVar.c;
                iArr[1] = i2;
                iArr[2] = i2;
                iArr[3] = i;
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
            try {
                float[] fArr = abmVar.a;
                float f = abmVar.g;
                float f2 = 1.0f;
                float f3 = (1.0f - f) / 2.0f;
                if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = 0.0f;
                }
                fArr[0] = f3;
                fArr[1] = 0.4995f;
                fArr[2] = 0.5005f;
                float f4 = (f + 1.0f) / 2.0f;
                if (f4 <= 1.0f) {
                    f2 = f4;
                }
                fArr[3] = f2;
            } catch (Throwable th2) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
            }
            try {
                l5mVar.g = abmVar;
                Paint paint = l5mVar.b;
                abm abmVar2 = l5mVar.g;
                paint.setXfermode(new PorterDuffXfermode((abmVar2 == null || !abmVar2.j) ? PorterDuff.Mode.SRC_IN : PorterDuff.Mode.DST_IN));
                l5mVar.b();
                l5mVar.c();
                l5mVar.invalidateSelf();
            } catch (Throwable th3) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
            }
            setLayerType(2, this.b);
            try {
                ValueAnimator valueAnimator2 = l5mVar.e;
                if (valueAnimator2 != null) {
                    if (valueAnimator2 == null || !valueAnimator2.isStarted()) {
                        z = false;
                    }
                    if (z || (valueAnimator = l5mVar.e) == null) {
                        return;
                    }
                    valueAnimator.start();
                }
            } catch (Throwable th4) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
            }
        }
    }

    public final void b() {
        ValueAnimator valueAnimator;
        boolean z = false;
        this.c = false;
        this.d = false;
        l5m l5mVar = this.a;
        l5mVar.getClass();
        try {
            ValueAnimator valueAnimator2 = l5mVar.e;
            if (valueAnimator2 != null) {
                if (valueAnimator2 != null && valueAnimator2.isStarted()) {
                    z = true;
                }
                if (z && (valueAnimator = l5mVar.e) != null) {
                    valueAnimator.cancel();
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        try {
            Float.compare(-1.0f, l5mVar.f);
            if (l5mVar.f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            l5mVar.f = -1.0f;
            l5mVar.invalidateSelf();
        } catch (Throwable th2) {
            try {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
            } catch (Throwable th3) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        if (this.c) {
            this.a.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        view.getClass();
        super.onVisibilityChanged(view, i);
        l5m l5mVar = this.a;
        if (i == 0) {
            if (this.d) {
                l5mVar.a();
                this.d = false;
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = l5mVar.e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        b();
        this.d = true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        drawable.getClass();
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public ShimmeringView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public ShimmeringView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ShimmeringView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public ShimmeringView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
