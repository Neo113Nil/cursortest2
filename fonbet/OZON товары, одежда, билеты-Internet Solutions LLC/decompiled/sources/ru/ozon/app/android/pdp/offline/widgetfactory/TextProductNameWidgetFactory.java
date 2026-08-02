package ru.ozon.app.android.pdp.offline.widgetfactory;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.pdp.offline.widgetfactory.core.WidgetFactory$Base;
import ru.ozon.app.android.ui.widgets.textWidget.data.TextWidgetDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import z00.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/offline/widgetfactory/TextProductNameWidgetFactory;", "Lru/ozon/app/android/pdp/offline/widgetfactory/core/WidgetFactory$Base;", "Lru/ozon/app/android/ui/widgets/textWidget/data/TextWidgetDTO;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lcom/squareup/moshi/Moshi;)V", "Lz00/e;", "builder", "", "appendWidget", "(Lz00/e;)V", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lkotlin/text/Regex;", "tagRegex", "Lkotlin/text/Regex;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextProductNameWidgetFactory extends WidgetFactory$Base<TextWidgetDTO> {

    @NotNull
    private final PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;

    @NotNull
    private final Regex tagRegex;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextProductNameWidgetFactory(@NotNull PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull Moshi moshi) {
        super(moshi, TextWidgetDTO.class);
        Intrinsics.checkNotNullParameter(pdpOfflineScreenWidgetsData, "pdpOfflineScreenWidgetsData");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.tagRegex = new Regex("<.*?>");
    }

    public void appendWidget(@NotNull e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        OzonSpannableString productName = this.pdpOfflineScreenWidgetsData.productName();
        if (productName != null) {
            JsonAdapter<TextWidgetDTO> adapter = getAdapter();
            CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            builder.a(1L, "common", "text", h.X(this.tagRegex.replace(adapter.toJson(new TextWidgetDTO(C7714v.a0(new ExpandableTextDTO(productName, layoutPadding, layoutPadding, TextPreset.UI_H2_COMPACT, null, false, 2, null, null, null, null, null, null, false, layoutPadding, CommonCellSettings.LayoutPadding.PADDING_350, "tsHeadline500Medium", null, 147376, null)), StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR, null, null, null, 28, null)), ""), "\\n\"", "\"", false));
        }
    }
}
