package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Qe {

    @NotNull
    private final M3 a;

    @NotNull
    private final Fd b;

    @NotNull
    private final Map<String, C4234o9> c;

    public Qe(@NotNull M3 m3, @NotNull Fd fd, @NotNull Map<String, C4234o9> map) {
        m3.getClass();
        fd.getClass();
        map.getClass();
        this.a = m3;
        this.b = fd;
        this.c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Qe a(Qe qe, M3 m3, Fd fd, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            m3 = qe.a;
        }
        if ((i & 2) != 0) {
            fd = qe.b;
        }
        if ((i & 4) != 0) {
            map = qe.c;
        }
        return qe.a(m3, fd, map);
    }

    @NotNull
    public final Fd b() {
        return this.b;
    }

    @NotNull
    public final Map<String, C4234o9> c() {
        return this.c;
    }

    @NotNull
    public final M3 d() {
        return this.a;
    }

    @NotNull
    public final Fd e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qe)) {
            return false;
        }
        Qe qe = (Qe) obj;
        return Intrinsics.c(this.a, qe.a) && Intrinsics.c(this.b, qe.b) && Intrinsics.c(this.c, qe.c);
    }

    @NotNull
    public final Map<String, C4234o9> f() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ServerResponse2(configurations=" + this.a + ", providerOrder=" + this.b + ", providerSettings=" + this.c + ")";
    }

    @NotNull
    public final Qe a(@NotNull M3 m3, @NotNull Fd fd, @NotNull Map<String, C4234o9> map) {
        m3.getClass();
        fd.getClass();
        map.getClass();
        return new Qe(m3, fd, map);
    }

    @NotNull
    public final M3 a() {
        return this.a;
    }
}
