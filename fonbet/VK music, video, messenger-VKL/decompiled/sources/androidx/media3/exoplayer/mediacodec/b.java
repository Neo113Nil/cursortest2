package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.mediacodec.a;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.mediacodec.f;
import java.io.IOException;
import xsna.ahn;
import xsna.io20;
import xsna.y2r0;
import xsna.yz3;
import xsna.zz3;

/* compiled from: DefaultMediaCodecAdapterFactory.java */
/* loaded from: classes12.dex */
public final class b implements c.b {

    @Nullable
    public final Context a;

    public b(Context context) {
        this.a = context;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c.b
    public final c a(c.a aVar) throws IOException {
        Context context;
        if (Build.VERSION.SDK_INT < 31 && ((context = this.a) == null || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new f.a().a(aVar);
        }
        int i = io20.i(aVar.c.n);
        ahn.u("Creating an asynchronous MediaCodec adapter for track type " + y2r0.H(i));
        a.C0059a c0059a = new a.C0059a(new yz3(i), new zz3(i));
        c0059a.c = true;
        return c0059a.a(aVar);
    }
}
