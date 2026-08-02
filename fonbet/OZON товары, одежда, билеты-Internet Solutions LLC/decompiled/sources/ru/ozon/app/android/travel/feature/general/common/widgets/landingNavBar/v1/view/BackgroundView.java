package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.LandingNavBarVI;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/BackgroundView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "imageAciv", "Landroidx/appcompat/widget/AppCompatImageView;", "isImageBackground", "", "bind", "", "vo", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI$WidgetBackground;", "updateImageAlpha", "alpha", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundView extends FrameLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final AppCompatImageView imageAciv;
    private boolean isImageBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageAciv = appCompatImageView;
        addView(appCompatImageView);
        setBackground(gradientDrawable);
    }

    public final void bind(@NotNull LandingNavBarVI.WidgetBackground vo) {
        Color.Gradient gradient;
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.imageAciv.setVisibility(4);
        String color = vo.getColor();
        if (color != null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(color);
            if (gradientByToken != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradient = TokensExtKt.toGradient(gradientByToken, context);
            } else {
                gradient = null;
            }
            if (gradient != null) {
                gradient.applyTo(this.backgroundDrawable);
            } else {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context2, color);
                this.backgroundDrawable.setColor(parseColor != null ? parseColor.intValue() : 0);
            }
        }
        UniGradient gradient2 = vo.getGradient();
        if (gradient2 != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Color.Gradient gradient3 = TokensExtKt.toGradient(gradient2, context3);
            if (gradient3 != null) {
                gradient3.applyTo(this.backgroundDrawable);
            }
        }
        String image = vo.getImage();
        if (image != null) {
            ImageViewExtKt.load$default(this.imageAciv, image, null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.view.BackgroundView$bind$1$2$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    AppCompatImageView appCompatImageView;
                    PikazonLoaderCallback.DefaultImpls.onLoadSuccessful(this, resource);
                    appCompatImageView = BackgroundView.this.imageAciv;
                    appCompatImageView.setVisibility(0);
                    BackgroundView.this.isImageBackground = true;
                }
            }, null, null, false, null, 122, null);
        }
    }

    public final void updateImageAlpha(float alpha) {
        if (this.isImageBackground) {
            this.imageAciv.setAlpha(alpha);
        }
    }
}
