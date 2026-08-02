package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qkb implements kx4 {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ tkb d;

    public qkb(tkb tkbVar) {
        this.d = tkbVar;
    }

    public final void a(gf9 gf9Var, float f) {
        tkb tkbVar = this.d;
        jy0 jy0Var = tkbVar.m;
        if (jy0Var == null) {
            jy0Var = new jy0();
            tkbVar.m = jy0Var;
        }
        int G = ph0.G(gf9Var, (gf9[]) jy0Var.b);
        if (G >= 0) {
            float[] fArr = (float[]) jy0Var.c;
            if (fArr[G] != f) {
                fArr[G] = f;
                ((byte[]) jy0Var.d)[G] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) jy0Var.d;
                if (bArr[G] == 2) {
                    bArr[G] = 0;
                    return;
                }
                return;
            }
        }
        int i = jy0Var.a;
        gf9[] gf9VarArr = (gf9[]) jy0Var.b;
        if (i == gf9VarArr.length) {
            int i2 = i * 2;
            jy0Var.b = (gf9[]) Arrays.copyOf(gf9VarArr, i2);
            jy0Var.c = Arrays.copyOf((float[]) jy0Var.c, i2);
            jy0Var.d = Arrays.copyOf((byte[]) jy0Var.d, i2);
        }
        ((gf9[]) jy0Var.b)[i] = gf9Var;
        ((byte[]) jy0Var.d)[i] = 3;
        ((float[]) jy0Var.c)[i] = f;
        jy0Var.a++;
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.d.getFontScale();
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.d.j();
    }
}
