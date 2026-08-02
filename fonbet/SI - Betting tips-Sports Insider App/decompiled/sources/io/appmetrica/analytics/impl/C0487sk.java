package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487sk implements Ic {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        Y6 y62;
        C0462rk c0462rk = new C0462rk();
        C0438qk c0438qk = new C0438qk();
        C0239in c0239in = new C0239in(c0438qk, c0438qk, new C0403pa(false), new ap(6));
        C0637yk B = C0353na.I.B();
        synchronized (B) {
            C0017a7 c0017a7 = B.f14961a;
            y62 = new Y6(context, new Z6(c0017a7.f13348a, c0017a7.f13349b, false).a(context, c0462rk), c0239in, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new S2(new C0439ql(y62), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C0353na.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(@NotNull Context context) {
        Rm rm = (Rm) Pm.a(C0264jm.class);
        ProtobufStateStorage<Object> a7 = rm.a(context, rm.b(context));
        C0264jm c0264jm = (C0264jm) a7.read();
        C0238im a10 = c0264jm.a(c0264jm.f14067m);
        a10.f13969o = 0L;
        a7.save(new C0264jm(a10));
        b(context);
    }
}
