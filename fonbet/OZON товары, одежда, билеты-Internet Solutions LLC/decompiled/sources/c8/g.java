package c8;

import S7.p;
import com.google.crypto.tink.internal.C5885d;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.F;
import com.google.crypto.tink.internal.v;
import f8.O;
import java.security.GeneralSecurityException;

/* loaded from: classes9.dex */
public final class g implements p {

    /* renamed from: a, reason: collision with root package name */
    private final p f56700a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56701a;

        static {
            int[] iArr = new int[O.values().length];
            f56701a = iArr;
            try {
                iArr[O.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56701a[O.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56701a[O.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56701a[O.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private g(p pVar, O o11, byte[] bArr) {
        this.f56700a = pVar;
    }

    public static g a(C5891j c5891j) throws GeneralSecurityException {
        byte[] d11;
        F f7 = c5891j.f(S7.e.a());
        p pVar = (p) C5885d.d().a(p.class, f7.f()).c(f7.g());
        O e11 = f7.e();
        int i11 = a.f56701a[e11.ordinal()];
        if (i11 == 1) {
            d11 = v.f59296a.d();
        } else if (i11 == 2 || i11 == 3) {
            d11 = v.a(c5891j.c().intValue()).d();
        } else {
            if (i11 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            d11 = v.b(c5891j.c().intValue()).d();
        }
        return new g(pVar, e11, d11);
    }
}
