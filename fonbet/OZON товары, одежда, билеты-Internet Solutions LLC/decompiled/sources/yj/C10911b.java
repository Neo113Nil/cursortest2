package yj;

import Ej.p;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: yj.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C10911b implements DatabaseErrorHandler {
    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        p.c("Logs database is corrupted! Recreating...", null);
        try {
            sQLiteDatabase.close();
        } catch (Throwable unused) {
        }
        SQLiteDatabase.deleteDatabase(new File(sQLiteDatabase.getPath()));
    }
}
