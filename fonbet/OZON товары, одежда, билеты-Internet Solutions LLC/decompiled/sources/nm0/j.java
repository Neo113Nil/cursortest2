package nm0;

import Ve.Xn;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.Intrinsics;
import nm0.InterfaceC8608C;
import ru.rustore.sdk.review.model.ReviewInfo;
import zl0.C11151b;

/* loaded from: classes4.dex */
public final class j implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f77401a;

    /* renamed from: b, reason: collision with root package name */
    public final ReviewInfo f77402b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77403c;

    /* renamed from: d, reason: collision with root package name */
    public final Xn f77404d;

    /* renamed from: e, reason: collision with root package name */
    public final w f77405e;

    public static final class a extends k {
        public a() {
            attachInterface(this, "ru.vk.store.provider.review.LaunchReviewFlowCallback");
        }
    }

    public j(Context context, ReviewInfo reviewInfo, String applicationId, Xn onSuccess, w onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.f77401a = context;
        this.f77402b = reviewInfo;
        this.f77403c = applicationId;
        this.f77404d = onSuccess;
        this.f77405e = onError;
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
            c1301a.A(this.f77402b.toBundle$sdk_public_review_release(), this.f77403c, new a());
        } catch (Exception e11) {
            w wVar = this.f77405e;
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            wVar.invoke(new wl0.c(message));
            C11151b.b(this.f77401a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f77405e.invoke(new wl0.c("onServiceDisconnected"));
        C11151b.b(this.f77401a, this);
    }
}
