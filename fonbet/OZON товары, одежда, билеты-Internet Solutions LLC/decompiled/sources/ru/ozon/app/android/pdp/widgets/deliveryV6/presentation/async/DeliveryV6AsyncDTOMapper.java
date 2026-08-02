package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async;

import Kk.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.sections.DeliveryV6SectionsMapperKt;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\tJ\"\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncDTOMapper;", "", "map", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO;", "deliveryDTO", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;", "stateId", "", "Default", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DeliveryV6AsyncDTOMapper {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncDTOMapper$Default;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncDTOMapper;", "<init>", "()V", "map", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO;", "deliveryDTO", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;", "stateId", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements DeliveryV6AsyncDTOMapper {
        @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncDTOMapper
        @NotNull
        public List<DeliveryV6VO<?>> map(@NotNull DeliveryDTO deliveryDTO, @NotNull String stateId) {
            Intrinsics.checkNotNullParameter(deliveryDTO, "deliveryDTO");
            Intrinsics.checkNotNullParameter(stateId, "stateId");
            ArrayList arrayList = new ArrayList();
            long a11 = c.a(stateId, "_DeliveryV6VO.Header.Title");
            String tabGroupId = deliveryDTO.getTabGroupId();
            TextAtom title = deliveryDTO.getTitle();
            arrayList.add(new DeliveryV6VO.Header.Title(a11, tabGroupId, title != null ? TextMapperKt.getDsTextAtom(title) : null));
            arrayList.add(new DeliveryV6VO.Header.Button(c.a(stateId, "_DeliveryV6VO.Header.Button"), deliveryDTO.getTabGroupId(), deliveryDTO.getButton()));
            arrayList.add(new DeliveryV6VO.Header.Annotation(c.a(stateId, "_DeliveryV6VO.Header.Annotation"), deliveryDTO.getTabGroupId(), deliveryDTO.getAnnotation()));
            arrayList.add(new DeliveryV6VO.Sections(c.a(stateId, "_DeliveryV6VO.Sections"), deliveryDTO.getTabGroupId(), DeliveryV6SectionsMapperKt.map(deliveryDTO.getSections(), stateId.hashCode(), deliveryDTO.getMoreInfoButton() != null), deliveryDTO.getTrackingInfo()));
            arrayList.add(new DeliveryV6VO.Footer(stateId.concat("_DeliveryV6VO.Footer").hashCode(), deliveryDTO.getTabGroupId(), deliveryDTO.getMoreInfoButton()));
            return arrayList;
        }
    }

    @NotNull
    List<DeliveryV6VO<?>> map(@NotNull DeliveryDTO deliveryDTO, @NotNull String stateId);
}
