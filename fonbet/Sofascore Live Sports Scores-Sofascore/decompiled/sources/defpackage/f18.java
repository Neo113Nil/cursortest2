package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f18 implements xd4 {
    public final /* synthetic */ int a;
    public final Comparable b;
    public final Object c;
    public Object d;

    public /* synthetic */ f18(Comparable comparable, Object obj, int i) {
        this.a = i;
        this.b = comparable;
        this.c = obj;
    }

    public static f18 d(Context context, Uri uri, rgj rgjVar) {
        return new f18(uri, new ujg(a.a(context).c.a().e(), rgjVar, a.a(context).d, context.getContentResolver(), 2), 1);
    }

    @Override // defpackage.xd4
    public final void a() {
        switch (this.a) {
            case 0:
                Object obj = this.d;
                if (obj != null) {
                    try {
                        ((g18) this.c).f(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        switch (this.a) {
            case 0:
                try {
                    Object n = ((g18) this.c).n((File) this.b);
                    this.d = n;
                    wd4Var.l(n);
                    break;
                } catch (FileNotFoundException e) {
                    wd4Var.d(e);
                    return;
                }
            default:
                try {
                    InputStream h = h();
                    this.d = h;
                    wd4Var.l(h);
                    break;
                } catch (FileNotFoundException e2) {
                    wd4Var.d(e2);
                }
        }
    }

    @Override // defpackage.xd4
    public final Class c() {
        switch (this.a) {
            case 0:
                return ((g18) this.c).c();
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

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r5 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0041, code lost:
    
        if (r5 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream h() {
        Cursor cursor;
        InputStream openInputStream;
        int y;
        ujg ujgVar = (ujg) this.c;
        ContentResolver contentResolver = (ContentResolver) ujgVar.d;
        Uri uri = (Uri) this.b;
        Cursor cursor2 = null;
        r4 = null;
        r4 = null;
        InputStream inputStream = null;
        try {
            cursor = ((rgj) ujgVar.b).h(uri);
        } catch (SecurityException unused) {
            cursor = null;
        } catch (Throwable th) {
            th = th;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
                try {
                } catch (SecurityException unused2) {
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                        Objects.toString(uri);
                    }
                }
                if (cursor.moveToFirst()) {
                    String str = cursor.getString(0);
                    cursor.close();
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            File file = new File(str);
                            if (file.exists() && 0 < file.length()) {
                                Uri fromFile = Uri.fromFile(file);
                                try {
                                    openInputStream = contentResolver.openInputStream(fromFile);
                                    if (openInputStream != null) {
                                        try {
                                            inputStream = contentResolver.openInputStream(uri);
                                            y = ktm.y((ArrayList) ujgVar.e, inputStream, (kn4) ujgVar.c);
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException unused3) {
                                                }
                                            }
                                        } catch (IOException | NullPointerException unused4) {
                                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                                Objects.toString(uri);
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException unused5) {
                                                }
                                            }
                                        }
                                        return y != -1 ? new if6(openInputStream, y) : openInputStream;
                                    }
                                    y = -1;
                                    if (y != -1) {
                                    }
                                } catch (NullPointerException e) {
                                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
                                }
                            }
                        }
                        if (openInputStream != null) {
                        }
                        y = -1;
                        if (y != -1) {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        throw th2;
                    }
                    openInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }
    }

    private final void f() {
    }

    private final void g() {
    }
}
