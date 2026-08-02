package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class iif implements xd4 {
    public static final String[] k = {"_data"};
    public final Context a;
    public final otc b;
    public final otc c;
    public final Uri d;
    public final int e;
    public final int f;
    public final uvd g;
    public final Class h;
    public volatile boolean i;
    public volatile xd4 j;

    public iif(Context context, otc otcVar, otc otcVar2, Uri uri, int i, int i2, uvd uvdVar, Class cls) {
        this.a = context.getApplicationContext();
        this.b = otcVar;
        this.c = otcVar2;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.g = uvdVar;
        this.h = cls;
    }

    @Override // defpackage.xd4
    public final void a() {
        xd4 xd4Var = this.j;
        if (xd4Var != null) {
            xd4Var.a();
        }
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        try {
            xd4 d = d();
            if (d == null) {
                wd4Var.d(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.j = d;
                if (this.i) {
                    cancel();
                } else {
                    d.b(k7fVar, wd4Var);
                }
            }
        } catch (FileNotFoundException e) {
            wd4Var.d(e);
        }
    }

    @Override // defpackage.xd4
    public final Class c() {
        return this.h;
    }

    @Override // defpackage.xd4
    public final void cancel() {
        this.i = true;
        xd4 xd4Var = this.j;
        if (xd4Var != null) {
            xd4Var.cancel();
        }
    }

    public final xd4 d() {
        ntc a;
        Throwable th;
        boolean isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.a;
        Uri uri = this.d;
        uvd uvdVar = this.g;
        int i = this.f;
        int i2 = this.e;
        if (isExternalStorageLegacy) {
            try {
                Cursor query = context.getContentResolver().query(uri, k, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            query.close();
                            a = this.b.a(file, i2, i, uvdVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            boolean g = aa.g(uri);
            otc otcVar = this.c;
            if (g && uri.getPathSegments().contains("picker")) {
                a = otcVar.a(uri, i2, i, uvdVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(uri);
                }
                a = otcVar.a(uri, i2, i, uvdVar);
            }
        }
        if (a != null) {
            return a.c;
        }
        return null;
    }

    @Override // defpackage.xd4
    public final int e() {
        return 1;
    }
}
