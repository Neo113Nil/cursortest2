package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import D1.InterfaceC2801g;
import J0.P;
import Nk.a;
import S0.A0;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellTestTags;
import ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt;
import y20.C10833a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuCellCenterScope$TextBlock$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $isReversed;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ int $subtitleMaxLines;
    final /* synthetic */ String $title;
    final /* synthetic */ int $titleMaxLines;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugMenuCellCenterScope$TextBlock$1(boolean z11, String str, int i11, String str2, int i12) {
        super(2);
        this.$isReversed = z11;
        this.$subtitle = str;
        this.$titleMaxLines = i11;
        this.$title = str2;
        this.$subtitleMaxLines = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        e eVar;
        boolean z11;
        String str;
        int i12;
        String str2;
        int i13;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e.a aVar = e.f40358c0;
        e a11 = b.a(aVar, DebugMenuCellTestTags.Title);
        e a12 = b.a(aVar, DebugMenuCellTestTags.Subtitle);
        C5179b.i n11 = C5179b.n(2);
        boolean z12 = this.$isReversed;
        String str3 = this.$subtitle;
        int i14 = this.$titleMaxLines;
        String str4 = this.$title;
        int i15 = this.$subtitleMaxLines;
        C5194q a13 = C5193p.a(n11, InterfaceC6250b.a.k(), interfaceC3967k, 6);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, aVar);
        InterfaceC2801g.f5440U.getClass();
        Function0 a14 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a14);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a13, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(c11, I11, interfaceC3967k, I11);
        }
        Ek.a.g(f7, interfaceC3967k, 1993084176);
        if (!z12 || str3 == null) {
            eVar = a12;
            z11 = z12;
            str = str3;
            i12 = i14;
            str2 = str4;
            i13 = i15;
        } else {
            i12 = i14;
            i13 = i15;
            str2 = str4;
            z11 = z12;
            TextKt.m1643Text4IGK_g(str3, a12, C10833a.a(interfaceC3967k).m(), 0L, null, null, null, 0L, null, null, 0L, 2, false, i12, 0, null, C10833a.b().b(), interfaceC3967k, 0, 1572912, 55288);
            str = str3;
            eVar = a12;
        }
        interfaceC3967k.k();
        TextKt.m1643Text4IGK_g(str2, a11, C10833a.a(interfaceC3967k).l(), 0L, null, null, null, 0L, null, null, 0L, 2, false, i12, 0, null, C10833a.b().d(), interfaceC3967k, 0, 1572912, 55288);
        interfaceC3967k.o(1993108116);
        if (!z11 && str != null) {
            String str5 = str;
            TextKt.m1643Text4IGK_g(str5, eVar, C10833a.a(interfaceC3967k).m(), 0L, null, null, null, 0L, null, null, 0L, 2, false, i13, 0, null, C10833a.b().b(), interfaceC3967k, 0, 1572912, 55288);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
    }
}
