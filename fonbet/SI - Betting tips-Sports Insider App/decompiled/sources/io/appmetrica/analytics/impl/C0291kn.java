package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291kn implements InterfaceC0265jn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14156a;

    public C0291kn(@NonNull String str, @NonNull HashMap<String, List<String>> hashMap) {
        this.f14156a = hashMap;
    }

    public final HashMap<String, List<String>> a() {
        return this.f14156a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0265jn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z5 = true;
            for (Map.Entry entry : this.f14156a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor query = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        lo.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z5 &= list.equals(asList);
                    lo.a(query);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th2) {
                    lo.a((Cursor) null);
                    throw th2;
                }
            }
            return z5;
        } catch (Throwable unused) {
            return false;
        }
    }
}
