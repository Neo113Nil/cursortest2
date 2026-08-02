package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class m1 implements Runnable {
    public final /* synthetic */ n1 a;

    public m1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        n1 n1Var = this.a;
        t0 t0Var = (t0) com.fyber.inneractive.sdk.util.v.a(n1Var.b);
        Thread thread = (Thread) com.fyber.inneractive.sdk.util.v.a(this.a.a);
        if (t0Var == null || t0Var.f == i1.DONE || t0Var.f == i1.RESOLVED) {
            return;
        }
        boolean v = t0Var.v();
        IAlog.a("%s : NetworkWatchdogHolder : should report: %s", IAlog.a(n1.class), Boolean.valueOf(v));
        if (v) {
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                Exception exc = new Exception();
                exc.setStackTrace(stackTrace);
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                str = stringWriter.getBuffer().toString();
            } else {
                str = "";
            }
            String r = t0Var.r();
            InneractiveAdRequest inneractiveAdRequest = t0Var instanceof q0 ? ((q0) t0Var).p : null;
            com.fyber.inneractive.sdk.response.e eVar = t0Var instanceof f1 ? ((f1) t0Var).s : null;
            u uVar = u.NETWORK_REQUEST_PASSED_ALLOWED_TIME;
            JSONArray b = t0Var.k() != null ? t0Var.k().b() : null;
            w wVar = new w(eVar);
            wVar.c = uVar;
            wVar.a = inneractiveAdRequest;
            wVar.d = b;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", r);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", r);
            }
            try {
                jSONObject.put(CrashHianalyticsData.STACK_TRACE, str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", CrashHianalyticsData.STACK_TRACE, str);
            }
            Integer valueOf = Integer.valueOf(n1Var.c);
            try {
                jSONObject.put("total_time", valueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "total_time", valueOf);
            }
            wVar.f.put(jSONObject);
            wVar.a((String) null);
        }
        IAlog.a("%s : NetworkWatchdogHolder should cancel by timeout: %d", IAlog.a(n1Var), Integer.valueOf(n1Var.c));
        t0Var.d();
    }
}
