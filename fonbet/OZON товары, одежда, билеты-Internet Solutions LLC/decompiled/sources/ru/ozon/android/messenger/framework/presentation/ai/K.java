package ru.ozon.android.messenger.framework.presentation.ai;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class K extends AbstractC7737t implements Function1<B1.B, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c1.w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> f89277b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f89278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(c1.w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> wVar, String str) {
        super(1);
        this.f89277b = wVar;
        this.f89278c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(B1.B b11) {
        B1.B coords = b11;
        Intrinsics.checkNotNullParameter(coords, "coords");
        long u11 = coords.u(0L);
        this.f89277b.put(this.f89278c, new ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a(Z1.n.a((int) C7459e.g(u11), (int) C7459e.h(u11)), coords.a()));
        return Unit.f71690a;
    }
}
