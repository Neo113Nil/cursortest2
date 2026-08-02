package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfnu;
import java.util.LinkedList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c9o {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final g9o d = new g9o();

    public c9o(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                return;
            }
            if (zzt.zzk().a() - ((zzfnu) linkedList.getFirst()).d < this.c) {
                return;
            }
            g9o g9oVar = this.d;
            g9oVar.f++;
            g9oVar.b.b++;
            linkedList.remove();
        }
    }
}
