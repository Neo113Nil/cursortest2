package nd;

import kotlin.jvm.functions.Function0;

/* renamed from: nd.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8558q implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77026a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8504A f77027b;

    public /* synthetic */ C8558q(AbstractC8504A abstractC8504A, int i11) {
        this.f77026a = i11;
        this.f77027b = abstractC8504A;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f77026a) {
            case 0:
                return g1.d(this.f77027b.t());
            default:
                return J0.C((J0) this.f77027b);
        }
    }
}
