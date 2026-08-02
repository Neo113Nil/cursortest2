package sa0;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98495a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98496b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f98497c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f98498d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTIVE;
        public static final a DISPOSED;
        public static final a PENDING;
        public static final a SUSPENDED;

        static {
            a aVar = new a("ACTIVE", 0);
            ACTIVE = aVar;
            a aVar2 = new a("PENDING", 1);
            PENDING = aVar2;
            a aVar3 = new a("SUSPENDED", 2);
            SUSPENDED = aVar3;
            a aVar4 = new a("DISPOSED", 3);
            DISPOSED = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public b(@NotNull String referenceId, @NotNull String maskedPan, @NotNull String expiredDate, @NotNull a mirCardState) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(maskedPan, "maskedPan");
        Intrinsics.checkNotNullParameter(expiredDate, "expiredDate");
        Intrinsics.checkNotNullParameter(mirCardState, "mirCardState");
        this.f98495a = referenceId;
        this.f98496b = maskedPan;
        this.f98497c = expiredDate;
        this.f98498d = mirCardState;
    }

    @NotNull
    public final String a() {
        return this.f98497c;
    }

    @NotNull
    public final String b() {
        return this.f98496b;
    }

    @NotNull
    public final a c() {
        return this.f98498d;
    }

    @NotNull
    public final String d() {
        return this.f98495a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f98495a, bVar.f98495a) && Intrinsics.d(this.f98496b, bVar.f98496b) && Intrinsics.d(this.f98497c, bVar.f98497c) && this.f98498d == bVar.f98498d;
    }

    public final int hashCode() {
        return this.f98498d.hashCode() + g.a(g.a(this.f98495a.hashCode() * 31, 31, this.f98496b), 31, this.f98497c);
    }

    @NotNull
    public final String toString() {
        return "MirWalletCard(referenceId=" + this.f98495a + ", maskedPan=" + this.f98496b + ", expiredDate=" + this.f98497c + ", mirCardState=" + this.f98498d + ")";
    }
}
