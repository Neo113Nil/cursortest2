package me;

import com.sports.insider.MyApp;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements vf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20665a;

    public /* synthetic */ o(int i5) {
        this.f20665a = i5;
    }

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i5 = this.f20665a;
        int intValue = ((Integer) obj).intValue();
        String str = (String) obj2;
        Exception ex = (Exception) obj3;
        switch (i5) {
            case 0:
                if (intValue >= 0) {
                    new cd.d().c("navigate_tg_bot", null);
                }
                if (ex != null) {
                    io.sentry.e eVar = new io.sentry.e(intValue + " payload " + str);
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar = MyApp.f6830c;
                    lg.e eVar2 = m0.f9201a;
                    eg.c0.t(dVar, lg.d.f20063c, null, new ge.f((Object) ex, (Comparable) eVar, "openTelegramBot", (Continuation) null, 18), 2);
                }
                break;
            case 1:
                if (intValue >= 0) {
                    new cd.d().c("navigate_tg_bot", null);
                }
                if (ex != null) {
                    io.sentry.e eVar3 = new io.sentry.e(intValue + " payload " + str);
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar2 = MyApp.f6830c;
                    lg.e eVar4 = m0.f9201a;
                    eg.c0.t(dVar2, lg.d.f20063c, null, new ge.f((Object) ex, (Comparable) eVar3, "openTelegramBot", (Continuation) null, 18), 2);
                }
                break;
            default:
                if (intValue >= 0) {
                    new cd.d().c("navigate_tg_bot", null);
                }
                if (ex != null) {
                    io.sentry.e eVar5 = new io.sentry.e(intValue + " payload " + str);
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar3 = MyApp.f6830c;
                    lg.e eVar6 = m0.f9201a;
                    eg.c0.t(dVar3, lg.d.f20063c, null, new ge.f((Object) ex, (Comparable) eVar5, "openTelegramBot", (Continuation) null, 18), 2);
                }
                break;
        }
        return Unit.f19194a;
    }
}
