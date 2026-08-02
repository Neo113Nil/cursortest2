package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import B1.U;
import Z1.h;
import androidx.compose.ui.layout.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellScope;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LB1/U;", "it", "LZ1/h;", "invoke-yt-Azvs", "(LB1/U;)LZ1/h;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuCellKt$DebugMenuCell$14$1 extends AbstractC7737t implements Function1<U, h> {
    public static final DebugMenuCellKt$DebugMenuCell$14$1 INSTANCE = new DebugMenuCellKt$DebugMenuCell$14$1();

    DebugMenuCellKt$DebugMenuCell$14$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-yt-Azvs, reason: not valid java name and merged with bridge method [inline-methods] */
    public final h invoke(U it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object a11 = a.a(it);
        DebugMenuCellScope.AddonLayoutId addonLayoutId = a11 instanceof DebugMenuCellScope.AddonLayoutId ? (DebugMenuCellScope.AddonLayoutId) a11 : null;
        if (addonLayoutId != null) {
            return h.a(addonLayoutId.getMinWidth());
        }
        return null;
    }
}
