package fi0;

import android.content.Context;
import com.squareup.moshi.Moshi;

/* loaded from: classes7.dex */
public final class l implements Jb.e<k> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f63495a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Moshi> f63496b;

    public l(Jb.f fVar, Pc.a aVar) {
        this.f63495a = fVar;
        this.f63496b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new k((Context) this.f63495a.get(), this.f63496b.get());
    }
}
