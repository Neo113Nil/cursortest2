package com.vk.im.converters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import com.vk.medianative.MediaImageEncoder;
import com.vk.metrics.eventtracking.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import xsna.e43;
import xsna.f8r;
import xsna.kjw;
import xsna.s3q0;
import xsna.yjt;

/* compiled from: ImJpegConverter.kt */
/* loaded from: classes2.dex */
public class ImJpegConverter implements f8r {
    public static final List<String> b = e43.l("GPSAltitude", "GPSAltitudeRef", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSTimeStamp", "Make", "Model", "DateTime");
    public final int a;

    /* compiled from: ImJpegConverter.kt */
    public static final class MediaCompressionException extends RuntimeException {
    }

    public /* synthetic */ ImJpegConverter() {
        this(100);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #2 {all -> 0x000e, blocks: (B:5:0x000a, B:13:0x0011, B:18:0x0040, B:20:0x004a, B:27:0x005f, B:22:0x0068, B:23:0x006f, B:34:0x0058, B:35:0x0070, B:36:0x0077, B:40:0x003a, B:25:0x0050, B:15:0x0015, B:17:0x001b), top: B:4:0x000a, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[Catch: all -> 0x000e, TryCatch #2 {all -> 0x000e, blocks: (B:5:0x000a, B:13:0x0011, B:18:0x0040, B:20:0x004a, B:27:0x005f, B:22:0x0068, B:23:0x006f, B:34:0x0058, B:35:0x0070, B:36:0x0077, B:40:0x003a, B:25:0x0050, B:15:0x0015, B:17:0x001b), top: B:4:0x000a, inners: #0, #1 }] */
    @Override // xsna.f8r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri a(Context context, Uri uri, File file, yjt yjtVar) {
        int e;
        Uri fromFile = Uri.fromFile(file);
        Bitmap bitmap = null;
        if (yjtVar != null) {
            try {
                yjtVar.onProgress(0, 100);
            } finally {
            }
        }
        Bitmap c = c(context, uri);
        try {
            e = kjw.e(context, uri);
        } catch (Throwable th) {
            b.a.a(th);
        }
        if (e != 0) {
            int width = c.getWidth();
            int height = c.getHeight();
            Matrix matrix = new Matrix();
            matrix.preRotate(e);
            s3q0 s3q0Var = s3q0.a;
            bitmap = Bitmap.createBitmap(c, 0, 0, width, height, matrix, false);
            c.recycle();
            if (MediaImageEncoder.INSTANCE.encodeJpeg(bitmap, file, this.a)) {
                throw new MediaCompressionException("Photo compress failed");
            }
            if (!file.exists()) {
                throw new FileNotFoundException("Compressed jpeg not found after compress");
            }
            try {
                kjw.a(context, uri, fromFile, b);
            } catch (Throwable th2) {
                b.a.a(th2);
            }
            if (yjtVar != null) {
                yjtVar.onProgress(100, 100);
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
            return fromFile;
        }
        bitmap = c;
        if (MediaImageEncoder.INSTANCE.encodeJpeg(bitmap, file, this.a)) {
        }
    }

    @Override // xsna.f8r
    public boolean b(Context context, Uri uri) {
        return !kjw.i(context, uri);
    }

    public Bitmap c(Context context, Uri uri) {
        return kjw.b(context, uri);
    }

    public ImJpegConverter(int i) {
        this.a = i;
    }
}
