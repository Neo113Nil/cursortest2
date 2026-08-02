package defpackage;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xw1 extends khh {
    public final Context n;
    public final int o;

    public xw1(Context context) {
        super(new im4[1], new ww1[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.khh
    public final im4 c() {
        return new im4(1);
    }

    @Override // defpackage.khh
    public final jm4 d() {
        return new ww1(this);
    }

    @Override // defpackage.khh
    public final dy3 e(Throwable th) {
        return new ur9("Unexpected decode error", th);
    }

    @Override // defpackage.khh
    public final dy3 f(im4 im4Var, jm4 jm4Var, boolean z) {
        ww1 ww1Var = (ww1) jm4Var;
        ByteBuffer byteBuffer = im4Var.i;
        byteBuffer.getClass();
        z1a.E(byteBuffer.hasArray());
        z1a.s(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.o;
            if (i == -1) {
                Context context = this.n;
                if (context != null) {
                    Point z2 = nik.z(context);
                    int i2 = z2.x;
                    int i3 = z2.y;
                    b bVar = im4Var.g;
                    if (bVar != null) {
                        int i4 = bVar.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = bVar.O;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            ww1Var.i = c6o.F(byteBuffer.remaining(), i, byteBuffer.array());
            ww1Var.g = im4Var.k;
            return null;
        } catch (s9e e) {
            return new ur9("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ur9(e2);
        }
    }
}
