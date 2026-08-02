package sa0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sa0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9646a {

    /* renamed from: a, reason: collision with root package name */
    private final String f98493a;

    /* renamed from: b, reason: collision with root package name */
    private final String f98494b;

    public C9646a(String str, String str2) {
        this.f98493a = str;
        this.f98494b = str2;
    }

    public final String a() {
        return this.f98494b;
    }

    public final String b() {
        return this.f98493a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9646a)) {
            return false;
        }
        C9646a c9646a = (C9646a) obj;
        return Intrinsics.d(this.f98493a, c9646a.f98493a) && Intrinsics.d(this.f98494b, c9646a.f98494b);
    }

    public final int hashCode() {
        String str = this.f98493a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98494b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MirWalletAddCardResult(referenceId=");
        sb2.append(this.f98493a);
        sb2.append(", errorType=");
        return o0.c(sb2, this.f98494b, ")");
    }
}
