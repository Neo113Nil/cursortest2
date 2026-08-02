package wj;

import Ej.p;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements DatabaseErrorHandler {
    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        p.c("Har logs database is corrupted! Recreating...", null);
        try {
            sQLiteDatabase.close();
        } catch (Throwable unused) {
        }
        SQLiteDatabase.deleteDatabase(new File(sQLiteDatabase.getPath()));
    }
}
