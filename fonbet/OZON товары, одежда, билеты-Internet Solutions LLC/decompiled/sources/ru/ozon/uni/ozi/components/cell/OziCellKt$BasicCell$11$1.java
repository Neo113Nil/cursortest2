package ru.ozon.uni.ozi.components.cell;

import B1.U;
import androidx.compose.ui.layout.a;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.ozi.components.cell.addons.OziCellScope;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LB1/U;", "measurables", "Le1/b$c;", "invoke", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziCellKt$BasicCell$11$1 extends AbstractC7737t implements Function1<List<? extends List<? extends U>>, List<? extends InterfaceC6250b.c>> {
    public static final OziCellKt$BasicCell$11$1 INSTANCE = new OziCellKt$BasicCell$11$1();

    OziCellKt$BasicCell$11$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<InterfaceC6250b.c> invoke(List<? extends List<? extends U>> measurables) {
        InterfaceC6250b.c i11;
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i12 = 0; i12 < size; i12++) {
            U u11 = (U) C7714v.M(measurables.get(i12));
            Object a11 = u11 != null ? a.a(u11) : null;
            OziCellScope.AddonLayoutId addonLayoutId = a11 instanceof OziCellScope.AddonLayoutId ? (OziCellScope.AddonLayoutId) a11 : null;
            if (addonLayoutId == null || (i11 = addonLayoutId.getAlignment()) == null) {
                i11 = InterfaceC6250b.a.i();
            }
            arrayList.add(i11);
        }
        return arrayList;
    }
}
