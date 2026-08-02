package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335mh extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0507tf f14271b;

    /* renamed from: c, reason: collision with root package name */
    public final xo f14272c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f14273d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeProvider f14274e;

    public C0335mh(@NonNull X4 x42) {
        this(x42, x42.u(), C0353na.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        X4 x42 = this.f12818a;
        if (this.f14272c.d()) {
            return false;
        }
        P5 a7 = ((C0285kh) x42.f13151k.a()).f14126e ? P5.a(p52, EnumC0047bb.EVENT_TYPE_APP_UPDATE) : P5.a(p52, EnumC0047bb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f14273d.getInstallerPackageName(x42.f13142a, x42.f13143b.f12770a), ""));
            C0507tf c0507tf = this.f14271b;
            c0507tf.f12749h.a(c0507tf.f12742a);
            jSONObject.put("preloadInfo", ((C0433qf) c0507tf.c()).b());
        } catch (Throwable unused) {
        }
        a7.setValue(jSONObject.toString());
        C0277k9 c0277k9 = x42.f13154n;
        c0277k9.a(a7, Rk.a(c0277k9.f14108c.b(a7), a7.f12735i));
        xo xoVar = this.f14272c;
        synchronized (xoVar) {
            yo yoVar = xoVar.f14934a;
            yoVar.a(yoVar.a().put("init_event_done", true));
        }
        this.f14272c.a(this.f14274e.currentTimeMillis());
        return false;
    }

    public C0335mh(X4 x42, xo xoVar, C0507tf c0507tf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(x42);
        this.f14272c = xoVar;
        this.f14271b = c0507tf;
        this.f14273d = safePackageManager;
        this.f14274e = systemTimeProvider;
    }
}
