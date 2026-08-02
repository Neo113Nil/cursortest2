package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Yg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        Ze y5 = C0353na.I.y();
        if (timePassedChecker.didTimePassMillis(y5.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pair = new Pair("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pair2 = new Pair("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pair3 = new Pair("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kotlinVersion.getMajor());
            sb2.append('.');
            sb2.append(kotlinVersion.getMinor());
            sb2.append('.');
            sb2.append(kotlinVersion.getPatch());
            Map e7 = kotlin.collections.n0.e(pair, pair2, pair3, new Pair("version", sb2.toString()));
            Qj qj = AbstractC0387oj.f14425a;
            qj.getClass();
            qj.a(new Pj("kotlin_version", e7));
            y5.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
