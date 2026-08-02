package com.inmobi.media;

import android.content.Context;
import defpackage.e5h;
import defpackage.hoi;
import defpackage.i5h;
import defpackage.joa;
import defpackage.lu3;
import defpackage.pcl;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3345ch extends hoi implements Function2 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3345ch(Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = context;
    }

    public static final boolean a(String str) {
        str.getClass();
        return kotlin.text.c.v(str, "auto_", false);
    }

    public static final boolean b(String str) {
        return Intrinsics.c(str, "a_i_dep");
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3345ch(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3345ch(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Qg qg;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            C3422fh c3422fh = C3422fh.a;
            Context context = this.a;
            c3422fh.getClass();
            Qg qg2 = C3422fh.d;
            if (qg2 == null) {
                qg2 = new Qg(context, "pub_signals_store");
                C3422fh.d = qg2;
            }
            try {
                String a = qg2.a("saved_signals");
                if (a != null) {
                    JSONObject jSONObject = new JSONObject(a);
                    Iterator<String> keys = jSONObject.keys();
                    keys.getClass();
                    Iterator it = i5h.q(i5h.h(e5h.b(keys), new pcl(25))).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    Qg qg3 = C3422fh.d;
                    if (qg3 == null) {
                        Intrinsics.i("prefDao");
                        throw null;
                    }
                    String jSONObject2 = jSONObject.toString();
                    jSONObject2.getClass();
                    qg3.a.a("saved_signals", jSONObject2, true);
                }
            } catch (Exception e) {
                Qg qg4 = C3422fh.d;
                if (qg4 == null) {
                    Intrinsics.i("prefDao");
                    throw null;
                }
                qg4.a.a("saved_signals");
                C3422fh.a.getClass();
                C3422fh.e.a();
                Xb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                joa joaVar = AbstractC3286aa.a;
                AbstractC3286aa.a(new Q2(e));
            }
            try {
                qg = C3422fh.d;
            } catch (Exception unused) {
                Qg qg5 = C3422fh.d;
                if (qg5 == null) {
                    Intrinsics.i("prefDao");
                    throw null;
                }
                qg5.a.a("imp_depth");
            }
        } catch (Exception e2) {
            Xb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            joa joaVar2 = AbstractC3286aa.a;
            AbstractC3776t9.a(e2);
        }
        if (qg == null) {
            Intrinsics.i("prefDao");
            throw null;
        }
        String a2 = qg.a("imp_depth");
        if (a2 != null) {
            JSONObject jSONObject3 = new JSONObject(a2);
            Iterator<String> keys2 = jSONObject3.keys();
            keys2.getClass();
            Iterator it2 = i5h.q(i5h.h(e5h.b(keys2), new pcl(26))).iterator();
            while (it2.hasNext()) {
                jSONObject3.remove((String) it2.next());
            }
            Qg qg6 = C3422fh.d;
            if (qg6 == null) {
                Intrinsics.i("prefDao");
                throw null;
            }
            String jSONObject4 = jSONObject3.toString();
            jSONObject4.getClass();
            Qa qa = qg6.a;
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa.a("imp_depth", jSONObject4, false);
        }
        C3422fh.a.getClass();
        M1 m1 = C3422fh.e;
        m1.c = m1.a.invoke();
        M1 m12 = C3422fh.f;
        m12.c = m12.a.invoke();
        C3422fh.a.getClass();
        M1 m13 = C3422fh.e;
        m13.c = m13.a.invoke();
        M1 m14 = C3422fh.f;
        m14.c = m14.a.invoke();
        return Unit.a;
    }
}
