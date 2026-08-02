package defpackage;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class aog {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(13);
        a = hashMap;
        hashMap.put("normal", 400);
        Integer valueOf = Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
        hashMap.put(TtmlNode.BOLD, valueOf);
        ljg.s(1, -1, "bolder", "lighter", hashMap);
        ljg.s(100, 200, StatisticData.ERROR_CODE_NOT_FOUND, "200", hashMap);
        hashMap.put("300", 300);
        hashMap.put("400", 400);
        ljg.s(500, 600, "500", "600", hashMap);
        mz1.B(hashMap, "700", valueOf, 800, "800");
        hashMap.put("900", 900);
    }
}
