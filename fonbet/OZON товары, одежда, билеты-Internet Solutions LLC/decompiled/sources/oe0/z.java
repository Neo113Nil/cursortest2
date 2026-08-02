package oe0;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78259a;

    /* renamed from: b, reason: collision with root package name */
    private final L f78260b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PERMISSION_DENIED;
        public static final a PROVIDER_NOT_AVAILABLE;

        static {
            a aVar = new a("PERMISSION_DENIED", 0);
            PERMISSION_DENIED = aVar;
            a aVar2 = new a("PROVIDER_NOT_AVAILABLE", 1);
            PROVIDER_NOT_AVAILABLE = aVar2;
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

    public interface b {

        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f78261a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final a f78262b;

            public a(@NotNull String providerName, @NotNull a error) {
                Intrinsics.checkNotNullParameter(providerName, "providerName");
                Intrinsics.checkNotNullParameter(error, "error");
                this.f78261a = providerName;
                this.f78262b = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f78261a, aVar.f78261a) && this.f78262b == aVar.f78262b;
            }

            public final int hashCode() {
                return this.f78262b.hashCode() + (this.f78261a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Error(providerName=" + this.f78261a + ", error=" + this.f78262b + ")";
            }
        }

        /* renamed from: oe0.z$b$b, reason: collision with other inner class name */
        public static final class C1325b implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f78263a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f78264b;

            public C1325b(@NotNull String providerName, boolean z11) {
                Intrinsics.checkNotNullParameter(providerName, "providerName");
                this.f78263a = providerName;
                this.f78264b = z11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1325b)) {
                    return false;
                }
                C1325b c1325b = (C1325b) obj;
                return Intrinsics.d(this.f78263a, c1325b.f78263a) && this.f78264b == c1325b.f78264b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f78264b) + (this.f78263a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ProviderStatusChanged(providerName=");
                sb2.append(this.f78263a);
                sb2.append(", enabled=");
                return Pk0.a.a(")", sb2, this.f78264b);
            }
        }

        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f78265a;

            /* renamed from: b, reason: collision with root package name */
            private final Location f78266b;

            public c(@NotNull String providerName, Location location) {
                Intrinsics.checkNotNullParameter(providerName, "providerName");
                this.f78265a = providerName;
                this.f78266b = location;
            }

            @NotNull
            public final String a() {
                return this.f78265a;
            }

            public final Location b() {
                return this.f78266b;
            }

            public final Location c() {
                return this.f78266b;
            }

            @NotNull
            public final String d() {
                return this.f78265a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.d(this.f78265a, cVar.f78265a) && Intrinsics.d(this.f78266b, cVar.f78266b);
            }

            public final int hashCode() {
                int hashCode = this.f78265a.hashCode() * 31;
                Location location = this.f78266b;
                return hashCode + (location == null ? 0 : location.hashCode());
            }

            @NotNull
            public final String toString() {
                return "Success(providerName=" + this.f78265a + ", location=" + this.f78266b + ")";
            }
        }
    }

    public z(@NotNull Context context, @NotNull String providerName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f78259a = providerName;
        Intrinsics.checkNotNullParameter(context, "context");
        LocationManager locationManager = (LocationManager) androidx.core.content.a.getSystemService(context, LocationManager.class);
        this.f78260b = locationManager == null ? null : new L(locationManager);
    }

    @NotNull
    public final String b() {
        return this.f78259a;
    }
}
