package hZ;

import C.o0;
import Ve.Om;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: hZ.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6894a extends Ud0.a implements ZY.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C1059a> f65228a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<d> f65229b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f65230c;

    /* renamed from: d, reason: collision with root package name */
    private final c f65231d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f65232e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f65233f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f65234g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f65235h;

    /* renamed from: hZ.a$a, reason: collision with other inner class name */
    public static final class C1059a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f65236a;

        /* renamed from: b, reason: collision with root package name */
        private final String f65237b;

        /* renamed from: c, reason: collision with root package name */
        private final String f65238c;

        /* renamed from: d, reason: collision with root package name */
        private final Boolean f65239d;

        public C1059a(@NotNull String hostEquals, String str, String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(hostEquals, "hostEquals");
            this.f65236a = hostEquals;
            this.f65237b = str;
            this.f65238c = str2;
            this.f65239d = bool;
        }

        public final Boolean a() {
            return this.f65239d;
        }

        @NotNull
        public final String b() {
            return this.f65236a;
        }

        public final String c() {
            return this.f65237b;
        }

        public final String d() {
            return this.f65238c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1059a)) {
                return false;
            }
            C1059a c1059a = (C1059a) obj;
            return Intrinsics.d(this.f65236a, c1059a.f65236a) && Intrinsics.d(this.f65237b, c1059a.f65237b) && Intrinsics.d(this.f65238c, c1059a.f65238c) && Intrinsics.d(this.f65239d, c1059a.f65239d);
        }

        public final int hashCode() {
            int hashCode = this.f65236a.hashCode() * 31;
            String str = this.f65237b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f65238c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f65239d;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageRule(hostEquals=");
            sb2.append(this.f65236a);
            sb2.append(", hostToUse=");
            sb2.append(this.f65237b);
            sb2.append(", hostToUseOriginal=");
            sb2.append(this.f65238c);
            sb2.append(", canResize=");
            return D3.g.d(sb2, this.f65239d, ")");
        }
    }

    /* renamed from: hZ.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f65240a;

        public b(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f65240a = url;
        }

        @NotNull
        public final String a() {
            return this.f65240a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f65240a, ((b) obj).f65240a);
        }

        public final int hashCode() {
            return this.f65240a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ImageWarmUpData(url="), this.f65240a, ")");
        }
    }

    /* renamed from: hZ.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f65241a;

        /* renamed from: b, reason: collision with root package name */
        private final long f65242b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C1060a f65243c;

        /* renamed from: hZ.a$c$a, reason: collision with other inner class name */
        public static final class C1060a {

            /* renamed from: a, reason: collision with root package name */
            private final long f65244a;

            /* renamed from: b, reason: collision with root package name */
            private final long f65245b;

            public C1060a(long j11, long j12) {
                this.f65244a = j11;
                this.f65245b = j12;
            }

            public final long a() {
                return this.f65245b;
            }

            public final long b() {
                return this.f65244a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1060a)) {
                    return false;
                }
                C1060a c1060a = (C1060a) obj;
                return this.f65244a == c1060a.f65244a && this.f65245b == c1060a.f65245b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f65245b) + (Long.hashCode(this.f65244a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Jitter(minMs=");
                sb2.append(this.f65244a);
                sb2.append(", maxMs=");
                return P4.f.a(this.f65245b, ")", sb2);
            }
        }

        /* renamed from: hZ.a$c$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f65246a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final ArrayList f65247b;

            /* renamed from: hZ.a$c$b$a, reason: collision with other inner class name */
            public static final class C1061a {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                private final String f65248a;

                /* renamed from: b, reason: collision with root package name */
                @NotNull
                private final String f65249b;

                public C1061a(@NotNull String id2, @NotNull String url) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.f65248a = id2;
                    this.f65249b = url;
                }

                @NotNull
                public final String a() {
                    return this.f65248a;
                }

                @NotNull
                public final String b() {
                    return this.f65249b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1061a)) {
                        return false;
                    }
                    C1061a c1061a = (C1061a) obj;
                    return Intrinsics.d(this.f65248a, c1061a.f65248a) && Intrinsics.d(this.f65249b, c1061a.f65249b);
                }

                public final int hashCode() {
                    return this.f65249b.hashCode() + (this.f65248a.hashCode() * 31);
                }

                @NotNull
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("File(id=");
                    sb2.append(this.f65248a);
                    sb2.append(", url=");
                    return o0.c(sb2, this.f65249b, ")");
                }
            }

            public b(@NotNull String id2, @NotNull ArrayList files) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(files, "files");
                this.f65246a = id2;
                this.f65247b = files;
            }

            @NotNull
            public final List<C1061a> a() {
                return this.f65247b;
            }

            @NotNull
            public final String b() {
                return this.f65246a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.d(this.f65246a, bVar.f65246a) && this.f65247b.equals(bVar.f65247b);
            }

            public final int hashCode() {
                return this.f65247b.hashCode() + (this.f65246a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PointOfPresence(id=");
                sb2.append(this.f65246a);
                sb2.append(", files=");
                return Om.a(")", sb2, this.f65247b);
            }
        }

        public c(@NotNull ArrayList pops, long j11, @NotNull C1060a jitter) {
            Intrinsics.checkNotNullParameter(pops, "pops");
            Intrinsics.checkNotNullParameter(jitter, "jitter");
            this.f65241a = pops;
            this.f65242b = j11;
            this.f65243c = jitter;
        }

        @NotNull
        public final C1060a a() {
            return this.f65243c;
        }

        @NotNull
        public final List<b> b() {
            return this.f65241a;
        }

        public final long c() {
            return this.f65242b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f65241a.equals(cVar.f65241a) && this.f65242b == cVar.f65242b && this.f65243c.equals(cVar.f65243c);
        }

        public final int hashCode() {
            return this.f65243c.hashCode() + Pk0.c.a(this.f65241a.hashCode() * 31, 31, this.f65242b);
        }

        @NotNull
        public final String toString() {
            return "PopsConfig(pops=" + this.f65241a + ", timerFrequencyMs=" + this.f65242b + ", jitter=" + this.f65243c + ")";
        }
    }

    /* renamed from: hZ.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f65250a;

        /* renamed from: b, reason: collision with root package name */
        private final String f65251b;

        /* renamed from: c, reason: collision with root package name */
        private final String f65252c;

        public d(@NotNull String hostEquals, String str, String str2) {
            Intrinsics.checkNotNullParameter(hostEquals, "hostEquals");
            this.f65250a = hostEquals;
            this.f65251b = str;
            this.f65252c = str2;
        }

        @NotNull
        public final String a() {
            return this.f65250a;
        }

        public final String b() {
            return this.f65251b;
        }

        public final String c() {
            return this.f65252c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f65250a, dVar.f65250a) && Intrinsics.d(this.f65251b, dVar.f65251b) && Intrinsics.d(this.f65252c, dVar.f65252c);
        }

        public final int hashCode() {
            int hashCode = this.f65250a.hashCode() * 31;
            String str = this.f65251b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f65252c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VideoRule(hostEquals=");
            sb2.append(this.f65250a);
            sb2.append(", hostToUse=");
            sb2.append(this.f65251b);
            sb2.append(", type=");
            return o0.c(sb2, this.f65252c, ")");
        }
    }

    public C6894a(@NotNull List<C1059a> imageRules, @NotNull List<d> videoRules, List<b> list, c cVar) {
        Intrinsics.checkNotNullParameter(imageRules, "imageRules");
        Intrinsics.checkNotNullParameter(videoRules, "videoRules");
        this.f65228a = imageRules;
        this.f65229b = videoRules;
        this.f65230c = list;
        this.f65231d = cVar;
        List<C1059a> list2 = imageRules;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (C1059a c1059a : list2) {
            Intrinsics.checkNotNullParameter(c1059a, "<this>");
            arrayList.add(new C6898e(c1059a));
        }
        this.f65232e = arrayList;
        List<d> list3 = this.f65229b;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            Intrinsics.checkNotNullParameter((d) it.next(), "<this>");
            arrayList2.add(new g());
        }
        List<b> list4 = this.f65230c;
        ArrayList arrayList3 = null;
        if (list4 != null) {
            List<b> list5 = list4;
            arrayList3 = new ArrayList(C7714v.z(list5, 10));
            for (b bVar : list5) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList3.add(new C6899f(bVar));
            }
        }
        this.f65233f = arrayList3;
        List<C1059a> list6 = this.f65228a;
        ArrayList arrayList4 = new ArrayList(C7714v.z(list6, 10));
        for (C1059a c1059a2 : list6) {
            Intrinsics.checkNotNullParameter(c1059a2, "<this>");
            arrayList4.add(new C6895b(c1059a2));
        }
        this.f65234g = arrayList4;
        List<d> list7 = this.f65229b;
        ArrayList arrayList5 = new ArrayList(C7714v.z(list7, 10));
        for (d dVar : list7) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            arrayList5.add(new C6897d(dVar));
        }
        this.f65235h = arrayList5;
        List<b> list8 = this.f65230c;
        if (list8 != null) {
            List<b> list9 = list8;
            ArrayList arrayList6 = new ArrayList(C7714v.z(list9, 10));
            Iterator<T> it2 = list9.iterator();
            while (it2.hasNext()) {
                Intrinsics.checkNotNullParameter((b) it2.next(), "<this>");
                arrayList6.add(new C6896c());
            }
        }
    }

    @Override // ZY.a
    @NotNull
    public final ArrayList a() {
        return this.f65234g;
    }

    @Override // ZY.a
    @NotNull
    public final ArrayList b() {
        return this.f65235h;
    }

    @Override // Ud0.a
    @NotNull
    public final ArrayList c() {
        return this.f65232e;
    }

    @Override // Ud0.a
    public final ArrayList d() {
        return this.f65233f;
    }

    public final c e() {
        return this.f65231d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6894a)) {
            return false;
        }
        C6894a c6894a = (C6894a) obj;
        return Intrinsics.d(this.f65228a, c6894a.f65228a) && Intrinsics.d(this.f65229b, c6894a.f65229b) && Intrinsics.d(this.f65230c, c6894a.f65230c) && Intrinsics.d(this.f65231d, c6894a.f65231d);
    }

    public final int hashCode() {
        int b11 = G.g.b(this.f65228a.hashCode() * 31, 31, this.f65229b);
        List<b> list = this.f65230c;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.f65231d;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "OzonCdnChooserConfig(imageRules=" + this.f65228a + ", videoRules=" + this.f65229b + ", imageWarmUpData=" + this.f65230c + ", popsConfig=" + this.f65231d + ")";
    }
}
