package la;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19437b = i5;
        this.f19438c = obj;
        this.f19439d = obj2;
        this.f19440e = obj3;
        this.f19441f = obj4;
        this.f19442g = obj5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19437b) {
            case 0:
                return new d1((Integer) this.f19438c, (Integer) this.f19439d, (Integer) this.f19440e, (Integer) this.f19441f, (e1) this.f19442g, continuation, 0);
            case 1:
                return new d1((le.h) this.f19438c, (ic.n) this.f19439d, (ic.n) this.f19440e, (String) this.f19441f, (String) this.f19442g, continuation, 1);
            case 2:
                return new d1((bb.b) this.f19438c, (String) this.f19439d, (String) this.f19440e, (String) this.f19441f, (String) this.f19442g, continuation, 2);
            default:
                return new d1((pc.u) this.f19438c, (Activity) this.f19439d, (com.android.billingclient.api.q) this.f19440e, (String) this.f19441f, (String) this.f19442g, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19437b) {
        }
        return ((d1) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019c  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        l1.a aVar;
        com.android.billingclient.api.d dVar;
        ArrayList arrayList;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str2;
        Object obj6;
        com.android.billingclient.api.d dVar2 = null;
        final int i5 = 1;
        final int i10 = 0;
        switch (this.f19437b) {
            case 0:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                Integer num = (Integer) this.f19438c;
                if (num != null) {
                    final Integer num2 = new Integer(num.intValue());
                    final int i11 = 3;
                    ((Number) f3.x.n0(((sb.j) y3.m(sb.j.class, null, 6)).f23426a.f23832a, false, true, new Function1() { // from class: tb.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            s2.c r02;
                            int q;
                            switch (i11) {
                                case 0:
                                    Integer num3 = num2;
                                    s2.a _connection = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection, "_connection");
                                    r02 = _connection.r0("UPDATE account_table SET endTimeDiamond = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num3.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                case 1:
                                    Integer num4 = num2;
                                    s2.a _connection2 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection2, "_connection");
                                    r02 = _connection2.r0("UPDATE account_table SET endTimePremium = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num4.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection2);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                case 2:
                                    Integer num5 = num2;
                                    s2.a _connection3 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection3, "_connection");
                                    r02 = _connection3.r0("UPDATE account_table SET endTimeExpress = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num5.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection3);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                default:
                                    Integer num6 = num2;
                                    s2.a _connection4 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection4, "_connection");
                                    r02 = _connection4.r0("UPDATE account_table SET endTimeLive = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num6.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection4);
                                        break;
                                    } finally {
                                    }
                            }
                            return Integer.valueOf(q);
                        }
                    })).intValue();
                }
                Integer num3 = (Integer) this.f19439d;
                if (num3 != null) {
                    final Integer num4 = new Integer(num3.intValue());
                    ((Number) f3.x.n0(((sb.j) y3.m(sb.j.class, null, 6)).f23426a.f23832a, false, true, new Function1() { // from class: tb.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            s2.c r02;
                            int q;
                            switch (i5) {
                                case 0:
                                    Integer num32 = num4;
                                    s2.a _connection = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection, "_connection");
                                    r02 = _connection.r0("UPDATE account_table SET endTimeDiamond = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num32.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                case 1:
                                    Integer num42 = num4;
                                    s2.a _connection2 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection2, "_connection");
                                    r02 = _connection2.r0("UPDATE account_table SET endTimePremium = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num42.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection2);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                case 2:
                                    Integer num5 = num4;
                                    s2.a _connection3 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection3, "_connection");
                                    r02 = _connection3.r0("UPDATE account_table SET endTimeExpress = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num5.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection3);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                default:
                                    Integer num6 = num4;
                                    s2.a _connection4 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection4, "_connection");
                                    r02 = _connection4.r0("UPDATE account_table SET endTimeLive = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num6.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection4);
                                        break;
                                    } finally {
                                    }
                            }
                            return Integer.valueOf(q);
                        }
                    })).intValue();
                }
                Integer num5 = (Integer) this.f19440e;
                if (num5 != null) {
                    final Integer num6 = new Integer(num5.intValue());
                    final int i12 = 2;
                    ((Number) f3.x.n0(((sb.j) y3.m(sb.j.class, null, 6)).f23426a.f23832a, false, true, new Function1() { // from class: tb.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            s2.c r02;
                            int q;
                            switch (i12) {
                                case 0:
                                    Integer num32 = num6;
                                    s2.a _connection = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection, "_connection");
                                    r02 = _connection.r0("UPDATE account_table SET endTimeDiamond = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num32.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                case 1:
                                    Integer num42 = num6;
                                    s2.a _connection2 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection2, "_connection");
                                    r02 = _connection2.r0("UPDATE account_table SET endTimePremium = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num42.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection2);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                case 2:
                                    Integer num52 = num6;
                                    s2.a _connection3 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection3, "_connection");
                                    r02 = _connection3.r0("UPDATE account_table SET endTimeExpress = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num52.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection3);
                                        r02.close();
                                        break;
                                    } finally {
                                    }
                                default:
                                    Integer num62 = num6;
                                    s2.a _connection4 = (s2.a) obj7;
                                    Intrinsics.checkNotNullParameter(_connection4, "_connection");
                                    r02 = _connection4.r0("UPDATE account_table SET endTimeLive = ? WHERE idUser =='user'");
                                    try {
                                        r02.f(1, num62.intValue());
                                        r02.n0();
                                        q = io.sentry.config.a.q(_connection4);
                                        break;
                                    } finally {
                                    }
                            }
                            return Integer.valueOf(q);
                        }
                    })).intValue();
                }
                Integer num7 = (Integer) this.f19441f;
                if (num7 == null) {
                    return null;
                }
                final Integer num8 = new Integer(num7.intValue());
                ((Number) f3.x.n0(((sb.j) y3.m(sb.j.class, null, 6)).f23426a.f23832a, false, true, new Function1() { // from class: tb.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        s2.c r02;
                        int q;
                        switch (i10) {
                            case 0:
                                Integer num32 = num8;
                                s2.a _connection = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection, "_connection");
                                r02 = _connection.r0("UPDATE account_table SET endTimeDiamond = ? WHERE idUser =='user'");
                                try {
                                    r02.f(1, num32.intValue());
                                    r02.n0();
                                    q = io.sentry.config.a.q(_connection);
                                    r02.close();
                                    break;
                                } finally {
                                }
                            case 1:
                                Integer num42 = num8;
                                s2.a _connection2 = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                                r02 = _connection2.r0("UPDATE account_table SET endTimePremium = ? WHERE idUser =='user'");
                                try {
                                    r02.f(1, num42.intValue());
                                    r02.n0();
                                    q = io.sentry.config.a.q(_connection2);
                                    r02.close();
                                    break;
                                } finally {
                                }
                            case 2:
                                Integer num52 = num8;
                                s2.a _connection3 = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                                r02 = _connection3.r0("UPDATE account_table SET endTimeExpress = ? WHERE idUser =='user'");
                                try {
                                    r02.f(1, num52.intValue());
                                    r02.n0();
                                    q = io.sentry.config.a.q(_connection3);
                                    r02.close();
                                    break;
                                } finally {
                                }
                            default:
                                Integer num62 = num8;
                                s2.a _connection4 = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                                r02 = _connection4.r0("UPDATE account_table SET endTimeLive = ? WHERE idUser =='user'");
                                try {
                                    r02.f(1, num62.intValue());
                                    r02.n0();
                                    q = io.sentry.config.a.q(_connection4);
                                    break;
                                } finally {
                                }
                        }
                        return Integer.valueOf(q);
                    }
                })).intValue();
                return Unit.f19194a;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                le.h hVar = (le.h) this.f19438c;
                hVar.f19811v = (ic.n) this.f19439d;
                hVar.f19812w = (ic.n) this.f19440e;
                hVar.f19804n.h(new Pair((String) this.f19441f, (String) this.f19442g));
                return Unit.f19194a;
            case 2:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                return new Integer(((Number) f3.x.n0(f3.x.e0().f23426a.f23832a, false, true, new b2.f(2, (String) this.f19439d, (String) this.f19440e, (String) this.f19441f, (String) this.f19442g))).intValue());
            default:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                yb.i n9 = pc.u.n();
                Activity activity = (Activity) this.f19439d;
                com.android.billingclient.api.q skuDetails = (com.android.billingclient.api.q) this.f19440e;
                String str3 = (String) this.f19441f;
                String str4 = (String) this.f19442g;
                n9.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
                if (Intrinsics.areEqual(skuDetails.f4070d, "subs") && (arrayList = skuDetails.j) != null && !arrayList.isEmpty()) {
                    if (str3 == null || str3.length() == 0) {
                        str3 = null;
                    }
                    if (str4 == null || str4.length() == 0) {
                        str4 = null;
                    }
                    if (str4 == null && str3 == null) {
                        str = yb.i.l(arrayList);
                    } else if (str4 == null && str3 != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj6 = it.next();
                                com.android.billingclient.api.p pVar = (com.android.billingclient.api.p) obj6;
                                if (!Intrinsics.areEqual(pVar.f4062a, str3) || pVar.f4063b != null) {
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        com.android.billingclient.api.p pVar2 = (com.android.billingclient.api.p) obj6;
                        if (pVar2 != null) {
                            str = pVar2.f4064c;
                        }
                    } else if (str4 != null && str3 == null) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj5 = it2.next();
                                if (Intrinsics.areEqual(((com.android.billingclient.api.p) obj5).f4063b, str4)) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        com.android.billingclient.api.p pVar3 = (com.android.billingclient.api.p) obj5;
                        str = (pVar3 == null || (str2 = pVar3.f4064c) == null) ? yb.i.l(arrayList) : str2;
                    } else if (str4 == null || str3 == null) {
                        str = yb.i.l(arrayList);
                    } else {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                com.android.billingclient.api.p pVar4 = (com.android.billingclient.api.p) obj2;
                                if (!Intrinsics.areEqual(pVar4.f4062a, str3) || !Intrinsics.areEqual(pVar4.f4063b, str4)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        com.android.billingclient.api.p pVar5 = (com.android.billingclient.api.p) obj2;
                        if (pVar5 != null) {
                            str = pVar5.f4064c;
                        } else {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj3 = it4.next();
                                    if (Intrinsics.areEqual(((com.android.billingclient.api.p) obj3).f4063b, str4)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            com.android.billingclient.api.p pVar6 = (com.android.billingclient.api.p) obj3;
                            if (pVar6 != null) {
                                str = pVar6.f4064c;
                            } else {
                                Iterator it5 = arrayList.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj4 = it5.next();
                                        com.android.billingclient.api.p pVar7 = (com.android.billingclient.api.p) obj4;
                                        if (!Intrinsics.areEqual(pVar7.f4062a, str3) || pVar7.f4063b != null) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                com.android.billingclient.api.p pVar8 = (com.android.billingclient.api.p) obj4;
                                if (pVar8 != null) {
                                    str = pVar8.f4064c;
                                }
                            }
                        }
                    }
                    aVar = new l1.a(6, false);
                    aVar.f19314b = skuDetails;
                    if (skuDetails.a() != null) {
                        skuDetails.a().getClass();
                        String str5 = skuDetails.a().f4051d;
                        if (str5 != null) {
                            aVar.f19315c = str5;
                        }
                    }
                    if (str != null && str.length() != 0) {
                        if (!TextUtils.isEmpty(str)) {
                            throw new IllegalArgumentException("offerToken can not be empty");
                        }
                        aVar.f19315c = str;
                    }
                    if (((com.android.billingclient.api.q) aVar.f19314b).j == null && ((String) aVar.f19315c) == null) {
                        throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
                    }
                    com.android.billingclient.api.h hVar2 = new com.android.billingclient.api.h(aVar);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "build(...)");
                    dVar = yb.i.f25817e;
                    if (dVar != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                    } else {
                        dVar2 = dVar;
                    }
                    com.android.billingclient.api.g gVar = new com.android.billingclient.api.g();
                    gVar.f4019c = new m3.f(7);
                    gVar.f4017a = new ArrayList(kotlin.collections.t.c(hVar2));
                    dVar2.g(activity, gVar.a());
                    return Unit.f19194a;
                }
                str = null;
                aVar = new l1.a(6, false);
                aVar.f19314b = skuDetails;
                if (skuDetails.a() != null) {
                }
                if (str != null) {
                    if (!TextUtils.isEmpty(str)) {
                    }
                }
                if (((com.android.billingclient.api.q) aVar.f19314b).j == null) {
                }
                com.android.billingclient.api.h hVar22 = new com.android.billingclient.api.h(aVar);
                Intrinsics.checkNotNullExpressionValue(hVar22, "build(...)");
                dVar = yb.i.f25817e;
                if (dVar != null) {
                }
                com.android.billingclient.api.g gVar2 = new com.android.billingclient.api.g();
                gVar2.f4019c = new m3.f(7);
                gVar2.f4017a = new ArrayList(kotlin.collections.t.c(hVar22));
                dVar2.g(activity, gVar2.a());
                return Unit.f19194a;
        }
    }
}
