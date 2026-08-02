package ru.ozon.android.messenger.framework.presentation.search.composable;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.search.C9525e;
import ru.ozon.android.messenger.framework.presentation.search.L;

/* loaded from: classes10.dex */
final class u extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91702b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9525e f91703c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91704d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L f91705e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.blocks.chat.search.i, Unit> f91706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(androidx.compose.ui.e eVar, C9525e c9525e, ru.ozon.android.messenger.framework.core.d dVar, L l11, Function1 function1, int i11) {
        super(2);
        this.f91702b = eVar;
        this.f91703c = c9525e;
        this.f91704d = dVar;
        this.f91705e = l11;
        this.f91706f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(7);
        ru.ozon.android.messenger.framework.core.d dVar = this.f91704d;
        v.a(this.f91702b, this.f91703c, dVar, this.f91705e, this.f91706f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
