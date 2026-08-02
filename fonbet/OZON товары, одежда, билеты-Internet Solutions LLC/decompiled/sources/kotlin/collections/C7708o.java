package kotlin.collections;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.collections.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7708o extends AbstractC7696c<Integer> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f71755b;

    C7708o(int[] iArr) {
        this.f71755b = iArr;
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return C7705l.k(this.f71755b, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i11) {
        return Integer.valueOf(this.f71755b[i11]);
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f71755b.length;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return C7705l.L(this.f71755b, ((Number) obj).intValue());
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection
    public final boolean isEmpty() {
        return this.f71755b.length == 0;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f71755b;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (intValue == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }
}
