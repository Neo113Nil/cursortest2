package l20;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8047b;
import org.jetbrains.annotations.NotNull;

/* renamed from: l20.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C7854a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f72565a;

    public C7854a(@NotNull b viewItemInfo) {
        Intrinsics.checkNotNullParameter(viewItemInfo, "viewItemInfo");
        this.f72565a = viewItemInfo;
    }

    @NotNull
    public <I extends C7854a> I b(@NotNull b viewItemInfo) {
        Intrinsics.checkNotNullParameter(viewItemInfo, "viewItemInfo");
        return (I) new C7854a(viewItemInfo);
    }

    @NotNull
    public final d c() {
        return i().b();
    }

    @NotNull
    public final c d() {
        return i().c();
    }

    public final c e() {
        c d11 = d();
        if (d11 == null) {
            return null;
        }
        return d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7854a) && Intrinsics.d(i(), ((C7854a) obj).i());
    }

    public final long f() {
        return i().d();
    }

    public Map<String, List<C7854a>> g() {
        return i().f();
    }

    public final Map<String, String> h() {
        return i().g();
    }

    public int hashCode() {
        return i().hashCode();
    }

    @NotNull
    public b i() {
        return this.f72565a;
    }

    public final int j() {
        return i().h();
    }

    @NotNull
    public final InterfaceC8047b k() {
        return i().i();
    }
}
