package zone.bi.mobile.fingerprint.impl.cs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import k5.L2;
import k5.R2;
import zone.bi.mobile.fingerprint.impl.cs.a;

/* loaded from: classes4.dex */
public class FpWorkerService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final a.AbstractBinderC2359a f109324a = new a();

    final class a extends a.AbstractBinderC2359a {
        a() {
            attachInterface(this, "zone.bi.mobile.fingerprint.impl.cs.IFpWorkerService");
        }

        @Override // zone.bi.mobile.fingerprint.impl.cs.a
        public final int b() {
            R2 a11 = L2.a();
            if (!a11.a()) {
                a11.c(FpWorkerService.this.getApplicationContext());
            }
            if (a11.a()) {
                return a11.b().a();
            }
            return -1;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f109324a;
    }
}
