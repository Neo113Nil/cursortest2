package com.inmobi.media;

import defpackage.cp4;
import defpackage.d2g;
import defpackage.duf;
import defpackage.epf;
import defpackage.i2g;
import defpackage.joa;
import defpackage.p7a;
import defpackage.q7a;
import defpackage.qzf;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ui implements q7a {
    public static void a(Vi vi, int i) {
        long pow = (long) (Math.pow(1.0d, i) * vi.b);
        if (pow > 0) {
            try {
                Thread.sleep(pow);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                cp4.i("Retry delay interrupted", e);
            }
        }
    }

    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        p7aVar.getClass();
        qzf qzfVar = ((epf) p7aVar).e;
        qzfVar.getClass();
        Object c = qzfVar.c(duf.a.getOrCreateKotlinClass(Object.class));
        Vi vi = c instanceof Vi ? (Vi) c : null;
        if (vi == null) {
            try {
                return ((epf) p7aVar).b(qzfVar);
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (!StringsKt.J(message != null ? message : "", "port out of range", true)) {
                    throw e;
                }
                joa joaVar = AbstractC3286aa.a;
                AbstractC3286aa.a(new Q2(e));
                cp4.i("Proxy configuration error", e);
                return null;
            }
        }
        int i = vi.a;
        int i2 = i + 1;
        d2g d2gVar = null;
        Throwable e2 = null;
        for (int i3 = 0; i3 < i2; i3++) {
            if (d2gVar != null) {
                try {
                    i2g i2gVar = d2gVar.g;
                    if (i2gVar != null) {
                        i2gVar.close();
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    if (i3 == i) {
                        break;
                    }
                    a(vi, i3);
                } catch (IllegalArgumentException e4) {
                    String message2 = e4.getMessage();
                    if (!StringsKt.J(message2 != null ? message2 : "", "port out of range", true)) {
                        throw e4;
                    }
                    joa joaVar2 = AbstractC3286aa.a;
                    AbstractC3286aa.a(new Q2(e4));
                    cp4.i("Proxy configuration error", e4);
                    return null;
                } catch (CancellationException e5) {
                    throw e5;
                } catch (IllegalStateException e6) {
                    e2 = e6;
                    if (i3 == i) {
                        break;
                    }
                    a(vi, i3);
                }
            }
            d2gVar = ((epf) p7aVar).b(qzfVar);
            int i4 = d2gVar.d;
            if (400 <= i4 && i4 < 600 && Ag.a(d2gVar) && i3 < i) {
                a(vi, i3);
            }
            return d2gVar;
        }
        if (d2gVar != null) {
            return d2gVar;
        }
        cp4.i("Retry policy exhausted", e2);
        return null;
    }
}
