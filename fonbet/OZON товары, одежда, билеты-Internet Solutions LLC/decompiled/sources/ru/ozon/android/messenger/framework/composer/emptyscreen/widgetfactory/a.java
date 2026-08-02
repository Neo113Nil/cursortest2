package ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.c;
import ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.MessengerNavBarDTO;
import ru.ozon.app.android.messenger.R$string;
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

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f86698a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MessengerNavBarDTO f86699b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapter<StatusWidgetDTO> f86700c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapter<MessengerNavBarDTO> f86701d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Regex f86702e;

    public a(@NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f86698a = context;
        this.f86699b = ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.data.a.a(context);
        this.f86700c = moshi.c(StatusWidgetDTO.class);
        this.f86701d = moshi.c(MessengerNavBarDTO.class);
        this.f86702e = new Regex("<.*?>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NotNull e builder, @NotNull c issue) {
        String str;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(issue, "issue");
        String json = this.f86701d.toJson(b());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        Regex regex = this.f86702e;
        builder.a(1L, "messenger", "navigationHeader", h.X(regex.replace(json, ""), "\\n\"", "\"", false));
        int i11 = R$string.messenger_action_update;
        Context context = this.f86698a;
        List a02 = C7714v.a0(new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, ButtonV3DTO.Sizes.SIZE_600, ru.ozon.android.messenger.utils.c.d(i11, context), null, null, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH, null, null, null, 14, null), null, null, 6, null), null, null, null, null, 253944, null));
        boolean z11 = issue instanceof c.d;
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(z11 ? ru.ozon.android.messenger.utils.c.d(R$string.messenger_error_smth_went_wrong_title, context) : issue instanceof c.a ? ru.ozon.android.messenger.utils.c.d(R$string.messenger_no_internet, context) : issue instanceof c.b ? ru.ozon.android.messenger.utils.c.d(R$string.messenger_data_not_loaded, context) : ru.ozon.android.messenger.utils.c.d(R$string.messenger_data_not_loaded, context));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        String token = UniColors.TEXT_PRIMARY.getToken();
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token2 = UniTextStyles.HEADLINE_500_MEDIUM.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        TextDTO textDTO = new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_300, null, textPreset, token2, token, null, null, null, null, false, null, null, null, null, 0, 261664, null);
        TextDTO textDTO2 = new TextDTO(OzonSpannableStringKt.toOzonSpannableString(z11 ? ru.ozon.android.messenger.utils.c.d(R$string.messenger_failed_to_load_fast_answers, context) : issue instanceof c.a ? ru.ozon.android.messenger.utils.c.d(R$string.messenger_check_connection, context) : issue instanceof c.b ? ru.ozon.android.messenger.utils.c.d(R$string.messenger_refresh_page_or_try_again_later, context) : ru.ozon.android.messenger.utils.c.d(R$string.messenger_refresh_page_or_try_again_later, context)), textAlignment, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_350, layoutPadding, textPreset, UniTextStyles.COMPACT_400_SMALL.getToken(), UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, false, null, null, null, null, 0, 261632, null);
        if (z11) {
            str = "https://cdn1.ozone.ru/s3/messenger-public/something_went_wrong.png";
        } else if (issue instanceof c.a) {
            str = V.e.b(new Object[]{((c.a) issue).a(), "m_wifi_off_m"}, 2, "android.resource://%1s/drawable/%2s", "format(...)");
        } else {
            boolean z12 = issue instanceof c.b;
            str = "https://cdn1.ozone.ru/s3/messenger-public/data_load_off.png";
        }
        String json2 = this.f86700c.toJson(new StatusWidgetDTO(a02, new ImageDTO(str, null, null, false, null, null, null, null, null, null, null, null, 104, null, null, null, 61438, null), textDTO, textDTO2, StatusWidgetDTO.StatusWidgetSize.FULLSCREEN, UniColors.BG_PRIMARY.getToken(), StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_VERTICAL));
        Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
        builder.a(1L, "common", "statusWidget", h.X(regex.replace(json2, ""), "\\n\"", "\"", false));
    }

    @NotNull
    protected MessengerNavBarDTO b() {
        return this.f86699b;
    }
}
