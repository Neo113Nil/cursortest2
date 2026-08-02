package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class udc implements xd4 {
    public static final String[] d = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ udc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xd4
    public final void a() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.c).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
        }
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ContentResolver contentResolver = ((Context) obj).getContentResolver();
                Uri uri = (Uri) this.c;
                Cursor query = contentResolver.query(uri, d, null, null, null);
                if (query != null) {
                    try {
                        r8 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(r8)) {
                    wd4Var.l(new File(r8));
                    return;
                }
                wd4Var.d(new FileNotFoundException("Failed to find file path for: " + uri));
                return;
            case 1:
                wd4Var.l(((q92) this.c).g((byte[]) obj));
                return;
            default:
                try {
                    ByteArrayInputStream u = a99.u((String) obj);
                    this.c = u;
                    wd4Var.l(u);
                    return;
                } catch (IllegalArgumentException e) {
                    wd4Var.d(e);
                    return;
                }
        }
    }

    @Override // defpackage.xd4
    public final Class c() {
        switch (this.a) {
            case 0:
                return File.class;
            case 1:
                return ((q92) this.c).c();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.xd4
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.xd4
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }

    public udc(String str, a99 a99Var) {
        this.a = 2;
        this.b = str;
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }
}
