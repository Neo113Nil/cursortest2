package ru.ozon.android.messenger.framework.presentation.ai;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* loaded from: classes10.dex */
final class J extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f89267b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f89268c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d.a.C1558a f89269d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89270e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.logger.b f89271f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ v0.I f89272g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c1.w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> f89273h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o, Unit> f89274i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f89275j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f89276k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(androidx.compose.ui.e eVar, ru.ozon.android.messenger.framework.presentation.models.q qVar, d.a.C1558a c1558a, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.logger.b bVar, v0.I i11, c1.w wVar, Function1 function1, Function0 function0, int i12) {
        super(2);
        this.f89267b = eVar;
        this.f89268c = qVar;
        this.f89269d = c1558a;
        this.f89270e = dVar;
        this.f89271f = bVar;
        this.f89272g = i11;
        this.f89273h = wVar;
        this.f89274i = function1;
        this.f89275j = function0;
        this.f89276k = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f89276k | 1);
        ru.ozon.android.messenger.framework.core.d dVar = this.f89270e;
        v0.I i11 = this.f89272g;
        c1.w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> wVar = this.f89273h;
        N.c(this.f89267b, this.f89268c, this.f89269d, dVar, this.f89271f, i11, wVar, this.f89274i, this.f89275j, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
