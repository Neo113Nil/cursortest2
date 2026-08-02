package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class bed {
    public final i1d a = new i1d(new odd[16], 0);
    public final l0d b = new l0d(10);

    public boolean a(nkb nkbVar, dma dmaVar, yih yihVar, boolean z) {
        i1d i1dVar = this.a;
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((odd) objArr[i2]).a(nkbVar, dmaVar, yihVar, z) || z2;
        }
        return z2;
    }

    public void b(yih yihVar) {
        i1d i1dVar = this.a;
        int i = i1dVar.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((odd) i1dVar.a[i]).d.b == 0) {
                i1dVar.r(i);
            }
        }
    }
}
