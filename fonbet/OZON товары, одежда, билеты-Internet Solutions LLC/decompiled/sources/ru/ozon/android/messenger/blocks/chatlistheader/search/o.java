package ru.ozon.android.messenger.blocks.chatlistheader.search;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84824b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f84825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(Function0<Unit> function0, ButtonV3DTO buttonV3DTO) {
        super(3);
        this.f84824b = function0;
        this.f84825c = buttonV3DTO;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        H AnimatedVisibility = h11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        e.a aVar = androidx.compose.ui.e.f40358c0;
        interfaceC3967k2.o(-376530665);
        Function0<Unit> function0 = this.f84824b;
        boolean n11 = interfaceC3967k2.n(function0);
        Object C11 = interfaceC3967k2.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new n(function0);
            interfaceC3967k2.x(C11);
        }
        interfaceC3967k2.k();
        DsButtonAtomKt.DsButtonAtom(this.f84825c, androidx.compose.foundation.i.c(aVar, false, null, null, (Function0) C11, 7), false, null, interfaceC3967k2, 0, 12);
        return Unit.f71690a;
    }
}
