package defpackage;

import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.TimeUpdateData;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qyo implements bpk {
    public final HashSet a = new HashSet(oea.D(2));
    public final b1l b;

    public qyo(b1l b1lVar) {
        this.b = b1lVar;
    }

    public final void a(JavaScriptMessage$MsgType javaScriptMessage$MsgType, dg dgVar, TimeUpdateData timeUpdateData) {
        mvn mvnVar = (mvn) this.b.b;
        h3p h3pVar = mvnVar.f;
        d3p d3pVar = h3pVar.p;
        if (d3pVar == null) {
            d3pVar = new d3p(h3pVar);
            h3pVar.p = d3pVar;
        }
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel = (JavaScriptMessage$MsgChannel) d3pVar.get(dgVar);
        if (javaScriptMessage$MsgChannel == null) {
            new StringBuilder(String.valueOf(javaScriptMessage$MsgType).length() + 113);
        } else {
            ((mqn) mvnVar.c).d(new lda(javaScriptMessage$MsgChannel, javaScriptMessage$MsgType, mvnVar.d, timeUpdateData, null));
        }
    }
}
