package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class yr8 implements gni {
    public final SQLiteProgram a;

    public yr8(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.a = sQLiteProgram;
    }

    @Override // defpackage.gni
    public final void J0(double d, int i) {
        this.a.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.gni
    public final void m0(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }

    @Override // defpackage.gni
    public final void q(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.gni
    public final void r(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.gni
    public final void s(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.gni
    public final void z() {
        this.a.clearBindings();
    }
}
