package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.ironsource.Ae;
import com.ironsource.InterfaceC4348h7;
import com.ironsource.Ve;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Qe implements Re {
    private final C4278d9 a;

    /* JADX WARN: Multi-variable type inference failed */
    public Qe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Ae b(Context context, Ge ge, C4605ve c4605ve) {
        Ae a = a(context, ge, c4605ve);
        if (a instanceof Ae.a) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
            Ve a2 = ge.a(context, c4605ve.d());
            if (a2 != null && a2.q()) {
                Ae.b bVar = new Ae.b(new C4623we(a2), null);
                IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c4605ve.d(), c4605ve.f());
                IronSourceLoggerManager.getLogger().log(ironSourceTag, buildUsingCachedConfigurationError + ": " + bVar.d(), 1);
                ge.b();
                return bVar;
            }
        }
        return a;
    }

    @Override // com.ironsource.Re
    public void a(Context context, C4605ve c4605ve, Ge ge, InterfaceC4569te interfaceC4569te) {
        String f = c4605ve.f();
        if (f == null) {
            f = "";
        }
        ge.a("userId", f);
        ge.a("appKey", c4605ve.d());
        ge.g().i(c4605ve.f());
        ge.f();
        Ae b = b(context, ge, c4605ve);
        if (b instanceof Ae.b) {
            Ae.b bVar = (Ae.b) b;
            interfaceC4569te.a(new C4462ne(bVar.d(), null, bVar.c()));
        } else if (b instanceof Ae.a) {
            Ae.a aVar = (Ae.a) b;
            interfaceC4569te.a(aVar.c(), aVar.d());
        }
    }

    public Qe(C4278d9 c4278d9) {
        this.a = c4278d9;
    }

    public /* synthetic */ Qe(C4278d9 c4278d9, int i, zcl zclVar) {
        this((i & 1) != 0 ? new C4278d9(null, null, 3, null) : c4278d9);
    }

    private final Ae a(Context context, Ge ge, C4605ve c4605ve) {
        C4498pe c4498pe;
        try {
            String c = ge.c(context);
            if (TextUtils.isEmpty(c)) {
                c = ge.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = c;
            C4243ba c2 = ge.c();
            InterfaceC4348h7 a = C4312f7.a(Xe.a(context, c4605ve.d(), c4605ve.f(), str, null, true, c2 != null ? c2.f() : null, false), C4314f9.a().toString());
            if (a instanceof InterfaceC4348h7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC4348h7.a) a).a());
                return new Ae.a(a((InterfaceC4348h7.a) a), null, 2, null);
            }
            if (a instanceof InterfaceC4348h7.b) {
                String d = ((InterfaceC4348h7.b) a).d();
                if (ge.d()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    JSONObject jSONObject = new JSONObject(d);
                    String optString = jSONObject.optString("response");
                    if (TextUtils.isEmpty(optString)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new Ae.a(new C4498pe(C4498pe.g, C4551se.h), null, 2, null);
                    }
                    d = a(optString, jSONObject.optBoolean(EndpointParameters.Name.COMPRESSION, false));
                    if (TextUtils.isEmpty(d)) {
                        ironLog.warning("encoded response invalid - return null");
                        ge.e();
                        return new Ae.a(new C4498pe(C4498pe.f, C4551se.g), null, 2, null);
                    }
                }
                this.a.a(d);
                Ve ve = new Ve(context, c4605ve.d(), c4605ve.f(), d);
                ve.a(Ve.a.SERVER);
                if (!ve.q()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    String e = ve.e();
                    if (e == null) {
                        e = DeviceInfo.STR_TYPE_UNKNOWN;
                    }
                    return new Ae.a(new C4498pe(C4498pe.e, e), this.a);
                }
                return new Ae.b(new C4623we(ve), this.a);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.warning("exception = " + e2);
            if (e2 instanceof JSONException) {
                c4498pe = new C4498pe(C4498pe.e, "serverResponseIsNotValid");
            } else {
                c4498pe = new C4498pe(510, "internal error");
            }
            return new Ae.a(c4498pe, null, 2, null);
        }
    }

    private final String a(String str, boolean z) {
        if (z) {
            return J9.d(C4399k5.b().c(), str);
        }
        return J9.b(C4399k5.b().c(), str);
    }

    private final C4498pe a(InterfaceC4348h7.a aVar) {
        return new C4498pe(aVar.b() ? C4498pe.d : C4498pe.h, aVar.a());
    }
}
