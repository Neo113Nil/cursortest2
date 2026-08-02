package ru.ozon.app.android.core.navigation.deeplink.storefront.seller;

import BZ.a;
import BZ.e;
import BZ.f;
import CZ.b;
import CZ.c;
import CZ.g;
import Sc.k;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.flags.SellerMiniappDisabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/storefront/seller/SellerAppHandler;", "LBZ/a;", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LBZ/e;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "miniAppName", "", "canSwitchApp", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "LEZ/e;", "LCZ/g;", "response", "isSaved", "LCZ/c;", "getMiniAppDestination", "(Landroid/content/Context;Ljava/lang/String;LEZ/e;Z)LCZ/c;", "LBZ/e;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerAppHandler implements a {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final e miniAppConfigHolder;
    public static final int $stable = 8;

    public SellerAppHandler(@NotNull e miniAppConfigHolder, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.featureChecker = featureChecker;
    }

    @Override // BZ.a
    public boolean canSwitchApp(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        return h.e0(miniAppName, "seller_", false);
    }

    @Override // BZ.a
    public c getMiniAppDestination(@NotNull Context context, @NotNull String miniAppName, @NotNull EZ.e<g> response, boolean isSaved) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.featureChecker.isEnabled(SellerMiniappDisabled.INSTANCE)) {
            return null;
        }
        String a11 = f.a(this.miniAppConfigHolder);
        CZ.e b11 = CZ.f.b(this, miniAppName, k.b(new SellerAppHandler$getMiniAppDestination$destination$1(response, miniAppName, a11)), null, false, 12);
        return MiniAppUtilsKt.isSameSellerMiniAppExist(a11) ? new b(b11, b.a.ALL, 4) : b11;
    }
}
