package defpackage;

import java.nio.FloatBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pdf {
    public final int a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final int d;

    public pdf(mdf mdfVar) {
        float[] fArr = mdfVar.c;
        this.a = fArr.length / 3;
        this.b = ok3.m(fArr);
        this.c = ok3.m(mdfVar.d);
        int i = mdfVar.b;
        if (i == 1) {
            this.d = 5;
        } else if (i != 2) {
            this.d = 4;
        } else {
            this.d = 6;
        }
    }

    public pdf(mdf mdfVar, boolean z) {
        float[] fArr = mdfVar.c;
        this.a = fArr.length / 3;
        this.b = xw3.E(fArr);
        this.c = xw3.E(mdfVar.d);
        int i = mdfVar.b;
        if (i == 1) {
            this.d = 5;
        } else if (i != 2) {
            this.d = 4;
        } else {
            this.d = 6;
        }
    }
}
