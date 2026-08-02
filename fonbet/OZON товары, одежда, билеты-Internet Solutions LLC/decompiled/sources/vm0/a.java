package vm0;

import E0.U0;
import Sc.InterfaceC4008j;
import Sc.k;
import Ve.C4444mf;
import Ve.Je;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pm0.C8943b;
import qm0.C9085a;
import rm0.C9316a;
import rm0.C9318c;
import sm0.C9704a;
import tm0.d;
import um0.e;
import um0.f;
import zm0.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<zm0.a> f103022a = k.b(C2236a.f103026b);

    /* renamed from: b, reason: collision with root package name */
    private static d f103023b;

    /* renamed from: c, reason: collision with root package name */
    private static um0.d f103024c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f103025d = 0;

    /* renamed from: vm0.a$a, reason: collision with other inner class name */
    static final class C2236a extends AbstractC7737t implements Function0<zm0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2236a f103026b = new C2236a(0);

        @Override // kotlin.jvm.functions.Function0
        public final zm0.a invoke() {
            int i11 = a.f103025d;
            HandlerThread handlerThread = new HandlerThread("Timer thread");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "timerThread.looper");
            return new b(looper);
        }
    }

    @NotNull
    public static C9316a a(@NotNull Context context, @NotNull C4444mf networkClientBuilder, @NotNull C9085a settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkClientBuilder, "networkClientBuilder");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Context appContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        C9318c c9318c = new C9318c(settings, f103022a.getValue());
        xm0.b bVar = new xm0.b(settings, new Je(networkClientBuilder.f31588a));
        tm0.b bVar2 = new tm0.b(appContext, settings);
        if (f103024c == null) {
            f103024c = new um0.d(appContext, new um0.b());
        }
        um0.d dVar = f103024c;
        Intrinsics.g(dVar, "null cannot be cast to non-null type ru.sber.platform.clickstream.clickstreamlite.internal.data.providers.helpers.DeviceIdProvider");
        if (f103024c == null) {
            f103024c = new um0.d(appContext, new um0.b());
        }
        um0.d dVar2 = f103024c;
        Intrinsics.g(dVar2, "null cannot be cast to non-null type ru.sber.platform.clickstream.clickstreamlite.internal.data.providers.helpers.DeviceIdProvider");
        d dVar3 = new d(appContext, dVar, new f(dVar2));
        f103023b = dVar3;
        return new C9316a(new C8943b(c9318c, bVar, new sm0.b(bVar2, dVar3)), new C9704a(new tm0.a(appContext, new um0.a(appContext), new U0(), new e(appContext, settings))));
    }

    public static d b() {
        return f103023b;
    }
}
