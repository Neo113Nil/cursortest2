package ru.ozon.android.messenger.framework.presentation.ai;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9448v extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o> f89688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9448v(InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o> interfaceC3978p0) {
        super(1);
        this.f89688b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o oVar) {
        ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o it = oVar;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f89688b.setValue(it);
        return Unit.f71690a;
    }
}
