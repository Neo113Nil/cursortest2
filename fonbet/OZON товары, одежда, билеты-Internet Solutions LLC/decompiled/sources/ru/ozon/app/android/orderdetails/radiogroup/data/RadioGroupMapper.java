package ru.ozon.app.android.orderdetails.radiogroup.data;

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
import ru.ozon.app.android.atoms.data.deprecated.RadioItem;
import ru.ozon.app.android.orderdetails.radiogroup.presentation.RadioGroupVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/radiogroup/data/RadioGroupMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/radiogroup/data/RadioGroupDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/radiogroup/presentation/RadioGroupVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/radiogroup/data/RadioButtonDTO;", "Lru/ozon/app/android/atoms/data/deprecated/RadioItem;", "toVO", "(Lru/ozon/app/android/orderdetails/radiogroup/data/RadioButtonDTO;)Lru/ozon/app/android/atoms/data/deprecated/RadioItem;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/radiogroup/data/RadioGroupDTO;Ll20/d;)Ljava/util/List;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RadioGroupMapper implements Function2<RadioGroupDTO, d, List<? extends RadioGroupVO>> {
    private static final long ID = 1210138312;

    private final RadioItem toVO(RadioButtonDTO radioButtonDTO) {
        Map map = null;
        TestInfo testInfo = null;
        return new RadioItem(OzonSpannableStringKt.toOzonSpannableString(radioButtonDTO.getText()), radioButtonDTO.isSelected(), false, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, radioButtonDTO.getDeeplink(), null, null, 12, null), null, map, testInfo, 84, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RadioGroupVO> invoke(@NotNull RadioGroupDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<RadioButtonDTO> radioButtons = state.getRadioButtons();
        ArrayList arrayList = new ArrayList(C7714v.z(radioButtons, 10));
        Iterator<T> it = radioButtons.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((RadioButtonDTO) it.next()));
        }
        return C7714v.a0(new RadioGroupVO(ID, arrayList));
    }
}
