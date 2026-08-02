package ru.ozon.app.android.storage.utils;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "Landroid/content/SharedPreferences;", "actualPrefs", "", "oldPrefsName", "", "fieldsToMigrate", "", "migrateSharedPrefsIfRequired", "(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/util/List;)V", "storage_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SharedPrefsExtKt {
    public static final void migrateSharedPrefsIfRequired(@NotNull Context context, @NotNull SharedPreferences actualPrefs, @NotNull String oldPrefsName, List<String> list) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(actualPrefs, "actualPrefs");
        Intrinsics.checkNotNullParameter(oldPrefsName, "oldPrefsName");
        if (actualPrefs.getBoolean("is_migration_done", false)) {
            return;
        }
        SharedPreferences.Editor edit = actualPrefs.edit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(oldPrefsName, 0);
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (list == null || list.contains(entry.getKey())) {
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    Intrinsics.g(value2, "null cannot be cast to non-null type kotlin.Int");
                    edit.putInt(key, ((Integer) value2).intValue());
                } else if (value instanceof Long) {
                    String key2 = entry.getKey();
                    Object value3 = entry.getValue();
                    Intrinsics.g(value3, "null cannot be cast to non-null type kotlin.Long");
                    edit.putLong(key2, ((Long) value3).longValue());
                } else if (value instanceof String) {
                    String key3 = entry.getKey();
                    Object value4 = entry.getValue();
                    Intrinsics.g(value4, "null cannot be cast to non-null type kotlin.String");
                    edit.putString(key3, (String) value4);
                } else if (value instanceof Boolean) {
                    String key4 = entry.getKey();
                    Object value5 = entry.getValue();
                    Intrinsics.g(value5, "null cannot be cast to non-null type kotlin.Boolean");
                    edit.putBoolean(key4, ((Boolean) value5).booleanValue());
                } else if (value instanceof Float) {
                    String key5 = entry.getKey();
                    Object value6 = entry.getValue();
                    Intrinsics.g(value6, "null cannot be cast to non-null type kotlin.Float");
                    edit.putFloat(key5, ((Float) value6).floatValue());
                }
            }
        }
        if (edit.putBoolean("is_migration_done", true).commit()) {
            if (list == null) {
                context.deleteSharedPreferences(oldPrefsName);
                return;
            }
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                edit2.remove((String) it.next());
            }
            edit2.apply();
        }
    }
}
