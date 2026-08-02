package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fx8 {
    public final List a;

    public fx8(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            a70.p("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                }
            }
            for (ix8 ix8Var : this.a) {
            }
        }
    }
}
