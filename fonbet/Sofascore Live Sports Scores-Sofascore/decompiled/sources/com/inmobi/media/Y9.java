package com.inmobi.media;

import android.content.ContentValues;
import defpackage.a70;
import defpackage.k13;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y9 extends AbstractC3566l6 {
    public final C3724r9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y9(C3724r9 c3724r9) {
        super("crash", c3724r9);
        c3724r9.getClass();
        this.c = c3724r9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[LOOP:0: B:11:0x0063->B:13:0x0069, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.inmobi.media.AbstractC3566l6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, sq3 sq3Var) {
        X9 x9;
        int i2;
        if (sq3Var instanceof X9) {
            x9 = (X9) sq3Var;
            int i3 = x9.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x9.c = i3 - Integer.MIN_VALUE;
                Object obj = x9.a;
                lu3 lu3Var = lu3.a;
                i2 = x9.c;
                if (i2 != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.c;
                    x9.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, "SELECT * FROM crash ORDER BY ts ASC LIMIT " + i, null), x9);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List<ContentValues> list = (List) obj;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                for (ContentValues contentValues : list) {
                    contentValues.getClass();
                    String asString = contentValues.getAsString("eventId");
                    String asString2 = contentValues.getAsString("eventType");
                    String asString3 = contentValues.getAsString("componentType");
                    String asString4 = contentValues.getAsString("payload");
                    String asString5 = contentValues.getAsString("ts");
                    asString5.getClass();
                    long parseLong = Long.parseLong(asString5);
                    asString.getClass();
                    asString3.getClass();
                    asString2.getClass();
                    C3312ba c3312ba = new C3312ba(asString, asString3, asString2, asString4);
                    c3312ba.c = parseLong;
                    Integer asInteger = contentValues.getAsInteger("id");
                    asInteger.getClass();
                    c3312ba.d = asInteger.intValue();
                    arrayList.add(c3312ba);
                }
                return arrayList;
            }
        }
        x9 = new X9(this, sq3Var);
        Object obj2 = x9.a;
        lu3 lu3Var2 = lu3.a;
        i2 = x9.c;
        if (i2 != 0) {
        }
        List<ContentValues> list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
        while (r8.hasNext()) {
        }
        return arrayList2;
    }
}
