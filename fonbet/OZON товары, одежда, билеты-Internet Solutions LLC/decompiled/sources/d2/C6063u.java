package d2;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6063u extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6040Q f61077b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f61078c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6041S f61079d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f61080e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f61081f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f61082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6063u(InterfaceC6040Q interfaceC6040Q, Function0 function0, C6041S c6041s, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f61077b = interfaceC6040Q;
        this.f61078c = function0;
        this.f61079d = c6041s;
        this.f61080e = c4912a;
        this.f61081f = i11;
        this.f61082g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f61081f | 1);
        C4912a c4912a = this.f61080e;
        Function0<Unit> function0 = this.f61078c;
        C6054l.a(this.f61077b, function0, this.f61079d, c4912a, interfaceC3967k, e11, this.f61082g);
        return Unit.f71690a;
    }
}
