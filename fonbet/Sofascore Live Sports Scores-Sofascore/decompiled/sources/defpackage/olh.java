package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class olh implements lic {
    public final ArrayList a;

    public olh(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((nlh) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((nlh) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((nlh) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        z1a.s(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || olh.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((olh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
