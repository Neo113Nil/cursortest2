package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ae5 implements KSerializer {
    public static final ae5 a = new ae5();
    public static final g7f b = new g7f("kotlin.time.Duration", d7f.n);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        wd5 wd5Var = xd5.b;
        String z = decoder.z();
        wd5Var.getClass();
        z.getClass();
        try {
            long I = wkn.I(z);
            if (xd5.d(I, xd5.e)) {
                throw new IllegalStateException("invariant failed");
            }
            return new xd5(I);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(lnb.o("Invalid ISO duration string format: '", z, "'."), e);
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((xd5) obj).a;
        encoder.getClass();
        wd5 wd5Var = xd5.b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long m = j < 0 ? xd5.m(j) : j;
        long k = xd5.k(m, be5.HOURS);
        boolean z = false;
        int k2 = xd5.g(m) ? 0 : (int) (xd5.k(m, be5.MINUTES) % 60);
        int k3 = xd5.g(m) ? 0 : (int) (xd5.k(m, be5.SECONDS) % 60);
        int f = xd5.f(m);
        if (xd5.g(j)) {
            k = 9999999999999L;
        }
        boolean z2 = k != 0;
        boolean z3 = (k3 == 0 && f == 0) ? false : true;
        if (k2 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(k);
            sb.append('H');
        }
        if (z) {
            sb.append(k2);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            xd5.b(sb, k3, f, 9, PlayerKt.VOLLEYBALL_SETTER, true);
        }
        encoder.F(sb.toString());
    }
}
