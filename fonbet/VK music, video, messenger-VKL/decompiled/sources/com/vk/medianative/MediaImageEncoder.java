package com.vk.medianative;

import android.graphics.Bitmap;
import com.vk.image.coder.ImageCoder;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Result;

/* compiled from: MediaImageEncoder.kt */
/* loaded from: classes3.dex */
public final class MediaImageEncoder {
    public static final MediaImageEncoder INSTANCE = new MediaImageEncoder();

    public static /* synthetic */ boolean encodeJpeg$default(MediaImageEncoder mediaImageEncoder, Bitmap bitmap, File file, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 86;
        }
        return mediaImageEncoder.encodeJpeg(bitmap, file, i);
    }

    public final boolean encodeJpeg(Bitmap bitmap, File file) {
        return encodeJpeg$default(this, bitmap, file, 0, 4, null);
    }

    public final boolean encodeJpegWithoutCompression(Bitmap bitmap, File file) {
        return encodeJpeg(bitmap, file, 100);
    }

    public final boolean encodeJpeg(Bitmap bitmap, File file, int i) {
        Object failure;
        Object failure2;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (bitmap.getHeight() * bitmap.getWidth() != 0) {
                L l = L.a;
                l.getClass();
                LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"Start to encode"});
                }
                try {
                    boolean a = ImageCoder.a.a(bitmap, file.getPath(), i);
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"Encoding by jpegli result=" + a});
                    }
                    failure = Boolean.valueOf(a);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.e, new Object[]{"Encoding by jpegli crashed"});
                    }
                    L.i(a2);
                    failure = Boolean.FALSE;
                }
                if (((Boolean) failure).booleanValue()) {
                    return true;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.d, new Object[]{"Encoding by system result=" + compress});
                        }
                        fileOutputStream.close();
                        failure2 = Boolean.TRUE;
                    } finally {
                    }
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                Throwable a3 = Result.a(failure2);
                if (a3 != null) {
                    L l4 = L.a;
                    l4.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l4, L.LogType.e, new Object[]{"Encoding by system crashed"});
                    }
                    L.i(a3);
                    failure2 = Boolean.FALSE;
                }
                return ((Boolean) failure2).booleanValue();
            }
        }
        L l5 = L.a;
        l5.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return false;
        }
        L.u(l5, L.LogType.w, new Object[]{"can't encode recycle or empty image!"});
        return false;
    }
}
