package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2999c implements com.bumptech.glide.load.m {

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f30030b = com.bumptech.glide.load.i.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.i f30031c = com.bumptech.glide.load.i.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f30032a;

    public C2999c(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f30032a = bVar;
    }

    @Override // com.bumptech.glide.load.m
    public com.bumptech.glide.load.c b(com.bumptech.glide.load.j jVar) {
        return com.bumptech.glide.load.c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:3:0x0021, B:15:0x0050, B:18:0x0065, B:20:0x006b, B:43:0x0086, B:41:0x0089, B:34:0x0060), top: B:2:0x0021 }] */
    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(com.bumptech.glide.load.engine.v vVar, File file, com.bumptech.glide.load.j jVar) {
        boolean z10;
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) vVar.get();
        Bitmap.CompressFormat d10 = d(bitmap, jVar);
        P4.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), d10);
        try {
            long b10 = com.bumptech.glide.util.g.b();
            int intValue = ((Integer) jVar.c(f30030b)).intValue();
            OutputStream outputStream = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                outputStream = this.f30032a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f30032a) : fileOutputStream;
                bitmap.compress(d10, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                } catch (IOException unused2) {
                }
                z10 = true;
            } catch (IOException unused3) {
                outputStream = fileOutputStream;
                Log.isLoggable("BitmapEncoder", 3);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                z10 = false;
                if (Log.isLoggable("BitmapEncoder", 2)) {
                }
                return z10;
            } catch (Throwable th3) {
                th = th3;
                outputStream = fileOutputStream;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(d10);
                com.bumptech.glide.util.l.i(bitmap);
                com.bumptech.glide.util.g.a(b10);
                Objects.toString(jVar.c(f30031c));
                bitmap.hasAlpha();
            }
            return z10;
        } finally {
            P4.b.e();
        }
    }

    public final Bitmap.CompressFormat d(Bitmap bitmap, com.bumptech.glide.load.j jVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) jVar.c(f30031c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}
