package defpackage;

import android.content.Context;
import com.mbridge.msdk.foundation.download.Command;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class u3g implements q7a {
    public final /* synthetic */ int a;

    public /* synthetic */ u3g(int i) {
        this.a = i;
    }

    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        switch (this.a) {
            case 0:
                String u = tgj.u((((System.currentTimeMillis() / 1000) / 100) + "sofa2012").getBytes());
                epf epfVar = (epf) p7aVar;
                qzf qzfVar = epfVar.e;
                String j = ljg.j(Integer.parseInt(iii.H(6, "260720003")), "com.sofascore.results/");
                if (u.length() > 0) {
                    j = lnb.o(j, "/", u.substring(0, 6));
                }
                pzf b = qzfVar.b();
                b.c(Command.HTTP_HEADER_USER_AGENT, j);
                b.c("X-Timestamp", String.valueOf(yaa.v()));
                return epfVar.b(new qzf(b));
            default:
                epf epfVar2 = (epf) p7aVar;
                qzf qzfVar2 = epfVar2.e;
                ef0 k = vha.k(qzfVar2.c);
                k.m(Command.HTTP_HEADER_USER_AGENT);
                Context context = hkg.a;
                String property = System.getProperty("http.agent");
                if (property == null) {
                    property = "unkown user agent";
                }
                k.d(Command.HTTP_HEADER_USER_AGENT, property);
                q89 i = vha.i(k);
                pzf b2 = qzfVar2.b();
                b2.c = vha.k(i);
                return epfVar2.b(new qzf(b2));
        }
    }
}
