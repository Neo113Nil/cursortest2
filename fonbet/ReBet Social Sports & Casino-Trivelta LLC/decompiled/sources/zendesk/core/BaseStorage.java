package zendesk.core;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface BaseStorage {
    void clear();

    <E> E get(@NonNull String str, @NonNull Class<E> cls);

    String get(@NonNull String str);

    void put(@NonNull String str, Object obj);

    void put(@NonNull String str, String str2);

    void remove(@NonNull String str);
}
