package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v60 implements j1g {
    public final /* synthetic */ int a;
    public final Object b;

    public v60() {
        this.a = 2;
        this.b = new uxf(17);
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType A = ktm.A(((c70) obj2).a, (ByteBuffer) obj);
                if (A == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && A == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    break;
                }
                break;
            case 1:
                c70 c70Var = (c70) obj2;
                ImageHeaderParser$ImageType z = ktm.z(c70Var.a, (InputStream) obj, c70Var.b);
                if (z == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && z == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    break;
                }
                break;
            default:
                a70.d(obj);
                break;
        }
        return true;
    }

    @Override // defpackage.j1g
    public final e1g b(Object obj, int i, int i2, uvd uvdVar) {
        switch (this.a) {
            case 0:
                return c70.a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, uvdVar);
            case 1:
                return c70.a(ImageDecoder.createSource(ha2.b((InputStream) obj)), i, i2, uvdVar);
            default:
                return c(a70.d(obj), i, i2, uvdVar);
        }
    }

    public ex1 c(ImageDecoder.Source source, int i, int i2, uvd uvdVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new nr4(i, i2, uvdVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new ex1((uxf) this.b, decodeBitmap);
    }

    public /* synthetic */ v60(c70 c70Var, int i) {
        this.a = i;
        this.b = c70Var;
    }
}
