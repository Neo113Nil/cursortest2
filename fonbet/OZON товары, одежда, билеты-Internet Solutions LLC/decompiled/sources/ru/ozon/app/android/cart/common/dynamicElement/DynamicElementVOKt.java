package ru.ozon.app.android.cart.common.dynamicElement;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.badge.MultilineBadge;
import ru.ozon.app.android.atoms.data.badge.TimerBadge;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"hasAction", "", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO;", "getHasAction", "(Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO;)Z", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementVOKt {
    public static final boolean getHasAction(@NotNull DynamicElementVO dynamicElementVO) {
        Intrinsics.checkNotNullParameter(dynamicElementVO, "<this>");
        if (dynamicElementVO instanceof DynamicElementVO.Atom) {
            DynamicElementVO.Atom atom = (DynamicElementVO.Atom) dynamicElementVO;
            AtomDTO atom2 = atom.getAtom();
            return atom2 instanceof MultilineBadge ? ((MultilineBadge) atom.getAtom()).getAction() != null : atom2 instanceof TimerBadge ? ((TimerBadge) atom.getAtom()).getAction() != null : atom2 instanceof DisclaimerAtom ? ((DisclaimerAtom) atom.getAtom()).getButtons() != null : (atom2 instanceof CellAtom) && ((CellAtom) atom.getAtom()).getAction() != null;
        }
        if (dynamicElementVO instanceof DynamicElementVO.CellWithSubtitle24Icon) {
            return ((DynamicElementVO.CellWithSubtitle24Icon) dynamicElementVO).getCell().getAction() != null;
        }
        if (dynamicElementVO instanceof DynamicElementVO.ProgressiveText) {
            return ((DynamicElementVO.ProgressiveText) dynamicElementVO).getProgressiveText().getAction() != null;
        }
        if ((dynamicElementVO instanceof DynamicElementVO.Badges) || (dynamicElementVO instanceof DynamicElementVO.PriceList) || (dynamicElementVO instanceof DynamicElementVO.VerticalSpacer)) {
            return false;
        }
        throw new o();
    }
}
