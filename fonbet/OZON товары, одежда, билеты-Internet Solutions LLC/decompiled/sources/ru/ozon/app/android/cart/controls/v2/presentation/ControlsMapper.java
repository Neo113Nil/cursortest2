package ru.ozon.app.android.cart.controls.v2.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.controls.v2.data.ControlsDTO;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/controls/v2/presentation/ControlsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO;Ljava/lang/String;)Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO;", "Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO$SelectAll;", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO$SelectAll;", "(Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO$SelectAll;)Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO$SelectAll;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO;Ll20/d;)Ljava/util/List;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControlsMapper implements Function2<ControlsDTO, d, List<? extends ControlsVO>> {
    private final ControlsVO toVO(ControlsDTO controlsDTO, String str) {
        return new ControlsVO(str.hashCode(), toVO(controlsDTO.getSelectAll()), controlsDTO.getActionButton());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ControlsVO> invoke(@NotNull ControlsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }

    private final ControlsVO.SelectAll toVO(ControlsDTO.SelectAll selectAll) {
        return new ControlsVO.SelectAll(selectAll.getName(), selectAll.isSelected(), AtomActionMapperKt.toAtomAction(selectAll.getAction(), selectAll.getTrackingInfo()), selectAll.getCheckbox());
    }
}
