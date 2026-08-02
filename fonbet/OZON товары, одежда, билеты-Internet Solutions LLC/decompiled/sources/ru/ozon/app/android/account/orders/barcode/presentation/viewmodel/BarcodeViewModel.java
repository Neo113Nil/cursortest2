package ru.ozon.app.android.account.orders.barcode.presentation.viewmodel;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.barcodecache.data.BarcodeData;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import xe.C10727i;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001.B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\"\u0010#\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u001a0\u001a0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u0016\u0010\u0018\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "barcodeCacheManager", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "connectionHandler", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;Lru/ozon/app/android/network/networkhandler/ConnectionHandler;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;", "newState", "", "updateState", "(Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;)V", "Lru/ozon/app/android/barcodecache/data/BarcodeData;", "data", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "createBarcodeVo", "(Lru/ozon/app/android/barcodecache/data/BarcodeData;)Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "getCachedBarcode", "()V", "composerIsUp", "manualSwipeRefresh", "composerError", "waitForComposerPageToLoad", "", "isExpanded", "setExpanded", "(Z)V", "Lru/ozon/app/android/barcodecache/cache/BarcodeCacheManager;", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "Lru/ozon/app/android/utils/AppType;", "Landroidx/lifecycle/V;", "kotlin.jvm.PlatformType", "_expanded", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "Landroidx/lifecycle/P;", "getExpanded", "()Landroidx/lifecycle/P;", "_viewState", "viewState", "getViewState", "Z", "BarcodeViewState", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeViewModel extends w0 {

    @NotNull
    private final V<Boolean> _expanded;

    @NotNull
    private final V<BarcodeViewState> _viewState;

    @NotNull
    private final AppType appType;

    @NotNull
    private final BarcodeCacheManager barcodeCacheManager;
    private boolean composerError;

    @NotNull
    private final ConnectionHandler connectionHandler;

    @NotNull
    private final P<Boolean> expanded;

    @NotNull
    private final P<BarcodeViewState> viewState;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;", "", "<init>", "()V", "ShowCache", "ShowComposer", "ComposerLoading", "ManualSwipeRefresh", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState$ComposerLoading;", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState$ManualSwipeRefresh;", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState$ShowCache;", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState$ShowComposer;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class BarcodeViewState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState$ComposerLoading;", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ComposerLoading extends BarcodeViewState {
            public ComposerLoading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState$ManualSwipeRefresh;", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ManualSwipeRefresh extends BarcodeViewState {
            public ManualSwipeRefresh() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState$ShowCache;", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "barcode", "<init>", "(Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "getBarcode", "()Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowCache extends BarcodeViewState {

            @NotNull
            private final CommonBarcodeV2VO barcode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowCache(@NotNull CommonBarcodeV2VO barcode) {
                super(null);
                Intrinsics.checkNotNullParameter(barcode, "barcode");
                this.barcode = barcode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowCache) && Intrinsics.d(this.barcode, ((ShowCache) other).barcode);
            }

            @NotNull
            public final CommonBarcodeV2VO getBarcode() {
                return this.barcode;
            }

            public int hashCode() {
                return this.barcode.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowCache(barcode=" + this.barcode + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState$ShowComposer;", "Lru/ozon/app/android/account/orders/barcode/presentation/viewmodel/BarcodeViewModel$BarcodeViewState;", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowComposer extends BarcodeViewState {
            public ShowComposer() {
                super(null);
            }
        }

        public /* synthetic */ BarcodeViewState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BarcodeViewState() {
        }
    }

    public BarcodeViewModel(@NotNull BarcodeCacheManager barcodeCacheManager, @NotNull ConnectionHandler connectionHandler, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(barcodeCacheManager, "barcodeCacheManager");
        Intrinsics.checkNotNullParameter(connectionHandler, "connectionHandler");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.barcodeCacheManager = barcodeCacheManager;
        this.connectionHandler = connectionHandler;
        this.appType = appType;
        V<Boolean> v11 = new V<>(Boolean.FALSE);
        this._expanded = v11;
        this.expanded = v11;
        V<BarcodeViewState> v12 = new V<>(new BarcodeViewState.ComposerLoading());
        this._viewState = v12;
        this.viewState = v12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final CommonBarcodeV2VO createBarcodeVo(BarcodeData data) {
        String code = data.getCode();
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(data.getVisibleCode());
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        TextDTO textDTO = new TextDTO(ozonSpannableString, null, null, null, layoutPadding, layoutPadding2, textPreset, UniTextStyles.HEADLINE_600_LARGE.getToken(), UniColors.TEXT_PRIMARY_ON_LIGHT.getToken(), null, null, null, null, false, null, null, null, null, null, 523838, null);
        Object[] objArr = 0 == true ? 1 : 0;
        TextDTO textDTO2 = new TextDTO(OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_barcode_subtitle)), TextDTO.TextAlignment.CENTER, layoutPadding, layoutPadding2, null, null, textPreset, UniTextStyles.BODY_300_X_SMALL.getToken(), UniColors.TEXT_SECONDARY_ON_LIGHT.getToken(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, objArr, 523836, null);
        Paddings paddings = Paddings.NONE;
        AppType appType = this.appType;
        AppType appType2 = AppType.SELECT;
        String token = appType == appType2 ? UniColors.BG_DARK_KEY.getToken() : UniColors.LAYER_FLOOR_1.getToken();
        CornerRadius cornerRadius = CornerRadius.RADIUS_600;
        Paddings paddings2 = this.appType == appType2 ? Paddings.PADDING_700 : paddings;
        Paddings paddings3 = Paddings.PADDING_700;
        Paddings paddings4 = Paddings.PADDING_500;
        return new CommonBarcodeV2VO(0L, code, textDTO, textDTO2, null, null, "", false, paddings, paddings, token, cornerRadius, 160, 24, paddings2, paddings3, paddings4, paddings4, CornerRadius.RADIUS_400);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(BarcodeViewState newState) {
        boolean z11 = this.composerError;
        if (z11 && (newState instanceof BarcodeViewState.ShowComposer)) {
            this._viewState.setValue(newState);
            return;
        }
        if (z11 && !(newState instanceof BarcodeViewState.ShowCache)) {
            getCachedBarcode();
        } else if (newState instanceof BarcodeViewState.ManualSwipeRefresh) {
            this.composerError = false;
        } else {
            this._viewState.setValue(newState);
        }
    }

    public final void composerError() {
        this.barcodeCacheManager.setErrorOccurred(true);
        this.composerError = true;
    }

    public final void composerIsUp() {
        this.barcodeCacheManager.setErrorOccurred(false);
        updateState(new BarcodeViewState.ShowComposer());
    }

    public final void getCachedBarcode() {
        C10727i.c(x0.a(this), null, null, new BarcodeViewModel$getCachedBarcode$1(this, null), 3);
    }

    @NotNull
    public final P<Boolean> getExpanded() {
        return this.expanded;
    }

    @NotNull
    public final P<BarcodeViewState> getViewState() {
        return this.viewState;
    }

    public final void manualSwipeRefresh() {
        updateState(new BarcodeViewState.ManualSwipeRefresh());
    }

    public final void setExpanded(boolean isExpanded) {
        this._expanded.setValue(Boolean.valueOf(isExpanded));
    }

    public final void waitForComposerPageToLoad() {
        if (this.connectionHandler.hasInternetConnection()) {
            C10727i.c(x0.a(this), null, null, new BarcodeViewModel$waitForComposerPageToLoad$1(this, null), 3);
        } else {
            getCachedBarcode();
        }
    }
}
