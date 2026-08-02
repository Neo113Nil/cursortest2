package androidx.media3.transformer;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.datasource.c;
import androidx.media3.transformer.a;
import androidx.media3.transformer.s;
import androidx.media3.transformer.v;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import xsna.dvf;
import xsna.io20;
import xsna.jhz;
import xsna.kr10;
import xsna.t830;
import xsna.u830;

/* compiled from: DefaultAssetLoaderFactory.java */
/* loaded from: classes12.dex */
public final class g implements a.b {
    public final Context a;
    public final j b;
    public final dvf c;
    public final androidx.media3.datasource.b d;

    @Nullable
    public final LogSessionId e;
    public v.b f;
    public s.a g;

    public g(Context context, j jVar, dvf dvfVar, @Nullable LogSessionId logSessionId) {
        jhz u830Var;
        this.a = context.getApplicationContext();
        this.b = jVar;
        this.c = dvfVar;
        this.e = logSessionId;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (newSingleThreadExecutor instanceof jhz) {
            u830Var = (jhz) newSingleThreadExecutor;
        } else {
            u830Var = newSingleThreadExecutor instanceof ScheduledExecutorService ? new u830((ScheduledExecutorService) newSingleThreadExecutor) : new t830(newSingleThreadExecutor);
        }
        this.d = new androidx.media3.datasource.b(u830Var, new c.a(context), options);
    }

    @Override // androidx.media3.transformer.a.b
    public final a a(m mVar, Looper looper, a.c cVar, a.C0070a c0070a) {
        kr10 kr10Var = mVar.a;
        Context context = this.a;
        String b = c0.b(context, kr10Var);
        if (b != null && io20.n(b)) {
            kr10.f fVar = kr10Var.b;
            fVar.getClass();
            if (fVar.f != C.TIME_UNSET) {
                if (this.f == null) {
                    this.f = new v.b(context, this.d);
                }
                return this.f.a(mVar, looper, cVar, c0070a);
            }
        }
        if (this.g == null) {
            this.g = new s.a(context, this.b, this.c, this.e);
        }
        return this.g.a(mVar, looper, cVar, c0070a);
    }
}
