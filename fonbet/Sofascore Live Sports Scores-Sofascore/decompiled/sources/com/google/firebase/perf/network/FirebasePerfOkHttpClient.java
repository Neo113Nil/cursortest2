package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import defpackage.ah2;
import defpackage.d2g;
import defpackage.fyj;
import defpackage.i2g;
import defpackage.jl9;
import defpackage.pof;
import defpackage.qh2;
import defpackage.qzf;
import defpackage.wi5;
import defpackage.xad;
import defpackage.yad;
import defpackage.yzf;
import defpackage.zdc;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class FirebasePerfOkHttpClient {
    public static void a(d2g d2gVar, xad xadVar, long j, long j2) {
        qzf qzfVar = d2gVar.a;
        if (qzfVar == null) {
            return;
        }
        xadVar.k(qzfVar.a.j().toString());
        xadVar.c(qzfVar.b);
        yzf yzfVar = qzfVar.d;
        if (yzfVar != null) {
            long contentLength = yzfVar.contentLength();
            if (contentLength != -1) {
                xadVar.f(contentLength);
            }
        }
        i2g i2gVar = d2gVar.g;
        if (i2gVar != null) {
            long contentLength2 = i2gVar.contentLength();
            if (contentLength2 != -1) {
                xadVar.i(contentLength2);
            }
            zdc contentType = i2gVar.contentType();
            if (contentType != null) {
                xadVar.h(contentType.a);
            }
        }
        xadVar.d(d2gVar.d);
        xadVar.g(j);
        xadVar.j(j2);
        xadVar.b();
    }

    @Keep
    public static void enqueue(ah2 ah2Var, qh2 qh2Var) {
        Timer timer = new Timer();
        pof pofVar = (pof) ah2Var;
        pofVar.c(new wi5(qh2Var, fyj.s, timer, timer.a));
    }

    @Keep
    public static d2g execute(ah2 ah2Var) throws IOException {
        xad xadVar = new xad(fyj.s);
        Timer timer = new Timer();
        long j = timer.a;
        try {
            d2g e = ((pof) ah2Var).e();
            a(e, xadVar, j, timer.a());
            return e;
        } catch (IOException e2) {
            qzf qzfVar = ((pof) ah2Var).b;
            if (qzfVar != null) {
                jl9 jl9Var = qzfVar.a;
                if (jl9Var != null) {
                    xadVar.k(jl9Var.j().toString());
                }
                String str = qzfVar.b;
                if (str != null) {
                    xadVar.c(str);
                }
            }
            xadVar.g(j);
            xadVar.j(timer.a());
            yad.c(xadVar);
            throw e2;
        }
    }
}
