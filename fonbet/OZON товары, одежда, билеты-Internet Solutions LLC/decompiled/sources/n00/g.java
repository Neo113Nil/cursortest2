package n00;

import j00.C7235b;
import java.util.Set;

/* loaded from: classes7.dex */
public final class g implements Jb.e<f> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<c> f76269a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C8406a> f76270b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<C7235b> f76271c;

    /* renamed from: d, reason: collision with root package name */
    private final o00.g f76272d;

    public g(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, o00.g gVar) {
        this.f76269a = aVar;
        this.f76270b = aVar2;
        this.f76271c = aVar3;
        this.f76272d = gVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new f(this.f76269a.get(), this.f76270b.get(), this.f76271c.get(), (Set) this.f76272d.get());
    }
}
