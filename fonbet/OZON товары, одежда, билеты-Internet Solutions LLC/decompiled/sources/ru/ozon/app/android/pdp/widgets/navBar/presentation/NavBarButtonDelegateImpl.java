package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import Sc.InterfaceC4008j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarVO;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJY\u0010\u001a\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010&J%\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0018H\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u0018*\u00020,2\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020\u0018*\u00020/H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0016\u00104\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010:R\u0016\u0010D\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010ER\u0018\u0010O\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010ER\u0018\u0010P\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarButtonDelegateImpl;", "", "Lru/ozon/app/android/pdp/utils/DPS;", "Lru/ozon/app/android/pdp/widgets/navBar/NavBarUtils;", "Landroid/content/Context;", "context", "", "", "", "colors", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "newBackgroundColorToken", "", "newCornerRadius", "newIconTintColorToken", "newIcon", "Landroid/view/View;", "view", "", "visibleState", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "commonBgForIcons", "Lkotlin/Function0;", "", "onInvalidate", "updateButton", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Landroid/view/View;ZLru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;Lkotlin/jvm/functions/Function0;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawButton", "(Landroid/graphics/Canvas;)V", "token", "getColorWithCacheOrCreate", "(Ljava/lang/String;)Ljava/lang/Integer;", "width", "height", "updateDrawableBounds", "(IILru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;)V", "isVisible", "animateBackgroundVisibility", "(ZLkotlin/jvm/functions/Function0;)V", "cancelAnimation", "()V", "Landroid/graphics/Paint;", "updateColor", "(Landroid/graphics/Paint;Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "updateIconColor", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/Context;", "Ljava/util/Map;", "isInitializeInvalidate", "Z", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "maxBackgroundAlpha", "I", "bgPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "bgPath$delegate", "LSc/j;", "getBgPath", "()Landroid/graphics/Path;", "bgPath", "animationAlpha", "currentBackgroundColorToken", "Ljava/lang/String;", "currentCornerRadius", "F", "currentLeftRadius", "Ljava/lang/Float;", "currentRightRadius", "", "commonBgRadii", "[F", "currentIconTintColorToken", "currentIconDrawableToken", "iconColor", "Ljava/lang/Integer;", "Landroid/graphics/Rect;", "drawableBounds", "Landroid/graphics/Rect;", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavBarButtonDelegateImpl implements DPS, NavBarUtils {
    private int animationAlpha;
    private ValueAnimator animator;

    @NotNull
    private final Paint bgPaint;

    /* renamed from: bgPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bgPath;

    @NotNull
    private final Map<String, Integer> colors;
    private float[] commonBgRadii;

    @NotNull
    private final Context context;

    @NotNull
    private String currentBackgroundColorToken;
    private float currentCornerRadius;
    private String currentIconDrawableToken;
    private String currentIconTintColorToken;
    private Float currentLeftRadius;
    private Float currentRightRadius;

    @NotNull
    private final Rect drawableBounds;
    private Integer iconColor;
    private Drawable iconDrawable;
    private boolean isInitializeInvalidate;
    private int maxBackgroundAlpha;
    public static final int $stable = 8;
    private static final int commonBgHorizontalPadding = SellerV4DisclosureViewFactory.INSTANCE.getDp4();

    public NavBarButtonDelegateImpl(@NotNull Context context, @NotNull Map<String, Integer> colors) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.context = context;
        this.colors = colors;
        this.isInitializeInvalidate = true;
        this.maxBackgroundAlpha = getMaxAlpha();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        updateColor(paint, getInvisibleButtonBackground());
        this.bgPaint = paint;
        this.bgPath = DelegatesKt.lazyUnsafe(NavBarButtonDelegateImpl$bgPath$2.INSTANCE);
        this.animationAlpha = this.maxBackgroundAlpha;
        this.currentBackgroundColorToken = getInvisibleButtonBackground();
        this.currentCornerRadius = getButtonCornerRadius();
        this.currentIconTintColorToken = getInvisibleIconTintColor();
        this.iconColor = colors.get(getInvisibleIconTintColor());
        this.drawableBounds = new Rect();
    }

    private final Path getBgPath() {
        return (Path) this.bgPath.getValue();
    }

    private final void updateColor(Paint paint, String str) {
        Integer colorWithCacheOrCreate = getColorWithCacheOrCreate(str);
        if (colorWithCacheOrCreate != null) {
            int intValue = colorWithCacheOrCreate.intValue();
            paint.setColor(intValue);
            int alpha = Color.alpha(intValue);
            if (this.maxBackgroundAlpha == this.animationAlpha) {
                this.animationAlpha = alpha;
            }
            this.maxBackgroundAlpha = alpha;
        }
    }

    private final void updateIconColor(Drawable drawable) {
        Integer num = this.iconColor;
        drawable.setColorFilter(num != null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN) : null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils
    @NotNull
    public ValueAnimator alphaAnimation(boolean z11, int i11, int i12, long j11, boolean z12, @NotNull Function1<? super Integer, Unit> function1) {
        return NavBarUtils.DefaultImpls.alphaAnimation(this, z11, i11, i12, j11, z12, function1);
    }

    public void animateBackgroundVisibility(boolean isVisible, @NotNull Function0<Unit> onInvalidate) {
        Intrinsics.checkNotNullParameter(onInvalidate, "onInvalidate");
        cancelAnimation();
        ValueAnimator alphaAnimation$default = NavBarUtils.DefaultImpls.alphaAnimation$default(this, isVisible, getMinAlpha(), this.maxBackgroundAlpha, 0L, true, new NavBarButtonDelegateImpl$animateBackgroundVisibility$1(this, onInvalidate), 8, null);
        this.animator = alphaAnimation$default;
        if (alphaAnimation$default != null) {
            alphaAnimation$default.start();
        }
    }

    public void cancelAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarConstants
    public long getAnimationDuration() {
        return NavBarUtils.DefaultImpls.getAnimationDuration(this);
    }

    public float getButtonCornerRadius() {
        return NavBarUtils.DefaultImpls.getButtonCornerRadius(this);
    }

    public int getColorIntByToken(@NotNull Context context, @NotNull String str) {
        return NavBarUtils.DefaultImpls.getColorIntByToken(this, context, str);
    }

    public Integer getColorWithCacheOrCreate(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (this.colors.get(token) != null) {
            return this.colors.get(token);
        }
        Integer valueOf = Integer.valueOf(getColorIntByToken(this.context, token));
        this.colors.put(token, Integer.valueOf(valueOf.intValue()));
        return valueOf;
    }

    public int getDp24() {
        return DPS.DefaultImpls.getDp24(this);
    }

    @NotNull
    public String getInvisibleButtonBackground() {
        return NavBarUtils.DefaultImpls.getInvisibleButtonBackground(this);
    }

    @NotNull
    public String getInvisibleIconTintColor() {
        return NavBarUtils.DefaultImpls.getInvisibleIconTintColor(this);
    }

    public int getMaxAlpha() {
        return NavBarUtils.DefaultImpls.getMaxAlpha(this);
    }

    public int getMinAlpha() {
        return NavBarUtils.DefaultImpls.getMinAlpha(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDrawButton(@NotNull Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.animationAlpha > getMinAlpha()) {
            this.bgPaint.setAlpha(this.animationAlpha);
            float[] fArr = this.commonBgRadii;
            if (fArr == null) {
                float width = canvas.getWidth();
                float height = canvas.getHeight();
                float f7 = this.currentCornerRadius;
                canvas2 = canvas;
                canvas2.drawRoundRect(0.0f, 0.0f, width, height, f7, f7, this.bgPaint);
                drawable = this.iconDrawable;
                if (drawable == null) {
                    drawable.draw(canvas2);
                    return;
                }
                return;
            }
            getBgPath().reset();
            getBgPath().addRoundRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), fArr, Path.Direction.CW);
            canvas.drawPath(getBgPath(), this.bgPaint);
        }
        canvas2 = canvas;
        drawable = this.iconDrawable;
        if (drawable == null) {
        }
    }

    public void updateButton(@NotNull String newBackgroundColorToken, float newCornerRadius, String newIconTintColorToken, @NotNull String newIcon, @NotNull View view, boolean visibleState, NavBarVO.CommonBgForIcon commonBgForIcons, @NotNull Function0<Unit> onInvalidate) {
        boolean z11;
        boolean z12;
        Float f7;
        Float f11;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(newBackgroundColorToken, "newBackgroundColorToken");
        Intrinsics.checkNotNullParameter(newIcon, "newIcon");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onInvalidate, "onInvalidate");
        if (visibleState) {
            this.animationAlpha = 0;
        }
        boolean z13 = true;
        if (Intrinsics.d(newBackgroundColorToken, this.currentBackgroundColorToken)) {
            z11 = false;
        } else {
            updateColor(this.bgPaint, newBackgroundColorToken);
            this.currentBackgroundColorToken = newBackgroundColorToken;
            z11 = true;
        }
        if (newCornerRadius != this.currentCornerRadius) {
            this.currentCornerRadius = newCornerRadius;
            z11 = true;
        }
        float[] fArr = null;
        if (!Intrinsics.d(newIconTintColorToken, this.currentIconTintColorToken)) {
            this.iconColor = newIconTintColorToken != null ? getColorWithCacheOrCreate(newIconTintColorToken) : null;
            this.currentIconTintColorToken = newIconTintColorToken;
            if (Intrinsics.d(newIcon, this.currentIconDrawableToken) && (drawable = this.iconDrawable) != null) {
                updateIconColor(drawable);
            }
            z11 = true;
        }
        if (Intrinsics.d(newIcon, this.currentIconDrawableToken)) {
            z12 = false;
        } else {
            Integer iconResByToken = TokensExtKt.getIconResByToken(this.context, newIcon);
            if (iconResByToken == null) {
                return;
            }
            Drawable drawable2 = a.getDrawable(this.context, iconResByToken.intValue());
            Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
            this.iconDrawable = mutate;
            if (mutate != null) {
                updateIconColor(mutate);
            }
            this.currentIconDrawableToken = newIcon;
            z11 = true;
            z12 = true;
        }
        if (commonBgForIcons != null) {
            f7 = Float.valueOf(commonBgForIcons.getIsFirstButton() ? newCornerRadius : 0.0f);
        } else {
            f7 = null;
        }
        if (commonBgForIcons != null) {
            if (!commonBgForIcons.getIsLastButton()) {
                newCornerRadius = 0.0f;
            }
            f11 = Float.valueOf(newCornerRadius);
        } else {
            f11 = null;
        }
        if (Intrinsics.c(f7, this.currentLeftRadius) && Intrinsics.c(this.currentRightRadius, f11)) {
            z13 = z12;
        } else {
            this.currentLeftRadius = f7;
            this.currentRightRadius = f11;
            if (f7 != null && f11 != null) {
                fArr = new float[]{f7.floatValue(), f7.floatValue(), f11.floatValue(), f11.floatValue(), f11.floatValue(), f11.floatValue(), f7.floatValue(), f7.floatValue()};
            }
            this.commonBgRadii = fArr;
            z11 = true;
        }
        if (z13) {
            updateDrawableBounds(view.getMeasuredWidth(), view.getMeasuredHeight(), commonBgForIcons);
        }
        if (z11 || this.isInitializeInvalidate) {
            this.isInitializeInvalidate = false;
            onInvalidate.invoke();
        }
    }

    public void updateDrawableBounds(int width, int height, NavBarVO.CommonBgForIcon commonBgForIcons) {
        int dp24 = getDp24();
        int i11 = (height - dp24) / 2;
        int i12 = (commonBgForIcons == null || !commonBgForIcons.getIsFirstButton()) ? (commonBgForIcons == null || !commonBgForIcons.getIsLastButton()) ? (width - dp24) / 2 : ((width - dp24) - commonBgHorizontalPadding) / 2 : ((width - dp24) + commonBgHorizontalPadding) / 2;
        this.drawableBounds.set(i12, i11, i12 + dp24, dp24 + i11);
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            drawable.setBounds(this.drawableBounds);
        }
    }
}
