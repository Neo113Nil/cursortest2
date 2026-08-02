package sf;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9687m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f98736a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f98737b;

    /* renamed from: c, reason: collision with root package name */
    private final D f98738c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f98739d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f98740e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f98741f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f98742g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, Object> f98743h;

    public C9687m(boolean z11, boolean z12, D d11, Long l11, Long l12, Long l13, Long l14, @NotNull Map<kotlin.reflect.d<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f98736a = z11;
        this.f98737b = z12;
        this.f98738c = d11;
        this.f98739d = l11;
        this.f98740e = l12;
        this.f98741f = l13;
        this.f98742g = l14;
        this.f98743h = U.t(extras);
    }

    public static C9687m a(C9687m c9687m, D d11) {
        Map<kotlin.reflect.d<?>, Object> extras = c9687m.f98743h;
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new C9687m(c9687m.f98736a, c9687m.f98737b, d11, c9687m.f98739d, c9687m.f98740e, c9687m.f98741f, c9687m.f98742g, extras);
    }

    public final Long b() {
        return this.f98741f;
    }

    public final Long c() {
        return this.f98739d;
    }

    public final D d() {
        return this.f98738c;
    }

    public final boolean e() {
        return this.f98737b;
    }

    public final boolean f() {
        return this.f98736a;
    }

    @NotNull
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f98736a) {
            arrayList.add("isRegularFile");
        }
        if (this.f98737b) {
            arrayList.add("isDirectory");
        }
        Long l11 = this.f98739d;
        if (l11 != null) {
            arrayList.add("byteCount=" + l11);
        }
        Long l12 = this.f98740e;
        if (l12 != null) {
            arrayList.add("createdAt=" + l12);
        }
        Long l13 = this.f98741f;
        if (l13 != null) {
            arrayList.add("lastModifiedAt=" + l13);
        }
        Long l14 = this.f98742g;
        if (l14 != null) {
            arrayList.add("lastAccessedAt=" + l14);
        }
        Map<kotlin.reflect.d<?>, Object> map = this.f98743h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return C7714v.V(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ C9687m(boolean z11, boolean z12, D d11, Long l11, Long l12, Long l13, Long l14) {
        this(z11, z12, d11, l11, l12, l13, l14, U.c());
    }
}
