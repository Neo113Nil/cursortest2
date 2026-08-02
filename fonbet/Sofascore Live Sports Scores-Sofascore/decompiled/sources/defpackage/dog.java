package defpackage;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.task.g;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dog {
    public static final dog a;
    public static final dog b;
    public static final dog c;
    public static final dog d;
    public static final HashMap e;
    public static final /* synthetic */ dog[] f;

    /* JADX INFO: Fake field, exist only in values array */
    dog EF1;

    static {
        dog dogVar = new dog("svg", 0);
        dog dogVar2 = new dog("a", 1);
        dog dogVar3 = new dog("circle", 2);
        dog dogVar4 = new dog("clipPath", 3);
        dog dogVar5 = new dog("defs", 4);
        dog dogVar6 = new dog(CampaignEx.JSON_KEY_DESC, 5);
        a = dogVar6;
        dog dogVar7 = new dog("ellipse", 6);
        dog dogVar8 = new dog(g.e, 7);
        dog dogVar9 = new dog("image", 8);
        dog dogVar10 = new dog("line", 9);
        dog dogVar11 = new dog("linearGradient", 10);
        dog dogVar12 = new dog("marker", 11);
        dog dogVar13 = new dog("mask", 12);
        dog dogVar14 = new dog("path", 13);
        dog dogVar15 = new dog("pattern", 14);
        dog dogVar16 = new dog("polygon", 15);
        dog dogVar17 = new dog("polyline", 16);
        dog dogVar18 = new dog("radialGradient", 17);
        dog dogVar19 = new dog("rect", 18);
        dog dogVar20 = new dog("solidColor", 19);
        dog dogVar21 = new dog("stop", 20);
        dog dogVar22 = new dog(TtmlNode.TAG_STYLE, 21);
        dog dogVar23 = new dog("SWITCH", 22);
        b = dogVar23;
        dog dogVar24 = new dog("symbol", 23);
        dog dogVar25 = new dog("text", 24);
        dog dogVar26 = new dog("textPath", 25);
        dog dogVar27 = new dog("title", 26);
        c = dogVar27;
        dog dogVar28 = new dog("tref", 27);
        dog dogVar29 = new dog("tspan", 28);
        dog dogVar30 = new dog("use", 29);
        dog dogVar31 = new dog(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, 30);
        dog dogVar32 = new dog("UNSUPPORTED", 31);
        d = dogVar32;
        f = new dog[]{dogVar, dogVar2, dogVar3, dogVar4, dogVar5, dogVar6, dogVar7, dogVar8, dogVar9, dogVar10, dogVar11, dogVar12, dogVar13, dogVar14, dogVar15, dogVar16, dogVar17, dogVar18, dogVar19, dogVar20, dogVar21, dogVar22, dogVar23, dogVar24, dogVar25, dogVar26, dogVar27, dogVar28, dogVar29, dogVar30, dogVar31, dogVar32};
        e = new HashMap();
        for (dog dogVar33 : values()) {
            if (dogVar33 == b) {
                e.put("switch", dogVar33);
            } else if (dogVar33 != d) {
                e.put(dogVar33.name(), dogVar33);
            }
        }
    }

    public static dog valueOf(String str) {
        return (dog) Enum.valueOf(dog.class, str);
    }

    public static dog[] values() {
        return (dog[]) f.clone();
    }
}
