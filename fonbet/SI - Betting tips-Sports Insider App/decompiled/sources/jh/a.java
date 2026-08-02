package jh;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18538a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18539b;

    /* renamed from: c, reason: collision with root package name */
    public c f18540c;

    /* renamed from: d, reason: collision with root package name */
    public long f18541d;

    public a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f18538a = name;
        this.f18539b = true;
        this.f18541d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f18538a;
    }
}
