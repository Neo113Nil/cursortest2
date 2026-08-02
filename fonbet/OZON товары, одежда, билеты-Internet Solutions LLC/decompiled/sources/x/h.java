package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
class h extends l {
    @Override // x.l, x.g.a
    public Surface a() {
        return ((OutputConfiguration) i()).getSurface();
    }

    @Override // x.l, x.g.a
    @NonNull
    public Object i() {
        throw null;
    }
}
