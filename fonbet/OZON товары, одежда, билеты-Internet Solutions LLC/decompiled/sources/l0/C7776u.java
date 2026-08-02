package l0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.D0;

/* renamed from: l0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7776u extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0<Object> f72149b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Boolean> f72150c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f72151d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.q f72152e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.s f72153f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2<O, O, Boolean> f72154g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f72155h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f72156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7776u(D0 d02, Function1 function1, androidx.compose.ui.e eVar, androidx.compose.animation.q qVar, androidx.compose.animation.s sVar, Function2 function2, C4912a c4912a, int i11) {
        super(2);
        this.f72149b = d02;
        this.f72150c = function1;
        this.f72151d = eVar;
        this.f72152e = qVar;
        this.f72153f = sVar;
        this.f72154g = function2;
        this.f72155h = c4912a;
        this.f72156i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f72156i | 1);
        C4912a c4912a = this.f72155h;
        androidx.compose.animation.s sVar = this.f72153f;
        Function2<O, O, Boolean> function2 = this.f72154g;
        G.a(this.f72149b, this.f72150c, this.f72151d, this.f72152e, sVar, function2, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
