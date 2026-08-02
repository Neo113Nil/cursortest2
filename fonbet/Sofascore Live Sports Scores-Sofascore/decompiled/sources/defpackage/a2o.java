package defpackage;

import com.google.android.gms.internal.play_billing.zzo;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a2o {
    public static final a2o b;
    public static final a2o c;
    public final Throwable a;

    static {
        if (zzo.d) {
            c = null;
            b = null;
        } else {
            c = new a2o(null);
            b = new a2o(null);
        }
    }

    public a2o(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
