package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ew3 {
    public final rd4 a;
    public final l2a b;

    public ew3(rd4 rd4Var, r18 r18Var) {
        this.a = rd4Var;
        this.b = new l2a(r18Var);
    }

    public final void a(String str) {
        l2a l2aVar = this.b;
        synchronized (l2aVar) {
            if (!Objects.equals((String) l2aVar.c, str)) {
                r18 r18Var = (r18) l2aVar.b;
                String str2 = (String) l2aVar.d;
                if (str != null && str2 != null) {
                    try {
                        r18Var.k(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                l2aVar.c = str;
            }
        }
    }
}
