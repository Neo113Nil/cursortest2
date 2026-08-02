package ru.ozon.android.messenger.blocks.chatlistheader.search;

import J0.T0;
import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.foundation.layout.a0;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import q1.AbstractC8972b;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
final class z extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84874b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f84875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(Context context, Function0 function0) {
        super(3);
        this.f84874b = function0;
        this.f84875c = context;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        long graphicTertiary;
        H AnimatedVisibility = h11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        androidx.compose.ui.e n11 = a0.n(androidx.compose.ui.e.f40358c0, 24);
        interfaceC3967k2.o(2079693393);
        Function0<Unit> function0 = this.f84874b;
        boolean n12 = interfaceC3967k2.n(function0);
        Object C11 = interfaceC3967k2.C();
        if (n12 || C11 == InterfaceC3967k.a.a()) {
            C11 = new y(function0);
            interfaceC3967k2.x(C11);
        }
        interfaceC3967k2.k();
        androidx.compose.ui.e c11 = androidx.compose.foundation.i.c(n11, false, null, null, (Function0) C11, 7);
        AbstractC8972b a11 = G1.e.a(R$drawable.ic_m_disclosure_back_filled, interfaceC3967k2, 0);
        if (ru.ozon.android.messenger.utils.h.b(this.f84875c)) {
            interfaceC3967k2.o(46216075);
            graphicTertiary = UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getGraphicTertiaryOnDark();
            interfaceC3967k2.k();
        } else {
            interfaceC3967k2.o(46306161);
            graphicTertiary = UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getGraphicTertiary();
            interfaceC3967k2.k();
        }
        T0.a(a11, null, c11, graphicTertiary, interfaceC3967k2, 48);
        ru.ozon.android.messenger.framework.presentation.common.utils.a.b(10, interfaceC3967k2);
        return Unit.f71690a;
    }
}
