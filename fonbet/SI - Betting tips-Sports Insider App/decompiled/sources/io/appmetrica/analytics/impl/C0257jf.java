package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257jf implements Ui {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14035a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14036b = "content://" + a() + "/preload_info";

    /* renamed from: c, reason: collision with root package name */
    public final String f14037c = "tracking_id";

    /* renamed from: d, reason: collision with root package name */
    public final String f14038d = "additional_parameters";

    public C0257jf(@NotNull Context context) {
        this.f14035a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Ui, kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0433qf invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f14035a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0158fj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f14035a.getContentResolver().query(Uri.parse(this.f14036b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC0158fj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f14037c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f14038d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject = new JSONObject(string2);
                                JSONObject jSONObject2 = jSONObject;
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC0158fj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC0158fj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C0433qf c0433qf = new C0433qf(string, jSONObject2, !TextUtils.isEmpty(string), false, S7.f12863d);
                                lo.a(cursor);
                                return c0433qf;
                            }
                        }
                        jSONObject = new JSONObject();
                        JSONObject jSONObject22 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC0158fj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC0158fj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject22);
                        C0433qf c0433qf2 = new C0433qf(string, jSONObject22, !TextUtils.isEmpty(string), false, S7.f12863d);
                        lo.a(cursor);
                        return c0433qf2;
                    }
                    AbstractC0158fj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        lo.a(cursor);
        return null;
    }
}
