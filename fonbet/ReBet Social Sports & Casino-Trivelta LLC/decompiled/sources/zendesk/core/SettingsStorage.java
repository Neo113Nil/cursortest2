package zendesk.core;

import androidx.annotation.NonNull;
import com.google.gson.h;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
interface SettingsStorage {
    boolean areSettingsUpToDate(long j10, @NonNull TimeUnit timeUnit);

    void clear();

    Map<String, h> getRawSettings();

    <E> E getSettings(@NonNull String str, @NonNull Class<E> cls);

    boolean hasStoredSettings();

    void storeRawSettings(@NonNull Map<String, h> map);
}
