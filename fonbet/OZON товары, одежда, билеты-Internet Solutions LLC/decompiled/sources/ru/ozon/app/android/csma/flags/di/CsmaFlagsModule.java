package ru.ozon.app.android.csma.flags.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.flags.AdvBannerV4ImagePrefetchFlag;
import ru.ozon.app.android.csma.flags.BarcodeFloorBrightnessChangerEnabledFlag;
import ru.ozon.app.android.csma.flags.ComposerExtendedDeliveryEnabledFlag;
import ru.ozon.app.android.csma.flags.FintechMaketplaceObDisabledFlag;
import ru.ozon.app.android.csma.flags.FintechShowOfflineBannerFlag;
import ru.ozon.app.android.csma.flags.OrderDoneStatusPrefetchImagesEnabled;
import ru.ozon.app.android.csma.flags.OzonSentryHelperEnabledFlag;
import ru.ozon.app.android.csma.flags.PostPaymentDescriptionEnabledFlag;
import ru.ozon.app.android.csma.flags.RateInAppEnabledFlag;
import ru.ozon.app.android.csma.flags.SentryAppLifecycleEventsBreadcrumbsEnabledFlag;
import ru.ozon.app.android.csma.flags.SentrySystemEventsBreadcrumbsEnabledFlag;
import ru.ozon.app.android.csma.flags.ShareBarcodeIconButtonEnabledFlag;
import ru.ozon.app.android.csma.flags.SmsAutoSubstitutionOnOtpFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/csma/flags/di/CsmaFlagsModule;", "", "<init>", "()V", "provideFlag", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "csma-flags_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CsmaFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlag() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) RateInAppEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Rate in-app на OrderDone", "ANDROID-26467", "MOB-3677")), new FeatureFlagRegistrationModel((FeatureFlag) PostPaymentDescriptionEnabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Заказы с постоплатой в ЛК", "https://jit.ozon.ru/browse/ANDROID-8159", "https://jit.ozon.ru/browse/BX-4351")), FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel((FeatureFlag) SmsAutoSubstitutionOnOtpFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Автоподстановка смс на отп экране", "https://jit.ozon.ru/browse/ANDROID-10542", "https://jit.ozon.ru/browse/BX-5202"))), FeatureFlagKt.asDelete(new FeatureFlagRegistrationModel((FeatureFlag) ComposerExtendedDeliveryEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Продление срока хранения заказа на композере", "https://jit.ozon.ru/browse/ANDROID-8900", "https://jit.ozon.ru/browse/BX-2665"))), new FeatureFlagRegistrationModel((FeatureFlag) OzonSentryHelperEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Включает OzonSentryHelper SDK", "https://jit.o3.ru/browse/ANDROID-40128", "https://jit.o3.ru/browse/MOB-11216")), new FeatureFlagRegistrationModel(AdvBannerV4ImagePrefetchFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Список страниц, на которых будет работать префетч картинок в rtb.advBanner.4", "https://jit.o3.ru/browse/ANDROID-43798", "https://jit.o3.ru/browse/MOB-12726")), new FeatureFlagRegistrationModel((FeatureFlag) OrderDoneStatusPrefetchImagesEnabled.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Включает префетч картинок для csma.orderDoneStatus", "https://jit.o3.ru/browse/ANDROID-43796", "https://jit.o3.ru/browse/MOB-12727")), new FeatureFlagRegistrationModel((FeatureFlag) SentryAppLifecycleEventsBreadcrumbsEnabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Включает интеграцию Sentry, которая отображает в Breadcrumbs события ЖЦ", "https://jit.o3.ru/browse/LIBMOB-13403", "https://jit.o3.ru/browse/LIBMOB-13403")), new FeatureFlagRegistrationModel((FeatureFlag) SentrySystemEventsBreadcrumbsEnabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Включает интеграцию Sentry, которая отображает в Breadcrumbs системные ивенты устройства", "https://jit.o3.ru/browse/LIBMOB-13403", "https://jit.o3.ru/browse/LIBMOB-13403")), new FeatureFlagRegistrationModel((FeatureFlag) FintechShowOfflineBannerFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Включает отображение баннера об оффлайне режиме в Ozon Finance", "http://jit.o3.ru/browse/ANDROID-45368", "https://jit.o3.ru/browse/MOB-13872")), new FeatureFlagRegistrationModel((FeatureFlag) ShareBarcodeIconButtonEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Включает IconButtonV3 вместо ButtonV3 для кнопки поделиться ШК", "https://jit.o3.ru/browse/ANDROID-45382", "https://jit.o3.ru/browse/MOB-13614")), new FeatureFlagRegistrationModel((FeatureFlag) BarcodeFloorBrightnessChangerEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Включает минимальную 60% яркость экрана на странице ШК", "https://jit.o3.ru/browse/ANDROID-45383", "https://jit.o3.ru/browse/MOB-13614")), new FeatureFlagRegistrationModel((FeatureFlag) FintechMaketplaceObDisabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Управляет упоминанием (промо) банка в маркетплейсе", "https://jit.o3.ru/browse/ANDROID-45883", "https://jit.o3.ru/browse/MOB-14115"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
