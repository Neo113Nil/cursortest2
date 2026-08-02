package okio;

import d9.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import jf.a;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.j;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0018B!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokio/Options;", "Lkotlin/collections/f;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lokio/ByteString;[I)V", "", "index", "get", "(I)Lokio/ByteString;", "[Lokio/ByteString;", "getByteStrings$okio", "()[Lokio/ByteString;", "[I", "getTrie$okio", "()[I", "getSize", "()I", "size", "Companion", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Options extends f implements RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\tJT\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0002R\u0018\u0010\u0016\u001a\u00020\r*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokio/Options$Companion;", "", "<init>", "()V", "of", "Lokio/Options;", "byteStrings", "", "Lokio/ByteString;", "([Lokio/ByteString;)Lokio/Options;", "buildTrieRecursive", "", "nodeOffset", "", "node", "Lokio/Buffer;", "byteStringOffset", "", "", "fromIndex", "toIndex", "indexes", "intCount", "getIntCount", "(Lokio/Buffer;)J", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,238:1\n1#2:239\n13870#3,3:240\n73#4:243\n73#4:244\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n48#1:240,3\n153#1:243\n210#1:244\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
            int i5;
            int i10;
            int i11;
            long j;
            int i12 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i13 = fromIndex; i13 < toIndex; i13++) {
                if (byteStrings.get(i13).size() < i12) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i12 == byteString.size()) {
                int intValue = indexes.get(fromIndex).intValue();
                int i14 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i14);
                i5 = i14;
                i10 = intValue;
                byteString = byteString3;
            } else {
                i5 = fromIndex;
                i10 = -1;
            }
            if (byteString.getByte(i12) == byteString2.getByte(i12)) {
                int min = Math.min(byteString.size(), byteString2.size());
                int i15 = 0;
                for (int i16 = i12; i16 < min && byteString.getByte(i16) == byteString2.getByte(i16); i16++) {
                    i15++;
                }
                long intCount = nodeOffset + getIntCount(node) + 2 + i15 + 1;
                node.writeInt(-i15);
                node.writeInt(i10);
                int i17 = i12 + i15;
                while (i12 < i17) {
                    node.writeInt(byteString.getByte(i12) & 255);
                    i12++;
                }
                if (i5 + 1 == toIndex) {
                    if (i17 != byteStrings.get(i5).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i5).intValue());
                    return;
                } else {
                    Buffer buffer = new Buffer();
                    node.writeInt(((int) (getIntCount(buffer) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer, i17, byteStrings, i5, toIndex, indexes);
                    node.writeAll(buffer);
                    return;
                }
            }
            int i18 = 1;
            for (int i19 = i5 + 1; i19 < toIndex; i19++) {
                if (byteStrings.get(i19 - 1).getByte(i12) != byteStrings.get(i19).getByte(i12)) {
                    i18++;
                }
            }
            long intCount2 = nodeOffset + getIntCount(node) + 2 + (i18 * 2);
            node.writeInt(i18);
            node.writeInt(i10);
            for (int i20 = i5; i20 < toIndex; i20++) {
                byte b10 = byteStrings.get(i20).getByte(i12);
                if (i20 == i5 || b10 != byteStrings.get(i20 - 1).getByte(i12)) {
                    node.writeInt(b10 & 255);
                }
            }
            Buffer buffer2 = new Buffer();
            while (i5 < toIndex) {
                byte b11 = byteStrings.get(i5).getByte(i12);
                int i21 = i5 + 1;
                int i22 = i21;
                while (true) {
                    if (i22 >= toIndex) {
                        i11 = toIndex;
                        break;
                    } else {
                        if (b11 != byteStrings.get(i22).getByte(i12)) {
                            i11 = i22;
                            break;
                        }
                        i22++;
                    }
                }
                if (i21 == i11 && i12 + 1 == byteStrings.get(i5).size()) {
                    node.writeInt(indexes.get(i5).intValue());
                    j = intCount2;
                } else {
                    node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                    j = intCount2;
                    buildTrieRecursive(j, buffer2, i12 + 1, byteStrings, i5, i11, indexes);
                }
                intCount2 = j;
                i5 = i11;
            }
            node.writeAll(buffer2);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i5, List list, int i10, int i11, List list2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j = 0;
            }
            companion.buildTrieRecursive(j, buffer, (i12 & 4) != 0 ? 0 : i5, list, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? list.size() : i11, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x012a, code lost:
        
            continue;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Options of(@NotNull ByteString... byteStrings) {
            int i5;
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            Intrinsics.checkNotNullParameter(byteStrings, "<this>");
            Intrinsics.checkNotNullParameter(byteStrings, "<this>");
            ArrayList arrayList = new ArrayList(new j(byteStrings, false));
            y.l(arrayList);
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                ByteString byteString = byteStrings[i11];
                int i13 = i12 + 1;
                int size2 = arrayList.size();
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                int size3 = arrayList.size();
                if (size2 < 0) {
                    throw new IllegalArgumentException(e.f(size2, "fromIndex (0) is greater than toIndex (", ")."));
                }
                if (size2 > size3) {
                    throw new IndexOutOfBoundsException("toIndex (" + size2 + ") is greater than size (" + size3 + ").");
                }
                int i14 = size2 - 1;
                int i15 = 0;
                while (true) {
                    if (i15 > i14) {
                        i5 = -(i15 + 1);
                        break;
                    }
                    i5 = (i15 + i14) >>> 1;
                    int a7 = a.a((Comparable) arrayList.get(i5), byteString);
                    if (a7 < 0) {
                        i15 = i5 + 1;
                    } else if (a7 > 0) {
                        i14 = i5 - 1;
                    }
                }
                arrayList2.set(i5, Integer.valueOf(i12));
                i11++;
                i12 = i13;
            }
            if (((ByteString) arrayList.get(0)).size() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i16 = 0;
            while (i16 < arrayList.size()) {
                ByteString byteString2 = (ByteString) arrayList.get(i16);
                int i17 = i16 + 1;
                int i18 = i17;
                while (i18 < arrayList.size()) {
                    ByteString byteString3 = (ByteString) arrayList.get(i18);
                    if (byteString3.startsWith(byteString2)) {
                        if (byteString3.size() == byteString2.size()) {
                            throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                        }
                        if (((Number) arrayList2.get(i18)).intValue() > ((Number) arrayList2.get(i16)).intValue()) {
                            arrayList.remove(i18);
                            ((Number) arrayList2.remove(i18)).intValue();
                        } else {
                            i18++;
                        }
                    }
                }
                i16 = i17;
            }
            Buffer buffer = new Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, arrayList, 0, 0, arrayList2, 53, null);
            int intCount = (int) getIntCount(buffer);
            int[] iArr = new int[intCount];
            for (int i19 = 0; i19 < intCount; i19++) {
                iArr[i19] = buffer.readInt();
            }
            Object[] copyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return new Options((ByteString[]) copyOf, iArr, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @NotNull
    public static final Options of(@NotNull ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @NotNull
    /* renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.a
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    /* renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // kotlin.collections.f, java.util.List
    @NotNull
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
