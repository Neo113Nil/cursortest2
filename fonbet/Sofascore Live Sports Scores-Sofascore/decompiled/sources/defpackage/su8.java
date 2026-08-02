package defpackage;

import android.content.Context;
import android.os.Build;
import com.sofascore.localPersistence.database.AppDatabase;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.service.game.SyncEventsWorker;
import com.sofascore.results.service.game.SyncMutedEventsWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class su8 {
    public static final qa6 a;

    static {
        ia0 ia0Var = ia0.q;
        lzf lzfVar = (lzf) fz8.Q(lzf.class, ok3.p());
        lzfVar.getClass();
        a = new qa6(((AppDatabase) ((mc4) lzfVar).z.get()).e());
    }

    public static final void a(Context context, Event event) {
        context.getClass();
        f5p.E(context, new yp7(event, (rq3) null, 12));
    }

    public static final void b(Context context, Event event) {
        context.getClass();
        f5p.E(context, new yp7(event, context, (rq3) null, 13));
    }

    public static void c(Context context) {
        ad2 ad2Var = qv5.a;
        qv5.a(a52.a);
        qv5.a(new c52());
        context.getClass();
        aba.E(context);
    }

    public static void d(Context context) {
        context.getClass();
        ktd A = mha.A(new ktd(SyncEventsWorker.class));
        mha.y(A);
        if (Build.VERSION.SDK_INT >= 31) {
            pwd pwdVar = pwd.a;
            A.e();
        }
        vxd.h(context).b("SyncEventsWorker-".concat(""), nf6.a, (ltd) A.a());
    }

    public static void e(Context context) {
        context.getClass();
        ktd A = mha.A(new ktd(SyncMutedEventsWorker.class));
        mha.y(A);
        if (Build.VERSION.SDK_INT >= 31) {
            pwd pwdVar = pwd.a;
            A.e();
        }
        vxd.h(context).b("SyncMutedEventsWorker-".concat(""), nf6.a, (ltd) A.a());
    }
}
