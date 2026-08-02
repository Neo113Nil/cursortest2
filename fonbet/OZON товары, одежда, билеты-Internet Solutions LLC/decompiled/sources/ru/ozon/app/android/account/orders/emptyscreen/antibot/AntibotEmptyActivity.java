package ru.ozon.app.android.account.orders.emptyscreen.antibot;

import AI.a;
import BZ.e;
import BZ.f;
import Sc.InterfaceC4008j;
import Sc.k;
import a1.C4912a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.g;
import androidx.core.view.Q0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcodePopover.v1.viewObject.BarcodePopoverVO;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ViewModel;
import ru.ozon.app.android.account.orders.emptyscreen.BarcodeFullScreenOfflineFactory;
import ru.ozon.app.android.account.orders.emptyscreen.CommonBarcodeV2DefaultDataFactory;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.modal.AntibotBarcodePopoverBottomSheetFragment;
import ru.ozon.app.android.barcodecache.data.BarcodeData;
import ru.ozon.app.android.cs_orders.R$string;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0015¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006@²\u0006\f\u0010?\u001a\u00020>8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/antibot/AntibotEmptyActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "Lru/ozon/app/android/account/orders/emptyscreen/antibot/AntibotBarcodeView;", "", "bind", "(Lru/ozon/app/android/account/orders/emptyscreen/antibot/AntibotBarcodeView;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getToolbarTextDTO", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getToolbarCloseBtnDTO", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "createBarcodeVo", "()Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "onBarcodeClick", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;", "createBarcodePopoverVO", "()Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isSelect$delegate", "LSc/j;", "isSelect", "()Z", "", "navbarColor$delegate", "getNavbarColor", "()I", "navbarColor", "pageColor$delegate", "getPageColor", "pageColor", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;", "viewModel", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "LBZ/e;", "miniAppConfigHolder", "LBZ/e;", "", "getCode", "()Ljava/lang/String;", "code", "getVisibleCode", "visibleCode", "Companion", "LBZ/d;", "config", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AntibotEmptyActivity extends g {
    private AppType appType;
    private e miniAppConfigHolder;
    private TeensModeStorage teensModeStorage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: isSelect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isSelect = LazyUtilsKt.unsafeLazy(new AntibotEmptyActivity$isSelect$2(this));

    /* renamed from: navbarColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navbarColor = LazyUtilsKt.unsafeLazy(new AntibotEmptyActivity$navbarColor$2(this));

    /* renamed from: pageColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j pageColor = LazyUtilsKt.unsafeLazy(new AntibotEmptyActivity$pageColor$2(this));

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new AntibotEmptyActivity$viewModel$2(this));

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/antibot/AntibotEmptyActivity$Companion;", "", "<init>", "()V", "CODE", "", "VISIBLE_CODE", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "barcode", "Lru/ozon/app/android/barcodecache/data/BarcodeData;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, @NotNull BarcodeData barcode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(barcode, "barcode");
            Intent intent = new Intent(context, (Class<?>) AntibotEmptyActivity.class);
            intent.addFlags(536870912);
            intent.putExtra("AntibotEmptyActivityCode", barcode.getCode());
            intent.putExtra("AntibotEmptyActivityVisibleCode", barcode.getVisibleCode());
            return intent;
        }

        private Companion() {
        }
    }

    private final void bind(AntibotBarcodeView antibotBarcodeView) {
        TextHolderKt.bind$default(antibotBarcodeView.getToolbarTextView(), getToolbarTextDTO(), null, 2, null);
        IconButtonV3View iconButtonView = antibotBarcodeView.getIconButtonView();
        IconButtonV3HolderKt.bind$default(iconButtonView, getToolbarCloseBtnDTO(), null, 2, null);
        iconButtonView.setOnClickListener(new a(this, 4));
        antibotBarcodeView.getBarcodeView().a(new C4912a(true, 187929814, new AntibotEmptyActivity$bind$2(this)));
        antibotBarcodeView.getNavbarBackground().setBackgroundColor(getNavbarColor());
        antibotBarcodeView.setBackgroundColor(getPageColor());
    }

    private final BarcodePopoverVO createBarcodePopoverVO() {
        BarcodeFullScreenOfflineFactory.Companion companion = BarcodeFullScreenOfflineFactory.INSTANCE;
        return new BarcodePopoverVO(-1L, companion.createTitleDto(getVisibleCode()), getCode(), companion.createCloseButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonBarcodeV2VO createBarcodeVo() {
        String code = getCode();
        CommonBarcodeV2DefaultDataFactory commonBarcodeV2DefaultDataFactory = CommonBarcodeV2DefaultDataFactory.INSTANCE;
        TextDTO createVisibleCode = commonBarcodeV2DefaultDataFactory.createVisibleCode(getVisibleCode());
        TeensModeStorage teensModeStorage = this.teensModeStorage;
        if (teensModeStorage == null) {
            Intrinsics.n("teensModeStorage");
            throw null;
        }
        TextDTO createSubtitle = commonBarcodeV2DefaultDataFactory.createSubtitle(teensModeStorage.isTeensModeEnabled());
        CommonControlSettings createCommon = commonBarcodeV2DefaultDataFactory.createCommon();
        Paddings paddings = Paddings.NONE;
        return new CommonBarcodeV2VO(0L, code, createVisibleCode, createSubtitle, createCommon, null, "", false, paddings, paddings, UniColors.CLEAR_LIGHT_KEY_0.getToken(), CornerRadius.RADIUS_600, 160, 24, isSelect() ? Paddings.PADDING_700 : paddings, Paddings.PADDING_700, isSelect() ? Paddings.PADDING_500 : Paddings.PADDING_400, Paddings.PADDING_500, CornerRadius.RADIUS_400);
    }

    private final String getCode() {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("AntibotEmptyActivityCode") : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final int getNavbarColor() {
        return ((Number) this.navbarColor.getValue()).intValue();
    }

    private final int getPageColor() {
        return ((Number) this.pageColor.getValue()).intValue();
    }

    private final IconButtonV3DTO getToolbarCloseBtnDTO() {
        return new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, (isSelect() ? UniColors.GRAPHIC_LIGHT_KEY : UniColors.GRAPHIC_SECONDARY).getToken(), UniColors.BG_OVERLAP.getToken(), null, null, null, null, null, null, null, 16272, null);
    }

    private final TextDTO getToolbarTextDTO() {
        OzonSpannableString ozonSpannableString = new OzonSpannableString(StringProvider.getString(R$string.orders_barcode_toolbar_title));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_1100;
        return new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, null, null, TextPreset.PRESET_CUSTOM, "tsBodyControl500Medium", (isSelect() ? UniColors.TEXT_PRIMARY_ON_DARK : UniColors.TEXT_PRIMARY).getToken(), null, null, null, null, false, null, null, null, null, null, 523824, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonBarcodeV2ViewModel getViewModel() {
        return (CommonBarcodeV2ViewModel) this.viewModel.getValue();
    }

    private final String getVisibleCode() {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("AntibotEmptyActivityVisibleCode") : null;
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSelect() {
        return ((Boolean) this.isSelect.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBarcodeClick(AtomAction action) {
        if (action instanceof AtomAction.Move) {
            AntibotBarcodePopoverBottomSheetFragment.Companion companion = AntibotBarcodePopoverBottomSheetFragment.INSTANCE;
            BarcodePopoverVO createBarcodePopoverVO = createBarcodePopoverVO();
            e eVar = this.miniAppConfigHolder;
            if (eVar != null) {
                companion.newInstance(createBarcodePopoverVO, f.b(eVar)).show(getSupportFragmentManager(), (String) null);
            } else {
                Intrinsics.n("miniAppConfigHolder");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    @SuppressLint({"MissingActivityTheme"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        this.appType = ((AndroidPlatformComponentApi) dependencyStorage.b(AndroidPlatformComponentApi.class)).getAppType();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        this.miniAppConfigHolder = ((NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class)).getMiniAppConfigHolder();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        this.teensModeStorage = ((StorageComponentApi) dependencyStorage3.b(StorageComponentApi.class)).getTeensModeStorage();
        AntibotBarcodeView antibotBarcodeView = new AntibotBarcodeView(this, null, 0, 0, 14, null);
        setContentView(antibotBarcodeView);
        getWindow().setStatusBarColor(getNavbarColor());
        Q0 q02 = new Q0(getWindow().getDecorView(), getWindow());
        Intrinsics.checkNotNullExpressionValue(q02, "getInsetsController(...)");
        q02.e((isSelect() || ThemeExtKt.isDarkThemeActive(this)) ? false : true);
        bind(antibotBarcodeView);
    }
}
