package defpackage;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m03 {
    public static SensorManager c;
    public static atk d;
    public static String e;
    public static volatile boolean h;
    public static final m03 a = new m03();
    public static final btk b = new btk();
    public static final AtomicBoolean f = new AtomicBoolean(true);
    public static final AtomicBoolean g = new AtomicBoolean(false);

    public static final String a() {
        if (cw3.a.contains(m03.class)) {
            return null;
        }
        try {
            String str = e;
            if (str == null) {
                str = UUID.randomUUID().toString();
                e = str;
            }
            str.getClass();
            return str;
        } catch (Throwable th) {
            cw3.a(m03.class, th);
            return null;
        }
    }
}
