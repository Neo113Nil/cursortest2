package ru.ozon.app.android.account.orders.emptyscreen;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.account.orders.commonBarcodeV2.data.CommonBarcodeV2DTO;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.barcodecache.data.BarcodeData;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;
import z00.e;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0011*\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0011*\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/BarcodeWidgetFactory;", "", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "barcodeCacheManager", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "miniAppHolder", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;Lru/ozon/app/android/storage/teensMode/TeensModeStorage;Lcom/squareup/moshi/Moshi;)V", "Lz00/e;", "", "isTeensMode", "", "appendTextWidget", "(Lz00/e;Z)V", "Lru/ozon/app/android/barcodecache/data/BarcodeData;", "data", "appendBarcodeWidget", "(Lz00/e;Lru/ozon/app/android/barcodecache/data/BarcodeData;)V", "appendEndIslandSeparator", "(Lz00/e;)V", "appendBetweenIslandSeparator", "isBarcodeRequired", "()Z", "", "text", "getBarcodeHeader", "(Ljava/lang/String;)Ljava/lang/String;", "builder", "appendWidget", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "Lkotlin/text/Regex;", "tagRegex", "Lkotlin/text/Regex;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "barcodeJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "islandSeparatorJsonAdapter", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeWidgetFactory {

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final BarcodeCacheManager barcodeCacheManager;

    @NotNull
    private final JsonAdapter<CommonBarcodeV2DTO> barcodeJsonAdapter;

    @NotNull
    private final JsonAdapter<IslandSeparatorDTO> islandSeparatorJsonAdapter;

    @NotNull
    private final CurrentMiniAppHolder miniAppHolder;

    @NotNull
    private final Regex tagRegex;

    @NotNull
    private final TeensModeStorage teensModeStorage;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/BarcodeWidgetFactory$Companion;", "", "<init>", "()V", "BARCODE_HEIGHT", "", "BARCODE_PADDING", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BarcodeWidgetFactory(@NotNull BarcodeCacheManager barcodeCacheManager, @NotNull AppVersionService appVersionService, @NotNull CurrentMiniAppHolder miniAppHolder, @NotNull TeensModeStorage teensModeStorage, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(barcodeCacheManager, "barcodeCacheManager");
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(miniAppHolder, "miniAppHolder");
        Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.barcodeCacheManager = barcodeCacheManager;
        this.appVersionService = appVersionService;
        this.miniAppHolder = miniAppHolder;
        this.teensModeStorage = teensModeStorage;
        this.tagRegex = new Regex("<.*?>");
        this.barcodeJsonAdapter = moshi.c(CommonBarcodeV2DTO.class);
        this.islandSeparatorJsonAdapter = moshi.c(IslandSeparatorDTO.class);
    }

    private final void appendBarcodeWidget(e eVar, BarcodeData barcodeData) {
        String code = barcodeData.getCode();
        CommonBarcodeV2DefaultDataFactory commonBarcodeV2DefaultDataFactory = CommonBarcodeV2DefaultDataFactory.INSTANCE;
        TextDTO createVisibleCode = commonBarcodeV2DefaultDataFactory.createVisibleCode(barcodeData.getVisibleCode());
        TextDTO createSubtitle = commonBarcodeV2DefaultDataFactory.createSubtitle(this.teensModeStorage.isTeensModeEnabled());
        CommonControlSettings createCommon = commonBarcodeV2DefaultDataFactory.createCommon();
        Paddings paddings = Paddings.NONE;
        Paddings paddings2 = Paddings.PADDING_500;
        eVar.a(2L, "csma", "commonBarcode", h.X(this.tagRegex.replace(this.barcodeJsonAdapter.toJson(new CommonBarcodeV2DTO(code, createVisibleCode, createSubtitle, createCommon, true, paddings2, paddings, UniColors.LAYER_FLOOR_1.getToken(), CornerRadius.RADIUS_600, 160, 24, paddings, Paddings.PADDING_700, paddings2, paddings2, CornerRadius.RADIUS_400)), ""), "\\n\"", "\"", false));
    }

    private final void appendBetweenIslandSeparator(e eVar) {
        eVar.a(1L, "common", "islandSeparator", this.islandSeparatorJsonAdapter.toJson(new IslandSeparatorDTO(Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between()), UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null)));
    }

    private final void appendEndIslandSeparator(e eVar) {
        eVar.a(1L, "common", "islandSeparator", this.islandSeparatorJsonAdapter.toJson(new IslandSeparatorDTO(null, UniColors.LAYER_FLOOR_1.getToken(), IslandSeparatorDTO.Configuration.SECTION_END, null, null, Boolean.FALSE)));
    }

    private final void appendTextWidget(e eVar, boolean z11) {
        eVar.a(1L, "common", "text", getBarcodeHeader(StringProvider.getString(z11 ? R$string.barcode_empty_state_teen_mode_header : R$string.barcode_empty_state_header)));
    }

    private final String getBarcodeHeader(String text) {
        return h.E0("\n            {\n              \"atoms\": [\n                {\n                  \"type\": \"text\",\n                  \"text\": {\n                    \"text\": \"" + text + "\",\n                    \"textAlignment\": \"CENTER\",\n                    \"leftPadding\": \"PADDING_500\",\n                    \"rightPadding\": \"PADDING_500\",\n                    \"topPadding\": \"PADDING_500\",\n                    \"preset\": \"PRESET_CUSTOM\",\n                    \"typographyToken\": \"tsBody500Medium\",\n                    \"textColor\": \"textSecondary\",\n                    \"maxLines\": 0\n                  }\n                }\n              ],\n              \"backgroundColor\": \"layerFloor1\"\n            }\n        ");
    }

    private final boolean isBarcodeRequired() {
        return (AppVersionService.INSTANCE.isTravel(this.appVersionService) || Intrinsics.d(this.miniAppHolder.getCurrentMiniApp(), "travel")) ? false : true;
    }

    public final void appendWidget(@NotNull e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean isTeensModeEnabled = this.teensModeStorage.isTeensModeEnabled();
        BarcodeData barcode = isBarcodeRequired() ? this.barcodeCacheManager.getBarcode() : null;
        if (barcode != null) {
            appendBetweenIslandSeparator(builder);
        }
        if (barcode != null) {
            appendTextWidget(builder, isTeensModeEnabled);
            appendBarcodeWidget(builder, barcode);
            appendEndIslandSeparator(builder);
        }
    }
}
