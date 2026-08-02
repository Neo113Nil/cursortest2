package com.squareup.wire.internal;

import defpackage.x5n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/wire/internal/IntArrayList;", "", "initialCapacity", "", "<init>", "(I)V", "data", "", "size", "toArray", "add", "", "int", "isNotEmpty", "", "ensureCapacity", "minCapacity", "toString", "", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntArrayList {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private int[] data;
    private int size;

    public IntArrayList(int i) {
        this.data = new int[i];
    }

    private final void ensureCapacity(int minCapacity) {
        int[] iArr = this.data;
        if (minCapacity > iArr.length) {
            this.data = Arrays.copyOf(iArr, x5n.e(iArr.length, 3, 2, 1, minCapacity));
        }
    }

    public final void add(int r4) {
        ensureCapacity(this.size + 1);
        int[] iArr = this.data;
        int i = this.size;
        this.size = i + 1;
        iArr[i] = r4;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    @NotNull
    public final int[] toArray() {
        int i = this.size;
        int[] iArr = this.data;
        if (i >= iArr.length) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, i);
        this.data = copyOf;
        return copyOf;
    }

    @NotNull
    public String toString() {
        String arrays = Arrays.toString(Arrays.copyOf(this.data, this.size));
        arrays.getClass();
        return arrays;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/IntArrayList$Companion;", "", "<init>", "()V", "forDecoding", "Lcom/squareup/wire/internal/IntArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            long j = minLengthInBytes / minimumElementByteSize;
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return new IntArrayList((int) j);
        }

        private Companion() {
        }

        @NotNull
        public final IntArrayList forDecoding(int minLengthInBytes, int minimumElementByteSize) {
            return new IntArrayList(minLengthInBytes / minimumElementByteSize);
        }
    }
}
