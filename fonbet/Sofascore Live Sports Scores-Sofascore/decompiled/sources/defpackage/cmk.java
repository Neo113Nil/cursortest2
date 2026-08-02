package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cmk extends bmk {
    public xbe[] a;
    public String b;
    public int c;

    public cmk(cmk cmkVar) {
        this.a = null;
        this.c = 0;
        this.b = cmkVar.b;
        xbe[] xbeVarArr = cmkVar.a;
        xbe[] xbeVarArr2 = new xbe[xbeVarArr.length];
        for (int i = 0; i < xbeVarArr.length; i++) {
            xbeVarArr2[i] = new xbe(xbeVarArr[i]);
        }
        this.a = xbeVarArr2;
    }

    public xbe[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(xbe[] xbeVarArr) {
        int i;
        xbe[] xbeVarArr2 = this.a;
        if (xbeVarArr2 != null && xbeVarArr != null && xbeVarArr2.length == xbeVarArr.length) {
            for (0; i < xbeVarArr2.length; i + 1) {
                xbe xbeVar = xbeVarArr2[i];
                char c = xbeVar.a;
                xbe xbeVar2 = xbeVarArr[i];
                i = (c == xbeVar2.a && xbeVar.b.length == xbeVar2.b.length) ? i + 1 : 0;
            }
            xbe[] xbeVarArr3 = this.a;
            for (int i2 = 0; i2 < xbeVarArr.length; i2++) {
                xbeVarArr3[i2].a = xbeVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = xbeVarArr[i2].b;
                    if (i3 < fArr.length) {
                        xbeVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        xbe[] xbeVarArr4 = new xbe[xbeVarArr.length];
        for (int i4 = 0; i4 < xbeVarArr.length; i4++) {
            xbeVarArr4[i4] = new xbe(xbeVarArr[i4]);
        }
        this.a = xbeVarArr4;
    }

    public cmk() {
        this.a = null;
        this.c = 0;
    }
}
