package ru.ozon.app.android.pdp.offline.widgetfactory;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.pdp.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import z00.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/offline/widgetfactory/PdpStatusWidgetFactory;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "createTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "createMessage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "createImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lz00/e;", "builder", "", "appendWidget", "(Lz00/e;)V", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO;", "statusWidgetJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "islandSeparatorJsonAdapter", "Lkotlin/text/Regex;", "tagRegex", "Lkotlin/text/Regex;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpStatusWidgetFactory {

    @NotNull
    private final JsonAdapter<IslandSeparatorDTO> islandSeparatorJsonAdapter;

    @NotNull
    private final JsonAdapter<StatusWidgetDTO> statusWidgetJsonAdapter;

    @NotNull
    private final Regex tagRegex;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/offline/widgetfactory/PdpStatusWidgetFactory$Companion;", "", "<init>", "()V", "IMAGE_NAME", "", "IMAGE_WIDTH", "", "SEPARATOR_HEIGHT", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PdpStatusWidgetFactory(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.statusWidgetJsonAdapter = moshi.c(StatusWidgetDTO.class);
        this.islandSeparatorJsonAdapter = moshi.c(IslandSeparatorDTO.class);
        this.tagRegex = new Regex("<.*?>");
    }

    private final ImageDTO createImage() {
        return new ImageDTO("ic_wifi_off", null, null, false, null, null, CommonCellSettings.LayoutPadding.PADDING_750, null, null, null, null, null, 100, null, ImageDTO.FitType.FIT_CENTER, null, 44990, null);
    }

    private final TextDTO createMessage() {
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.pdp_empty_screen_message_android));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token = UniTextStyles.BODY_500_MEDIUM.getToken();
        String token2 = UniColors.TEXT_SECONDARY.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_350, CommonCellSettings.LayoutPadding.PADDING_750, textPreset, token, token2, null, null, null, null, false, null, null, null, null, 0, 261632, null);
    }

    private final TextDTO createTitle() {
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.empty_screen_title_android));
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token = UniTextStyles.HEADLINE_500_MEDIUM.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_300, null, textPreset, token, null, null, null, null, null, false, null, null, null, null, 0, 261920, null);
    }

    public final void appendWidget(@NotNull e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        builder.a(1L, "common", "islandSeparator", this.islandSeparatorJsonAdapter.toJson(new IslandSeparatorDTO(8, uniColors.getToken(), IslandSeparatorDTO.Configuration.WITHOUT_CORNERS, null, null, null)));
        UniColors uniColors2 = UniColors.LAYER_FLOOR_0;
        builder.a(1L, "common", "islandSeparator", this.islandSeparatorJsonAdapter.toJson(new IslandSeparatorDTO(8, uniColors2.getToken(), IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, null, null, null)));
        builder.a(1L, "common", "statusWidget", h.X(this.tagRegex.replace(this.statusWidgetJsonAdapter.toJson(new StatusWidgetDTO(null, createImage(), createTitle(), createMessage(), StatusWidgetDTO.StatusWidgetSize.WRAP, uniColors.getToken(), StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_HORIZONTAL)), ""), "\\n\"", "\"", false));
        builder.a(1L, "common", "islandSeparator", this.islandSeparatorJsonAdapter.toJson(new IslandSeparatorDTO(8, uniColors2.getToken(), IslandSeparatorDTO.Configuration.SECTION_END, null, null, null)));
    }
}
