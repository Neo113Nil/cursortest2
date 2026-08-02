package yj;

import android.database.Cursor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;
import ru.ozon.android.ozonLogger.core.c;

/* renamed from: yj.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10913d {
    private static final String a(Cursor cursor, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return null;
        }
        return cursor.getString(columnIndexOrThrow);
    }

    @NotNull
    public static final Tc.b b(@NotNull Cursor cursor) {
        xj.a aVar;
        Boolean bool;
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Tc.b builder = C7714v.B();
        while (cursor.moveToNext()) {
            long j11 = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
            String string = cursor.getString(cursor.getColumnIndexOrThrow("message"));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            c.a aVar2 = ru.ozon.android.ozonLogger.core.c.Companion;
            int i11 = cursor.getInt(cursor.getColumnIndexOrThrow("level"));
            aVar2.getClass();
            ru.ozon.android.ozonLogger.core.c a11 = c.a.a(i11);
            String a12 = a(cursor, "tag");
            String a13 = a(cursor, "custom_fields");
            Boolean bool2 = null;
            if (a13 != null) {
                JSONObject jSONObject = new JSONObject(a13);
                LinkedHashMap fields = new LinkedHashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    fields.put(next, jSONObject.opt(next));
                }
                Intrinsics.checkNotNullParameter(fields, "fields");
                aVar = new xj.a(fields);
            } else {
                aVar = null;
            }
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("is_local");
            Integer valueOf = cursor.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow));
            if (valueOf != null) {
                bool = Boolean.valueOf(valueOf.intValue() != 0);
            } else {
                bool = null;
            }
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("uuid"));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            UUID fromString = UUID.fromString(string2);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
            AndroidLogEntry androidLogEntry = new AndroidLogEntry(j11, a11, string, fromString, aVar, bool, a12);
            androidLogEntry.setService$ozon_logger_android_release(a(cursor, "service"));
            androidLogEntry.setTeam$ozon_logger_android_release(a(cursor, "team"));
            androidLogEntry.setGroup$ozon_logger_android_release(a(cursor, "_group"));
            androidLogEntry.setAppUuid$ozon_logger_android_release(a(cursor, "app_uuid"));
            androidLogEntry.setOzonId$ozon_logger_android_release(a(cursor, "ozon_id"));
            androidLogEntry.setUserId$ozon_logger_android_release(a(cursor, "user_id"));
            androidLogEntry.setSessionId$ozon_logger_android_release(a(cursor, "session_id"));
            androidLogEntry.setAppVersion$ozon_logger_android_release(a(cursor, "app_version"));
            androidLogEntry.setEnv$ozon_logger_android_release(a(cursor, "env"));
            androidLogEntry.setModel$ozon_logger_android_release(a(cursor, "model"));
            androidLogEntry.setManufacturer$ozon_logger_android_release(a(cursor, "manufacturer"));
            androidLogEntry.setPlatform$ozon_logger_android_release(a(cursor, "platform"));
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("first_launch");
            Integer valueOf2 = cursor.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow2));
            if (valueOf2 != null) {
                bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
            }
            androidLogEntry.setFirstLaunch$ozon_logger_android_release(bool2);
            builder.add(androidLogEntry);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
