package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: ProfileInstaller.java */
/* loaded from: classes.dex */
public final class c {
    public static final a a = new a();

    /* compiled from: ProfileInstaller.java */
    public class b implements InterfaceC0079c {
        @Override // androidx.profileinstaller.c.InterfaceC0079c
        public final void a(int i, @Nullable Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public interface InterfaceC0079c {
        void a(int i, @Nullable Object obj);
    }

    public static void a(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(@NonNull Context context, @NonNull Executor executor, @NonNull InterfaceC0079c interfaceC0079c, boolean z) {
        boolean f;
        boolean z2;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z3 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z2 = readLong == packageInfo.lastUpdateTime;
                            if (z2) {
                                interfaceC0079c.a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z2) {
                        context.getPackageName();
                        d.c(context, false);
                        return;
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            context.getPackageName();
            androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assets, executor, interfaceC0079c, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (bVar.a()) {
                androidx.profileinstaller.b c = bVar.c();
                c.e();
                f = c.f();
                if (f) {
                    a(packageInfo, filesDir);
                }
            } else {
                f = false;
            }
            if (f && z) {
                z3 = true;
            }
            d.c(context, z3);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC0079c.a(7, e);
            d.c(context, false);
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* loaded from: classes12.dex */
    public class a implements InterfaceC0079c {
        @Override // androidx.profileinstaller.c.InterfaceC0079c
        public final void a(int i, @Nullable Object obj) {
        }
    }
}
