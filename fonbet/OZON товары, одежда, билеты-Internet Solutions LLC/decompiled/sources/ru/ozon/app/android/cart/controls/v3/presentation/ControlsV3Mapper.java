package ru.ozon.app.android.cart.controls.v3.presentation;

import T00.a;
import T00.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.controls.v3.data.ControlsV3DTO;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVO", "(Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO;Ll20/d;)Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$SelectAll;", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "(Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO$SelectAll;)Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "state", "invoke", "(Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO;Ll20/d;)Ljava/util/List;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControlsV3Mapper implements Function2<ControlsV3DTO, d, List<? extends ControlsV3VO>> {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (kotlin.text.h.e0(r15, "/cart", false) == true) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ControlsV3VO toVO(ControlsV3DTO controlsV3DTO, d dVar) {
        boolean z11;
        a b11;
        e h11;
        long hashCode = dVar.d().hashCode();
        ControlsV3DTO.SelectAll selectAll = controlsV3DTO.getSelectAll();
        ControlsV3VO.SelectAll vo = selectAll != null ? toVO(selectAll) : null;
        IconButtonV3DTO shareIconButton = controlsV3DTO.getShareIconButton();
        IconButtonV3DTO removeIconButton = controlsV3DTO.getRemoveIconButton();
        ControlsV3DTO.HorizontalMargins horizontalMargins = controlsV3DTO.getHorizontalMargins();
        int pxValue = horizontalMargins != null ? horizontalMargins.getPxValue() : 0;
        Boolean isRounded = controlsV3DTO.isRounded();
        boolean booleanValue = isRounded != null ? isRounded.booleanValue() : false;
        TextDTO productsTotal = controlsV3DTO.getProductsTotal();
        if (controlsV3DTO.getShareIconButton() == null && controlsV3DTO.getRemoveIconButton() == null && (b11 = dVar.b()) != null && (h11 = b11.h()) != null && (r15 = h11.j()) != null) {
            z11 = true;
        }
        z11 = false;
        return new ControlsV3VO(hashCode, vo, shareIconButton, removeIconButton, pxValue, booleanValue, productsTotal, z11, false, 256, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ControlsV3VO> invoke(@NotNull ControlsV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }

    private final ControlsV3VO.SelectAll toVO(ControlsV3DTO.SelectAll selectAll) {
        return new ControlsV3VO.SelectAll(selectAll.getName(), selectAll.isSelected(), AtomActionMapperKt.toAtomAction(selectAll.getAction(), selectAll.getTrackingInfo()), selectAll.getCheckbox());
    }
}
