package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class om4 {
    public static final ih2 c = new ih2(String.valueOf(','));
    public static final om4 d = new om4(mx9.b, false, new om4(new p4h(18), true, new om4()));
    public final Map a;
    public final byte[] b;

    public om4(tz2 tz2Var, boolean z, om4 om4Var) {
        String g = tz2Var.g();
        z1a.r("Comma is currently not allowed in message encoding", !g.contains(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
        int size = om4Var.a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(om4Var.a.containsKey(tz2Var.g()) ? size : size + 1);
        for (nm4 nm4Var : om4Var.a.values()) {
            String g2 = nm4Var.a.g();
            if (!g2.equals(g)) {
                linkedHashMap.put(g2, new nm4(nm4Var.a, nm4Var.b));
            }
        }
        linkedHashMap.put(g, new nm4(tz2Var, z));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.a = unmodifiableMap;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((nm4) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.b = c.e(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName(C.ASCII_NAME));
    }

    public om4() {
        this.a = new LinkedHashMap(0);
        this.b = new byte[0];
    }
}
