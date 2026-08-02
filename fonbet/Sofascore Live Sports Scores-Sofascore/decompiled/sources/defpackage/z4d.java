package defpackage;

import com.sofascore.model.database.DbNatsEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public interface z4d {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r0 == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0062, code lost:
    
        if (r5 == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object a(z4d z4dVar, String str, sq3 sq3Var) {
        y4d y4dVar;
        int i;
        String str2;
        Object U;
        ArrayList arrayList;
        z4d z4dVar2 = z4dVar;
        if (sq3Var instanceof y4d) {
            y4dVar = (y4d) sq3Var;
            int i2 = y4dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y4dVar.v = i2 - Integer.MIN_VALUE;
                Object obj = y4dVar.t;
                lu3 lu3Var = lu3.a;
                i = y4dVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    y4dVar.r = z4dVar2;
                    str2 = str;
                    y4dVar.s = str2;
                    y4dVar.v = 1;
                    U = gz8.U(y4dVar, ((a5d) z4dVar2).a, true, false, new clc(17));
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = y4dVar.s;
                    z4d z4dVar3 = y4dVar.r;
                    y6a.M(obj);
                    str2 = str3;
                    z4dVar2 = z4dVar3;
                    U = obj;
                }
                arrayList = new ArrayList();
                for (DbNatsEvent dbNatsEvent : (List) U) {
                    try {
                        JSONObject jSONObject = new JSONObject(dbNatsEvent.getMessage());
                        if (!jSONObject.has("geo_country")) {
                            jSONObject.put("geo_country", str2);
                            String jSONObject2 = jSONObject.toString();
                            jSONObject2.getClass();
                            arrayList.add(DbNatsEvent.copy$default(dbNatsEvent, 0, null, jSONObject2, 3, null));
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!arrayList.isEmpty()) {
                    return Unit.a;
                }
                y4dVar.r = null;
                y4dVar.s = null;
                y4dVar.v = 2;
                a5d a5dVar = (a5d) z4dVar2;
                Object U2 = gz8.U(y4dVar, a5dVar.a, false, true, new lsb(14, a5dVar, arrayList));
                if (U2 != lu3.a) {
                    U2 = Unit.a;
                }
            }
        }
        y4dVar = new y4d(z4dVar2, sq3Var);
        Object obj2 = y4dVar.t;
        lu3 lu3Var2 = lu3.a;
        i = y4dVar.v;
        if (i != 0) {
        }
        arrayList = new ArrayList();
        while (r5.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
    }
}
