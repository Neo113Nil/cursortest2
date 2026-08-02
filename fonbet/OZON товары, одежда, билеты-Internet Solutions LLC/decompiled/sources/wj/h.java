package wj;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f104589a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f104590b;

    public h(String str, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f104589a = str;
        this.f104590b = mimeType;
    }

    @NotNull
    public final String a() {
        return this.f104590b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f104589a, hVar.f104589a) && Intrinsics.d(this.f104590b, hVar.f104590b);
    }

    public final int hashCode() {
        String str = this.f104589a;
        return this.f104590b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeadersParseResult(compression=");
        sb2.append(this.f104589a);
        sb2.append(", mimeType=");
        return o0.c(sb2, this.f104590b, ")");
    }
}
