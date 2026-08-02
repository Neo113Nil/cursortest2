package n2;

import com.sports.insider.data.repository.room.live.LiveTable;
import gf.n;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f20819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20820b;

    public b(int i5, int i10) {
        this.f20819a = i5;
        this.f20820b = i10;
    }

    public void a(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection instanceof v2.a) {
            b(((v2.a) connection).f24390a);
        } else {
            Intrinsics.checkNotNullParameter("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.", LiveTable.messageColumn);
            throw new n("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
    }

    public void b(t2.a db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.", LiveTable.messageColumn);
        throw new n("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
