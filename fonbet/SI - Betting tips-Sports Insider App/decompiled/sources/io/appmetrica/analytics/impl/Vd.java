package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Vd {

    /* renamed from: a, reason: collision with root package name */
    public static final Vd f13036a = new Vd();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f13037b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f13038c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "8.0.0", "50147728");

    public final synchronized ExponentialBackoffDataHolder a(Td td2) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = f13037b;
            obj = linkedHashMap.get(td2);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new C0577wa(C0353na.I.y(), td2), td2.name());
                linkedHashMap.put(td2, obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(X4 x42) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        Zg zg2 = new Zg(aESRSARequestBodyEncrypter);
        C0628yb c0628yb = new C0628yb(x42);
        return new NetworkTask(new BlockingExecutor(), new C0398p5(x42.f13142a), new AllHostsExponentialBackoffPolicy(f13036a.a(Td.REPORT)), new C0534uh(x42, zg2, c0628yb, new FullUrlFormer(zg2, c0628yb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), x42.i(), x42.p(), x42.u(), aESRSARequestBodyEncrypter), kotlin.collections.t.c(new ko()), f13038c);
    }
}
