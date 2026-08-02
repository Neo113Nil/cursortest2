package o00;

import O7.o;
import android.app.Application;
import j00.C7234a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class f implements Jb.e<C7234a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<n00.f> f77472a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Nd0.b> f77473b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<Application> f77474c;

    public f(o oVar, Pc.a<n00.f> aVar, Pc.a<Nd0.b> aVar2, Pc.a<Application> aVar3) {
        this.f77472a = aVar;
        this.f77473b = aVar2;
        this.f77474c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        n00.f flagsStorage = this.f77472a.get();
        Nd0.b buildType = this.f77473b.get();
        Application application = this.f77474c.get();
        Intrinsics.checkNotNullParameter(flagsStorage, "flagsStorage");
        Intrinsics.checkNotNullParameter(buildType, "buildType");
        Intrinsics.checkNotNullParameter(application, "application");
        return new C7234a(flagsStorage, buildType, application);
    }
}
