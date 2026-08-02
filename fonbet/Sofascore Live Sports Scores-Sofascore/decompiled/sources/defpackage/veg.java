package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class veg {
    public final eig a;
    public xag b;

    public veg(eig eigVar, tdg tdgVar) {
        this.a = eigVar;
    }

    public final void a(String str) {
        xw3.L(s9a.c(z45.a), null, null, new gje(this, str, null, 26), 3);
    }

    public final boolean b(String str) {
        xag xagVar;
        xag xagVar2;
        xag xagVar3;
        URI uri = new URI(str);
        if (!Intrinsics.c(uri.getScheme(), CampaignEx.JSON_KEY_MRAID)) {
            return false;
        }
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1289167206) {
                if (hashCode != -840442113) {
                    if (hashCode == 94756344 && host.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE) && (xagVar3 = this.b) != null) {
                        bea.r(xagVar3);
                        return true;
                    }
                } else if (host.equals("unload") && (xagVar2 = this.b) != null) {
                    ((zag) xagVar2).n(null);
                    return true;
                }
            } else if (host.equals("expand") && (xagVar = this.b) != null) {
                tbg tbgVar = ((zag) xagVar).j;
                if (tbgVar != null) {
                    tbgVar.expandAdView(false);
                    return true;
                }
                Intrinsics.i("adViewController");
                throw null;
            }
        }
        return true;
    }
}
