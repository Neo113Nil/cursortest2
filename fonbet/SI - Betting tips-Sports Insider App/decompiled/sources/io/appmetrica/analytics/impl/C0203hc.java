package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203hc extends I2 implements Ia {

    /* renamed from: r, reason: collision with root package name */
    public static final Long f13894r = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final C0479sc f13895p;
    public final C0229ic q;

    public C0203hc(C0479sc c0479sc) {
        super(c0479sc.b(), c0479sc.i(), c0479sc.h(), c0479sc.d(), c0479sc.f(), c0479sc.j(), c0479sc.g(), c0479sc.c(), c0479sc.a(), c0479sc.e());
        this.f13895p = c0479sc;
        this.q = new C0229ic(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0293l0 c0293l0) {
        if (c0293l0.f14159b) {
            clearAppEnvironment();
        }
        List<String> list = c0293l0.f14158a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f12337b.f12301b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.f12338c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            Bd bd2 = this.f13895p.f14631c;
            Context context = this.f12336a;
            bd2.f12055d = new H0(this.f12337b.f12301b.getApiKey(), bd2.f12052a.f12060a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, bd2.f12052a.f12060a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), bd2.f12052a.f12060a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f12337b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            H0 h02 = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = bd2.f12053b;
                I0 i02 = bd2.f12054c;
                H0 h03 = bd2.f12055d;
                if (h03 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nativeCrashMetadata");
                } else {
                    h02 = h03;
                }
                i02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, I0.a(h02)));
            }
        }
        C0229ic c0229ic = this.q;
        synchronized (c0229ic) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c0229ic.f13940a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c0229ic.f13941b.a(c0229ic.f13940a);
                } else {
                    c0229ic.f13941b.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b(Activity activity) {
        if (this.f13895p.f14637i.a(activity, EnumC0392p.PAUSED)) {
            this.f12338c.info("Pause session", new Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            C0115e2 c0115e2 = this.f13895p.f14635g;
            synchronized (c0115e2) {
                for (C0090d2 c0090d2 : c0115e2.f13635a) {
                    if (!c0090d2.f13558d) {
                        c0090d2.f13558d = true;
                        c0090d2.f13556b.executeDelayed(c0090d2.f13559e, c0090d2.f13557c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void c() {
        C0229ic c0229ic = this.q;
        synchronized (c0229ic) {
            c0229ic.f13941b.a(c0229ic.f13940a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final List<String> f() {
        return this.f12337b.f12300a.b();
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final void k() {
        super.k();
        C0040b4.l().m().c();
    }

    public final void l() {
        C0585wi c0585wi = this.f12343h;
        c0585wi.f14846c.a(this.f12337b.f12300a);
        C0115e2 c0115e2 = this.f13895p.f14635g;
        C0177gc c0177gc = new C0177gc(this);
        long longValue = f13894r.longValue();
        synchronized (c0115e2) {
            c0115e2.a(c0177gc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull String str, boolean z5) {
        this.f12338c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0585wi c0585wi = this.f12343h;
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z5));
        String b10 = AbstractC0176gb.b(hashMap);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(b10, "", 8208, 0, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull EnumC0342n enumC0342n) {
        if (enumC0342n == EnumC0342n.f14287b) {
            this.f12338c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f12338c.warning("Could not enable activity auto tracking. " + enumC0342n.f14291a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(Activity activity) {
        if (this.f13895p.f14637i.a(activity, EnumC0392p.RESUMED)) {
            this.f12338c.info("Resume session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C0115e2 c0115e2 = this.f13895p.f14635g;
            synchronized (c0115e2) {
                for (C0090d2 c0090d2 : c0115e2.f13635a) {
                    if (c0090d2.f13558d) {
                        c0090d2.f13558d = false;
                        c0090d2.f13556b.remove(c0090d2.f13559e);
                        C0203hc c0203hc = c0090d2.f13555a.f13827a;
                        c0203hc.f12343h.f14846c.b(c0203hc.f12337b.f12300a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
        this.f12337b.f12301b.setManualLocation(location);
        this.f12338c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z5) {
        this.f12337b.f12301b.setLocationTracking(z5);
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z5, boolean z7) {
        this.f12338c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z5));
        this.f12337b.f12301b.setAdvIdentifiersTracking(z5, z7);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull Ho ho) {
        PublicLogger publicLogger = this.f12338c;
        synchronized (ho) {
            ho.f12332b = publicLogger;
        }
        Iterator it = ho.f12331a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        ho.f12331a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull AnrListener anrListener) {
        this.q.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(@NonNull ExternalAttribution externalAttribution) {
        this.f12338c.info("External attribution received: %s", externalAttribution);
        C0585wi c0585wi = this.f12343h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f12338c;
        Set set = AbstractC0576w9.f14825a;
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(bytes, "", 42, publicLogger);
        Fh fh2 = this.f12337b;
        c0585wi.getClass();
        c0585wi.a(C0585wi.a(m32, fh2), fh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.I2, io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
        super.a(str, str2);
        Bd bd2 = this.f13895p.f14631c;
        String d10 = this.f12337b.d();
        H0 h02 = bd2.f12055d;
        if (h02 != null) {
            H0 h03 = new H0(h02.f12293a, h02.f12294b, h02.f12295c, h02.f12296d, h02.f12297e, d10);
            bd2.f12055d = h03;
            NativeCrashClientModule nativeCrashClientModule = bd2.f12053b;
            bd2.f12054c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(I0.a(h03));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(@NonNull String str) {
        this.f12338c.info("Add auto collected data subscriber: %s", str);
        this.f12337b.f12301b.addAutoCollectedDataSubscriber(str);
    }
}
