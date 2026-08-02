package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ga2 implements he4 {
    public final /* synthetic */ int a;

    @Override // defpackage.he4
    public final ie4 build(Object obj) {
        switch (this.a) {
            case 0:
                return new de0((ByteBuffer) obj, 11);
            case 1:
                return new de0(obj, 13);
            default:
                return new a((ParcelFileDescriptor) obj);
        }
    }

    @Override // defpackage.he4
    public final Class c() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
