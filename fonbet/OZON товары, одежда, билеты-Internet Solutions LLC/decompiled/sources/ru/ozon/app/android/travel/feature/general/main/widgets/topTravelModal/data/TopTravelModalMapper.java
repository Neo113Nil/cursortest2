package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.data;

import WZ.t;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.data.TopTravelModalDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalVO;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/data/TopTravelModalMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/data/TopTravelModalDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "items", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "mapItems", "(Ljava/util/List;)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/data/TopTravelModalDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopTravelModalMapper implements Function2<TopTravelModalDTO, d, List<? extends TopTravelModalVO>> {

    @NotNull
    private final Context context;

    public TopTravelModalMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final List<TopTravelModalVO.TopTravelItem> mapItems(List<? extends Object> items) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            TopTravelModalVO.TopTravelItem topTravelItem = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (obj instanceof ButtonV3DTO) {
                topTravelItem = new TopTravelModalVO.Button(i11, (ButtonV3DTO) obj);
            } else if (obj instanceof BadgeDTO) {
                topTravelItem = new TopTravelModalVO.Badge(i11, (BadgeDTO) obj);
            } else if (obj instanceof TextDTO) {
                topTravelItem = new TopTravelModalVO.Text(i11, (TextDTO) obj);
            } else if (obj instanceof CellDTO) {
                CellDTO cellDTO = (CellDTO) obj;
                cellDTO.setTagSupported(true);
                Unit unit = Unit.f71690a;
                topTravelItem = new TopTravelModalVO.Cell(i11, DsCellExtensionsKt.disableAutoToggle(cellDTO));
            } else if (obj instanceof TopTravelModalDTO.ItemSpacerDTO) {
                topTravelItem = new TopTravelModalVO.ItemSpacer(i11, UiExtKt.toPx(((TopTravelModalDTO.ItemSpacerDTO) obj).getHeight(), this.context));
            }
            if (topTravelItem != null) {
                arrayList.add(topTravelItem);
            }
            i11 = i12;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TopTravelModalVO> invoke(@NotNull TopTravelModalDTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ImageDTO topImage = state.getTopImage();
        List<TopTravelModalVO.TopTravelItem> mapItems = mapItems(state.getItems());
        IconButtonV3DTO closeButton = state.getCloseButton();
        String backgroundImage = state.getBackgroundImage();
        String backgroundColor = state.getBackgroundColor();
        CommonControlSettings common = state.getCommon();
        t tVar = null;
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getCommon().getTrackingInfo());
        CommonControlSettings common2 = state.getCommon();
        if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        }
        return C7714v.a0(new TopTravelModalVO(hashCode, topImage, mapItems, closeButton, backgroundImage, backgroundColor, atomAction, tVar));
    }
}
