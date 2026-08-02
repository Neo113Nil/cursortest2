package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z8 {
    public final HashMap a = new HashMap();
    public final Context b;
    public final vff c;

    public z8(Context context, vff vffVar) {
        this.b = context;
        this.c = vffVar;
    }

    public final synchronized l38 a(String str) {
        try {
            if (!this.a.containsKey(str)) {
                this.a.put(str, new l38(this.c, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (l38) this.a.get(str);
    }
}
