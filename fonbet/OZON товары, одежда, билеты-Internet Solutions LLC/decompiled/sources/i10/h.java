package i10;

import A00.a;
import C.J;
import C.o0;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import i10.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f65720a;

    /* renamed from: b, reason: collision with root package name */
    private final g f65721b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Object> f65722c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Object> f65723d;

    /* renamed from: e, reason: collision with root package name */
    private final a f65724e;

    /* renamed from: f, reason: collision with root package name */
    private final b f65725f;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1077a();

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f65726a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final g f65727b;

        /* renamed from: i10.h$a$a, reason: collision with other inner class name */
        public static final class C1077a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(a.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new a(linkedHashMap, g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(Map<String, ? extends Object> map, @NotNull g requestMethod) {
            Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
            this.f65726a = map;
            this.f65727b = requestMethod;
        }

        public static a a(a aVar, Map map) {
            g requestMethod = aVar.f65727b;
            Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
            return new a(map, requestMethod);
        }

        public final Map<String, Object> b() {
            return this.f65726a;
        }

        @NotNull
        public final g c() {
            return this.f65727b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f65726a, aVar.f65726a) && this.f65727b == aVar.f65727b;
        }

        public final int hashCode() {
            Map<String, Object> map = this.f65726a;
            return this.f65727b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "OneTimeConfig(params=" + this.f65726a + ", requestMethod=" + this.f65727b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map<String, Object> map = this.f65726a;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeValue(entry.getValue());
                }
            }
            dest.writeString(this.f65727b.name());
        }
    }

    public static abstract class c implements Parcelable {

        public static final class b extends c {

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f65734a;

            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull String value) {
                super(0);
                Intrinsics.checkNotNullParameter(value, "value");
                this.f65734a = value;
            }

            @NotNull
            public final String a() {
                return this.f65734a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.d(this.f65734a, ((b) obj).f65734a);
            }

            public final int hashCode() {
                return this.f65734a.hashCode();
            }

            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("Json(value="), this.f65734a, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65734a);
            }
        }

        public /* synthetic */ c(int i11) {
            this();
        }

        public static final class a extends c {

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C1078a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f65730a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f65731b;

            /* renamed from: c, reason: collision with root package name */
            private final String f65732c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private final HashMap<String, Object> f65733d;

            /* renamed from: i10.h$c$a$a, reason: collision with other inner class name */
            public static final class C1078a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    int readInt = parcel.readInt();
                    HashMap hashMap = new HashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        hashMap.put(parcel.readString(), parcel.readValue(a.class.getClassLoader()));
                    }
                    return new a(readString, readString2, readString3, (HashMap<String, Object>) hashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            public /* synthetic */ a(String str, String str2, String str3, int i11) {
                this(str, (i11 & 2) != 0 ? str : str2, (i11 & 4) != 0 ? str : str3, (HashMap<String, Object>) new HashMap());
            }

            public static a b(a aVar, String rootUrl, String refreshUrl, String str, int i11) {
                if ((i11 & 1) != 0) {
                    rootUrl = aVar.f65730a;
                }
                if ((i11 & 2) != 0) {
                    refreshUrl = aVar.f65731b;
                }
                HashMap<String, Object> params = aVar.f65733d;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(rootUrl, "rootUrl");
                Intrinsics.checkNotNullParameter(refreshUrl, "refreshUrl");
                Intrinsics.checkNotNullParameter(params, "params");
                return new a(rootUrl, refreshUrl, str, params);
            }

            public final void a(@NotNull String value) {
                Intrinsics.checkNotNullParameter("redirectKey", "key");
                Intrinsics.checkNotNullParameter(value, "value");
                if ((value instanceof Parcelable) || value != null) {
                    this.f65733d.put("redirectKey", value);
                } else {
                    H00.c.e(new i(value));
                }
            }

            public final String c() {
                return this.f65732c;
            }

            @NotNull
            public final HashMap<String, Object> d() {
                return this.f65733d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @NotNull
            public final String e() {
                return this.f65731b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f65730a, aVar.f65730a) && Intrinsics.d(this.f65731b, aVar.f65731b) && Intrinsics.d(this.f65732c, aVar.f65732c) && Intrinsics.d(this.f65733d, aVar.f65733d);
            }

            @NotNull
            public final String f() {
                return this.f65730a;
            }

            public final int hashCode() {
                int a11 = G.g.a(this.f65730a.hashCode() * 31, 31, this.f65731b);
                String str = this.f65732c;
                return this.f65733d.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
            }

            @NotNull
            public final String toString() {
                return "Deeplink(rootUrl=" + this.f65730a + ", refreshUrl=" + this.f65731b + ", currentUrl=" + this.f65732c + ", params=" + this.f65733d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65730a);
                dest.writeString(this.f65731b);
                dest.writeString(this.f65732c);
                HashMap<String, Object> hashMap = this.f65733d;
                dest.writeInt(hashMap.size());
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeValue(entry.getValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String rootUrl, @NotNull String refreshUrl, String str, @NotNull HashMap<String, Object> params) {
                super(0);
                Intrinsics.checkNotNullParameter(rootUrl, "rootUrl");
                Intrinsics.checkNotNullParameter(refreshUrl, "refreshUrl");
                Intrinsics.checkNotNullParameter(params, "params");
                this.f65730a = rootUrl;
                this.f65731b = refreshUrl;
                this.f65732c = str;
                this.f65733d = params;
            }
        }

        private c() {
        }
    }

    public h(@NotNull c pageRef, g gVar, @NotNull ConcurrentHashMap<String, Object> parameters, @NotNull ConcurrentHashMap<String, Object> permanentParams, a aVar, b bVar) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(permanentParams, "permanentParams");
        this.f65720a = pageRef;
        this.f65721b = gVar;
        this.f65722c = parameters;
        this.f65723d = permanentParams;
        this.f65724e = aVar;
        this.f65725f = bVar;
    }

    public static h a(h hVar, c cVar, g gVar, ConcurrentHashMap concurrentHashMap, a aVar, b bVar, int i11) {
        if ((i11 & 1) != 0) {
            cVar = hVar.f65720a;
        }
        c pageRef = cVar;
        if ((i11 & 2) != 0) {
            gVar = hVar.f65721b;
        }
        g gVar2 = gVar;
        if ((i11 & 4) != 0) {
            concurrentHashMap = hVar.f65722c;
        }
        ConcurrentHashMap parameters = concurrentHashMap;
        ConcurrentHashMap<String, Object> permanentParams = hVar.f65723d;
        if ((i11 & 16) != 0) {
            aVar = hVar.f65724e;
        }
        a aVar2 = aVar;
        if ((i11 & 32) != 0) {
            bVar = hVar.f65725f;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(permanentParams, "permanentParams");
        return new h(pageRef, gVar2, parameters, permanentParams, aVar2, bVar);
    }

    public final a b() {
        return this.f65724e;
    }

    public final b c() {
        return this.f65725f;
    }

    @NotNull
    public final c d() {
        return this.f65720a;
    }

    @NotNull
    public final ConcurrentHashMap<String, Object> e() {
        return this.f65722c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f65720a, hVar.f65720a) && this.f65721b == hVar.f65721b && Intrinsics.d(this.f65722c, hVar.f65722c) && Intrinsics.d(this.f65723d, hVar.f65723d) && Intrinsics.d(this.f65724e, hVar.f65724e) && Intrinsics.d(this.f65725f, hVar.f65725f);
    }

    @NotNull
    public final ConcurrentHashMap<String, Object> f() {
        return this.f65723d;
    }

    public final g g() {
        return this.f65721b;
    }

    @NotNull
    public final g h() {
        g c11;
        a aVar = this.f65724e;
        if (aVar != null && (c11 = aVar.c()) != null) {
            return c11;
        }
        g gVar = this.f65721b;
        return gVar == null ? g.GET : gVar;
    }

    public final int hashCode() {
        int hashCode = this.f65720a.hashCode() * 31;
        g gVar = this.f65721b;
        int hashCode2 = (this.f65723d.hashCode() + ((this.f65722c.hashCode() + ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31)) * 31;
        a aVar = this.f65724e;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f65725f;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public final Tc.d i() {
        Map<String, Object> b11;
        Tc.d builder = new Tc.d();
        builder.putAll(this.f65723d);
        builder.putAll(this.f65722c);
        a aVar = this.f65724e;
        if (aVar != null && (b11 = aVar.b()) != null) {
            builder.putAll(b11);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    public final String j() {
        c cVar = this.f65720a;
        c.a aVar = cVar instanceof c.a ? (c.a) cVar : null;
        if (aVar != null) {
            return aVar.f();
        }
        return null;
    }

    @NotNull
    public final String toString() {
        return "ComposerRequestState(pageRef=" + this.f65720a + ", requestMethod=" + this.f65721b + ", parameters=" + this.f65722c + ", permanentParams=" + this.f65723d + ", oneTimeConfig=" + this.f65724e + ", oneTimePostProcessing=" + this.f65725f + ")";
    }

    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final A00.e f65728a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final l.a f65729b;

        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readInt() == 0 ? null : A00.e.CREATOR.createFromParcel(parcel), (l.a) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(A00.e eVar, @NotNull l.a loaderType) {
            Intrinsics.checkNotNullParameter(loaderType, "loaderType");
            this.f65728a = eVar;
            this.f65729b = loaderType;
        }

        @NotNull
        public final l.a a() {
            return this.f65729b;
        }

        public final A00.e b() {
            return this.f65728a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f65728a, bVar.f65728a) && Intrinsics.d(this.f65729b, bVar.f65729b);
        }

        public final int hashCode() {
            A00.e eVar = this.f65728a;
            return this.f65729b.hashCode() + ((eVar != null ? eVar.hashCode() : 0) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OneTimePostProcessing(scrollEvent=");
            A00.e eVar = this.f65728a;
            sb2.append(eVar);
            sb2.append(", loaderType=");
            sb2.append(this.f65729b);
            sb2.append(", scroll=");
            sb2.append(eVar);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            A00.e eVar = this.f65728a;
            if (eVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eVar.writeToParcel(dest, i11);
            }
            dest.writeParcelable(this.f65729b, i11);
        }

        public /* synthetic */ b(A00.e eVar) {
            this(eVar, new l.a.b(0L, null, 3));
        }

        @InterfaceC3999a
        public b() {
            this((a.C) null, new l.a.b(0L, null, 3));
        }

        public /* synthetic */ b(a.C c11, l.a.b bVar, int i11) {
            this((i11 & 1) != 0 ? null : c11, (i11 & 2) != 0 ? new l.a.b(0L, null, 3) : bVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC3999a
        public b(a.C c11, @NotNull l.a loaderType) {
            this(c11 != null ? c11.d() : null, loaderType);
            Intrinsics.checkNotNullParameter(loaderType, "loaderType");
        }
    }

    public /* synthetic */ h(c cVar, g gVar) {
        this(cVar, gVar, new ConcurrentHashMap(), new ConcurrentHashMap(), null, null);
    }
}
