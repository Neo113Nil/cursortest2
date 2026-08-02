package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v9e {
    public final List a;
    public final List b;

    public v9e(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(CollectionsKt.f0(this.a, ", ", null, null, null, 62));
        sb.append('(');
        return lnb.q(sb, CollectionsKt.f0(this.b, ";", null, null, null, 62), ')');
    }
}
