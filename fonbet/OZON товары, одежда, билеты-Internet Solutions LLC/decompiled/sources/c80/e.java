package c80;

import f70.C6442a;

/* loaded from: classes3.dex */
public final class e implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56724a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f56725b;

    public /* synthetic */ e(Pc.a aVar, int i11) {
        this.f56724a = i11;
        this.f56725b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f56724a) {
            case 0:
                return new d((L30.l) this.f56725b.get());
            default:
                return new C6442a((Z60.a) this.f56725b.get());
        }
    }
}
