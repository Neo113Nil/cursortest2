package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.viewItem.ConfirmDateButtonVO;
import ru.ozon.uni.atoms.data.AtomType;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/ConfirmButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/viewItem/ConfirmDateButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;J)Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/viewItem/ConfirmDateButtonVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmButtonMapper implements Function2<ButtonV3DTO, d, List<? extends ConfirmDateButtonVO>> {
    private final ConfirmDateButtonVO toVO(ButtonV3DTO buttonV3DTO, long j11) {
        return new ConfirmDateButtonVO(j11, buttonV3DTO);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ConfirmDateButtonVO> invoke(@NotNull ButtonV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        AtomType type = state.getType();
        return C7714v.a0(toVO(state, (d11 + "_" + type).hashCode()));
    }
}
