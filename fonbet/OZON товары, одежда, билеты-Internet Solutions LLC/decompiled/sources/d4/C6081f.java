package d4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.C8050C;

/* renamed from: d4.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6081f extends AbstractC6077b {

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f61137a;

    /* renamed from: d4.f$a */
    public static final class a {
    }

    /* renamed from: d4.f$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<a> f61138a;

        private b(ArrayList arrayList) {
            this.f61138a = Collections.unmodifiableList(arrayList);
        }

        static b a(C8050C c8050c) {
            c8050c.G();
            boolean z11 = (c8050c.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            ArrayList arrayList = new ArrayList();
            if (!z11) {
                int E11 = c8050c.E();
                boolean z12 = (E11 & 64) != 0;
                boolean z13 = (E11 & 32) != 0;
                if (z12) {
                    c8050c.G();
                }
                if (!z12) {
                    int E12 = c8050c.E();
                    arrayList = new ArrayList(E12);
                    for (int i11 = 0; i11 < E12; i11++) {
                        c8050c.E();
                        c8050c.G();
                        arrayList.add(new a());
                    }
                }
                if (z13) {
                    c8050c.E();
                    c8050c.G();
                }
                c8050c.L();
                c8050c.E();
                c8050c.E();
            }
            return new b(arrayList);
        }
    }

    private C6081f(ArrayList arrayList) {
        this.f61137a = Collections.unmodifiableList(arrayList);
    }

    static C6081f d(C8050C c8050c) {
        int E11 = c8050c.E();
        ArrayList arrayList = new ArrayList(E11);
        for (int i11 = 0; i11 < E11; i11++) {
            arrayList.add(b.a(c8050c));
        }
        return new C6081f(arrayList);
    }
}
