package p1;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final s.m f21411a;

    /* renamed from: b, reason: collision with root package name */
    public final s.m f21412b;

    static {
        Float valueOf = Float.valueOf(0.0f);
        Pair pair = new Pair(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        new d(pair, new Pair(valueOf2, valueOf2));
    }

    public d(Pair... mappings) {
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        this.f21411a = new s.m(mappings.length);
        this.f21412b = new s.m(mappings.length);
        int length = mappings.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f21411a.c(((Number) mappings[i5].f19192a).floatValue());
            this.f21412b.c(((Number) mappings[i5].f19193b).floatValue());
        }
        y4.a.F(this.f21411a);
        y4.a.F(this.f21412b);
    }
}
