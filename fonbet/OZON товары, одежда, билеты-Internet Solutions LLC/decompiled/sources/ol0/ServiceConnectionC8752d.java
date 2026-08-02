package ol0;

import Gm0.a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ol0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ServiceConnectionC8752d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78429a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f78430b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f78431c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f78432d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<wl0.c, Unit> f78433e;

    /* renamed from: ol0.d$a */
    public static final class a extends Gm0.b {
        a() {
            attachInterface(this, "ru.vk.store.provider.analytics.AnalyticsProviderCallback");
        }

        public final void H(String str) {
            Function1 function1 = ServiceConnectionC8752d.this.f78433e;
            if (str == null) {
                str = "";
            }
            ((C8750b) function1).invoke(new wl0.c(str));
        }

        public final void I() {
            ((C8749a) ServiceConnectionC8752d.this.f78432d).invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceConnectionC8752d(@NotNull String applicationId, @NotNull String eventName, @NotNull Map<String, String> eventData, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super wl0.c, Unit> onError) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f78429a = applicationId;
        this.f78430b = eventName;
        this.f78431c = eventData;
        this.f78432d = onSuccess;
        this.f78433e = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            a.AbstractBinderC0211a.H(iBinder).y(this.f78429a, this.f78430b, C8753e.a(this.f78431c), new a());
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            ((C8750b) this.f78433e).invoke(new wl0.c(message));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f78433e.invoke(new wl0.c("onServiceDisconnected"));
    }
}
