package x6;

import x6.f;

/* loaded from: classes2.dex */
public class c implements j {

    public class a implements i {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(f.a aVar, f.a aVar2) {
            long a10 = aVar.a();
            long a11 = aVar2.a();
            if (a10 < a11) {
                return -1;
            }
            return a11 == a10 ? 0 : 1;
        }
    }

    @Override // x6.j
    public i get() {
        return new a();
    }
}
