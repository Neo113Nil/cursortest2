package k5;

import B90.C2618u;
import androidx.annotation.NonNull;
import k5.N0;

/* loaded from: classes8.dex */
public final class T extends Z1<Rm0.a> {

    /* renamed from: c, reason: collision with root package name */
    private final M8.b f70644c;

    /* renamed from: d, reason: collision with root package name */
    private final C2618u f70645d;

    public T(@NonNull R0 r02, @NonNull M8.b bVar, @NonNull C2618u c2618u) {
        super(r02);
        this.f70644c = bVar;
        this.f70645d = c2618u;
    }

    @NonNull
    protected final N0 a() {
        N0.a aVar = new N0.a();
        R0 r02 = this.f70686a;
        r02.c();
        aVar.d((Y1) r02.b());
        aVar.c(this.f70644c);
        aVar.b(this.f70645d);
        return aVar.a();
    }
}
