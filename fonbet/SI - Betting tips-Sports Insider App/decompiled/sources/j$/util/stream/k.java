package j$.util.stream;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17945a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f17945a) {
            case 0:
                return new j$.util.w();
            case 1:
                return new j$.util.x();
            case 2:
                return new j$.util.z();
            case 3:
                return new LinkedHashSet();
            case 4:
                return new double[4];
            case 5:
                return new double[3];
            case 6:
                return new g0();
            case 7:
                return new h0();
            case 8:
                return new i0();
            case 9:
                return new j0();
            case 10:
                return new long[2];
            default:
                return new long[2];
        }
    }
}
