package com.inmobi.media;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.hoi;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.mz1;
import defpackage.sq3;
import defpackage.vxd;
import defpackage.w5m;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3566l6 {
    public final String a;
    public final C3724r9 b;

    public AbstractC3566l6(String str, C3724r9 c3724r9) {
        str.getClass();
        c3724r9.getClass();
        this.a = str;
        this.b = c3724r9;
    }

    public final Object a(ArrayList arrayList, hoi hoiVar) {
        if (arrayList.isEmpty()) {
            return Unit.a;
        }
        Object a = C3724r9.a(this.b, this.a, lnb.o("id IN (", CollectionsKt.f0(arrayList, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, new w5m(8), 30), ")"), hoiVar, 4);
        return a == lu3.a ? a : Unit.a;
    }

    public abstract Object b(int i, sq3 sq3Var);

    public final Object a(sq3 sq3Var) {
        String q = dmi.q("SELECT COUNT(*) FROM ", this.a);
        C3724r9 c3724r9 = this.b;
        c3724r9.getClass();
        return c3724r9.a(new C3492i9(c3724r9, q, null), sq3Var);
    }

    public static final CharSequence a(int i) {
        return String.valueOf(i);
    }

    public final Object a(long j, sq3 sq3Var) {
        Object a = C3724r9.a(this.b, this.a, vxd.l(j, "ts < "), sq3Var, 4);
        return a == lu3.a ? a : Unit.a;
    }

    public final Object a(int i, sq3 sq3Var) {
        String str = this.a;
        Object a = this.b.a(fc6.h(i, ")", mz1.s("DELETE FROM ", str, " WHERE id IN (SELECT id FROM ", str, " ORDER BY ts ASC LIMIT ")), sq3Var);
        return a == lu3.a ? a : Unit.a;
    }
}
