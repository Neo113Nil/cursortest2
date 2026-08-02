package i2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import u.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final m f10896a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10897b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static y8.d f10898c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static y8.d b() {
        y8.d dVar = new y8.d();
        f10898c = dVar;
        f10896a.k(dVar);
        return f10898c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z5) {
        boolean z7;
        i a7;
        i iVar;
        int i5;
        if (z5 || f10898c == null) {
            synchronized (f10897b) {
                if (!z5) {
                    if (f10898c != null) {
                        return;
                    }
                }
                int i10 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z7 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z7 = false;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z10 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z11 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a7 = i.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a7 = null;
                        }
                        if (a7 != null && a7.f10894c == a10 && (i5 = a7.f10893b) != 2) {
                            i10 = i5;
                            if (z5 && z11 && i10 != 1) {
                                i10 = 2;
                            }
                            if (a7 != null && a7.f10893b == 2 && i10 == 1 && length < a7.f10895d) {
                                i10 = 3;
                            }
                            iVar = new i(1, i10, a10, length2);
                            if (a7 != null || !a7.equals(iVar)) {
                                iVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z10) {
                            i10 = 1;
                        } else if (z11) {
                            i10 = 2;
                        }
                        if (z5) {
                            i10 = 2;
                        }
                        if (a7 != null) {
                            i10 = 3;
                        }
                        iVar = new i(1, i10, a10, length2);
                        if (a7 != null) {
                        }
                        iVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
