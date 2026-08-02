package ad;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import androidx.lifecycle.d1;
import bd.j;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.sports.db.impl.SportsTable;
import com.sports.insider.domain.workers.WorkerMetrics;
import com.sports.insider.domain.workers.WorkerMetricsPush;
import com.sports.insider.domain.workers.WorkerMetricsViewLive;
import com.sports.insider.domain.workers.WorkerRating;
import com.sports.insider.domain.workers.WorkerTestPush;
import com.sports.insider.domain.workers.WorkerUnInstall;
import com.sports.insider.domain.workers.s.WorkerPurchasesInfo;
import com.sports.insider.ui.activities.BonusesInfo;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.strip.PredictionListFragment;
import da.r;
import e3.a0;
import e3.h0;
import e3.k0;
import e3.n;
import e3.y;
import e4.e;
import eg.m0;
import eg.z;
import f3.x;
import ge.q;
import hg.u;
import hg.u0;
import id.p;
import io.appmetrica.analytics.impl.C0122e9;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import je.c;
import k2.d0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.f;
import md.o;
import mf.i;
import oe.k;
import okio.Okio;
import pd.t;
import pd.v;
import pe.s;
import y8.d;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f127b = i5;
        this.f128c = obj;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        int i5 = this.f127b;
        Object obj2 = this.f128c;
        switch (i5) {
            case 0:
                return new a((f) obj2, continuation, 0);
            case 1:
                return new a((j) obj2, continuation, 1);
            case 2:
                return new a((d) obj2, continuation, 2);
            case 3:
                return new a((MyApp) obj2, continuation, 3);
            case 4:
                return new a((f) obj2, continuation, 4);
            case 5:
                return new a((e) obj2, continuation, 5);
            case 6:
                return new a((f) obj2, continuation, 6);
            case 7:
                return new a((gc.a) obj2, continuation, 7);
            case 8:
                return new a((SSLSocketFactory) obj2, continuation, 8);
            case 9:
                return new a((d) obj2, continuation, 9);
            case 10:
                return new a((je.b) obj2, continuation, 10);
            case 11:
                return new a((c) obj2, continuation, 11);
            case 12:
                return new a((fb.b) obj2, continuation, 12);
            case 13:
                return new a((f) obj2, continuation, 13);
            case 14:
                return new a((o) obj2, continuation, 14);
            case 15:
                return new a((Resources) obj2, continuation, 15);
            case 16:
                return new a((PredictionFragment) obj2, continuation, 16);
            case 17:
                return new a((bb.b) obj2, continuation, 17);
            case 18:
                return new a((io.sentry.util.network.b) obj2, continuation, 18);
            case 19:
                return new a((Context) obj2, continuation, 19);
            case 20:
                e3.o oVar = e3.o.f8551a;
                return new a((m7.b) obj2, continuation);
            case 21:
                return new a((k) obj2, continuation, 21);
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new a((m3.o) obj2, continuation, 22);
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new a((BonusesInfo) obj2, continuation, 23);
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new a((pd.c) obj2, continuation, 24);
            case C0122e9.F /* 25 */:
                return new a((t) obj2, continuation, 25);
            case C0122e9.G /* 26 */:
                return new a((pe.f) obj2, continuation, 26);
            case C0122e9.H /* 27 */:
                return new a((PredictionListFragment) obj2, continuation, 27);
            case 28:
                return new a((Intent) obj2, continuation, 28);
            default:
                return new a((s) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f127b) {
        }
        return ((a) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Certificate certificate;
        Certificate certificate2;
        char c2;
        Certificate certificate3;
        Certificate certificate4;
        Certificate certificate5;
        int i5;
        Certificate certificate6;
        Certificate certificate7;
        Certificate certificate8;
        int i10 = 15;
        int i11 = 7;
        int i12 = 18;
        int i13 = 4;
        int i14 = 3;
        int i15 = 24;
        int i16 = 2;
        char c8 = 1;
        char c10 = 1;
        char c11 = 1;
        int i17 = 0;
        Continuation continuation = null;
        switch (this.f127b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                y yVar = y.f8572a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                y networkType = y.f8573b;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                e3.f fVar = new e3.f(new n3.i(null), networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet) : g0.f19206a);
                Intrinsics.checkNotNullParameter(WorkerUnInstall.class, "workerClass");
                return ((k0) y3.m(k0.class, null, 6)).c("WorkerUnInstall", e3.o.f8552b, (a0) ((e3.z) ((e3.z) ((e3.z) ((e3.z) new e3.z(WorkerUnInstall.class).f(fVar)).e(e3.a.f8472b, 15L, TimeUnit.MINUTES)).g(10L, TimeUnit.SECONDS)).a("TagWorkerWorkerUnInstall")).b());
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    return (List) x.n0(j.c().f19564a.f9927a, true, false, new f1.a(i12));
                } catch (Exception e7) {
                    zc.d.b(6, null, e7);
                    return e0.f19204a;
                }
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                y yVar2 = y.f8572a;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                y networkType2 = y.f8573b;
                Intrinsics.checkNotNullParameter(networkType2, "networkType");
                e3.f fVar2 = new e3.f(new n3.i(null), networkType2, false, false, true, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet2) : g0.f19206a);
                n[] nVarArr = n.f8548a;
                k0 k0Var = (k0) y3.m(k0.class, null, 6);
                TimeUnit timeUnit = TimeUnit.HOURS;
                return k0Var.b("WorkerMetricEventName", (h0) ((e3.g0) ((e3.g0) ((e3.g0) ((e3.g0) new e3.g0(WorkerMetrics.class).f(fVar2)).e(e3.a.f8472b, 15L, TimeUnit.MINUTES)).g(30L, TimeUnit.SECONDS)).a("WorkerMetricEvent")).b());
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    MyApp myApp = (MyApp) this.f128c;
                    jg.d dVar = MyApp.f6830c;
                    ((zc.g) myApp.f6833b.getValue()).getClass();
                    String str2 = gc.d.f9945a;
                    try {
                        fa.a aVar5 = (fa.a) y3.m(fa.a.class, null, 6);
                        aVar5.getClass();
                        Intrinsics.checkNotNullParameter("language", "key");
                        SharedPreferences sharedPref = aVar5.f9542b;
                        Intrinsics.checkNotNullParameter("language", "key");
                        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
                        str = sharedPref.getString("language", null);
                    } catch (Exception unused) {
                        str = null;
                    }
                    gc.d.f9947c = str;
                } catch (Exception e9) {
                    zc.d.b(4, "initLocaleLanguage", e9);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                y yVar3 = y.f8572a;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                y networkType3 = y.f8573b;
                Intrinsics.checkNotNullParameter(networkType3, "networkType");
                e3.f fVar3 = new e3.f(new n3.i(null), networkType3, false, false, true, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet3) : g0.f19206a);
                n[] nVarArr2 = n.f8548a;
                k0 k0Var2 = (k0) y3.m(k0.class, null, 6);
                TimeUnit timeUnit2 = TimeUnit.HOURS;
                return k0Var2.b("WorkerMetricLiveViewEventName", (h0) ((e3.g0) ((e3.g0) ((e3.g0) ((e3.g0) new e3.g0(WorkerMetricsViewLive.class).f(fVar3)).e(e3.a.f8472b, 15L, TimeUnit.MINUTES)).g(30L, TimeUnit.SECONDS)).a("WorkerMetricLiveViewEvent")).b());
            case 5:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                e eVar = (e) this.f128c;
                synchronized (eVar.f8599h) {
                    if (!eVar.f8603m || eVar.f8604n) {
                        return Unit.f19194a;
                    }
                    try {
                        eVar.J();
                    } catch (IOException unused2) {
                        eVar.f8605o = true;
                    }
                    try {
                        if (eVar.j >= 2000) {
                            eVar.N();
                        }
                    } catch (IOException unused3) {
                        eVar.f8606p = true;
                        eVar.f8601k = Okio.buffer(Okio.blackhole());
                    }
                    return Unit.f19194a;
                }
            case 6:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                y yVar4 = y.f8572a;
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                y networkType4 = y.f8573b;
                Intrinsics.checkNotNullParameter(networkType4, "networkType");
                e3.f fVar4 = new e3.f(new n3.i(null), networkType4, false, false, true, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet4) : g0.f19206a);
                n[] nVarArr3 = n.f8548a;
                k0 k0Var3 = (k0) y3.m(k0.class, null, 6);
                TimeUnit timeUnit3 = TimeUnit.HOURS;
                return k0Var3.b("WorkerMetricsPushEventName", (h0) ((e3.g0) ((e3.g0) ((e3.g0) ((e3.g0) new e3.g0(WorkerMetricsPush.class).f(fVar4)).e(e3.a.f8472b, 15L, TimeUnit.MINUTES)).g(30L, TimeUnit.SECONDS)).a("WorkerMetricsPushEvent")).b());
            case 7:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                gc.c a7 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9935e == null) {
                    a7.getClass();
                    gc.c.f9935e = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIFBTCCAu2gAwIBAgIQS6hSk/eaL6JzBkuoBI110DANBgkqhkiG9w0BAQsFADBP\nMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJuZXQgU2VjdXJpdHkgUmVzZWFy\nY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBYMTAeFw0yNDAzMTMwMDAwMDBa\nFw0yNzAzMTIyMzU5NTlaMDMxCzAJBgNVBAYTAlVTMRYwFAYDVQQKEw1MZXQncyBF\nbmNyeXB0MQwwCgYDVQQDEwNSMTAwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEK\nAoIBAQDPV+XmxFQS7bRH/sknWHZGUCiMHT6I3wWd1bUYKb3dtVq/+vbOo76vACFL\nYlpaPAEvxVgD9on/jhFD68G14BQHlo9vH9fnuoE5CXVlt8KvGFs3Jijno/QHK20a\n/6tYvJWuQP/py1fEtVt/eA0YYbwX51TGu0mRzW4Y0YCF7qZlNrx06rxQTOr8IfM4\nFpOUurDTazgGzRYSespSdcitdrLCnF2YRVxvYXvGLe48E1KGAdlX5jgc3421H5KR\nmudKHMxFqHJV8LDmowfs/acbZp4/SItxhHFYyTr6717yW0QrPHTnj7JHwQdqzZq3\nDZb3EoEmUVQK7GH29/Xi8orIlQ2NAgMBAAGjgfgwgfUwDgYDVR0PAQH/BAQDAgGG\nMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATASBgNVHRMBAf8ECDAGAQH/\nAgEAMB0GA1UdDgQWBBS7vMNHpeS8qcbDpHIMEI2iNeHI6DAfBgNVHSMEGDAWgBR5\ntFnme7bl5AFzgAiIyBpY9umbbjAyBggrBgEFBQcBAQQmMCQwIgYIKwYBBQUHMAKG\nFmh0dHA6Ly94MS5pLmxlbmNyLm9yZy8wEwYDVR0gBAwwCjAIBgZngQwBAgEwJwYD\nVR0fBCAwHjAcoBqgGIYWaHR0cDovL3gxLmMubGVuY3Iub3JnLzANBgkqhkiG9w0B\nAQsFAAOCAgEAkrHnQTfreZ2B5s3iJeE6IOmQRJWjgVzPw139vaBw1bGWKCIL0vIo\nzwzn1OZDjCQiHcFCktEJr59L9MhwTyAWsVrdAfYf+B9haxQnsHKNY67u4s5Lzzfd\nu6PUzeetUK29v+PsPmI2cJkxp+iN3epi4hKu9ZzUPSwMqtCceb7qPVxEbpYxY1p9\n1n5PJKBLBX9eb9LU6l8zSxPWV7bK3lG4XaMJgnT9x3ies7msFtpKK5bDtotij/l0\nGaKeA97pb5uwD9KgWvaFXMIEt8jVTjLEvwRdvCn294GPDF08U8lAkIv7tghluaQh\n1QnlE4SEN4LOECj8dsIGJXpGUk3aU3KkJz9icKy+aUgA+2cP21uh6NcDIS3XyfaZ\nQjmDQ993ChII8SXWupQZVBiIpcWO4RqZk3lr7Bz5MUCwzDIA359e57SSq5CCkY0N\n4B6Vulk7LktfwrdGNVI5BsC9qqxSwSKgRJeZ9wygIaehbHFHFhcBaMDKpiZlBHyz\nrsnnlFXCb5s8HKn5LsUgGvB24L7sGNZP2CX7dhHov+YhD+jozLW2p9W4959Bz2Ei\nRmqDtmiXLnzqTpXbI+suyCsohKRg6Un0RC47+cpiVwHiXZAW+cn8eiNIjqbVgXLx\nKPpdzvvtTnOPlC7SQZSYmdunr3Bf9b77AiC/ZidstK36dRILKz7OA54=\n-----END CERTIFICATE-----");
                } else {
                    a7.getClass();
                }
                Certificate certificate9 = gc.c.f9935e;
                gc.c a10 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9936f == null) {
                    a10.getClass();
                    gc.c.f9936f = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIFBjCCAu6gAwIBAgIRAIp9PhPWLzDvI4a9KQdrNPgwDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMjQwMzEzMDAwMDAw\nWhcNMjcwMzEyMjM1OTU5WjAzMQswCQYDVQQGEwJVUzEWMBQGA1UEChMNTGV0J3Mg\nRW5jcnlwdDEMMAoGA1UEAxMDUjExMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIB\nCgKCAQEAuoe8XBsAOcvKCs3UZxD5ATylTqVhyybKUvsVAbe5KPUoHu0nsyQYOWcJ\nDAjs4DqwO3cOvfPlOVRBDE6uQdaZdN5R2+97/1i9qLcT9t4x1fJyyXJqC4N0lZxG\nAGQUmfOx2SLZzaiSqhwmej/+71gFewiVgdtxD4774zEJuwm+UE1fj5F2PVqdnoPy\n6cRms+EGZkNIGIBloDcYmpuEMpexsr3E+BUAnSeI++JjF5ZsmydnS8TbKF5pwnnw\nSVzgJFDhxLyhBax7QG0AtMJBP6dYuC/FXJuluwme8f7rsIU5/agK70XEeOtlKsLP\nXzze41xNG/cLJyuqC0J3U095ah2H2QIDAQABo4H4MIH1MA4GA1UdDwEB/wQEAwIB\nhjAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwEgYDVR0TAQH/BAgwBgEB\n/wIBADAdBgNVHQ4EFgQUxc9GpOr0w8B6bJXELbBeki8m47kwHwYDVR0jBBgwFoAU\nebRZ5nu25eQBc4AIiMgaWPbpm24wMgYIKwYBBQUHAQEEJjAkMCIGCCsGAQUFBzAC\nhhZodHRwOi8veDEuaS5sZW5jci5vcmcvMBMGA1UdIAQMMAowCAYGZ4EMAQIBMCcG\nA1UdHwQgMB4wHKAaoBiGFmh0dHA6Ly94MS5jLmxlbmNyLm9yZy8wDQYJKoZIhvcN\nAQELBQADggIBAE7iiV0KAxyQOND1H/lxXPjDj7I3iHpvsCUf7b632IYGjukJhM1y\nv4Hz/MrPU0jtvfZpQtSlET41yBOykh0FX+ou1Nj4ScOt9ZmWnO8m2OG0JAtIIE38\n01S0qcYhyOE2G/93ZCkXufBL713qzXnQv5C/viOykNpKqUgxdKlEC+Hi9i2DcaR1\ne9KUwQUZRhy5j/PEdEglKg3l9dtD4tuTm7kZtB8v32oOjzHTYw+7KdzdZiw/sBtn\nUfhBPORNuay4pJxmY/WrhSMdzFO2q3Gu3MUBcdo27goYKjL9CTF8j/Zz55yctUoV\naneCWs/ajUX+HypkBTA+c8LGDLnWO2NKq0YD/pnARkAnYGPfUDoHR9gVSp/qRx+Z\nWghiDLZsMwhN1zjtSC0uBWiugF3vTNzYIEFfaPG7Ws3jDrAMMYebQ95JQ+HIBD/R\nPBuHRTBpqKlyDnkSHDHYPiNX3adPoPAcgdF3H2/W0rmoswMWgTlLn1Wu0mrks7/q\npdWfS6PJ1jty80r2VKsM/Dj3YIDfbjXKdaFU5C+8bhfJGqU3taKauuz0wHVGT3eo\n6FlWkWYtbt4pgdamlwVeZEW+LM7qZEJEsMNPrfC03APKmZsJgpWCDWOKZvkZcvjV\nuYkQ4omYCTX5ohy+knMjdOmdH9c7SpqEWBDC86fiNex+O0XOMEZSa8DA\n-----END CERTIFICATE-----");
                } else {
                    a10.getClass();
                }
                Certificate certificate10 = gc.c.f9936f;
                gc.c a11 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9937g == null) {
                    a11.getClass();
                    gc.c.f9937g = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIFBjCCAu6gAwIBAgIRAMISMktwqbSRcdxA9+KFJjwwDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMjQwMzEzMDAwMDAw\nWhcNMjcwMzEyMjM1OTU5WjAzMQswCQYDVQQGEwJVUzEWMBQGA1UEChMNTGV0J3Mg\nRW5jcnlwdDEMMAoGA1UEAxMDUjEyMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIB\nCgKCAQEA2pgodK2+lP474B7i5Ut1qywSf+2nAzJ+Npfs6DGPpRONC5kuHs0BUT1M\n5ShuCVUxqqUiXXL0LQfCTUA83wEjuXg39RplMjTmhnGdBO+ECFu9AhqZ66YBAJpz\nkG2Pogeg0JfT2kVhgTU9FPnEwF9q3AuWGrCf4yrqvSrWmMebcas7dA8827JgvlpL\nThjp2ypzXIlhZZ7+7Tymy05v5J75AEaz/xlNKmOzjmbGGIVwx1Blbzt05UiDDwhY\nXS0jnV6j/ujbAKHS9OMZTfLuevYnnuXNnC2i8n+cF63vEzc50bTILEHWhsDp7CH4\nWRt/uTp8n1wBnWIEwii9Cq08yhDsGwIDAQABo4H4MIH1MA4GA1UdDwEB/wQEAwIB\nhjAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwEgYDVR0TAQH/BAgwBgEB\n/wIBADAdBgNVHQ4EFgQUALUp8i2ObzHom0yteD763OkM0dIwHwYDVR0jBBgwFoAU\nebRZ5nu25eQBc4AIiMgaWPbpm24wMgYIKwYBBQUHAQEEJjAkMCIGCCsGAQUFBzAC\nhhZodHRwOi8veDEuaS5sZW5jci5vcmcvMBMGA1UdIAQMMAowCAYGZ4EMAQIBMCcG\nA1UdHwQgMB4wHKAaoBiGFmh0dHA6Ly94MS5jLmxlbmNyLm9yZy8wDQYJKoZIhvcN\nAQELBQADggIBAI910AnPanZIZTKS3rVEyIV29BWEjAK/duuz8eL5boSoVpHhkkv3\n4eoAeEiPdZLj5EZ7G2ArIK+gzhTlRQ1q4FKGpPPaFBSpqV/xbUb5UlAXQOnkHn3m\nFVj+qYv87/WeY+Bm4sN3Ox8BhyaU7UAQ3LeZ7N1X01xxQe4wIAAE3JVLUCiHmZL+\nqoCUtgYIFPgcg350QMUIWgxPXNGEncT921ne7nluI02V8pLUmClqXOsCwULw+PVO\nZCB7qOMxxMBoCUeL2Ll4oMpOSr5pJCpLN3tRA2s6P1KLs9TSrVhOk+7LX28NMUlI\nusQ/nxLJID0RhAeFtPjyOCOscQBA53+NRjSCak7P4A5jX7ppmkcJECL+S0i3kXVU\ny5Me5BbrU8973jZNv/ax6+ZK6TM8jWmimL6of6OrX7ZU6E2WqazzsFrLG3o2kySb\nzlhSgJ81Cl4tv3SbYiYXnJExKQvzf83DYotox3f0fwv7xln1A2ZLplCb0O+l/AK0\nYE0DS2FPxSAHi0iwMfW2nNHJrXcY3LLHD77gRgje4Eveubi2xxa+Nmk/hmhLdIET\niVDFanoCrMVIpQ59XWHkzdFmoHXHBV7oibVjGSO7ULSQ7MJ1Nz51phuDJSgAIU7A\n0zrLnOrAj/dfrlEWRhCvAgbuwLZX1A2sjNjXoPOHbsPiy+lO1KF8/XY7\n-----END CERTIFICATE-----");
                } else {
                    a11.getClass();
                }
                Certificate certificate11 = gc.c.f9937g;
                gc.c a12 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9938h == null) {
                    a12.getClass();
                    gc.c.f9938h = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIFBTCCAu2gAwIBAgIQWgDyEtjUtIDzkkFX6imDBTANBgkqhkiG9w0BAQsFADBP\nMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJuZXQgU2VjdXJpdHkgUmVzZWFy\nY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBYMTAeFw0yNDAzMTMwMDAwMDBa\nFw0yNzAzMTIyMzU5NTlaMDMxCzAJBgNVBAYTAlVTMRYwFAYDVQQKEw1MZXQncyBF\nbmNyeXB0MQwwCgYDVQQDEwNSMTMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEK\nAoIBAQClZ3CN0FaBZBUXYc25BtStGZCMJlA3mBZjklTb2cyEBZPs0+wIG6BgUUNI\nfSvHSJaetC3ancgnO1ehn6vw1g7UDjDKb5ux0daknTI+WE41b0VYaHEX/D7YXYKg\nL7JRbLAaXbhZzjVlyIuhrxA3/+OcXcJJFzT/jCuLjfC8cSyTDB0FxLrHzarJXnzR\nyQH3nAP2/Apd9Np75tt2QnDr9E0i2gB3b9bJXxf92nUupVcM9upctuBzpWjPoXTi\ndYJ+EJ/B9aLrAek4sQpEzNPCifVJNYIKNLMc6YjCR06CDgo28EdPivEpBHXazeGa\nXP9enZiVuppD0EqiFwUBBDDTMrOPAgMBAAGjgfgwgfUwDgYDVR0PAQH/BAQDAgGG\nMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATASBgNVHRMBAf8ECDAGAQH/\nAgEAMB0GA1UdDgQWBBTnq58PLDOgU9NeT3jIsoQOO9aSMzAfBgNVHSMEGDAWgBR5\ntFnme7bl5AFzgAiIyBpY9umbbjAyBggrBgEFBQcBAQQmMCQwIgYIKwYBBQUHMAKG\nFmh0dHA6Ly94MS5pLmxlbmNyLm9yZy8wEwYDVR0gBAwwCjAIBgZngQwBAgEwJwYD\nVR0fBCAwHjAcoBqgGIYWaHR0cDovL3gxLmMubGVuY3Iub3JnLzANBgkqhkiG9w0B\nAQsFAAOCAgEAUTdYUqEimzW7TbrOypLqCfL7VOwYf/Q79OH5cHLCZeggfQhDconl\nk7Kgh8b0vi+/XuWu7CN8n/UPeg1vo3G+taXirrytthQinAHGwc/UdbOygJa9zuBc\nVyqoH3CXTXDInT+8a+c3aEVMJ2St+pSn4ed+WkDp8ijsijvEyFwE47hulW0Ltzjg\n9fOV5Pmrg/zxWbRuL+k0DBDHEJennCsAen7c35Pmx7jpmJ/HtgRhcnz0yjSBvyIw\n6L1QIupkCv2SBODT/xDD3gfQQyKv6roV4G2EhfEyAsWpmojxjCUCGiyg97FvDtm/\nNK2LSc9lybKxB73I2+P2G3CaWpvvpAiHCVu30jW8GCxKdfhsXtnIy2imskQqVZ2m\n0Pmxobb28Tucr7xBK7CtwvPrb79os7u2XP3O5f9b/H66GNyRrglRXlrYjI1oGYL/\nf4I1n/Sgusda6WvA6C190kxjU15Y12mHU4+BxyR9cx2hhGS9fAjMZKJss28qxvz6\nAxu4CaDmRNZpK/pQrXF17yXCXkmEWgvSOEZy6Z9pcbLIVEGckV/iVeq0AOo2pkg9\np4QRIy0tK2diRENLSF2KysFwbY6B26BFeFs3v1sYVRhFW9nLkOrQVporCS0KyZmf\nwVD89qSTlnctLcZnIavjKsKUu1nA1iU0yYMdYepKR7lWbnwhdx3ewok=\n-----END CERTIFICATE-----");
                } else {
                    a12.getClass();
                }
                Certificate certificate12 = gc.c.f9938h;
                gc.c a13 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9931a == null) {
                    a13.getClass();
                    gc.c.f9931a = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIEVzCCAj+gAwIBAgIRAIOPbGPOsTmMYgZigxXJ/d4wDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMjQwMzEzMDAwMDAw\nWhcNMjcwMzEyMjM1OTU5WjAyMQswCQYDVQQGEwJVUzEWMBQGA1UEChMNTGV0J3Mg\nRW5jcnlwdDELMAkGA1UEAxMCRTUwdjAQBgcqhkjOPQIBBgUrgQQAIgNiAAQNCzqK\na2GOtu/cX1jnxkJFVKtj9mZhSAouWXW0gQI3ULc/FnncmOyhKJdyIBwsz9V8UiBO\nVHhbhBRrwJCuhezAUUE8Wod/Bk3U/mDR+mwt4X2VEIiiCFQPmRpM5uoKrNijgfgw\ngfUwDgYDVR0PAQH/BAQDAgGGMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcD\nATASBgNVHRMBAf8ECDAGAQH/AgEAMB0GA1UdDgQWBBSfK1/PPCFPnQS37SssxMZw\ni9LXDTAfBgNVHSMEGDAWgBR5tFnme7bl5AFzgAiIyBpY9umbbjAyBggrBgEFBQcB\nAQQmMCQwIgYIKwYBBQUHMAKGFmh0dHA6Ly94MS5pLmxlbmNyLm9yZy8wEwYDVR0g\nBAwwCjAIBgZngQwBAgEwJwYDVR0fBCAwHjAcoBqgGIYWaHR0cDovL3gxLmMubGVu\nY3Iub3JnLzANBgkqhkiG9w0BAQsFAAOCAgEAH3KdNEVCQdqk0LKyuNImTKdRJY1C\n2uw2SJajuhqkyGPY8C+zzsufZ+mgnhnq1A2KVQOSykOEnUbx1cy637rBAihx97r+\nbcwbZM6sTDIaEriR/PLk6LKs9Be0uoVxgOKDcpG9svD33J+G9Lcfv1K9luDmSTgG\n6XNFIN5vfI5gs/lMPyojEMdIzK9blcl2/1vKxO8WGCcjvsQ1nJ/Pwt8LQZBfOFyV\nXP8ubAp/au3dc4EKWG9MO5zcx1qT9+NXRGdVWxGvmBFRAajciMfXME1ZuGmk3/GO\nkoAM7ZkjZmleyokP1LGzmfJcUd9s7eeu1/9/eg5XlXd/55GtYjAM+C4DG5i7eaNq\ncm2F+yxYIPt6cbbtYVNJCGfHWqHEQ4FYStUyFnv8sjyqU8ypgZaNJ9aVcWSICLOI\nE1/Qv/7oKsnZCWJ926wU6RqG1OYPGOi1zuABhLw61cuPVDT28nQS/e6z95cJXq0e\nK1BcaJ6fJZsmbjRgD5p3mvEf5vdQM7MCEvU0tHbsx2I5mHHJoABHb8KVBgWp/lcX\nGWiWaeOyB7RP+OfDtvi2OsapxXiV7vNVs7fMlrRjY1joKaqmmycnBvAq14AEbtyL\nsVfOS66B8apkeFX2NY4XPEYV4ZSCe8VHPrdrERk2wILG3T/EGmSIkCYVUMSnjmJd\nVQD9F6Na/+zmXCc=\n-----END CERTIFICATE-----");
                } else {
                    a13.getClass();
                }
                Certificate certificate13 = gc.c.f9931a;
                gc.c a14 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9933c == null) {
                    a14.getClass();
                    gc.c.f9933c = gc.c.a("-----BEGIN CERTIFICATE-----\nMIICtjCCAjygAwIBAgIRAICpc0jvJ2ip4/a7Q8D5xikwCgYIKoZIzj0EAwMwTzEL\nMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2VhcmNo\nIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDIwHhcNMjQwMzEzMDAwMDAwWhcN\nMjcwMzEyMjM1OTU5WjAyMQswCQYDVQQGEwJVUzEWMBQGA1UEChMNTGV0J3MgRW5j\ncnlwdDELMAkGA1UEAxMCRTYwdjAQBgcqhkjOPQIBBgUrgQQAIgNiAATZ8Z5Gh/gh\ncWCoJuuj+rnq2h25EqfUJtlRFLFhfHWWvyILOR/VvtEKRqotPEoJhC6+QJVV6RlA\nN2Z17TJOdwRJ+HB7wxjnzvdxEP6sdNgA1O1tHHMWMxCcOrLqbGL0vbijgfgwgfUw\nDgYDVR0PAQH/BAQDAgGGMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAS\nBgNVHRMBAf8ECDAGAQH/AgEAMB0GA1UdDgQWBBSTJ0aYA6lRaI6Y1sRCSNsjv1iU\n0jAfBgNVHSMEGDAWgBR8Qpau3ktIO/qS+J6Mz22LqXI3lTAyBggrBgEFBQcBAQQm\nMCQwIgYIKwYBBQUHMAKGFmh0dHA6Ly94Mi5pLmxlbmNyLm9yZy8wEwYDVR0gBAww\nCjAIBgZngQwBAgEwJwYDVR0fBCAwHjAcoBqgGIYWaHR0cDovL3gyLmMubGVuY3Iu\nb3JnLzAKBggqhkjOPQQDAwNoADBlAjBgGMvAszhCd1BsRuMwGYCC0QCzf5d//MC5\nASqIyswj3hGcoZREOKDKdvJPHhgdZr8CMQCWq4Kjl/RmuF49LBq9eP7oGWAc55w4\nG72FoKw5a9WywSwBzoJunrayTB8nDSjEhu8=\n-----END CERTIFICATE-----");
                } else {
                    a14.getClass();
                }
                Certificate certificate14 = gc.c.f9933c;
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    gc.c a15 = gc.a.a((gc.a) this.f128c);
                    if (gc.c.f9932b == null) {
                        a15.getClass();
                        gc.c.f9932b = gc.c.a("-----BEGIN CERTIFICATE-----\nMIICtDCCAjugAwIBAgIQGG511O6woF39Lagghl0eMTAKBggqhkjOPQQDAzBPMQsw\nCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJuZXQgU2VjdXJpdHkgUmVzZWFyY2gg\nR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBYMjAeFw0yNDAzMTMwMDAwMDBaFw0y\nNzAzMTIyMzU5NTlaMDIxCzAJBgNVBAYTAlVTMRYwFAYDVQQKEw1MZXQncyBFbmNy\neXB0MQswCQYDVQQDEwJFNTB2MBAGByqGSM49AgEGBSuBBAAiA2IABA0LOoprYY62\n79xfWOfGQkVUq2P2ZmFICi5ZdbSBAjdQtz8WedyY7KEol3IgHCzP1XxSIE5UeFuE\nFGvAkK6F7MBRQTxah38GTdT+YNH6bC3hfZUQiKIIVA+ZGkzm6gqs2KOB+DCB9TAO\nBgNVHQ8BAf8EBAMCAYYwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMBMBIG\nA1UdEwEB/wQIMAYBAf8CAQAwHQYDVR0OBBYEFJ8rX888IU+dBLftKyzExnCL0tcN\nMB8GA1UdIwQYMBaAFHxClq7eS0g7+pL4nozPbYupcjeVMDIGCCsGAQUFBwEBBCYw\nJDAiBggrBgEFBQcwAoYWaHR0cDovL3gyLmkubGVuY3Iub3JnLzATBgNVHSAEDDAK\nMAgGBmeBDAECATAnBgNVHR8EIDAeMBygGqAYhhZodHRwOi8veDIuYy5sZW5jci5v\ncmcvMAoGCCqGSM49BAMDA2cAMGQCMBttLkVBHEU+2V80GHRnE3m6qym1thBOgydK\ni0VOx3vP9EAwHWGl5hxtpJAJkm5GSwIwRikYhDR6vPve2BvYGacE9ct+522E2dqO\n6s42MLmigEws5mASS6l2quhtlUfacgkM\n-----END CERTIFICATE-----");
                    } else {
                        a15.getClass();
                    }
                    certificate = gc.c.f9932b;
                } else {
                    certificate = null;
                }
                if (i18 >= 34) {
                    gc.c a16 = gc.a.a((gc.a) this.f128c);
                    if (gc.c.f9934d == null) {
                        a16.getClass();
                        gc.c.f9934d = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIEVzCCAj+gAwIBAgIRALBXPpFzlydw27SHyzpFKzgwDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMjQwMzEzMDAwMDAw\nWhcNMjcwMzEyMjM1OTU5WjAyMQswCQYDVQQGEwJVUzEWMBQGA1UEChMNTGV0J3Mg\nRW5jcnlwdDELMAkGA1UEAxMCRTYwdjAQBgcqhkjOPQIBBgUrgQQAIgNiAATZ8Z5G\nh/ghcWCoJuuj+rnq2h25EqfUJtlRFLFhfHWWvyILOR/VvtEKRqotPEoJhC6+QJVV\n6RlAN2Z17TJOdwRJ+HB7wxjnzvdxEP6sdNgA1O1tHHMWMxCcOrLqbGL0vbijgfgw\ngfUwDgYDVR0PAQH/BAQDAgGGMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcD\nATASBgNVHRMBAf8ECDAGAQH/AgEAMB0GA1UdDgQWBBSTJ0aYA6lRaI6Y1sRCSNsj\nv1iU0jAfBgNVHSMEGDAWgBR5tFnme7bl5AFzgAiIyBpY9umbbjAyBggrBgEFBQcB\nAQQmMCQwIgYIKwYBBQUHMAKGFmh0dHA6Ly94MS5pLmxlbmNyLm9yZy8wEwYDVR0g\nBAwwCjAIBgZngQwBAgEwJwYDVR0fBCAwHjAcoBqgGIYWaHR0cDovL3gxLmMubGVu\nY3Iub3JnLzANBgkqhkiG9w0BAQsFAAOCAgEAfYt7SiA1sgWGCIpunk46r4AExIRc\nMxkKgUhNlrrv1B21hOaXN/5miE+LOTbrcmU/M9yvC6MVY730GNFoL8IhJ8j8vrOL\npMY22OP6baS1k9YMrtDTlwJHoGby04ThTUeBDksS9RiuHvicZqBedQdIF65pZuhp\neDcGBcLiYasQr/EO5gxxtLyTmgsHSOVSBcFOn9lgv7LECPq9i7mfH3mpxgrRKSxH\npOoZ0KXMcB+hHuvlklHntvcI0mMMQ0mhYj6qtMFStkF1RpCG3IPdIwpVCQqu8GV7\ns8ubknRzs+3C/Bm19RFOoiPpDkwvyNfvmQ14XkyqqKK5oZ8zhD32kFRQkxa8uZSu\nh4aTImFxknu39waBxIRXE4jKxlAmQc4QjFZoq1KmQqQg0J/1JF8RlFvJas1VcjLv\nYlvUB2t6npO6oQjB3l+PNf0DpQH7iUx3Wz5AjQCi6L25FjyE06q6BZ/QlmtYdl/8\nZYao4SRqPEs/6cAiF+Qf5zg2UkaWtDphl1LKMuTNLotvsX99HP69V2faNyegodQ0\nLyTApr/vT01YPE46vNsDLgK+4cL6TrzC/a4WcmF5SRJ938zrv/duJHLXQIku5v0+\nEwOy59Hdm0PT/Er/84dDV0CSjdR/2XuZM3kpysSKLgD1cKiDA+IRguODCxfO9cyY\nIg46v9mFmBvyH04=\n-----END CERTIFICATE-----");
                    } else {
                        a16.getClass();
                    }
                    certificate2 = gc.c.f9934d;
                } else {
                    certificate2 = null;
                }
                gc.c a17 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9939i == null) {
                    a17.getClass();
                    gc.c.f9939i = gc.c.a("-----BEGIN CERTIFICATE-----\nMIICtzCCAjygAwIBAgIRAMWKhaLGI0XgqMRSU4efWTowCgYIKoZIzj0EAwMwTzEL\nMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2VhcmNo\nIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDIwHhcNMjQwMzEzMDAwMDAwWhcN\nMjcwMzEyMjM1OTU5WjAyMQswCQYDVQQGEwJVUzEWMBQGA1UEChMNTGV0J3MgRW5j\ncnlwdDELMAkGA1UEAxMCRTcwdjAQBgcqhkjOPQIBBgUrgQQAIgNiAARB6ASTCFh/\nvjcwDMCgQer+VtqEkz7JANurZxLP+U9TCeioL6sp5Z8VRvRbYk4P1INBmbefQHJF\nHCxcSjKmwtvGBWpl/9ra8HW0QDsUaJW2qOJqceJ0ZVFT3hbUHifBM/2jgfgwgfUw\nDgYDVR0PAQH/BAQDAgGGMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAS\nBgNVHRMBAf8ECDAGAQH/AgEAMB0GA1UdDgQWBBSuSJ7chx1EoG/aouVgdAR4wpwA\ngDAfBgNVHSMEGDAWgBR8Qpau3ktIO/qS+J6Mz22LqXI3lTAyBggrBgEFBQcBAQQm\nMCQwIgYIKwYBBQUHMAKGFmh0dHA6Ly94Mi5pLmxlbmNyLm9yZy8wEwYDVR0gBAww\nCjAIBgZngQwBAgEwJwYDVR0fBCAwHjAcoBqgGIYWaHR0cDovL3gyLmMubGVuY3Iu\nb3JnLzAKBggqhkjOPQQDAwNpADBmAjEA/e5N+wjAk945cpaFxGaeMC13fyvdbNzX\nlRg9HNdElxi5mXdI4az2CykNU07iFwqEAjEAihPCDkw4b1BvfLg8VNLLuaMpn1Rb\nZ1682chR6zNRCseyie4SjyTCdkvsAa+omQSf\n-----END CERTIFICATE-----");
                } else {
                    a17.getClass();
                }
                Certificate certificate15 = gc.c.f9939i;
                gc.c a18 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9940k == null) {
                    a18.getClass();
                    gc.c.f9940k = gc.c.a("-----BEGIN CERTIFICATE-----\nMIICtTCCAjugAwIBAgIQfo8UX4exWTMtf9QIK4JraTAKBggqhkjOPQQDAzBPMQsw\nCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJuZXQgU2VjdXJpdHkgUmVzZWFyY2gg\nR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBYMjAeFw0yNDAzMTMwMDAwMDBaFw0y\nNzAzMTIyMzU5NTlaMDIxCzAJBgNVBAYTAlVTMRYwFAYDVQQKEw1MZXQncyBFbmNy\neXB0MQswCQYDVQQDEwJFODB2MBAGByqGSM49AgEGBSuBBAAiA2IABNFl8l7cS7QM\nApzSsvru6WyrOq44ofTUOTIzxULUzDMMNMchIJBwXOhiLxxxs0LXeb5GDcHbR6ET\noMffgSZjO9SNHfY9gjMy9vQr5/WWOrQTZxh7az6NSNnq3u2ubT6HTKOB+DCB9TAO\nBgNVHQ8BAf8EBAMCAYYwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMBMBIG\nA1UdEwEB/wQIMAYBAf8CAQAwHQYDVR0OBBYEFI8NE6L2Ln7RUGwzGDhdWY4jcpHK\nMB8GA1UdIwQYMBaAFHxClq7eS0g7+pL4nozPbYupcjeVMDIGCCsGAQUFBwEBBCYw\nJDAiBggrBgEFBQcwAoYWaHR0cDovL3gyLmkubGVuY3Iub3JnLzATBgNVHSAEDDAK\nMAgGBmeBDAECATAnBgNVHR8EIDAeMBygGqAYhhZodHRwOi8veDIuYy5sZW5jci5v\ncmcvMAoGCCqGSM49BAMDA2gAMGUCMQClsUNJdX36GE+o2yDf7L02m3P3ElVWRLls\n5ZyLYPjcNamBxRB9gZYoj24mGZtP3GkCMASZcALg6kpScomqIIjVHXRUQ500cdl4\n4n7fhxwokLo/lVlO8YyHwAi7ejTHtvw9Vg==\n-----END CERTIFICATE-----");
                } else {
                    a18.getClass();
                }
                Certificate certificate16 = gc.c.f9940k;
                if (i18 >= 34) {
                    c2 = 0;
                    gc.c a19 = gc.a.a((gc.a) this.f128c);
                    if (gc.c.j == null) {
                        a19.getClass();
                        gc.c.j = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIEVzCCAj+gAwIBAgIRAKp18eYrjwoiCWbTi7/UuqEwDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMjQwMzEzMDAwMDAw\nWhcNMjcwMzEyMjM1OTU5WjAyMQswCQYDVQQGEwJVUzEWMBQGA1UEChMNTGV0J3Mg\nRW5jcnlwdDELMAkGA1UEAxMCRTcwdjAQBgcqhkjOPQIBBgUrgQQAIgNiAARB6AST\nCFh/vjcwDMCgQer+VtqEkz7JANurZxLP+U9TCeioL6sp5Z8VRvRbYk4P1INBmbef\nQHJFHCxcSjKmwtvGBWpl/9ra8HW0QDsUaJW2qOJqceJ0ZVFT3hbUHifBM/2jgfgw\ngfUwDgYDVR0PAQH/BAQDAgGGMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcD\nATASBgNVHRMBAf8ECDAGAQH/AgEAMB0GA1UdDgQWBBSuSJ7chx1EoG/aouVgdAR4\nwpwAgDAfBgNVHSMEGDAWgBR5tFnme7bl5AFzgAiIyBpY9umbbjAyBggrBgEFBQcB\nAQQmMCQwIgYIKwYBBQUHMAKGFmh0dHA6Ly94MS5pLmxlbmNyLm9yZy8wEwYDVR0g\nBAwwCjAIBgZngQwBAgEwJwYDVR0fBCAwHjAcoBqgGIYWaHR0cDovL3gxLmMubGVu\nY3Iub3JnLzANBgkqhkiG9w0BAQsFAAOCAgEAjx66fDdLk5ywFn3CzA1w1qfylHUD\naEf0QZpXcJseddJGSfbUUOvbNR9N/QQ16K1lXl4VFyhmGXDT5Kdfcr0RvIIVrNxF\nh4lqHtRRCP6RBRstqbZ2zURgqakn/Xip0iaQL0IdfHBZr396FgknniRYFckKORPG\nyM3QKnd66gtMst8I5nkRQlAg/Jb+Gc3egIvuGKWboE1G89NTsN9LTDD3PLj0dUMr\nOIuqVjLB8pEC6yk9enrlrqjXQgkLEYhXzq7dLafv5Vkig6Gl0nuuqjqfp0Q1bi1o\nyVNAlXe6aUXw92CcghC9bNsKEO1+M52YY5+ofIXlS/SEQbvVYYBLZ5yeiglV6t3S\nM6H+vTG0aP9YHzLn/KVOHzGQfXDP7qM5tkf+7diZe7o2fw6O7IvN6fsQXEQQj8TJ\nUXJxv2/uJhcuy/tSDgXwHM8Uk34WNbRT7zGTGkQRX0gsbjAea/jYAoWv0ZvQRwpq\nPe79D/i7Cep8qWnA+7AE/3B3S/3dEEYmc0lpe1366A/6GEgk3ktr9PEoQrLChs6I\ntu3wnNLB2euC8IKGLQFpGtOO/2/hiAKjyajaBP25w1jF0Wl8Bbqne3uZ2q1GyPFJ\nYRmT7/OXpmOH/FVLtwS+8ng1cAmpCujPwteJZNcDG0sF2n/sc0+SQf49fdyUK0ty\n+VUwFj9tmWxyR/M=\n-----END CERTIFICATE-----");
                    } else {
                        a19.getClass();
                    }
                    certificate3 = gc.c.j;
                } else {
                    c2 = 0;
                    certificate3 = null;
                }
                if (i18 >= 34) {
                    gc.c a20 = gc.a.a((gc.a) this.f128c);
                    if (gc.c.f9941l == null) {
                        a20.getClass();
                        gc.c.f9941l = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIEVjCCAj6gAwIBAgIQY5WTY8JOcIJxWRi/w9ftVjANBgkqhkiG9w0BAQsFADBP\nMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJuZXQgU2VjdXJpdHkgUmVzZWFy\nY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBYMTAeFw0yNDAzMTMwMDAwMDBa\nFw0yNzAzMTIyMzU5NTlaMDIxCzAJBgNVBAYTAlVTMRYwFAYDVQQKEw1MZXQncyBF\nbmNyeXB0MQswCQYDVQQDEwJFODB2MBAGByqGSM49AgEGBSuBBAAiA2IABNFl8l7c\nS7QMApzSsvru6WyrOq44ofTUOTIzxULUzDMMNMchIJBwXOhiLxxxs0LXeb5GDcHb\nR6EToMffgSZjO9SNHfY9gjMy9vQr5/WWOrQTZxh7az6NSNnq3u2ubT6HTKOB+DCB\n9TAOBgNVHQ8BAf8EBAMCAYYwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMB\nMBIGA1UdEwEB/wQIMAYBAf8CAQAwHQYDVR0OBBYEFI8NE6L2Ln7RUGwzGDhdWY4j\ncpHKMB8GA1UdIwQYMBaAFHm0WeZ7tuXkAXOACIjIGlj26ZtuMDIGCCsGAQUFBwEB\nBCYwJDAiBggrBgEFBQcwAoYWaHR0cDovL3gxLmkubGVuY3Iub3JnLzATBgNVHSAE\nDDAKMAgGBmeBDAECATAnBgNVHR8EIDAeMBygGqAYhhZodHRwOi8veDEuYy5sZW5j\nci5vcmcvMA0GCSqGSIb3DQEBCwUAA4ICAQBnE0hGINKsCYWi0Xx1ygxD5qihEjZ0\nRI3tTZz1wuATH3ZwYPIp97kWEayanD1j0cDhIYzy4CkDo2jB8D5t0a6zZWzlr98d\nAQFNh8uKJkIHdLShy+nUyeZxc5bNeMp1Lu0gSzE4McqfmNMvIpeiwWSYO9w82Ob8\notvXcO2JUYi3svHIWRm3+707DUbL51XMcY2iZdlCq4Wa9nbuk3WTU4gr6LY8MzVA\naDQG2+4U3eJ6qUF10bBnR1uuVyDYs9RhrwucRVnfuDj29CMLTsplM5f5wSV5hUpm\nUwp/vV7M4w4aGunt74koX71n4EdagCsL/Yk5+mAQU0+tue0JOfAV/R6t1k+Xk9s2\nHMQFeoxppfzAVC04FdG9M+AC2JWxmFSt6BCuh3CEey3fE52Qrj9YM75rtvIjsm/1\nHl+u//Wqxnu1ZQ4jpa+VpuZiGOlWrqSP9eogdOhCGisnyewWJwRQOqK16wiGyZeR\nxs/Bekw65vwSIaVkBruPiTfMOo0Zh4gVa8/qJgMbJbyrwwG97z/PRgmLKCDl8z3d\ntA0Z7qq7fta0Gl24uyuB05dqI5J1LvAzKuWdIjT1tP8qCoxSE/xpix8hX2dt3h+/\njujUgFPFZ0EVZ0xSyBNRF3MboGZnYXFUxpNjTWPKpagDHJQmqrAcDmWJnMsFY3jS\nu1igv3OefnWjSQ==\n-----END CERTIFICATE-----");
                    } else {
                        a20.getClass();
                    }
                    certificate4 = gc.c.f9941l;
                } else {
                    certificate4 = null;
                }
                gc.c a21 = gc.a.a((gc.a) this.f128c);
                if (gc.c.f9942m == null) {
                    a21.getClass();
                    gc.c.f9942m = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIFazCCA1OgAwIBAgIRAIIQz7DSQONZRGPgu2OCiwAwDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMTUwNjA0MTEwNDM4\nWhcNMzUwNjA0MTEwNDM4WjBPMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJu\nZXQgU2VjdXJpdHkgUmVzZWFyY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBY\nMTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAK3oJHP0FDfzm54rVygc\nh77ct984kIxuPOZXoHj3dcKi/vVqbvYATyjb3miGbESTtrFj/RQSa78f0uoxmyF+\n0TM8ukj13Xnfs7j/EvEhmkvBioZxaUpmZmyPfjxwv60pIgbz5MDmgK7iS4+3mX6U\nA5/TR5d8mUgjU+g4rk8Kb4Mu0UlXjIB0ttov0DiNewNwIRt18jA8+o+u3dpjq+sW\nT8KOEUt+zwvo/7V3LvSye0rgTBIlDHCNAymg4VMk7BPZ7hm/ELNKjD+Jo2FR3qyH\nB5T0Y3HsLuJvW5iB4YlcNHlsdu87kGJ55tukmi8mxdAQ4Q7e2RCOFvu396j3x+UC\nB5iPNgiV5+I3lg02dZ77DnKxHZu8A/lJBdiB3QW0KtZB6awBdpUKD9jf1b0SHzUv\nKBds0pjBqAlkd25HN7rOrFleaJ1/ctaJxQZBKT5ZPt0m9STJEadao0xAH0ahmbWn\nOlFuhjuefXKnEgV4We0+UXgVCwOPjdAvBbI+e0ocS3MFEvzG6uBQE3xDk3SzynTn\njh8BCNAw1FtxNrQHusEwMFxIt4I7mKZ9YIqioymCzLq9gwQbooMDQaHWBfEbwrbw\nqHyGO0aoSCqI3Haadr8faqU9GY/rOPNk3sgrDQoo//fb4hVC1CLQJ13hef4Y53CI\nrU7m2Ys6xt0nUW7/vGT1M0NPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNV\nHRMBAf8EBTADAQH/MB0GA1UdDgQWBBR5tFnme7bl5AFzgAiIyBpY9umbbjANBgkq\nhkiG9w0BAQsFAAOCAgEAVR9YqbyyqFDQDLHYGmkgJykIrGF1XIpu+ILlaS/V9lZL\nubhzEFnTIZd+50xx+7LSYK05qAvqFyFWhfFQDlnrzuBZ6brJFe+GnY+EgPbk6ZGQ\n3BebYhtF8GaV0nxvwuo77x/Py9auJ/GpsMiu/X1+mvoiBOv/2X/qkSsisRcOj/KK\nNFtY2PwByVS5uCbMiogziUwthDyC3+6WVwW6LLv3xLfHTjuCvjHIInNzktHCgKQ5\nORAzI4JMPJ+GslWYHb4phowim57iaztXOoJwTdwJx4nLCgdNbOhdjsnvzqvHu7Ur\nTkXWStAmzOVyyghqpZXjFaH3pO3JLF+l+/+sKAIuvtd7u+Nxe5AW0wdeRlN8NwdC\njNPElpzVmbUq4JUagEiuTDkHzsxHpFKVK7q4+63SM1N95R1NbdWhscdCb+ZAJzVc\noyi3B43njTOQ5yOf+1CceWxG1bQVs5ZufpsMljq4Ui0/1lvh+wjChP4kqKOJ2qxq\n4RgqsahDYVvTH9w7jXbyLeiNdd8XM2w9U/t7y0Ff/9yi0GE44Za4rF2LN9d11TPA\nmRGunUHBcnWEvgJBQl9nJEiU0Zsnvgc/ubhPgXRR4Xq37Z0j4r7g1SgEEzwxA57d\nemyPxgcYxn/eR44/KJ4EBs+lVDR3veyJm+kXQ99b21/+jh5Xos1AnX5iItreGCc=\n-----END CERTIFICATE-----");
                } else {
                    a21.getClass();
                }
                Certificate certificate17 = gc.c.f9942m;
                if (i18 >= 34) {
                    gc.c a22 = gc.a.a((gc.a) this.f128c);
                    if (gc.c.f9943n == null) {
                        a22.getClass();
                        gc.c.f9943n = gc.c.a("-----BEGIN CERTIFICATE-----\nMIICGzCCAaGgAwIBAgIQQdKd0XLq7qeAwSxs6S+HUjAKBggqhkjOPQQDAzBPMQsw\nCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJuZXQgU2VjdXJpdHkgUmVzZWFyY2gg\nR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBYMjAeFw0yMDA5MDQwMDAwMDBaFw00\nMDA5MTcxNjAwMDBaME8xCzAJBgNVBAYTAlVTMSkwJwYDVQQKEyBJbnRlcm5ldCBT\nZWN1cml0eSBSZXNlYXJjaCBHcm91cDEVMBMGA1UEAxMMSVNSRyBSb290IFgyMHYw\nEAYHKoZIzj0CAQYFK4EEACIDYgAEzZvVn4CDCuwJSvMWSj5cz3es3mcFDR0HttwW\n+1qLFNvicWDEukWVEYmO6gbf9yoWHKS5xcUy4APgHoIYOIvXRdgKam7mAHf7AlF9\nItgKbppbd9/w+kHsOdx1ymgHDB/qo0IwQDAOBgNVHQ8BAf8EBAMCAQYwDwYDVR0T\nAQH/BAUwAwEB/zAdBgNVHQ4EFgQUfEKWrt5LSDv6kviejM9ti6lyN5UwCgYIKoZI\nzj0EAwMDaAAwZQIwe3lORlCEwkSHRhtFcP9Ymd70/aTSVaYgLXTWNLxBo1BfASdW\ntL4ndQavEi51mI38AjEAi/V3bNTIZargCyzuFJ0nN6T5U6VR5CmD1/iQMVtCnwr1\n/q4AaOeMSQ+2b1tbFfLn\n-----END CERTIFICATE-----");
                    } else {
                        a22.getClass();
                    }
                    certificate6 = gc.c.f9943n;
                    certificate5 = certificate17;
                    i5 = 34;
                } else {
                    certificate5 = certificate17;
                    i5 = 34;
                    certificate6 = null;
                }
                if (i18 >= i5) {
                    gc.c a23 = gc.a.a((gc.a) this.f128c);
                    if (gc.c.f9944o == null) {
                        a23.getClass();
                        gc.c.f9944o = gc.c.a("-----BEGIN CERTIFICATE-----\nMIIEUTCCAjmgAwIBAgIQfyq3B7W92Tyf1It8YCnbMzANBgkqhkiG9w0BAQsFADBP\nMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJuZXQgU2VjdXJpdHkgUmVzZWFy\nY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBYMTAeFw0yNTA5MDMwMDAwMDBa\nFw0zMjA5MDIyMzU5NTlaME8xCzAJBgNVBAYTAlVTMSkwJwYDVQQKEyBJbnRlcm5l\ndCBTZWN1cml0eSBSZXNlYXJjaCBHcm91cDEVMBMGA1UEAxMMSVNSRyBSb290IFgy\nMHYwEAYHKoZIzj0CAQYFK4EEACIDYgAEzZvVn4CDCuwJSvMWSj5cz3es3mcFDR0H\nttwW+1qLFNvicWDEukWVEYmO6gbf9yoWHKS5xcUy4APgHoIYOIvXRdgKam7mAHf7\nAlF9ItgKbppbd9/w+kHsOdx1ymgHDB/qo4HWMIHTMA4GA1UdDwEB/wQEAwIBBjAP\nBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBR8Qpau3ktIO/qS+J6Mz22LqXI3lTAf\nBgNVHSMEGDAWgBR5tFnme7bl5AFzgAiIyBpY9umbbjAyBggrBgEFBQcBAQQmMCQw\nIgYIKwYBBQUHMAKGFmh0dHA6Ly94MS5pLmxlbmNyLm9yZy8wEwYDVR0gBAwwCjAI\nBgZngQwBAgEwJwYDVR0fBCAwHjAcoBqgGIYWaHR0cDovL3gxLmMubGVuY3Iub3Jn\nLzANBgkqhkiG9w0BAQsFAAOCAgEABM/grwj+5UXC3ZsXNh34qWole7iF6bZGIYgx\n+2X+/SMafX2KABSvN5qV2rnaIMibfwg3lw8ACwc3hkV6ijxOParcvIQb/R4Fd2tB\n/6U67M+jEDaU8XBzA0GIY2VyA0gQIvckMU8nAoiub7aUicvYOkxl3QL2773OqSA2\niD9Ey9IiWp2yqUd3ajb6SLx1DNlfgDOSjZh5gbvyiqpFB6KOFc2+OAEwX1COlhMB\nUw0HOybjBvp4LSzJrmyOKgUTTfh57TG6fqpLOJcmtM8kAMnN2MsMgNj1S/Je2Wxi\n9tnZnhoxj23MBaJxcpOdliaDUQR+OkmisyYCKrczGo2qpinsNtkEK3Q59b7sgImE\nMvP9NMptAt2A8ovq6kfuiZxL8wXJwtTptXm7Bt69zTcSnE9CJIf5SeaSWWD0nf1v\n/2JZf8rX6vnSmcO2Rg44OGSXQGNOwgw2/DjOR6TyAE2OqdZr8EfYznzYmfXQsvLC\nocVslA4tXs/wPbRRpbKxu+azzxt9kEWIYQeHMJVVNgLXc8zHIxzaU4d5kuaNun8B\nprRRTs6BopkOQN4dCvFfg+qx6hXt5iemw+rKAWgStCaLoLxErwRjMbvgTeJ5qanN\nK4d+03nI08rtOXx4e8M3MgkrcMOGWzScJLycOJUAlXTYqSV4dUuZ0qzez774rqcx\nKC6Lmtk=\n-----END CERTIFICATE-----");
                    } else {
                        a23.getClass();
                    }
                    certificate7 = gc.c.f9944o;
                } else {
                    certificate7 = null;
                }
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                if (certificate != null) {
                    certificate8 = certificate11;
                    keyStore.setCertificateEntry("ISRGX2E5", gc.a.b((gc.a) this.f128c, certificate));
                } else {
                    certificate8 = certificate11;
                }
                if (certificate2 != null) {
                    keyStore.setCertificateEntry("ISRGX2E6", gc.a.b((gc.a) this.f128c, certificate2));
                }
                if (certificate13 != null) {
                    keyStore.setCertificateEntry("ISRGX2E5CrossX1", gc.a.b((gc.a) this.f128c, certificate13));
                }
                if (certificate14 != null) {
                    keyStore.setCertificateEntry("ISRGX2E6CrossX1", gc.a.b((gc.a) this.f128c, certificate14));
                }
                if (certificate15 != null) {
                    keyStore.setCertificateEntry("ISRGX1E7", gc.a.b((gc.a) this.f128c, certificate15));
                }
                if (certificate3 != null) {
                    keyStore.setCertificateEntry("ISRGX2E7CrossX1", gc.a.b((gc.a) this.f128c, certificate3));
                }
                if (certificate16 != null) {
                    keyStore.setCertificateEntry("ISRGX1E8", gc.a.b((gc.a) this.f128c, certificate16));
                }
                if (certificate4 != null) {
                    keyStore.setCertificateEntry("ISRGX2E8CrossX1", gc.a.b((gc.a) this.f128c, certificate4));
                }
                if (certificate6 != null) {
                    keyStore.setCertificateEntry("ISRGRootX2", gc.a.b((gc.a) this.f128c, certificate6));
                }
                if (certificate7 != null) {
                    keyStore.setCertificateEntry("ISRGRootX2CrossX1", gc.a.b((gc.a) this.f128c, certificate7));
                }
                if (certificate9 != null) {
                    keyStore.setCertificateEntry("ISRGX1R10", gc.a.b((gc.a) this.f128c, certificate9));
                }
                if (certificate10 != null) {
                    keyStore.setCertificateEntry("ISRGX1R11", gc.a.b((gc.a) this.f128c, certificate10));
                }
                if (certificate8 != null) {
                    keyStore.setCertificateEntry("ISRGX1R12", gc.a.b((gc.a) this.f128c, certificate8));
                }
                if (certificate12 != null) {
                    keyStore.setCertificateEntry("ISRGX1R13", gc.a.b((gc.a) this.f128c, certificate12));
                }
                if (certificate5 != null) {
                    keyStore.setCertificateEntry("ISRGRootX1", gc.a.b((gc.a) this.f128c, certificate5));
                }
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
                String defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm);
                trustManagerFactory.init(keyStore);
                gc.a aVar10 = (gc.a) this.f128c;
                Intrinsics.checkNotNull(defaultAlgorithm);
                X509TrustManager c12 = gc.a.c(aVar10, defaultAlgorithm, "AndroidCAStore");
                X509TrustManager c13 = gc.a.c((gc.a) this.f128c, defaultAlgorithm, "AndroidKeyStore");
                TrustManager trustManager = trustManagerFactory.getTrustManagers()[c2];
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                gc.b bVar = new gc.b(c12, c13, (X509TrustManager) trustManager);
                gc.b[] bVarArr = new gc.b[1];
                bVarArr[c2] = bVar;
                sSLContext.init(null, bVarArr, null);
                return new Pair(sSLContext, bVar);
            case 8:
                lf.a aVar11 = lf.a.f20034a;
                h8.b.B(obj);
                URLConnection openConnection = new URL("https://sport-insider.club/healthcheck").openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) this.f128c;
                if (sSLSocketFactory != null) {
                    httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                }
                httpsURLConnection.setConnectTimeout(5000);
                httpsURLConnection.setReadTimeout(5000);
                httpsURLConnection.setRequestMethod("GET");
                int responseCode = httpsURLConnection.getResponseCode();
                return Boolean.valueOf(200 <= responseCode && responseCode < 400);
            case 9:
                lf.a aVar12 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    return d.c((d) this.f128c).a("fbToken");
                } catch (Exception unused4) {
                    return null;
                }
            case 10:
                lf.a aVar13 = lf.a.f20034a;
                h8.b.B(obj);
                ((je.b) this.f128c).f18466c.h(Boolean.FALSE);
                return Unit.f19194a;
            case 11:
                lf.a aVar14 = lf.a.f20034a;
                h8.b.B(obj);
                ((c) this.f128c).f18478g.h(Boolean.FALSE);
                return Unit.f19194a;
            case 12:
                lf.a aVar15 = lf.a.f20034a;
                h8.b.B(obj);
                return (List) x.n0(x.e0().f23427b.f24213a, true, false, new ub.b(i16));
            case 13:
                lf.a aVar16 = lf.a.f20034a;
                h8.b.B(obj);
                y yVar5 = y.f8572a;
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                y networkType5 = y.f8573b;
                Intrinsics.checkNotNullParameter(networkType5, "networkType");
                e3.f fVar5 = new e3.f(new n3.i(null), networkType5, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet5) : g0.f19206a);
                Intrinsics.checkNotNullParameter(WorkerRating.class, "workerClass");
                return ((k0) y3.m(k0.class, null, 6)).c("WorkerBonus", e3.o.f8552b, (a0) ((e3.z) ((e3.z) ((e3.z) ((e3.z) new e3.z(WorkerRating.class).f(fVar5)).e(e3.a.f8472b, 1L, TimeUnit.MINUTES)).g(15L, TimeUnit.SECONDS)).a("TagWorkerBonus")).b());
            case 14:
                lf.a aVar17 = lf.a.f20034a;
                h8.b.B(obj);
                y yVar6 = y.f8572a;
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                y networkType6 = y.f8573b;
                Intrinsics.checkNotNullParameter(networkType6, "networkType");
                e3.f fVar6 = new e3.f(new n3.i(null), networkType6, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet6) : g0.f19206a);
                Intrinsics.checkNotNullParameter(WorkerPurchasesInfo.class, "workerClass");
                return ((k0) y3.m(k0.class, null, 6)).c("WorkerPurchaseInfo", e3.o.f8552b, (a0) ((e3.z) ((e3.z) ((e3.z) new e3.z(WorkerPurchasesInfo.class).f(fVar6)).e(e3.a.f8472b, 1L, TimeUnit.MINUTES)).a("TagWorkerPurchaseInfo")).b());
            case 15:
                lf.a aVar18 = lf.a.f20034a;
                h8.b.B(obj);
                return ((Resources) this.f128c).getString(R.string.odds);
            case 16:
                lf.a aVar19 = lf.a.f20034a;
                h8.b.B(obj);
                Context requireContext = ((PredictionFragment) this.f128c).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                x.l0(requireContext, null, new me.o(i17), x.E0());
                return Unit.f19194a;
            case 17:
                lf.a aVar20 = lf.a.f20034a;
                h8.b.B(obj);
                return new Integer(((Number) x.n0(x.e0().f23426a.f23832a, false, true, new d0(i15))).intValue());
            case 18:
                lf.a aVar21 = lf.a.f20034a;
                h8.b.B(obj);
                fa.a aVar22 = (fa.a) y3.m(fa.a.class, null, 6);
                aVar22.getClass();
                Intrinsics.checkNotNullParameter("DEPRECATED_VERSION_CODE", "key");
                SharedPreferences.Editor edit = aVar22.f9542b.edit();
                edit.putInt("DEPRECATED_VERSION_CODE", 123);
                edit.apply();
                return Unit.f19194a;
            case 19:
                lf.a aVar23 = lf.a.f20034a;
                h8.b.B(obj);
                return new Integer((int) (((Context) this.f128c).getResources().getDisplayMetrics().density * 67.0f));
            case 20:
                lf.a aVar24 = lf.a.f20034a;
                h8.b.B(obj);
                y yVar7 = y.f8572a;
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                y networkType7 = y.f8573b;
                Intrinsics.checkNotNullParameter(networkType7, "networkType");
                e3.f fVar7 = new e3.f(new n3.i(null), networkType7, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet7) : g0.f19206a);
                Intrinsics.checkNotNullParameter(WorkerTestPush.class, "workerClass");
                return ((k0) y3.m(k0.class, null, 6)).c("WorkerTestPush", e3.o.f8552b, (a0) ((e3.z) ((e3.z) ((e3.z) new e3.z(WorkerTestPush.class).f(fVar7)).e(e3.a.f8472b, 10L, TimeUnit.SECONDS)).a("WorkerTestPush")).b());
            case 21:
                lf.a aVar25 = lf.a.f20034a;
                h8.b.B(obj);
                k kVar = (k) this.f128c;
                gf.k.b(new v(9));
                ((la.a) y3.m(la.a.class, null, 6)).getClass();
                hg.g i19 = u0.i(la.a.a());
                lg.e eVar2 = m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                kVar.f21210c = u0.p(new u(u0.n(new u(u0.n(new q(u0.i(u0.n(i19, dVar2)), i14), dVar2), new me.y(kVar, continuation, i16), 2), jg.q.f18523a), new ge.o(i14, continuation, i10)), d1.i(kVar));
                return Unit.f19194a;
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                lf.a aVar26 = lf.a.f20034a;
                h8.b.B(obj);
                String str3 = p3.f.f21509a;
                m3.o oVar = (m3.o) this.f128c;
                e3.x.e().a(str3, "Constraints changed for " + oVar);
                return Unit.f19194a;
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                lf.a aVar27 = lf.a.f20034a;
                h8.b.B(obj);
                return ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).b();
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                lf.a aVar28 = lf.a.f20034a;
                h8.b.B(obj);
                pd.c cVar = (pd.c) this.f128c;
                yc.e eVar3 = new yc.e();
                ((la.o) y3.m(la.o.class, null, 6)).getClass();
                String str4 = gc.d.f9945a;
                String language = d2.i.c();
                Intrinsics.checkNotNullParameter(language, "language");
                pb.e eVar4 = (pb.e) y3.m(pb.e.class, null, 6);
                eVar4.getClass();
                Intrinsics.checkNotNullParameter(language, "language");
                p pVar = new p(new id.u(io.sentry.config.a.e(eVar4.f21602a.f21595a, new String[]{SportsTable.TABLE_NAME}, new d0(i10)), c10 == true ? 1 : 0), eVar4, language, i16);
                lg.e eVar5 = m0.f9201a;
                lg.d dVar3 = lg.d.f20063c;
                cVar.f21731b = u0.p(new u(u0.n(new u(u0.n(u0.i(new bd.g(new c1.u(8, new q(u0.n(u0.n(new q(u0.n(pVar, dVar3), i16), dVar3), dVar3), c8 == true ? 1 : 0)), eVar3, i11)), dVar3), new me.y(cVar, continuation, i13), 2), dVar3), new ge.o(i14, continuation, 16)), d1.i(cVar));
                return Unit.f19194a;
            case C0122e9.F /* 25 */:
                lf.a aVar29 = lf.a.f20034a;
                h8.b.B(obj);
                t tVar = (t) this.f128c;
                tVar.f21793c.getClass();
                u uVar = new u(uc.c.a(), new me.y(tVar, continuation, i11), 2);
                lg.e eVar6 = m0.f9201a;
                tVar.f21798h = u0.p(new u(u0.n(uVar, jg.q.f18523a), new pd.k(i14, continuation, i16)), d1.i(tVar));
                return Unit.f19194a;
            case C0122e9.G /* 26 */:
                lf.a aVar30 = lf.a.f20034a;
                h8.b.B(obj);
                pe.f fVar8 = (pe.f) this.f128c;
                id.c cVar2 = fVar8.f21833b;
                ((id.x) cVar2.f11146a.getValue()).getClass();
                id.x.d().getClass();
                q qVar = new q(u0.i(new q(io.sentry.config.a.e(((sb.j) y3.m(sb.j.class, null, 6)).f23427b.f24213a, new String[]{"table_prediction_preview", "favorite_table"}, new ub.b(i17)), c11 == true ? 1 : 0)), i13);
                lg.e eVar7 = m0.f9201a;
                fVar8.f21837f = u0.p(new u(u0.n(new u(u0.n(u0.n(new bd.g(u0.n(qVar, lg.d.f20063c), cVar2, i13), m0.f9201a), fVar8.f21838g), new me.y(fVar8, continuation, 11), 2), fVar8.f21836e), new ge.o(i14, continuation, i12)), d1.i(fVar8));
                return Unit.f19194a;
            case C0122e9.H /* 27 */:
                lf.a aVar31 = lf.a.f20034a;
                h8.b.B(obj);
                Context requireContext2 = ((PredictionListFragment) this.f128c).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                x.l0(requireContext2, null, new me.o(i16), x.E0());
                return Unit.f19194a;
            case 28:
                lf.a aVar32 = lf.a.f20034a;
                h8.b.B(obj);
                return Boolean.valueOf(((Intent) this.f128c).getBooleanExtra("existBonus", false));
            default:
                s sVar = (s) this.f128c;
                lf.a aVar33 = lf.a.f20034a;
                h8.b.B(obj);
                if (r.e()) {
                    y1.a aVar34 = new y1.a(R.id.action_global_liveFragment);
                    Intrinsics.checkNotNullExpressionValue(aVar34, "actionGlobalLiveFragment(...)");
                    mc.a aVar35 = s.F;
                    sVar.i(aVar34);
                } else {
                    da.f fVar9 = new da.f();
                    Intrinsics.checkNotNullExpressionValue(fVar9, "actionGlobalLivePayFragment(...)");
                    mc.a aVar36 = s.F;
                    sVar.i(fVar9);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m7.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f127b = 20;
        e3.o oVar = e3.o.f8551a;
        this.f128c = bVar;
    }
}
