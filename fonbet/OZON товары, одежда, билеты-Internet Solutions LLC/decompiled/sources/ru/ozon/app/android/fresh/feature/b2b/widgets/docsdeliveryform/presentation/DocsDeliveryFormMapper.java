package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.data.DocsDeliveryFormDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$DeliveryVariantDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$DeliveryVariantVO;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$DeliveryVariantDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$DeliveryVariantVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$InputDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$InputDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsDeliveryFormMapper implements Function2<DocsDeliveryFormDTO, d, List<? extends DocsDeliveryFormVO>> {
    private final DocsDeliveryFormVO.DeliveryVariantVO toVO(DocsDeliveryFormDTO.DeliveryVariantDTO deliveryVariantDTO) {
        DisclaimerAtom annotation = deliveryVariantDTO.getAnnotation();
        String title = deliveryVariantDTO.getTitle();
        List<DocsDeliveryFormDTO.InputDTO> inputs = deliveryVariantDTO.getInputs();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = inputs.iterator();
        while (it.hasNext()) {
            DocsDeliveryFormVO.Input vo = toVO((DocsDeliveryFormDTO.InputDTO) it.next());
            if (vo != null) {
                arrayList.add(vo);
            }
        }
        return new DocsDeliveryFormVO.DeliveryVariantVO(title, annotation, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DocsDeliveryFormVO> invoke(@NotNull DocsDeliveryFormDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        DocsDeliveryFormDTO.DeliveryVariantDTO deliveryVariantDTO = (DocsDeliveryFormDTO.DeliveryVariantDTO) C7714v.M(state.getDeliveryVariants());
        if (deliveryVariantDTO != null) {
            long hashCode = widgetInfo.d().hashCode();
            TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(state.getTitle());
            TextDTO dsTextAtom2 = TextMapperKt.getDsTextAtom(state.getText());
            DocsDeliveryFormVO.Input vo = toVO(state.getAddressInput());
            Intrinsics.g(vo, "null cannot be cast to non-null type ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO.Input.TextInput");
            List<DocsDeliveryFormVO> a02 = C7714v.a0(new DocsDeliveryFormVO(hashCode, dsTextAtom, dsTextAtom2, (DocsDeliveryFormVO.Input.TextInput) vo, toVO(deliveryVariantDTO)));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }

    private final DocsDeliveryFormVO.Input toVO(DocsDeliveryFormDTO.InputDTO inputDTO) {
        if (Intrinsics.d(inputDTO.getType(), "checkbox")) {
            String name = inputDTO.getName();
            String label = inputDTO.getLabel();
            String str = label != null ? label : "";
            Boolean checked = inputDTO.getChecked();
            return new DocsDeliveryFormVO.Input.CheckBoxInput(name, str, checked != null ? checked.booleanValue() : false);
        }
        String name2 = inputDTO.getName();
        String placeholder = inputDTO.getPlaceholder();
        String str2 = placeholder == null ? "" : placeholder;
        Boolean required = inputDTO.getRequired();
        boolean booleanValue = required != null ? required.booleanValue() : false;
        String value = inputDTO.getValue();
        String mask = inputDTO.getMask();
        return new DocsDeliveryFormVO.Input.TextInput(name2, str2, booleanValue, value, mask != null ? h.Y(mask, '#', '_') : null, null, false, 96, null);
    }
}
