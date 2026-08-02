package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.data;

import WZ.t;
import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.data.DirectFlightsDropdownDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\r\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\r\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ItemDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;", "toVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ItemDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$PriceDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$PriceVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$PriceDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$PriceVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ExpandCollapseButtonDTO;", "", "widgetId", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO$ExpandCollapseButtonDTO;J)Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/data/DirectFlightsDropdownDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownMapper implements Function2<DirectFlightsDropdownDTO, d, List<? extends DirectFlightsDropdownVO>> {

    @NotNull
    private final Context context;

    public DirectFlightsDropdownMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final DirectFlightsDropdownVO.ItemVO toVO(DirectFlightsDropdownDTO.ItemDTO itemDTO) {
        return new DirectFlightsDropdownVO.ItemVO(Objects.hash(itemDTO.getHeader().getAviaIcon(), itemDTO.getHeader().getTitle()), itemDTO.getHeader().getAviaIcon(), itemDTO.getHeader().getTitle(), toVO(itemDTO.getHeader().getPrice()), itemDTO.getTextItems(), itemDTO.getCommon());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DirectFlightsDropdownVO> invoke(@NotNull DirectFlightsDropdownDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        int initialVisibleItemsCount = state.getInitialVisibleItemsCount();
        List<DirectFlightsDropdownDTO.ItemDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((DirectFlightsDropdownDTO.ItemDTO) it.next()));
        }
        TravelWidgetSettingsVO vo = MapperExtKt.toVO(state.getSettings(), this.context);
        DirectFlightsDropdownDTO.ExpandCollapseButtonDTO expandCollapseButton = state.getExpandCollapseButton();
        DirectFlightsDropdownVO.ExpandCollapseButtonVO vo2 = expandCollapseButton != null ? toVO(expandCollapseButton, hashCode) : null;
        Map<String, TokenizedTrackingInfo> viewTracking = state.getViewTracking();
        return C7714v.a0(new DirectFlightsDropdownVO(hashCode, title, initialVisibleItemsCount, arrayList, null, vo, vo2, viewTracking != null ? x.b(viewTracking, Long.valueOf(hashCode), null) : null, 16, null));
    }

    private final DirectFlightsDropdownVO.PriceVO toVO(DirectFlightsDropdownDTO.PriceDTO priceDTO) {
        return new DirectFlightsDropdownVO.PriceVO(priceDTO.getLabel(), priceDTO.getIcon());
    }

    private final DirectFlightsDropdownVO.ExpandCollapseButtonVO toVO(DirectFlightsDropdownDTO.ExpandCollapseButtonDTO expandCollapseButtonDTO, long j11) {
        TextDTO collapsedLabel = expandCollapseButtonDTO.getCollapsedLabel();
        TextDTO expandedLabel = expandCollapseButtonDTO.getExpandedLabel();
        IconDTO icon = expandCollapseButtonDTO.getIcon();
        Map<String, TokenizedTrackingInfo> clickExpandTracking = expandCollapseButtonDTO.getClickExpandTracking();
        t b11 = clickExpandTracking != null ? x.b(clickExpandTracking, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> clickCollapseTracking = expandCollapseButtonDTO.getClickCollapseTracking();
        return new DirectFlightsDropdownVO.ExpandCollapseButtonVO(collapsedLabel, expandedLabel, icon, b11, clickCollapseTracking != null ? x.b(clickCollapseTracking, Long.valueOf(j11), null) : null, false, 32, null);
    }
}
