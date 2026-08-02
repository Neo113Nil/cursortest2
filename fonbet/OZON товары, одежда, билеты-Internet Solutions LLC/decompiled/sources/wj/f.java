package wj;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.harLogger.HttpArchive;
import vj.C10324a;

/* loaded from: classes10.dex */
public final class f {
    @NotNull
    public static final HttpArchive a(@NotNull Cursor cursor, @NotNull C10324a harLogConfig) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(harLogConfig, "harLogConfig");
        Tc.b builder = C7714v.B();
        while (cursor.moveToNext()) {
            String b11 = b(cursor, ImagesContract.URL);
            builder.add(new e(cursor.getLong(cursor.getColumnIndexOrThrow("countSession")), b11, b(cursor, "http_version"), b(cursor, "method"), cursor.getInt(cursor.getColumnIndexOrThrow("response_code")), b(cursor, "response_message"), b(cursor, "request_headers"), b(cursor, "response_headers"), cursor.isNull(cursor.getColumnIndexOrThrow("request_body")) ? null : cursor.getBlob(cursor.getColumnIndexOrThrow("request_body")), cursor.isNull(cursor.getColumnIndexOrThrow("response_body")) ? null : cursor.getBlob(cursor.getColumnIndexOrThrow("response_body")), cursor.getLong(cursor.getColumnIndexOrThrow("time")), cursor.getLong(cursor.getColumnIndexOrThrow("response_time"))));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return b.a(builder.B(), harLogConfig);
    }

    private static final String b(Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow(str));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public static final ContentValues c(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("countSession", Long.valueOf(eVar.b()));
        contentValues.put(ImagesContract.URL, eVar.m());
        contentValues.put("http_version", eVar.c());
        contentValues.put("method", eVar.d());
        contentValues.put("response_code", Integer.valueOf(eVar.h()));
        contentValues.put("response_message", eVar.j());
        contentValues.put("request_headers", eVar.f());
        contentValues.put("response_headers", eVar.i());
        contentValues.put("request_body", eVar.e());
        contentValues.put("response_body", eVar.g());
        contentValues.put("time", Long.valueOf(eVar.l()));
        contentValues.put("response_time", Long.valueOf(eVar.k()));
        return contentValues;
    }

    public static final long d(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (cursor.getCount() == 0) {
            return 0L;
        }
        cursor.moveToFirst();
        return cursor.getLong(cursor.getColumnIndexOrThrow("countSession"));
    }
}
