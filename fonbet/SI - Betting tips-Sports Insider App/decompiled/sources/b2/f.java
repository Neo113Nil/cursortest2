package b2;

import android.os.Bundle;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import y1.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2973e;

    public /* synthetic */ f(int i5, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f2969a = i5;
        this.f2970b = obj;
        this.f2971c = obj2;
        this.f2972d = obj3;
        this.f2973e = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f2969a) {
            case 0:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.f2970b;
                j jVar = (j) this.f2971c;
                b0 b0Var = (b0) this.f2972d;
                Bundle bundle = (Bundle) this.f2973e;
                y1.l it = (y1.l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                booleanRef.element = true;
                jVar.a(b0Var, bundle, it, e0.f19204a);
                return Unit.f19194a;
            case 1:
                Integer num = (Integer) this.f2970b;
                Integer num2 = (Integer) this.f2971c;
                Integer num3 = (Integer) this.f2972d;
                Integer num4 = (Integer) this.f2973e;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("\n        UPDATE account_table \n        SET endTimeLive = ?, endTimePremium = ?, \n            endTimeExpress = ?, endTimeDiamond = ?\n        WHERE idUser =='user'");
                try {
                    r02.f(1, num.intValue());
                    r02.f(2, num2.intValue());
                    r02.f(3, num3.intValue());
                    r02.f(4, num4.intValue());
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } finally {
                    r02.close();
                }
            case 2:
                String str = (String) this.f2970b;
                String str2 = (String) this.f2971c;
                String str3 = (String) this.f2972d;
                String str4 = (String) this.f2973e;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("\n        UPDATE account_table SET name = ?, surname = ?, avatar = ?, email = ?\n        WHERE idUser =='user'");
                try {
                    if (str == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str);
                    }
                    if (str2 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str2);
                    }
                    if (str3 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str3);
                    }
                    if (str4 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str4);
                    }
                    r02.n0();
                    int q3 = io.sentry.config.a.q(_connection2);
                    r02.close();
                    return Integer.valueOf(q3);
                } catch (Throwable th2) {
                    throw th2;
                }
            default:
                y8.g gVar = (y8.g) this.f2970b;
                String str5 = (String) this.f2971c;
                String str6 = (String) this.f2972d;
                g1.c key = (g1.c) this.f2973e;
                g1.a aVar = (g1.a) obj;
                gVar.getClass();
                g1.c key2 = y8.g.f25733d;
                if (((String) m4.g.m(aVar, key2, "")).equals(str5)) {
                    g1.c e7 = gVar.e(aVar, str5);
                    if (e7 == null || e7.f9707a.equals(str6)) {
                        return null;
                    }
                    synchronized (gVar) {
                        gVar.h(aVar, str5);
                        HashSet hashSet = new HashSet((Collection) m4.g.m(aVar, key, new HashSet()));
                        hashSet.add(str5);
                        Intrinsics.checkNotNullParameter(key, "key");
                        aVar.f(key, hashSet);
                    }
                    return null;
                }
                g1.c key3 = y8.g.f25732c;
                long longValue = ((Long) m4.g.m(aVar, key3, 0L)).longValue();
                if (longValue + 1 == 30) {
                    longValue = gVar.a(aVar);
                }
                HashSet hashSet2 = new HashSet((Collection) m4.g.m(aVar, key, new HashSet()));
                hashSet2.add(str5);
                Intrinsics.checkNotNullParameter(key, "key");
                aVar.f(key, hashSet2);
                Long valueOf = Long.valueOf(longValue + 1);
                Intrinsics.checkNotNullParameter(key3, "key");
                aVar.f(key3, valueOf);
                Intrinsics.checkNotNullParameter(key2, "key");
                aVar.f(key2, str5);
                return null;
        }
    }
}
