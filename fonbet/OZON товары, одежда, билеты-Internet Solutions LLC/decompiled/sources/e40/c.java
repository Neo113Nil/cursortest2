package e40;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f61999a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62000b;

    public c(String str, String str2) {
        this.f61999a = str;
        this.f62000b = str2;
    }

    public final String a() {
        return this.f61999a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f61999a, cVar.f61999a) && Intrinsics.d(this.f62000b, cVar.f62000b);
    }

    public final int hashCode() {
        String str = this.f61999a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62000b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QrScannerResult(qrString=");
        sb2.append(this.f61999a);
        sb2.append(", qrRawDataBase64=");
        return o0.c(sb2, this.f62000b, ")");
    }
}
