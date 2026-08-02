package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t3h {
    public final l3h a;
    public final vzc b;

    public t3h(s3h s3hVar, p6a p6aVar) {
        this.a = s3hVar.d;
        List j = s3h.j(4, s3hVar);
        this.b = new vzc(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            s3h s3hVar2 = (s3h) j.get(i);
            if (p6aVar.a(s3hVar2.f)) {
                this.b.a(s3hVar2.f);
            }
        }
    }
}
