package ru.ozon.moshi.adapters.serialize.collection.reader;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import ed.InterfaceC6346b;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.I;

@InterfaceC6346b
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\"\u0004\b\u0001\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, d2 = {"Lru/ozon/moshi/adapters/serialize/collection/reader/CoroutineCollectionJsonReader;", "Lru/ozon/moshi/adapters/serialize/collection/reader/JsonCollectionReader;", "Lxe/I;", "dispatcher", "constructor-impl", "(Lxe/I;)Lxe/I;", "", "C", "T", "Lcom/squareup/moshi/n;", "collection", "Lcom/squareup/moshi/JsonAdapter;", "elementAdapter", "read-impl", "(Lxe/I;Lcom/squareup/moshi/n;Ljava/util/Collection;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/Collection;", "read", "", "toString-impl", "(Lxe/I;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lxe/I;)I", "hashCode", "", "other", "", "equals-impl", "(Lxe/I;Ljava/lang/Object;)Z", "equals", "Lxe/I;", "moshi-adapters_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoroutineCollectionJsonReader implements JsonCollectionReader {

    @NotNull
    private final I dispatcher;

    private /* synthetic */ CoroutineCollectionJsonReader(I i11) {
        this.dispatcher = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CoroutineCollectionJsonReader m1649boximpl(I i11) {
        return new CoroutineCollectionJsonReader(i11);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static I m1650constructorimpl(@NotNull I dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return dispatcher;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1651equalsimpl(I i11, Object obj) {
        return (obj instanceof CoroutineCollectionJsonReader) && Intrinsics.d(i11, ((CoroutineCollectionJsonReader) obj).getDispatcher());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1652equalsimpl0(I i11, I i12) {
        return Intrinsics.d(i11, i12);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1653hashCodeimpl(I i11) {
        return i11.hashCode();
    }

    @NotNull
    /* renamed from: read-impl, reason: not valid java name */
    public static <C extends Collection<T>, T> C m1654readimpl(I i11, @NotNull n read, @NotNull C collection, @NotNull JsonAdapter<T> elementAdapter) {
        Intrinsics.checkNotNullParameter(read, "$this$read");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(elementAdapter, "elementAdapter");
        return (C) C10727i.d(i11, new CoroutineCollectionJsonReader$read$1(read, i11, collection, elementAdapter, null));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1655toStringimpl(I i11) {
        return "CoroutineCollectionJsonReader(dispatcher=" + i11 + ")";
    }

    public boolean equals(Object obj) {
        return m1651equalsimpl(this.dispatcher, obj);
    }

    public int hashCode() {
        return m1653hashCodeimpl(this.dispatcher);
    }

    @Override // ru.ozon.moshi.adapters.serialize.collection.reader.JsonCollectionReader
    @NotNull
    public <C extends Collection<T>, T> C read(@NotNull n nVar, @NotNull C collection, @NotNull JsonAdapter<T> elementAdapter) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(elementAdapter, "elementAdapter");
        return (C) m1654readimpl(this.dispatcher, nVar, collection, elementAdapter);
    }

    public String toString() {
        return m1655toStringimpl(this.dispatcher);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ I getDispatcher() {
        return this.dispatcher;
    }
}
