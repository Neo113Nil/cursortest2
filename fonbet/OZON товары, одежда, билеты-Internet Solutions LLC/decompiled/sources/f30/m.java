package f30;

import android.content.Context;
import android.content.SharedPreferences;
import f30.q;
import i30.C7005b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements Jb.e<k30.g> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f62530a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<q30.c> f62531b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<R30.a> f62532c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<O30.b> f62533d;

    /* renamed from: e, reason: collision with root package name */
    private final Jb.f f62534e;

    /* renamed from: f, reason: collision with root package name */
    private final k30.c f62535f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f62536g;

    public m(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Jb.f fVar, k30.c cVar, Pc.a aVar5) {
        this.f62530a = aVar;
        this.f62531b = aVar2;
        this.f62532c = aVar3;
        this.f62533d = aVar4;
        this.f62534e = fVar;
        this.f62535f = cVar;
        this.f62536g = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((q.f) this.f62530a).get();
        q30.c repository = this.f62531b.get();
        R30.a scopes = (R30.a) ((q.d) this.f62532c).get();
        O30.b type = (O30.b) ((q.h) this.f62533d).get();
        C7005b mobileHealthConfig = (C7005b) this.f62534e.get();
        k30.b exitAppDetector = (k30.b) this.f62535f.get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((q.c) this.f62536g).get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mobileHealthConfig, "mobileHealthConfig");
        Intrinsics.checkNotNullParameter(exitAppDetector, "exitAppDetector");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new k30.g(context, repository, scopes, type, mobileHealthConfig, exitAppDetector, sharedPreferences);
    }
}
