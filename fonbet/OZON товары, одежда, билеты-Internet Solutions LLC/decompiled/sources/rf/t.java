package rf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final long f83469a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f83470b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9684j f83471c;

    public t(long j11, @NotNull f algorithmIdentifier, @NotNull C9684j privateKey) {
        Intrinsics.checkNotNullParameter(algorithmIdentifier, "algorithmIdentifier");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        this.f83469a = j11;
        this.f83470b = algorithmIdentifier;
        this.f83471c = privateKey;
    }

    @NotNull
    public final f a() {
        return this.f83470b;
    }

    @NotNull
    public final C9684j b() {
        return this.f83471c;
    }

    public final long c() {
        return this.f83469a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f83469a == tVar.f83469a && Intrinsics.d(this.f83470b, tVar.f83470b) && Intrinsics.d(this.f83471c, tVar.f83471c);
    }

    public final int hashCode() {
        return this.f83471c.hashCode() + ((this.f83470b.hashCode() + (((int) this.f83469a) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PrivateKeyInfo(version=" + this.f83469a + ", algorithmIdentifier=" + this.f83470b + ", privateKey=" + this.f83471c + ")";
    }
}
