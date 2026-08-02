package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y92 implements j1g {
    public final /* synthetic */ int a;
    public final v60 b;

    public y92(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new v60();
                break;
            default:
                this.b = new v60();
                break;
        }
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.j1g
    public final e1g b(Object obj, int i, int i2, uvd uvdVar) {
        int i3 = this.a;
        v60 v60Var = this.b;
        switch (i3) {
            case 0:
                return v60Var.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, uvdVar);
            default:
                return v60Var.c(ImageDecoder.createSource(ha2.b((InputStream) obj)), i, i2, uvdVar);
        }
    }
}
