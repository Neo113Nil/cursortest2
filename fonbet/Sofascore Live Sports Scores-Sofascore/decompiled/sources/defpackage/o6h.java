package defpackage;

import com.unity3d.ads.metadata.PlayerMetaData;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o6h {
    public static final o6h t = new o6h("INFO {}");
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final ArrayList l;
    public final int m;
    public final byte[] n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final String r;
    public final String s;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0163, code lost:
    
        if (r2.isEmpty() == false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o6h(String str) {
        Long l;
        List list;
        String str2;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        if (str == null || str.length() < 6 || !('{' == str.charAt(0) || '{' == str.charAt(5))) {
            a70.p("Invalid Server Info");
            throw null;
        }
        try {
            pga pgaVar = new pga(str.toCharArray(), str.indexOf("{"), new int[0]);
            oha d = pgaVar.e() == 0 ? oha.m : pgaVar.d();
            this.a = qha.O(d, PlayerMetaData.KEY_SERVER_ID, "UNDEFINED");
            this.b = qha.O(d, "server_name", "UNDEFINED");
            this.c = qha.O(d, "version", "0.0.0");
            this.d = qha.O(d, "go", "0.0.0");
            this.e = qha.O(d, "host", "UNDEFINED");
            this.g = qha.I(d, "headers");
            this.h = qha.I(d, "auth_required");
            oha ohaVar = (d == null || (map4 = d.h) == null) ? null : (oha) map4.get("nonce");
            String str3 = ohaVar == null ? null : ohaVar.a;
            this.n = str3 == null ? null : str3.getBytes(StandardCharsets.UTF_8);
            this.i = qha.I(d, "tls_required");
            this.j = qha.I(d, "tls_available");
            this.o = qha.I(d, "ldm");
            this.p = qha.I(d, "jetstream");
            this.f = qha.L(d, "port");
            this.m = qha.L(d, "proto");
            oha ohaVar2 = (d == null || (map3 = d.h) == null) ? null : (oha) map3.get("max_payload");
            if (ohaVar2 != null) {
                l = ohaVar2.d;
                if (l == null) {
                    l = ohaVar2.c != null ? Long.valueOf(r1.intValue()) : null;
                }
            }
            l = 0L;
            this.k = l.longValue();
            this.q = qha.L(d, "client_id");
            this.r = qha.O(d, "client_ip", "0.0.0.0");
            oha ohaVar3 = (d == null || (map2 = d.h) == null) ? null : (oha) map2.get("cluster");
            this.s = ohaVar3 == null ? null : ohaVar3.a;
            oha ohaVar4 = (d == null || (map = d.h) == null) ? null : (oha) map.get("connect_urls");
            ArrayList arrayList = new ArrayList();
            if (ohaVar4 != null && (list = ohaVar4.i) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str4 = ((oha) it.next()).a;
                    if (str4 != null) {
                        str2 = str4.trim();
                    }
                    str2 = null;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
            }
            this.l = arrayList;
        } catch (mga unused) {
            a70.p("Invalid Server Info Json");
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerInfo{serverId='");
        sb.append(this.a);
        sb.append("', serverName='");
        sb.append(this.b);
        sb.append("', version='");
        sb.append(this.c);
        sb.append("', go='");
        sb.append(this.d);
        sb.append("', host='");
        sb.append(this.e);
        sb.append("', port=");
        sb.append(this.f);
        sb.append(", headersSupported=");
        sb.append(this.g);
        sb.append(", authRequired=");
        sb.append(this.h);
        sb.append(", tlsRequired=");
        sb.append(this.i);
        sb.append(", tlsAvailable=");
        sb.append(this.j);
        sb.append(", maxPayload=");
        sb.append(this.k);
        sb.append(", connectURLs=");
        sb.append(this.l);
        sb.append(", protocolVersion=");
        sb.append(this.m);
        sb.append(", nonce=");
        sb.append(Arrays.toString(this.n));
        sb.append(", lameDuckMode=");
        sb.append(this.o);
        sb.append(", jetStream=");
        sb.append(this.p);
        sb.append(", clientId=");
        sb.append(this.q);
        sb.append(", clientIp='");
        sb.append(this.r);
        sb.append("', cluster='");
        return mz1.o(sb, this.s, "'}");
    }
}
