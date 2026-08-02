package com.vungle.ads.internal.presenter;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import defpackage.mz1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a {
    public final b a;
    public i3 b;
    public boolean c;

    public a(b bVar, i3 i3Var) {
        this.a = bVar;
        this.b = i3Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String str, String str2, String str3) {
        i3 i3Var;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        str.getClass();
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder s = mz1.s("s=", str, ", value=", str2, ", id=");
        s.append(str3);
        com.vungle.ads.internal.util.t.a("AdEventListener", s.toString());
        switch (str.hashCode()) {
            case -1912374177:
                if (str.equals("successfulView") && (i3Var = this.b) != null && i3Var.j() && !this.c) {
                    this.c = true;
                    b bVar5 = this.a;
                    if (bVar5 != null) {
                        bVar5.onAdRewarded(str3);
                        break;
                    }
                }
                break;
            case -1627831289:
                if (str.equals("adViewed") && (bVar = this.a) != null) {
                    bVar.onAdImpression(str3);
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END) && (bVar2 = this.a) != null) {
                    bVar2.onAdEnd(str3);
                    break;
                }
                break;
            case 3417674:
                if (str.equals("open")) {
                    if (!Intrinsics.c(str2, "adClick")) {
                        if (Intrinsics.c(str2, "adLeftApplication") && (bVar3 = this.a) != null) {
                            bVar3.onAdLeftApplication(str3);
                            break;
                        }
                    } else {
                        b bVar6 = this.a;
                        if (bVar6 != null) {
                            bVar6.onAdClick(str3);
                            break;
                        }
                    }
                }
                break;
            case 109757538:
                if (str.equals("start") && (bVar4 = this.a) != null) {
                    bVar4.onAdStart(str3);
                    break;
                }
                break;
        }
    }

    public final void a(VungleError vungleError, String str) {
        vungleError.getClass();
        b bVar = this.a;
        if (bVar != null) {
            bVar.onFailure(vungleError);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdEventListener", "AdEventListener#PlayAdCallback " + str, vungleError);
        }
    }
}
