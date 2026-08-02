package n00;

import android.app.Application;

/* renamed from: n00.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8407b implements Jb.e<C8406a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f76254a;

    public C8407b(Pc.a<Application> aVar) {
        this.f76254a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C8406a(this.f76254a.get());
    }
}
