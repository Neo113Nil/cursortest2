package com.inmobi.media;

import android.content.ContentValues;
import defpackage.a70;
import defpackage.k13;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K4 {
    public final C3724r9 a;

    public K4(C3724r9 c3724r9) {
        c3724r9.getClass();
        this.a = c3724r9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[LOOP:0: B:11:0x0057->B:13:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        I4 i4;
        int i;
        if (sq3Var instanceof I4) {
            i4 = (I4) sq3Var;
            int i2 = i4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i4.c = i2 - Integer.MIN_VALUE;
                Object obj = i4.a;
                lu3 lu3Var = lu3.a;
                i = i4.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    i4.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, "SELECT * FROM c_data", null), i4);
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
                Iterable<ContentValues> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                for (ContentValues contentValues : iterable) {
                    contentValues.getClass();
                    String asString = contentValues.getAsString("e_data");
                    asString.getClass();
                    Long asLong = contentValues.getAsLong("timestamp");
                    asLong.getClass();
                    arrayList.add(new C3385e6(asString, asLong.longValue()));
                }
                return arrayList;
            }
        }
        i4 = new I4(this, sq3Var);
        Object obj2 = i4.a;
        lu3 lu3Var2 = lu3.a;
        i = i4.c;
        if (i != 0) {
        }
        Iterable<ContentValues> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        while (r6.hasNext()) {
        }
        return arrayList2;
    }

    public final Object a(int i, long j, R4 r4) {
        Object a = this.a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j + " ORDER BY timestamp DESC LIMIT " + i + ") foo);", r4);
        return a == lu3.a ? a : Unit.a;
    }
}
