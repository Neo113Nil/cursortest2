package defpackage;

import android.os.Handler;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mqn implements orn, qrn {
    public final vdb b;
    public final z7o c;
    public final TestingConfiguration e;
    public final HashMap a = new HashMap();
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public final n8p f = n8p.q();
    public boolean g = false;

    public mqn(vdb vdbVar, TestingConfiguration testingConfiguration, z7o z7oVar) {
        this.e = testingConfiguration;
        this.b = vdbVar;
        this.c = z7oVar;
        vdbVar.e = this;
    }

    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        orn ornVar;
        String str = ldaVar.c;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = ldaVar.d;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel = ldaVar.a;
        new StringBuilder(String.valueOf(javaScriptMessage$MsgChannel.name()).length() + 23 + String.valueOf(javaScriptMessage$MsgType.name()).length() + 1);
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(str) || (ornVar = (orn) ((Map) hashMap.get(str)).get(javaScriptMessage$MsgChannel)) == null) {
            return;
        }
        ornVar.b(ldaVar);
    }

    public final void c(String str, JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel, orn ornVar) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new HashMap());
        }
        ((Map) hashMap.get(str)).put(javaScriptMessage$MsgChannel, ornVar);
    }

    public final void d(lda ldaVar) {
        String name = ldaVar.a.name();
        String name2 = ldaVar.d.name();
        new StringBuilder(String.valueOf(name).length() + 22 + String.valueOf(name2).length() + 1);
        this.d.add(ldaVar);
        e();
    }

    public final void e() {
        if (this.g) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
            for (lda ldaVar = (lda) concurrentLinkedQueue.poll(); ldaVar != null; ldaVar = (lda) concurrentLinkedQueue.poll()) {
                vdb vdbVar = this.b;
                ((Handler) vdbVar.d).post(new nkn(vdbVar, ldaVar, false, 6));
            }
        }
    }
}
