package ru.ozon.android.messenger.framework.presentation.ai;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.core.initialization.d;
import u0.C9915y;

/* loaded from: classes10.dex */
final class B extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f89214b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f89215c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f89216d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v0.I f89217e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d.a.C1558a f89218f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9915y f89219g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f89220h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89221i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.view.recycler.u f89222j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.logger.b f89223k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f89224l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(androidx.compose.ui.e eVar, List list, boolean z11, v0.I i11, d.a.C1558a c1558a, C9915y c9915y, Function0 function0, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.presentation.common.view.recycler.u uVar, ru.ozon.android.messenger.framework.logger.b bVar, int i12) {
        super(2);
        this.f89214b = eVar;
        this.f89215c = list;
        this.f89216d = z11;
        this.f89217e = i11;
        this.f89218f = c1558a;
        this.f89219g = c9915y;
        this.f89220h = function0;
        this.f89221i = dVar;
        this.f89222j = uVar;
        this.f89223k = bVar;
        this.f89224l = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f89224l | 1);
        C9915y c9915y = this.f89219g;
        ru.ozon.android.messenger.framework.core.d dVar = this.f89221i;
        N.a(this.f89214b, this.f89215c, this.f89216d, this.f89217e, this.f89218f, c9915y, this.f89220h, dVar, this.f89222j, this.f89223k, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
