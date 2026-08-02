package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import io.requery.android.database.sqlite.SQLiteDatabaseConfiguration;
import xsna.drm0;
import xsna.epx;

/* compiled from: Room.android.kt */
/* loaded from: classes.dex */
public final class i {
    public static final RoomDatabase.a a(Context context, String str, Class cls) {
        if (str == null || drm0.N(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (epx.f(str, SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new RoomDatabase.a(context, str, cls);
    }
}
