package defpackage;

import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.AdPodInfoData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mvn implements z0o, orn {
    public final de0 a;
    public final c0l b;
    public final qrn c;
    public final String d;
    public final qyo e;
    public final h3p f = h3p.k();

    public mvn(String str, qrn qrnVar, c0l c0lVar, gbo gboVar) {
        de0 de0Var = gboVar.f;
        this.a = de0Var;
        this.b = c0lVar;
        this.c = qrnVar;
        this.d = str;
        qyo qyoVar = new qyo(new b1l(this, 9));
        this.e = qyoVar;
        ((ah) de0Var.b).j.add(qyoVar);
    }

    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel = ldaVar.a;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = ldaVar.d;
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) ldaVar.b;
        h3p h3pVar = this.f;
        dg dgVar = (dg) h3pVar.get(javaScriptMessage$MsgChannel);
        int ordinal = javaScriptMessage$MsgType.ordinal();
        de0 de0Var = this.a;
        if (ordinal != 36) {
            if (ordinal == 48) {
                if (javaScriptMsgData == null || javaScriptMsgData.videoUrl() == null) {
                    this.b.v(new zjo(new tf(1, 1, "Load message must contain video url.", null)));
                    return;
                }
                dg dgVar2 = new dg(javaScriptMsgData.videoUrl(), javaScriptMsgData.audioMimeType(), javaScriptMsgData.videoMimeType());
                AdPodInfoData build = AdPodInfoData.builder().build();
                if (javaScriptMsgData.adPodInfo() != null) {
                    build = javaScriptMsgData.adPodInfo();
                }
                h3pVar.put(javaScriptMessage$MsgChannel, dgVar2);
                xto xtoVar = new xto(build, 4);
                ah ahVar = (ah) de0Var.b;
                try {
                    ahVar.o(dgVar2, xtoVar);
                    return;
                } catch (RuntimeException e) {
                    ahVar.r(e, "loadAd");
                    return;
                }
            }
            if (ordinal == 63) {
                ah ahVar2 = (ah) de0Var.b;
                try {
                    ArrayList arrayList = ahVar2.j;
                    ahVar2.a.getClass();
                    if (ahVar2.u != null && ahVar2.C != 0) {
                        ahVar2.C = 2;
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((qyo) ((bpk) arrayList.get(i))).a(JavaScriptMessage$MsgType.pause, dgVar, null);
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e2) {
                    ahVar2.r(e2, "pauseAd");
                    return;
                }
            }
            if (ordinal == 67) {
                ah ahVar3 = (ah) de0Var.b;
                try {
                    ahVar3.t(dgVar);
                    return;
                } catch (RuntimeException e3) {
                    ahVar3.r(e3, "playAd");
                    return;
                }
            }
            if (ordinal != 90) {
                return;
            }
        }
        ah ahVar4 = (ah) de0Var.b;
        try {
            ahVar4.w(dgVar);
        } catch (RuntimeException e4) {
            ahVar4.r(e4, "stopAd");
        }
        h3pVar.remove(javaScriptMessage$MsgChannel);
    }

    @Override // defpackage.z0o
    public final void zzb() {
        ((ah) this.a.b).j.remove(this.e);
    }

    @Override // defpackage.z0o
    public final void a() {
    }
}
