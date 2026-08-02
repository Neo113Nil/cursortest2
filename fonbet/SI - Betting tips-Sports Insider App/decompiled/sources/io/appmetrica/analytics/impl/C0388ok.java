package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388ok implements Ic {

    /* renamed from: a, reason: collision with root package name */
    public final wo f14426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14427b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final AESEncrypter f14428c;

    public C0388ok(@NotNull wo woVar) {
        this.f14426a = woVar;
        C0009a c0009a = new C0009a(C0353na.k().g());
        this.f14428c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0009a.b(), c0009a.a());
    }

    public static void a(wo woVar, C0238im c0238im, Ab ab2) {
        String optStringOrNull;
        synchronized (woVar) {
            optStringOrNull = JsonUtils.optStringOrNull(woVar.f14882a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(ab2.f11988d)) {
                woVar.a(ab2.f11988d);
            }
            if (!TextUtils.isEmpty(ab2.f11989e)) {
                woVar.b(ab2.f11989e);
            }
            if (TextUtils.isEmpty(ab2.f11985a)) {
                return;
            }
            c0238im.f13956a = ab2.f11985a;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(@NotNull Context context) {
        SQLiteDatabase readableDatabase = C0353na.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Ab a7 = a(readableDatabase);
                C0238im c0238im = new C0238im(new C0297l4(new C0246j4()));
                if (a7 != null) {
                    a(this.f14426a, c0238im, a7);
                    c0238im.f13970p = a7.f11987c;
                    c0238im.f13971r = a7.f11986b;
                }
                C0264jm c0264jm = new C0264jm(c0238im);
                Rm rm = (Rm) Pm.a(C0264jm.class);
                rm.a(context, rm.b(context)).save(c0264jm);
            } catch (Throwable unused) {
            }
        }
    }

    public final Ab a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f14427b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Ab ab2 = (Ab) MessageNano.mergeFrom(new Ab(), this.f14428c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return ab2;
                    }
                } catch (Throwable unused) {
                }
            }
            if (cursor != null) {
                cursor.getCount();
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        CloseableUtilsKt.closeSafely(cursor);
        return null;
    }
}
