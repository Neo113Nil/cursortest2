package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.RequestLoadedAssetData;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l6n implements orn {
    public final mqn a;
    public final gbo b;
    public final t6o c;
    public final b7p f;
    public final Context g;
    public final c0l h;
    public final List i;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public b2p j = u1p.a;
    public final Handler k = new Handler(Looper.getMainLooper());

    public l6n(mqn mqnVar, gbo gboVar, t6o t6oVar, c0l c0lVar, List list, b7p b7pVar, Context context) {
        this.a = mqnVar;
        this.b = gboVar;
        this.c = t6oVar;
        this.h = c0lVar;
        this.i = list;
        this.f = b7pVar;
        this.g = context;
    }

    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        String str = ldaVar.c;
        Object obj = ldaVar.b;
        int ordinal = ldaVar.d.ordinal();
        mqn mqnVar = this.a;
        c0l c0lVar = this.h;
        if (ordinal != 11) {
            if (ordinal == 33) {
                JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) obj;
                c0lVar.v(new zjo(new tf(1, ((Integer) b2p.l(javaScriptMsgData.errorCode()).h(900)).intValue(), zjo.a(javaScriptMsgData.errorMessage(), javaScriptMsgData.innerError())), c(str)));
                return;
            }
            if (ordinal != 85) {
                if (ordinal != 86) {
                    return;
                }
                mqnVar.d(new lda(JavaScriptMessage$MsgChannel.adsLoader, JavaScriptMessage$MsgType.startStream, "*", (RequestLoadedAssetData) obj, null));
                return;
            }
            JavaScriptMsgData javaScriptMsgData2 = (JavaScriptMsgData) obj;
            javaScriptMsgData2.streamId();
            b2p.l(javaScriptMsgData2.monitorAppLifecycle());
            if (this.e.get(str) != null) {
                pvd.j();
                return;
            } else {
                c0lVar.v(new zjo(new tf(1, 1, "Request not found for session id: ".concat(String.valueOf(str)), null), new Object()));
                "Stream initialized with streamId: ".concat(String.valueOf(javaScriptMsgData2.streamId()));
                return;
            }
        }
        JavaScriptMsgData javaScriptMsgData3 = (JavaScriptMsgData) obj;
        if (javaScriptMsgData3 == null) {
            c0lVar.v(new zjo(new tf(1, 1, "adsLoaded message did not contain cue points.", null), c(str)));
            return;
        }
        List<Float> adCuePoints = javaScriptMsgData3.adCuePoints();
        SortedSet<Float> internalCuePoints = javaScriptMsgData3.internalCuePoints();
        b2p l = b2p.l(javaScriptMsgData3.monitorAppLifecycle());
        fl flVar = (fl) this.d.get(str);
        if (flVar == null) {
            c0lVar.v(new zjo(new tf(1, 1, "Request not found for session id: ".concat(String.valueOf(str)), null), new Object()));
            return;
        }
        n8p n8pVar = mqnVar.f;
        vng vngVar = new vng();
        vngVar.a = flVar;
        vngVar.b = str;
        vngVar.c = adCuePoints;
        vngVar.d = internalCuePoints;
        vngVar.e = l;
        vngVar.f = this;
        mha.I(n8pVar, vngVar, this.f);
    }

    public final Object c(String str) {
        HashMap hashMap = this.d;
        if (hashMap.get(str) != null) {
            return ((gl) ((fl) hashMap.get(str))).j;
        }
        HashMap hashMap2 = this.e;
        if (hashMap2.get(str) == null) {
            return new Object();
        }
        hashMap2.get(str).getClass();
        pvd.j();
        return null;
    }
}
