package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m7o {
    public final ArrayList a;

    public m7o() {
        this.a = new ArrayList();
        this.a = new ArrayList();
    }

    public static final u3o a(Context context, BridgeConfiguration bridgeConfiguration, ExecutorService executorService) {
        ddb ddbVar;
        sen t = uen.t();
        Context applicationContext = context.getApplicationContext();
        vdb vdbVar = new vdb(t, (TestingConfiguration) bridgeConfiguration.testingConfiguration().i());
        m10 m10Var = new m10(Looper.myLooper());
        if (y4o.a.d()) {
            ddbVar = (ddb) y4o.a.g();
        } else {
            synchronized (y4o.class) {
                try {
                    if (!y4o.a.d()) {
                        y4o.a = b2p.k(qha.T(executorService).b(new rln(applicationContext, 2)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ddbVar = (ddb) y4o.a.g();
        }
        ddb ddbVar2 = ddbVar;
        long currentTimeMillis = System.currentTimeMillis();
        n8p q = n8p.q();
        ddbVar2.addListener(new mpi(applicationContext, q, t, currentTimeMillis), m10Var);
        mha.I(q, new ejg(26, vdbVar, applicationContext, bridgeConfiguration), m10Var);
        mqn mqnVar = new mqn(vdbVar, (TestingConfiguration) bridgeConfiguration.testingConfiguration().i(), new z7o());
        mqnVar.c("*", JavaScriptMessage$MsgChannel.webViewLoaded, new vmn(mqnVar, 1));
        mqnVar.c("*", JavaScriptMessage$MsgChannel.log, mqnVar.c);
        return new u3o(bridgeConfiguration, mqnVar, t, executorService);
    }
}
