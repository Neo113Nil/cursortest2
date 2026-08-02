package rl0;

import Ve.C4740wn;
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
public final class J implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f83618a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f83619b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C4740wn f83620c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final C9311w f83621d;

    public static final class a extends M.a {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ J f83623f;

        public a(J j11) {
            this.f83623f = j11;
        }

        @Override // rl0.M
        public final void C(int i11, String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            J j11 = J.this;
            C9311w c9311w = j11.f83621d;
            wl0.c error = RemoteProviderErrors.INSTANCE.toRuStoreException(i11, errorMessage);
            Intrinsics.checkNotNullParameter(error, "error");
            c9311w.f83719b.a(error);
            Unit unit = Unit.f71690a;
            C11151b.b(j11.f83618a, this.f83623f);
        }

        @Override // rl0.M
        public final void a() {
            J j11 = J.this;
            ((lm0.e) j11.f83620c.f32386c).b(Unit.f71690a);
            C11151b.b(j11.f83618a, this.f83623f);
        }
    }

    public J(@NotNull Context context, @NotNull String applicationId, @NotNull C4740wn onSuccess, @NotNull C9311w onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f83618a = context;
        this.f83619b = applicationId;
        this.f83620c = onSuccess;
        this.f83621d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            F.a.H(service).r(this.f83619b, new a(this));
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            wl0.c error = new wl0.c(message);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f83621d.f83719b.a(error);
            Unit unit = Unit.f71690a;
            C11151b.b(this.f83618a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        wl0.c error = new wl0.c("onServiceDisconnected");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f83621d.f83719b.a(error);
        Unit unit = Unit.f71690a;
        C11151b.b(this.f83618a, this);
    }
}
