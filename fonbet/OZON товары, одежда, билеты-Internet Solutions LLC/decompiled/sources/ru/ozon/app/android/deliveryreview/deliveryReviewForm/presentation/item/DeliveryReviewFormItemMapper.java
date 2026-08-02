package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormDTO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.mapper.DeliveryReviewComponentMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u00020\u0007B\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u0005*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO;", "Ll20/d;", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/mapper/DeliveryReviewComponentMapper;", "<init>", "()V", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Group;", "", "stateId", "", "disabled", "toVO", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Group;Ljava/lang/String;Z)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO;Ll20/d;)Ljava/util/List;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryReviewFormItemMapper extends DeliveryReviewComponentMapper implements Function2<DeliveryReviewFormDTO, d, List<? extends DeliveryReviewFormItemVO>> {
    private final DeliveryReviewFormItemVO toVO(DeliveryReviewFormDTO.Form.Group group, String str, boolean z11) {
        long hashCode = str.hashCode();
        int id2 = group.getId();
        String title = group.getTitle();
        List<DeliveryReviewFormDTO.Form.Component> components = group.getComponents();
        List<ComponentVO> vo = components != null ? toVO(components, z11) : null;
        if (vo == null) {
            vo = K.f71697a;
        }
        List<ComponentVO> list = vo;
        Boolean alwaysOpen = group.getAlwaysOpen();
        return new DeliveryReviewFormItemVO(hashCode, id2, title, list, alwaysOpen != null ? alwaysOpen.booleanValue() : false, Intrinsics.d(group.getAlwaysOpen(), Boolean.TRUE), group.getRequired(), false);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryReviewFormItemVO> invoke(@NotNull DeliveryReviewFormDTO state, @NotNull d widgetInfo) {
        List<DeliveryReviewFormDTO.Form.Group> groups;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        DeliveryReviewFormDTO.Form form = state.getForm();
        if (form == null || (groups = form.getGroups()) == null) {
            return K.f71697a;
        }
        List<DeliveryReviewFormDTO.Form.Group> list = groups;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (DeliveryReviewFormDTO.Form.Group group : list) {
            String d11 = widgetInfo.d();
            Boolean disabled = state.getDisabled();
            arrayList.add(toVO(group, d11, disabled != null ? disabled.booleanValue() : false));
        }
        return arrayList;
    }
}
