package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "ToothItem", "(Landroidx/compose/ui/e;LS0/k;I)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ToothItemKt {
    public static final void ToothItem(@NotNull e modifier, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e eVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(-1695402980);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            eVar = modifier;
        } else {
            int px = ResourceExtKt.toPx(4);
            u11.o(-1361476389);
            boolean r11 = u11.r(px);
            Object C11 = u11.C();
            if (r11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ToothItemKt$ToothItem$1$1(px);
                u11.x(C11);
            }
            u11.k();
            eVar = modifier;
            androidx.compose.ui.viewinterop.a.a((Function1) C11, eVar, null, u11, (i12 << 3) & 112, 4);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ToothItemKt$ToothItem$2(eVar, i11));
        }
    }
}
