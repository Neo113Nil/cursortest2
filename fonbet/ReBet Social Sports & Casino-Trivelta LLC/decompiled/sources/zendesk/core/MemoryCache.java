package zendesk.core;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface MemoryCache {
    void clear();

    boolean contains(@NonNull String str);

    <T> T get(@NonNull String str);

    @NonNull
    <T> T getOrDefault(@NonNull String str, T t10);

    void put(@NonNull String str, Object obj);

    void remove(@NonNull String str);
}
