package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items;

import Ar.c;
import Sc.o;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.WidgetExpressNavigationSliderV2ItemBinding;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items.ExpressNavigationSliderV2ItemVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.product.common.AdultWidgetViewHolder;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J3\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u000e\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010.\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u0010/\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemsViewHolder;", "Lru/ozon/app/android/product/common/AdultWidgetViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Landroid/view/View;)V", "item", "", "loadItemImageView", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO;)V", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getImageSize", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO;)Lru/ozon/app/android/pikazon/image/ImageSize;", "bindAdultContent", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/fresh/main/databinding/WidgetExpressNavigationSliderV2ItemBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/WidgetExpressNavigationSliderV2ItemBinding;", "", "horizontalMargin", "I", "verticalMargin", "", "maxRightIndent", "F", "backgroundImageHeight", "backgroundImageFullWidth", "backgroundImageHalfWidth", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressNavigationSliderV2ItemsViewHolder extends AdultWidgetViewHolder<ExpressNavigationSliderV2ItemVO> {

    @NotNull
    private final AdultHandler adultHandler;
    private final int backgroundImageFullWidth;
    private final int backgroundImageHalfWidth;
    private final int backgroundImageHeight;

    @NotNull
    private final WidgetExpressNavigationSliderV2ItemBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;
    private final int horizontalMargin;
    private final float maxRightIndent;

    @NotNull
    private final l tokenizedAnalytics;
    private final int verticalMargin;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExpressNavigationSliderV2ItemVO.PositionType.values().length];
            try {
                iArr[ExpressNavigationSliderV2ItemVO.PositionType.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExpressNavigationSliderV2ItemVO.PositionType.HALF_WIDTH_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExpressNavigationSliderV2ItemVO.PositionType.HALF_WIDTH_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ExpressNavigationSliderV2ItemVO.PositionType.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressNavigationSliderV2ItemsViewHolder(@NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull AdultHandler adultHandler, @NotNull AdultDelegate<ExpressNavigationSliderV2ItemVO> adultDelegate, @NotNull View containerView) {
        super(containerView, adultDelegate);
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adultHandler = adultHandler;
        WidgetExpressNavigationSliderV2ItemBinding bind = WidgetExpressNavigationSliderV2ItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.horizontalMargin = ResourceExtKt.toPx(16);
        this.verticalMargin = ResourceExtKt.toPx(6);
        this.maxRightIndent = 100.0f;
        this.backgroundImageHeight = ResourceExtKt.toPx(80);
        this.backgroundImageFullWidth = ResourceExtKt.toPx(328);
        this.backgroundImageHalfWidth = ResourceExtKt.toPx(158);
        containerView.setOnClickListener(new c(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(final ExpressNavigationSliderV2ItemsViewHolder expressNavigationSliderV2ItemsViewHolder, View view) {
        AdultHandler adultHandler = expressNavigationSliderV2ItemsViewHolder.adultHandler;
        boolean shouldBlur = expressNavigationSliderV2ItemsViewHolder.getItem().getShouldBlur();
        Context context = expressNavigationSliderV2ItemsViewHolder.getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G supportFragmentManager = ((r) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler, shouldBlur, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items.ExpressNavigationSliderV2ItemsViewHolder$1$1
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                ComposerReferences composerReferences;
                ExpressNavigationSliderV2ItemVO item;
                composerReferences = ExpressNavigationSliderV2ItemsViewHolder.this.composerReferences;
                ComposerNavigator navigator = composerReferences.getNavigator();
                item = ExpressNavigationSliderV2ItemsViewHolder.this.getItem();
                ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, item.getData().getDeeplink(), null, 2, null);
            }

            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultReject() {
                AdultListener.DefaultImpls.onAdultReject(this);
            }
        }, null, false, 24, null);
        t tokenizedEvent = expressNavigationSliderV2ItemsViewHolder.getItem().getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(expressNavigationSliderV2ItemsViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    private final ImageSize getImageSize(ExpressNavigationSliderV2ItemVO item) {
        return WhenMappings.$EnumSwitchMapping$0[item.getSettings().getPosition().ordinal()] == 1 ? new ImageSize(this.backgroundImageFullWidth, this.backgroundImageHeight) : new ImageSize(this.backgroundImageHalfWidth, this.backgroundImageHeight);
    }

    private final void loadItemImageView(ExpressNavigationSliderV2ItemVO item) {
        List list;
        setItem(item);
        if (item.getShouldBlur()) {
            int i11 = 1;
            list = C7714v.a0(new ImageTransformation.Blur(r1, i11, i11, null));
        } else {
            list = K.f71697a;
        }
        List list2 = list;
        this.binding.backgroundIv.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getData().getBackgroundColor(), R$color.oz_bg_primary));
        AspectRatioImageView backgroundIv = this.binding.backgroundIv;
        Intrinsics.checkNotNullExpressionValue(backgroundIv, "backgroundIv");
        ImageViewExtKt.load$default(backgroundIv, item.getData().getImage(), list2, null, null, getImageSize(item), false, null, 108, null);
        View overlayView = this.binding.overlayView;
        Intrinsics.checkNotNullExpressionValue(overlayView, "overlayView");
        overlayView.setVisibility(item.getShouldBlur() ? 0 : 8);
        ImageView adultEyeLogoIv = this.binding.adultEyeLogoIv;
        Intrinsics.checkNotNullExpressionValue(adultEyeLogoIv, "adultEyeLogoIv");
        adultEyeLogoIv.setVisibility(item.getShouldBlur() ? 0 : 8);
        this.binding.backgroundIv.setRatio(Float.valueOf(item.getRatio()));
    }

    @Override // ru.ozon.app.android.product.common.AdultWidgetViewHolder
    public void bindAdultContent(@NotNull ExpressNavigationSliderV2ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setItem(item);
        TextView nameTv = this.binding.nameTv;
        Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
        TextViewExtKt.setTextOrGone(nameTv, item.getData().getTitle());
        this.binding.rightIndent.c(1 - (item.getSettings().getRightIndent() / this.maxRightIndent));
        ViewGroup.LayoutParams layoutParams = this.binding.cardView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getSettings().getPosition().ordinal()];
        if (i11 == 1) {
            int i12 = this.horizontalMargin;
            int i13 = this.verticalMargin;
            marginLayoutParams.setMargins(i12, i13, i12, i13);
        } else if (i11 == 2) {
            int i14 = this.horizontalMargin;
            int i15 = this.verticalMargin;
            marginLayoutParams.setMargins(i14, i15, i15, i15);
        } else if (i11 == 3) {
            int i16 = this.verticalMargin;
            marginLayoutParams.setMargins(i16, i16, this.horizontalMargin, i16);
        } else if (i11 != 4) {
            throw new o();
        }
        this.binding.cardView.setLayoutParams(marginLayoutParams);
        loadItemImageView(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ExpressNavigationSliderV2ItemVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
