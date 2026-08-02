package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class lrl {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends lrl {
        public final String a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public static a copy$default(a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.b;
            }
            aVar.getClass();
            str.getClass();
            str2.getClass();
            return new a(str, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(searchQuery=");
            sb.append(this.a);
            sb.append(", message=");
            return lnb.q(sb, this.b, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends lrl {
        public final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String str) {
            super(null);
            str.getClass();
            this.a = str;
        }

        public static b copy$default(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            bVar.getClass();
            str.getClass();
            return new b(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return lnb.q(new StringBuilder("NoResults(searchQuery="), this.a, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d extends lrl {
        public final BlazeDataSourceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull BlazeDataSourceType blazeDataSourceType) {
            super(null);
            blazeDataSourceType.getClass();
            this.a = blazeDataSourceType;
        }

        public static d copy$default(d dVar, BlazeDataSourceType blazeDataSourceType, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeDataSourceType = dVar.a;
            }
            dVar.getClass();
            blazeDataSourceType.getClass();
            return new d(blazeDataSourceType);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.c(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Suggestions(suggestionsDataSource=" + this.a + ')';
        }
    }

    public lrl(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends lrl {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public /* synthetic */ c(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3);
        }

        public static c copy$default(c cVar, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                z = cVar.b;
            }
            if ((i & 4) != 0) {
                z2 = cVar.c;
            }
            if ((i & 8) != 0) {
                z3 = cVar.d;
            }
            cVar.getClass();
            str.getClass();
            return new c(str, z, z2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.c(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + u0a.t(u0a.t(this.a.hashCode() * 31, this.b), this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Results(searchQuery=");
            sb.append(this.a);
            sb.append(", showStories=");
            sb.append(this.b);
            sb.append(", showMoments=");
            sb.append(this.c);
            sb.append(", showVideos=");
            return lnb.r(sb, this.d, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String str, boolean z, boolean z2, boolean z3) {
            super(null);
            str.getClass();
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }
    }
}
