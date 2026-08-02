package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z6b implements s6b {
    public final /* synthetic */ g6b a;
    public final /* synthetic */ d4a b;

    public z6b(d4a d4aVar, g6b g6bVar) {
        this.b = d4aVar;
        this.a = g6bVar;
    }

    @Override // defpackage.s6b
    public final void onDestroy() {
        ((HashMap) this.b.b).remove(this.a);
    }

    @Override // defpackage.s6b
    public final void onStart() {
    }

    @Override // defpackage.s6b
    public final void onStop() {
    }
}
