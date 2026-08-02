package com.zoontek.rnbootsplash;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.margelo.nitro.core.ArrayBuffer$$ExternalSyntheticApiModelOutline0;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.radar.sdk.RadarTrackingOptions;
import java.io.InputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: RNBootSplashDialog.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u0014\u0010\u0018\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\n\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/zoontek/rnbootsplash/RNBootSplashDialog;", "Landroid/app/Dialog;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "themeResId", "", "fade", "", "staticFrame", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/app/Activity;IZLandroid/graphics/Bitmap;)V", "animatedImageView", "Landroid/widget/ImageView;", "animationStartUptimeMs", "", "animationDurationMs", "remainingAnimationTimeMs", "captureCurrentFrame", "onBackPressed", "", ActionType.DISMISS, "callback", "Lkotlin/Function0;", "show", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "buildAnimatedSplashView", "react-native-bootsplash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RNBootSplashDialog extends Dialog {
    private ImageView animatedImageView;
    private long animationDurationMs;
    private long animationStartUptimeMs;
    private final boolean fade;
    private final Bitmap staticFrame;

    public /* synthetic */ RNBootSplashDialog(Activity activity, int i, boolean z, Bitmap bitmap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, i, z, (i2 & 8) != 0 ? null : bitmap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNBootSplashDialog(Activity activity, int i, boolean z, Bitmap bitmap) {
        super(activity, i);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.fade = z;
        this.staticFrame = bitmap;
        setOwnerActivity(activity);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    public final long remainingAnimationTimeMs() {
        if (this.animationStartUptimeMs == 0 || this.animationDurationMs == 0) {
            return 0L;
        }
        return RangesKt.coerceAtLeast(this.animationDurationMs - (SystemClock.uptimeMillis() - this.animationStartUptimeMs), 0L);
    }

    public final Bitmap captureCurrentFrame() {
        Object m13470constructorimpl;
        ImageView imageView = this.animatedImageView;
        if (imageView == null || imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            RNBootSplashDialog rNBootSplashDialog = this;
            Bitmap createBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            imageView.draw(new Canvas(createBitmap));
            m13470constructorimpl = Result.m13470constructorimpl(createBitmap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        return (Bitmap) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
    }

    @Override // android.app.Dialog
    @Deprecated(message = "Deprecated in favor of OnBackPressedCallback")
    public void onBackPressed() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null) {
            ownerActivity.moveTaskToBack(true);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (isShowing()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                RNBootSplashDialog rNBootSplashDialog = this;
                super.dismiss();
                Result.m13470constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public final void dismiss(final Function0<Unit> callback) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isShowing()) {
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.zoontek.rnbootsplash.RNBootSplashDialog$$ExternalSyntheticLambda8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Function0.this.invoke();
                }
            });
            try {
                Result.Companion companion = Result.INSTANCE;
                RNBootSplashDialog rNBootSplashDialog = this;
                super.dismiss();
                m13470constructorimpl = Result.m13470constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m13473exceptionOrNullimpl(m13470constructorimpl) != null) {
                callback.invoke();
            }
            Result.m13469boximpl(m13470constructorimpl);
            return;
        }
        callback.invoke();
    }

    @Override // android.app.Dialog
    public void show() {
        if (isShowing()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            RNBootSplashDialog rNBootSplashDialog = this;
            super.show();
            Result.m13470constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void show(final Function0<Unit> callback) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!isShowing()) {
            setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.zoontek.rnbootsplash.RNBootSplashDialog$$ExternalSyntheticLambda9
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Function0.this.invoke();
                }
            });
            try {
                Result.Companion companion = Result.INSTANCE;
                RNBootSplashDialog rNBootSplashDialog = this;
                super.show();
                m13470constructorimpl = Result.m13470constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m13473exceptionOrNullimpl(m13470constructorimpl) != null) {
                callback.invoke();
            }
            Result.m13469boximpl(m13470constructorimpl);
            return;
        }
        callback.invoke();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setWindowAnimations(this.fade ? R.style.BootSplashFadeOutAnimation : R.style.BootSplashNoAnimation);
            if (RNBootSplashModuleImpl.INSTANCE.isSamsungOneUI4()) {
                window.setBackgroundDrawableResource(R.drawable.compat_splash_screen_oneui_4);
            }
        }
        super.onCreate(savedInstanceState);
        ImageView buildAnimatedSplashView = buildAnimatedSplashView();
        if (buildAnimatedSplashView != null) {
            setContentView(buildAnimatedSplashView);
        }
    }

    private final ImageView buildAnimatedSplashView() {
        ImageDecoder.Source createSource;
        final Drawable decodeDrawable;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.bootSplashAnimation, R.attr.bootSplashAnimationDuration, R.attr.bootSplashBackground});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        long j = obtainStyledAttributes.getInt(1, 0);
        int color = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return null;
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(color));
        }
        if (this.fade) {
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setBackgroundColor(color);
            Bitmap bitmap = this.staticFrame;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
            return imageView;
        }
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2.setBackgroundColor(color);
        this.animatedImageView = imageView2;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Result.Companion companion = Result.INSTANCE;
                RNBootSplashDialog rNBootSplashDialog = this;
                createSource = ImageDecoder.createSource(getContext().getResources(), resourceId);
                Intrinsics.checkNotNullExpressionValue(createSource, "createSource(...)");
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                Intrinsics.checkNotNullExpressionValue(decodeDrawable, "decodeDrawable(...)");
                imageView2.setImageDrawable(decodeDrawable);
                if (ArrayBuffer$$ExternalSyntheticApiModelOutline0.m11395m((Object) decodeDrawable)) {
                    ArrayBuffer$$ExternalSyntheticApiModelOutline0.m((Object) decodeDrawable).setRepeatCount(-1);
                    ArrayBuffer$$ExternalSyntheticApiModelOutline0.m((Object) decodeDrawable).start();
                    this.animationDurationMs = j;
                    this.animationStartUptimeMs = SystemClock.uptimeMillis();
                    if (j > 0) {
                        imageView2.postDelayed(new Runnable() { // from class: com.zoontek.rnbootsplash.RNBootSplashDialog$$ExternalSyntheticLambda7
                            @Override // java.lang.Runnable
                            public final void run() {
                                RNBootSplashDialog.buildAnimatedSplashView$lambda$15$lambda$14(decodeDrawable);
                            }
                        }, j);
                    }
                }
                Result.m13470constructorimpl(Unit.INSTANCE);
                return imageView2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                RNBootSplashDialog rNBootSplashDialog2 = this;
                InputStream openRawResource = getContext().getResources().openRawResource(resourceId);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openRawResource);
                    CloseableKt.closeFinally(openRawResource, null);
                    if (decodeStream != null) {
                        imageView2.setImageBitmap(decodeStream);
                    }
                    Result.m13470constructorimpl(Unit.INSTANCE);
                    return imageView2;
                } finally {
                }
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m13470constructorimpl(ResultKt.createFailure(th2));
            }
        }
        return imageView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildAnimatedSplashView$lambda$15$lambda$14(Drawable drawable) {
        ArrayBuffer$$ExternalSyntheticApiModelOutline0.m((Object) drawable).stop();
    }
}
