package Qa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class z extends AbstractC1511a implements B {
    public z(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Qa.B
    public final void b(Bundle bundle, F f10) {
        Parcel c10 = c();
        q.c(c10, bundle);
        c10.writeStrongBinder(f10);
        g(3, c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Qa.B
    public final void w(Bundle bundle, D d10) {
        Parcel c10 = c();
        q.c(c10, bundle);
        c10.writeStrongBinder(d10);
        g(2, c10);
    }
}
