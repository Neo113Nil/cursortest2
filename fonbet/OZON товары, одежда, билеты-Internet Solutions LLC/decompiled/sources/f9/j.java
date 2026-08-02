package f9;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx;
import h7.C6865w;
import h7.C6867x;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
final class j {
    static C6867x a(@NonNull ByteBuffer byteBuffer, @NonNull zbnx zbnxVar) {
        C6865w c6865w = new C6865w();
        c6865w.a(byteBuffer.array());
        int zbc = zbnxVar.zbc();
        int i11 = 1;
        if (zbc == 1) {
            i11 = 4;
        } else if (zbc == 2) {
            i11 = 3;
        } else if (zbc == 3) {
            i11 = 2;
        }
        c6865w.f(i11);
        c6865w.b(new zbcr(zbnxVar.zbd(), zbnxVar.zba()));
        c6865w.c(zbnxVar.zbe() * 1000);
        c6865w.e();
        return c6865w.d();
    }
}
