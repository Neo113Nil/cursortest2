package cj0;

import Sc.C;
import V.e;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* renamed from: cj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5839a {

    /* renamed from: a, reason: collision with root package name */
    private final long f57191a;

    /* renamed from: b, reason: collision with root package name */
    private final long f57192b;

    public C5839a(long j11, long j12) {
        this.f57191a = j11;
        this.f57192b = j12;
    }

    public final long a() {
        return this.f57191a;
    }

    public final long b() {
        return this.f57192b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5839a)) {
            return false;
        }
        C5839a c5839a = (C5839a) obj;
        return C7807Z.p(this.f57191a, c5839a.f57191a) && C7807Z.p(this.f57192b, c5839a.f57192b);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.f57192b) + (Long.hashCode(this.f57191a) * 31);
    }

    @NotNull
    public final String toString() {
        return e.a("BadgeColors(backgroundColor=", C7807Z.v(this.f57191a), ", labelColor=", C7807Z.v(this.f57192b), ")");
    }
}
