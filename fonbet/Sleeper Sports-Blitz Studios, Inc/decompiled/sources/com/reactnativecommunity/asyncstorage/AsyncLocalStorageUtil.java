package com.reactnativecommunity.asyncstorage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ReadableArray;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AsyncLocalStorageUtil {
    static String buildKeySelection(int selectionCount) {
        String[] strArr = new String[selectionCount];
        Arrays.fill(strArr, "?");
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    static String[] buildKeySelectionArgs(ReadableArray keys, int start, int count) {
        String[] strArr = new String[count];
        for (int i = 0; i < count; i++) {
            strArr[i] = keys.getString(start + i);
        }
        return strArr;
    }

    @Nullable
    public static String getItemImpl(SQLiteDatabase db, String key) {
        Cursor query = db.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{key}, null, null, null);
        try {
            if (query.moveToFirst()) {
                return query.getString(0);
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    static boolean setItemImpl(SQLiteDatabase db, String key, String value) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(SDKConstants.PARAM_KEY, key);
        contentValues.put("value", value);
        return -1 != db.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }

    static boolean mergeImpl(SQLiteDatabase db, String key, String value) throws JSONException {
        String itemImpl = getItemImpl(db, key);
        if (itemImpl != null) {
            JSONObject jSONObject = new JSONObject(itemImpl);
            deepMergeInto(jSONObject, new JSONObject(value));
            value = jSONObject.toString();
        }
        return setItemImpl(db, key, value);
    }

    private static void deepMergeInto(JSONObject oldJSON, JSONObject newJSON) throws JSONException {
        Iterator<String> keys = newJSON.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = newJSON.optJSONObject(next);
            JSONObject optJSONObject2 = oldJSON.optJSONObject(next);
            if (optJSONObject != null && optJSONObject2 != null) {
                deepMergeInto(optJSONObject2, optJSONObject);
                oldJSON.put(next, optJSONObject2);
            } else {
                oldJSON.put(next, newJSON.get(next));
            }
        }
    }

    public static void verifyAndForceSqliteCheckpoint(Context ctx) {
        if (Build.VERSION.SDK_INT < 28) {
            Log.i("AsyncStorage_Next", "SQLite checkpoint not required on this API version.");
        }
        File databasePath = ctx.getDatabasePath("AsyncStorage");
        File databasePath2 = ctx.getDatabasePath(ReactDatabaseSupplier.DATABASE_NAME);
        if (databasePath.exists() || !databasePath2.exists()) {
            Log.i("AsyncStorage_Next", "SQLite checkpoint not required.");
            return;
        }
        try {
            ReactDatabaseSupplier reactDatabaseSupplier = ReactDatabaseSupplier.getInstance(ctx);
            reactDatabaseSupplier.get().rawQuery("PRAGMA wal_checkpoint", null).close();
            reactDatabaseSupplier.closeDatabase();
            Log.i("AsyncStorage_Next", "Forcing SQLite checkpoint successful.");
        } catch (Exception e) {
            Log.w("AsyncStorage_Next", "Could not force checkpoint on RKStorage, the Next storage might not migrate the data properly: " + e.getMessage());
        }
    }
}
