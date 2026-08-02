package f30;

import android.content.Context;
import f30.q;
import i30.C7004a;
import kotlin.jvm.internal.Intrinsics;
import q30.C8982b;

/* loaded from: classes3.dex */
public final class i implements Jb.e<j30.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f62520a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C8982b> f62521b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<R30.a> f62522c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f62523d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<O30.b> f62524e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<S30.a> f62525f;

    public i(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5) {
        this.f62520a = aVar;
        this.f62521b = aVar2;
        this.f62522c = aVar3;
        this.f62523d = fVar;
        this.f62524e = aVar4;
        this.f62525f = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((q.f) this.f62520a).get();
        C8982b repository = this.f62521b.get();
        R30.a scopes = (R30.a) ((q.d) this.f62522c).get();
        C7004a config = (C7004a) this.f62523d.get();
        O30.b type = (O30.b) ((q.h) this.f62524e).get();
        S30.a applicationInfoDataSource = (S30.a) ((q.a) this.f62525f).get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        return new j30.c(context, repository, config, scopes, type, applicationInfoDataSource);
    }
}
