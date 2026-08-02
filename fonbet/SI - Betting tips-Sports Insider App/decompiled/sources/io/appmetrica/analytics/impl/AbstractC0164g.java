package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0164g {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f13793a;

    /* renamed from: b, reason: collision with root package name */
    public final Qk f13794b;

    /* renamed from: c, reason: collision with root package name */
    public final Uk f13795c;

    /* renamed from: d, reason: collision with root package name */
    public final Pk f13796d;

    /* renamed from: e, reason: collision with root package name */
    public final Ra f13797e;

    /* renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f13798f;

    public AbstractC0164g(@NonNull X4 x42, @NonNull Qk qk, @NonNull Uk uk, @NonNull Pk pk, @NonNull Ra ra2, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f13793a = x42;
        this.f13794b = qk;
        this.f13795c = uk;
        this.f13796d = pk;
        this.f13797e = ra2;
        this.f13798f = systemTimeProvider;
    }

    @NonNull
    public final /* bridge */ Dk a(@NonNull Object obj) {
        return a((Ek) obj);
    }

    public final Dk b() {
        if (this.f13795c.h()) {
            return new Dk(this.f13793a, this.f13795c, a(), this.f13798f);
        }
        return null;
    }

    @NonNull
    public final Dk a(@NonNull Ek ek) {
        if (this.f13795c.h()) {
            this.f13797e.reportEvent("create session with non-empty storage");
        }
        X4 x42 = this.f13793a;
        Uk uk = this.f13795c;
        long a7 = this.f13794b.a();
        Uk uk2 = this.f13795c;
        uk2.a(Uk.f12986f, Long.valueOf(a7));
        uk2.a(Uk.f12984d, Long.valueOf(ek.f12205a));
        uk2.a(Uk.f12988h, Long.valueOf(ek.f12205a));
        uk2.a(Uk.f12987g, 0L);
        uk2.a(Uk.f12989i, Boolean.TRUE);
        uk2.b();
        this.f13793a.f13146e.a(a7, this.f13796d.f12762a, TimeUnit.MILLISECONDS.toSeconds(ek.f12206b));
        return new Dk(x42, uk, a(), new SystemTimeProvider());
    }

    public final Gk a() {
        Fk fk = new Fk(this.f13796d);
        fk.f12237g = this.f13795c.i();
        fk.f12236f = this.f13795c.f12992c.a(Uk.f12987g);
        fk.f12234d = this.f13795c.f12992c.a(Uk.f12988h);
        fk.f12233c = this.f13795c.f12992c.a(Uk.f12986f);
        fk.f12238h = this.f13795c.f12992c.a(Uk.f12984d);
        fk.f12231a = this.f13795c.f12992c.a(Uk.f12985e);
        return new Gk(fk);
    }
}
