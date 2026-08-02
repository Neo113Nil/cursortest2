package t9;

import h9.m;
import h9.s;
import o9.C8660b;
import o9.C8664f;
import o9.C8665g;
import o9.C8667i;
import p9.C8873a;

/* renamed from: t9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9780a {

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f99281a;

    /* renamed from: b, reason: collision with root package name */
    private final C8873a f99282b;

    public C9780a(C8660b c8660b) throws m {
        this.f99281a = c8660b;
        this.f99282b = new C8873a(c8660b);
    }

    private boolean b(s sVar) {
        if (sVar.b() < 0.0f) {
            return false;
        }
        float b11 = sVar.b();
        C8660b c8660b = this.f99281a;
        return b11 < ((float) c8660b.j()) && sVar.c() > 0.0f && sVar.c() < ((float) c8660b.g());
    }

    private static s c(s sVar, float f7, float f11) {
        float b11 = sVar.b();
        float c11 = sVar.c();
        return new s(b11 < f7 ? b11 - 1.0f : b11 + 1.0f, c11 < f11 ? c11 - 1.0f : c11 + 1.0f);
    }

    private static s d(s sVar, s sVar2, int i11) {
        float f7 = i11 + 1;
        return new s(sVar.b() + ((sVar2.b() - sVar.b()) / f7), sVar.c() + ((sVar2.c() - sVar.c()) / f7));
    }

    private int e(s sVar, s sVar2) {
        int b11 = (int) sVar.b();
        int c11 = (int) sVar.c();
        int b12 = (int) sVar2.b();
        int c12 = (int) sVar2.c();
        int i11 = 0;
        boolean z11 = Math.abs(c12 - c11) > Math.abs(b12 - b11);
        if (z11) {
            c11 = b11;
            b11 = c11;
            c12 = b12;
            b12 = c12;
        }
        int abs = Math.abs(b12 - b11);
        int abs2 = Math.abs(c12 - c11);
        int i12 = (-abs) / 2;
        int i13 = c11 < c12 ? 1 : -1;
        int i14 = b11 >= b12 ? -1 : 1;
        int i15 = z11 ? c11 : b11;
        int i16 = z11 ? b11 : c11;
        C8660b c8660b = this.f99281a;
        boolean d11 = c8660b.d(i15, i16);
        while (b11 != b12) {
            boolean d12 = c8660b.d(z11 ? c11 : b11, z11 ? b11 : c11);
            if (d12 != d11) {
                i11++;
                d11 = d12;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (c11 == c12) {
                    return i11;
                }
                c11 += i13;
                i12 -= abs;
            }
            b11 += i14;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        if ((e(r10, r14) + e(r9, r14)) > (e(r10, r5) + e(r9, r5))) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8665g a() throws m {
        s[] b11 = this.f99282b.b();
        s sVar = b11[0];
        s sVar2 = b11[1];
        s sVar3 = b11[3];
        s sVar4 = b11[2];
        int e11 = e(sVar, sVar2);
        int e12 = e(sVar2, sVar3);
        int e13 = e(sVar3, sVar4);
        int e14 = e(sVar4, sVar);
        s[] sVarArr = {sVar4, sVar, sVar2, sVar3};
        if (e11 > e12) {
            sVarArr[0] = sVar;
            sVarArr[1] = sVar2;
            sVarArr[2] = sVar3;
            sVarArr[3] = sVar4;
            e11 = e12;
        }
        if (e11 > e13) {
            sVarArr[0] = sVar2;
            sVarArr[1] = sVar3;
            sVarArr[2] = sVar4;
            sVarArr[3] = sVar;
        } else {
            e13 = e11;
        }
        if (e13 > e14) {
            sVarArr[0] = sVar3;
            sVarArr[1] = sVar4;
            sVarArr[2] = sVar;
            sVarArr[3] = sVar2;
        }
        s sVar5 = sVarArr[0];
        s sVar6 = sVarArr[1];
        s sVar7 = sVarArr[2];
        s sVar8 = sVarArr[3];
        int e15 = (e(sVar5, sVar8) + 1) << 2;
        if (e(d(sVar6, sVar7, e15), sVar5) < e(d(sVar7, sVar6, e15), sVar8)) {
            sVarArr[0] = sVar5;
            sVarArr[1] = sVar6;
            sVarArr[2] = sVar7;
            sVarArr[3] = sVar8;
        } else {
            sVarArr[0] = sVar6;
            sVarArr[1] = sVar7;
            sVarArr[2] = sVar8;
            sVarArr[3] = sVar5;
        }
        s sVar9 = sVarArr[0];
        s sVar10 = sVarArr[1];
        s sVar11 = sVarArr[2];
        s sVar12 = sVarArr[3];
        int e16 = e(sVar9, sVar12);
        s d11 = d(sVar9, sVar10, (e(sVar10, sVar12) + 1) << 2);
        s d12 = d(sVar11, sVar10, (e16 + 1) << 2);
        int e17 = e(d11, sVar12);
        int e18 = e(d12, sVar12);
        float f7 = e17 + 1;
        s sVar13 = new s(((sVar11.b() - sVar10.b()) / f7) + sVar12.b(), ((sVar11.c() - sVar10.c()) / f7) + sVar12.c());
        float f11 = e18 + 1;
        s sVar14 = new s(((sVar9.b() - sVar10.b()) / f11) + sVar12.b(), ((sVar9.c() - sVar10.c()) / f11) + sVar12.c());
        if (!b(sVar13)) {
            if (!b(sVar14)) {
                sVar13 = null;
            }
            sVar13 = sVar14;
        } else if (b(sVar14)) {
        }
        sVarArr[3] = sVar13;
        if (sVar13 == null) {
            throw m.a();
        }
        s sVar15 = sVarArr[0];
        s sVar16 = sVarArr[1];
        s sVar17 = sVarArr[2];
        int e19 = e(sVar15, sVar13) + 1;
        s d13 = d(sVar15, sVar16, (e(sVar17, sVar13) + 1) << 2);
        s d14 = d(sVar17, sVar16, e19 << 2);
        int e21 = e(d13, sVar13);
        int i11 = e21 + 1;
        int e22 = e(d14, sVar13);
        int i12 = e22 + 1;
        if ((i11 & 1) == 1) {
            i11 = e21 + 2;
        }
        if ((i12 & 1) == 1) {
            i12 = e22 + 2;
        }
        float b12 = (sVar13.b() + (sVar17.b() + (sVar16.b() + sVar15.b()))) / 4.0f;
        float c11 = (sVar13.c() + (sVar17.c() + (sVar16.c() + sVar15.c()))) / 4.0f;
        s c12 = c(sVar15, b12, c11);
        s c13 = c(sVar16, b12, c11);
        s c14 = c(sVar17, b12, c11);
        s c15 = c(sVar13, b12, c11);
        int i13 = i12 << 2;
        int i14 = i11 << 2;
        s[] sVarArr2 = {d(d(c12, c13, i13), c15, i14), d(d(c13, c12, i13), c14, i14), d(d(c14, c15, i13), c13, i14), d(d(c15, c14, i13), c12, i14)};
        s sVar18 = sVarArr2[0];
        s sVar19 = sVarArr2[1];
        s sVar20 = sVarArr2[2];
        s sVar21 = sVarArr2[3];
        int e23 = e(sVar18, sVar21);
        int i15 = e23 + 1;
        int e24 = e(sVar20, sVar21);
        int i16 = e24 + 1;
        if ((i15 & 1) == 1) {
            i15 = e23 + 2;
        }
        if ((i16 & 1) == 1) {
            i16 = e24 + 2;
        }
        if (i15 * 4 < i16 * 7 && i16 * 4 < i15 * 7) {
            i15 = Math.max(i15, i16);
            i16 = i15;
        }
        float f12 = i15 - 0.5f;
        float f13 = i16 - 0.5f;
        return new C8665g(C8664f.a(this.f99281a, i15, i16, C8667i.a(0.5f, 0.5f, f12, 0.5f, f12, f13, 0.5f, f13, sVar18.b(), sVar18.c(), sVar21.b(), sVar21.c(), sVar20.b(), sVar20.c(), sVar19.b(), sVar19.c())), new s[]{sVar18, sVar19, sVar20, sVar21});
    }
}
