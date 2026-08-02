package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ugc extends OutputStream {
    public static final /* synthetic */ int d = 0;
    public final ArrayList a = new ArrayList();
    public zod b;
    public final /* synthetic */ vgc c;

    public ugc(vgc vgcVar) {
        this.c = vgcVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        uic uicVar = this.c.g;
        zod zodVar = this.b;
        ArrayList arrayList = this.a;
        if (zodVar == null) {
            uicVar.getClass();
            zod g = uic.g(i2);
            this.b = g;
            arrayList.add(g);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.b);
            zod zodVar2 = this.b;
            if (min == 0) {
                int max = Math.max(i2, zodVar2.c * 2);
                uicVar.getClass();
                zod g2 = uic.g(max);
                this.b = g2;
                arrayList.add(g2);
            } else {
                zodVar2.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        zod zodVar = this.b;
        if (zodVar != null && zodVar.b > 0) {
            zodVar.a.Y0((byte) i);
            zodVar.b--;
            zodVar.c++;
            return;
        }
        write(new byte[]{(byte) i}, 0, 1);
    }
}
