package com.inmobi.media;

import android.content.ContentValues;
import defpackage.a70;
import defpackage.k13;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3357d3 {
    public final C3724r9 a;

    public C3357d3(C3724r9 c3724r9) {
        c3724r9.getClass();
        this.a = c3724r9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, sq3 sq3Var) {
        C3279a3 c3279a3;
        int i3;
        if (sq3Var instanceof C3279a3) {
            c3279a3 = (C3279a3) sq3Var;
            int i4 = c3279a3.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c3279a3.c = i4 - Integer.MIN_VALUE;
                Object obj = c3279a3.a;
                lu3 lu3Var = lu3.a;
                i3 = c3279a3.c;
                if (i3 != 0) {
                    y6a.M(obj);
                    String str = "SELECT * FROM click WHERE ts < " + (System.currentTimeMillis() - i2) + " ORDER BY ts ASC LIMIT " + i;
                    C3724r9 c3724r9 = this.a;
                    c3279a3.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, str, null), c3279a3);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable<ContentValues> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                for (ContentValues contentValues : iterable) {
                    contentValues.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String asString = contentValues.getAsString("track_extras");
                    if (asString != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(asString);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                Object obj2 = jSONObject.get(next);
                                obj2.getClass();
                                linkedHashMap2.put(next, (String) obj2);
                            }
                            linkedHashMap.putAll(linkedHashMap2);
                        } catch (Exception unused) {
                        }
                    }
                    Integer asInteger = contentValues.getAsInteger("id");
                    asInteger.getClass();
                    int intValue = asInteger.intValue();
                    String asString2 = contentValues.getAsString("url");
                    asString2.getClass();
                    Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
                    asBoolean.getClass();
                    boolean booleanValue = asBoolean.booleanValue();
                    Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
                    asBoolean2.getClass();
                    boolean booleanValue2 = asBoolean2.booleanValue();
                    Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
                    asInteger2.getClass();
                    int intValue2 = asInteger2.intValue();
                    Long asLong = contentValues.getAsLong("ts");
                    asLong.getClass();
                    long longValue = asLong.longValue();
                    Long asLong2 = contentValues.getAsLong("created_ts");
                    asLong2.getClass();
                    arrayList.add(new Z2(intValue, asString2, linkedHashMap, booleanValue, booleanValue2, intValue2, longValue, asLong2.longValue()));
                }
                return arrayList;
            }
        }
        c3279a3 = new C3279a3(this, sq3Var);
        Object obj3 = c3279a3.a;
        lu3 lu3Var2 = lu3.a;
        i3 = c3279a3.c;
        if (i3 != 0) {
        }
        Iterable<ContentValues> iterable2 = (Iterable) obj3;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        while (r12.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        C3305b3 c3305b3;
        int i;
        if (sq3Var instanceof C3305b3) {
            c3305b3 = (C3305b3) sq3Var;
            int i2 = c3305b3.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3305b3.c = i2 - Integer.MIN_VALUE;
                Object obj = c3305b3.a;
                lu3 lu3Var = lu3.a;
                i = c3305b3.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    c3305b3.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3492i9(c3724r9, "SELECT COUNT(*) FROM click", null), c3305b3);
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
                return Boolean.valueOf(((Number) obj).intValue() != 0);
            }
        }
        c3305b3 = new C3305b3(this, sq3Var);
        Object obj2 = c3305b3.a;
        lu3 lu3Var2 = lu3.a;
        i = c3305b3.c;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() != 0);
    }
}
