package wj;

import Ej.p;
import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class d extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final c f104576a = new c();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Application application) {
        super(application, "ozon_har_logger.db", null, 1, f104576a);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        p.b("Har logs database is created with version=1 on path " + db2.getPath());
        db2.execSQL("CREATE TABLE har_logs (\n    countSession INTEGER,\n    url TEXT ,\n    http_version TEXT, \n    method TEXT, \n    response_code INTEGER, \n    response_message TEXT, \n    request_headers TEXT, \n    response_headers TEXT, \n    request_body BLOB, \n    response_body BLOB, \n    time INTEGER, \n    response_time INTEGER\n);");
        p.b("Database table 'har_logs' is created. Scheme:\nCREATE TABLE har_logs (\n    countSession INTEGER,\n    url TEXT ,\n    http_version TEXT, \n    method TEXT, \n    response_code INTEGER, \n    response_message TEXT, \n    request_headers TEXT, \n    response_headers TEXT, \n    request_body BLOB, \n    response_body BLOB, \n    time INTEGER, \n    response_time INTEGER\n);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@NotNull SQLiteDatabase db2, int i11, int i12) {
        Intrinsics.checkNotNullParameter(db2, "db");
    }
}
