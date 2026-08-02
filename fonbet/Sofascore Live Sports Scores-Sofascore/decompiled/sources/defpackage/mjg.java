package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class mjg {
    public static mjg a;

    public static synchronized mjg a() {
        mjg mjgVar;
        synchronized (mjg.class) {
            mjgVar = a;
            if (mjgVar == null) {
                try {
                    mjgVar = (mjg) sjg.class.newInstance();
                    a = mjgVar;
                } catch (Exception unused) {
                    mjgVar = new kjg();
                    a = mjgVar;
                }
            }
        }
        return mjgVar;
    }

    public abstract rjg b(View view);

    public abstract void c(ia0 ia0Var);

    public abstract rjg d(ViewGroup viewGroup, List list, boolean z, boolean z2, pgg pggVar);
}
