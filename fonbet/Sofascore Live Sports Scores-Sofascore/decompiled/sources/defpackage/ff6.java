package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ff6 implements ds9 {
    @Override // defpackage.ds9
    public final boolean a(ByteBuffer byteBuffer, kn4 kn4Var) {
        return false;
    }

    @Override // defpackage.ds9
    public final int b(InputStream inputStream, kn4 kn4Var) {
        int c = new ef6(inputStream).c();
        if (c == 0) {
            return -1;
        }
        return c;
    }

    @Override // defpackage.ds9
    public final int c(ByteBuffer byteBuffer, kn4 kn4Var) {
        AtomicReference atomicReference = ha2.a;
        return b(new gf6(byteBuffer), kn4Var);
    }

    @Override // defpackage.ds9
    public final boolean d(InputStream inputStream, kn4 kn4Var) {
        return false;
    }

    @Override // defpackage.ds9
    public final ImageHeaderParser$ImageType e(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.ds9
    public final ImageHeaderParser$ImageType f(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
