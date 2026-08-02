package com.facebook.imagepipeline.platform;

import D6.d;
import D6.k;
import D6.p;
import G6.h;
import G6.j;
import H6.a;
import L6.b;
import L6.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;

@d
/* loaded from: classes2.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c, reason: collision with root package name */
    public static Method f30596c;

    /* renamed from: b, reason: collision with root package name */
    public final b f30597b = c.i();

    @d
    public GingerbreadPurgeableDecoder() {
    }

    public static MemoryFile h(a aVar, int i10, byte[] bArr) {
        OutputStream outputStream;
        J6.a aVar2;
        j jVar;
        j jVar2 = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i10);
        memoryFile.allowPurging(false);
        try {
            jVar = new j((h) aVar.z0());
            try {
                aVar2 = new J6.a(jVar, i10);
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            aVar2 = null;
        }
        try {
            outputStream2 = memoryFile.getOutputStream();
            D6.a.a(aVar2, outputStream2);
            if (bArr != null) {
                memoryFile.writeBytes(bArr, 0, i10, bArr.length);
            }
            a.U(aVar);
            D6.b.b(jVar);
            D6.b.b(aVar2);
            D6.b.a(outputStream2, true);
            return memoryFile;
        } catch (Throwable th4) {
            th = th4;
            outputStream = outputStream2;
            jVar2 = jVar;
            a.U(aVar);
            D6.b.b(jVar2);
            D6.b.b(aVar2);
            D6.b.a(outputStream, true);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap c(a aVar, BitmapFactory.Options options) {
        return i(aVar, ((h) aVar.z0()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        return i(aVar, i10, DalvikPurgeableDecoder.e(aVar, i10) ? null : DalvikPurgeableDecoder.EOI, options);
    }

    public final Bitmap i(a aVar, int i10, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile h10;
        MemoryFile memoryFile = null;
        try {
            try {
                h10 = h(aVar, i10, bArr);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            FileDescriptor k10 = k(h10);
            b bVar = this.f30597b;
            if (bVar == null) {
                throw new IllegalStateException("WebpBitmapFactory is null");
            }
            Bitmap bitmap = (Bitmap) k.h(bVar.b(k10, null, options), "BitmapFactory returned null");
            if (h10 != null) {
                h10.close();
            }
            return bitmap;
        } catch (IOException e11) {
            e = e11;
            memoryFile = h10;
            throw p.a(e);
        } catch (Throwable th3) {
            th = th3;
            memoryFile = h10;
            if (memoryFile != null) {
                memoryFile.close();
            }
            throw th;
        }
    }

    public final synchronized Method j() {
        if (f30596c == null) {
            try {
                f30596c = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e10) {
                throw p.a(e10);
            }
        }
        return f30596c;
    }

    public final FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(j().invoke(memoryFile, null));
        } catch (Exception e10) {
            throw p.a(e10);
        }
    }
}
