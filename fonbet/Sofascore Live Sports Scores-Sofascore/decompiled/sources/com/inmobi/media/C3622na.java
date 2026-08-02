package com.inmobi.media;

import defpackage.ku3;
import defpackage.ok3;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wqm;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3622na implements InterfaceC3544ka {
    public final C3467ha a;

    public C3622na(C3467ha c3467ha) {
        c3467ha.getClass();
        this.a = c3467ha;
    }

    public static final Unit a(C3622na c3622na, String str) {
        C3467ha c3467ha = c3622na.a;
        JSONObject jSONObject = c3467ha.a;
        JSONArray jSONArray = c3467ha.b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        jSONObject3.getClass();
        AbstractC3443gc.a(str, jSONObject3, c3622na.a.c.a);
        String str2 = c3622na.a.c.a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Db db = c3622na.a.c;
        ok3.J(new C3596ma(new Db(str2, timeInMillis, 0, db.d, true, db.f), null));
        return Unit.a;
    }

    public final Object b() {
        try {
            p2g p2gVar = w2g.b;
            JSONObject jSONObject = this.a.a;
            jSONObject.getClass();
            if (!Intrinsics.c(jSONObject.toString(), "{}")) {
                JSONArray jSONArray = this.a.b;
                jSONArray.getClass();
                if (jSONArray.length() != 0) {
                    ku3 ku3Var = AbstractC3417fc.a;
                    AbstractC3391ec.a(new wqm(this, 0));
                }
            }
            return Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            return new u2g(th);
        }
    }

    public final void b(String str) {
        str.getClass();
        try {
            this.a.a.put("exitReason", str);
        } catch (Exception unused) {
        }
    }

    public final void a(String str) {
        str.getClass();
        try {
            JSONArray jSONArray = this.a.b;
            Nb nb = Nb.ERROR;
            SimpleDateFormat simpleDateFormat = Qb.a;
            nb.getClass();
            str.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put("timestamp", Qb.a.format(new Date()));
            jSONObject.put("tag", "IncompleteLogFinalizer");
            jSONObject.put("data", str);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
    }

    public final Object a() {
        try {
            p2g p2gVar = w2g.b;
            ku3 ku3Var = AbstractC3417fc.a;
            return new w2g(AbstractC3391ec.a(new wqm(this, 1)));
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            return new u2g(th);
        }
    }

    public static final Unit a(C3622na c3622na) {
        AbstractC3443gc.a(c3622na.a.c.a);
        ok3.J(new C3570la(c3622na, null));
        return Unit.a;
    }
}
