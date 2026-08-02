package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ti implements Ui {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12933b = "content://" + a() + "/clids";

    /* renamed from: c, reason: collision with root package name */
    public final String f12934c = "clid_key";

    /* renamed from: d, reason: collision with root package name */
    public final String f12935d = "clid_value";

    public Ti(@NotNull Context context) {
        this.f12932a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Ui, kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0445r3 invoke() {
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.f12932a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0158fj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f12932a.getContentResolver().query(Uri.parse(this.f12933b), null, null, null, null);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            try {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Error while getting satellite clids\n" + StringUtils.throwableToString(th), new Object[0]);
                return null;
            } finally {
                lo.a(cursor);
            }
        }
        if (cursor == null) {
            AbstractC0158fj.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f12934c));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f12935d));
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    AbstractC0158fj.a("Invalid clid {%s : %s}", string, string2);
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (Throwable unused) {
            }
        }
        AbstractC0158fj.a("Clids from satellite: %s", linkedHashMap);
        return new C0445r3(linkedHashMap, S7.f12863d);
    }
}
