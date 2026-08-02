package ki;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import t0.q;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC8972b f71621b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f71622c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A0.g f71623d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f71624e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e.a f71625f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f71626g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ q f71627h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f71628i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(AbstractC8972b abstractC8972b, g gVar, A0.g gVar2, androidx.compose.ui.e eVar, e.a aVar, boolean z11, q qVar, Function0 function0, int i11) {
        super(2);
        this.f71621b = abstractC8972b;
        this.f71622c = gVar;
        this.f71623d = gVar2;
        this.f71624e = eVar;
        this.f71625f = aVar;
        this.f71626g = z11;
        this.f71627h = qVar;
        this.f71628i = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        g gVar = this.f71622c;
        e.a aVar = this.f71625f;
        boolean z11 = this.f71626g;
        f.a(this.f71621b, gVar, this.f71623d, this.f71624e, aVar, z11, this.f71627h, this.f71628i, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
