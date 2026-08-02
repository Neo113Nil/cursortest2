package bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final g f25494c = new g();

    /* renamed from: a, reason: collision with root package name */
    public final Context f25495a;

    /* renamed from: b, reason: collision with root package name */
    public final p9 f25496b;

    public h(Context context, p9 admRegistrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(admRegistrationDataProvider, "admRegistrationDataProvider");
        this.f25495a = context;
        this.f25496b = admRegistrationDataProvider;
    }

    public static final String b() {
        return "Registering with ADM server...";
    }

    public final void a() {
        if (((tc) this.f25496b).b() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.M2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.h.a(bo.app.h.this);
                }
            }, 6, (Object) null);
            tc tcVar = (tc) this.f25496b;
            tcVar.a(tcVar.b());
        } else {
            ADM adm = new ADM(this.f25495a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.N2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.h.b();
                    }
                }, 6, (Object) null);
                adm.startRegister();
            }
        }
    }

    public static final String a(h hVar) {
        return "The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: " + ((tc) hVar.f25496b).b();
    }
}
