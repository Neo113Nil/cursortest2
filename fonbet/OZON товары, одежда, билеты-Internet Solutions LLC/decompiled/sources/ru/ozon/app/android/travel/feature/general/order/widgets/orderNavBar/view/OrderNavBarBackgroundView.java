package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.order.R$color;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000e\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarBackgroundView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp24", "", "backgroundRadius", "imageParanja", "Landroid/graphics/drawable/ColorDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "backgroundOutlineProvider", "ru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarBackgroundView$backgroundOutlineProvider$1", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/view/OrderNavBarBackgroundView$backgroundOutlineProvider$1;", "imageAciv", "Landroidx/appcompat/widget/AppCompatImageView;", "bind", "", "vo", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$WidgetBackground;", "onChangeAlpha", "alpha", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderNavBarBackgroundView extends FrameLayout {

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final OrderNavBarBackgroundView$backgroundOutlineProvider$1 backgroundOutlineProvider;
    private float backgroundRadius;
    private final float dp24;

    @NotNull
    private final AppCompatImageView imageAciv;

    @NotNull
    private final ColorDrawable imageParanja;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewOutlineProvider, ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view.OrderNavBarBackgroundView$backgroundOutlineProvider$1] */
    public OrderNavBarBackgroundView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dp24 = pxF;
        this.backgroundRadius = pxF;
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(context.getColor(R$color.bg_travel_order_navbar_paranja));
        this.imageParanja = colorDrawable;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        ?? r22 = new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view.OrderNavBarBackgroundView$backgroundOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                float f11;
                Intrinsics.checkNotNullParameter(view, "view");
                if (outline != null) {
                    f7 = OrderNavBarBackgroundView.this.backgroundRadius;
                    int width = view.getWidth();
                    int height = view.getHeight();
                    f11 = OrderNavBarBackgroundView.this.backgroundRadius;
                    outline.setRoundRect(0, -((int) f7), width, height, f11);
                }
            }
        };
        this.backgroundOutlineProvider = r22;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView.setForeground(colorDrawable);
        this.imageAciv = appCompatImageView;
        setClipChildren(true);
        setClipToOutline(true);
        addView(appCompatImageView);
        setBackground(gradientDrawable);
        setOutlineProvider(r22);
    }

    public final void bind(@NotNull OrderNavBarVO.WidgetBackground vo) {
        Color.Gradient gradient;
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.imageAciv.setVisibility(4);
        String token = vo.getToken();
        if (token != null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(token);
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
                Integer parseColor = styleParser.parseColor(context2, token);
                this.backgroundDrawable.setColor(parseColor != null ? parseColor.intValue() : 0);
            }
        }
        UniGradient customGradient = vo.getCustomGradient();
        if (customGradient != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Color.Gradient gradient2 = TokensExtKt.toGradient(customGradient, context3);
            if (gradient2 != null) {
                gradient2.applyTo(this.backgroundDrawable);
            }
        }
        String image = vo.getImage();
        if (image != null) {
            ImageViewExtKt.load$default(this.imageAciv, image, null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.view.OrderNavBarBackgroundView$bind$1$2$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    AppCompatImageView appCompatImageView;
                    PikazonLoaderCallback.DefaultImpls.onLoadSuccessful(this, resource);
                    appCompatImageView = OrderNavBarBackgroundView.this.imageAciv;
                    appCompatImageView.setVisibility(0);
                }
            }, null, null, false, null, 122, null);
        }
    }

    public final void onChangeAlpha(float alpha) {
        setAlpha(alpha);
        float f7 = this.dp24;
        this.backgroundRadius = f7 - ((1 - alpha) * f7);
        invalidateOutline();
    }
}
