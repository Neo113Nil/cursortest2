package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vso extends puo {
    public static final quo i = new quo();
    public final Context h;

    public vso(zro zroVar, s9n s9nVar, int i2, Context context) {
        super(zroVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", s9nVar, i2, 29);
        this.h = context;
    }

    @Override // defpackage.puo
    public final void a() {
        s9n s9nVar = this.d;
        s9nVar.b();
        ((cmn) s9nVar.b).D0("E");
        Context context = this.h;
        AtomicReference a = i.a(context.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                try {
                    if (a.get() == null) {
                        a.set((String) this.e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) a.get();
        s9n s9nVar2 = this.d;
        synchronized (s9nVar2) {
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            s9nVar2.b();
            ((cmn) s9nVar2.b).D0(encodeToString);
        }
    }
}
