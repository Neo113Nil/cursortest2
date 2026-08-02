package nm0;

import Ve.Dr;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.Intrinsics;
import nm0.InterfaceC8608C;
import zl0.C11151b;

/* loaded from: classes4.dex */
public final class o implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f77410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77411b;

    /* renamed from: c, reason: collision with root package name */
    public final z f77412c;

    /* renamed from: d, reason: collision with root package name */
    public final Dr f77413d;

    public static final class a extends n {
        public a() {
            attachInterface(this, "ru.vk.store.provider.review.RequestReviewFlowCallback");
        }
    }

    public o(Context context, String applicationId, z onSuccess, Dr onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f77410a = context;
        this.f77411b = applicationId;
        this.f77412c = onSuccess;
        this.f77413d = onError;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC8608C c1301a;
        try {
            int i11 = InterfaceC8608C.a.f77382e;
            if (iBinder == null) {
                c1301a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c1301a = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC8608C)) ? new InterfaceC8608C.a.C1301a(iBinder) : (InterfaceC8608C) queryLocalInterface;
            }
            c1301a.v(this.f77411b, new a());
        } catch (Exception e11) {
            Dr dr = this.f77413d;
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            dr.invoke(new wl0.c(message));
            C11151b.b(this.f77410a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f77413d.invoke(new wl0.c("onServiceDisconnected"));
        C11151b.b(this.f77410a, this);
    }
}
