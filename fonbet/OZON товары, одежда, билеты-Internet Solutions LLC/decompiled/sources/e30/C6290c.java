package e30;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e30.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6290c {

    /* renamed from: a, reason: collision with root package name */
    private final int f61988a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f61989b;

    public C6290c(int i11, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f61988a = i11;
        this.f61989b = userId;
    }

    public final int a() {
        return this.f61988a;
    }

    @NotNull
    public final String b() {
        return this.f61989b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6290c)) {
            return false;
        }
        C6290c c6290c = (C6290c) obj;
        return this.f61988a == c6290c.f61988a && Intrinsics.d(this.f61989b, c6290c.f61989b);
    }

    public final int hashCode() {
        return this.f61989b.hashCode() + (Integer.hashCode(this.f61988a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserIdEntity(id=");
        sb2.append(this.f61988a);
        sb2.append(", userId=");
        return o0.c(sb2, this.f61989b, ")");
    }
}
