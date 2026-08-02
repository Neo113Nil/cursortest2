package defpackage;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f45582a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45583b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45584c;

    public b(int i11, String str, boolean z11) {
        Intrinsics.checkNotNullParameter("MEDIA_MUXER", "tag");
        this.f45582a = z11;
        this.f45583b = str;
        this.f45584c = i11;
    }

    public final int a() {
        return this.f45584c;
    }

    public final String b() {
        return this.f45583b;
    }

    public final boolean c() {
        return this.f45582a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f45582a == bVar.f45582a && Intrinsics.d(this.f45583b, bVar.f45583b) && this.f45584c == bVar.f45584c;
    }

    public final int hashCode() {
        int a11 = C3532b.a(653329438, 31, this.f45582a);
        String str = this.f45583b;
        return Integer.hashCode(this.f45584c) + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConcatenateResult(tag=MEDIA_MUXER, succes=");
        sb2.append(this.f45582a);
        sb2.append(", errorDesc=");
        sb2.append(this.f45583b);
        sb2.append(", combinedDuration=");
        return K00.b.e(this.f45584c, ")", sb2);
    }
}
