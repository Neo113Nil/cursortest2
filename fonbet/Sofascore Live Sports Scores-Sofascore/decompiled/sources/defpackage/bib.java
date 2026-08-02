package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class bib implements xd4 {
    public final boolean a;
    public final Uri b;
    public final ContentResolver c;
    public Object d;

    public bib(ContentResolver contentResolver, Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    @Override // defpackage.xd4
    public final void a() {
        Object obj = this.d;
        if (obj != null) {
            try {
                d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        try {
            Object f = f(this.c, this.b);
            this.d = f;
            wd4Var.l(f);
        } catch (FileNotFoundException e) {
            wd4Var.d(e);
        }
    }

    public abstract void d(Object obj);

    @Override // defpackage.xd4
    public final int e() {
        return 1;
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // defpackage.xd4
    public final void cancel() {
    }
}
