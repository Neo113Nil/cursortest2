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
public final class Ck extends AbstractC3566l6 {
    public final C3724r9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ck(C3724r9 c3724r9) {
        super("telemetry", c3724r9);
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
        Bk bk;
        int i2;
        if (sq3Var instanceof Bk) {
            bk = (Bk) sq3Var;
            int i3 = bk.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bk.c = i3 - Integer.MIN_VALUE;
                Object obj = bk.a;
                lu3 lu3Var = lu3.a;
                i2 = bk.c;
                if (i2 != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.c;
                    bk.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i, null), bk);
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
                    String asString = contentValues.getAsString("eventType");
                    String asString2 = contentValues.getAsString("payload");
                    String asString3 = contentValues.getAsString("eventSource");
                    String asString4 = contentValues.getAsString("ts");
                    asString4.getClass();
                    long parseLong = Long.parseLong(asString4);
                    asString.getClass();
                    asString3.getClass();
                    Dk dk = new Dk(asString, asString2, asString3);
                    dk.c = parseLong;
                    Integer asInteger = contentValues.getAsInteger("id");
                    asInteger.getClass();
                    dk.d = asInteger.intValue();
                    arrayList.add(dk);
                }
                return arrayList;
            }
        }
        bk = new Bk(this, sq3Var);
        Object obj2 = bk.a;
        lu3 lu3Var2 = lu3.a;
        i2 = bk.c;
        if (i2 != 0) {
        }
        List<ContentValues> list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }
}
