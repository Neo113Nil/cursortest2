package zendesk.core;

import androidx.annotation.NonNull;
import com.google.gson.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
class ZendeskSettingsStorage implements SettingsStorage {
    private static final String LAST_UPDATE = "last_settings_update";
    private static final String RAWSETTTINGS_KEYSET = "rawsettings_keyset";
    private final BaseStorage settingsStorage;

    public ZendeskSettingsStorage(BaseStorage baseStorage) {
        this.settingsStorage = baseStorage;
    }

    @Override // zendesk.core.SettingsStorage
    public boolean areSettingsUpToDate(long j10, @NonNull TimeUnit timeUnit) {
        Long l10;
        synchronized (this.settingsStorage) {
            l10 = (Long) this.settingsStorage.get(LAST_UPDATE, Long.class);
        }
        if (l10 != null && l10.longValue() != -1) {
            if (System.currentTimeMillis() - l10.longValue() < TimeUnit.MILLISECONDS.convert(j10, timeUnit)) {
                return true;
            }
        }
        return false;
    }

    @Override // zendesk.core.SettingsStorage
    public void clear() {
        synchronized (this.settingsStorage) {
            this.settingsStorage.clear();
        }
    }

    @Override // zendesk.core.SettingsStorage
    public Map<String, h> getRawSettings() {
        HashMap hashMap;
        synchronized (this.settingsStorage) {
            try {
                hashMap = new HashMap();
                Set<String> set = (Set) this.settingsStorage.get(RAWSETTTINGS_KEYSET, Set.class);
                if (set != null) {
                    for (String str : set) {
                        if (str != null) {
                            hashMap.put(str, (h) this.settingsStorage.get(str, h.class));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashMap;
    }

    @Override // zendesk.core.SettingsStorage
    public <E> E getSettings(@NonNull String str, @NonNull Class<E> cls) {
        E e10;
        synchronized (this.settingsStorage) {
            e10 = (E) this.settingsStorage.get(str, cls);
        }
        return e10;
    }

    @Override // zendesk.core.SettingsStorage
    public boolean hasStoredSettings() {
        boolean a10;
        synchronized (this.settingsStorage) {
            a10 = com.zendesk.util.d.a(this.settingsStorage.get(LAST_UPDATE));
        }
        return a10;
    }

    @Override // zendesk.core.SettingsStorage
    public void storeRawSettings(@NonNull Map<String, h> map) {
        synchronized (this.settingsStorage) {
            try {
                this.settingsStorage.put(LAST_UPDATE, Long.valueOf(System.currentTimeMillis()));
                for (Map.Entry<String, h> entry : map.entrySet()) {
                    this.settingsStorage.put(entry.getKey(), entry.getValue());
                }
                this.settingsStorage.put(RAWSETTTINGS_KEYSET, map.keySet());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
