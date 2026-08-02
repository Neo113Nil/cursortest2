package zendesk.core;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
interface Serializer {
    <E> E deserialize(Object obj, @NonNull Class<E> cls);

    String serialize(Object obj);
}
