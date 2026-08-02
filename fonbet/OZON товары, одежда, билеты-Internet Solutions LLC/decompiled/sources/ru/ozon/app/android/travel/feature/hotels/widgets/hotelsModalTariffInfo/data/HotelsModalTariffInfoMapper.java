package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data;

import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.data.HotelsModalTariffInfoDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.html.TravelHtmlParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "items", "", "enableHtmlTags", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "mapAtoms", "(Ljava/util/List;Z)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$HtmlBlock;", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$HtmlBlockWrapper;", "mapHtmlBlock", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$HtmlBlock;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$HtmlBlockWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$CellBlockDTO;", "mapCellBlocks", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO$CellBlockDTO;)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/data/HotelsModalTariffInfoDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsModalTariffInfoMapper implements Function2<HotelsModalTariffInfoDTO, d, List<? extends HotelsModalTariffInfoVI>> {

    @NotNull
    private final Context context;

    public HotelsModalTariffInfoMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final List<HotelsModalTariffInfoVI.AtomWrapperVI> mapAtoms(List<? extends Object> items, boolean enableHtmlTags) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof TextDTO) {
                TextDTO textDTO = (TextDTO) obj;
                textDTO.setTagSupported(enableHtmlTags);
                Unit unit = Unit.f71690a;
                arrayList.add(new HotelsModalTariffInfoVI.TextAtomWrapper("hotelsModalTariffInfoText", textDTO, 0, 0, 0, 28, null));
            } else if (obj instanceof HotelsModalTariffInfoDTO.CellBlockDTO) {
                arrayList.addAll(mapCellBlocks((HotelsModalTariffInfoDTO.CellBlockDTO) obj));
            } else if (obj instanceof HotelsModalTariffInfoDTO.Disclaimer) {
                HotelsModalTariffInfoDTO.Disclaimer disclaimer = (HotelsModalTariffInfoDTO.Disclaimer) obj;
                arrayList.add(new HotelsModalTariffInfoVI.DisclaimerAtomWrapper("hotelsModalTariffInfoDisclaimer", disclaimer.getDisclaimer(), MapperExtKt.toVO(disclaimer.getSettings(), this.context)));
            } else if (obj instanceof HotelsModalTariffInfoDTO.HtmlBlock) {
                arrayList.add(mapHtmlBlock((HotelsModalTariffInfoDTO.HtmlBlock) obj));
            }
        }
        return arrayList;
    }

    private final List<HotelsModalTariffInfoVI.AtomWrapperVI> mapCellBlocks(HotelsModalTariffInfoDTO.CellBlockDTO item) {
        int i11;
        HotelsModalTariffInfoDTO.ElementMargins margins = item.getMargins();
        int px = UiExtKt.toPx(margins.getLeading().getPx(), this.context);
        int px2 = UiExtKt.toPx(margins.getTop().getPx(), this.context);
        int px3 = UiExtKt.toPx(margins.getTrailing().getPx(), this.context);
        ArrayList arrayList = new ArrayList();
        if (item.getTitle() != null) {
            i11 = px2;
            arrayList.add(new HotelsModalTariffInfoVI.TextAtomWrapper("hotelsModalTariffInfoTitle", item.getTitle(), px2, px, px3));
        } else {
            i11 = px2;
        }
        if (item.getSubtitle() != null) {
            arrayList.add(new HotelsModalTariffInfoVI.TextAtomWrapper("hotelsModalTariffInfoSubtitle", item.getSubtitle(), item.getTitle() != null ? 0 : i11, px, px3));
        }
        int px4 = UiExtKt.toPx(margins.getBottom().getPx(), this.context);
        float pxF = ResourceExtKt.toPxF(item.getCornerRadius().getPx(), this.context);
        List<CellDTO> cells = item.getCells();
        int P11 = C7714v.P(cells);
        int i12 = 0;
        for (Object obj : cells) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            CellDTO cellDTO = (CellDTO) obj;
            boolean z11 = i12 == 0;
            boolean z12 = i12 == P11;
            cellDTO.setTagSupported(item.getEnableHtmlTags());
            Unit unit = Unit.f71690a;
            boolean z13 = z11;
            String backgroundColor = item.getBackgroundColor();
            int i14 = px;
            float f7 = z13 ? pxF : 0.0f;
            float f11 = z12 ? pxF : 0.0f;
            int i15 = px3;
            HotelsModalTariffInfoVI.CellAtomWrapper cellAtomWrapper = new HotelsModalTariffInfoVI.CellAtomWrapper("hotelsModalTariffInfoCell", cellDTO, backgroundColor, f7, f11, (item.getTitle() == null && item.getSubtitle() == null && z13) ? i11 : 0, i14, i15, z12 ? px4 : 0);
            px = i14;
            px3 = i15;
            arrayList.add(cellAtomWrapper);
            i12 = i13;
            P11 = P11;
        }
        return arrayList;
    }

    private final HotelsModalTariffInfoVI.HtmlBlockWrapper mapHtmlBlock(HotelsModalTariffInfoDTO.HtmlBlock item) {
        return new HotelsModalTariffInfoVI.HtmlBlockWrapper("hotelsModalTariffHtmlBlock", TravelHtmlParser.Companion.parseHtml$default(TravelHtmlParser.INSTANCE, item.getHtmlString(), 0, 2, null), MapperExtKt.toVO(item.getSettings(), this.context), item.getTypographyToken(), item.getTextColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsModalTariffInfoVI> invoke(@NotNull HotelsModalTariffInfoDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<HotelsModalTariffInfoVI.AtomWrapperVI> mapAtoms = mapAtoms(state.getElements(), state.getEnableHtmlTags());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new HotelsModalTariffInfoVI(hashCode, mapAtoms, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null));
    }
}
