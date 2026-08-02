package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.fc6;
import defpackage.k13;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.tub;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sh {
    public final F9 a;
    public final String b;
    public final C3849w4 c;

    public Sh(F9 f9) {
        f9.getClass();
        this.a = f9;
        this.b = "Sh";
        this.c = new C3849w4();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:110:0x0468
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03bb A[LOOP:4: B:90:0x03b5->B:92:0x03bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0342  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.inmobi.media.bf, java.util.Iterator, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0454 -> B:13:0x0456). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String r23, java.lang.String r24, com.inmobi.media.core.config.models.RootConfig r25, java.util.List r26, defpackage.k8f r27, defpackage.sq3 r28) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Sh.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, k8f, sq3):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final AbstractC3875x4 a(C3823v4 c3823v4, C3797u4 c3797u4) {
        C3562l2 c3562l2;
        String type = c3797u4.b.getType();
        c3823v4.getClass();
        type.getClass();
        switch (type.hashCode()) {
            case -60641721:
                if (type.equals("crashReporting")) {
                    c3562l2 = c3823v4.b();
                    break;
                }
                c3562l2 = null;
                break;
            case 96432:
                if (type.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    c3562l2 = c3823v4.a();
                    break;
                }
                c3562l2 = null;
                break;
            case 3506402:
                if (type.equals("root")) {
                    c3562l2 = c3823v4.c();
                    break;
                }
                c3562l2 = null;
                break;
            case 780346297:
                if (type.equals("telemetry")) {
                    c3562l2 = c3823v4.e();
                    break;
                }
                c3562l2 = null;
                break;
            case 2088265419:
                if (type.equals("signals")) {
                    c3562l2 = c3823v4.d();
                    break;
                }
                c3562l2 = null;
                break;
            default:
                c3562l2 = null;
                break;
        }
        if (c3562l2 == null) {
            return new C3512j4(5, c3797u4.b.getLastUpdateTimeStamp(), c3797u4.b.getType());
        }
        Il a = this.c.a(c3562l2, c3797u4);
        int i = a.a;
        if (i == 200) {
            Config config = a.b;
            config.setLastUpdateTimeStamp(System.currentTimeMillis());
            this.b.getClass();
            c3797u4.b.getType();
            return new C3901y4(200, config);
        }
        if (i != 304) {
            return new C3512j4(a.a, c3797u4.b.getLastUpdateTimeStamp(), c3797u4.b.getType());
        }
        Config config2 = a.b;
        config2.setLastUpdateTimeStamp(System.currentTimeMillis());
        this.b.getClass();
        c3797u4.b.getType();
        return new C3901y4(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[Catch: ClassCastException -> 0x006d, JSONException -> 0x0072, TryCatch #3 {ClassCastException -> 0x006d, JSONException -> 0x0072, blocks: (B:11:0x0028, B:12:0x0047, B:14:0x004b, B:15:0x004f, B:17:0x0055, B:21:0x0064, B:22:0x006b), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[Catch: ClassCastException -> 0x006d, JSONException -> 0x0072, TryCatch #3 {ClassCastException -> 0x006d, JSONException -> 0x0072, blocks: (B:11:0x0028, B:12:0x0047, B:14:0x004b, B:15:0x004f, B:17:0x0055, B:21:0x0064, B:22:0x006b), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC3317bf interfaceC3317bf, List list, sq3 sq3Var) {
        Rh rh;
        int i;
        ArrayList arrayList;
        C3823v4 c3823v4;
        if (sq3Var instanceof Rh) {
            rh = (Rh) sq3Var;
            int i2 = rh.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rh.e = i2 - Integer.MIN_VALUE;
                Object obj = rh.c;
                lu3 lu3Var = lu3.a;
                i = rh.e;
                if (i != 0) {
                    ArrayList u = fc6.u(obj);
                    try {
                        rh.a = list;
                        rh.b = u;
                        rh.e = 1;
                        Object a = interfaceC3317bf.a();
                        if (a == lu3Var) {
                            return lu3Var;
                        }
                        obj = a;
                        arrayList = u;
                    } catch (ClassCastException unused) {
                        arrayList = u;
                        a(list, 2);
                        return arrayList;
                    } catch (JSONException unused2) {
                        arrayList = u;
                        a(list, 2);
                        return arrayList;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = rh.b;
                    list = rh.a;
                    try {
                        y6a.M(obj);
                    } catch (ClassCastException unused3) {
                        a(list, 2);
                        return arrayList;
                    } catch (JSONException unused4) {
                        a(list, 2);
                        return arrayList;
                    }
                }
                c3823v4 = (C3823v4) obj;
                if (c3823v4 == null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(c3823v4, (C3797u4) it.next()));
                    }
                    return arrayList;
                }
                throw new JSONException("Error parsing config response");
            }
        }
        rh = new Rh(this, sq3Var);
        Object obj2 = rh.c;
        lu3 lu3Var2 = lu3.a;
        i = rh.e;
        if (i != 0) {
        }
        c3823v4 = (C3823v4) obj2;
        if (c3823v4 == null) {
        }
    }

    public static final boolean a(Set set, C3797u4 c3797u4) {
        c3797u4.getClass();
        return set.contains(c3797u4.b.getType());
    }

    public static void a(int i, List list, List list2) {
        LinkedHashMap i2 = tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)), new Pair("name", list), new Pair("lts", list2), new Pair("networkType", F5.o()));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("InvalidConfig", i2, EnumC3943zk.SDK);
    }

    public static void a(List list, int i) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3797u4) it.next()).b.getType());
        }
        ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C3797u4) it2.next()).b.getLastUpdateTimeStamp()));
        }
        a(i, arrayList, arrayList2);
    }
}
