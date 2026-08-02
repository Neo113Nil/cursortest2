package ru.ozon.moshi.adapters.serialize.collection.reader;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import ed.InterfaceC6346b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\"\u0004\b\u0001\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, d2 = {"Lru/ozon/moshi/adapters/serialize/collection/reader/ExecutorCollectionJsonReader;", "Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "Ljava/util/concurrent/ExecutorService;", "executor", "constructor-impl", "(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;", "", "C", "T", "Lcom/squareup/moshi/n;", "collection", "Lcom/squareup/moshi/JsonAdapter;", "elementAdapter", "read-impl", "(Ljava/util/concurrent/ExecutorService;Lcom/squareup/moshi/n;Ljava/util/Collection;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/Collection;", "read", "", "toString-impl", "(Ljava/util/concurrent/ExecutorService;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/concurrent/ExecutorService;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/util/concurrent/ExecutorService;Ljava/lang/Object;)Z", "equals", "Ljava/util/concurrent/ExecutorService;", "moshi-adapters_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExecutorCollectionJsonReader implements JsonCollectionReader {

    @NotNull
    private final ExecutorService executor;

    private /* synthetic */ ExecutorCollectionJsonReader(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ExecutorCollectionJsonReader m1657boximpl(ExecutorService executorService) {
        return new ExecutorCollectionJsonReader(executorService);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static ExecutorService m1658constructorimpl(@NotNull ExecutorService executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        return executor;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1659equalsimpl(ExecutorService executorService, Object obj) {
        return (obj instanceof ExecutorCollectionJsonReader) && Intrinsics.d(executorService, ((ExecutorCollectionJsonReader) obj).getExecutor());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1660equalsimpl0(ExecutorService executorService, ExecutorService executorService2) {
        return Intrinsics.d(executorService, executorService2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1661hashCodeimpl(ExecutorService executorService) {
        return executorService.hashCode();
    }

    @NotNull
    /* renamed from: read-impl, reason: not valid java name */
    public static <C extends Collection<T>, T> C m1662readimpl(final ExecutorService executorService, @NotNull final n read, @NotNull final C collection, @NotNull final JsonAdapter<T> elementAdapter) {
        Intrinsics.checkNotNullParameter(read, "$this$read");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(elementAdapter, "elementAdapter");
        T t2 = executorService.submit(new Callable() { // from class: ru.ozon.moshi.adapters.serialize.collection.reader.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Collection read_impl$lambda$2;
                read_impl$lambda$2 = ExecutorCollectionJsonReader.read_impl$lambda$2(n.this, executorService, collection, elementAdapter);
                return read_impl$lambda$2;
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(t2, "get(...)");
        return (C) t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection read_impl$lambda$2(n nVar, ExecutorService executorService, Collection collection, final JsonAdapter jsonAdapter) {
        nVar.beginArray();
        ArrayList arrayList = new ArrayList();
        while (nVar.hasNext()) {
            final Object t2 = nVar.t();
            arrayList.add(executorService.submit(new Callable() { // from class: ru.ozon.moshi.adapters.serialize.collection.reader.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object fromJsonValue;
                    fromJsonValue = JsonAdapter.this.fromJsonValue(t2);
                    return fromJsonValue;
                }
            }));
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Future) it.next()).get());
        }
        collection.addAll(arrayList2);
        nVar.endArray();
        return collection;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1663toStringimpl(ExecutorService executorService) {
        return "ExecutorCollectionJsonReader(executor=" + executorService + ")";
    }

    public boolean equals(Object obj) {
        return m1659equalsimpl(this.executor, obj);
    }

    public int hashCode() {
        return m1661hashCodeimpl(this.executor);
    }

    @Override // ru.ozon.moshi.adapters.serialize.collection.reader.JsonCollectionReader
    @NotNull
    public <C extends Collection<T>, T> C read(@NotNull n nVar, @NotNull C collection, @NotNull JsonAdapter<T> elementAdapter) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(elementAdapter, "elementAdapter");
        return (C) m1662readimpl(this.executor, nVar, collection, elementAdapter);
    }

    public String toString() {
        return m1663toStringimpl(this.executor);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ ExecutorService getExecutor() {
        return this.executor;
    }
}
