package vh0;

import Zg0.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dh0.C6200a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f102970a;

    /* renamed from: b, reason: collision with root package name */
    private final File f102971b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f102972c;

    public static final class a extends LruCache<String, Bitmap> {
        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            String key = str;
            Bitmap bitmap2 = bitmap;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
            return bitmap2.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
        }
    }

    public o(@NotNull Context context, @NotNull Zg0.j config) {
        File file;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f102970a = new ReentrantLock();
        try {
            file = new File(context.getCacheDir(), "small_icons");
            file.mkdirs();
        } catch (Exception e11) {
            Zg0.d b11 = C6200a.b();
            if (b11 instanceof d.b) {
                C6200a.c().a(C6200a.a("Failed to create disk-cache dir because of " + e11), e11);
                ((d.b) b11).getClass();
            }
            file = null;
        }
        this.f102971b = file;
        this.f102972c = new a(config.a());
    }

    private final void c(Bitmap bitmap, String str) {
        a aVar = this.f102972c;
        if (kotlin.text.h.K(str)) {
            return;
        }
        ReentrantLock reentrantLock = this.f102970a;
        reentrantLock.lock();
        try {
            if (aVar.get(str) == null) {
                aVar.put(str, bitmap);
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Bitmap a(@NotNull String fileName) {
        File file;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (kotlin.text.h.K(fileName)) {
            return null;
        }
        Bitmap bitmap = this.f102972c.get(fileName);
        if (bitmap != null) {
            return bitmap;
        }
        if (kotlin.text.h.K(fileName) || (file = this.f102971b) == null) {
            return null;
        }
        File file2 = new File(file, fileName);
        if (!file2.exists()) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(file2.getAbsolutePath());
        Intrinsics.f(decodeFile);
        c(decodeFile, fileName);
        return decodeFile;
    }

    public final void b(@NotNull Bitmap bitmap, @NotNull String fileName) {
        File file;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        c(bitmap, fileName);
        if (kotlin.text.h.K(fileName) || (file = this.f102971b) == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, fileName));
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Exception e11) {
            Zg0.d b11 = C6200a.b();
            if (b11 instanceof d.b) {
                C6200a.c().a(C6200a.a("Failed to put bitmap to disk cache because of " + e11), e11);
                ((d.b) b11).getClass();
            }
        }
    }
}
