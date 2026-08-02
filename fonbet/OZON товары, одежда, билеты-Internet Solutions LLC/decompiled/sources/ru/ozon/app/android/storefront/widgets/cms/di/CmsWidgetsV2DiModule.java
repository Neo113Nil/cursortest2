package ru.ozon.app.android.storefront.widgets.cms.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.navBar.NavBarConfig;
import ru.ozon.app.android.storefront.widgets.cms.banner.core.BannerComposeWidgetKt;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselConfig;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.captionwidget.CaptionWidgetConfig;
import ru.ozon.app.android.storefront.widgets.cms.captionwidget.CaptionWidgetViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.core.HorizontalAutoScrollConfig;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.core.HorizontalAutoScrollViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.navbar.NavBarOverlayViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.core.RichPromoScrollConfig;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.core.RichPromoScrollViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.richtext.RichTextWidgetConfig;
import ru.ozon.app.android.storefront.widgets.cms.richtext.RichTextWidgetViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.title.TitleConfig;
import ru.ozon.app.android.storefront.widgets.cms.title.TitleViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.webview.WebViewWidgetConfig;
import ru.ozon.app.android.storefront.widgets.cms.webview.WebViewWidgetViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0095\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b&\u0010'J!\u0010/\u001a\b\u0012\u0004\u0012\u00020,0$2\n\u0010+\u001a\u00060)j\u0002`*H\u0001¢\u0006\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/di/CmsWidgetsV2DiModule;", "", "<init>", "()V", "Lru/ozon/app/android/storefront/navBar/NavBarConfig;", "navBarConfig", "Lru/ozon/app/android/storefront/widgets/cms/navbar/NavBarOverlayViewMapper;", "navBarOverlayViewMapper", "Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetConfig;", "captionConfig", "Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetViewMapper;", "captionViewMapper", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselConfig;", "bannerCarouselConfig", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselViewMapper;", "bannerCarouselViewMapper", "Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetViewMapper;", "richTextWidgetViewMapper", "Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetConfig;", "richTextWidgetConfig", "Lru/ozon/app/android/storefront/widgets/cms/title/TitleConfig;", "titleConfig", "Lru/ozon/app/android/storefront/widgets/cms/title/TitleViewMapper;", "titleViewMapper", "Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetViewMapper;", "webViewWidgetViewMapper", "Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetConfig;", "webViewWidgetConfig", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/core/HorizontalAutoScrollConfig;", "horizontalAutoScrollConfig", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/core/HorizontalAutoScrollViewMapper;", "horizontalAutoScrollViewMapper", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/core/RichPromoScrollConfig;", "richPromoScrollConfig", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/core/RichPromoScrollViewMapper;", "richPromoScrollViewMapper", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideWidget$cms_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/storefront/navBar/NavBarConfig;Lru/ozon/app/android/storefront/widgets/cms/navbar/NavBarOverlayViewMapper;Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetConfig;Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetViewMapper;Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselConfig;Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselViewMapper;Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetViewMapper;Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetConfig;Lru/ozon/app/android/storefront/widgets/cms/title/TitleConfig;Lru/ozon/app/android/storefront/widgets/cms/title/TitleViewMapper;Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetViewMapper;Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetConfig;Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/core/HorizontalAutoScrollConfig;Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/core/HorizontalAutoScrollViewMapper;Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/core/RichPromoScrollConfig;Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/core/RichPromoScrollViewMapper;)Ljava/util/Set;", "provideWidget", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "provideComposeWidgets$cms_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideComposeWidgets", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CmsWidgetsV2DiModule {

    @NotNull
    public static final CmsWidgetsV2DiModule INSTANCE = new CmsWidgetsV2DiModule();

    private CmsWidgetsV2DiModule() {
    }

    @NotNull
    public final Set<i> provideComposeWidgets$cms_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return e0.h(BannerComposeWidgetKt.bannerComposeWidget(jsonDeserializer));
    }

    @NotNull
    public final Set<Widget2> provideWidget$cms_prodGoogleAllVendorsRelease(@NotNull NavBarConfig navBarConfig, @NotNull NavBarOverlayViewMapper navBarOverlayViewMapper, @NotNull CaptionWidgetConfig captionConfig, @NotNull CaptionWidgetViewMapper captionViewMapper, @NotNull BannerCarouselConfig bannerCarouselConfig, @NotNull BannerCarouselViewMapper bannerCarouselViewMapper, @NotNull RichTextWidgetViewMapper richTextWidgetViewMapper, @NotNull RichTextWidgetConfig richTextWidgetConfig, @NotNull TitleConfig titleConfig, @NotNull TitleViewMapper titleViewMapper, @NotNull WebViewWidgetViewMapper webViewWidgetViewMapper, @NotNull WebViewWidgetConfig webViewWidgetConfig, @NotNull HorizontalAutoScrollConfig horizontalAutoScrollConfig, @NotNull HorizontalAutoScrollViewMapper horizontalAutoScrollViewMapper, @NotNull RichPromoScrollConfig richPromoScrollConfig, @NotNull RichPromoScrollViewMapper richPromoScrollViewMapper) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(navBarOverlayViewMapper, "navBarOverlayViewMapper");
        Intrinsics.checkNotNullParameter(captionConfig, "captionConfig");
        Intrinsics.checkNotNullParameter(captionViewMapper, "captionViewMapper");
        Intrinsics.checkNotNullParameter(bannerCarouselConfig, "bannerCarouselConfig");
        Intrinsics.checkNotNullParameter(bannerCarouselViewMapper, "bannerCarouselViewMapper");
        Intrinsics.checkNotNullParameter(richTextWidgetViewMapper, "richTextWidgetViewMapper");
        Intrinsics.checkNotNullParameter(richTextWidgetConfig, "richTextWidgetConfig");
        Intrinsics.checkNotNullParameter(titleConfig, "titleConfig");
        Intrinsics.checkNotNullParameter(titleViewMapper, "titleViewMapper");
        Intrinsics.checkNotNullParameter(webViewWidgetViewMapper, "webViewWidgetViewMapper");
        Intrinsics.checkNotNullParameter(webViewWidgetConfig, "webViewWidgetConfig");
        Intrinsics.checkNotNullParameter(horizontalAutoScrollConfig, "horizontalAutoScrollConfig");
        Intrinsics.checkNotNullParameter(horizontalAutoScrollViewMapper, "horizontalAutoScrollViewMapper");
        Intrinsics.checkNotNullParameter(richPromoScrollConfig, "richPromoScrollConfig");
        Intrinsics.checkNotNullParameter(richPromoScrollViewMapper, "richPromoScrollViewMapper");
        Widget2[] elements = {new Widget2("cms", "navBar", navBarConfig, new ViewMapper2[]{navBarOverlayViewMapper}), new Widget2("cms", "caption", captionConfig, new ViewMapper2[]{captionViewMapper}), new Widget2("cms", "bannerCarousel", bannerCarouselConfig, new ViewMapper2[]{bannerCarouselViewMapper}), new Widget2("cms", "richTextWidget", richTextWidgetConfig, new ViewMapper2[]{richTextWidgetViewMapper}), new Widget2("cms", SelectionItemFormDTO.TITLE_FIELD_NAME, titleConfig, new ViewMapper2[]{titleViewMapper}), new Widget2("cms", "webFrame", webViewWidgetConfig, new ViewMapper2[]{webViewWidgetViewMapper}), new Widget2("cms", "horizontalAutoScroll", horizontalAutoScrollConfig, new ViewMapper2[]{horizontalAutoScrollViewMapper}), new Widget2("cms", "richPromoScroll", richPromoScrollConfig, new ViewMapper2[]{richPromoScrollViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
