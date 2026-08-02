package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gro extends neo {
    public final Long a;
    public final Boolean b;
    public final Boolean c;

    public gro(String str) {
        HashMap b = neo.b(str);
        if (b != null) {
            this.a = (Long) b.get(0);
            this.b = (Boolean) b.get(1);
            this.c = (Boolean) b.get(2);
        }
    }

    @Override // defpackage.neo
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.b);
        hashMap.put(2, this.c);
        return hashMap;
    }

    public gro() {
    }
}
