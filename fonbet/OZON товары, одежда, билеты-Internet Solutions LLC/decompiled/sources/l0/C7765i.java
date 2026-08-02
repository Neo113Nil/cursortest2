package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: l0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7765i extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c1.u<Object> f72094b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f72095c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7774s<Object> f72096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7765i(c1.u<Object> uVar, Object obj, C7774s<Object> c7774s) {
        super(1);
        this.f72094b = uVar;
        this.f72095c = obj;
        this.f72096d = c7774s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new C7764h(this.f72094b, this.f72095c, this.f72096d);
    }
}
