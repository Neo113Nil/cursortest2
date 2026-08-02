package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.InterfaceC4035d7;
import com.ironsource.InterfaceC4418ye;
import com.ironsource.Te;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import defpackage.ndd;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Oe implements Pe {

    @NotNull
    private final C4037d9 a;

    public /* synthetic */ Oe(C4037d9 c4037d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4037d9(null, null, 3, null) : c4037d9);
    }

    private final InterfaceC4418ye a(Context context, Ee ee, C4328te c4328te) {
        try {
            String c = ee.c(context);
            if (TextUtils.isEmpty(c)) {
                c = ee.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = c;
            C3959aa c2 = ee.c();
            String a = Ve.a(context, c4328te.d(), c4328te.f(), str, null, true, c2 != null ? c2.f() : null, false);
            String jSONObject = C4073f9.a().toString();
            jSONObject.getClass();
            InterfaceC4035d7 a2 = C3999b7.a(a, jSONObject);
            if (a2 instanceof InterfaceC4035d7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC4035d7.a) a2).a());
                return new InterfaceC4418ye.a(a((InterfaceC4035d7.a) a2), null, 2, null);
            }
            if (!(a2 instanceof InterfaceC4035d7.b)) {
                throw new ndd();
            }
            String d = ((InterfaceC4035d7.b) a2).d();
            if (ee.d()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject2 = new JSONObject(d);
                String optString = jSONObject2.optString("response");
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new InterfaceC4418ye.a(new C4221ne(2100, C4275qe.h), null, 2, null);
                }
                boolean optBoolean = jSONObject2.optBoolean("compression", false);
                optString.getClass();
                d = a(optString, optBoolean);
                if (TextUtils.isEmpty(d)) {
                    ironLog.warning("encoded response invalid - return null");
                    ee.e();
                    return new InterfaceC4418ye.a(new C4221ne(C4221ne.f, C4275qe.g), null, 2, null);
                }
            }
            this.a.a(d);
            Te te = new Te(context, c4328te.d(), c4328te.f(), d);
            te.a(Te.a.SERVER);
            if (te.q()) {
                return new InterfaceC4418ye.b(new C4346ue(te), this.a);
            }
            IronLog.INTERNAL.warning("response invalid - return null");
            String e = te.e();
            if (e == null) {
                e = "Unknown";
            }
            return new InterfaceC4418ye.a(new C4221ne(C4221ne.e, e), this.a);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.warning("exception = " + e2);
            return new InterfaceC4418ye.a(e2 instanceof JSONException ? new C4221ne(C4221ne.e, "serverResponseIsNotValid") : new C4221ne(510, "internal error"), null, 2, null);
        }
    }

    private final InterfaceC4418ye b(Context context, Ee ee, C4328te c4328te) {
        InterfaceC4418ye a = a(context, ee, c4328te);
        if (a instanceof InterfaceC4418ye.a) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
            Te a2 = ee.a(context, c4328te.d());
            if (a2 != null && a2.q()) {
                InterfaceC4418ye.b bVar = new InterfaceC4418ye.b(new C4346ue(a2), null);
                IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c4328te.d(), c4328te.f());
                IronSourceLoggerManager.getLogger().log(ironSourceTag, buildUsingCachedConfigurationError + ": " + bVar.d(), 1);
                ee.b();
                return bVar;
            }
        }
        return a;
    }

    public Oe(@NotNull C4037d9 c4037d9) {
        c4037d9.getClass();
        this.a = c4037d9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Oe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Pe
    public void a(@NotNull Context context, @NotNull C4328te c4328te, @NotNull Ee ee, @NotNull InterfaceC4292re interfaceC4292re) {
        context.getClass();
        c4328te.getClass();
        ee.getClass();
        interfaceC4292re.getClass();
        String f = c4328te.f();
        if (f == null) {
            f = "";
        }
        ee.a("userId", f);
        ee.a("appKey", c4328te.d());
        ee.g().i(c4328te.f());
        ee.f();
        InterfaceC4418ye b = b(context, ee, c4328te);
        if (b instanceof InterfaceC4418ye.b) {
            InterfaceC4418ye.b bVar = (InterfaceC4418ye.b) b;
            interfaceC4292re.a(new C4185le(bVar.d(), null, bVar.c()));
        } else if (b instanceof InterfaceC4418ye.a) {
            InterfaceC4418ye.a aVar = (InterfaceC4418ye.a) b;
            interfaceC4292re.a(aVar.c(), aVar.d());
        }
    }

    private final String a(String str, boolean z) {
        if (z) {
            String d = I9.d(C4123i5.b().c(), str);
            d.getClass();
            return d;
        }
        String b = I9.b(C4123i5.b().c(), str);
        b.getClass();
        return b;
    }

    private final C4221ne a(InterfaceC4035d7.a aVar) {
        return new C4221ne(aVar.b() ? C4221ne.d : C4221ne.h, aVar.a());
    }
}
