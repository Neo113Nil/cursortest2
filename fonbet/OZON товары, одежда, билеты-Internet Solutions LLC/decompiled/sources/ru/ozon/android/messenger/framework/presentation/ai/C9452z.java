package ru.ozon.android.messenger.framework.presentation.ai;

import S0.InterfaceC3978p0;
import a1.C4912a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.initialization.d;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9452z extends AbstractC7737t implements Function1<v0.G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f89710b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f89711c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d.a.C1558a f89712d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89713e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.logger.b f89714f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ v0.I f89715g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c1.w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> f89716h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f89717i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o> f89718j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9452z(List<ru.ozon.android.messenger.framework.presentation.models.q> list, boolean z11, d.a.C1558a c1558a, ru.ozon.android.messenger.framework.core.d dVar, ru.ozon.android.messenger.framework.logger.b bVar, v0.I i11, c1.w<String, ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.a> wVar, Function0<Integer> function0, InterfaceC3978p0<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o> interfaceC3978p0) {
        super(1);
        this.f89710b = list;
        this.f89711c = z11;
        this.f89712d = c1558a;
        this.f89713e = dVar;
        this.f89714f = bVar;
        this.f89715g = i11;
        this.f89716h = wVar;
        this.f89717i = function0;
        this.f89718j = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(v0.G g10) {
        v0.G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<ru.ozon.android.messenger.framework.presentation.models.q> list = this.f89710b;
        int size = list.size();
        C9447u c9447u = C9447u.f89682b;
        LazyColumn.a(size, c9447u != null ? new C9449w(c9447u, list) : null, new C9450x(list), new C4912a(true, -1091073711, new C9451y(list, list, this.f89711c, this.f89712d, this.f89713e, this.f89714f, this.f89715g, this.f89716h, this.f89717i, this.f89718j)));
        return Unit.f71690a;
    }
}
