package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.data.AviaComplexSearchFormDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Flight;", "item", "", "isLastItem", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "mapFlight", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Flight;Z)Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Field;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;", "mapField", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Field;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Field;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Content;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;", "mapContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO$Content;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Content;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaComplexSearchFormMapper implements Function2<AviaComplexSearchFormDTO, d, List<? extends AviaComplexSearchFormVO>> {

    @NotNull
    private final Context context;

    public AviaComplexSearchFormMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final AviaComplexSearchFormVO.Content mapContent(AviaComplexSearchFormDTO.Content item) {
        CommonControlSettings commonControlSettings = item.getCommonControlSettings();
        TextDTO title = item.getTitle();
        TextDTO subtitle = item.getSubtitle();
        AtomActionDTO action = commonControlSettings.getAction();
        return new AviaComplexSearchFormVO.Content(title, subtitle, action != null ? AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()) : null);
    }

    private final AviaComplexSearchFormVO.Field mapField(AviaComplexSearchFormDTO.Field item) {
        AviaComplexSearchFormVO.Content mapContent = mapContent(item.getLeftValue());
        AviaComplexSearchFormDTO.Content rightValue = item.getRightValue();
        return new AviaComplexSearchFormVO.Field(mapContent, rightValue != null ? mapContent(rightValue) : null, item.getIcon(), item.getErrorMessage(), item.getBorderColor(), item.getBackgroundColor(), ResourceExtKt.toPxF(item.getCornerRadius().getPx(), this.context));
    }

    private final AviaComplexSearchFormVO.Flight mapFlight(AviaComplexSearchFormDTO.Flight item, boolean isLastItem) {
        return new AviaComplexSearchFormVO.Flight(item.hashCode(), mapField(item.getDirection()), mapField(item.getDate()), item.getDeleteButton(), false, isLastItem, 16, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AviaComplexSearchFormVO> invoke(@NotNull AviaComplexSearchFormDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        int P11 = C7714v.P(state.getFlights());
        List<AviaComplexSearchFormDTO.Flight> flights = state.getFlights();
        ArrayList arrayList = new ArrayList(C7714v.z(flights, 10));
        Iterator<T> it = flights.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                ButtonV3DTO addFlight = state.getAddFlight();
                IconFieldVO vo = MapperExtKt.toVo(state.getPassenger());
                ButtonV3DTO submitButton = state.getSubmitButton();
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new AviaComplexSearchFormVO(hashCode, arrayList, addFlight, vo, submitButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, false, 64, null));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapFlight((AviaComplexSearchFormDTO.Flight) next, i11 == P11 && i11 > 0));
            i11 = i12;
        }
    }
}
