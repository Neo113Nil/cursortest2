package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2753y4 implements B4 {
    private final SharedPreferences a;
    private final SharedPreferences.Editor b;

    public C2753y4(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    @Override // com.ironsource.B4
    public String a(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.B4
    public Map<String, ?> allData() {
        Map<String, ?> all = this.a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.B4
    public void b(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.putString(key, value).apply();
    }

    @Override // com.ironsource.B4
    public void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.b.remove(key).apply();
    }
}
