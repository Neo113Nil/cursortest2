package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lh0 extends u4 implements RandomAccess {
    public final /* synthetic */ int[] a;

    public lh0(int[] iArr) {
        this.a = iArr;
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return ph0.s(((Number) obj).intValue(), this.a);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.a[i]);
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.u4, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (intValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // defpackage.u4, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = this.a;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (intValue == iArr[length]) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        }
        return -1;
    }
}
