package yj;

import Ej.e;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;

/* renamed from: yj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10910a implements e<AndroidLogEntry> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sj.c f106763a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ej.b f106764b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C10912c f106765c;

    public C10910a(@NotNull sj.c config, @NotNull Ej.b currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f106763a = config;
        this.f106764b = currentTimeProvider;
        this.f106765c = new C10912c(config);
    }

    private final SQLiteDatabase e() {
        SQLiteDatabase writableDatabase = this.f106765c.getWritableDatabase();
        Intrinsics.checkNotNullExpressionValue(writableDatabase, "getWritableDatabase(...)");
        return writableDatabase;
    }

    @Override // Ej.e
    public final void a(AndroidLogEntry entry) {
        String str;
        Intrinsics.checkNotNullParameter(entry, "entry");
        SQLiteDatabase e11 = e();
        Intrinsics.checkNotNullParameter(entry, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", entry.getUuid().toString());
        contentValues.put("timestamp", Long.valueOf(entry.getTimestamp()));
        contentValues.put("message", entry.getMessage());
        contentValues.put("level", Integer.valueOf(entry.getLevel().b()));
        contentValues.put("tag", entry.getTag());
        contentValues.put("service", entry.getService());
        contentValues.put("app_uuid", entry.getAppUuid());
        contentValues.put("team", entry.getTeam());
        contentValues.put("_group", entry.getGroup());
        contentValues.put("ozon_id", entry.getOzonId());
        contentValues.put("user_id", entry.getUserId());
        contentValues.put("session_id", entry.getSessionId());
        contentValues.put("app_version", entry.getAppVersion());
        contentValues.put("platform", entry.getPlatform());
        contentValues.put("env", entry.getEnv());
        contentValues.put("model", entry.getModel());
        contentValues.put("manufacturer", entry.getManufacturer());
        Boolean isFirstLaunch = entry.getIsFirstLaunch();
        contentValues.put("first_launch", isFirstLaunch != null ? Integer.valueOf(isFirstLaunch.booleanValue() ? 1 : 0) : null);
        ru.ozon.android.ozonLogger.core.a customFields = entry.getCustomFields();
        if (customFields != null) {
            JSONObject jSONObject = new JSONObject();
            customFields.b(jSONObject);
            str = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        } else {
            str = null;
        }
        contentValues.put("custom_fields", str);
        Boolean isLocal = entry.getIsLocal();
        contentValues.put("is_local", isLocal != null ? Integer.valueOf(isLocal.booleanValue() ? 1 : 0) : null);
        contentValues.put("is_sent", (Integer) 0);
        e11.insert("logs", null, contentValues);
    }

    public final void b() {
        this.f106765c.close();
    }

    public final void c() {
        e().delete("logs", null, null);
    }

    public final void d() {
        this.f106764b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f106763a.h();
        e().delete("logs", h.E0("\n                timestamp < " + currentTimeMillis + "\n                AND (is_local = 1 OR is_sent = 1)\n            "), null);
    }

    public final void f(@NotNull List<AndroidLogEntry> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        e().beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_sent", (Integer) 1);
            Iterator<AndroidLogEntry> it = entries.iterator();
            while (it.hasNext()) {
                e().update("logs", contentValues, "uuid = ?", new String[]{it.next().getUuid().toString()});
            }
            e().setTransactionSuccessful();
            e().endTransaction();
        } catch (Throwable th2) {
            e().endTransaction();
            throw th2;
        }
    }

    @NotNull
    public final Tc.b g() {
        Cursor rawQuery = e().rawQuery("SELECT * FROM logs ORDER BY rowid ASC", null);
        try {
            Intrinsics.f(rawQuery);
            Tc.b b11 = C10913d.b(rawQuery);
            rawQuery.close();
            return b11;
        } finally {
        }
    }

    @NotNull
    public final Tc.b h() {
        Cursor rawQuery = e().rawQuery("SELECT * FROM logs\nWHERE is_sent = 0\nAND is_local = 0\nORDER BY rowid ASC", null);
        try {
            Intrinsics.f(rawQuery);
            Tc.b b11 = C10913d.b(rawQuery);
            rawQuery.close();
            return b11;
        } finally {
        }
    }

    public final long i() {
        Cursor rawQuery = e().rawQuery("SELECT count(*) FROM logs\nWHERE is_sent = 0\nAND is_local = 0", null);
        try {
            rawQuery.moveToFirst();
            long j11 = rawQuery.getLong(0);
            Vd0.b.a(rawQuery, null);
            return j11;
        } finally {
        }
    }
}
