package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import xsna.kvb0;
import xsna.njx0;
import xsna.p7z;
import xsna.pjx0;
import xsna.s200;
import xsna.sex0;
import xsna.uvf;
import xsna.yvf;
import xsna.zsn;

@zsn
/* loaded from: classes12.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method b;
    public final njx0 a;

    @zsn
    public GingerbreadPurgeableDecoder() {
        njx0 njx0Var = null;
        if (!pjx0.a) {
            try {
                njx0Var = (njx0) WebpBitmapFactoryImpl.class.newInstance();
            } catch (Throwable unused) {
            }
            pjx0.a = true;
        }
        this.a = njx0Var;
    }

    public static MemoryFile a(uvf<PooledByteBuffer> uvfVar, int i, byte[] bArr) throws IOException {
        OutputStream outputStream;
        p7z p7zVar;
        kvb0 kvb0Var = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            kvb0 kvb0Var2 = new kvb0(uvfVar.r());
            try {
                p7zVar = new p7z(kvb0Var2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    outputStream2.getClass();
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int read = p7zVar.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        outputStream2.write(bArr2, 0, read);
                    }
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    uvfVar.close();
                    yvf.b(kvb0Var2);
                    yvf.b(p7zVar);
                    yvf.a(outputStream2);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    kvb0Var = kvb0Var2;
                    uvf.q(uvfVar);
                    yvf.b(kvb0Var);
                    yvf.b(p7zVar);
                    yvf.a(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                p7zVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            p7zVar = null;
        }
    }

    public final Bitmap b(uvf<PooledByteBuffer> uvfVar, int i, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile a = a(uvfVar, i, bArr);
                FileDescriptor c = c(a);
                njx0 njx0Var = this.a;
                if (njx0Var == null) {
                    throw new IllegalStateException("WebpBitmapFactory is null");
                }
                Bitmap a2 = njx0Var.a(c, options);
                sex0.e(a2, "BitmapFactory returned null");
                a.close();
                return a2;
            } catch (IOException e) {
                s200.K(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                memoryFile.close();
            }
            throw th;
        }
    }

    public final FileDescriptor c(MemoryFile memoryFile) {
        Method method;
        try {
            synchronized (this) {
                if (b == null) {
                    try {
                        b = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
                    } catch (Exception e) {
                        s200.K(e);
                        throw new RuntimeException(e);
                    }
                }
                method = b;
            }
            Object invoke = method.invoke(memoryFile, null);
            invoke.getClass();
            return (FileDescriptor) invoke;
        } catch (Exception e2) {
            s200.K(e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeByteArrayAsPurgeable(uvf<PooledByteBuffer> uvfVar, BitmapFactory.Options options) {
        return b(uvfVar, uvfVar.r().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap decodeJPEGByteArrayAsPurgeable(uvf<PooledByteBuffer> uvfVar, int i, BitmapFactory.Options options) {
        return b(uvfVar, i, DalvikPurgeableDecoder.endsWithEOI(uvfVar, i) ? null : DalvikPurgeableDecoder.EOI, options);
    }
}
