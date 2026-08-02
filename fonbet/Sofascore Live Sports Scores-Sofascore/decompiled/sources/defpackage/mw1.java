package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class mw1 {
    public final Context a;
    public final String b;
    public final File c;
    public final ReentrantLock d;

    public mw1(Context context, int i, String str) {
        String path;
        this.a = context;
        this.b = str;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.d = reentrantLock;
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || (path = externalCacheDir.getPath()) == null) {
            path = context.getCacheDir().getPath();
            path.getClass();
        }
        File file = new File(lnb.o(path, File.separator, str));
        this.c = file;
        reentrantLock.lock();
        try {
            a();
            if (!file.exists()) {
                file.mkdirs();
            }
            b(i);
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static String d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + str.substring(length).hashCode();
    }

    public final void a() {
        SharedPreferences d;
        SharedPreferences d2;
        if (this.b.equals("Logos")) {
            if (this.c.exists()) {
                Context context = this.a;
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences = d2;
                }
                if (!sharedPreferences.getBoolean("DELETED_OLD_LOGOS", false)) {
                    b(0);
                }
            }
            Context context2 = this.a;
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = context2.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext2);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences2 = d;
            }
            SharedPreferences.Editor i = dmi.i(sharedPreferences2, "DELETED_OLD_LOGOS", true);
            Unit unit = Unit.a;
            i.apply();
        }
    }

    public final void b(int i) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            File[] listFiles = this.c.listFiles();
            if (listFiles != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(5, -i);
                for (File file : listFiles) {
                    if (calendar.getTimeInMillis() > file.lastModified()) {
                        file.delete();
                    }
                }
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Bitmap c(String str) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            File file = new File(this.c, d(str));
            return file.exists() ? BitmapFactory.decodeFile(file.getPath()) : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(Bitmap bitmap, String str) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.c, d(str)));
                if (bitmap != null) {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    } finally {
                    }
                }
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Unit unit = Unit.a;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
