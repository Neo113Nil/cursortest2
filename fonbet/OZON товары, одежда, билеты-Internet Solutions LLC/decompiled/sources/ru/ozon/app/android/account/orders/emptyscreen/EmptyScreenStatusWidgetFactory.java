package ru.ozon.app.android.account.orders.emptyscreen;

import Nk.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.net.URLEncoder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import z00.e;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 52\u00020\u0001:\u00015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u001b*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010\"\u001a\u00020\u001b*\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenStatusWidgetFactory;", "", "Lru/ozon/app/android/utils/AppType;", "appType", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/utils/AppType;Lcom/squareup/moshi/Moshi;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "createRefreshButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "createErrorSummaryButton", "", "incidentId", "createAntibotSupportButton", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "createTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "traceId", "createMessage", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/text/TextDTO;", "createAntibotTitle", "createAntibotMessage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "createImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getMessageWithIncident", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getCopyTextDeeplink", "(Ljava/lang/String;)Ljava/lang/String;", "createSupportLink", "", "toOzonSpannableStringWithClickableIncident", "(Ljava/lang/CharSequence;Ljava/lang/String;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lz00/e;", "builder", "", "appendWidget", "(Lz00/e;Ljava/lang/String;)V", "appendAntibotDefaultPageWidget", "Lru/ozon/app/android/utils/AppType;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO;", "statusWidgetJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/text/Regex;", "tagRegex", "Lkotlin/text/Regex;", "getImageName", "()Ljava/lang/String;", "imageName", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmptyScreenStatusWidgetFactory {

    @NotNull
    private final AppType appType;

    @NotNull
    private final JsonAdapter<StatusWidgetDTO> statusWidgetJsonAdapter;

    @NotNull
    private final Regex tagRegex;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/EmptyScreenStatusWidgetFactory$Companion;", "", "<init>", "()V", "ERROR_SUMMARY_PAGE_DEEPLINK", "", "COPY_TEXT_PATH", "COPY_TEXT_PAGE_DEEPLINK", "SELECT_COPY_TEXT_PAGE_DEEPLINK", "IMAGE_NAME", "IMAGE_SELECT_NAME", "URL_ENCODE", "ANTIBOT_SUPPORT_URL", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public EmptyScreenStatusWidgetFactory(@NotNull AppType appType, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.appType = appType;
        this.statusWidgetJsonAdapter = moshi.c(StatusWidgetDTO.class);
        this.tagRegex = new Regex("<(?!/?a\\b)[^>]+>");
    }

    private final TextDTO createAntibotMessage(String incidentId) {
        OzonSpannableString ozonSpannableStringWithClickableIncident = toOzonSpannableStringWithClickableIncident(StringProvider.getString(R$string.error_connection_troubleshooting, incidentId), incidentId);
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PARAGRAPH;
        String token = UniColors.TEXT_SECONDARY.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return new TextDTO(ozonSpannableStringWithClickableIncident, textAlignment, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_300, layoutPadding, textPreset, null, token, null, null, null, null, true, null, null, null, null, 0, 253568, null);
    }

    private final ButtonV3DTO createAntibotSupportButton(String incidentId) {
        String string = StringProvider.getString(ru.ozon.app.android.uikit.R$string.error_antibot_support_button_android);
        return new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_SECONDARY, ButtonV3DTO.Sizes.SIZE_600, string, null, null, null, null, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, createSupportLink(incidentId), null, null, 12, null), null, null, 6, null), null, null, null, null, 253944, null);
    }

    private final TextDTO createAntibotTitle() {
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(ru.ozon.app.android.uikit.R$string.error_antibot_title_android));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token = UniTextStyles.HEADLINE_700_X_LARGE.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_300;
        return new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, textPreset, token, null, null, null, null, null, false, null, null, null, null, 0, 261888, null);
    }

    private final ButtonV3DTO createErrorSummaryButton() {
        String string = StringProvider.getString(R$string.error_connection_error_details);
        return new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_SECONDARY, ButtonV3DTO.Sizes.SIZE_600, string, null, null, null, null, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, "ozontech://debug/errorsummary", null, null, 12, null), null, null, 6, null), null, null, null, null, 253944, null);
    }

    private final ImageDTO createImage() {
        return new ImageDTO(getImageName(), null, null, false, null, null, null, null, null, null, null, null, 168, null, null, null, 61438, null);
    }

    private final TextDTO createMessage(String traceId) {
        OzonSpannableString messageWithIncident = getMessageWithIncident(StringProvider.getString(R$string.error_connection_retry_hint), traceId);
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PARAGRAPH;
        String token = UniColors.TEXT_SECONDARY.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return new TextDTO(messageWithIncident, textAlignment, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_300, layoutPadding, textPreset, null, token, null, null, null, null, true, null, null, null, null, 0, 253568, null);
    }

    private final ButtonV3DTO createRefreshButton() {
        return new ButtonV3DTO(null, ButtonV3DTO.Sizes.SIZE_600, StringProvider.getString(ru.ozon.app.android.cs_orders.R$string.empty_screen_action), null, null, null, null, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH, null, null, null, 14, null), null, null, 6, null), null, null, null, null, 253945, null);
    }

    private final String createSupportLink(String incidentId) {
        String uri = LinkGenerator.webView$default(LinkGenerator.INSTANCE, a.b("https://www.ozon.ru/complaint/support?incident_id=", incidentId), null, false, false, 14, null).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final TextDTO createTitle() {
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.error_connection_title));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token = UniTextStyles.HEADLINE_700_X_LARGE.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_300;
        return new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, textPreset, token, null, null, null, null, null, false, null, null, null, null, 0, 261888, null);
    }

    private final String getCopyTextDeeplink(String incidentId) {
        String str = (this.appType == AppType.SELECT ? "ozonselect://csma/copyText" : "ozon://csma/copyText") + "?clipboardText=" + incidentId + "&restrictionMessage=" + URLEncoder.encode(StringProvider.getString(R$string.incident_number_copied_to_clipboard), "UTF-8");
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    private final String getImageName() {
        return this.appType == AppType.SELECT ? "ic_server_error_m_select" : "ic_cone";
    }

    private final OzonSpannableString getMessageWithIncident(String str, String str2) {
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("\n");
            sb2.append(str2);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            OzonSpannableString ozonSpannableStringWithClickableIncident = toOzonSpannableStringWithClickableIncident(sb2, str2);
            if (ozonSpannableStringWithClickableIncident != null) {
                return ozonSpannableStringWithClickableIncident;
            }
        }
        return OzonSpannableStringKt.toOzonSpannableString(str);
    }

    private final OzonSpannableString toOzonSpannableStringWithClickableIncident(CharSequence charSequence, String str) {
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(charSequence);
        ozonSpannableString.setSpan(new OzonUrlSpan(getCopyTextDeeplink(str), null, false, 6, null), ozonSpannableString.length() - str.length(), ozonSpannableString.length(), 33);
        return ozonSpannableString;
    }

    public final void appendAntibotDefaultPageWidget(@NotNull e builder, String incidentId) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ButtonV3DTO[] elements = {createRefreshButton(), incidentId != null ? createAntibotSupportButton(incidentId) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList B11 = C7705l.B(elements);
        TextDTO createAntibotTitle = createAntibotTitle();
        if (incidentId == null) {
            incidentId = "";
        }
        builder.a(1L, "common", "statusWidget", h.X(this.tagRegex.replace(this.statusWidgetJsonAdapter.toJson(new StatusWidgetDTO(B11, createImage(), createAntibotTitle, createAntibotMessage(incidentId), StatusWidgetDTO.StatusWidgetSize.FULLSCREEN, UniColors.LAYER_FLOOR_1.getToken(), StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_VERTICAL)), ""), "\\n\"", "\"", false));
    }

    public final void appendWidget(@NotNull e builder, String traceId) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ButtonV3DTO createRefreshButton = createRefreshButton();
        ButtonV3DTO createErrorSummaryButton = createErrorSummaryButton();
        if (!BuildUtils.INSTANCE.isQaFlavor()) {
            createErrorSummaryButton = null;
        }
        ButtonV3DTO[] elements = {createRefreshButton, createErrorSummaryButton};
        Intrinsics.checkNotNullParameter(elements, "elements");
        builder.a(1L, "common", "statusWidget", h.X(this.tagRegex.replace(this.statusWidgetJsonAdapter.toJson(new StatusWidgetDTO(C7705l.B(elements), createImage(), createTitle(), createMessage(traceId), StatusWidgetDTO.StatusWidgetSize.FULLSCREEN, UniColors.LAYER_FLOOR_1.getToken(), StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_VERTICAL)), ""), "\\n\"", "\"", false));
    }
}
