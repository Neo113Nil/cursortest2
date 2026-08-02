package defpackage;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vmn implements orn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vmn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lnn lnnVar = (lnn) obj;
                JavaScriptMessage$MsgType javaScriptMessage$MsgType = ldaVar.d;
                JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) ldaVar.b;
                int ordinal = javaScriptMessage$MsgType.ordinal();
                if (ordinal != 29) {
                    if (ordinal == 30) {
                        lnnVar.j.a.v(new zjo(new tf(1, 1, "No pause ad slot in display container.", null)));
                        return;
                    } else {
                        if (ordinal == 40 || ordinal != 73) {
                            return;
                        }
                        javaScriptMsgData.resizeAndPositionVideo();
                        return;
                    }
                }
                ion ionVar = lnnVar.i;
                c0l c0lVar = ionVar.b;
                if (javaScriptMsgData == null || javaScriptMsgData.companions() == null) {
                    c0lVar.v(new zjo(new tf(1, 1, "Unable to parse companion information.", null)));
                    return;
                }
                Map<String, CompanionData> companions = javaScriptMsgData.companions();
                if (companions != null) {
                    gbo gboVar = ionVar.a;
                    Set<String> keySet = companions.keySet();
                    HashMap hashMap = new HashMap(oea.D(keySet.size()));
                    Iterator<String> it = keySet.iterator();
                    while (it.hasNext()) {
                        if (gboVar.b.get(it.next()) != null) {
                            pvd.j();
                            return;
                        }
                        c0lVar.v(new zjo(new tf(1, 1, "Unable to parse companion information.", null)));
                    }
                    Iterator it2 = hashMap.keySet().iterator();
                    if (it2.hasNext()) {
                        String str = (String) it2.next();
                        ViewGroup viewGroup = (ViewGroup) hashMap.get(str);
                        companions.get(str);
                        if (gboVar.b.get(str) != null) {
                            pvd.j();
                            return;
                        } else {
                            viewGroup.removeAllViews();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            default:
                mqn mqnVar = (mqn) obj;
                n8p n8pVar = mqnVar.f;
                WebViewInitData.JavaScriptNativeBridgeInitData javaScriptNativeBridgeInitData = (WebViewInitData.JavaScriptNativeBridgeInitData) ldaVar.b;
                b2p b2pVar = (b2p) mqnVar.b.c;
                if (!b2pVar.d()) {
                    n8pVar.e(new IllegalStateException("Webview is not present during initialization."));
                    return;
                }
                fln flnVar = (fln) b2pVar.g();
                mqnVar.c("*", JavaScriptMessage$MsgChannel.omid, flnVar.b);
                mqnVar.g = true;
                n8pVar.d(new WebViewInitData(javaScriptNativeBridgeInitData, flnVar.a, flnVar.b));
                mqnVar.e();
                return;
        }
    }
}
