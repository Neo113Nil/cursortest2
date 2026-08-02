package k5;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import k5.InterfaceC7518g2;

/* renamed from: k5.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7562s extends InterfaceC7518g2.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7566t f70856a;

    C7562s(C7566t c7566t) {
        this.f70856a = c7566t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        long j11 = InterfaceC7500c0.f70717a;
        C7566t c7566t = this.f70856a;
        if (c7566t.p(j11) != 0) {
            return;
        }
        try {
            context = c7566t.f70864e;
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                c7566t.a(advertisingIdInfo.getId());
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
        }
    }
}
