package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import java.util.Map;

/* renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4649y4 implements B4 {
    private final SharedPreferences a;
    private final SharedPreferences.Editor b;

    public C4649y4(Context context, String str) {
        SharedPreferences h = Preference.h(context, 0, str);
        this.a = h;
        this.b = h.edit();
    }

    @Override // com.ironsource.B4
    public String a(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.B4
    public Map<String, ?> allData() {
        return this.a.getAll();
    }

    @Override // com.ironsource.B4
    public void b(String str, String str2) {
        this.b.putString(str, str2).apply();
    }

    @Override // com.ironsource.B4
    public void a(String str) {
        this.b.remove(str).apply();
    }
}
