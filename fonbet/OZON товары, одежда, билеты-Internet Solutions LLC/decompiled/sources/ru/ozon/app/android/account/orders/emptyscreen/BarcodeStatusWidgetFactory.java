package ru.ozon.app.android.account.orders.emptyscreen;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.app.android.cs_orders.R$string;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import z00.e;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/BarcodeStatusWidgetFactory;", "", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/storage/teensMode/TeensModeStorage;Lcom/squareup/moshi/Moshi;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "createRefreshButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "createTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "createMessage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "createImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lz00/e;", "builder", "", "appendWidget", "(Lz00/e;)V", "Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO;", "statusWidgetJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "separatorWidgetJsonAdapter", "Lkotlin/text/Regex;", "tagRegex", "Lkotlin/text/Regex;", "", "getImageName", "()Ljava/lang/String;", "imageName", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeStatusWidgetFactory {

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final JsonAdapter<SeparatorDTO> separatorWidgetJsonAdapter;

    @NotNull
    private final JsonAdapter<StatusWidgetDTO> statusWidgetJsonAdapter;

    @NotNull
    private final Regex tagRegex;

    @NotNull
    private final TeensModeStorage teensModeStorage;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/BarcodeStatusWidgetFactory$Companion;", "", "<init>", "()V", "IMAGE_NAME", "", "IMAGE_SELECT_NAME", "IMAGE_WIDTH", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BarcodeStatusWidgetFactory(@NotNull AppVersionService appVersionService, @NotNull TeensModeStorage teensModeStorage, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.appVersionService = appVersionService;
        this.teensModeStorage = teensModeStorage;
        this.statusWidgetJsonAdapter = moshi.c(StatusWidgetDTO.class);
        this.separatorWidgetJsonAdapter = moshi.c(SeparatorDTO.class);
        this.tagRegex = new Regex("<.*?>");
    }

    private final ImageDTO createImage() {
        return new ImageDTO(getImageName(), null, null, false, null, null, null, null, null, null, null, null, 168, null, null, null, 61438, null);
    }

    private final TextDTO createMessage() {
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(this.teensModeStorage.isTeensModeEnabled() ? R$string.empty_screen_connection_error_message_teens_android : R$string.empty_screen_connection_error_message));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token = UniTextStyles.BODY_500_MEDIUM.getToken();
        String token2 = UniColors.TEXT_SECONDARY.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_300, layoutPadding, textPreset, token, token2, null, null, null, null, false, null, null, null, null, 0, 261632, null);
    }

    private final ButtonV3DTO createRefreshButton() {
        String string = StringProvider.getString(R$string.empty_screen_action);
        return new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, ButtonV3DTO.Sizes.SIZE_500, string, null, null, null, null, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH, null, null, null, 14, null), null, null, 6, null), null, null, null, null, 253944, null);
    }

    private final TextDTO createTitle() {
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.empty_screen_title));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token = UniTextStyles.HEADLINE_600_LARGE.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_300, null, textPreset, token, null, null, null, null, null, false, null, null, null, null, 0, 261920, null);
    }

    private final String getImageName() {
        return AppVersionService.INSTANCE.isSelect(this.appVersionService) ? "ic_wifi_off_m_select" : "ic_wifi_off";
    }

    public final void appendWidget(@NotNull e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        List a02 = C7714v.a0(createRefreshButton());
        TextDTO createTitle = createTitle();
        TextDTO createMessage = createMessage();
        ImageDTO createImage = createImage();
        StatusWidgetDTO.StatusWidgetSize statusWidgetSize = StatusWidgetDTO.StatusWidgetSize.WRAP;
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        builder.a(1L, "common", "statusWidget", h.X(this.tagRegex.replace(this.statusWidgetJsonAdapter.toJson(new StatusWidgetDTO(a02, createImage, createTitle, createMessage, statusWidgetSize, uniColors.getToken(), StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_HORIZONTAL)), ""), "\\n\"", "\"", false));
        builder.a(1L, "cms", "separator", h.X(this.tagRegex.replace(this.separatorWidgetJsonAdapter.toJson(new SeparatorDTO(null, 8, uniColors.getToken())), ""), "\\n\"", "\"", false));
    }
}
