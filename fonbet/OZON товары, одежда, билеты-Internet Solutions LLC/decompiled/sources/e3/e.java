package e3;

import S0.InterfaceC3978p0;
import S0.M;
import S0.N;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class e extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f61889b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v.a f61890c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f61891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(J j11, AbstractC5434v.a aVar, InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f61889b = j11;
        this.f61890c = aVar;
        this.f61891d = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.I, e3.c] */
    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        final InterfaceC3978p0 interfaceC3978p0 = this.f61891d;
        final AbstractC5434v.a aVar = this.f61890c;
        ?? r32 = new G() { // from class: e3.c
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar2) {
                if (aVar2 == AbstractC5434v.a.this) {
                    ((Function0) interfaceC3978p0.getValue()).invoke();
                }
            }
        };
        J j11 = this.f61889b;
        j11.getLifecycle().a(r32);
        return new C6287d(j11, r32);
    }
}
