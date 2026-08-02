package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.Ae;
import com.ironsource.InterfaceC2434g7;
import com.ironsource.Ve;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Qe implements Re {
    private final C2364c9 a;

    /* JADX WARN: Multi-variable type inference failed */
    public Qe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Ae b(Context context, Ge ge, C2709ve c2709ve) {
        Ae a = a(context, ge, c2709ve);
        if (a instanceof Ae.a) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
            Ve a2 = ge.a(context, c2709ve.d());
            if (a2 != null && a2.q()) {
                Ae.b bVar = new Ae.b(new C2727we(a2), null);
                IronSourceLoggerManager.getLogger().log(ironSourceTag, ErrorBuilder.buildUsingCachedConfigurationError(c2709ve.d(), c2709ve.f()) + ": " + bVar.d(), 1);
                ge.b();
                return bVar;
            }
        }
        return a;
    }

    @Override // com.ironsource.Re
    public void a(Context context, C2709ve request, Ge tools, InterfaceC2673te listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String f = request.f();
        if (f == null) {
            f = "";
        }
        tools.a("userId", f);
        tools.a("appKey", request.d());
        tools.g().i(request.f());
        tools.f();
        Ae b = b(context, tools, request);
        if (b instanceof Ae.b) {
            Ae.b bVar = (Ae.b) b;
            listener.a(new C2566ne(bVar.d(), null, bVar.c()));
        } else if (b instanceof Ae.a) {
            Ae.a aVar = (Ae.a) b;
            listener.a(aVar.c(), aVar.d());
        }
    }

    public Qe(C2364c9 performanceMeasurer) {
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.a = performanceMeasurer;
    }

    public /* synthetic */ Qe(C2364c9 c2364c9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C2364c9(null, null, 3, null) : c2364c9);
    }

    private final Ae a(Context context, Ge ge, C2709ve c2709ve) {
        C2602pe c2602pe;
        try {
            String c = ge.c(context);
            if (TextUtils.isEmpty(c)) {
                c = ge.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = c;
            C2329aa c2 = ge.c();
            String a = Xe.a(context, c2709ve.d(), c2709ve.f(), str, null, true, c2 != null ? c2.f() : null, false);
            String jSONObject = C2400e9.a().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "createRequestData().toString()");
            InterfaceC2434g7 serverResponse = C2398e7.a(a, jSONObject);
            if (serverResponse instanceof InterfaceC2434g7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC2434g7.a) serverResponse).a());
                Intrinsics.checkNotNullExpressionValue(serverResponse, "serverResponse");
                return new Ae.a(a((InterfaceC2434g7.a) serverResponse), null, 2, null);
            }
            if (serverResponse instanceof InterfaceC2434g7.b) {
                String d = ((InterfaceC2434g7.b) serverResponse).d();
                if (ge.d()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(d);
                    String encryptedResponse = jsonObjectInit.optString("response");
                    if (TextUtils.isEmpty(encryptedResponse)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new Ae.a(new C2602pe(2100, C2655se.h), null, 2, null);
                    }
                    boolean optBoolean = jsonObjectInit.optBoolean("compression", false);
                    Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                    d = a(encryptedResponse, optBoolean);
                    if (TextUtils.isEmpty(d)) {
                        ironLog.warning("encoded response invalid - return null");
                        ge.e();
                        return new Ae.a(new C2602pe(C2602pe.f, C2655se.g), null, 2, null);
                    }
                }
                this.a.a(d);
                Ve ve = new Ve(context, c2709ve.d(), c2709ve.f(), d);
                ve.a(Ve.a.SERVER);
                if (!ve.q()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    String e = ve.e();
                    if (e == null) {
                        e = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    }
                    return new Ae.a(new C2602pe(C2602pe.e, e), this.a);
                }
                return new Ae.b(new C2727we(ve), this.a);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.warning("exception = " + e2);
            if (e2 instanceof JSONException) {
                c2602pe = new C2602pe(C2602pe.e, "serverResponseIsNotValid");
            } else {
                c2602pe = new C2602pe(510, "internal error");
            }
            return new Ae.a(c2602pe, null, 2, null);
        }
    }

    private final String a(String str, boolean z) {
        if (z) {
            String d = I9.d(C2503k5.b().c(), str);
            Intrinsics.checkNotNullExpressionValue(d, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return d;
        }
        String b = I9.b(C2503k5.b().c(), str);
        Intrinsics.checkNotNullExpressionValue(b, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return b;
    }

    private final C2602pe a(InterfaceC2434g7.a aVar) {
        return new C2602pe(aVar.b() ? C2602pe.d : C2602pe.h, aVar.a());
    }
}
