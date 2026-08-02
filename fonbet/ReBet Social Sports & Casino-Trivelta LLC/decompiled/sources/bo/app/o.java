package bo.app;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.braze.models.BannerPendingDismissal;
import di.C4096j0;
import di.J0;
import di.N;
import di.Z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final o f25839a;
    private static final bi.f descriptor;

    static {
        o oVar = new o();
        f25839a = oVar;
        J0 j02 = new J0("com.braze.models.BannerPendingDismissal", oVar, 3);
        j02.n("banner_id", false);
        j02.n("stable_key", true);
        j02.n("dismissal_time", false);
        descriptor = j02;
    }

    @Override // di.N
    public final InterfaceC1901b[] childSerializers() {
        Z0 z02 = Z0.f45341a;
        return new InterfaceC1901b[]{z02, AbstractC2028a.t(z02), C4096j0.f45375a};
    }

    @Override // Zh.InterfaceC1900a
    public final Object deserialize(ci.e decoder) {
        int i10;
        String str;
        long j10;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bi.f fVar = descriptor;
        ci.c c10 = decoder.c(fVar);
        String str3 = null;
        if (c10.q()) {
            str = c10.s(fVar, 0);
            i10 = 7;
            str2 = (String) c10.C(fVar, 1, Z0.f45341a, null);
            j10 = c10.g(fVar, 2);
        } else {
            long j11 = 0;
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            while (z10) {
                int e10 = c10.e(fVar);
                if (e10 == -1) {
                    z10 = false;
                } else if (e10 == 0) {
                    str3 = c10.s(fVar, 0);
                    i11 |= 1;
                } else if (e10 == 1) {
                    str4 = (String) c10.C(fVar, 1, Z0.f45341a, str4);
                    i11 |= 2;
                } else {
                    if (e10 != 2) {
                        throw new B(e10);
                    }
                    j11 = c10.g(fVar, 2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            str = str3;
            j10 = j11;
            str2 = str4;
        }
        c10.b(fVar);
        return new BannerPendingDismissal(i10, str, str2, j10, null);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public final bi.f getDescriptor() {
        return descriptor;
    }

    @Override // Zh.p
    public final void serialize(ci.f encoder, Object obj) {
        BannerPendingDismissal value = (BannerPendingDismissal) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        bi.f fVar = descriptor;
        ci.d c10 = encoder.c(fVar);
        BannerPendingDismissal.write$Self$android_sdk_base_release(value, c10, fVar);
        c10.b(fVar);
    }
}
