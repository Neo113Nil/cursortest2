package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tx3 {
    public static final d4a a;

    static {
        lfa lfaVar = new lfa();
        kq0 kq0Var = kq0.a;
        lfaVar.a(rx3.class, kq0Var);
        lfaVar.a(os0.class, kq0Var);
        sq0 sq0Var = sq0.a;
        lfaVar.a(qx3.class, sq0Var);
        lfaVar.a(zs0.class, sq0Var);
        pq0 pq0Var = pq0.a;
        lfaVar.a(yw3.class, pq0Var);
        lfaVar.a(at0.class, pq0Var);
        qq0 qq0Var = qq0.a;
        lfaVar.a(xw3.class, qq0Var);
        lfaVar.a(bt0.class, qq0Var);
        ir0 ir0Var = ir0.a;
        lfaVar.a(px3.class, ir0Var);
        lfaVar.a(au0.class, ir0Var);
        hr0 hr0Var = hr0.a;
        lfaVar.a(ox3.class, hr0Var);
        lfaVar.a(zt0.class, hr0Var);
        rq0 rq0Var = rq0.a;
        lfaVar.a(zw3.class, rq0Var);
        lfaVar.a(dt0.class, rq0Var);
        cr0 cr0Var = cr0.a;
        lfaVar.a(nx3.class, cr0Var);
        lfaVar.a(ft0.class, cr0Var);
        tq0 tq0Var = tq0.a;
        lfaVar.a(hx3.class, tq0Var);
        lfaVar.a(ht0.class, tq0Var);
        vq0 vq0Var = vq0.a;
        lfaVar.a(fx3.class, vq0Var);
        lfaVar.a(it0.class, vq0Var);
        yq0 yq0Var = yq0.a;
        lfaVar.a(ex3.class, yq0Var);
        lfaVar.a(mt0.class, yq0Var);
        zq0 zq0Var = zq0.a;
        lfaVar.a(dx3.class, zq0Var);
        lfaVar.a(ot0.class, zq0Var);
        wq0 wq0Var = wq0.a;
        lfaVar.a(bx3.class, wq0Var);
        lfaVar.a(kt0.class, wq0Var);
        iq0 iq0Var = iq0.a;
        lfaVar.a(rw3.class, iq0Var);
        lfaVar.a(rs0.class, iq0Var);
        hq0 hq0Var = hq0.a;
        lfaVar.a(qw3.class, hq0Var);
        lfaVar.a(ss0.class, hq0Var);
        nq0 nq0Var = nq0.a;
        lfaVar.a(ww3.class, nq0Var);
        lfaVar.a(ws0.class, nq0Var);
        oq0 oq0Var = oq0.a;
        lfaVar.a(vw3.class, oq0Var);
        lfaVar.a(xs0.class, oq0Var);
        xq0 xq0Var = xq0.a;
        lfaVar.a(cx3.class, xq0Var);
        lfaVar.a(lt0.class, xq0Var);
        uq0 uq0Var = uq0.a;
        lfaVar.a(ax3.class, uq0Var);
        lfaVar.a(jt0.class, uq0Var);
        jq0 jq0Var = jq0.a;
        lfaVar.a(sw3.class, jq0Var);
        lfaVar.a(ts0.class, jq0Var);
        ar0 ar0Var = ar0.a;
        lfaVar.a(gx3.class, ar0Var);
        lfaVar.a(qt0.class, ar0Var);
        br0 br0Var = br0.a;
        lfaVar.a(ix3.class, br0Var);
        lfaVar.a(st0.class, br0Var);
        dr0 dr0Var = dr0.a;
        lfaVar.a(jx3.class, dr0Var);
        lfaVar.a(tt0.class, dr0Var);
        gr0 gr0Var = gr0.a;
        lfaVar.a(mx3.class, gr0Var);
        lfaVar.a(xt0.class, gr0Var);
        er0 er0Var = er0.a;
        lfaVar.a(lx3.class, er0Var);
        lfaVar.a(vt0.class, er0Var);
        fr0 fr0Var = fr0.a;
        lfaVar.a(kx3.class, fr0Var);
        lfaVar.a(wt0.class, fr0Var);
        lq0 lq0Var = lq0.a;
        lfaVar.a(uw3.class, lq0Var);
        lfaVar.a(us0.class, lq0Var);
        mq0 mq0Var = mq0.a;
        lfaVar.a(tw3.class, mq0Var);
        lfaVar.a(vs0.class, mq0Var);
        lfaVar.d = true;
        a = new d4a(lfaVar, 2);
    }

    public static rs0 a(JsonReader jsonReader) {
        qs0 qs0Var = new qs0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    qs0Var.i = b(jsonReader, new vp2(18));
                    break;
                case "pid":
                    qs0Var.a = jsonReader.nextInt();
                    qs0Var.j = (byte) (qs0Var.j | 1);
                    break;
                case "pss":
                    qs0Var.e = jsonReader.nextLong();
                    qs0Var.j = (byte) (qs0Var.j | 8);
                    break;
                case "rss":
                    qs0Var.f = jsonReader.nextLong();
                    qs0Var.j = (byte) (qs0Var.j | 16);
                    break;
                case "timestamp":
                    qs0Var.g = jsonReader.nextLong();
                    qs0Var.j = (byte) (qs0Var.j | 32);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        yhk.s("Null processName");
                        return null;
                    }
                    qs0Var.b = nextString;
                    break;
                case "reasonCode":
                    qs0Var.c = jsonReader.nextInt();
                    qs0Var.j = (byte) (qs0Var.j | 2);
                    break;
                case "traceFile":
                    qs0Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    qs0Var.d = jsonReader.nextInt();
                    qs0Var.j = (byte) (qs0Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return qs0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x023e, code lost:
    
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0243, code lost:
    
        if (r3 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0245, code lost:
    
        r2.append(" rolloutId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x024a, code lost:
    
        if (r4 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x024c, code lost:
    
        r2.append(" variantId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0251, code lost:
    
        defpackage.a70.r(defpackage.bf3.m("Missing required properties:", r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List b(JsonReader jsonReader, vp2 vp2Var) {
        char c;
        char c2;
        char c3;
        Object obj;
        char c4;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            Object obj2 = null;
            r12 = null;
            r12 = null;
            obj2 = null;
            Object obj3 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            obj2 = null;
            switch (vp2Var.a) {
                case 18:
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            nextName.getClass();
                            switch (nextName.hashCode()) {
                                case -609862170:
                                    if (nextName.equals("libraryName")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3002454:
                                    if (nextName.equals("arch")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 230943785:
                                    if (nextName.equals("buildId")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        yhk.s("Null libraryName");
                                        break;
                                    }
                                case 1:
                                    str = jsonReader.nextString();
                                    if (str == null) {
                                        yhk.s("Null arch");
                                        break;
                                    }
                                case 2:
                                    str3 = jsonReader.nextString();
                                    if (str3 == null) {
                                        yhk.s("Null buildId");
                                        break;
                                    }
                                default:
                                    jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.endObject();
                            if (str == null || str2 == null || str3 == null) {
                                StringBuilder sb = new StringBuilder();
                                if (str == null) {
                                    sb.append(" arch");
                                }
                                if (str2 == null) {
                                    sb.append(" libraryName");
                                }
                                if (str3 == null) {
                                    sb.append(" buildId");
                                }
                                a70.r(bf3.m("Missing required properties:", sb));
                            } else {
                                obj2 = new ss0(str, str2, str3);
                            }
                        }
                    }
                    obj = obj2;
                    break;
                case 19:
                    jsonReader.beginObject();
                    String str4 = null;
                    byte[] bArr = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (nextName2.equals("filename")) {
                                str4 = jsonReader.nextString();
                                if (str4 == null) {
                                    yhk.s("Null filename");
                                }
                            } else if (nextName2.equals("contents")) {
                                bArr = Base64.decode(jsonReader.nextString(), 2);
                                if (bArr == null) {
                                    yhk.s("Null contents");
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.endObject();
                            if (str4 == null || bArr == null) {
                                StringBuilder sb2 = new StringBuilder();
                                if (str4 == null) {
                                    sb2.append(" filename");
                                }
                                if (bArr == null) {
                                    sb2.append(" contents");
                                }
                                a70.r(bf3.m("Missing required properties:", sb2));
                            } else {
                                obj2 = new vs0(str4, bArr);
                            }
                        }
                    }
                    obj = obj2;
                    break;
                case 20:
                    ut0 ut0Var = new ut0();
                    jsonReader.beginObject();
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.getClass();
                            switch (nextName3.hashCode()) {
                                case -1536268810:
                                    if (nextName3.equals("parameterKey")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1027290370:
                                    if (nextName3.equals("templateVersion")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1098747284:
                                    if (nextName3.equals("rolloutVariant")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1124454216:
                                    if (nextName3.equals("parameterValue")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    String nextString = jsonReader.nextString();
                                    if (nextString == null) {
                                        yhk.s("Null parameterKey");
                                        break;
                                    } else {
                                        ut0Var.b = nextString;
                                    }
                                case 1:
                                    ut0Var.d = jsonReader.nextLong();
                                    ut0Var.e = (byte) (ut0Var.e | 1);
                                case 2:
                                    jsonReader.beginObject();
                                    String str5 = null;
                                    String str6 = null;
                                    while (true) {
                                        if (!jsonReader.hasNext()) {
                                            jsonReader.endObject();
                                            if (str5 != null && str6 != null) {
                                                ut0Var.a = new wt0(str5, str6);
                                                break;
                                            }
                                        } else {
                                            String nextName4 = jsonReader.nextName();
                                            nextName4.getClass();
                                            if (!nextName4.equals("variantId")) {
                                                if (nextName4.equals("rolloutId")) {
                                                    str5 = jsonReader.nextString();
                                                    if (str5 == null) {
                                                        yhk.s("Null rolloutId");
                                                        break;
                                                    }
                                                } else {
                                                    jsonReader.skipValue();
                                                }
                                            } else {
                                                str6 = jsonReader.nextString();
                                                if (str6 == null) {
                                                    yhk.s("Null variantId");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    String nextString2 = jsonReader.nextString();
                                    if (nextString2 == null) {
                                        yhk.s("Null parameterValue");
                                        break;
                                    } else {
                                        ut0Var.c = nextString2;
                                    }
                                default:
                                    jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.endObject();
                            obj2 = ut0Var.a();
                        }
                    }
                    obj = obj2;
                    break;
                case 21:
                    jsonReader.beginObject();
                    byte b = 0;
                    int i = 0;
                    String str7 = null;
                    List list = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String nextName5 = jsonReader.nextName();
                            nextName5.getClass();
                            switch (nextName5.hashCode()) {
                                case -1266514778:
                                    if (nextName5.equals(b.JSON_KEY_FRAME_ADS)) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3373707:
                                    if (nextName5.equals("name")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2125650548:
                                    if (nextName5.equals("importance")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    list = b(jsonReader, new vp2(23));
                                    if (list == null) {
                                        yhk.s("Null frames");
                                        break;
                                    }
                                case 1:
                                    str7 = jsonReader.nextString();
                                    if (str7 == null) {
                                        yhk.s("Null name");
                                        break;
                                    }
                                case 2:
                                    i = jsonReader.nextInt();
                                    b = (byte) (b | 1);
                                default:
                                    jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.endObject();
                            if (b != 1 || str7 == null || list == null) {
                                StringBuilder sb3 = new StringBuilder();
                                if (str7 == null) {
                                    sb3.append(" name");
                                }
                                if ((b & 1) == 0) {
                                    sb3.append(" importance");
                                }
                                if (list == null) {
                                    sb3.append(" frames");
                                }
                                a70.r(bf3.m("Missing required properties:", sb3));
                            } else {
                                obj2 = new mt0(i, str7, list);
                            }
                        }
                    }
                    obj2 = obj3;
                    obj = obj2;
                    break;
                case 22:
                    jsonReader.beginObject();
                    byte b2 = 0;
                    String str8 = null;
                    String str9 = null;
                    long j = 0;
                    long j2 = 0;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String nextName6 = jsonReader.nextName();
                            nextName6.getClass();
                            switch (nextName6.hashCode()) {
                                case 3373707:
                                    if (nextName6.equals("name")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 3530753:
                                    if (nextName6.equals("size")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 3601339:
                                    if (nextName6.equals("uuid")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1153765347:
                                    if (nextName6.equals("baseAddress")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            switch (c4) {
                                case 0:
                                    str8 = jsonReader.nextString();
                                    if (str8 == null) {
                                        yhk.s("Null name");
                                        break;
                                    }
                                case 1:
                                    b2 = (byte) (b2 | 2);
                                    j2 = jsonReader.nextLong();
                                case 2:
                                    str9 = new String(Base64.decode(jsonReader.nextString(), 2), rx3.a);
                                case 3:
                                    b2 = (byte) (b2 | 1);
                                    j = jsonReader.nextLong();
                                default:
                                    jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.endObject();
                            if (b2 != 3 || str8 == null) {
                                StringBuilder sb4 = new StringBuilder();
                                if ((b2 & 1) == 0) {
                                    sb4.append(" baseAddress");
                                }
                                if ((b2 & 2) == 0) {
                                    sb4.append(" size");
                                }
                                if (str8 == null) {
                                    sb4.append(" name");
                                }
                                a70.r(bf3.m("Missing required properties:", sb4));
                            } else {
                                obj3 = new jt0(j, j2, str8, str9);
                            }
                        }
                    }
                    obj2 = obj3;
                    obj = obj2;
                    break;
                default:
                    obj = f(jsonReader);
                    break;
            }
            arrayList.add(obj);
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static ts0 c(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(U3.i.W)) {
                str = jsonReader.nextString();
                if (str == null) {
                    yhk.s("Null key");
                    return null;
                }
            } else if (nextName.equals(U3.i.X)) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    yhk.s("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new ts0(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a7, code lost:
    
        if (r5 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a9, code lost:
    
        r0.append(" name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ae, code lost:
    
        if (r6 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b0, code lost:
    
        r0.append(" code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b7, code lost:
    
        if ((r4 & 1) != 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b9, code lost:
    
        r0.append(" address");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02be, code lost:
    
        defpackage.a70.r(defpackage.bf3.m("Missing required properties:", r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [ft0] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [bx3] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [ww3] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ft0 d(JsonReader jsonReader) {
        char c;
        char c2;
        ?? r19;
        char c3;
        lt0 lt0Var;
        ?? r27;
        char c4;
        char c5;
        et0 et0Var = new et0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals(U3.i.G)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Object obj = null;
            switch (c) {
                case 0:
                    rt0 rt0Var = new rt0();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals(U3.j.Y)) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals(U3.i.n)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                rt0Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                rt0Var.b = jsonReader.nextInt();
                                rt0Var.g = (byte) (rt0Var.g | 1);
                                break;
                            case 2:
                                rt0Var.d = jsonReader.nextInt();
                                rt0Var.g = (byte) (rt0Var.g | 4);
                                break;
                            case 3:
                                rt0Var.f = jsonReader.nextLong();
                                rt0Var.g = (byte) (rt0Var.g | 16);
                                break;
                            case 4:
                                rt0Var.e = jsonReader.nextLong();
                                rt0Var.g = (byte) (rt0Var.g | 8);
                                break;
                            case 5:
                                rt0Var.c = jsonReader.nextBoolean();
                                rt0Var.g = (byte) (rt0Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    et0Var.d = rt0Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            list = b(jsonReader, new vp2(20));
                            if (list == null) {
                                yhk.s("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        a70.r("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    et0Var.f = new xt0(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    it0 it0Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    qt0 qt0Var = null;
                    List list4 = null;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        r19 = obj;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && it0Var != null) {
                                et0Var.c = new ht0(it0Var, list2, list3, bool, qt0Var, list4, i);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (it0Var == null) {
                                    sb.append(" execution");
                                }
                                if (!z) {
                                    sb.append(" uiOrientation");
                                }
                                a70.r(bf3.m("Missing required properties:", sb));
                                return r19;
                            }
                        } else {
                            String nextName4 = jsonReader.nextName();
                            nextName4.getClass();
                            switch (nextName4.hashCode()) {
                                case -1405314732:
                                    if (nextName4.equals("appProcessDetails")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1332194002:
                                    if (nextName4.equals("background")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1090974952:
                                    if (nextName4.equals("execution")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -80231855:
                                    if (nextName4.equals("internalKeys")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 555169704:
                                    if (nextName4.equals("customAttributes")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 928737948:
                                    if (nextName4.equals("uiOrientation")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1847730860:
                                    if (nextName4.equals("currentProcessDetails")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    ArrayList arrayList = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add(g(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list4 = Collections.unmodifiableList(arrayList);
                                    obj = r19;
                                case 1:
                                    bool = Boolean.valueOf(jsonReader.nextBoolean());
                                    obj = r19;
                                case 2:
                                    jsonReader.beginObject();
                                    List list5 = r19;
                                    ?? r23 = list5;
                                    rs0 rs0Var = r23;
                                    ?? r25 = rs0Var;
                                    lt0Var = r25;
                                    r27 = lt0Var;
                                    while (jsonReader.hasNext()) {
                                        String nextName5 = jsonReader.nextName();
                                        nextName5.getClass();
                                        switch (nextName5.hashCode()) {
                                            case -1375141843:
                                                if (nextName5.equals("appExitInfo")) {
                                                    c4 = 0;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -1337936983:
                                                if (nextName5.equals("threads")) {
                                                    c4 = 1;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -902467928:
                                                if (nextName5.equals("signal")) {
                                                    c4 = 2;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 937615455:
                                                if (nextName5.equals("binaries")) {
                                                    c4 = 3;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 1467719157:
                                                if (nextName5.equals("profilingManagerInfo")) {
                                                    c4 = 4;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 1481625679:
                                                if (nextName5.equals("exception")) {
                                                    c4 = 5;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            default:
                                                c4 = 65535;
                                                break;
                                        }
                                        switch (c4) {
                                            case 0:
                                                rs0Var = a(jsonReader);
                                            case 1:
                                                list5 = b(jsonReader, new vp2(21));
                                            case 2:
                                                jsonReader.beginObject();
                                                long j = 0;
                                                byte b = 0;
                                                String str = r19;
                                                String str2 = str;
                                                while (jsonReader.hasNext()) {
                                                    String nextName6 = jsonReader.nextName();
                                                    nextName6.getClass();
                                                    switch (nextName6.hashCode()) {
                                                        case -1147692044:
                                                            if (nextName6.equals("address")) {
                                                                c5 = 0;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        case 3059181:
                                                            if (nextName6.equals("code")) {
                                                                c5 = 1;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        case 3373707:
                                                            if (nextName6.equals("name")) {
                                                                c5 = 2;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        default:
                                                            c5 = 65535;
                                                            break;
                                                    }
                                                    switch (c5) {
                                                        case 0:
                                                            b = (byte) (b | 1);
                                                            j = jsonReader.nextLong();
                                                            break;
                                                        case 1:
                                                            str2 = jsonReader.nextString();
                                                            if (str2 == null) {
                                                                yhk.s("Null code");
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        case 2:
                                                            str = jsonReader.nextString();
                                                            if (str == null) {
                                                                yhk.s("Null name");
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                }
                                                jsonReader.endObject();
                                                if (b == 1 && str != null && str2 != null) {
                                                    lt0Var = new lt0(str, str2, j);
                                                }
                                                break;
                                            case 3:
                                                List b2 = b(jsonReader, new vp2(22));
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = b2;
                                                if (b2 == null) {
                                                    yhk.s("Null binaries");
                                                    break;
                                                }
                                            case 4:
                                                r23 = r23;
                                                r25 = h(jsonReader);
                                                r27 = r27;
                                            case 5:
                                                r23 = e(jsonReader);
                                                r25 = r25;
                                                r27 = r27;
                                            default:
                                                jsonReader.skipValue();
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = r27;
                                        }
                                    }
                                    jsonReader.endObject();
                                    if (lt0Var != null && r27 != 0) {
                                        it0Var = new it0(list5, r23, rs0Var, r25, lt0Var, r27);
                                        obj = r19;
                                    }
                                    break;
                                case 3:
                                    ArrayList arrayList2 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList2.add(c(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list3 = Collections.unmodifiableList(arrayList2);
                                    obj = r19;
                                case 4:
                                    ArrayList arrayList3 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList3.add(c(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list2 = Collections.unmodifiableList(arrayList3);
                                    obj = r19;
                                case 5:
                                    i = jsonReader.nextInt();
                                    z = true;
                                    obj = r19;
                                case 6:
                                    qt0Var = g(jsonReader);
                                    obj = r19;
                                default:
                                    jsonReader.skipValue();
                                    obj = r19;
                            }
                            return null;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (lt0Var == null) {
                        sb2.append(" signal");
                    }
                    if (r27 == 0) {
                        sb2.append(" binaries");
                    }
                    a70.r(bf3.m("Missing required properties:", sb2));
                    return r19;
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                yhk.s("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        a70.r("Missing required properties: content");
                        return null;
                    }
                    et0Var.e = new tt0(str3);
                    break;
                case 4:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        yhk.s("Null type");
                        return null;
                    }
                    et0Var.b = nextString;
                    break;
                case 5:
                    et0Var.a = jsonReader.nextLong();
                    et0Var.g = (byte) (et0Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return et0Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004a, code lost:
    
        if (r3.equals("reason") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kt0 e(JsonReader jsonReader) {
        jsonReader.beginObject();
        byte b = 0;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        kt0 kt0Var = null;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new kt0(str, str2, list, kt0Var, i);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" type");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                a70.r(bf3.m("Missing required properties:", sb));
                return null;
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(b.JSON_KEY_FRAME_ADS)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -934964668:
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    list = b(jsonReader, new vp2(23));
                    if (list == null) {
                        yhk.s("Null frames");
                        return null;
                    }
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    if (str == null) {
                        yhk.s("Null type");
                        return null;
                    }
                    break;
                case 3:
                    kt0Var = e(jsonReader);
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static ot0 f(JsonReader jsonReader) {
        nt0 nt0Var = new nt0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    nt0Var.d = jsonReader.nextLong();
                    nt0Var.f = (byte) (nt0Var.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        yhk.s("Null symbol");
                        return null;
                    }
                    nt0Var.b = nextString;
                    break;
                case "pc":
                    nt0Var.a = jsonReader.nextLong();
                    nt0Var.f = (byte) (nt0Var.f | 1);
                    break;
                case "file":
                    nt0Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    nt0Var.e = jsonReader.nextInt();
                    nt0Var.f = (byte) (nt0Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return nt0Var.a();
    }

    public static qt0 g(JsonReader jsonReader) {
        pt0 pt0Var = new pt0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    pt0Var.b = jsonReader.nextInt();
                    pt0Var.e = (byte) (pt0Var.e | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        yhk.s("Null processName");
                        return null;
                    }
                    pt0Var.a = nextString;
                    break;
                case "defaultProcess":
                    pt0Var.d = jsonReader.nextBoolean();
                    pt0Var.e = (byte) (pt0Var.e | 4);
                    break;
                case "importance":
                    pt0Var.c = jsonReader.nextInt();
                    pt0Var.e = (byte) (pt0Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return pt0Var.a();
    }

    public static ws0 h(JsonReader jsonReader) {
        jsonReader.beginObject();
        xs0 xs0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("profilingTrigger")) {
                jsonReader.beginObject();
                boolean z = false;
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("trigger")) {
                        i = jsonReader.nextInt();
                        z = true;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (!z) {
                    a70.r("Missing required properties: trigger");
                    return null;
                }
                xs0Var = new xs0(i);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (xs0Var != null) {
            return new ws0(xs0Var);
        }
        a70.r("Missing required properties: profilingTrigger");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static os0 i(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        boolean z2;
        Charset charset = rx3.a;
        ns0 ns0Var = new ns0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals(L6.H)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = b(jsonReader, new vp2(19));
                            if (list == null) {
                                yhk.s("Null files");
                                return null;
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        a70.r("Missing required properties: files");
                        return null;
                    }
                    ns0Var.k = new us0(list, str);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        yhk.s("Null sdkVersion");
                        return null;
                    }
                    ns0Var.a = nextString;
                    break;
                case 2:
                    ns0Var.g = jsonReader.nextString();
                    break;
                case 3:
                    ns0Var.l = a(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        yhk.s("Null buildVersion");
                        return null;
                    }
                    ns0Var.h = nextString2;
                    break;
                case 5:
                    ns0Var.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        yhk.s("Null gmpAppId");
                        return null;
                    }
                    ns0Var.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        yhk.s("Null installationUuid");
                        return null;
                    }
                    ns0Var.d = nextString4;
                    break;
                case '\b':
                    ns0Var.e = jsonReader.nextString();
                    break;
                case '\t':
                    ns0Var.c = jsonReader.nextInt();
                    ns0Var.m = (byte) (ns0Var.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        yhk.s("Null displayVersion");
                        return null;
                    }
                    ns0Var.i = nextString5;
                    break;
                case 11:
                    ys0 ys0Var = new ys0();
                    ys0Var.f = false;
                    ys0Var.m = (byte) (ys0Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals(U3.i.G)) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals(L6.F)) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                ys0Var.d = jsonReader.nextLong();
                                ys0Var.m = (byte) (ys0Var.m | 1);
                            case 1:
                                ys0Var.c = jsonReader.nextString();
                            case 2:
                                ys0Var.b = new String(Base64.decode(jsonReader.nextString(), 2), rx3.a);
                            case 3:
                                ys0Var.e = Long.valueOf(jsonReader.nextLong());
                            case 4:
                                ct0 ct0Var = new ct0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals(L6.B)) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            ct0Var.f = jsonReader.nextBoolean();
                                            ct0Var.j = (byte) (ct0Var.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                yhk.s("Null manufacturer");
                                                break;
                                            } else {
                                                ct0Var.h = nextString6;
                                                break;
                                            }
                                        case 2:
                                            ct0Var.d = jsonReader.nextLong();
                                            ct0Var.j = (byte) (ct0Var.j | 4);
                                            break;
                                        case 3:
                                            ct0Var.a = jsonReader.nextInt();
                                            ct0Var.j = (byte) (ct0Var.j | 1);
                                            break;
                                        case 4:
                                            ct0Var.e = jsonReader.nextLong();
                                            ct0Var.j = (byte) (ct0Var.j | 8);
                                            break;
                                        case 5:
                                            ct0Var.c = jsonReader.nextInt();
                                            ct0Var.j = (byte) (ct0Var.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                yhk.s("Null model");
                                                break;
                                            } else {
                                                ct0Var.b = nextString7;
                                                break;
                                            }
                                        case 7:
                                            ct0Var.g = jsonReader.nextInt();
                                            ct0Var.j = (byte) (ct0Var.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                yhk.s("Null modelClass");
                                                break;
                                            } else {
                                                ct0Var.i = nextString8;
                                                break;
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                ys0Var.j = ct0Var.a();
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                ys0Var.k = Collections.unmodifiableList(arrayList);
                            case 6:
                                yt0 yt0Var = new yt0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = 2;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals(L6.H)) {
                                                z = 3;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        default:
                                            z = -1;
                                            break;
                                    }
                                    switch (z) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                yhk.s("Null buildVersion");
                                                break;
                                            } else {
                                                yt0Var.c = nextString9;
                                                break;
                                            }
                                        case true:
                                            yt0Var.d = jsonReader.nextBoolean();
                                            yt0Var.e = (byte) (yt0Var.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                yhk.s("Null version");
                                                break;
                                            } else {
                                                yt0Var.b = nextString10;
                                                break;
                                            }
                                        case true:
                                            yt0Var.a = jsonReader.nextInt();
                                            yt0Var.e = (byte) (yt0Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                ys0Var.i = yt0Var.a();
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                z2 = false;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                z2 = 2;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                z2 = 3;
                                                break;
                                            }
                                            z2 = -1;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                z2 = 4;
                                                break;
                                            }
                                            z2 = -1;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                z2 = 5;
                                                break;
                                            }
                                            z2 = -1;
                                        default:
                                            z2 = -1;
                                            break;
                                    }
                                    switch (z2) {
                                        case false:
                                            str7 = jsonReader.nextString();
                                            if (str7 == null) {
                                                yhk.s("Null identifier");
                                                break;
                                            } else {
                                                break;
                                            }
                                        case true:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                yhk.s("Null version");
                                                break;
                                            } else {
                                                break;
                                            }
                                        case true:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str7 == null || str2 == null) {
                                    StringBuilder sb = new StringBuilder();
                                    if (str7 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    a70.r(bf3.m("Missing required properties:", sb));
                                    break;
                                } else {
                                    ys0Var.g = new at0(str7, str2, str3, str4, str5, str6);
                                }
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            yhk.s("Null identifier");
                                            break;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    a70.r("Missing required properties: identifier");
                                    break;
                                } else {
                                    ys0Var.h = new au0(str8);
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    yhk.s("Null generator");
                                    break;
                                } else {
                                    ys0Var.a = nextString11;
                                }
                            case '\n':
                                ys0Var.f = jsonReader.nextBoolean();
                                ys0Var.m = (byte) (ys0Var.m | 2);
                            case 11:
                                ys0Var.l = jsonReader.nextInt();
                                ys0Var.m = (byte) (ys0Var.m | 4);
                            default:
                                jsonReader.skipValue();
                        }
                        return null;
                        break;
                    }
                    jsonReader.endObject();
                    ns0Var.j = ys0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return ns0Var.a();
    }

    public static os0 j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                os0 i = i(jsonReader);
                jsonReader.close();
                return i;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
