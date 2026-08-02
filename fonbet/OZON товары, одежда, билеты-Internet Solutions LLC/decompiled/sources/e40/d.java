package e40;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f62001a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f62002b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DEEPLINK;
        public static final a REGULAR;

        static {
            a aVar = new a("REGULAR", 0);
            REGULAR = aVar;
            a aVar2 = new a("DEEPLINK", 1);
            DEEPLINK = aVar2;
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

    public d(@NotNull String url, @NotNull a type) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f62001a = url;
        this.f62002b = type;
    }

    @NotNull
    public final String a() {
        return this.f62001a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f62001a, dVar.f62001a) && this.f62002b == dVar.f62002b;
    }

    public final int hashCode() {
        return this.f62002b.hashCode() + C3532b.a(this.f62001a.hashCode() * 31, 31, false);
    }

    @NotNull
    public final String toString() {
        return "UrlWrap(url=" + this.f62001a + ", resetBackStack=false, type=" + this.f62002b + ")";
    }
}
