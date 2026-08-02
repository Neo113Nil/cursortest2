package m00;

import D40.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8825a;
import p00.InterfaceC8826b;

/* renamed from: m00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8029a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<InterfaceC8826b<? extends Object>, Object> f73925a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Boolean> f73926b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f73927c;

    public C8029a(@NotNull Map<InterfaceC8826b<? extends Object>, ? extends Object> flags, @NotNull Map<String, Boolean> arguments, boolean z11) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f73925a = flags;
        this.f73926b = arguments;
        this.f73927c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C8029a b(C8029a c8029a, Map flags, LinkedHashMap linkedHashMap, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            flags = c8029a.f73925a;
        }
        Map arguments = linkedHashMap;
        if ((i11 & 2) != 0) {
            arguments = c8029a.f73926b;
        }
        if ((i11 & 4) != 0) {
            z11 = c8029a.f73927c;
        }
        c8029a.getClass();
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new C8029a(flags, arguments, z11);
    }

    public final boolean a() {
        return !(this.f73926b.get("COMPOSER_LOGS_DISABLED") != null ? r0.booleanValue() : false);
    }

    @NotNull
    public final Map<String, Boolean> c() {
        return this.f73926b;
    }

    @NotNull
    public final Map<InterfaceC8826b<? extends Object>, Object> d() {
        return this.f73925a;
    }

    public final boolean e() {
        return this.f73927c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8029a)) {
            return false;
        }
        C8029a c8029a = (C8029a) obj;
        return Intrinsics.d(this.f73925a, c8029a.f73925a) && Intrinsics.d(this.f73926b, c8029a.f73926b) && this.f73927c == c8029a.f73927c;
    }

    public final boolean f(@NotNull C8825a flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        Object obj = this.f73925a.get(flag);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        flag.getClass();
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73927c) + c.a(this.f73926b, this.f73925a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposerDebugMenuState(flags=");
        sb2.append(this.f73925a);
        sb2.append(", arguments=");
        sb2.append(this.f73926b);
        sb2.append(", shouldReloadApp=");
        return Pk0.a.a(")", sb2, this.f73927c);
    }
}
