package ru.ozon.app.android.product.imagesswipeview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.R$id;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0002J\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0002J\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\fH\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageViewBuilder;", "", "<init>", "()V", "addImage", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "viewGroup", "Landroid/widget/FrameLayout;", "addParanja", "Landroid/view/View;", "addOverlayView", "enableDarkIcons", "", "addAdultWarningLl", "Landroid/widget/LinearLayout;", "enableDarkText", "adultEyeLogoIv", "", "addAdultMessageTv", "resolveColor", "", "Landroid/content/Context;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdultImageViewBuilder {

    @NotNull
    public static final AdultImageViewBuilder INSTANCE = new AdultImageViewBuilder();

    private AdultImageViewBuilder() {
    }

    private final void addAdultMessageTv(LinearLayout linearLayout, boolean z11) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
        appCompatTextView.setId(R$id.adultMessageTv);
        appCompatTextView.setText(StringProvider.getString(R$string.common_message_adult));
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption);
        AdultImageViewBuilder adultImageViewBuilder = INSTANCE;
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(adultImageViewBuilder.resolveColor(context, z11));
        appCompatTextView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams.topMargin = ResourceExtKt.toPx(12, context2);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams.setMarginStart(ResourceExtKt.toPx(8, context3));
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        layoutParams.setMarginEnd(ResourceExtKt.toPx(8, context4));
        Unit unit = Unit.f71690a;
        linearLayout.addView(appCompatTextView, layoutParams);
    }

    private final void adultEyeLogoIv(LinearLayout linearLayout, boolean z11) {
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setId(R$id.adultEyeLogoIv);
        imageView.setImageResource(R$drawable.ic_adult);
        AdultImageViewBuilder adultImageViewBuilder = INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, Integer.valueOf(adultImageViewBuilder.resolveColor(context, z11)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Unit unit = Unit.f71690a;
        linearLayout.addView(imageView, layoutParams);
    }

    private final int resolveColor(Context context, boolean z11) {
        return z11 ? ThemeExtKt.themeColor(context, R$attr.graphicPrimaryOnLight) : context.getColor(R$color.white);
    }

    @NotNull
    public final LinearLayout addAdultWarningLl(@NotNull FrameLayout viewGroup, boolean enableDarkText) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(R$id.adultWarningLl);
        linearLayout.setOrientation(1);
        adultEyeLogoIv(linearLayout, enableDarkText);
        addAdultMessageTv(linearLayout, enableDarkText);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Unit unit = Unit.f71690a;
        viewGroup.addView(linearLayout, layoutParams);
        return linearLayout;
    }

    @NotNull
    public final AspectRatioImageView addImage(@NotNull FrameLayout viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(context, null, 0, 6, null);
        aspectRatioImageView.setAdjustViewBounds(true);
        aspectRatioImageView.setId(R$id.imageIv);
        viewGroup.addView(aspectRatioImageView, new FrameLayout.LayoutParams(-1, -1));
        return aspectRatioImageView;
    }

    @NotNull
    public final View addOverlayView(@NotNull FrameLayout viewGroup, boolean enableDarkIcons) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = new View(viewGroup.getContext());
        view.setId(R$id.overlayView);
        view.setBackgroundColor(view.getContext().getColor(enableDarkIcons ? ru.ozon.uni.R$color.transparent : ru.ozon.app.android.uikit.R$color.transparent_black));
        viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return view;
    }

    @NotNull
    public final View addParanja(@NotNull FrameLayout viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = new View(viewGroup.getContext());
        viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return view;
    }
}
