package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormDTO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.mapper.DeliveryReviewComponentMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormFooterVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u00020\u0007B\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/footer/DeliveryReviewFormFooterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO;", "Ll20/d;", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormFooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/mapper/DeliveryReviewComponentMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO;Ll20/d;)Ljava/util/List;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryReviewFormFooterMapper extends DeliveryReviewComponentMapper implements Function2<DeliveryReviewFormDTO, d, List<? extends DeliveryReviewFormFooterVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryReviewFormFooterVO> invoke(@NotNull DeliveryReviewFormDTO state, @NotNull d widgetInfo) {
        List<ComponentVO> list;
        DeliveryReviewFormDTO.Form.Annotations annotations;
        DeliveryReviewFormDTO.Form.Annotations annotations2;
        DeliveryReviewFormDTO.Form.Annotations annotations3;
        List<DeliveryReviewFormDTO.Form.Component> components;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        DeliveryReviewFormDTO.Form form = state.getForm();
        DeliveryReviewFormDTO.Form.Group trailingGroup = form != null ? form.getTrailingGroup() : null;
        if (trailingGroup == null && state.getButton() == null) {
            return K.f71697a;
        }
        DeliveryReviewFormDTO.Form.Group group = trailingGroup;
        long hashCode = widgetInfo.d().hashCode();
        int id2 = group != null ? group.getId() : 0;
        if (group == null || (components = group.getComponents()) == null) {
            list = null;
        } else {
            Boolean disabled = state.getDisabled();
            list = toVO(components, disabled != null ? disabled.booleanValue() : false);
        }
        if (list == null) {
            list = K.f71697a;
        }
        DeliveryReviewFormDTO.Form form2 = state.getForm();
        DisclaimerAtom disclaimerAtom = (form2 == null || (annotations3 = form2.getAnnotations()) == null) ? null : annotations3.getDefault();
        DeliveryReviewFormDTO.Form form3 = state.getForm();
        DisclaimerAtom emptyError = (form3 == null || (annotations2 = form3.getAnnotations()) == null) ? null : annotations2.getEmptyError();
        DeliveryReviewFormDTO.Form form4 = state.getForm();
        DisclaimerAtom emptyWithCheckboxError = (form4 == null || (annotations = form4.getAnnotations()) == null) ? null : annotations.getEmptyWithCheckboxError();
        ButtonV3Atom.LargeButton button = state.getButton();
        Boolean required = group != null ? group.getRequired() : null;
        DeliveryReviewFormDTO.Form form5 = state.getForm();
        return C7714v.a0(new DeliveryReviewFormFooterVO(hashCode, id2, list, disclaimerAtom, emptyError, emptyWithCheckboxError, button, required, form5 != null ? Boolean.valueOf(form5.getRequired()) : null));
    }
}
