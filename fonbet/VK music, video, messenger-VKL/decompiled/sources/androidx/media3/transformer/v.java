package androidx.media3.transformer;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.transformer.a;
import com.google.common.collect.ImmutableMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import xsna.fxc0;
import xsna.g0h0;
import xsna.i2e0;
import xsna.io20;
import xsna.k5j;
import xsna.kc7;
import xsna.kr10;
import xsna.m6g;
import xsna.n0t;
import xsna.qgd;
import xsna.rfw;
import xsna.tnw;
import xsna.u0t;
import xsna.ugz;

/* compiled from: ImageAssetLoader.java */
/* loaded from: classes12.dex */
public final class v implements androidx.media3.transformer.a {
    public final Context a;
    public final m b;
    public final kc7 c;
    public final a.c d;
    public final boolean e;
    public final ScheduledExecutorService f;

    @Nullable
    public g0h0 g;
    public int h;
    public volatile int i;

    /* compiled from: ImageAssetLoader.java */
    public class a implements n0t<Bitmap> {
        public a() {
        }

        @Override // xsna.n0t
        public final void onFailure(Throwable th) {
            v.this.d.a(ExportException.a(2000, th));
        }

        @Override // xsna.n0t
        public final void onSuccess(Bitmap bitmap) {
            androidx.media3.common.a aVar;
            boolean hasGainmap;
            Bitmap bitmap2 = bitmap;
            v.this.i = 50;
            a.C0043a c0043a = new a.C0043a();
            c0043a.u = bitmap2.getHeight();
            c0043a.t = bitmap2.getWidth();
            c0043a.m = io20.q("image/raw");
            c0043a.C = m6g.i;
            androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0043a);
            try {
                if (v.this.e && Build.VERSION.SDK_INT >= 34) {
                    hasGainmap = bitmap2.hasGainmap();
                    if (hasGainmap) {
                        a.C0043a a = aVar2.a();
                        a.m = io20.q("image/jpeg_r");
                        aVar = new androidx.media3.common.a(a);
                        v.this.d.d(2, aVar2);
                        v.this.f.submit(new rfw(this, bitmap2, aVar, 0));
                        return;
                    }
                }
                v.this.d.d(2, aVar2);
                v.this.f.submit(new rfw(this, bitmap2, aVar, 0));
                return;
            } catch (RuntimeException e) {
                v.this.d.a(ExportException.a(1000, e));
                return;
            }
            aVar = aVar2;
        }
    }

    /* compiled from: ImageAssetLoader.java */
    public static final class b implements a.b {
        public final Context a;
        public final kc7 b;

        public b(Context context, androidx.media3.datasource.b bVar) {
            this.a = context;
            this.b = bVar;
        }

        @Override // androidx.media3.transformer.a.b
        public final androidx.media3.transformer.a a(m mVar, Looper looper, a.c cVar, a.C0070a c0070a) {
            return new v(this.a, mVar, cVar, this.b, c0070a.b);
        }
    }

    public v(Context context, m mVar, a.c cVar, kc7 kc7Var, boolean z) {
        fxc0.z(mVar.d != C.TIME_UNSET);
        fxc0.z(mVar.e != -2147483647);
        this.a = context;
        this.b = mVar;
        this.d = cVar;
        this.c = kc7Var;
        this.e = z;
        this.f = Executors.newSingleThreadScheduledExecutor();
        this.h = 0;
    }

    public final void a(final Bitmap bitmap, final androidx.media3.common.a aVar) {
        try {
            g0h0 g0h0Var = this.g;
            if (g0h0Var == null) {
                this.g = this.d.b(aVar);
                this.f.schedule(new Runnable() { // from class: xsna.pfw
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.transformer.v.this.a(bitmap, aVar);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
                return;
            }
            int d = g0h0Var.d(bitmap, new k5j(0, this.b.d, r4.e));
            if (d == 1) {
                this.i = 100;
                this.g.g();
            } else if (d == 2) {
                this.f.schedule(new Runnable() { // from class: xsna.qfw
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.transformer.v.this.a(bitmap, aVar);
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            } else {
                if (d != 3) {
                    throw new IllegalStateException();
                }
                this.i = 100;
            }
        } catch (ExportException e) {
            this.d.a(e);
        } catch (RuntimeException e2) {
            this.d.a(ExportException.a(1000, e2));
        }
    }

    @Override // androidx.media3.transformer.a
    public final int c(i2e0 i2e0Var) {
        if (this.h == 2) {
            i2e0Var.a = this.i;
        }
        return this.h;
    }

    @Override // androidx.media3.transformer.a
    public final ImmutableMap<Integer, String> g() {
        return com.google.common.collect.h.h;
    }

    @Override // androidx.media3.transformer.a
    public final void release() {
        this.h = 0;
        this.f.shutdownNow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r3.equals("image/heif") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L38;
     */
    @Override // androidx.media3.transformer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start() {
        ugz ugzVar;
        char c = 2;
        this.h = 2;
        m mVar = this.b;
        long j = mVar.d;
        a.c cVar = this.d;
        cVar.f(j);
        int i = 1;
        cVar.e(1);
        kr10 kr10Var = mVar.a;
        String b2 = c0.b(this.a, kr10Var);
        if (b2 != null) {
            androidx.media3.datasource.b bVar = (androidx.media3.datasource.b) this.c;
            bVar.getClass();
            switch (b2.hashCode()) {
                case -1487656890:
                    if (b2.equals("image/avif")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1487464693:
                    if (b2.equals("image/heic")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1487464690:
                    break;
                case -1487394660:
                    if (b2.equals("image/jpeg")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1487018032:
                    if (b2.equals("image/webp")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -879272239:
                    if (b2.equals("image/bmp")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -879258763:
                    if (b2.equals("image/png")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    kr10.f fVar = kr10Var.b;
                    fVar.getClass();
                    ugzVar = bVar.a.submit((Callable) new qgd(i, bVar, fVar.a));
                    break;
            }
            ugzVar.addListener(new u0t(ugzVar, new a()), this.f);
        }
        ParserException c2 = ParserException.c("Attempted to load a Bitmap from unsupported MIME type: " + b2);
        tnw.a aVar = new tnw.a();
        aVar.l(c2);
        ugzVar = aVar;
        ugzVar.addListener(new u0t(ugzVar, new a()), this.f);
    }
}
