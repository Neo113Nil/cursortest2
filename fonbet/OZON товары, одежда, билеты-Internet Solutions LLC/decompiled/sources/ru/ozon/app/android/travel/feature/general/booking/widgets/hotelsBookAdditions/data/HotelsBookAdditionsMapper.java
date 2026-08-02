package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.data;

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
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.data.HotelsBookAdditionsDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.mapper.CommonInputMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "", "fieldIndex", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsDTO$FieldDTO;", "fieldDTO", "", "uniqueString", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "mapField", "(JILru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsDTO$FieldDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO$FieldVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsDTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookAdditionsMapper implements Function2<HotelsBookAdditionsDTO, d, List<? extends HotelsBookAdditionsVO>> {
    private final HotelsBookAdditionsVO.FieldVO mapField(long widgetId, int fieldIndex, HotelsBookAdditionsDTO.FieldDTO fieldDTO, String uniqueString) {
        CommonInputVO vo = CommonInputMapperKt.toVO(fieldDTO.getInput(), Boolean.TRUE, Long.valueOf(widgetId), fieldIndex, uniqueString);
        if (vo == null) {
            return null;
        }
        if (vo instanceof CommonInputVO.Selector) {
            ((CommonInputVO.Selector) vo).setRightIcon(Integer.valueOf(R$drawable.ic_s_picker));
        }
        return new HotelsBookAdditionsVO.FieldVO(fieldIndex, vo, fieldDTO.getSubtext());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsBookAdditionsVO> invoke(@NotNull HotelsBookAdditionsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        ButtonV3Atom.SmallIconButton collapsedIconButton = state.getCollapsedIconButton();
        ButtonV3Atom.SmallIconButton expandedIconButton = state.getExpandedIconButton();
        boolean isOpen = state.isOpen();
        List<HotelsBookAdditionsDTO.FieldDTO> fields = state.getFields();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = fields.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new HotelsBookAdditionsVO(hashCode, title, subtitle, collapsedIconButton, expandedIconButton, isOpen, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String obj = state.getTitle().getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            HotelsBookAdditionsVO.FieldVO mapField = mapField(hashCode, i11, (HotelsBookAdditionsDTO.FieldDTO) next, obj);
            if (mapField != null) {
                arrayList.add(mapField);
            }
            i11 = i12;
        }
    }
}
