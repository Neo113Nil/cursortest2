package m90;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f74669a;

    /* renamed from: b, reason: collision with root package name */
    private final long f74670b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HTML_PROCESSED;
        public static final a JS_PROCESSED;

        static {
            a aVar = new a("HTML_PROCESSED", 0);
            HTML_PROCESSED = aVar;
            a aVar2 = new a("JS_PROCESSED", 1);
            JS_PROCESSED = aVar2;
            a[] aVarArr = {aVar, aVar2};
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

    public b(@NotNull a type, long j11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f74669a = type;
        this.f74670b = j11;
    }

    @NotNull
    public final a a() {
        return this.f74669a;
    }

    public final long b() {
        return this.f74670b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f74669a == bVar.f74669a && this.f74670b == bVar.f74670b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f74670b) + (this.f74669a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TrackerMetric(type=" + this.f74669a + ", value=" + this.f74670b + ")";
    }
}
