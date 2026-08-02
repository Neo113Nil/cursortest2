package defpackage;

import com.google.android.gms.internal.measurement.zzaad;
import com.google.android.gms.internal.measurement.zzaaj;
import com.google.android.gms.internal.measurement.zzaak;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class s4n {
    public static final zzaad a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.measurement.zzaad] */
    static {
        zzaaj zzaajVar;
        try {
            zzaajVar = zzaak.a;
        } catch (NoClassDefFoundError unused) {
            zzaajVar = null;
        }
        if (zzaajVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = zzaad.a[i];
                try {
                    zzaajVar = (zzaad) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = zzaajVar;
    }
}
