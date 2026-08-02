package ru.ozon.app.android.ugc.core.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.pdp.flags.ReviewsActionsFooterButtonsPreCreateCountFlag;
import ru.ozon.app.android.pdp.flags.ReviewsActionsFooterIconButtonsPreCreateCountFlag;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/flags/UgcCoreFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "provideFlags$core_prodGoogleAllVendorsRelease", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcCoreFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags$core_prodGoogleAllVendorsRelease() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) ReviewsActionsFooterButtonsPreCreateCountFlag.INSTANCE, 0, FeatureFlagKt.featureFlagDisplayedName("Флаг задаёт количество обычных кнопок, которые будут предсозданы для страницы review_list", "https://jit.o3.ru/browse/ANDROID-39217", "https://jit.o3.ru/browse/MOB-10510")), new FeatureFlagRegistrationModel((FeatureFlag) ReviewsActionsFooterIconButtonsPreCreateCountFlag.INSTANCE, 0, FeatureFlagKt.featureFlagDisplayedName("Флаг задаёт количество кнопок-иконок, которые будут предсозданы для страницы review_list", "https://jit.o3.ru/browse/ANDROID-39217", "https://jit.o3.ru/browse/MOB-10510")), new FeatureFlagRegistrationModel((FeatureFlag) UgcIconWidgetComposeEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Перевод виджета rpProduct.iconWidget на Compose", "https://jit.o3.ru/browse/ANDROID-42532", "https://jit.o3.ru/browse/MOB-12220")), new FeatureFlagRegistrationModel((FeatureFlag) ReviewGalleryPreviewComposeEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Перевод виджета rpProduct.reviewGalleryPreview.v2 на Compose", "https://jit.o3.ru/browse/ANDROID-42951", "https://jit.o3.ru/browse/MOB-12176"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
