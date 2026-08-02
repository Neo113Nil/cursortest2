package wh0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: wh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10562a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104566a;

    /* renamed from: b, reason: collision with root package name */
    private final String f104567b;

    public C10562a(@NotNull String newHwId, String str) {
        Intrinsics.checkNotNullParameter(newHwId, "newHwId");
        this.f104566a = newHwId;
        this.f104567b = str;
    }

    @NotNull
    public final String a() {
        return this.f104566a;
    }

    public final String b() {
        return this.f104567b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10562a)) {
            return false;
        }
        C10562a c10562a = (C10562a) obj;
        return Intrinsics.d(this.f104566a, c10562a.f104566a) && Intrinsics.d(this.f104567b, c10562a.f104567b);
    }

    public final int hashCode() {
        int hashCode = this.f104566a.hashCode() * 31;
        String str = this.f104567b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HwIdModel(newHwId=");
        sb2.append(this.f104566a);
        sb2.append(", oldHwId=");
        return o0.c(sb2, this.f104567b, ")");
    }
}
