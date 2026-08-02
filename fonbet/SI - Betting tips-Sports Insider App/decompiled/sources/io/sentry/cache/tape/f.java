package io.sentry.cache.tape;

import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f16259c = new f(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f16260a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16261b;

    public f(long j, int i5) {
        this.f16260a = j;
        this.f16261b = i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append("[position=");
        sb2.append(this.f16260a);
        sb2.append(", length=");
        return k.n(sb2, this.f16261b, "]");
    }
}
