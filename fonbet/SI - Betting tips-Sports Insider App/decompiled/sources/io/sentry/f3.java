package io.sentry;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f16393a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.v f16394b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f16395c;

    /* renamed from: d, reason: collision with root package name */
    public final File f16396d;

    /* renamed from: e, reason: collision with root package name */
    public final double f16397e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16398f = ConstantDeviceInfo.APP_PLATFORM;

    public f3(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, Map map, File file, k4 k4Var) {
        this.f16393a = vVar;
        this.f16394b = vVar2;
        this.f16395c = new ConcurrentHashMap(map);
        this.f16396d = file;
        this.f16397e = k4Var.d() / 1.0E9d;
    }
}
