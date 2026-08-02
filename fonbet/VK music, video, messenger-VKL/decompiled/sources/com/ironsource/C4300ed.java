package com.ironsource;

import java.util.Arrays;
import xsna.epx;
import xsna.h5s;
import xsna.shy;
import xsna.urd0;

/* renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4300ed {
    private boolean a;
    private String b;
    private boolean c;
    private int d;
    private int[] e;
    private int[] f;

    public C4300ed() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int[] e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4300ed)) {
            return false;
        }
        C4300ed c4300ed = (C4300ed) obj;
        return this.a == c4300ed.a && epx.f(this.b, c4300ed.b) && this.c == c4300ed.c && this.d == c4300ed.d && epx.f(this.e, c4300ed.e) && epx.f(this.f, c4300ed.f);
    }

    public final int[] f() {
        return this.f;
    }

    public final boolean g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int a = urd0.a(r0 * 31, 31, this.b);
        boolean z2 = this.c;
        int a2 = shy.a(this.d, (a + (z2 ? 1 : z2 ? 1 : 0)) * 31, 31);
        int[] iArr = this.e;
        int hashCode = (a2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f;
        return hashCode + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.a;
    }

    public final String j() {
        return this.b;
    }

    public final int[] k() {
        return this.f;
    }

    public final int[] l() {
        return this.e;
    }

    public String toString() {
        boolean z = this.a;
        String str = this.b;
        boolean z2 = this.c;
        int i = this.d;
        String arrays = Arrays.toString(this.e);
        String arrays2 = Arrays.toString(this.f);
        StringBuilder sb = new StringBuilder("PixelSettings(pixelEventsEnabled=");
        sb.append(z);
        sb.append(", pixelEventsUrl=");
        sb.append(str);
        sb.append(", pixelEventsCompression=");
        sb.append(z2);
        sb.append(", pixelEventsCompressionLevel=");
        sb.append(i);
        sb.append(", pixelOptOut=");
        return h5s.d(sb, arrays, ", pixelOptIn=", arrays2, ")");
    }

    public C4300ed(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = i;
        this.e = iArr;
        this.f = iArr2;
    }

    public final C4300ed a(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2) {
        return new C4300ed(z, str, z2, i, iArr, iArr2);
    }

    public final void b(boolean z) {
        this.a = z;
    }

    public static /* synthetic */ C4300ed a(C4300ed c4300ed, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c4300ed.a;
        }
        if ((i2 & 2) != 0) {
            str = c4300ed.b;
        }
        if ((i2 & 4) != 0) {
            z2 = c4300ed.c;
        }
        if ((i2 & 8) != 0) {
            i = c4300ed.d;
        }
        if ((i2 & 16) != 0) {
            iArr = c4300ed.e;
        }
        if ((i2 & 32) != 0) {
            iArr2 = c4300ed.f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c4300ed.a(z, str, z2, i, iArr3, iArr4);
    }

    public final void b(int[] iArr) {
        this.e = iArr;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(int[] iArr) {
        this.f = iArr;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ C4300ed(boolean r2, java.lang.String r3, boolean r4, int r5, int[] r6, int[] r7, int r8, xsna.zcl r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            java.lang.String r3 = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=3"
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = 0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = -1
        L15:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4300ed.<init>(boolean, java.lang.String, boolean, int, int[], int[], int, xsna.zcl):void");
    }
}
