package ru.ozon.app.android.account.orders.emptyscreen;

import E00.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcodePopover.v1.data.BarcodePopoverDTO;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.barcodecache.data.BarcodeData;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import z00.c;
import z00.d;
import z00.e;
import z00.f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/BarcodeFullScreenOfflineFactory;", "LE00/a;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "barcodeCacheManager", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;Lcom/squareup/moshi/Moshi;)V", "Lz00/e;", "", "appendCurtainSettings", "(Lz00/e;)V", "appendBarcode", "Lz00/f;", "issue", "Lz00/c;", "createErrorState", "(Lz00/f;)Lz00/c;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/barcodePopover/v1/data/BarcodePopoverDTO;", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeFullScreenOfflineFactory implements a {

    @NotNull
    private final JsonAdapter<BarcodePopoverDTO> adapter;

    @NotNull
    private final BarcodeCacheManager barcodeCacheManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/BarcodeFullScreenOfflineFactory$Companion;", "", "<init>", "()V", "ICON_NAME", "", "createTitleDto", "Lru/ozon/uni/atoms/data/text/TextDTO;", "visibleCode", "createCloseButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IconButtonV3DTO createCloseButton() {
            return new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, UniColors.GRAPHIC_SECONDARY_ON_LIGHT.getToken(), UniColors.GRAPHIC_DISABLED_ON_LIGHT.getToken(), new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, null, 16144, null);
        }

        @NotNull
        public final TextDTO createTitleDto(@NotNull String visibleCode) {
            Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
            return new TextDTO(OzonSpannableStringKt.toOzonSpannableString(visibleCode), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.HEADLINE_700_X_LARGE.getToken(), UniColors.TEXT_PRIMARY_ON_LIGHT.getToken(), null, null, null, null, false, null, null, null, null, null, 523838, null);
        }

        private Companion() {
        }
    }

    public BarcodeFullScreenOfflineFactory(@NotNull BarcodeCacheManager barcodeCacheManager, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(barcodeCacheManager, "barcodeCacheManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.barcodeCacheManager = barcodeCacheManager;
        this.adapter = moshi.c(BarcodePopoverDTO.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendBarcode(e eVar) {
        BarcodeData barcode = this.barcodeCacheManager.getBarcode();
        if (barcode == null) {
            return;
        }
        Companion companion = INSTANCE;
        eVar.a(1L, "csma", "barcodePopover", this.adapter.toJson(new BarcodePopoverDTO(companion.createTitleDto(barcode.getVisibleCode()), barcode.getCode(), companion.createCloseButton())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendCurtainSettings(e eVar) {
        eVar.a(1L, "common", "curtainSettings", "{\n    \"containerBackgroundColor\": \"clearLightKey0\",\n    \"heightMode\": \"FULL_SCREEN\",\n    \"hideToungle\": true,\n    \"isEasyCloseGesture\": false\n}");
    }

    @Override // E00.a
    @NotNull
    public c createErrorState(@NotNull f issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        return d.b(new BarcodeFullScreenOfflineFactory$createErrorState$1(this));
    }
}
