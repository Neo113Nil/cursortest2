package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tkg implements Callable {
    public final long a;
    public final boolean b;
    public boolean c = false;
    public final /* synthetic */ ukg d;

    public tkg(ukg ukgVar, long j, boolean z) {
        this.d = ukgVar;
        this.a = j;
        this.b = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ikg ikgVar;
        d2g d2gVar;
        iod a = hkg.W().a();
        long j = this.a / 2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a.c(j, timeUnit);
        a.d(j, timeUnit);
        jod jodVar = new jod(a);
        ukg ukgVar = this.d;
        int i = ukgVar.f;
        boolean z = this.b;
        Stack stack = z ? ukgVar.c : ukgVar.b;
        d2g d2gVar2 = null;
        ujg P = ujg.P(null);
        while (true) {
            try {
                ikgVar = (ikg) stack.pop();
                if (!(ikgVar instanceof okg)) {
                    break;
                }
                okg okgVar = (okg) ikgVar;
                if (okgVar.m == 0) {
                    okgVar.e.size();
                }
                int i2 = okgVar.m + 1;
                String str = ukgVar.e;
                pgg pggVar = ukgVar.j;
                if (i2 > i) {
                    sha.G(pggVar, qkg.o, str);
                    hkg.v(ikgVar.f, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, P);
                    throw new wkg("Maximum wrapper resolution level exceeded (" + i + ")", null);
                }
                String str2 = okgVar.l;
                if (str2 == null) {
                    throw new wkg("Wrapper URL is null", null);
                }
                ow9 ow9Var = ukgVar.d;
                String K = tz9.K(str2, ow9Var != null ? ukg.a((String) ow9Var.b, (String) ow9Var.c) : new HashMap());
                this.c = true;
                pzf pzfVar = new pzf();
                pzfVar.f(K);
                pof pofVar = new pof(jodVar, new qzf(pzfVar));
                qkg qkgVar = qkg.k;
                try {
                    d2gVar = FirebasePerfOkHttpClient.execute(pofVar);
                } catch (IOException e) {
                    if (e instanceof SocketTimeoutException) {
                        qkgVar = qkg.m;
                    }
                    e.printStackTrace();
                    d2gVar = d2gVar2;
                }
                if (d2gVar == null) {
                    sha.G(pggVar, qkgVar, str);
                    hkg.v(ikgVar.f, qkgVar.a, P);
                    throw new wkg("Wrapper URL unreachable:" + K, null);
                }
                if (!d2gVar.q) {
                    int i3 = d2gVar.d;
                    if (i3 >= 400 && i3 < 600) {
                        qkgVar = qkg.l;
                    }
                    sha.G(pggVar, qkgVar, str);
                    hkg.v(ikgVar.f, qkgVar.a, P);
                    throw new wkg("Wrapper URL unreachable:" + K, null);
                }
                i2g i2gVar = d2gVar.g;
                String string = i2gVar != null ? i2gVar.string() : "";
                try {
                    skg c = ukgVar.c();
                    c.a = string;
                    c.c = true;
                    c.e = ikgVar.f;
                    Stack stack2 = new ukg(c).b;
                    for (int min = Math.min(stack2.size(), 0); min >= 0; min--) {
                        ikg ikgVar2 = (ikg) stack2.get(min);
                        if (ikgVar2 instanceof okg) {
                            ((okg) ikgVar2).m = okgVar.m + 1;
                        }
                        ikgVar2.b((okg) ikgVar);
                        stack.push(ikgVar2);
                    }
                    d2gVar2 = null;
                } catch (wkg e2) {
                    throw e2;
                }
            } catch (EmptyStackException unused) {
                ikgVar = null;
            }
        }
        if (ikgVar instanceof kkg) {
            qkg qkgVar2 = ((kkg) ikgVar).l;
            throw new wkg(qkgVar2.c, qkgVar2);
        }
        if (ikgVar != null && z) {
            ikgVar.a = null;
        }
        return (jkg) ikgVar;
    }
}
