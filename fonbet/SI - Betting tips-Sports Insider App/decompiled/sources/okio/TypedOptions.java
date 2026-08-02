package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Options;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0019B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokio/TypedOptions;", "", "T", "Lkotlin/collections/f;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "list", "Lokio/Options;", "options", "<init>", "(Ljava/util/List;Lokio/Options;)V", "", "index", "get", "(I)Ljava/lang/Object;", "Lokio/Options;", "getOptions$okio", "()Lokio/Options;", "Ljava/util/List;", "getList$okio", "()Ljava/util/List;", "getSize", "()I", "size", "Companion", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypedOptions<T> extends f implements RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<T> list;

    @NotNull
    private final Options options;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lokio/TypedOptions$Companion;", "", "<init>", "()V", "of", "Lokio/TypedOptions;", "T", "values", "", "encode", "Lkotlin/Function1;", "Lokio/ByteString;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> TypedOptions<T> of(@NotNull Iterable<? extends T> values, @NotNull Function1<? super T, ? extends ByteString> encode) {
            Intrinsics.checkNotNullParameter(values, "values");
            Intrinsics.checkNotNullParameter(encode, "encode");
            List W = CollectionsKt.W(values);
            Options.Companion companion = Options.INSTANCE;
            int size = W.size();
            ByteString[] byteStringArr = new ByteString[size];
            for (int i5 = 0; i5 < size; i5++) {
                byteStringArr[i5] = encode.invoke(W.get(i5));
            }
            return new TypedOptions<>(W, companion.of(byteStringArr));
        }

        private Companion() {
        }
    }

    public TypedOptions(@NotNull List<? extends T> list, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        List<T> W = CollectionsKt.W(list);
        this.list = W;
        if (W.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @NotNull
    public static final <T> TypedOptions<T> of(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends ByteString> function1) {
        return INSTANCE.of(iterable, function1);
    }

    @Override // kotlin.collections.f, java.util.List
    @NotNull
    public T get(int index) {
        return this.list.get(index);
    }

    @NotNull
    public final List<T> getList$okio() {
        return this.list;
    }

    @NotNull
    /* renamed from: getOptions$okio, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    @Override // kotlin.collections.a
    public int getSize() {
        return this.list.size();
    }
}
