package okio;

import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH\u0002J\u0015\u0010\u0012\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0082\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0014"}, d2 = {"Lokio/PriorityQueue;", "", "<init>", "()V", "size", "", "array", "", "Lokio/AsyncTimeout;", "[Lokio/AsyncTimeout;", "first", "add", "", "node", "remove", "heapifyUp", "vacantIndex", "heapifyDown", "compareTo", "other", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/PriorityQueue\n*L\n1#1,514:1\n509#1,3:515\n509#1,3:518\n509#1,3:521\n509#1,3:524\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/PriorityQueue\n*L\n415#1:515,3\n448#1:518,3\n481#1:521,3\n491#1:524,3\n*E\n"})
/* loaded from: classes3.dex */
public final class PriorityQueue {

    @NotNull
    public AsyncTimeout[] array = new AsyncTimeout[8];
    public int size;

    private final int compareTo(AsyncTimeout asyncTimeout, AsyncTimeout asyncTimeout2) {
        Intrinsics.checkNotNullParameter(asyncTimeout, "<this>");
        return Intrinsics.compare(0L, asyncTimeout2.getTimeoutAt() - asyncTimeout.getTimeoutAt());
    }

    private final void heapifyDown(int vacantIndex, AsyncTimeout node) {
        AsyncTimeout asyncTimeout;
        while (true) {
            int i5 = vacantIndex << 1;
            int i10 = i5 + 1;
            int i11 = this.size;
            if (i10 > i11) {
                if (i5 > i11) {
                    break;
                }
                asyncTimeout = this.array[i5];
                Intrinsics.checkNotNull(asyncTimeout);
            } else {
                asyncTimeout = this.array[i5];
                Intrinsics.checkNotNull(asyncTimeout);
                AsyncTimeout asyncTimeout2 = this.array[i10];
                Intrinsics.checkNotNull(asyncTimeout2);
                if (Intrinsics.compare(0L, asyncTimeout2.getTimeoutAt() - asyncTimeout.getTimeoutAt()) >= 0) {
                    asyncTimeout = asyncTimeout2;
                }
            }
            if (Intrinsics.compare(0L, asyncTimeout.getTimeoutAt() - node.getTimeoutAt()) <= 0) {
                break;
            }
            int i12 = asyncTimeout.index;
            asyncTimeout.index = vacantIndex;
            this.array[vacantIndex] = asyncTimeout;
            vacantIndex = i12;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    private final void heapifyUp(int vacantIndex, AsyncTimeout node) {
        while (true) {
            int i5 = vacantIndex >> 1;
            if (i5 == 0) {
                break;
            }
            AsyncTimeout asyncTimeout = this.array[i5];
            Intrinsics.checkNotNull(asyncTimeout);
            if (Intrinsics.compare(0L, node.getTimeoutAt() - asyncTimeout.getTimeoutAt()) <= 0) {
                break;
            }
            asyncTimeout.index = vacantIndex;
            this.array[vacantIndex] = asyncTimeout;
            vacantIndex = i5;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    public final void add(@NotNull AsyncTimeout node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i5 = this.size + 1;
        this.size = i5;
        AsyncTimeout[] asyncTimeoutArr = this.array;
        if (i5 == asyncTimeoutArr.length) {
            AsyncTimeout[] asyncTimeoutArr2 = new AsyncTimeout[i5 * 2];
            o.g(0, 0, 14, asyncTimeoutArr, asyncTimeoutArr2);
            this.array = asyncTimeoutArr2;
        }
        heapifyUp(i5, node);
    }

    @Nullable
    public final AsyncTimeout first() {
        return this.array[1];
    }

    public final void remove(@NotNull AsyncTimeout node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i5 = node.index;
        if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = this.size;
        AsyncTimeout asyncTimeout = this.array[i10];
        Intrinsics.checkNotNull(asyncTimeout);
        node.index = -1;
        this.array[i10] = null;
        this.size = i10 - 1;
        if (node == asyncTimeout) {
            return;
        }
        int compare = Intrinsics.compare(0L, asyncTimeout.getTimeoutAt() - node.getTimeoutAt());
        if (compare == 0) {
            this.array[i5] = asyncTimeout;
            asyncTimeout.index = i5;
        } else if (compare < 0) {
            heapifyDown(i5, asyncTimeout);
        } else {
            heapifyUp(i5, asyncTimeout);
        }
    }
}
