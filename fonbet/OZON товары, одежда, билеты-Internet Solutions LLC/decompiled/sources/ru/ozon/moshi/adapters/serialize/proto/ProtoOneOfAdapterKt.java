package ru.ozon.moshi.adapters.serialize.proto;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionAdapter;
import ru.ozon.moshi.adapters.serialize.collection.reader.DefaultCollectionJsonReader;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"DefaultCollectionAdapterFactory", "Lru/ozon/moshi/adapters/serialize/collection/JsonCollectionAdapter$Factory;", "getDefaultCollectionAdapterFactory", "()Lru/ozon/moshi/adapters/serialize/collection/JsonCollectionAdapter$Factory;", "moshi-adapters_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProtoOneOfAdapterKt {

    @NotNull
    private static final JsonCollectionAdapter.Factory DefaultCollectionAdapterFactory = new JsonCollectionAdapter.Factory(DefaultCollectionJsonReader.INSTANCE);

    @NotNull
    public static final JsonCollectionAdapter.Factory getDefaultCollectionAdapterFactory() {
        return DefaultCollectionAdapterFactory;
    }
}
