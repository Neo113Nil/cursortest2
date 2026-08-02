package com.RNAppleAuthentication;

import com.twilio.voice.EventKeys;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f28124a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28125b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28126c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28127d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28128e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28129f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28130g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28131h;

    /* renamed from: com.RNAppleAuthentication.a$a, reason: collision with other inner class name */
    public static final class C0454a {

        /* renamed from: a, reason: collision with root package name */
        public String f28132a;

        /* renamed from: b, reason: collision with root package name */
        public String f28133b;

        /* renamed from: c, reason: collision with root package name */
        public String f28134c;

        /* renamed from: d, reason: collision with root package name */
        public String f28135d;

        /* renamed from: e, reason: collision with root package name */
        public String f28136e;

        /* renamed from: f, reason: collision with root package name */
        public String f28137f;

        /* renamed from: g, reason: collision with root package name */
        public String f28138g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f28139h = true;

        public final a a() {
            String str = this.f28132a;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientId");
                str = null;
            }
            String str3 = this.f28133b;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("redirectUri");
                str3 = null;
            }
            String str4 = this.f28134c;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scope");
                str4 = null;
            }
            String str5 = this.f28135d;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("responseType");
                str5 = null;
            }
            String str6 = this.f28136e;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("state");
                str6 = null;
            }
            String str7 = this.f28137f;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rawNonce");
                str7 = null;
            }
            String str8 = this.f28138g;
            if (str8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nonce");
            } else {
                str2 = str8;
            }
            return new a(str, str3, str4, str5, str6, str7, str2, this.f28139h, null);
        }

        public final C0454a b(String clientId) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            this.f28132a = clientId;
            return this;
        }

        public final C0454a c(boolean z10) {
            this.f28139h = z10;
            return this;
        }

        public final C0454a d(String nonce) {
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            this.f28138g = nonce;
            return this;
        }

        public final C0454a e(String rawNonce) {
            Intrinsics.checkNotNullParameter(rawNonce, "rawNonce");
            this.f28137f = rawNonce;
            return this;
        }

        public final C0454a f(String redirectUri) {
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            this.f28133b = redirectUri;
            return this;
        }

        public final C0454a g(b type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f28135d = type.b();
            return this;
        }

        public final C0454a h(c scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f28134c = scope.b();
            return this;
        }

        public final C0454a i(String state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f28136e = state;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final b f28140a = new C0456b("CODE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f28141b = new c("ID_TOKEN", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f28142c = new C0455a("ALL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f28143d;

        /* renamed from: com.RNAppleAuthentication.a$b$a, reason: collision with other inner class name */
        public static final class C0455a extends b {
            public C0455a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String b() {
                return "code id_token";
            }
        }

        /* renamed from: com.RNAppleAuthentication.a$b$b, reason: collision with other inner class name */
        public static final class C0456b extends b {
            public C0456b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String b() {
                return EventKeys.ERROR_CODE;
            }
        }

        public static final class c extends b {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String b() {
                return "id_token";
            }
        }

        static {
            b[] a10 = a();
            $VALUES = a10;
            f28143d = EnumEntriesKt.enumEntries(a10);
        }

        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f28140a, f28141b, f28142c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract String b();

        public b(String str, int i10) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final c f28144a = new C0458c("NAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f28145b = new b("EMAIL", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f28146c = new C0457a("ALL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f28147d;

        /* renamed from: com.RNAppleAuthentication.a$c$a, reason: collision with other inner class name */
        public static final class C0457a extends c {
            public C0457a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String b() {
                return "name email";
            }
        }

        public static final class b extends c {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String b() {
                return "email";
            }
        }

        /* renamed from: com.RNAppleAuthentication.a$c$c, reason: collision with other inner class name */
        public static final class C0458c extends c {
            public C0458c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String b() {
                return "name";
            }
        }

        static {
            c[] a10 = a();
            $VALUES = a10;
            f28147d = EnumEntriesKt.enumEntries(a10);
        }

        public /* synthetic */ c(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f28144a, f28145b, f28146c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public abstract String b();

        public c(String str, int i10) {
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, z10);
    }

    public final String a() {
        return this.f28124a;
    }

    public final boolean b() {
        return this.f28131h;
    }

    public final String c() {
        return this.f28130g;
    }

    public final String d() {
        return this.f28129f;
    }

    public final String e() {
        return this.f28125b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f28124a, aVar.f28124a) && Intrinsics.areEqual(this.f28125b, aVar.f28125b) && Intrinsics.areEqual(this.f28126c, aVar.f28126c) && Intrinsics.areEqual(this.f28127d, aVar.f28127d) && Intrinsics.areEqual(this.f28128e, aVar.f28128e) && Intrinsics.areEqual(this.f28129f, aVar.f28129f) && Intrinsics.areEqual(this.f28130g, aVar.f28130g) && this.f28131h == aVar.f28131h;
    }

    public final String f() {
        return this.f28127d;
    }

    public final String g() {
        return this.f28126c;
    }

    public final String h() {
        return this.f28128e;
    }

    public int hashCode() {
        return (((((((((((((this.f28124a.hashCode() * 31) + this.f28125b.hashCode()) * 31) + this.f28126c.hashCode()) * 31) + this.f28127d.hashCode()) * 31) + this.f28128e.hashCode()) * 31) + this.f28129f.hashCode()) * 31) + this.f28130g.hashCode()) * 31) + Boolean.hashCode(this.f28131h);
    }

    public String toString() {
        return "SignInWithAppleConfiguration(clientId=" + this.f28124a + ", redirectUri=" + this.f28125b + ", scope=" + this.f28126c + ", responseType=" + this.f28127d + ", state=" + this.f28128e + ", rawNonce=" + this.f28129f + ", nonce=" + this.f28130g + ", fullScreen=" + this.f28131h + ")";
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10) {
        this.f28124a = str;
        this.f28125b = str2;
        this.f28126c = str3;
        this.f28127d = str4;
        this.f28128e = str5;
        this.f28129f = str6;
        this.f28130g = str7;
        this.f28131h = z10;
    }
}
