package defpackage;

import android.os.StrictMode;
import com.google.android.gms.internal.measurement.zzrh;
import com.google.android.gms.internal.measurement.zzrl;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class h4p {
    public static final zzrl a;

    static {
        zzrl zzrhVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(zzrl.class, zzrl.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                zzrhVar = (zzrl) it.next();
                z1a.D("Expected at most one FlagsService", !it.hasNext());
            } else {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                zzrhVar = new zzrh();
            }
            a = zzrhVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
