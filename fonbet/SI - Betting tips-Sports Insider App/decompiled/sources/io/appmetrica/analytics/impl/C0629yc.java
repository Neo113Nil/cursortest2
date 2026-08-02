package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629yc extends I2 {
    public C0629yc(Context context, Bf bf2, ReporterConfig reporterConfig, C0585wi c0585wi, M9 m92) {
        this(context, c0585wi, new Fh(bf2, new CounterConfiguration(reporterConfig), new D8(new C0463rl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), m92, C0040b4.l().n(), new Rn(), new Eg(), new C0548v6(), new C0088d0(), new Je(m92));
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final String j() {
        return "[ManualReporter]";
    }

    public C0629yc(Context context, C0585wi c0585wi, Fh fh2, M9 m92, C0448r6 c0448r6, Rn rn, Eg eg2, C0548v6 c0548v6, C0088d0 c0088d0, Je je2) {
        super(context, c0585wi, fh2, m92, c0448r6, rn, eg2, c0548v6, c0088d0, je2);
        C0040b4.l().getClass();
    }
}
