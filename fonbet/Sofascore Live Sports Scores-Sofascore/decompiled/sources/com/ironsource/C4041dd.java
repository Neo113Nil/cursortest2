package com.ironsource;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.wv8;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4041dd {
    private boolean a;

    @NotNull
    private String b;
    private boolean c;
    private int d;

    @Nullable
    private int[] e;

    @Nullable
    private int[] f;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ C4041dd(boolean r2, java.lang.String r3, boolean r4, int r5, int[] r6, int[] r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4041dd.<init>(boolean, java.lang.String, boolean, int, int[], int[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ C4041dd a(C4041dd c4041dd, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c4041dd.a;
        }
        if ((i2 & 2) != 0) {
            str = c4041dd.b;
        }
        if ((i2 & 4) != 0) {
            z2 = c4041dd.c;
        }
        if ((i2 & 8) != 0) {
            i = c4041dd.d;
        }
        if ((i2 & 16) != 0) {
            iArr = c4041dd.e;
        }
        if ((i2 & 32) != 0) {
            iArr2 = c4041dd.f;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return c4041dd.a(z, str, z2, i, iArr3, iArr4);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @Nullable
    public final int[] e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4041dd)) {
            return false;
        }
        C4041dd c4041dd = (C4041dd) obj;
        return this.a == c4041dd.a && Intrinsics.c(this.b, c4041dd.b) && this.c == c4041dd.c && this.d == c4041dd.d && Intrinsics.c(this.e, c4041dd.e) && Intrinsics.c(this.f, c4041dd.f);
    }

    @Nullable
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
        int c = dmi.c(r0 * 31, 31, this.b);
        boolean z2 = this.c;
        int a = wv8.a(this.d, (c + (z2 ? 1 : z2 ? 1 : 0)) * 31, 31);
        int[] iArr = this.e;
        int hashCode = (a + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f;
        return hashCode + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.a;
    }

    @NotNull
    public final String j() {
        return this.b;
    }

    @Nullable
    public final int[] k() {
        return this.f;
    }

    @Nullable
    public final int[] l() {
        return this.e;
    }

    @NotNull
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
        return fc6.o(sb, arrays, ", pixelOptIn=", arrays2, ")");
    }

    public final void b(boolean z) {
        this.a = z;
    }

    public final void b(@Nullable int[] iArr) {
        this.e = iArr;
    }

    @NotNull
    public final C4041dd a(boolean z, @NotNull String str, boolean z2, int i, @Nullable int[] iArr, @Nullable int[] iArr2) {
        str.getClass();
        return new C4041dd(z, str, z2, i, iArr, iArr2);
    }

    public final boolean a() {
        return this.a;
    }

    public C4041dd(boolean z, @NotNull String str, boolean z2, int i, @Nullable int[] iArr, @Nullable int[] iArr2) {
        str.getClass();
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = i;
        this.e = iArr;
        this.f = iArr2;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.b = str;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(@Nullable int[] iArr) {
        this.f = iArr;
    }

    public C4041dd() {
        this(false, null, false, 0, null, null, 63, null);
    }
}
