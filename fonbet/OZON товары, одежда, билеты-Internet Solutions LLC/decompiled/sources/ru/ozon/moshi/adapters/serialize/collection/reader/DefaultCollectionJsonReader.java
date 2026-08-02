package ru.ozon.moshi.adapters.serialize.collection.reader;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004\"\u0004\b\u0001\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/moshi/adapters/serialize/collection/reader/DefaultCollectionJsonReader;", "Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "<init>", "()V", "", "C", "T", "Lcom/squareup/moshi/n;", "collection", "Lcom/squareup/moshi/JsonAdapter;", "elementAdapter", "read", "(Lcom/squareup/moshi/n;Ljava/util/Collection;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/Collection;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "moshi-adapters_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DefaultCollectionJsonReader implements JsonCollectionReader {

    @NotNull
    public static final DefaultCollectionJsonReader INSTANCE = new DefaultCollectionJsonReader();

    private DefaultCollectionJsonReader() {
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof DefaultCollectionJsonReader);
    }

    public int hashCode() {
        return 1578091724;
    }

    @Override // ru.ozon.moshi.adapters.serialize.collection.reader.JsonCollectionReader
    @NotNull
    public <C extends Collection<T>, T> C read(@NotNull n nVar, @NotNull C collection, @NotNull JsonAdapter<T> elementAdapter) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(elementAdapter, "elementAdapter");
        nVar.beginArray();
        while (nVar.hasNext()) {
            collection.add(elementAdapter.fromJson(nVar));
        }
        nVar.endArray();
        return collection;
    }

    @NotNull
    public String toString() {
        return "DefaultCollectionJsonReader";
    }
}
