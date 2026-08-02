package com.fyber.inneractive.sdk.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class e1 extends t0 {
    public final String p;

    public e1(com.fyber.inneractive.sdk.flow.endcard.loaders.companion.d dVar, String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(dVar, g0.c.a(), rVar);
        this.p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        o0 o0Var = new o0();
        d1 d1Var = new d1();
        try {
            InputStream inputStream = lVar.c;
            if (inputStream != null) {
                int a = t0.a(map);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                Bitmap decodeStream = BitmapFactory.decodeStream(new com.fyber.inneractive.sdk.util.v0(inputStream, atomicInteger));
                if (atomicInteger.get() != a) {
                    decodeStream = null;
                }
                Bitmap bitmap = decodeStream;
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i2 = width * height;
                    int[] iArr = new int[i2];
                    bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    int i3 = -1;
                    for (int i4 = 0; i4 < i2; i4++) {
                        int i5 = iArr[i4];
                        if (i4 != 0) {
                            if (i5 != i3) {
                                d1Var.a = bitmap;
                                IAlog.a("SimpleImageLoader: Got a valid bitmap %s", this.p);
                                break;
                            }
                        } else {
                            i3 = i5;
                        }
                    }
                }
                IAlog.a("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
                d1Var.b = "Got an invalid bitmap";
            }
        } catch (Exception e) {
            IAlog.c("SimpleImageLoader: Exception on load image %s %s", e.getMessage(), e.toString());
            d1Var.b = e.getMessage();
        } catch (OutOfMemoryError e2) {
            IAlog.c("SimpleImageLoader: OutOfMemoryError on load image %s", e2.getMessage());
            Bitmap bitmap2 = d1Var.a;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            d1Var.b = e2.getMessage();
        }
        o0Var.a = d1Var;
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }
}
