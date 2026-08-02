package Qa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class u extends AbstractC1511a implements w {
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Qa.w
    public final void A0(Bundle bundle, y yVar) {
        Parcel c10 = c();
        q.c(c10, bundle);
        c10.writeStrongBinder(yVar);
        g(3, c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Qa.w
    public final void b(Bundle bundle, F f10) {
        Parcel c10 = c();
        q.c(c10, bundle);
        c10.writeStrongBinder(f10);
        g(6, c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Qa.w
    public final void u(Bundle bundle, y yVar) {
        Parcel c10 = c();
        q.c(c10, bundle);
        c10.writeStrongBinder(yVar);
        g(2, c10);
    }
}
