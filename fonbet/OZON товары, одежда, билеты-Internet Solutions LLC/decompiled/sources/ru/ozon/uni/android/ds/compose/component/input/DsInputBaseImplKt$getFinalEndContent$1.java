package ru.ozon.uni.android.ds.compose.component.input;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
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
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsInputBaseImplKt$getFinalEndContent$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ DsInputBaseLocator $locators;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsInputBaseImplKt$getFinalEndContent$1(DsInputBaseLocator dsInputBaseLocator) {
        super(2);
        this.$locators = dsInputBaseLocator;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e.a aVar = e.f40358c0;
        e c11 = a0.c(aVar);
        DsInputBaseLocator dsInputBaseLocator = this.$locators;
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, c11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        C5187j c5187j = C5187j.f39515a;
        DsLoaderSize dsLoaderSize = DsLoaderSize.Size300;
        long graphicActionPrimary = UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicActionPrimary();
        e a12 = c5187j.a(AtomLocatorKt.testTag(aVar, dsInputBaseLocator.getLoader().invoke()), InterfaceC6250b.a.e());
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        DsLoaderKt.m1753DsLoader3IgeMak(T.j(a12, dsSpacings.m1854getDp4D9Ej5fM(), 0.0f, dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 10), graphicActionPrimary, dsLoaderSize, interfaceC3967k, 384, 0);
        interfaceC3967k.f();
    }
}
