package ru.ozon.app.android.storefront.widgets.appOnboarding.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/di/AppOnboardingWidgetModule;", "", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "", "Ln20/i;", "provideAppOnboarding$storefront_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideAppOnboarding", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppOnboardingWidgetModule {
    @NotNull
    public final Set<i> provideAppOnboarding$storefront_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return e0.h(AppOnboardingComposeWidgetKt.appOnboardingWidget(jsonDeserializer));
    }
}
