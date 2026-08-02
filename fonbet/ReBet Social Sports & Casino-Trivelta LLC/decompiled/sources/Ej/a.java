package Ej;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final Gj.f a(Gj.i audioFocusManagerFactory) {
        Intrinsics.checkNotNullParameter(audioFocusManagerFactory, "audioFocusManagerFactory");
        return audioFocusManagerFactory.a();
    }

    public final AudioManager b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Xj.c.b(context);
    }

    public final BluetoothManager c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Xj.c.c(context);
    }

    public final Xj.a d() {
        return new Xj.b();
    }

    public final PowerManager e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Xj.c.f(context);
    }

    public final TelephonyManager f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Xj.c.g(context);
    }
}
