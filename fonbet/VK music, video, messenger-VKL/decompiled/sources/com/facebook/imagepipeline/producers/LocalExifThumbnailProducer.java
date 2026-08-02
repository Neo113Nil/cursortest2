package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.soloader.DoNotOptimize;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.a320;
import xsna.ahq;
import xsna.b320;
import xsna.bpn0;
import xsna.hgl;
import xsna.id7;
import xsna.kcl;
import xsna.kvb0;
import xsna.l7j;
import xsna.m4s;
import xsna.meq0;
import xsna.n7l;
import xsna.rip;
import xsna.s200;
import xsna.uhd0;
import xsna.uk6;
import xsna.uso0;
import xsna.uvf;
import xsna.vvb0;
import xsna.wp80;
import xsna.x9g0;
import xsna.yhd0;
import xsna.zuk0;

/* loaded from: classes12.dex */
public final class LocalExifThumbnailProducer implements uso0<rip> {
    public final Executor a;
    public final b320 b;
    public final ContentResolver c;

    @DoNotOptimize
    public class Api24Utils {
    }

    public class a extends zuk0<rip> {
        public final /* synthetic */ ImageRequest g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l7j l7jVar, yhd0 yhd0Var, uhd0 uhd0Var, ImageRequest imageRequest) {
            super(l7jVar, yhd0Var, uhd0Var, "LocalExifThumbnailProducer");
            this.g = imageRequest;
        }

        @Override // xsna.zuk0
        public final void b(Object obj) {
            rip.c((rip) obj);
        }

