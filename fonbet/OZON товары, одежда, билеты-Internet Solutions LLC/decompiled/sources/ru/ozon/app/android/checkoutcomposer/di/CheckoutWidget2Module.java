package ru.ozon.app.android.checkoutcomposer.di;

import I00.d;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.core.AddressPartsInputConfig;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.core.AddressPartsInputViewMapper;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.di.AddressPartsInputComponent;
import ru.ozon.app.android.checkoutcomposer.celllist.data.CheckoutCellListConfig;
import ru.ozon.app.android.checkoutcomposer.celllist.di.CheckoutCellListWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.celllist.presentation.CheckoutCellListViewMapper;
import ru.ozon.app.android.checkoutcomposer.celllist.presentation.sticky.CheckoutCellListStickyViewMapper;
import ru.ozon.app.android.checkoutcomposer.comment.data.CommentConfig;
import ru.ozon.app.android.checkoutcomposer.comment.di.CommentWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.comment.presentation.CommentViewMapper;
import ru.ozon.app.android.checkoutcomposer.common.paymentButton.core.PaymentButtonConfig;
import ru.ozon.app.android.checkoutcomposer.common.paymentButton.presentation.main.PaymentButtonViewMapper;
import ru.ozon.app.android.checkoutcomposer.common.paymentButton.presentation.sticky.PaymentButtonViewStickyNoUIMapper;
import ru.ozon.app.android.checkoutcomposer.couriersteps.core.CourierStepsComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityConfig;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityViewMapper;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.di.DeliveryQuantityWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.discountcode.di.DiscountCodeWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.discountcode.presentation.DiscountCodeConfig;
import ru.ozon.app.android.checkoutcomposer.discountcode.presentation.DiscountCodeViewMapper;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.core.EnableNotificationWithReplacementButtonConfig;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.di.EnableNotificationWithReplacementButtonDiComponent;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation.EnableNotificationWithReplacementButtonViewMapper;
import ru.ozon.app.android.checkoutcomposer.itemDocuments.core.ItemDocumentsComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.LargeOrdersLiftingV2Config;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di.LargeOrdersLiftingV2Component;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewMapper;
import ru.ozon.app.android.checkoutcomposer.loader.core.LoaderComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core.MercuryCertificatesAddressComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.core.MercuryCertificatesInfoComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.data.PaymentInfoV2Config;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.di.PaymentInfoV2WidgetComponent;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.PaymentInfoV2ViewMapper;
import ru.ozon.app.android.checkoutcomposer.paymentschedule.PaymentScheduleConfig;
import ru.ozon.app.android.checkoutcomposer.paymentschedule.PaymentScheduleViewMapper;
import ru.ozon.app.android.checkoutcomposer.pointsAndBonuses.data.PointsAndBonusesConfig;
import ru.ozon.app.android.checkoutcomposer.pointsAndBonuses.di.PointsAndBonusesWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.pointsAndBonuses.presentation.PointsAndBonusesViewMapper;
import ru.ozon.app.android.checkoutcomposer.premiumbanner.PremiumBannerConfig;
import ru.ozon.app.android.checkoutcomposer.premiumbanner.PremiumBannerViewMapper;
import ru.ozon.app.android.checkoutcomposer.premiumbannerdetails.PremiumBannerDetailsConfig;
import ru.ozon.app.android.checkoutcomposer.premiumbannerdetails.PremiumBannerDetailsViewMapper;
import ru.ozon.app.android.checkoutcomposer.premiumpointstoggle.PremiumPointsToggleConfig;
import ru.ozon.app.android.checkoutcomposer.premiumpointstoggle.PremiumPointsToggleViewMapper;
import ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.di.RfbsAddressInfoWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.presentation.RfbsAddressInfoConfig;
import ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.presentation.RfbsAddressInfoViewMapper;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitConfig;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitViewMapper;
import ru.ozon.app.android.checkoutcomposer.rfbsSplitHeader.data.RfbsSplitHeaderConfig;
import ru.ozon.app.android.checkoutcomposer.rfbsSplitHeader.presentation.RfbsSplitHeaderViewMapper;
import ru.ozon.app.android.checkoutcomposer.sbp.search.data.SearchBankListConfig;
import ru.ozon.app.android.checkoutcomposer.sbp.search.di.SearchBankListComponent;
import ru.ozon.app.android.checkoutcomposer.sbp.search.mapper.SearchBankListViewMapper;
import ru.ozon.app.android.checkoutcomposer.sbp.top.data.PopularBankListConfig;
import ru.ozon.app.android.checkoutcomposer.sbp.top.di.PopularBankListComponent;
import ru.ozon.app.android.checkoutcomposer.sbp.top.mapper.PopularBankListViewMapper;
import ru.ozon.app.android.checkoutcomposer.shortcomment.data.ShortCommentConfig;
import ru.ozon.app.android.checkoutcomposer.shortcomment.di.ShortCommentWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.shortcomment.presentation.ShortCommentViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.di.SplitDetailV2Component;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2Config;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2ViewMapper;
import ru.ozon.app.android.checkoutcomposer.splitdetail.presentation.ParcelFormViewMapper;
import ru.ozon.app.android.checkoutcomposer.splitdetail.presentation.SplitDetailConfig;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.data.StickyBadgeInfoConfig;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.di.StickyBadgeInfoComponent;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation.StickyBadgeInfoViewMapper;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core.StickyBadgeInfoV2ComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.data.StickyNotificationConfig;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.di.StickyNotificationComponent;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.StickyNotificationViewMapper;
import ru.ozon.app.android.checkoutcomposer.stickyTotal.data.StickyTotalConfig;
import ru.ozon.app.android.checkoutcomposer.stickyTotal.presentation.StickyTotalViewMapper;
import ru.ozon.app.android.checkoutcomposer.total.TotalConfig;
import ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.total.presentation.main.TotalViewMapper;
import ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar.CheckoutProgressBarViewMapper;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.TotalStickyV2Config;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewMapper;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.data.TotalStickyV3Config;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewMapper;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.data.TotalExpandedConfig;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.di.TotalExpandedWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation.TotalExpandedViewMapper;
import ru.ozon.app.android.checkoutcomposer.totalV3.data.TotalV3Config;
import ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3ViewMapper;
import ru.ozon.app.android.checkoutcomposer.totalV3.progressBar.ProgressBarViewMapper;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/di/CheckoutWidget2Module;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets$checkout_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgets", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "provideComposeWidgets$checkout_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideComposeWidgets", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutWidget2Module {
    @NotNull
    public final Set<i> provideComposeWidgets$checkout_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {CourierStepsComposeWidgetKt.courierStepsWidget(jsonDeserializer), MercuryCertificatesInfoComposeWidgetKt.mercuryCertificatesInfoWidget(jsonDeserializer), MercuryCertificatesAddressComposeWidgetKt.mercuryCertificatesAddressWidget(jsonDeserializer), StickyBadgeInfoV2ComposeWidgetKt.stickyBadgeInfoV2Widget(jsonDeserializer), ItemDocumentsComposeWidgetKt.itemDocumentsWidget(jsonDeserializer), LoaderComposeWidgetKt.loaderWidget(jsonDeserializer), SplitWidgetKt.splitWidget()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final Set<i> provideWidgets$checkout_prodGoogleAllVendorsRelease() {
        final long[] supported_versions = TotalStickyV2Config.INSTANCE.getSUPPORTED_VERSIONS();
        final String str = "cart";
        final String str2 = "stickyTotal";
        i iVar = new i(str, str2, supported_versions) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalStickyV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalStickyV2ViewMapper[]{new TotalStickyV2ViewMapper((TotalStickyV2Component) storage.getComponent(TotalStickyV2Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TotalStickyV2Component.INSTANCE.create(storage)};
            }
        };
        final long[] b11 = j.b();
        final String str3 = "checkoutFacade";
        final String str4 = "popularBankList";
        i iVar2 = new i(str3, str4, b11) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PopularBankListConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PopularBankListViewMapper[]{new PopularBankListViewMapper((PopularBankListComponent) storage.getComponent(PopularBankListComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{PopularBankListComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b12 = j.b();
        final String str5 = "searchBankList";
        i iVar3 = new i(str3, str5, b12) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$2
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new SearchBankListConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new SearchBankListViewMapper[]{new SearchBankListViewMapper((SearchBankListComponent) storage.getComponent(SearchBankListComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{SearchBankListComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b13 = j.b();
        final String str6 = "stickyNotification";
        i iVar4 = new i(str3, str6, b13) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$3
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StickyNotificationConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StickyNotificationViewMapper[]{new StickyNotificationViewMapper((StickyNotificationComponent) storage.getComponent(StickyNotificationComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{StickyNotificationComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b14 = j.b();
        final String str7 = "csma";
        final String str8 = "enableNotificationWithReplacementButton";
        i iVar5 = new i(str7, str8, b14) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$4
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new EnableNotificationWithReplacementButtonConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new EnableNotificationWithReplacementButtonViewMapper[]{new EnableNotificationWithReplacementButtonViewMapper((EnableNotificationWithReplacementButtonDiComponent) storage.getComponent(EnableNotificationWithReplacementButtonDiComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{EnableNotificationWithReplacementButtonDiComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b15 = j.b();
        final String str9 = "addressBookMap";
        final String str10 = "addressPartsInput";
        i iVar6 = new i(str9, str10, b15) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$5
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressPartsInputConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AddressPartsInputViewMapper[]{new AddressPartsInputViewMapper((AddressPartsInputComponent) storage.getComponent(AddressPartsInputComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{AddressPartsInputComponent.INSTANCE.create(storage)};
            }
        };
        final long[] supported_versions2 = LargeOrdersLiftingV2Config.INSTANCE.getSUPPORTED_VERSIONS();
        final String str11 = "largeOrdersLifting";
        i iVar7 = new i(str3, str11, supported_versions2) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$2
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new LargeOrdersLiftingV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new LargeOrdersLiftingV2ViewMapper[]{new LargeOrdersLiftingV2ViewMapper((LargeOrdersLiftingV2Component) storage.getComponent(LargeOrdersLiftingV2Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{LargeOrdersLiftingV2Component.INSTANCE.create(storage)};
            }
        };
        final long[] b16 = j.b();
        final String str12 = "checkoutCellList";
        i iVar8 = new i(str3, str12, b16) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$6
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new CheckoutCellListConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                CheckoutCellListWidgetComponent checkoutCellListWidgetComponent = (CheckoutCellListWidgetComponent) storage.getComponent(CheckoutCellListWidgetComponent.class);
                return new d[]{new CheckoutCellListViewMapper(checkoutCellListWidgetComponent), new CheckoutCellListStickyViewMapper(checkoutCellListWidgetComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{CheckoutCellListWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b17 = j.b();
        final String str13 = "splitDetailV2";
        i iVar9 = new i(str3, str13, b17) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$7
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new SplitDetailV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new SplitDetailV2ViewMapper[]{new SplitDetailV2ViewMapper((SplitDetailV2Component) storage.getComponent(SplitDetailV2Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{SplitDetailV2Component.INSTANCE.create(storage)};
            }
        };
        final long[] b18 = j.b();
        final String str14 = "premiumBannerDetails";
        i iVar10 = new i(str3, str14, b18) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$8
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PremiumBannerDetailsConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PremiumBannerDetailsViewMapper[]{new PremiumBannerDetailsViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        PaymentScheduleConfig.Companion companion = PaymentScheduleConfig.INSTANCE;
        final String str15 = companion.getVERTICALS().get(0);
        final long[] b19 = j.b();
        final String str16 = "mobileApplicationPaymentSchedule";
        i iVar11 = new i(str15, str16, b19) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$9
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PaymentScheduleConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PaymentScheduleViewMapper[]{new PaymentScheduleViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final String str17 = companion.getVERTICALS().get(1);
        final long[] b21 = j.b();
        i iVar12 = new i(str17, str16, b21) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$10
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PaymentScheduleConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PaymentScheduleViewMapper[]{new PaymentScheduleViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final long[] b22 = j.b();
        final String str18 = "deliveryQuantity";
        i iVar13 = new i(str3, str18, b22) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$11
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new DeliveryQuantityConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new DeliveryQuantityViewMapper[]{new DeliveryQuantityViewMapper((DeliveryQuantityWidgetComponent) storage.getComponent(DeliveryQuantityWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{DeliveryQuantityWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b23 = j.b();
        final String str19 = "premiumBanner";
        i iVar14 = new i(str3, str19, b23) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$12
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PremiumBannerConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PremiumBannerViewMapper[]{new PremiumBannerViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final long[] b24 = j.b();
        final String str20 = "premiumPointsToggle";
        i iVar15 = new i(str3, str20, b24) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$13
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PremiumPointsToggleConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PremiumPointsToggleViewMapper[]{new PremiumPointsToggleViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final long[] b25 = j.b();
        final String str21 = "rfbsAddressInfo";
        i iVar16 = new i(str3, str21, b25) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$14
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new RfbsAddressInfoConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new RfbsAddressInfoViewMapper[]{new RfbsAddressInfoViewMapper((RfbsAddressInfoWidgetComponent) storage.getComponent(RfbsAddressInfoWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{RfbsAddressInfoWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b26 = j.b();
        final String str22 = "rfbsSplitHeader";
        i iVar17 = new i(str3, str22, b26) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$15
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new RfbsSplitHeaderConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new RfbsSplitHeaderViewMapper[]{new RfbsSplitHeaderViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        ShortCommentConfig.Companion companion2 = ShortCommentConfig.INSTANCE;
        final String str23 = companion2.getCOMPONENTS().get(0);
        final long[] b27 = j.b();
        i iVar18 = new i(str3, str23, b27) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$16
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ShortCommentConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ShortCommentViewMapper[]{new ShortCommentViewMapper((ShortCommentWidgetComponent) storage.getComponent(ShortCommentWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{ShortCommentWidgetComponent.INSTANCE.create()};
            }
        };
        final String str24 = companion2.getCOMPONENTS().get(1);
        final long[] b28 = j.b();
        i iVar19 = new i(str3, str24, b28) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$17
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ShortCommentConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ShortCommentViewMapper[]{new ShortCommentViewMapper((ShortCommentWidgetComponent) storage.getComponent(ShortCommentWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{ShortCommentWidgetComponent.INSTANCE.create()};
            }
        };
        final long[] b29 = j.b();
        final String str25 = "unavailablePartPaymentSplitDetailApp";
        i iVar20 = new i(str3, str25, b29) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$18
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new SplitDetailConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ParcelFormViewMapper[]{new ParcelFormViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        final long[] b31 = j.b();
        final String str26 = "comment";
        i iVar21 = new i(str3, str26, b31) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$19
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new CommentConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new CommentViewMapper[]{new CommentViewMapper((CommentWidgetComponent) storage.getComponent(CommentWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{CommentWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b32 = j.b();
        final String str27 = "discountCode";
        i iVar22 = new i(str3, str27, b32) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$20
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new DiscountCodeConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new DiscountCodeViewMapper[]{new DiscountCodeViewMapper((DiscountCodeWidgetComponent) storage.getComponent(DiscountCodeWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{DiscountCodeWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b33 = j.b();
        final String str28 = "common";
        final String str29 = "paymentButton";
        i iVar23 = new i(str28, str29, b33) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$21
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PaymentButtonConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new d[]{new PaymentButtonViewMapper(), new PaymentButtonViewStickyNoUIMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
        TotalConfig.Companion companion3 = TotalConfig.INSTANCE;
        final String str30 = companion3.getVERTICALS().get(0);
        final long[] supported_versions3 = companion3.getSUPPORTED_VERSIONS();
        final String str31 = "total";
        i iVar24 = new i(str30, str31, supported_versions3) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$3
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                TotalWidgetComponent totalWidgetComponent = (TotalWidgetComponent) storage.getComponent(TotalWidgetComponent.class);
                return new d[]{new TotalViewMapper(totalWidgetComponent), new StickyTotalViewMapper(totalWidgetComponent), new CheckoutProgressBarViewMapper(totalWidgetComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TotalWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final String str32 = companion3.getVERTICALS().get(1);
        final long[] supported_versions4 = companion3.getSUPPORTED_VERSIONS();
        i iVar25 = new i(str32, str31, supported_versions4) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$4
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                TotalWidgetComponent totalWidgetComponent = (TotalWidgetComponent) storage.getComponent(TotalWidgetComponent.class);
                return new d[]{new TotalViewMapper(totalWidgetComponent), new StickyTotalViewMapper(totalWidgetComponent), new CheckoutProgressBarViewMapper(totalWidgetComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TotalWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b34 = j.b();
        final String str33 = "stickyBadgeInfo";
        i iVar26 = new i(str3, str33, b34) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$22
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StickyBadgeInfoConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StickyBadgeInfoViewMapper[]{new StickyBadgeInfoViewMapper((StickyBadgeInfoComponent) storage.getComponent(StickyBadgeInfoComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{StickyBadgeInfoComponent.INSTANCE.create()};
            }
        };
        final long[] supported_versions5 = RealFbsSplitConfig.INSTANCE.getSUPPORTED_VERSIONS();
        final String str34 = "rfbsSplit";
        i iVar27 = new i(str3, str34, supported_versions5) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$5
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new RealFbsSplitConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new RealFbsSplitViewMapper[]{new RealFbsSplitViewMapper((RealFbsSplitWidgetComponent) storage.getComponent(RealFbsSplitWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{RealFbsSplitWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] supported_versions6 = TotalStickyV3Config.INSTANCE.getSUPPORTED_VERSIONS();
        i iVar28 = new i(str, str2, supported_versions6) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$6
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalStickyV3Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalStickyV3ViewMapper[]{new TotalStickyV3ViewMapper((TotalStickyV3Component) storage.getComponent(TotalStickyV3Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TotalStickyV3Component.INSTANCE.create(storage)};
            }
        };
        final long[] b35 = j.b();
        final String str35 = "paymentInfoV2";
        i iVar29 = new i(str3, str35, b35) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$23
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PaymentInfoV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PaymentInfoV2ViewMapper[]{new PaymentInfoV2ViewMapper((PaymentInfoV2WidgetComponent) storage.getComponent(PaymentInfoV2WidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{PaymentInfoV2WidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b36 = j.b();
        i iVar30 = new i(str3, str2, b36) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$24
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StickyTotalConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StickyTotalViewMapper[]{new StickyTotalViewMapper((TotalWidgetComponent) storage.getComponent(TotalWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TotalWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] supported_versions7 = TotalV3Config.INSTANCE.getSUPPORTED_VERSIONS();
        i iVar31 = new i(str3, str31, supported_versions7) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$7
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalV3Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                TotalV3WidgetComponent totalV3WidgetComponent = (TotalV3WidgetComponent) storage.getComponent(TotalV3WidgetComponent.class);
                return new d[]{new TotalV3ViewMapper(totalV3WidgetComponent), new ProgressBarViewMapper(totalV3WidgetComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TotalV3WidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b37 = j.b();
        final String str36 = "totalExpanded";
        i iVar32 = new i(str3, str36, b37) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$25
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalExpandedConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalExpandedViewMapper[]{new TotalExpandedViewMapper((TotalExpandedWidgetComponent) storage.getComponent(TotalExpandedWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TotalExpandedWidgetComponent.INSTANCE.create(storage)};
            }
        };
        final long[] b38 = j.b();
        final String str37 = "pointsAndBonuses";
        i[] elements = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22, iVar23, iVar24, iVar25, iVar26, iVar27, iVar28, iVar29, iVar30, iVar31, iVar32, new i(str3, str37, b38) { // from class: ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module$provideWidgets$$inlined$WidgetFactory$default$26
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PointsAndBonusesConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PointsAndBonusesViewMapper[]{new PointsAndBonusesViewMapper((PointsAndBonusesWidgetComponent) storage.getComponent(PointsAndBonusesWidgetComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{PointsAndBonusesWidgetComponent.INSTANCE.create(storage)};
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
