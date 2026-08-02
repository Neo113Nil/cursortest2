package cd;

import android.content.Context;
import eg.z;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.sentry.hints.j f3758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(io.sentry.hints.j jVar, String str, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3757b = i5;
        this.f3758c = jVar;
        this.f3759d = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3757b) {
            case 0:
                return new c(this.f3758c, this.f3759d, continuation, 0);
            case 1:
                return new c(this.f3758c, this.f3759d, continuation, 1);
            case 2:
                return new c(this.f3758c, this.f3759d, continuation, 2);
            default:
                return new c(this.f3758c, this.f3759d, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3757b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3757b;
        String nameEvent = this.f3759d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                za.e v5 = io.sentry.hints.j.v();
                v5.getClass();
                Intrinsics.checkNotNullParameter(nameEvent, "nameEvent");
                bc.a a7 = za.e.a();
                Context context = v5.f25898a;
                a7.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(nameEvent, "nameEvent");
                f0 valueParams = n0.c();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(nameEvent, "nameEvent");
                Intrinsics.checkNotNullParameter(valueParams, "valueParams");
                bc.a.a().logEvent(context, nameEvent, valueParams);
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                io.sentry.hints.j.v().getClass();
                za.e.a().getClass();
                bc.a.a().setAndroidIdData(nameEvent);
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                io.sentry.hints.j.v().getClass();
                bc.a a10 = za.e.a();
                if (nameEvent != null) {
                    a10.getClass();
                    bc.a.a().setUserEmails(nameEvent);
                } else {
                    a10.getClass();
                }
                break;
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                za.e v10 = io.sentry.hints.j.v();
                v10.getClass();
                Intrinsics.checkNotNullParameter(nameEvent, "token");
                bc.a a11 = za.e.a();
                Context applicationContext = v10.f25898a.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                a11.getClass();
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Intrinsics.checkNotNullParameter(nameEvent, "token");
                bc.a.a().updateServerUninstallToken(applicationContext, nameEvent);
                break;
        }
        return Unit.f19194a;
    }
}
