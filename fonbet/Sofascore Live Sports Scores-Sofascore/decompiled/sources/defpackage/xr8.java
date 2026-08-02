package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xr8 implements fni {
    public final Context a;
    public final String b;
    public final ffb c;
    public final boolean d;
    public final boolean e;
    public final mqi f;
    public boolean g;

    public xr8(Context context, String str, ffb ffbVar, boolean z, boolean z2) {
        context.getClass();
        ffbVar.getClass();
        this.a = context;
        this.b = str;
        this.c = ffbVar;
        this.d = z;
        this.e = z2;
        this.f = ypa.b(new sr8(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mqi mqiVar = this.f;
        if (mqiVar.isInitialized()) {
            ((wr8) mqiVar.getValue()).close();
        }
    }

    @Override // defpackage.fni
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.fni
    public final dni getWritableDatabase() {
        return ((wr8) this.f.getValue()).e(true);
    }

    @Override // defpackage.fni
    public final void setWriteAheadLoggingEnabled(boolean z) {
        mqi mqiVar = this.f;
        if (mqiVar.isInitialized()) {
            ((wr8) mqiVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
