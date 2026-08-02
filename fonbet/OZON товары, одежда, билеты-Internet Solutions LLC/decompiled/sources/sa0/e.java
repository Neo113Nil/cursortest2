package sa0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98500a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98501b;

    public e(@NotNull String walletId, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.f98500a = walletId;
        this.f98501b = deviceId;
    }

    @NotNull
    public final String a() {
        return this.f98501b;
    }

    @NotNull
    public final String b() {
        return this.f98500a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f98500a, eVar.f98500a) && Intrinsics.d(this.f98501b, eVar.f98501b);
    }

    public final int hashCode() {
        return this.f98501b.hashCode() + (this.f98500a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MirWalletInfo(walletId=");
        sb2.append(this.f98500a);
        sb2.append(", deviceId=");
        return o0.c(sb2, this.f98501b, ")");
    }
}
