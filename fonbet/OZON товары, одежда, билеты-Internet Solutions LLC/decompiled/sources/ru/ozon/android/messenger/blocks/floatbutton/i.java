package ru.ozon.android.messenger.blocks.floatbutton;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextDTO f85226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(TextDTO textDTO) {
        super(3);
        this.f85226b = textDTO;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        H AnimatedVisibility = h11;
        num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        float f7 = 10;
        DsTextAtomKt.DsTextAtom(this.f85226b, T.j(androidx.compose.ui.e.f40358c0, 0.0f, f7, 16, f7, 1), interfaceC3967k, 0, 0);
        return Unit.f71690a;
    }
}
