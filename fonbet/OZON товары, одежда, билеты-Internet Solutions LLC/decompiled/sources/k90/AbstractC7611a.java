package k90;

import B0.C2454a;
import C.o0;
import G.g;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: k90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7611a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f71110a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f71111b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f71112c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f71113d;

    /* renamed from: e, reason: collision with root package name */
    private final int f71114e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f71115f;

    /* renamed from: g, reason: collision with root package name */
    private final String f71116g;

    /* renamed from: k90.a$a, reason: collision with other inner class name */
    public static final class C1161a extends AbstractC7611a {

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final String f71117h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final String f71118i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final String f71119j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final String f71120k;

        /* renamed from: l, reason: collision with root package name */
        private final Integer f71121l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final String f71122m;

        /* renamed from: n, reason: collision with root package name */
        private final int f71123n;

        /* renamed from: o, reason: collision with root package name */
        private final String f71124o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1161a(@NotNull String commId, @NotNull String messageId, @NotNull String title, @NotNull String body, Integer num, @NotNull String url, int i11, String str) {
            super(i11, num, messageId, title, body, url, str);
            Intrinsics.checkNotNullParameter(commId, "commId");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f71117h = commId;
            this.f71118i = messageId;
            this.f71119j = title;
            this.f71120k = body;
            this.f71121l = num;
            this.f71122m = url;
            this.f71123n = i11;
            this.f71124o = str;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String a() {
            return this.f71120k;
        }

        @Override // k90.AbstractC7611a
        public final Integer b() {
            return this.f71121l;
        }

        @Override // k90.AbstractC7611a
        public final String c() {
            return this.f71124o;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String d() {
            return this.f71118i;
        }

        @Override // k90.AbstractC7611a
        public final int e() {
            return this.f71123n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1161a)) {
                return false;
            }
            C1161a c1161a = (C1161a) obj;
            return Intrinsics.d(this.f71117h, c1161a.f71117h) && Intrinsics.d(this.f71118i, c1161a.f71118i) && Intrinsics.d(this.f71119j, c1161a.f71119j) && Intrinsics.d(this.f71120k, c1161a.f71120k) && Intrinsics.d(this.f71121l, c1161a.f71121l) && Intrinsics.d(this.f71122m, c1161a.f71122m) && this.f71123n == c1161a.f71123n && Intrinsics.d(this.f71124o, c1161a.f71124o);
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String f() {
            return this.f71119j;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String g() {
            return this.f71122m;
        }

        public final int hashCode() {
            int a11 = g.a(g.a(g.a(this.f71117h.hashCode() * 31, 31, this.f71118i), 31, this.f71119j), 31, this.f71120k);
            Integer num = this.f71121l;
            int a12 = C2454a.a(this.f71123n, g.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f71122m), 31);
            String str = this.f71124o;
            return a12 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BankDefault(commId=");
            sb2.append(this.f71117h);
            sb2.append(", messageId=");
            sb2.append(this.f71118i);
            sb2.append(", title=");
            sb2.append(this.f71119j);
            sb2.append(", body=");
            sb2.append(this.f71120k);
            sb2.append(", icon=");
            sb2.append(this.f71121l);
            sb2.append(", url=");
            sb2.append(this.f71122m);
            sb2.append(", requestCode=");
            sb2.append(this.f71123n);
            sb2.append(", iconUrl=");
            return o0.c(sb2, this.f71124o, ")");
        }
    }

    /* renamed from: k90.a$b */
    public static final class b extends AbstractC7611a {

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final String f71125h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final String f71126i;

        /* renamed from: j, reason: collision with root package name */
        private final String f71127j;

        /* renamed from: k, reason: collision with root package name */
        private final String f71128k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final String f71129l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final String f71130m;

        /* renamed from: n, reason: collision with root package name */
        private final Integer f71131n;

        /* renamed from: o, reason: collision with root package name */
        @NotNull
        private final String f71132o;

        /* renamed from: p, reason: collision with root package name */
        private final int f71133p;

        /* renamed from: q, reason: collision with root package name */
        private final String f71134q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String commId, @NotNull String messageId, String str, String str2, @NotNull String title, @NotNull String body, Integer num, @NotNull String url, int i11, String str3) {
            super(i11, num, messageId, title, body, url, str3);
            Intrinsics.checkNotNullParameter(commId, "commId");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f71125h = commId;
            this.f71126i = messageId;
            this.f71127j = str;
            this.f71128k = str2;
            this.f71129l = title;
            this.f71130m = body;
            this.f71131n = num;
            this.f71132o = url;
            this.f71133p = i11;
            this.f71134q = str3;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String a() {
            return this.f71130m;
        }

        @Override // k90.AbstractC7611a
        public final Integer b() {
            return this.f71131n;
        }

        @Override // k90.AbstractC7611a
        public final String c() {
            return this.f71134q;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String d() {
            return this.f71126i;
        }

        @Override // k90.AbstractC7611a
        public final int e() {
            return this.f71133p;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f71125h, bVar.f71125h) && Intrinsics.d(this.f71126i, bVar.f71126i) && Intrinsics.d(this.f71127j, bVar.f71127j) && Intrinsics.d(this.f71128k, bVar.f71128k) && Intrinsics.d(this.f71129l, bVar.f71129l) && Intrinsics.d(this.f71130m, bVar.f71130m) && Intrinsics.d(this.f71131n, bVar.f71131n) && Intrinsics.d(this.f71132o, bVar.f71132o) && this.f71133p == bVar.f71133p && Intrinsics.d(this.f71134q, bVar.f71134q);
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String f() {
            return this.f71129l;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String g() {
            return this.f71132o;
        }

        public final String h() {
            return this.f71128k;
        }

        public final int hashCode() {
            int a11 = g.a(this.f71125h.hashCode() * 31, 31, this.f71126i);
            String str = this.f71127j;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f71128k;
            int a12 = g.a(g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f71129l), 31, this.f71130m);
            Integer num = this.f71131n;
            int a13 = C2454a.a(this.f71133p, g.a((a12 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f71132o), 31);
            String str3 = this.f71134q;
            return a13 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String i() {
            return this.f71127j;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BankOtp(commId=");
            sb2.append(this.f71125h);
            sb2.append(", messageId=");
            sb2.append(this.f71126i);
            sb2.append(", otpCode=");
            sb2.append(this.f71127j);
            sb2.append(", copyAction=");
            sb2.append(this.f71128k);
            sb2.append(", title=");
            sb2.append(this.f71129l);
            sb2.append(", body=");
            sb2.append(this.f71130m);
            sb2.append(", icon=");
            sb2.append(this.f71131n);
            sb2.append(", url=");
            sb2.append(this.f71132o);
            sb2.append(", requestCode=");
            sb2.append(this.f71133p);
            sb2.append(", iconUrl=");
            return o0.c(sb2, this.f71134q, ")");
        }
    }

    /* renamed from: k90.a$c */
    public static final class c extends AbstractC7611a {

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final String f71135h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final String f71136i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final String f71137j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final String f71138k;

        /* renamed from: l, reason: collision with root package name */
        private final Integer f71139l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final String f71140m;

        /* renamed from: n, reason: collision with root package name */
        private final int f71141n;

        /* renamed from: o, reason: collision with root package name */
        private final boolean f71142o;

        /* renamed from: p, reason: collision with root package name */
        private final String f71143p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String commId, @NotNull String messageId, @NotNull String title, @NotNull String body, Integer num, @NotNull String url, int i11, boolean z11, String str) {
            super(i11, num, messageId, title, body, url, str);
            Intrinsics.checkNotNullParameter(commId, "commId");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f71135h = commId;
            this.f71136i = messageId;
            this.f71137j = title;
            this.f71138k = body;
            this.f71139l = num;
            this.f71140m = url;
            this.f71141n = i11;
            this.f71142o = z11;
            this.f71143p = str;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String a() {
            return this.f71138k;
        }

        @Override // k90.AbstractC7611a
        public final Integer b() {
            return this.f71139l;
        }

        @Override // k90.AbstractC7611a
        public final String c() {
            return this.f71143p;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String d() {
            return this.f71136i;
        }

        @Override // k90.AbstractC7611a
        public final int e() {
            return this.f71141n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f71135h, cVar.f71135h) && Intrinsics.d(this.f71136i, cVar.f71136i) && Intrinsics.d(this.f71137j, cVar.f71137j) && Intrinsics.d(this.f71138k, cVar.f71138k) && Intrinsics.d(this.f71139l, cVar.f71139l) && Intrinsics.d(this.f71140m, cVar.f71140m) && this.f71141n == cVar.f71141n && this.f71142o == cVar.f71142o && Intrinsics.d(this.f71143p, cVar.f71143p);
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String f() {
            return this.f71137j;
        }

        @Override // k90.AbstractC7611a
        @NotNull
        public final String g() {
            return this.f71140m;
        }

        public final boolean h() {
            return this.f71142o;
        }

        public final int hashCode() {
            int a11 = g.a(g.a(g.a(this.f71135h.hashCode() * 31, 31, this.f71136i), 31, this.f71137j), 31, this.f71138k);
            Integer num = this.f71139l;
            int a12 = C3532b.a(C2454a.a(this.f71141n, g.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f71140m), 31), 31, this.f71142o);
            String str = this.f71143p;
            return a12 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BankSecure(commId=");
            sb2.append(this.f71135h);
            sb2.append(", messageId=");
            sb2.append(this.f71136i);
            sb2.append(", title=");
            sb2.append(this.f71137j);
            sb2.append(", body=");
            sb2.append(this.f71138k);
            sb2.append(", icon=");
            sb2.append(this.f71139l);
            sb2.append(", url=");
            sb2.append(this.f71140m);
            sb2.append(", requestCode=");
            sb2.append(this.f71141n);
            sb2.append(", isFromJson=");
            sb2.append(this.f71142o);
            sb2.append(", iconUrl=");
            return o0.c(sb2, this.f71143p, ")");
        }
    }

    public AbstractC7611a(int i11, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.f71110a = str;
        this.f71111b = str2;
        this.f71112c = str3;
        this.f71113d = num;
        this.f71114e = i11;
        this.f71115f = str4;
        this.f71116g = str5;
    }

    @NotNull
    public String a() {
        return this.f71112c;
    }

    public Integer b() {
        return this.f71113d;
    }

    public String c() {
        return this.f71116g;
    }

    @NotNull
    public String d() {
        return this.f71110a;
    }

    public int e() {
        return this.f71114e;
    }

    @NotNull
    public String f() {
        return this.f71111b;
    }

    @NotNull
    public String g() {
        return this.f71115f;
    }
}
