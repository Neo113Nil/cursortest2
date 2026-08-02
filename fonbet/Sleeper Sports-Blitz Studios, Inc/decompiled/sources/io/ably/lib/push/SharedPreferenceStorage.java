package io.ably.lib.push;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes9.dex */
public class SharedPreferenceStorage implements Storage {
    private final ActivationContext activationContext;

    public SharedPreferenceStorage(ActivationContext activationContext) {
        this.activationContext = activationContext;
    }

    private SharedPreferences sharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(this.activationContext.getContext());
    }

    @Override // io.ably.lib.push.Storage
    public void put(String str, String str2) {
        sharedPreferences().edit().putString(str, str2).apply();
    }

    @Override // io.ably.lib.push.Storage
    public void put(String str, int i) {
        sharedPreferences().edit().putInt(str, i).apply();
    }

    @Override // io.ably.lib.push.Storage
    public String get(String str, String str2) {
        return sharedPreferences().getString(str, str2);
    }

    @Override // io.ably.lib.push.Storage
    public int get(String str, int i) {
        return sharedPreferences().getInt(str, i);
    }

    @Override // io.ably.lib.push.Storage
    public void clear(String[] strArr) {
        SharedPreferences.Editor edit = this.activationContext.getPreferences().edit();
        for (String str : strArr) {
            edit.remove(str);
        }
        edit.commit();
    }
}
