package Oa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // Oa.f
    public final void p0(String str, Bundle bundle, h hVar) {
        Parcel c10 = c();
        c10.writeString(str);
        c.c(c10, bundle);
        c.d(c10, hVar);
        g(2, c10);
    }
}
