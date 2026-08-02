package e30;

import G.g;
import P4.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e30.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6289b {

    /* renamed from: a, reason: collision with root package name */
    private final long f61985a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f61986b;

    /* renamed from: c, reason: collision with root package name */
    private final long f61987c;

    public C6289b(@NotNull String eventJson, long j11, long j12) {
        Intrinsics.checkNotNullParameter(eventJson, "eventJson");
        this.f61985a = j11;
        this.f61986b = eventJson;
        this.f61987c = j12;
    }

    public final long a() {
        return this.f61987c;
    }

    @NotNull
    public final String b() {
        return this.f61986b;
    }

    public final long c() {
        return this.f61985a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6289b)) {
            return false;
        }
        C6289b c6289b = (C6289b) obj;
        return this.f61985a == c6289b.f61985a && Intrinsics.d(this.f61986b, c6289b.f61986b) && this.f61987c == c6289b.f61987c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f61987c) + g.a(Long.hashCode(this.f61985a) * 31, 31, this.f61986b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MobileHealthEventEntity(id=");
        sb2.append(this.f61985a);
        sb2.append(", eventJson=");
        sb2.append(this.f61986b);
        sb2.append(", createdAt=");
        return f.a(this.f61987c, ")", sb2);
    }
}
