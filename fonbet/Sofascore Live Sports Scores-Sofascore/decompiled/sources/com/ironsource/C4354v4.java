package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.v4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4354v4 implements InterfaceC4408y4 {
    private final SharedPreferences a;
    private final SharedPreferences.Editor b;

    public C4354v4(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    @Override // com.ironsource.InterfaceC4408y4
    public void a(@NotNull String str) {
        str.getClass();
        this.b.remove(str).apply();
    }

    @Override // com.ironsource.InterfaceC4408y4
    @NotNull
    public Map<String, ?> allData() {
        Map<String, ?> all = this.a.getAll();
        all.getClass();
        return all;
    }

    @Override // com.ironsource.InterfaceC4408y4
    public void b(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.b.putString(str, str2).apply();
    }

    @Override // com.ironsource.InterfaceC4408y4
    @Nullable
    public String a(@NotNull String str, @Nullable String str2) {
        str.getClass();
        try {
            return this.a.getString(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }
}
