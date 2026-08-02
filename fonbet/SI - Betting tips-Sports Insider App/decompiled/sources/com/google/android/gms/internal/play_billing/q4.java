package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q4 extends g3 {
    private static final q4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private u4 zzh;

    static {
        q4 q4Var = new q4();
        zzb = q4Var;
        g3.k(q4.class, q4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.play_billing.d4] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.g3, java.lang.Object] */
    public static q4 n(byte[] bArr, a3 a3Var) {
        q4 q4Var = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (g3) q4Var.d(4);
            try {
                ?? a7 = a4.f5397c.a(r22.getClass());
                com.google.android.gms.internal.measurement.t4 t4Var = new com.google.android.gms.internal.measurement.t4();
                a3Var.getClass();
                a7.h(r22, bArr, 0, length, t4Var);
                a7.a(r22);
                q4Var = r22;
            } catch (g4 e7) {
                throw new n3(e7.getMessage());
            } catch (n3 e9) {
                throw e9;
            } catch (IOException e10) {
                if (e10.getCause() instanceof n3) {
                    throw ((n3) e10.getCause());
                }
                throw new n3(e10.getMessage(), e10);
            } catch (IndexOutOfBoundsException unused) {
                throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (q4Var == null || g3.m(q4Var, true)) {
            return q4Var;
        }
        throw new n3(new g4().getMessage());
    }

    public static /* synthetic */ void o(q4 q4Var, u4 u4Var) {
        q4Var.zzh = u4Var;
        q4Var.zzd |= 2;
    }

    public static /* synthetic */ void p(q4 q4Var, e5 e5Var) {
        q4Var.zzf = e5Var;
        q4Var.zze = 4;
    }

    public static /* synthetic */ void q(q4 q4Var, int i5) {
        q4Var.zzg = i5 - 1;
        q4Var.zzd |= 1;
    }

    public static p4 r() {
        return (p4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", s2.f5573c, "zzh", e5.class});
        }
        if (i10 == 3) {
            return new q4();
        }
        if (i10 == 4) {
            return new p4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
