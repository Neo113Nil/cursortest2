package rl0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.F;
import zl0.C11151b;

/* loaded from: classes4.dex */
public final class S implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f83636a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f83637b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final nm0.f f83638c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final d0 f83639d;

    public static final class a extends O {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ S f83641f;

        public a(S s11) {
            this.f83641f = s11;
            attachInterface(this, "ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
        }
    }

    public S(@NotNull Context context, @NotNull String applicationId, @NotNull nm0.f onSuccess, @NotNull d0 onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f83636a = context;
        this.f83637b = applicationId;
        this.f83638c = onSuccess;
        this.f83639d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            F.a.H(service).i(this.f83637b, new a(this));
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            wl0.c error = new wl0.c(message);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f83639d.f83675b.a(error);
            Unit unit = Unit.f71690a;
            C11151b.b(this.f83636a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        wl0.c error = new wl0.c("onServiceDisconnected");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f83639d.f83675b.a(error);
        Unit unit = Unit.f71690a;
        C11151b.b(this.f83636a, this);
    }
}
