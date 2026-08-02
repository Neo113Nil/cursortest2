package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f23685a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23686b = new y0("kotlin.time.Duration", qg.e.f22164m);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        cg.a aVar = cg.b.f3911b;
        String value = decoder.s();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new cg.b(cg.d.a(value));
        } catch (IllegalArgumentException e7) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.n("Invalid ISO duration string format: '", value, "'."), e7);
        }
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        long j;
        int f6;
        long j6 = ((cg.b) obj).f3914a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        cg.a aVar = cg.b.f3911b;
        StringBuilder sb2 = new StringBuilder();
        if (j6 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long h10 = j6 < 0 ? cg.b.h(j6) : j6;
        long f10 = cg.b.f(h10, cg.e.f3921g);
        boolean z5 = false;
        if (cg.b.d(h10)) {
            j = 0;
            f6 = 0;
        } else {
            j = 0;
            f6 = (int) (cg.b.f(h10, cg.e.f3920f) % 60);
        }
        int f11 = cg.b.d(h10) ? 0 : (int) (cg.b.f(h10, cg.e.f3919e) % 60);
        int c2 = cg.b.c(h10);
        if (cg.b.d(j6)) {
            f10 = 9999999999999L;
        }
        boolean z7 = f10 != j;
        boolean z10 = (f11 == 0 && c2 == 0) ? false : true;
        if (f6 != 0 || (z10 && z7)) {
            z5 = true;
        }
        if (z7) {
            sb2.append(f10);
            sb2.append('H');
        }
        if (z5) {
            sb2.append(f6);
            sb2.append('M');
        }
        if (z10 || (!z7 && !z5)) {
            cg.b.b(sb2, f11, c2, 9, "S", true);
        }
        encoder.r(sb2.toString());
    }

    @Override // og.a
    public final qg.g d() {
        return f23686b;
    }
}
