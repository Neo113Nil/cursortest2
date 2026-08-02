package v0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import e1.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import r0.C9129i;
import u0.C9915y;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10163c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f101532b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I f101533c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9915y f101534d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5179b.e f101535e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d.b f101536f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9129i f101537g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f101538h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<G, Unit> f101539i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f101540j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f101541k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10163c(androidx.compose.ui.e eVar, I i11, C9915y c9915y, C5179b.e eVar2, d.b bVar, C9129i c9129i, boolean z11, Function1 function1, int i12, int i13) {
        super(2);
        this.f101532b = eVar;
        this.f101533c = i11;
        this.f101534d = c9915y;
        this.f101535e = eVar2;
        this.f101536f = bVar;
        this.f101537g = c9129i;
        this.f101538h = z11;
        this.f101539i = function1;
        this.f101540j = i12;
        this.f101541k = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f101540j | 1);
        C9129i c9129i = this.f101537g;
        C10164d.b(this.f101532b, this.f101533c, this.f101534d, this.f101535e, this.f101536f, c9129i, this.f101538h, this.f101539i, interfaceC3967k, e11, this.f101541k);
        return Unit.f71690a;
    }
}
