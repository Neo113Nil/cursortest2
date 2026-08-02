package we0;

import B0.C2454a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104482a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<m> f104483b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<List<m>> f104484c;

    /* renamed from: d, reason: collision with root package name */
    private final int f104485d;

    /* renamed from: e, reason: collision with root package name */
    private final float f104486e;

    /* renamed from: f, reason: collision with root package name */
    private final int f104487f;

    public v(@NotNull String id2, @NotNull List path, @NotNull List excludedPaths, int i11, float f7, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(excludedPaths, "excludedPaths");
        this.f104482a = id2;
        this.f104483b = path;
        this.f104484c = excludedPaths;
        this.f104485d = i11;
        this.f104486e = f7;
        this.f104487f = i12;
    }

    @NotNull
    public final List<List<m>> a() {
        return this.f104484c;
    }

    public final int b() {
        return this.f104487f;
    }

    @NotNull
    public final String c() {
        return this.f104482a;
    }

    @NotNull
    public final List<m> d() {
        return this.f104483b;
    }

    public final int e() {
        return this.f104485d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f104482a, vVar.f104482a) && Intrinsics.d(this.f104483b, vVar.f104483b) && Intrinsics.d(this.f104484c, vVar.f104484c) && this.f104485d == vVar.f104485d && Float.compare(this.f104486e, vVar.f104486e) == 0 && this.f104487f == vVar.f104487f && Float.compare(0.0f, 0.0f) == 0;
    }

    public final float f() {
        return this.f104486e;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + C2454a.a(this.f104487f, Pk0.b.a(this.f104486e, C2454a.a(this.f104485d, G.g.b(G.g.b(this.f104482a.hashCode() * 31, 31, this.f104483b), 31, this.f104484c), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapPolygon(id=");
        sb2.append(this.f104482a);
        sb2.append(", path=");
        sb2.append(this.f104483b);
        sb2.append(", excludedPaths=");
        sb2.append(this.f104484c);
        sb2.append(", strokeColor=");
        sb2.append(this.f104485d);
        sb2.append(", strokeWidth=");
        sb2.append(this.f104486e);
        sb2.append(", fillColor=");
        return K00.b.e(this.f104487f, ", zIndex=0.0)", sb2);
    }
}
