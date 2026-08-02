package io.appmetrica.analytics.coreapi.internal.db;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.sql.SQLException;
import org.json.JSONException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class DatabaseScript {
    public abstract void runScript(@NonNull SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException;
}
