package tf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.D;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f99503a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f99504b;

    /* renamed from: c, reason: collision with root package name */
    private final long f99505c;

    /* renamed from: d, reason: collision with root package name */
    private final long f99506d;

    /* renamed from: e, reason: collision with root package name */
    private final int f99507e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f99508f;

    /* renamed from: g, reason: collision with root package name */
    private final long f99509g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f99510h;

    public /* synthetic */ j(D d11) {
        this(d11, true, "", -1L, -1L, -1, null, -1L);
    }

    @NotNull
    public final D a() {
        return this.f99503a;
    }

    @NotNull
    public final ArrayList b() {
        return this.f99510h;
    }

    public final long c() {
        return this.f99505c;
    }

    public final int d() {
        return this.f99507e;
    }

    public final Long e() {
        return this.f99508f;
    }

    public final long f() {
        return this.f99509g;
    }

    public final long g() {
        return this.f99506d;
    }

    public final boolean h() {
        return this.f99504b;
    }

    public j(@NotNull D canonicalPath, boolean z11, @NotNull String comment, long j11, long j12, int i11, Long l11, long j13) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f99503a = canonicalPath;
        this.f99504b = z11;
        this.f99505c = j11;
        this.f99506d = j12;
        this.f99507e = i11;
        this.f99508f = l11;
        this.f99509g = j13;
        this.f99510h = new ArrayList();
    }
}
