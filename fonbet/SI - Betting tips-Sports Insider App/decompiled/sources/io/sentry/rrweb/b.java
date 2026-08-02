package io.sentry.rrweb;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public c f17004a;

    /* renamed from: b, reason: collision with root package name */
    public long f17005b = System.currentTimeMillis();

    public b(c cVar) {
        this.f17004a = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17005b == bVar.f17005b && this.f17004a == bVar.f17004a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17004a, Long.valueOf(this.f17005b)});
    }
}
