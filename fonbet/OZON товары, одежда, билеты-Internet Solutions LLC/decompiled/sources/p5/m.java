package p5;

import kotlin.jvm.internal.Intrinsics;
import n5.EnumC8444d;
import n5.n;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m extends g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f80247a;

    /* renamed from: b, reason: collision with root package name */
    private final String f80248b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC8444d f80249c;

    public m(@NotNull n nVar, String str, @NotNull EnumC8444d enumC8444d) {
        super(0);
        this.f80247a = nVar;
        this.f80248b = str;
        this.f80249c = enumC8444d;
    }

    @NotNull
    public final EnumC8444d a() {
        return this.f80249c;
    }

    public final String b() {
        return this.f80248b;
    }

    @NotNull
    public final n c() {
        return this.f80247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f80247a, mVar.f80247a) && Intrinsics.d(this.f80248b, mVar.f80248b) && this.f80249c == mVar.f80249c;
    }

    public final int hashCode() {
        int hashCode = this.f80247a.hashCode() * 31;
        String str = this.f80248b;
        return this.f80249c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
