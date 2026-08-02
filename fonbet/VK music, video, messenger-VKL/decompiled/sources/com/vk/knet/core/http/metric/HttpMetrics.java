package com.vk.knet.core.http.metric;

import com.vk.knet.core.http.HttpProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.sjv;
import xsna.tj0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: HttpMetrics.kt */
/* loaded from: classes2.dex */
public final class HttpMetrics {
    public final Source a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;
    public final sjv f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;
    public final HttpProtocol k;
    public final String l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpMetrics.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source CRONET;
        public static final Source OKHTTP;

        static {
            Source source = new Source("OKHTTP", 0);
            OKHTTP = source;
            Source source2 = new Source("CRONET", 1);
            CRONET = source2;
            Source[] sourceArr = {source, source2};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public HttpMetrics(Source source, boolean z, String str, boolean z2, String str2, sjv sjvVar, long j, long j2, long j3, boolean z3, HttpProtocol httpProtocol, String str3) {
        this.a = source;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = str2;
        this.f = sjvVar;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = z3;
        this.k = httpProtocol;
        this.l = str3;
    }

    public final String a() {
        return this.l;
    }

    public final sjv b() {
        return this.f;
    }

    public final long c() {
        return this.i;
    }

    public final long d() {
        return this.h;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpMetrics)) {
            return false;
        }
        HttpMetrics httpMetrics = (HttpMetrics) obj;
        return this.a == httpMetrics.a && this.b == httpMetrics.b && epx.f(this.c, httpMetrics.c) && this.d == httpMetrics.d && epx.f(this.e, httpMetrics.e) && epx.f(this.f, httpMetrics.f) && this.g == httpMetrics.g && this.h == httpMetrics.h && this.i == httpMetrics.i && this.j == httpMetrics.j && this.k == httpMetrics.k && epx.f(this.l, httpMetrics.l);
    }

    public final Source f() {
        return this.a;
    }

    public final String g() {
        return this.c;
    }

    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(bh10.a(bh10.a((this.f.hashCode() + urd0.a(qoy.b(urd0.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        HttpProtocol httpProtocol = this.k;
        int hashCode = (b + (httpProtocol == null ? 0 : httpProtocol.hashCode())) * 31;
        String str = this.l;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean i() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpMetrics(source=");
        sb.append(this.a);
        sb.append(", socketReused=");
        sb.append(this.b);
        sb.append(", tlsVersion=");
        sb.append(this.c);
        sb.append(", isProxy=");
        sb.append(this.d);
        sb.append(", proxy=");
        sb.append(this.e);
        sb.append(", intervals=");
        sb.append(this.f);
        sb.append(", totalTimeMs=");
        sb.append(this.g);
        tj0.d(sb, ", requestStartupTimestamp=", this.h, ", requestStartTime=");
        sb.append(this.i);
        sb.append(", isFailed=");
        sb.append(this.j);
        sb.append(", protocol=");
        sb.append(this.k);
        sb.append(", failReason=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
