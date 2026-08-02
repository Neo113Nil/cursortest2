package Mb;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f7608a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7609b;

    public c(a aVar) {
        this.f7608a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f7609b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public final b a(int i10) {
        if (i10 >= this.f7609b.size()) {
            List list = this.f7609b;
            b bVar = (b) list.get(list.size() - 1);
            for (int size = this.f7609b.size(); size <= i10; size++) {
                a aVar = this.f7608a;
                bVar = bVar.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f7609b.add(bVar);
            }
        }
        return (b) this.f7609b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b a10 = a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] d10 = new b(this.f7608a, iArr2).h(i10, 1).b(a10)[1].d();
        int length2 = i10 - d10.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(d10, 0, iArr, length + length2, d10.length);
    }
}
