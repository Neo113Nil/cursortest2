package ru.ozon.app.android.storefront.widgets.cms.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.navBar.NavBarConfig;
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

/* loaded from: classes7.dex */
public final class CmsWidgetsV2DiModule_ProvideWidget$cms_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidget$cms_prodGoogleAllVendorsRelease(NavBarConfig navBarConfig, NavBarOverlayViewMapper navBarOverlayViewMapper, CaptionWidgetConfig captionWidgetConfig, CaptionWidgetViewMapper captionWidgetViewMapper, BannerCarouselConfig bannerCarouselConfig, BannerCarouselViewMapper bannerCarouselViewMapper, RichTextWidgetViewMapper richTextWidgetViewMapper, RichTextWidgetConfig richTextWidgetConfig, TitleConfig titleConfig, TitleViewMapper titleViewMapper, WebViewWidgetViewMapper webViewWidgetViewMapper, WebViewWidgetConfig webViewWidgetConfig, HorizontalAutoScrollConfig horizontalAutoScrollConfig, HorizontalAutoScrollViewMapper horizontalAutoScrollViewMapper, RichPromoScrollConfig richPromoScrollConfig, RichPromoScrollViewMapper richPromoScrollViewMapper) {
        Set<Widget2> provideWidget$cms_prodGoogleAllVendorsRelease = CmsWidgetsV2DiModule.INSTANCE.provideWidget$cms_prodGoogleAllVendorsRelease(navBarConfig, navBarOverlayViewMapper, captionWidgetConfig, captionWidgetViewMapper, bannerCarouselConfig, bannerCarouselViewMapper, richTextWidgetViewMapper, richTextWidgetConfig, titleConfig, titleViewMapper, webViewWidgetViewMapper, webViewWidgetConfig, horizontalAutoScrollConfig, horizontalAutoScrollViewMapper, richPromoScrollConfig, richPromoScrollViewMapper);
        j.d(provideWidget$cms_prodGoogleAllVendorsRelease);
        return provideWidget$cms_prodGoogleAllVendorsRelease;
    }
}
