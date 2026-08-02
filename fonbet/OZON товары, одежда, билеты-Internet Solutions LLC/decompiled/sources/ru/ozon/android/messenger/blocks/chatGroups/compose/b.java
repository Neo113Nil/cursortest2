package ru.ozon.android.messenger.blocks.chatGroups.compose;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.chatGroups.a f84670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(ru.ozon.android.messenger.blocks.chatGroups.a aVar) {
        super(3);
        this.f84670b = aVar;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        H AnimatedVisibility = h11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        DsIconAtomKt.DsIconAtom(this.f84670b.c(), androidx.compose.ui.e.f40358c0, interfaceC3967k2, IconDTO.$stable | 48, 0);
        ru.ozon.android.messenger.framework.presentation.common.utils.a.a(8, interfaceC3967k2);
        return Unit.f71690a;
    }
}
