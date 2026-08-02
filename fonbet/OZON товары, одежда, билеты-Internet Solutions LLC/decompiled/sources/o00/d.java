package o00;

import Jb.j;
import O7.o;
import kotlin.jvm.internal.Intrinsics;
import zi0.C11145a;

/* loaded from: classes7.dex */
public final class d implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77469a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f77470b;

    public d(Pc.a aVar) {
        this.f77470b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f77469a) {
            case 0:
                Ld0.d globalConfig = (Ld0.d) ((Jb.f) this.f77470b).get();
                Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
                Nd0.b b11 = globalConfig.b();
                j.d(b11);
                return b11;
            default:
                return new C11145a((ij0.d) this.f77470b.get());
        }
    }

    public d(o oVar, Jb.f fVar) {
        this.f77470b = fVar;
    }
}
