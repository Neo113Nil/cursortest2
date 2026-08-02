package ob0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import wb0.C10469a;

/* loaded from: classes3.dex */
final class f extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f77936b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10469a f77937c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ s f77938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(l lVar, C10469a c10469a, s sVar) {
        super(0);
        this.f77936b = lVar;
        this.f77937c = c10469a;
        this.f77938d = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f77936b.f77958d;
        B b11 = (B) interfaceC4008j.getValue();
        C10469a c10469a = this.f77937c;
        return b11.o(c10469a.i().m(), c10469a.i().L().j().toString(), c10469a.f(), this.f77938d);
    }
}
