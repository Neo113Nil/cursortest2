package ru.ozon.app.android.whitelist.common.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.whitelist.common.flags.DomainsWhitelistFlag;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/whitelist/common/di/WhitelistFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "Companion", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WhitelistFlagsModule {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/whitelist/common/di/WhitelistFlagsModule$Companion;", "", "<init>", "()V", "DOMAINS_WHITELIST_FLAG_DEFAULT_VALUE", "", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        DomainsWhitelistFlag domainsWhitelistFlag = DomainsWhitelistFlag.INSTANCE;
        return e0.h(new FeatureFlagRegistrationModel(domainsWhitelistFlag, "ozon.ru, ozon.travel, ozone.ru, ozonru.me, alfastrah.ru, litres.ru, ozon.com, ozon.com.me, ozon.by, ozon.level.travel, ozon.kz, ozon.tm, ozon.uz, pub.fsa.gov.ru, esia.gosusulugi.ru, id.sber.ru, elk.roszdravnadzor.gov.ru", FeatureFlagKt.featureFlagDisplayedName$default(domainsWhitelistFlag.getFeatureName(), null, null, 6, null)));
    }
}
