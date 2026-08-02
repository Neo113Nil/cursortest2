package com.inmobi.media;

import defpackage.fc6;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.mz1;
import defpackage.ok3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.w2g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3493ia extends hoi implements Function1 {
    public final /* synthetic */ C3518ja a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3493ia(C3518ja c3518ja, long j, String str, int i, String str2, rq3 rq3Var) {
        super(1, rq3Var);
        this.a = c3518ja;
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3493ia(this.a, this.b, this.c, this.d, this.e, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3493ia) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        ArrayList u = fc6.u(obj);
        CopyOnWriteArrayList copyOnWriteArrayList = B9.a;
        ArrayList arrayList = new ArrayList();
        C3441ga c3441ga = new C3441ga();
        ArrayList arrayList2 = new ArrayList();
        ok3.J(new C3415fa(c3441ga, arrayList2, null));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3622na((C3467ha) it.next()));
        }
        u.addAll(arrayList);
        Iterator it2 = u.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next = it2.next();
            next.getClass();
            C3518ja c3518ja = this.a;
            long j = this.b;
            C3622na c3622na = (C3622na) ((InterfaceC3544ka) next);
            long j2 = c3622na.a.c.b;
            if (j >= j2 && j - j2 <= c3518ja.a) {
                String str = this.c;
                int i = this.d;
                String str2 = this.e;
                StringBuilder q = mz1.q(i, "Message - ", str, ", Reason - ", ", Timestamp - ");
                q.append(j);
                q.append(", Data - ");
                q.append(str2);
                c3622na.a(q.toString());
                c3622na.b(String.valueOf(i));
                Throwable a = w2g.a(c3622na.b());
                if (a != null) {
                    try {
                        AbstractC3286aa.a(new Q2(a));
                        Throwable a2 = w2g.a(c3622na.a());
                        if (a2 != null) {
                            try {
                                AbstractC3286aa.a(new Q2(a2));
                                Unit unit = Unit.a;
                            } catch (Throwable unused) {
                                p2g p2gVar = w2g.b;
                            }
                        }
                    } catch (Throwable unused2) {
                        p2g p2gVar2 = w2g.b;
                    }
                }
            }
        }
        return Unit.a;
    }
}
