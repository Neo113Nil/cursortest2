package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.base.zao;
import com.ironsource.C4427z5;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r2n extends zao {
    public final Context a;
    public final /* synthetic */ GoogleApiAvailability b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2n(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = googleApiAvailability;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            new StringBuilder(String.valueOf(i).length() + 39);
            return;
        }
        int i2 = GoogleApiAvailabilityLight.a;
        GoogleApiAvailability googleApiAvailability = this.b;
        Context context = this.a;
        int b = googleApiAvailability.b(context, i2);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = googleApiAvailability.a(context, b, C4427z5.q);
            googleApiAvailability.f(context, b, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
