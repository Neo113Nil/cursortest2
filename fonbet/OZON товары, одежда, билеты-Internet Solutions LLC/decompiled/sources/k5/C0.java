package k5;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import k5.InterfaceC7518g2;

/* loaded from: classes8.dex */
final class C0 extends D0<Integer> implements InterfaceC7518g2<Integer>, O0 {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70517e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70518f;

    C0(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0) {
        super(Mm0.e.GooglePlayProtect);
        this.f70517e = context;
        this.f70518f = abstractC7520h0;
    }

    @Override // k5.InterfaceC7518g2
    /* renamed from: c */
    public final InterfaceC7518g2.a mo68c() {
        return new B0(this);
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70518f;
    }

    @Override // k5.O0
    @NonNull
    public final HashSet q() {
        return C7540m0.a(C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 86, 27, -14, 26, 28, -100, Byte.MIN_VALUE, -93, 74, 38, 36, -101, 82, 58, 120, 8, 77, -90, -49, 89, -57, -46, -41, -91, -122, -85, -78, -26, -105, 29, 76, -47}), C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 86, 27, -14, 26, 28, -100, Byte.MIN_VALUE, -93, 74, 38, 36, -101, 82, 58, 120, 8, 98, 71, 41, 21, -72, -35, 25, 10, 99, -2, 32, 13, 62, 123, 3, 125}), C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 86, 27, -14, 26, 28, -100, Byte.MIN_VALUE, -93, 74, 38, 36, -101, 82, 58, 120, 8, -15, 79, -62, -4, 118, -83, -34, 2, Byte.MIN_VALUE, -88, 105, -69, -73, 125, -123, -22, 54, -48, -109, 1, 17, -44, -109, -28, 125, 124, -91, 88, 117, -90, 50, -34}), C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 25, -7, -45, 103, 38, 58, 59, 24, 11, -19, 60, 60, -100, 58, 0, 72, 43, -59, 50, -124, 32, 9, 25, 123, -113, -2, 33, 47, -51, -20, -117, 57}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k5.D0
    @NonNull
    protected final Integer s() throws D1 {
        e();
        Integer num = (Integer) p(InterfaceC7500c0.f70717a);
        if (num != null) {
            return num;
        }
        throw new P1(C7563s0.a(new byte[]{-103, -75, 14, 84, 69, -13, 108, -7, -111, 8, -91, -65, 8, 77, 23, 37, -119, -24, -98, -123, -58, 2, 22, -11, -46, -113, -60, -89, 96, 60, 110, -110}));
    }
}
