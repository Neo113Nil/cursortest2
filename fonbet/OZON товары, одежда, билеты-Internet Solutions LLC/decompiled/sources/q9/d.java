package q9;

import C.o0;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final C8999a f81759a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f81760b;

    public d(C8999a c8999a) {
        this.f81759a = c8999a;
        ArrayList arrayList = new ArrayList();
        this.f81760b = arrayList;
        arrayList.add(new b(c8999a, new int[]{1}));
    }

    public final void a(int[] iArr, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i11;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f81760b;
        int size = arrayList.size();
        C8999a c8999a = this.f81759a;
        if (i11 >= size) {
            b bVar = (b) o0.b(1, arrayList);
            for (int size2 = arrayList.size(); size2 <= i11; size2++) {
                bVar = bVar.i(new b(c8999a, new int[]{1, c8999a.b(c8999a.c() + (size2 - 1))}));
                arrayList.add(bVar);
            }
        }
        b bVar2 = (b) arrayList.get(i11);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] e11 = new b(c8999a, iArr2).j(i11, 1).b(bVar2)[1].e();
        int length2 = i11 - e11.length;
        for (int i12 = 0; i12 < length2; i12++) {
            iArr[length + i12] = 0;
        }
        System.arraycopy(e11, 0, iArr, length + length2, e11.length);
    }
}
