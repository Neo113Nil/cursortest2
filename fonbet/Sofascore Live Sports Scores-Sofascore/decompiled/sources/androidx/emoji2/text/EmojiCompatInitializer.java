package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.cl5;
import defpackage.dl5;
import defpackage.fg8;
import defpackage.fl5;
import defpackage.g6b;
import defpackage.k3a;
import defpackage.sx2;
import defpackage.u6b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements k3a {
    @Override // defpackage.k3a
    public final Object create(Context context) {
        Object obj;
        fg8 fg8Var = new fg8(new fl5(context));
        fg8Var.b = 1;
        if (cl5.k == null) {
            synchronized (cl5.j) {
                try {
                    if (cl5.k == null) {
                        cl5.k = new cl5(fg8Var);
                    }
                } finally {
                }
            }
        }
        sx2 x = sx2.x(context);
        x.getClass();
        synchronized (sx2.e) {
            try {
                obj = ((HashMap) x.a).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = x.q(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        g6b lifecycle = ((u6b) obj).getLifecycle();
        lifecycle.a(new dl5(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // defpackage.k3a
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
