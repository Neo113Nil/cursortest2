package ug;

import com.android.billingclient.api.l0;
import com.android.billingclient.api.u0;
import gf.a0;
import gf.c0;
import gf.d0;
import gf.g0;
import gf.h0;
import gf.z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l0 writer, boolean z5) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f24270c = z5;
    }

    @Override // com.android.billingclient.api.u0
    public final void d(byte b10) {
        if (this.f24270c) {
            gf.v vVar = gf.w.f10042b;
            j(String.valueOf(b10 & 255));
        } else {
            gf.v vVar2 = gf.w.f10042b;
            h(String.valueOf(b10 & 255));
        }
    }

    @Override // com.android.billingclient.api.u0
    public final void f(int i5) {
        if (this.f24270c) {
            z zVar = a0.f10010b;
            j(Long.toString(4294967295L & i5, 10));
        } else {
            z zVar2 = a0.f10010b;
            h(Long.toString(4294967295L & i5, 10));
        }
    }

    @Override // com.android.billingclient.api.u0
    public final void g(long j) {
        boolean z5 = this.f24270c;
        int i5 = 63;
        String str = CommonUrlParts.Values.FALSE_INTEGER;
        if (z5) {
            c0 c0Var = d0.f10017b;
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j6 = (j >>> 1) / 5;
                    long j10 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j6 * j10)), 10);
                    while (j6 > 0) {
                        i5--;
                        cArr[i5] = Character.forDigit((int) (j6 % j10), 10);
                        j6 /= j10;
                    }
                    str = new String(cArr, i5, 64 - i5);
                }
            }
            j(str);
            return;
        }
        c0 c0Var2 = d0.f10017b;
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j11 = (j >>> 1) / 5;
                long j12 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j11 * j12)), 10);
                while (j11 > 0) {
                    i5--;
                    cArr2[i5] = Character.forDigit((int) (j11 % j12), 10);
                    j11 /= j12;
                }
                str = new String(cArr2, i5, 64 - i5);
            }
        }
        h(str);
    }

    @Override // com.android.billingclient.api.u0
    public final void i(short s8) {
        if (this.f24270c) {
            g0 g0Var = h0.f10022b;
            j(String.valueOf(s8 & 65535));
        } else {
            g0 g0Var2 = h0.f10022b;
            h(String.valueOf(s8 & 65535));
        }
    }
}
