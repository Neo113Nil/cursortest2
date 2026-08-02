package d2;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6046d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f61041b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6030G f61042c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f61043d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f61044e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f61045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6046d(Function0 function0, C6030G c6030g, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f61041b = function0;
        this.f61042c = c6030g;
        this.f61043d = c4912a;
        this.f61044e = i11;
        this.f61045f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f61044e | 1);
        C4912a c4912a = this.f61043d;
        Function0<Unit> function0 = this.f61041b;
        C6053k.a(function0, this.f61042c, c4912a, interfaceC3967k, e11, this.f61045f);
        return Unit.f71690a;
    }
}
