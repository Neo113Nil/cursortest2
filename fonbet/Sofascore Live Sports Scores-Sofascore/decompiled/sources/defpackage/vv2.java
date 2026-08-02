package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vv2 {
    public final String a;
    public List b = km5.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public vv2(String str) {
        this.a = str;
    }

    public final void a(String str, SerialDescriptor serialDescriptor, List list, boolean z) {
        str.getClass();
        serialDescriptor.getClass();
        list.getClass();
        if (!this.d.add(str)) {
            StringBuilder q = wt3.q("Element with name '", str, "' is already registered in ");
            q.append(this.a);
            throw new IllegalArgumentException(q.toString().toString());
        }
        this.c.add(str);
        this.e.add(serialDescriptor);
        this.f.add(list);
        this.g.add(Boolean.valueOf(z));
    }
}
