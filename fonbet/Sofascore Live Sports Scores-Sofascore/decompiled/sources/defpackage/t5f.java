package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t5f {
    public static final s5f a;

    static {
        s5f s5fVar;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (Intrinsics.c(lowerCase, "robolectric")) {
                s5fVar = new s5f();
                a = s5fVar;
            }
        }
        s5fVar = null;
        a = s5fVar;
    }
}
