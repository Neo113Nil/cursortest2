package c6;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: c6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5751c implements T5.l<Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    public static final T5.h<Integer> f56545b = T5.h.c(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c, reason: collision with root package name */
    public static final T5.h<Bitmap.CompressFormat> f56546c = T5.h.d("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a, reason: collision with root package name */
    private final W5.b f56547a;

    public C5751c(@NonNull W5.b bVar) {
        this.f56547a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    @Override // T5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(@NonNull Object obj, @NonNull File file, @NonNull T5.i iVar) {
        boolean z11;
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) ((V5.v) obj).get();
        T5.h<Bitmap.CompressFormat> hVar = f56546c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.a(hVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i11 = p6.g.f80269b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) iVar.a(f56545b)).intValue();
        com.bumptech.glide.load.data.c cVar = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
        try {
            cVar = new com.bumptech.glide.load.data.c(fileOutputStream, this.f56547a);
            bitmap.compress(compressFormat, intValue, cVar);
            cVar.close();
            try {
                cVar.close();
            } catch (IOException unused) {
            }
            z11 = true;
        } catch (IOException e12) {
            e = e12;
            cVar = fileOutputStream;
            if (Log.isLoggable("BitmapEncoder", 3)) {
                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
            }
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (IOException unused2) {
                }
            }
            z11 = false;
            if (Log.isLoggable("BitmapEncoder", 2)) {
            }
            return z11;
        } catch (Throwable th3) {
            th = th3;
            cVar = fileOutputStream;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + p6.l.c(bitmap) + " in " + p6.g.a(elapsedRealtimeNanos) + ", options format: " + iVar.a(hVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z11;
    }

    @Override // T5.l
    @NonNull
    public final T5.c b(@NonNull T5.i iVar) {
        return T5.c.TRANSFORMED;
    }
}
