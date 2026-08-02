package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.d;
import okhttp3.l;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;
import okhttp3.u;
import okhttp3.v;
import xsna.e560;
import xsna.f560;
import xsna.lb9;
import xsna.n8x;
import xsna.xop0;

/* loaded from: classes13.dex */
public class FirebasePerfOkHttpClient {
    public static void a(u uVar, e560 e560Var, long j, long j2) throws IOException {
        p pVar = uVar.b;
        if (pVar == null) {
            return;
        }
        e560Var.n(pVar.a.j().toString());
        e560Var.e(pVar.b);
        t tVar = pVar.d;
        if (tVar != null) {
            long contentLength = tVar.contentLength();
            if (contentLength != -1) {
                e560Var.g(contentLength);
            }
        }
        v vVar = uVar.h;
        if (vVar != null) {
            long contentLength2 = vVar.contentLength();
            if (contentLength2 != -1) {
                e560Var.k(contentLength2);
            }
            m contentType = vVar.contentType();
            if (contentType != null) {
                e560Var.j(contentType.a);
            }
        }
        e560Var.f(uVar.e);
        e560Var.i(j);
        e560Var.l(j2);
        e560Var.d();
    }

    @Keep
    public static void enqueue(d dVar, lb9 lb9Var) {
        Timer timer = new Timer();
        dVar.f9(new n8x(lb9Var, xop0.t, timer, timer.b));
    }

    @Keep
    public static u execute(d dVar) throws IOException {
        e560 e560Var = new e560(xop0.t);
        Timer timer = new Timer();
        long j = timer.b;
        try {
            u execute = dVar.execute();
            a(execute, e560Var, j, timer.d());
            return execute;
        } catch (IOException e) {
            p request = dVar.request();
            if (request != null) {
                l lVar = request.a;
                if (lVar != null) {
                    e560Var.n(lVar.j().toString());
                }
                String str = request.b;
                if (str != null) {
                    e560Var.e(str);
                }
            }
            e560Var.i(j);
            e560Var.l(timer.d());
            f560.c(e560Var);
            throw e;
        }
    }
}
