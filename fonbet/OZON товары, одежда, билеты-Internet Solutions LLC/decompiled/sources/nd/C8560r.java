package nd;

import Ed.InterfaceC2966a;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.l;
import nd.AbstractC8504A;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;

/* renamed from: nd.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8560r implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77029a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8504A f77030b;

    public /* synthetic */ C8560r(AbstractC8504A abstractC8504A, int i11) {
        this.f77029a = i11;
        this.f77030b = abstractC8504A;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11;
        switch (this.f77029a) {
            case 0:
                AbstractC8504A abstractC8504A = this.f77030b;
                InterfaceC9836b t2 = abstractC8504A.t();
                ArrayList arrayList = new ArrayList();
                int i12 = 0;
                if (abstractC8504A.z()) {
                    i11 = 0;
                } else {
                    InterfaceC9834Z g10 = g1.g(t2);
                    if (g10 != null) {
                        arrayList.add(new C8577z0(abstractC8504A, 0, l.a.INSTANCE, new C8570w(g10)));
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    InterfaceC9834Z d02 = t2.d0();
                    if (d02 != null) {
                        arrayList.add(new C8577z0(abstractC8504A, i11, l.a.EXTENSION_RECEIVER, new C8572x(d02)));
                        i11++;
                    }
                }
                int size = t2.f().size();
                while (i12 < size) {
                    arrayList.add(new C8577z0(abstractC8504A, i11, l.a.VALUE, new C8574y(t2, i12)));
                    i12++;
                    i11++;
                }
                if (abstractC8504A.x() && (t2 instanceof InterfaceC2966a) && arrayList.size() > 1) {
                    C7714v.G0(new AbstractC8504A.a(), arrayList);
                }
                arrayList.trimToSize();
                return arrayList;
            default:
                return J0.D((J0) this.f77030b);
        }
    }
}
