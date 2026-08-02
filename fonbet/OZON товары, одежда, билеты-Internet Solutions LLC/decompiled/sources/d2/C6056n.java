package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6056n extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6034K f61059b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f61060c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6041S f61061d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Z1.s f61062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6056n(C6034K c6034k, Function0<Unit> function0, C6041S c6041s, String str, Z1.s sVar) {
        super(1);
        this.f61059b = c6034k;
        this.f61060c = function0;
        this.f61061d = c6041s;
        this.f61062e = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        C6034K c6034k = this.f61059b;
        c6034k.l();
        c6034k.m(this.f61060c, this.f61061d, this.f61062e);
        return new C6055m(c6034k);
    }
}