        @Override // xsna.zuk0
        public final Map c(rip ripVar) {
            return ImmutableMap.a("createdThumbnail", Boolean.toString(ripVar != null));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x003e A[Catch: IOException -> 0x000f, StackOverflowError -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x000f, StackOverflowError -> 0x004c, blocks: (B:49:0x0011, B:51:0x001c, B:53:0x0022, B:54:0x0028, B:61:0x0034, B:58:0x003e), top: B:48:0x0011 }] */
        @Override // xsna.zuk0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object d() throws Exception {
            AssetFileDescriptor openAssetFileDescriptor;
            ExifInterface exifInterface;
            MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream;
            ByteBuffer byteBuffer;
            BitmapFactory.Options options;
            int intValue;
            int intValue2;
            kcl v;
            Uri uri = this.g.b;
            LocalExifThumbnailProducer localExifThumbnailProducer = LocalExifThumbnailProducer.this;
            ContentResolver contentResolver = localExifThumbnailProducer.c;
            String a = meq0.a(contentResolver, uri);
            rip ripVar = null;
            r4 = null;
            Pair pair = null;
            ripVar = null;
            if (a != null) {
                try {
                    File file = new File(a);
                    if (file.exists() && file.canRead()) {
                        exifInterface = new ExifInterface(a);
                    } else {
                        if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(meq0.b(uri))) {
                            try {
                                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            } catch (FileNotFoundException unused) {
                            }
                            if (openAssetFileDescriptor != null) {
                                ExifInterface exifInterface2 = new ExifInterface(openAssetFileDescriptor.getFileDescriptor());
                                openAssetFileDescriptor.close();
                                exifInterface = exifInterface2;
                            }
                        }
                        openAssetFileDescriptor = null;
                        if (openAssetFileDescriptor != null) {
                        }
                    }
                } catch (IOException unused2) {
                } catch (StackOverflowError unused3) {
                    ahq.a(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
                }
                if (exifInterface != null && exifInterface.hasThumbnail()) {
                    byte[] thumbnail = exifInterface.getThumbnail();
                    thumbnail.getClass();
                    b320 b320Var = localExifThumbnailProducer.b;
                    b320Var.getClass();
                    memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(b320Var.a, thumbnail.length);
                    try {
                        try {
                            memoryPooledByteBufferOutputStream.write(thumbnail, 0, thumbnail.length);
                            a320 p = memoryPooledByteBufferOutputStream.p();
                            memoryPooledByteBufferOutputStream.close();
                            kvb0 kvb0Var = new kvb0(p);
                            bpn0 bpn0Var = id7.a;
                            byteBuffer = (ByteBuffer) ((vvb0) bpn0Var.getValue()).c();
                            if (byteBuffer == null) {
                                n7l.a aVar = n7l.a;
                                byteBuffer = ByteBuffer.allocate(16384);
                            }
                            options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            try {
                                options.inTempStorage = byteBuffer.array();
                                BitmapFactory.decodeStream(kvb0Var, null, options);
                                if (options.outWidth != -1 && options.outHeight != -1) {
                                    pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                                }
                                ((vvb0) bpn0Var.getValue()).a(byteBuffer);
                                String attribute = exifInterface.getAttribute("Orientation");
                                attribute.getClass();
                                int b = wp80.b(Integer.parseInt(attribute));
                                intValue = pair == null ? ((Integer) pair.first).intValue() : -1;
                                intValue2 = pair != null ? ((Integer) pair.second).intValue() : -1;
                                v = uvf.v(p);
                                try {
                                    ripVar = new rip(v);
                                    v.close();
                                    ripVar.c = hgl.a;
                                    ripVar.d = b;
                                    ripVar.f = intValue;
                                    ripVar.g = intValue2;
                                } catch (Throwable th) {
                                    uvf.q(v);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                ((vvb0) id7.a.getValue()).a(byteBuffer);
                                throw th2;
                            }
                        } catch (IOException e) {
                            s200.J(e);
                            throw null;
                        }
                    } catch (Throwable th3) {
                        memoryPooledByteBufferOutputStream.close();
                        throw th3;
                    }
                }
                return ripVar;
            }
            exifInterface = null;
            if (exifInterface != null) {
                byte[] thumbnail2 = exifInterface.getThumbnail();
                thumbnail2.getClass();
                b320 b320Var2 = localExifThumbnailProducer.b;
                b320Var2.getClass();
                memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(b320Var2.a, thumbnail2.length);
                memoryPooledByteBufferOutputStream.write(thumbnail2, 0, thumbnail2.length);
                a320 p2 = memoryPooledByteBufferOutputStream.p();
                memoryPooledByteBufferOutputStream.close();
                kvb0 kvb0Var2 = new kvb0(p2);
                bpn0 bpn0Var2 = id7.a;
                byteBuffer = (ByteBuffer) ((vvb0) bpn0Var2.getValue()).c();
                if (byteBuffer == null) {
                }
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                options.inTempStorage = byteBuffer.array();
                BitmapFactory.decodeStream(kvb0Var2, null, options);
                if (options.outWidth != -1) {
                    pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
                ((vvb0) bpn0Var2.getValue()).a(byteBuffer);
                String attribute2 = exifInterface.getAttribute("Orientation");
                attribute2.getClass();
                int b2 = wp80.b(Integer.parseInt(attribute2));
                if (pair == null) {
                }
                if (pair != null) {
                }
                v = uvf.v(p2);
                ripVar = new rip(v);
                v.close();
                ripVar.c = hgl.a;
                ripVar.d = b2;
                ripVar.f = intValue;
                ripVar.g = intValue2;
            }
            return ripVar;
        }
    }

    public class b extends uk6 {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // xsna.vhd0
        public final void c() {
            this.a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, b320 b320Var, ContentResolver contentResolver) {
        this.a = executor;
        this.b = b320Var;
        this.c = contentResolver;
    }

    @Override // xsna.uso0
    public final boolean a(x9g0 x9g0Var) {
        return m4s.w(512, 512, x9g0Var);
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        yhd0 q = uhd0Var.q();
        ImageRequest r = uhd0Var.r();
        uhd0Var.s("local", "exif");
        a aVar = new a(l7jVar, q, uhd0Var, r);
        uhd0Var.p(new b(aVar));
        this.a.execute(aVar);
    }
}
