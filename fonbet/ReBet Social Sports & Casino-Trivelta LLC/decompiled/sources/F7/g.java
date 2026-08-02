package F7;

import D6.k;
import H7.o;
import H7.p;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b f3589a;

    public static class a implements b {
        @Override // F7.g.b
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // F7.g.b
        public int b() {
            return 0;
        }

        public a() {
        }
    }

    public interface b {
        List a();

        int b();
    }

    public g() {
        this(new a());
    }

    @Override // F7.e
    public int a(int i10) {
        List a10 = this.f3589a.a();
        if (a10 == null || a10.isEmpty()) {
            return i10 + 1;
        }
        for (int i11 = 0; i11 < a10.size(); i11++) {
            if (((Integer) a10.get(i11)).intValue() > i10) {
                return ((Integer) a10.get(i11)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // F7.e
    public p b(int i10) {
        return o.d(i10, i10 >= this.f3589a.b(), false);
    }

    @Override // F7.e
    public boolean c() {
        return true;
    }

    public g(b bVar) {
        this.f3589a = (b) k.g(bVar);
    }
}
