package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3487i4 {
    public final C3724r9 a;

    public C3487i4(C3724r9 c3724r9) {
        c3724r9.getClass();
        this.a = c3724r9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        C3461h4 c3461h4;
        int i;
        Config config;
        long longValue;
        if (sq3Var instanceof C3461h4) {
            c3461h4 = (C3461h4) sq3Var;
            int i2 = c3461h4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3461h4.c = i2 - Integer.MIN_VALUE;
                Object obj = c3461h4.a;
                lu3 lu3Var = lu3.a;
                i = c3461h4.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    c3461h4.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, "SELECT * FROM config_db", null), c3461h4);
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
                ((List) obj).toString();
                ArrayList arrayList = new ArrayList();
                for (ContentValues contentValues : (Iterable) obj) {
                    contentValues.getClass();
                    String asString = contentValues.getAsString("config_value");
                    Long asLong = contentValues.getAsLong("update_ts");
                    try {
                        JSONObject jSONObject = new JSONObject(asString);
                        String asString2 = contentValues.getAsString("config_type");
                        asString2.getClass();
                        asLong.getClass();
                        longValue = asLong.longValue();
                        asString2.getClass();
                        Class a = B4.a(asString2);
                        a.getClass();
                        config = (Config) a.cast(AbstractC3907ya.a(jSONObject, a, null, null));
                    } catch (Exception unused) {
                    }
                    if (config != null) {
                        config.setLastUpdateTimeStamp(longValue);
                        String.valueOf(config);
                        if (config == null) {
                            arrayList.add(config);
                        }
                    }
                    config = null;
                    String.valueOf(config);
                    if (config == null) {
                    }
                }
                return arrayList;
            }
        }
        c3461h4 = new C3461h4(this, sq3Var);
        Object obj2 = c3461h4.a;
        lu3 lu3Var2 = lu3.a;
        i = c3461h4.c;
        if (i != 0) {
        }
        ((List) obj2).toString();
        ArrayList arrayList2 = new ArrayList();
        while (r6.hasNext()) {
        }
        return arrayList2;
    }
}
