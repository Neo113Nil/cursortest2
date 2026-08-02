package defpackage;

import com.ironsource.U3;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zjg {
    public final int a;
    public final wjg b;
    public final yjg c;
    public final vjg d;
    public final int e;
    public final String f;

    public zjg(int i, wjg wjgVar, yjg yjgVar, vjg vjgVar, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = wjgVar;
        this.c = yjgVar;
        this.d = vjgVar;
        this.e = i2;
        this.f = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r15.equals("warning") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zjg a(JSONObject jSONObject) {
        xjg xjgVar;
        vjg vjgVar;
        wjg wjgVar;
        vjg vjgVar2;
        bkg bkgVar;
        bkg bkgVar2;
        int optInt = jSONObject.optInt("TTL");
        if (optInt <= 0) {
            a70.p("TTL is missing or is not a strictly positive integer in the remote config");
            return null;
        }
        int optInt2 = jSONObject.optInt("statusCode");
        String optString = jSONObject.optString("version");
        JSONObject optJSONObject = jSONObject.optJSONObject("smart");
        if (optJSONObject == null) {
            a70.p("'smart' node is missing or invalid in the remote config");
            return null;
        }
        int optInt3 = optJSONObject.optInt("networkId", -1);
        String optString2 = optJSONObject.optString("adCallBaseURL");
        optString2.getClass();
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("adCallAdditionalParameters");
        if (optJSONObject2 != null) {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("get");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (optJSONObject3 != null) {
                linkedHashMap.putAll(mha.v(optJSONObject3));
            }
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject(FootballShotmapItem.SHOT_TYPE_POST);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (optJSONObject4 != null) {
                linkedHashMap2.putAll(mha.v(optJSONObject4));
            }
            xjgVar = new xjg(linkedHashMap, linkedHashMap2);
        } else {
            xjgVar = null;
        }
        int optInt4 = optJSONObject.optInt("latestSDKVersionId", -1);
        String optString3 = optJSONObject.optString("latestSDKMessage");
        optString3.getClass();
        yjg yjgVar = new yjg(optInt3, optString2, xjgVar, optInt4, optString3);
        JSONObject optJSONObject5 = jSONObject.optJSONObject("logger");
        if (optJSONObject5 != null) {
            JSONObject optJSONObject6 = optJSONObject5.optJSONObject("samplingRate");
            List j = b.j("error", "warning", "info", "debug");
            int c = sub.c(k13.r(j, 10));
            vjgVar = null;
            if (c < 16) {
                c = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(c);
            Iterator it = j.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                char c2 = 3;
                bkg bkgVar3 = bkg.INFO;
                bkg bkgVar4 = bkg.DEBUG;
                bkg bkgVar5 = bkg.ERROR;
                bkg bkgVar6 = bkg.WARNING;
                bkg bkgVar7 = bkg.NONE;
                if (hasNext) {
                    String str = (String) it.next();
                    str.getClass();
                    switch (str.hashCode()) {
                        case 3237038:
                            if (str.equals("info")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 95458899:
                            if (str.equals("debug")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 96784904:
                            if (str.equals("error")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1124446108:
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            bkgVar2 = bkgVar3;
                            break;
                        case 1:
                            bkgVar2 = bkgVar4;
                            break;
                        case 2:
                            bkgVar2 = bkgVar5;
                            break;
                        case 3:
                            bkgVar2 = bkgVar6;
                            break;
                        default:
                            bkgVar2 = bkgVar7;
                            break;
                    }
                    linkedHashMap3.put(bkgVar2, Integer.valueOf(optJSONObject6 != null ? optJSONObject6.optInt(str, -1) : -1));
                } else {
                    String optString4 = optJSONObject5.optString("URL");
                    if (optString4.length() == 0) {
                        optString4 = null;
                    }
                    String optString5 = optJSONObject5.optString("minLogLevel");
                    optString5.getClass();
                    switch (optString5) {
                        case "info":
                            bkgVar = bkgVar3;
                            break;
                        case "debug":
                            bkgVar = bkgVar4;
                            break;
                        case "error":
                            bkgVar = bkgVar5;
                            break;
                        case "warning":
                            bkgVar = bkgVar6;
                            break;
                        default:
                            bkgVar = bkgVar7;
                            break;
                    }
                    wjgVar = new wjg(optString4, bkgVar, linkedHashMap3);
                }
            }
        } else {
            vjgVar = null;
            wjgVar = null;
        }
        try {
            JSONObject optJSONObject7 = jSONObject.optJSONObject("creativeFeedback");
            vjgVar2 = optJSONObject7 != null ? rha.o(optJSONObject7) : vjgVar;
        } catch (Exception e) {
            fjg c3 = fjg.c();
            e.toString();
            c3.f(2);
            vjgVar2 = vjgVar;
        }
        optString.getClass();
        return new zjg(optInt, wjgVar, yjgVar, vjgVar2, optInt2, optString);
    }

    public final String b() {
        String obj;
        Map map;
        xjg xjgVar = this.c.c;
        Object obj2 = (xjgVar == null || (map = xjgVar.b) == null) ? null : map.get("iabFrameworks");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null || (obj = list.toString()) == null) {
            return null;
        }
        return c.r(c.r(c.r(obj, U3.j.d, "", false), U3.j.e, "", false), " ", "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjg)) {
            return false;
        }
        zjg zjgVar = (zjg) obj;
        return this.a == zjgVar.a && Intrinsics.c(this.b, zjgVar.b) && this.c.equals(zjgVar.c) && Intrinsics.c(this.d, zjgVar.d) && this.e == zjgVar.e && Intrinsics.c(this.f, zjgVar.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        wjg wjgVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (wjgVar == null ? 0 : wjgVar.hashCode())) * 31)) * 31;
        vjg vjgVar = this.d;
        return this.f.hashCode() + wv8.a(this.e, (hashCode2 + (vjgVar != null ? vjgVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "SCSRemoteConfig(ttl=" + this.a + ", loggerConfig=" + this.b + ", smartConfig=" + this.c + ", creativeFeedbackConfig=" + this.d + ", statusCode=" + this.e + ", version=" + this.f + ")";
    }
}
