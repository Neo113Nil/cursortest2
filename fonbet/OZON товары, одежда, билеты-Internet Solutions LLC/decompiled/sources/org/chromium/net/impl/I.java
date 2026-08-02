package org.chromium.net.impl;

import java.time.Duration;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes6.dex */
public abstract class I {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f78819a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f78820b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f78821c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f78822d;

        /* renamed from: e, reason: collision with root package name */
        private final int f78823e;

        /* renamed from: f, reason: collision with root package name */
        private final String f78824f;

        /* renamed from: g, reason: collision with root package name */
        private final long f78825g;

        public a(boolean z11, boolean z12, boolean z13, boolean z14, int i11, String str, long j11) {
            this.f78819a = z11;
            this.f78820b = z12;
            this.f78821c = z13;
            this.f78822d = z14;
            this.f78823e = i11;
            this.f78824f = str;
            this.f78825g = j11;
        }

        public final long a() {
            return this.f78825g;
        }

        public final String b() {
            return this.f78824f;
        }

        public final int c() {
            return this.f78823e;
        }

        public final boolean d() {
            return this.f78822d;
        }

        public final boolean e() {
            return this.f78821c;
        }

        public final boolean f() {
            return this.f78819a;
        }

        public final boolean g() {
            return this.f78820b;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public long f78826a;

        /* renamed from: b, reason: collision with root package name */
        public a f78827b;

        /* renamed from: c, reason: collision with root package name */
        public int f78828c = -1;

        /* renamed from: d, reason: collision with root package name */
        public d f78829d = d.CRONET_SOURCE_UNSPECIFIED;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f78830e;

        /* renamed from: f, reason: collision with root package name */
        public f f78831f;

        /* renamed from: g, reason: collision with root package name */
        public f f78832g;

        /* renamed from: h, reason: collision with root package name */
        public int f78833h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ a[] $VALUES;
            public static final a API;
            public static final a IMPL;

            static {
                a aVar = new a("API", 0);
                API = aVar;
                a aVar2 = new a("IMPL", 1);
                IMPL = aVar2;
                $VALUES = new a[]{aVar, aVar2};
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
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public long f78834a;

        /* renamed from: b, reason: collision with root package name */
        public int f78835b;

        /* renamed from: c, reason: collision with root package name */
        public int f78836c;

        /* renamed from: d, reason: collision with root package name */
        public String f78837d;

        /* renamed from: e, reason: collision with root package name */
        public d f78838e;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d CRONET_SOURCE_FAKE;
        public static final d CRONET_SOURCE_FALLBACK;
        public static final d CRONET_SOURCE_PLATFORM;
        public static final d CRONET_SOURCE_PLAY_SERVICES;
        public static final d CRONET_SOURCE_STATICALLY_LINKED;
        public static final d CRONET_SOURCE_UNSPECIFIED;

        static {
            d dVar = new d("CRONET_SOURCE_UNSPECIFIED", 0);
            CRONET_SOURCE_UNSPECIFIED = dVar;
            d dVar2 = new d("CRONET_SOURCE_STATICALLY_LINKED", 1);
            CRONET_SOURCE_STATICALLY_LINKED = dVar2;
            d dVar3 = new d("CRONET_SOURCE_PLAY_SERVICES", 2);
            CRONET_SOURCE_PLAY_SERVICES = dVar3;
            d dVar4 = new d("CRONET_SOURCE_FALLBACK", 3);
            CRONET_SOURCE_FALLBACK = dVar4;
            d dVar5 = new d("CRONET_SOURCE_PLATFORM", 4);
            CRONET_SOURCE_PLATFORM = dVar5;
            d dVar6 = new d("CRONET_SOURCE_FAKE", 5);
            CRONET_SOURCE_FAKE = dVar6;
            $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final long f78839a;

        /* renamed from: b, reason: collision with root package name */
        private final long f78840b;

        /* renamed from: c, reason: collision with root package name */
        private final long f78841c;

        /* renamed from: d, reason: collision with root package name */
        private final long f78842d;

        /* renamed from: e, reason: collision with root package name */
        private final int f78843e;

        /* renamed from: f, reason: collision with root package name */
        private final Duration f78844f;

        /* renamed from: g, reason: collision with root package name */
        private final Duration f78845g;

        /* renamed from: h, reason: collision with root package name */
        private final String f78846h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f78847i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f78848j;

        /* renamed from: k, reason: collision with root package name */
        private final b f78849k;

        /* renamed from: l, reason: collision with root package name */
        private final int f78850l;

        /* renamed from: m, reason: collision with root package name */
        private final int f78851m;

        /* renamed from: n, reason: collision with root package name */
        private final int f78852n;

        /* renamed from: o, reason: collision with root package name */
        private final boolean f78853o;

        /* renamed from: p, reason: collision with root package name */
        private final int f78854p;

        /* renamed from: q, reason: collision with root package name */
        private final int f78855q;

        /* renamed from: r, reason: collision with root package name */
        private final int f78856r;

        /* renamed from: s, reason: collision with root package name */
        private final int f78857s;

        /* renamed from: t, reason: collision with root package name */
        private final a f78858t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f78859u;

        /* renamed from: v, reason: collision with root package name */
        private final String f78860v;

        /* renamed from: w, reason: collision with root package name */
        private final d f78861w;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ a[] $VALUES;
            public static final a NETWORK;
            public static final a OTHER;
            public static final a UNKNOWN;

            static {
                a aVar = new a(FraudMonInfo.UNKNOWN, 0);
                UNKNOWN = aVar;
                a aVar2 = new a("NETWORK", 1);
                NETWORK = aVar2;
                a aVar3 = new a("OTHER", 2);
                OTHER = aVar3;
                $VALUES = new a[]{aVar, aVar2, aVar3};
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            private static final /* synthetic */ b[] $VALUES;
            public static final b CANCELLED;
            public static final b ERROR;
            public static final b SUCCEEDED;

            static {
                b bVar = new b("SUCCEEDED", 0);
                SUCCEEDED = bVar;
                b bVar2 = new b("ERROR", 1);
                ERROR = bVar2;
                b bVar3 = new b("CANCELLED", 2);
                CANCELLED = bVar3;
                $VALUES = new b[]{bVar, bVar2, bVar3};
            }

            private b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public e(long j11, long j12, long j13, long j14, int i11, Duration duration, Duration duration2, String str, boolean z11, boolean z12, b bVar, int i12, int i13, int i14, boolean z13, int i15, int i16, int i17, int i18, a aVar, boolean z14, String str2, d dVar) {
            this.f78839a = j11;
            this.f78840b = j12;
            this.f78841c = j13;
            this.f78842d = j14;
            this.f78843e = i11;
            this.f78844f = duration;
            this.f78845g = duration2;
            this.f78846h = str;
            this.f78847i = z11;
            this.f78848j = z12;
            this.f78849k = bVar;
            this.f78850l = i12;
            this.f78851m = i13;
            this.f78852n = i14;
            this.f78853o = z13;
            this.f78854p = i15;
            this.f78855q = i16;
            this.f78856r = i17;
            this.f78857s = i18;
            this.f78858t = aVar;
            this.f78859u = z14;
            this.f78860v = str2;
            this.f78861w = dVar;
        }

        public final boolean a() {
            return this.f78848j;
        }

        public final int b() {
            return this.f78857s;
        }

        public final d c() {
            return this.f78861w;
        }

        public final String d() {
            return this.f78860v;
        }

        public final a e() {
            return this.f78858t;
        }

        public final boolean f() {
            return this.f78853o;
        }

        public final Duration g() {
            return this.f78844f;
        }

        public final boolean h() {
            return this.f78859u;
        }

        public final String i() {
            return this.f78846h;
        }

        public final int j() {
            return this.f78855q;
        }

        public final int k() {
            return this.f78850l;
        }

        public final int l() {
            return this.f78852n;
        }

        public final int m() {
            return this.f78856r;
        }

        public final int n() {
            return this.f78851m;
        }

        public final long o() {
            return this.f78840b;
        }

        public final long p() {
            return this.f78839a;
        }

        public final long q() {
            return this.f78842d;
        }

        public final long r() {
            return this.f78841c;
        }

        public final int s() {
            return this.f78843e;
        }

        public final b t() {
            return this.f78849k;
        }

        public final Duration u() {
            return this.f78845g;
        }

        public final int v() {
            return this.f78854p;
        }

        public final boolean w() {
            return this.f78847i;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f78862a;

        /* renamed from: b, reason: collision with root package name */
        private final int f78863b;

        /* renamed from: c, reason: collision with root package name */
        private final int f78864c;

        /* renamed from: d, reason: collision with root package name */
        private final int f78865d;

        public f(String str) {
            String[] split = str.split("\\.");
            this.f78862a = Integer.parseInt(split[0]);
            this.f78863b = Integer.parseInt(split[1]);
            this.f78864c = Integer.parseInt(split[2]);
            this.f78865d = Integer.parseInt(split[3]);
        }

        public final int a() {
            return this.f78864c;
        }

        public final int b() {
            return this.f78862a;
        }

        public final int c() {
            return this.f78863b;
        }

        public final int d() {
            return this.f78865d;
        }

        public final String toString() {
            return this.f78862a + "." + this.f78863b + "." + this.f78864c + "." + this.f78865d;
        }
    }

    public abstract long a();

    public abstract void b(b bVar);

    public abstract void c(long j11, a aVar, f fVar, d dVar);

    public abstract void d(c cVar);

    public abstract void e(long j11, e eVar);
}
