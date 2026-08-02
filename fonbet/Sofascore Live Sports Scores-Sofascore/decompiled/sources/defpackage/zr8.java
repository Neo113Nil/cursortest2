package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zr8 extends yr8 implements mni {
    public final SQLiteStatement b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr8(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.b = sQLiteStatement;
    }

    @Override // defpackage.mni
    public final int F() {
        return this.b.executeUpdateDelete();
    }

    @Override // defpackage.mni
    public final long h0() {
        return this.b.executeInsert();
    }

    @Override // defpackage.mni
    public final void v() {
        this.b.execute();
    }
}
