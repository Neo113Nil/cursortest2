package zc;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.ConnectionResult;
import com.sports.insider.MyApp;
import eg.c0;
import eg.z;
import io.sentry.d4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import rc.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f25920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f25921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.f25920b = jVar;
        this.f25921c = objectRef;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f25920b, this.f25921c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Boolean] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        j jVar = this.f25920b;
        lf.a aVar = lf.a.f20034a;
        h8.b.B(obj);
        try {
            za.f a7 = j.a(jVar);
            a7.getClass();
            dc.a a10 = za.f.a();
            Context context = a7.f25899a;
            a10.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            c6.c cVar = c6.c.f3657e;
            Intrinsics.checkNotNullExpressionValue(cVar, "getInstance(...)");
            int b10 = cVar.b(context.getApplicationContext(), c6.d.f3659a);
            za.f a11 = j.a(jVar);
            a11.getClass();
            za.f.a().getClass();
            boolean z5 = b10 == 0 || b10 != 1;
            int i5 = Build.VERSION.SDK_INT;
            if (31 > i5 || i5 >= 33) {
                za.f.a().getClass();
                Intrinsics.checkNotNullExpressionValue(cVar, "getInstance(...)");
                AtomicBoolean atomicBoolean = c6.g.f3661a;
                if (b10 == 1 || b10 == 2 || b10 == 3 || b10 == 9) {
                    dc.a a12 = za.f.a();
                    Context context2 = a11.f25899a;
                    a12.getClass();
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullExpressionValue(cVar, "getInstance(...)");
                    Intent a13 = cVar.a(context2, b10, "n");
                    cVar.f(context2, new ConnectionResult(b10, a13 == null ? null : PendingIntent.getActivity(context2, 0, a13, 201326592), null));
                }
            }
            this.f25921c.element = Boolean.valueOf(z5);
            j.a(jVar).getClass();
            za.f.a().getClass();
            String str = b10 != 0 ? b10 != 1 ? b10 != 2 ? b10 != 3 ? b10 != 9 ? b10 != 18 ? "Unknown." : "Сервис Google Play в настоящее время обновляется на этом устройстве." : "Версия сервисов Google Play, установленная на этом устройстве, не является подлинной." : "Установленная версия сервисов Google Play отключена на этом устройстве." : "Установленная версия сервисов Google Play устарела." : "На этом устройстве отсутствуют сервисы Google Play." : "Сервис GMS доступен.";
            try {
                d4.j("StateMobileService", String.valueOf(b10));
            } catch (Exception unused) {
            }
            c0.t(MyApp.f6830c, b0.b(), null, new cd.j(str, new cd.d(), Boolean.valueOf(z5), b10, (Continuation) null, 0), 2);
        } catch (Exception e7) {
            if (!(e7 instanceof CancellationException)) {
                d.b(4, "isPmsAvailable", e7);
            }
        }
        return Unit.f19194a;
    }
}
