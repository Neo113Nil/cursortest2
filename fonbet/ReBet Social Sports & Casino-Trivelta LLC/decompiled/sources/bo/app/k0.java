package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final l5 f25629a;

    public k0(File file) {
        Pattern pattern = l5.f25702o;
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        l5 l5Var = new l5(file);
        if (l5Var.f25706b.exists()) {
            try {
                l5Var.c();
                l5Var.b();
            } catch (IOException e10) {
                BrazeLogger.w(l5.f25703p, "DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                l5Var.a();
                bh.a(l5Var.f25705a);
            }
            Intrinsics.checkNotNullExpressionValue(l5Var, "open(...)");
            this.f25629a = l5Var;
        }
        file.mkdirs();
        l5Var = new l5(file);
        l5Var.d();
        Intrinsics.checkNotNullExpressionValue(l5Var, "open(...)");
        this.f25629a = l5Var;
    }

    public static final String c(String str, String str2) {
        return "Failed to load image from disk cache: " + str + "/" + str2;
    }

    public static final String d(String str, String str2) {
        return "Error while producing output stream or compressing bitmap for key " + str + " diskKey " + str2;
    }

    public final boolean a(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final String valueOf = String.valueOf(key.hashCode());
        try {
            k5 b10 = this.f25629a.b(valueOf);
            boolean z10 = b10 != null;
            CloseableKt.closeFinally(b10, null);
            return z10;
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: c3.y4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k0.a(key, valueOf);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final Bitmap b(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final String valueOf = String.valueOf(key.hashCode());
        try {
            k5 b10 = this.f25629a.b(valueOf);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(b10.f25652a[0]);
                CloseableKt.closeFinally(b10, null);
                return decodeStream;
            } finally {
            }
        } catch (Throwable th2) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: c3.z4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k0.b(key, valueOf);
                }
            }, 4, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.A4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k0.c(key, valueOf);
                }
            }, 7, (Object) null);
            return null;
        }
    }

    public static final String a(String str, String str2) {
        return "Error while retrieving disk for key " + str + " diskKey " + str2;
    }

    public final void a() {
        try {
            this.f25629a.a();
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: c3.w4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k0.b();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final String key, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final String valueOf = String.valueOf(key.hashCode());
        try {
            j5 a10 = this.f25629a.a(valueOf);
            OutputStream a11 = a10.a();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, a11);
                a11.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(a11, null);
                if (a10.f25598c) {
                    a10.f25599d.a(a10, false);
                    a10.f25599d.d(a10.f25596a.f25388a);
                } else {
                    a10.f25599d.a(a10, true);
                }
            } finally {
            }
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: c3.x4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k0.d(key, valueOf);
                }
            }, 4, (Object) null);
        }
    }

    public static final String b(String str, String str2) {
        return "Failed to get bitmap from disk cache for key " + str + " diskKey " + str2;
    }

    public static final String b() {
        return "Failed to shutdown disk cache";
    }
}
