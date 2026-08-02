package androidx.recyclerview.widget;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f2472a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public Object f2473b = new SparseIntArray();

    public static int c(int i5, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        return i11 + 1 > i10 ? i12 + 1 : i12;
    }

    public void a() {
        int[] iArr = (int[]) this.f2472a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f2473b = null;
    }

    public void b(int i5) {
        int[] iArr = (int[]) this.f2472a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i5, 10) + 1];
            this.f2472a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i5 >= iArr.length) {
            int length = iArr.length;
            while (length <= i5) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2472a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f2472a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void d() {
        ((SparseIntArray) this.f2472a).clear();
    }

    public void e(int i5, int i10) {
        int[] iArr = (int[]) this.f2472a;
        if (iArr == null || i5 >= iArr.length) {
            return;
        }
        int i11 = i5 + i10;
        b(i11);
        int[] iArr2 = (int[]) this.f2472a;
        System.arraycopy(iArr2, i5, iArr2, i11, (iArr2.length - i5) - i10);
        Arrays.fill((int[]) this.f2472a, i5, i11, -1);
        ArrayList arrayList = (ArrayList) this.f2473b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f2473b).get(size);
            int i12 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2303a;
            if (i12 >= i5) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2303a = i12 + i10;
            }
        }
    }

    public void f(int i5, int i10) {
        int[] iArr = (int[]) this.f2472a;
        if (iArr == null || i5 >= iArr.length) {
            return;
        }
        int i11 = i5 + i10;
        b(i11);
        int[] iArr2 = (int[]) this.f2472a;
        System.arraycopy(iArr2, i11, iArr2, i5, (iArr2.length - i5) - i10);
        int[] iArr3 = (int[]) this.f2472a;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f2473b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f2473b).get(size);
            int i12 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2303a;
            if (i12 >= i5) {
                if (i12 < i11) {
                    ((ArrayList) this.f2473b).remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2303a = i12 - i10;
                }
            }
        }
    }
}
