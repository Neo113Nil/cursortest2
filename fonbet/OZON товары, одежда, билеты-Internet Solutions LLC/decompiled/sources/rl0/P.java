package rl0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.F;
import rl0.M;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import zl0.C11151b;

/* loaded from: classes4.dex */
public final class P implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f83628a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f83629b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final h0 f83630c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final nm0.w f83631d;

    public static final class a extends M.a {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ P f83633f;

        public a(P p11) {
            this.f83633f = p11;
        }

        @Override // rl0.M
        public final void C(int i11, String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            P p11 = P.this;
            nm0.w wVar = p11.f83631d;
            wl0.c error = RemoteProviderErrors.INSTANCE.toRuStoreException(i11, errorMessage);
            Intrinsics.checkNotNullParameter(error, "error");
            ((lm0.e) wVar.f77427c).a(error);
            Unit unit = Unit.f71690a;
            C11151b.b(p11.f83628a, this.f83633f);
        }

        @Override // rl0.M
        public final void a() {
            P p11 = P.this;
            p11.f83630c.f83684b.b(Unit.f71690a);
            C11151b.b(p11.f83628a, this.f83633f);
        }
    }

    public P(@NotNull Context context, @NotNull String applicationId, @NotNull h0 onSuccess, @NotNull nm0.w onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f83628a = context;
        this.f83629b = applicationId;
        this.f83630c = onSuccess;
        this.f83631d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            F.a.H(service).D(this.f83629b, new a(this));
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            wl0.c error = new wl0.c(message);
            Intrinsics.checkNotNullParameter(error, "error");
            ((lm0.e) this.f83631d.f77427c).a(error);
            Unit unit = Unit.f71690a;
            C11151b.b(this.f83628a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        wl0.c error = new wl0.c("onServiceDisconnected");
        Intrinsics.checkNotNullParameter(error, "error");
        ((lm0.e) this.f83631d.f77427c).a(error);
        Unit unit = Unit.f71690a;
        C11151b.b(this.f83628a, this);
    }
}
