package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m7b {
    public static final List b = b.j(new m7b(1), new m7b(2), new m7b(4));
    public final int a;

    public /* synthetic */ m7b(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (i == 1) {
            return "CR";
        }
        if (i == 2) {
            return "LF";
        }
        if (i == 4) {
            return "CRLF";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if ((((m7b) obj).a | i) == i) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m7b) {
            return this.a == ((m7b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
