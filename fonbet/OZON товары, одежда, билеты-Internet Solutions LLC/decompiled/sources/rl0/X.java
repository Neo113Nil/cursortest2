package rl0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.F;
import ru.rustore.sdk.appupdate.model.AppUpdateParams;
import ru.rustore.sdk.appupdate.model.AppUpdateParamsKt;
import zl0.C11151b;

/* loaded from: classes8.dex */
public final class X implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f83648a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Q f83649b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f83650c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final AppUpdateParams f83651d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final C9290a f83652e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final C9292c f83653f;

    /* loaded from: classes4.dex */
    public static final class a extends V {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ X f83655f;

        public a(X x11) {
            this.f83655f = x11;
            attachInterface(this, "ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
        }
    }

    public X(@NotNull Context context, @NotNull Q appUpdateInfoMapper, @NotNull String applicationId, @NotNull AppUpdateParams appUpdateParams, @NotNull C9290a onSuccess, @NotNull C9292c onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appUpdateInfoMapper, "appUpdateInfoMapper");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(appUpdateParams, "appUpdateParams");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f83648a = context;
        this.f83649b = appUpdateInfoMapper;
        this.f83650c = applicationId;
        this.f83651d = appUpdateParams;
        this.f83652e = onSuccess;
        this.f83653f = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            F.a.H(service).n(this.f83650c, AppUpdateParamsKt.toBundle(this.f83651d), new a(this));
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            wl0.c error = new wl0.c(message);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f83653f.f83671b.a(error);
            Unit unit = Unit.f71690a;
            C11151b.b(this.f83648a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        wl0.c error = new wl0.c("onServiceDisconnected");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f83653f.f83671b.a(error);
        Unit unit = Unit.f71690a;
        C11151b.b(this.f83648a, this);
    }
}
