package ru.ozon.app.android.delivery.common;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniColorsSelect;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\f"}, d2 = {"Lru/ozon/app/android/delivery/common/AppTokensProvider;", "", "<init>", "()V", "isSelect", "", "Landroid/content/Context;", "IslandSeparatorHeight", "Colors", "CornerRadius", "Size", "CourierOnMapPinColor", "tokens_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppTokensProvider {

    @NotNull
    public static final AppTokensProvider INSTANCE = new AppTokensProvider();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/delivery/common/AppTokensProvider$CornerRadius;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "big", "(Landroid/content/Context;)F", "average", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "small", "(Lru/ozon/app/android/utils/AppType;)Lru/ozon/uni/atoms/data/common/CornerRadius;", "tokens_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class CornerRadius {

        @NotNull
        public static final CornerRadius INSTANCE = new CornerRadius();

        private CornerRadius() {
        }

        public final float average(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AppTokensProvider.INSTANCE.isSelect(context) ? ResourceExtKt.toPxF(ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_550.getPx(), context) : ResourceExtKt.toPxF(ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_400.getPx(), context);
        }

        public final float big(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AppTokensProvider.INSTANCE.isSelect(context) ? ResourceExtKt.toPxF(ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_550.getPx(), context) : ResourceExtKt.toPxF(ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_500.getPx(), context);
        }

        @NotNull
        public final ru.ozon.uni.atoms.data.common.CornerRadius small(@NotNull AppType appType) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            return appType == AppType.SELECT ? ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_500 : ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_400;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/delivery/common/AppTokensProvider$CourierOnMapPinColor;", "", "<init>", "()V", "courier", "Lru/ozon/uni/core/UniColors;", "context", "Landroid/content/Context;", "tokens_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class CourierOnMapPinColor {

        @NotNull
        public static final CourierOnMapPinColor INSTANCE = new CourierOnMapPinColor();

        private CourierOnMapPinColor() {
        }

        @NotNull
        public final UniColors courier(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AppTokensProvider.INSTANCE.isSelect(context) ? UniColors.BG_DARK_KEY : UniColors.BG_ACTION_PRIMARY;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/delivery/common/AppTokensProvider$IslandSeparatorHeight;", "", "<init>", "()V", "between", "", "tokens_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class IslandSeparatorHeight {

        @NotNull
        public static final IslandSeparatorHeight INSTANCE = new IslandSeparatorHeight();

        private IslandSeparatorHeight() {
        }

        public final int between() {
            return 4;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/delivery/common/AppTokensProvider$Size;", "", "<init>", "()V", "average", "", "context", "Landroid/content/Context;", "tokens_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Size {

        @NotNull
        public static final Size INSTANCE = new Size();

        private Size() {
        }

        public final int average(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AppTokensProvider.INSTANCE.isSelect(context) ? ResourceExtKt.toPx(2, context) : ResourceExtKt.toPx(8, context);
        }
    }

    private AppTokensProvider() {
    }

    public final boolean isSelect(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppVersionService.Companion companion = AppVersionService.INSTANCE;
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return companion.isSelect(((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getAppVersionService());
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/delivery/common/AppTokensProvider$Colors;", "", "<init>", "()V", "layerFloor0", "Lru/ozon/app/android/delivery/common/AppTokensProvider$Colors$UniColor;", "context", "Landroid/content/Context;", "layerOverlay", "Lru/ozon/uni/core/models/UniColorToken;", "appType", "Lru/ozon/app/android/utils/AppType;", "backgroundPageColor", "Lru/ozon/uni/core/UniColors;", "UniColor", "tokens_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Colors {

        @NotNull
        public static final Colors INSTANCE = new Colors();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/delivery/common/AppTokensProvider$Colors$UniColor;", "", "token", "", "resId", "", "<init>", "(Ljava/lang/String;I)V", "getToken", "()Ljava/lang/String;", "getResId", "()I", "tokens_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UniColor {
            private final int resId;

            @NotNull
            private final String token;

            public UniColor(@NotNull String token, int i11) {
                Intrinsics.checkNotNullParameter(token, "token");
                this.token = token;
                this.resId = i11;
            }

            public final int getResId() {
                return this.resId;
            }

            @NotNull
            public final String getToken() {
                return this.token;
            }
        }

        private Colors() {
        }

        @NotNull
        public final UniColors backgroundPageColor(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AppTokensProvider.INSTANCE.isSelect(context) ? UniColors.LAYER_FLOOR_1 : UniColors.LAYER_FLOOR_0;
        }

        @NotNull
        public final UniColor layerFloor0(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AppTokensProvider.INSTANCE.isSelect(context)) {
                UniColorsSelect uniColorsSelect = UniColorsSelect.LAYER_FLOOR_0_SELECT;
                return new UniColor(uniColorsSelect.getToken(), uniColorsSelect.getResId());
            }
            UniColors uniColors = UniColors.LAYER_FLOOR_0;
            return new UniColor(uniColors.getToken(), uniColors.getResId());
        }

        @NotNull
        public final UniColor layerOverlay(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            UniColors uniColors = AppTokensProvider.INSTANCE.isSelect(context) ? UniColors.BG_DARK_KEY : UniColors.LAYER_FLOOR_1;
            return new UniColor(uniColors.getToken(), uniColors.getResId());
        }

        @NotNull
        public final UniColorToken layerOverlay(@NotNull AppType appType) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            if (appType == AppType.SELECT) {
                return UniTheme.INSTANCE.getColorTokens().getBgDarkKey();
            }
            return UniTheme.INSTANCE.getColorTokens().getLayerFloor1();
        }
    }
}
