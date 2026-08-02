package org.chromium.net.impl;

import C2.C2727w;
import C2.C2728x;
import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import java.time.Duration;

/* renamed from: org.chromium.net.impl.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8773l extends org.chromium.net.m {

    /* renamed from: a, reason: collision with root package name */
    private final HttpEngine.Builder f78933a;

    /* renamed from: org.chromium.net.impl.l$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78934a;

        static {
            int[] iArr = new int[xf.e.values().length];
            f78934a = iArr;
            try {
                iArr[xf.e.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78934a[xf.e.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78934a[xf.e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C8773l(HttpEngine.Builder builder) {
        this.f78933a = builder;
    }

    private static int k(xf.e eVar) {
        int i11 = a.f78934a[eVar.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    return 0;
                }
                throw new AssertionError("Invalid OptionalBoolean value: ".concat(String.valueOf(eVar)));
            }
        }
        return i12;
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.m a(int i11, int i12, String str) {
        this.f78933a.addQuicHint(str, i11, i12);
        return this;
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.i b() {
        HttpEngine build;
        build = this.f78933a.build();
        return new C8774m(build);
    }

    @Override // org.chromium.net.m
    public final void c(boolean z11) {
        this.f78933a.setEnableBrotli(z11);
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.m d(boolean z11) {
        this.f78933a.setEnableHttp2(z11);
        return this;
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.m e(int i11, long j11) {
        this.f78933a.setEnableHttpCache(i11, j11);
        return this;
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.m f(boolean z11) {
        this.f78933a.setEnableQuic(z11);
        return this;
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.m h(String str) {
        ConnectionMigrationOptions build;
        DnsOptions.StaleDnsOptions.Builder allowCrossNetworkUsage;
        DnsOptions.Builder useHttpStackDnsResolver;
        DnsOptions.Builder staleDns;
        DnsOptions.StaleDnsOptions build2;
        DnsOptions.Builder staleDnsOptions;
        DnsOptions.Builder preestablishConnectionsToStaleDnsResults;
        DnsOptions build3;
        QuicOptions build4;
        xf.c cVar = new xf.c(str);
        HttpEngine.Builder builder = this.f78933a;
        ConnectionMigrationOptions.Builder a11 = C2728x.a();
        a11.setDefaultNetworkMigration(k(cVar.o()));
        a11.setPathDegradationMigration(k(cVar.a()));
        xf.e n11 = cVar.n();
        a11.setAllowNonDefaultNetworkUsage(k(n11));
        xf.e eVar = xf.e.TRUE;
        if (n11 == eVar) {
            a11.setPathDegradationMigration(k(eVar));
        }
        build = a11.build();
        builder.setConnectionMigrationOptions(build);
        HttpEngine.Builder builder2 = this.f78933a;
        DnsOptions.StaleDnsOptions.Builder a12 = C8771j.a();
        int s11 = cVar.s();
        if (s11 != -1) {
            a12.setFreshLookupTimeout(Duration.ofMillis(s11));
        }
        int u11 = cVar.u();
        if (u11 != -1) {
            a12.setMaxExpiredDelay(Duration.ofMillis(u11));
        }
        allowCrossNetworkUsage = a12.setAllowCrossNetworkUsage(k(cVar.r()));
        allowCrossNetworkUsage.setUseStaleOnNameNotResolved(k(cVar.y()));
        DnsOptions.Builder a13 = C8772k.a();
        useHttpStackDnsResolver = a13.setUseHttpStackDnsResolver(k(cVar.b()));
        staleDns = useHttpStackDnsResolver.setStaleDns(k(cVar.t()));
        build2 = a12.build();
        staleDnsOptions = staleDns.setStaleDnsOptions(build2);
        preestablishConnectionsToStaleDnsResults = staleDnsOptions.setPreestablishConnectionsToStaleDnsResults(k(cVar.q()));
        preestablishConnectionsToStaleDnsResults.setPersistHostCache(k(cVar.x()));
        int w11 = cVar.w();
        if (w11 != -1) {
            a13.setPersistHostCachePeriod(Duration.ofMillis(w11));
        }
        build3 = a13.build();
        builder2.setDnsOptions(build3);
        HttpEngine.Builder builder3 = this.f78933a;
        QuicOptions.Builder b11 = C2727w.b();
        if (cVar.i() != null) {
            for (String str2 : cVar.i().split(",")) {
                b11.addAllowedQuicHost(str2);
            }
        }
        int l11 = cVar.l();
        if (l11 != -1) {
            b11.setInMemoryServerConfigsCacheSize(l11);
        }
        String A11 = cVar.A();
        if (A11 != null) {
            b11.setHandshakeUserAgent(A11);
        }
        int j11 = cVar.j();
        if (j11 != -1) {
            b11.setIdleConnectionTimeout(Duration.ofSeconds(j11));
        }
        build4 = b11.build();
        builder3.setQuicOptions(build4);
        return this;
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.m i(String str) {
        this.f78933a.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.m
    public final org.chromium.net.m j(String str) {
        this.f78933a.setUserAgent(str);
        return this;
    }
}
