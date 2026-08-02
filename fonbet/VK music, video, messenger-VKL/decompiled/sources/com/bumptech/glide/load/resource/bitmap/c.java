package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.load.resource.bitmap.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import xsna.au80;
import xsna.cl3;
import xsna.hag0;
import xsna.mag0;
import xsna.p1q;
import xsna.rif0;
import xsna.tc7;
import xsna.wc7;
import xsna.wn00;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes12.dex */
public final class c implements mag0<InputStream, Bitmap> {
    public final com.bumptech.glide.load.resource.bitmap.a a;
    public final cl3 b;

    /* compiled from: StreamBitmapDecoder.java */
    public static class a implements a.b {
        public final rif0 a;
        public final p1q b;

        public a(rif0 rif0Var, p1q p1qVar) {
            this.a = rif0Var;
            this.b = p1qVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void a(Bitmap bitmap, tc7 tc7Var) throws IOException {
            IOException iOException = this.b.c;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                tc7Var.c(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public final void b() {
            rif0 rif0Var = this.a;
            synchronized (rif0Var) {
                rif0Var.d = rif0Var.b.length;
            }
        }
    }

    public c(com.bumptech.glide.load.resource.bitmap.a aVar, cl3 cl3Var) {
        this.a = aVar;
        this.b = cl3Var;
    }

    @Override // xsna.mag0
    public final hag0<Bitmap> a(@NonNull InputStream inputStream, int i, int i2, @NonNull au80 au80Var) throws IOException {
        boolean z;
        rif0 rif0Var;
        p1q p1qVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof rif0) {
            rif0Var = (rif0) inputStream2;
            z = false;
        } else {
            z = true;
            rif0Var = new rif0(inputStream2, this.b);
        }
        ArrayDeque arrayDeque = p1q.d;
        synchronized (arrayDeque) {
            p1qVar = (p1q) arrayDeque.poll();
        }
        if (p1qVar == null) {
            p1qVar = new p1q();
        }
        p1q p1qVar2 = p1qVar;
        p1qVar2.b = rif0Var;
        wn00 wn00Var = new wn00(p1qVar2);
        a aVar = new a(rif0Var, p1qVar2);
        try {
            com.bumptech.glide.load.resource.bitmap.a aVar2 = this.a;
            wc7 a2 = aVar2.a(new b.C0101b(wn00Var, aVar2.d, aVar2.c), i, i2, au80Var, aVar);
            p1qVar2.c = null;
            p1qVar2.b = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(p1qVar2);
            }
            if (z) {
                rif0Var.m();
            }
            return a2;
        } catch (Throwable th) {
            p1qVar2.c = null;
            p1qVar2.b = null;
            ArrayDeque arrayDeque2 = p1q.d;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(p1qVar2);
                if (!z) {
                    throw th;
                }
                rif0Var.m();
                throw th;
            }
        }
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull InputStream inputStream, @NonNull au80 au80Var) throws IOException {
        return true;
    }
}
