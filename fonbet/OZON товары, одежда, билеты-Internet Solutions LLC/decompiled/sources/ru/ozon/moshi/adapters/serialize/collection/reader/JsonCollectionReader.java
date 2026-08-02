package ru.ozon.moshi.adapters.serialize.collection.reader;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001JA\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0003*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "", "", "C", "T", "Lcom/squareup/moshi/n;", "collection", "Lcom/squareup/moshi/JsonAdapter;", "elementAdapter", "read", "(Lcom/squareup/moshi/n;Ljava/util/Collection;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/Collection;", "Lru/ozon/moshi/adapters/serialize/collection/reader/CoroutineCollectionJsonReader;", "Lru/ozon/moshi/adapters/serialize/collection/reader/DefaultCollectionJsonReader;", "Lru/ozon/moshi/adapters/serialize/collection/reader/ExecutorCollectionJsonReader;", "moshi-adapters_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface JsonCollectionReader {
    @NotNull
    <C extends Collection<T>, T> C read(@NotNull n nVar, @NotNull C c11, @NotNull JsonAdapter<T> jsonAdapter);
}
