package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.a70;
import defpackage.lu3;
import defpackage.qdj;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.td4;
import defpackage.w1l;
import defpackage.y6a;
import defpackage.yda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xa implements Zf {
    public CrashConfig a;
    public C3773t6 b;
    public final C3338ca c;
    public final Function1 d;

    public Xa(CrashConfig crashConfig) {
        crashConfig.getClass();
        this.a = crashConfig;
        this.c = new C3338ca(crashConfig);
        this.d = new qdj(this, 28);
    }

    @Override // com.inmobi.media.Zf
    public final Object a(rq3 rq3Var) {
        String str;
        F5.a.getClass();
        int n = F5.n();
        CrashConfig crashConfig = this.a;
        int i = 1;
        List<C3312ba> list = (List) td4.t0(kotlin.coroutines.g.a, new Ra(n != 0 ? n != 1 ? crashConfig.getMobileConfig().a() : crashConfig.getWifiConfig().a() : crashConfig.getMobileConfig().a(), null));
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w1l.A(arrayList, ((C3312ba) it.next()).d);
        }
        try {
            HashMap hashMap = new HashMap(F5.a.a(false));
            hashMap.put("im-accid", AbstractC3424fj.c);
            hashMap.put("version", "2.0.0");
            hashMap.put("component", "crash");
            hashMap.put("mk-version", AbstractC3450gj.a());
            hashMap.putAll(E1.e);
            hashMap.put("tp", AbstractC3450gj.b);
            String str2 = AbstractC3450gj.a;
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("tpVer", str2);
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (C3312ba c3312ba : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", c3312ba.e);
                jSONObject2.put("eventType", c3312ba.a);
                String str3 = c3312ba.b;
                if (str3 == null) {
                    str3 = "";
                }
                int length = str3.length() - i;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.d(str3.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                if (str3.subSequence(i2, length + 1).toString().length() > 0) {
                    String str4 = c3312ba.b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    jSONObject2.put("crash_report", str4);
                }
                jSONObject2.put("ts", c3312ba.c);
                jSONArray.put(jSONObject2);
                i = 1;
            }
            jSONObject.put("crash", jSONArray);
            str = jSONObject.toString();
        } catch (JSONException unused) {
            str = null;
        }
        if (str != null) {
            return new C3592m6(str, arrayList);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fc, code lost:
    
        if (r0 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (r0.a(r1, (defpackage.sq3) r2) == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (r1 != r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r1.a(r10, r2) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Xa xa, C3312ba c3312ba, sq3 sq3Var) {
        Sa sa;
        int i;
        C3312ba c3312ba2;
        C3312ba c3312ba3;
        String str;
        Object a;
        xa.getClass();
        if (sq3Var instanceof Sa) {
            sa = (Sa) sq3Var;
            int i2 = sa.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sa.d = i2 - Integer.MIN_VALUE;
                Object obj = sa.b;
                lu3 lu3Var = lu3.a;
                i = sa.d;
                if (i != 0) {
                    y6a.M(obj);
                    long currentTimeMillis = System.currentTimeMillis() - (xa.a.getEventTTL() * 1000);
                    Y9 y9 = (Y9) AbstractC3286aa.a.getValue();
                    c3312ba2 = c3312ba;
                    sa.a = c3312ba2;
                    sa.d = 1;
                } else if (i == 1) {
                    c3312ba2 = sa.a;
                    y6a.M(obj);
                } else if (i == 2) {
                    c3312ba2 = sa.a;
                    y6a.M(obj);
                    int intValue = (((Number) obj).intValue() + 1) - xa.a.getMaxEventsToPersist();
                    if (intValue > 0) {
                        Y9 y92 = (Y9) AbstractC3286aa.a.getValue();
                        sa.a = c3312ba2;
                        sa.d = 3;
                    }
                    c3312ba3 = c3312ba2;
                    Y9 y93 = (Y9) AbstractC3286aa.a.getValue();
                    sa.a = null;
                    sa.d = 4;
                    C3724r9 c3724r9 = y93.b;
                    String str2 = y93.a;
                    c3312ba3.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("eventId", c3312ba3.e);
                    contentValues.put("componentType", c3312ba3.f);
                    contentValues.put("eventType", c3312ba3.a);
                    str = c3312ba3.b;
                    if (str == null) {
                    }
                    contentValues.put("payload", str);
                    contentValues.put("ts", String.valueOf(c3312ba3.c));
                    a = c3724r9.a(str2, contentValues, 4, sa);
                    if (a != lu3Var) {
                    }
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c3312ba3 = sa.a;
                    y6a.M(obj);
                    Y9 y932 = (Y9) AbstractC3286aa.a.getValue();
                    sa.a = null;
                    sa.d = 4;
                    C3724r9 c3724r92 = y932.b;
                    String str22 = y932.a;
                    c3312ba3.getClass();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("eventId", c3312ba3.e);
                    contentValues2.put("componentType", c3312ba3.f);
                    contentValues2.put("eventType", c3312ba3.a);
                    str = c3312ba3.b;
                    if (str == null) {
                        str = "";
                    }
                    contentValues2.put("payload", str);
                    contentValues2.put("ts", String.valueOf(c3312ba3.c));
                    a = c3724r92.a(str22, contentValues2, 4, sa);
                    if (a != lu3Var) {
                        a = Unit.a;
                    }
                }
                Y9 y94 = (Y9) AbstractC3286aa.a.getValue();
                sa.a = c3312ba2;
                sa.d = 2;
                obj = y94.a(sa);
            }
        }
        sa = new Sa(xa, sq3Var);
        Object obj2 = sa.b;
        lu3 lu3Var2 = lu3.a;
        i = sa.d;
        if (i != 0) {
        }
        Y9 y942 = (Y9) AbstractC3286aa.a.getValue();
        sa.a = c3312ba2;
        sa.d = 2;
        obj2 = y942.a(sa);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Xa xa, sq3 sq3Var) {
        Va va;
        Object obj;
        int i;
        xa.getClass();
        if (sq3Var instanceof Va) {
            va = (Va) sq3Var;
            int i2 = va.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                va.c = i2 - Integer.MIN_VALUE;
                obj = va.a;
                lu3 lu3Var = lu3.a;
                i = va.c;
                if (i != 0) {
                    y6a.M(obj);
                    Y9 y9 = (Y9) AbstractC3286aa.a.getValue();
                    va.c = 1;
                    obj = y9.a(va);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((Number) obj).intValue() > 0) {
                    xa.a();
                }
                return Unit.a;
            }
        }
        va = new Va(xa, sq3Var);
        obj = va.a;
        lu3 lu3Var2 = lu3.a;
        i = va.c;
        if (i != 0) {
        }
        if (((Number) obj).intValue() > 0) {
        }
        return Unit.a;
    }

    public final void a() {
        C3540k6 eventConfig = this.a.getEventConfig();
        eventConfig.k = this.a.getUrl();
        C3773t6 c3773t6 = this.b;
        if (c3773t6 != null) {
            c3773t6.i = eventConfig;
        } else {
            C3773t6 c3773t62 = new C3773t6("crash", (Y9) AbstractC3286aa.a.getValue(), this, this.a.getEventConfig(), null);
            this.b = c3773t62;
            c3773t6 = c3773t62;
        }
        if (c3773t6 != null) {
            c3773t6.a(false);
        }
    }

    public static final Unit a(Xa xa, N2 n2) {
        n2.getClass();
        int i = n2.a;
        if (i != 1 && i != 2) {
            switch (i) {
                case 150:
                case 151:
                case 152:
                    Map map = n2.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = n2.c.get("data");
                        obj.getClass();
                        xa.getClass();
                        Hl.a(new Wa(xa, (C3312ba) obj, null));
                        break;
                    }
                    break;
            }
        } else {
            C3773t6 c3773t6 = xa.b;
            if (c3773t6 != null) {
                c3773t6.f.set(false);
                c3773t6.g.set(true);
                yda ydaVar = c3773t6.j;
                if (ydaVar != null) {
                    ydaVar.e(null);
                }
                c3773t6.j = null;
                c3773t6.i = null;
            }
            xa.b = null;
            ((Kc) AbstractC3424fj.e.getValue()).a(xa.d);
        }
        return Unit.a;
    }
}
