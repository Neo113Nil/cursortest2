package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ow1 implements m1g {
    public static final ivd b = ivd.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final ivd c = new ivd("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, ivd.e);
    public final kn4 a;

    public ow1(kn4 kn4Var) {
        this.a = kn4Var;
    }

    @Override // defpackage.m1g
    public final int g(uvd uvdVar) {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    @Override // defpackage.gn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Object obj, File file, uvd uvdVar) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((e1g) obj).get();
        ivd ivdVar = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) uvdVar.c(ivdVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = vib.a;
        SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) uvdVar.c(b)).intValue();
        OutputStream outputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            kn4 kn4Var = this.a;
            if (kn4Var != null) {
                try {
                    outputStream = new j62(fileOutputStream, kn4Var);
                } catch (IOException unused) {
                    outputStream = fileOutputStream;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    z = false;
                    if (Log.isLoggable("BitmapEncoder", 2)) {
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    outputStream = fileOutputStream;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } else {
                outputStream = fileOutputStream;
            }
            bitmap.compress(compressFormat, intValue, outputStream);
            outputStream.close();
            try {
                outputStream.close();
            } catch (IOException unused4) {
            }
            z = true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormat);
            kik.r(bitmap);
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(uvdVar.c(ivdVar));
            bitmap.hasAlpha();
        }
        return z;
    }
}
