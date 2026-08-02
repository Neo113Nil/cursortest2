package defpackage;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class exn implements orn {
    public final vwn a;
    public final qrn b;
    public final b7p c;

    public exn(Context context, b2p b2pVar, boolean z, qrn qrnVar, ExecutorService executorService) {
        vwn ywnVar = ((Boolean) b2pVar.h(Boolean.FALSE)).booleanValue() ? new ywn(context, z) : new cwn();
        this.c = qha.T(executorService);
        this.a = ywnVar;
        this.b = qrnVar;
    }

    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) ldaVar.b;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = ldaVar.d;
        String str = ldaVar.c;
        NetworkRequestData networkRequest = javaScriptMsgData.networkRequest();
        if (javaScriptMessage$MsgType.ordinal() != 56) {
            "Unexpected network request of type".concat(String.valueOf(javaScriptMessage$MsgType));
            return;
        }
        een eenVar = new een(4, this, networkRequest);
        b7p b7pVar = this.c;
        mha.I(b7pVar.b(eenVar), new c0l((Object) this, (Object) str, false, 25), b7pVar);
    }
}
