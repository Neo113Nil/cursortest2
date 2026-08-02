package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299l6 implements Ua {

    /* renamed from: a, reason: collision with root package name */
    public final C0324m6 f14172a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f14173b;

    public C0299l6(@NotNull C0324m6 c0324m6) {
        this.f14172a = c0324m6;
        this.f14173b = c0324m6.a();
        C0040b4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(@NotNull Qn qn) {
        C0585wi c0585wi = this.f14172a.f14231a;
        C0559vh a7 = c0585wi.a(qn, this.f14173b);
        Fh fh2 = a7.f14798e;
        Pl pl = c0585wi.f14848e;
        if (pl != null) {
            fh2.f12301b.setUuid(((Ol) pl).g());
        } else {
            fh2.getClass();
        }
        c0585wi.f14846c.b(a7);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + qn, new Object[0]);
    }

    public final void a(@NotNull AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Fh fh2 = this.f14173b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (fh2) {
                    D8 d82 = fh2.f12226c;
                    d82.f12137b.b(d82.f12136a, key, value);
                }
            }
        }
    }
}
