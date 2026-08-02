package w0;

import S0.A1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import x0.a0;

/* renamed from: w0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10400p extends AbstractC7737t implements Function0<C10397m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A1<C10394j> f103287b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O f103288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10400p(A1<C10394j> a12, O o11) {
        super(0);
        this.f103287b = a12;
        this.f103288c = o11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C10397m invoke() {
        C10394j value = this.f103287b.getValue();
        O o11 = this.f103288c;
        return new C10397m(o11, value, new a0(o11.s(), value));
    }
}
