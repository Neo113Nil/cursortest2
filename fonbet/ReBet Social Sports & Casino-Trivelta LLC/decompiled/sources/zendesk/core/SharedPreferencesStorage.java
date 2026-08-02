package zendesk.core;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
class SharedPreferencesStorage implements BaseStorage {
    private final Serializer serializer;
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesStorage(SharedPreferences sharedPreferences, Serializer serializer) {
        this.sharedPreferences = sharedPreferences;
        this.serializer = serializer;
    }

    @Override // zendesk.core.BaseStorage
    public void clear() {
        this.sharedPreferences.edit().clear().apply();
    }

    @Override // zendesk.core.BaseStorage
    public String get(@NonNull String str) {
        return this.sharedPreferences.getString(str, null);
    }

    public long getLong(@NonNull String str) {
        return this.sharedPreferences.getLong(str, 0L);
    }

    @Override // zendesk.core.BaseStorage
    public void put(@NonNull String str, String str2) {
        if (com.zendesk.util.d.a(str)) {
            this.sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    @Override // zendesk.core.BaseStorage
    public void remove(@NonNull String str) {
        if (com.zendesk.util.d.a(str)) {
            this.sharedPreferences.edit().remove(str).apply();
        }
    }

    @Override // zendesk.core.BaseStorage
    public <E> E get(@NonNull String str, @NonNull Class<E> cls) {
        return (E) this.serializer.deserialize(get(str), cls);
    }

    @Override // zendesk.core.BaseStorage
    public void put(@NonNull String str, Object obj) {
        if (com.zendesk.util.d.a(str)) {
            put(str, obj != null ? this.serializer.serialize(obj) : null);
        }
    }
}
