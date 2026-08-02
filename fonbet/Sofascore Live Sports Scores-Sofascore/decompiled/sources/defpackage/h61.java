package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h61 implements n55 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ int b;
    public final /* synthetic */ n29 c;

    public h61(Map map, int i, n29 n29Var) {
        this.a = map;
        this.b = i;
        this.c = n29Var;
    }

    @Override // defpackage.n55
    public final void d() {
        int i = this.b;
        Integer valueOf = Integer.valueOf(i);
        Map map = this.a;
        if (map.get(valueOf) == this.c) {
            map.remove(Integer.valueOf(i));
        }
    }
}
