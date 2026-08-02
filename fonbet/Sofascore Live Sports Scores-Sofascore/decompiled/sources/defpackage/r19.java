package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.k;
import com.facebook.k0;
import com.facebook.w;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r19 {
    public static final boolean b;
    public final k a;

    static {
        glf.a.getClass();
        b = glf.b.j().nextDouble() <= 1.0E-4d;
    }

    public r19(Context context) {
        this.a = new k(context, 1);
    }

    public final void a(Bundle bundle, String str) {
        if (b && StringsKt.J(str, "gps", false)) {
            w wVar = w.a;
            if (k0.c()) {
                this.a.a.g(bundle, str);
            }
        }
    }
}
