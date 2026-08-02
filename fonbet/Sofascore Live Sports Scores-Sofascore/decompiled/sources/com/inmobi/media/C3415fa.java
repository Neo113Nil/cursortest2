package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.fa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3415fa extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3441ga b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3415fa(C3441ga c3441ga, ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3441ga;
        this.c = arrayList;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3415fa(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3415fa(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        C3467ha c3467ha;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            Kb kb = (Kb) Lb.a.getValue();
            this.a = 1;
            obj = kb.b(this);
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
        ArrayList arrayList = this.c;
        for (Db db : (Iterable) obj) {
            CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
            if (!Yb.a(db.a)) {
                String b = AbstractC3443gc.b(db.a);
                if (b != null) {
                    JSONObject jSONObject = new JSONObject(b);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
                    JSONArray jSONArray = jSONObject.getJSONArray("log");
                    jSONObject2.getClass();
                    jSONArray.getClass();
                    c3467ha = new C3467ha(jSONObject2, jSONArray, db);
                } else {
                    c3467ha = null;
                }
                if (c3467ha != null) {
                    arrayList.add(c3467ha);
                }
            }
        }
        return Unit.a;
    }
}
