package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend.MobileLegendBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.LegendVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/LegendMapper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "map", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/LegendVO;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;", "mapSeatType", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/LegendVO$SeatTypeVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO$SeatTypeDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LegendMapper {

    @NotNull
    private final Context context;

    public LegendMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final LegendVO.SeatTypeVO mapSeatType(MobileLegendBlockDTO.SeatTypeDTO item) {
        return new LegendVO.SeatTypeVO(StyleParser.INSTANCE.parseColor(this.context, item.getColor()), item.getTypeDescription());
    }

    public final LegendVO map(MobileLegendBlockDTO item) {
        if (item == null) {
            return null;
        }
        TextAtom title = item.getTitle();
        Badge badge = item.getBadge();
        String image = item.getSelectionIcon().getImage();
        Integer parseColor = StyleParser.INSTANCE.parseColor(this.context, item.getSelectionIcon().getTintColor());
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(item.getOpenLegendDetailsAction(), null);
        List<MobileLegendBlockDTO.SeatTypeDTO> seatTypes = item.getSeatTypes();
        ArrayList arrayList = new ArrayList(C7714v.z(seatTypes, 10));
        Iterator<T> it = seatTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(mapSeatType((MobileLegendBlockDTO.SeatTypeDTO) it.next()));
        }
        return new LegendVO("MobileLegendBlock", title, badge, image, parseColor, atomAction, arrayList);
    }
}
