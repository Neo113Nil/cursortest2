package rl0;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import ru.rustore.sdk.appupdate.model.InstallState;
import sl0.InterfaceC9702a;

/* loaded from: classes8.dex */
public final class g0 extends AbstractC7737t implements Function1<InstallState, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C9291b f83682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C9291b c9291b) {
        super(1);
        this.f83682b = c9291b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InstallState installState) {
        InstallState installState2 = installState;
        Intrinsics.checkNotNullParameter(installState2, "installState");
        C9291b c9291b = this.f83682b;
        AppUpdateOptions appUpdateOptions = c9291b.f83669d;
        if (appUpdateOptions != null) {
            int appUpdateType = appUpdateOptions.getAppUpdateType();
            int installStatus = installState2.getInstallStatus();
            C9300k c9300k = c9291b.f83668c;
            if (installStatus == 1) {
                c9300k.getClass();
                C9296g source = new C9296g(c9300k, new C9313y("updateStart.downloaded", c9300k.a(appUpdateType)));
                Intrinsics.checkNotNullParameter(source, "source");
                lm0.i iVar = new lm0.i(source);
                int i11 = jm0.e.f70218e;
                lm0.q.a(lm0.t.a(iVar, jm0.e.c()), jm0.j.a(), C9299j.f83685b);
            } else if (installStatus == 3) {
                c9300k.b(appUpdateType, String.valueOf(installState2.getInstallErrorCode()));
            }
        }
        if (installState2.getInstallStatus() == 3) {
            c9291b.f83669d = null;
        }
        Iterator<InterfaceC9702a> it = c9291b.f83667b.iterator();
        while (it.hasNext()) {
            it.next().a(installState2);
        }
        return Unit.f71690a;
    }
}
