package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.e0;
import androidx.lifecycle.y;
import b2.e;
import j1.j;
import j1.k;
import j1.q;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import x2.a;
import x2.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // x2.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final void b(Context context) {
        Object obj;
        a c2 = a.c(context);
        c2.getClass();
        synchronized (a.f25383e) {
            try {
                obj = c2.f25384a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        y lifecycle = ((e0) obj).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
    }

    @Override // x2.b
    public final Object create(Context context) {
        q qVar = new q(new e(context, 4));
        qVar.f18198a = 1;
        if (j.f18201k == null) {
            synchronized (j.j) {
                try {
                    if (j.f18201k == null) {
                        j.f18201k = new j(qVar);
                    }
                } finally {
                }
            }
        }
        b(context);
        return Boolean.TRUE;
    }
}
