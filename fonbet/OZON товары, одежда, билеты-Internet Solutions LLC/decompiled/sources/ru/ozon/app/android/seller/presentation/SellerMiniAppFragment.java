package ru.ozon.app.android.seller.presentation;

import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.miniapp.R$style;
import ru.ozon.app.android.navigation.miniapp.MiniAppHostFragment;
import ru.ozon.app.android.seller.presentation.SellerTabNavigationFragment;
import ru.ozon.uni.atoms.af.pool.CacheHolder;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/seller/presentation/SellerMiniAppFragment;", "Lru/ozon/app/android/navigation/miniapp/MiniAppHostFragment;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "<init>", "()V", "", "miniApp", "deeplink", "Landroidx/fragment/app/m;", "createRootFragment", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/m;", "", "getThemeId", "()I", "themeId", "Companion", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SellerMiniAppFragment extends MiniAppHostFragment implements CacheHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/seller/presentation/SellerMiniAppFragment$Companion;", "", "<init>", "()V", "", "deeplink", "miniAppName", "referrerMiniAppName", "", "themeId", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroidx/fragment/app/m;", "ARG_THEME_ID", "Ljava/lang/String;", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(String deeplink, @NotNull String miniAppName, @NotNull String referrerMiniAppName, int themeId) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            Intrinsics.checkNotNullParameter(referrerMiniAppName, "referrerMiniAppName");
            SellerMiniAppFragment sellerMiniAppFragment = new SellerMiniAppFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ru.ozon.compass.ARG_REDIRECT_DEEPLINK", deeplink);
            bundle.putString("mini_app_param", miniAppName);
            bundle.putString("ru.ozon.compass.ARG_REFERRER_MINI_APP", referrerMiniAppName);
            bundle.putInt("SELLER_MINI_APP_THEME_ARG", themeId);
            sellerMiniAppFragment.setArguments(bundle);
            return sellerMiniAppFragment;
        }

        private Companion() {
        }
    }

    @Override // BZ.h
    @NotNull
    public ComponentCallbacksC5392m createRootFragment(@NotNull String miniApp, String deeplink) {
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        SellerTabNavigationFragment.Companion companion = SellerTabNavigationFragment.INSTANCE;
        Bundle arguments = getArguments();
        return companion.newInstance(miniApp, arguments != null ? arguments.getString("ru.ozon.compass.ARG_REFERRER_MINI_APP") : null, deeplink);
    }

    @Override // xZ.l
    public int getThemeId() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getInt("SELLER_MINI_APP_THEME_ARG", R$style.SellerTheme) : R$style.SellerTheme;
    }
}
