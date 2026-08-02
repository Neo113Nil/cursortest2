package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import xsna.tv4;

/* loaded from: classes12.dex */
public abstract class g extends i {
    public final SparseArray a = new SparseArray();
    public final SparseBooleanArray b = new SparseBooleanArray();

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ca, code lost:
    
        if (r8 == (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01dc, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01da, code lost:
    
        if (r9 == (-1)) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bb  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j a(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, z zVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int[][] iArr;
        int i3;
        boolean z3;
        c cVar;
        int[][][] iArr2;
        int i4;
        int i5;
        y yVar;
        ArrayList arrayList;
        boolean z4;
        int i6;
        boolean a;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        int i11 = 1;
        int[] iArr4 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        y[][] yVarArr = new y[length][];
        int[][][] iArr5 = new int[aVarArr.length + 1][][];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = zVar.a;
            yVarArr[i12] = new y[i13];
            iArr5[i12] = new int[i13][];
        }
        int length2 = aVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            aVarArr[i14].getClass();
            iArr6[i14] = 4;
        }
        int i15 = 0;
        while (i15 < zVar.a) {
            y yVar2 = zVar.b[i15];
            int length3 = aVarArr.length;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i16 >= aVarArr.length) {
                    i10 = i11;
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i16];
                int i18 = 0;
                while (i18 < yVar2.a) {
                    o oVar = yVar2.b[i18];
                    i10 = i11;
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar;
                    cVar2.getClass();
                    try {
                        int b = cVar2.b(cVar2.h, oVar) & 3;
                        if (b > i17) {
                            if (b == 3) {
                                length3 = i16;
                                break;
                            }
                            i17 = b;
                            length3 = i16;
                        }
                        i18++;
                        i11 = i10;
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e);
                    }
                }
                i16++;
            }
            if (length3 == aVarArr.length) {
                iArr3 = new int[yVar2.a];
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar2 = aVarArr[length3];
                int[] iArr7 = new int[yVar2.a];
                for (int i19 = 0; i19 < yVar2.a; i19++) {
                    o oVar2 = yVar2.b[i19];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar2;
                    cVar3.getClass();
                    try {
                        iArr7[i19] = cVar3.b(cVar3.h, oVar2);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
                    }
                }
                iArr3 = iArr7;
            }
            int i20 = iArr4[length3];
            yVarArr[length3][i20] = yVar2;
            iArr5[length3][i20] = iArr3;
            iArr4[length3] = i20 + 1;
            i15++;
            i11 = i10;
        }
        int i21 = i11;
        z[] zVarArr = new z[aVarArr.length];
        int[] iArr8 = new int[aVarArr.length];
        for (int i22 = 0; i22 < aVarArr.length; i22++) {
            int i23 = iArr4[i22];
            zVarArr[i22] = new z((y[]) Arrays.copyOf(yVarArr[i22], i23));
            iArr5[i22] = (int[][]) Arrays.copyOf(iArr5[i22], i23);
            iArr8[i22] = aVarArr[i22].a;
        }
        new z((y[]) Arrays.copyOf(yVarArr[aVarArr.length], iArr4[aVarArr.length]));
        int length4 = aVarArr.length;
        b[] bVarArr = new b[length4];
        c cVar4 = (c) ((d) this).c.get();
        int i24 = 0;
        boolean z6 = false;
        while (i24 < length4) {
            if (2 == aVarArr[i24].a) {
                if (z6) {
                    cVar = cVar4;
                    iArr2 = iArr5;
                    i4 = i24;
                } else {
                    z zVar2 = zVarArr[i24];
                    int[][] iArr9 = iArr5[i24];
                    cVar4.getClass();
                    y yVar3 = null;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = -1;
                    int i29 = -1;
                    while (i25 < zVar2.a) {
                        y yVar4 = zVar2.b[i25];
                        c cVar5 = cVar4;
                        ArrayList arrayList2 = new ArrayList(yVar4.a);
                        int[][][] iArr10 = iArr5;
                        for (int i30 = 0; i30 < yVar4.a; i30 = tv4.a(arrayList2, i30, i30, i21)) {
                        }
                        int[] iArr11 = iArr9[i25];
                        int i31 = i27;
                        int i32 = i28;
                        int i33 = i24;
                        int i34 = i32;
                        int i35 = i29;
                        z zVar3 = zVar2;
                        int i36 = i35;
                        y yVar5 = yVar3;
                        int i37 = 0;
                        while (i37 < yVar4.a) {
                            int i38 = i37;
                            if (d.a(iArr11[i37], true)) {
                                o oVar3 = yVar4.b[i38];
                                if (arrayList2.contains(Integer.valueOf(i38))) {
                                    int i39 = oVar3.j;
                                    yVar = yVar4;
                                    arrayList = arrayList2;
                                    if ((i39 == -1 || i39 <= Integer.MAX_VALUE) && (((i8 = oVar3.k) == -1 || i8 <= Integer.MAX_VALUE) && ((i9 = oVar3.b) == -1 || i9 <= Integer.MAX_VALUE))) {
                                        z4 = true;
                                        i6 = !z4 ? 2 : 1;
                                        boolean z7 = z4;
                                        a = d.a(iArr11[i38], false);
                                        if (a) {
                                            i6 += 1000;
                                        }
                                        z5 = i6 <= i31;
                                        if (i6 != i31) {
                                            if (oVar3.b() != i34) {
                                                int b2 = oVar3.b();
                                                i5 = i31;
                                                i7 = -1;
                                                if (b2 != -1) {
                                                    if (i34 != -1) {
                                                        i7 = b2 - i34;
                                                    }
                                                    i7 = 1;
                                                }
                                                z5 = a || !z7 ? i7 < 0 : i7 > 0;
                                            } else {
                                                i5 = i31;
                                                i7 = -1;
                                                int i40 = oVar3.b;
                                                if (i40 != -1) {
                                                    if (i36 != -1) {
                                                        i7 = i40 - i36;
                                                    }
                                                    i7 = 1;
                                                }
                                                if (a) {
                                                }
                                            }
                                            i37 = i38 + 1;
                                            yVar4 = yVar;
                                            arrayList2 = arrayList;
                                        } else {
                                            i5 = i31;
                                        }
                                        if (z5) {
                                            i36 = oVar3.b;
                                            i34 = oVar3.b();
                                            i31 = i6;
                                            i26 = i38;
                                            yVar5 = yVar;
                                            i37 = i38 + 1;
                                            yVar4 = yVar;
                                            arrayList2 = arrayList;
                                        }
                                    }
                                } else {
                                    yVar = yVar4;
                                    arrayList = arrayList2;
                                }
                                z4 = false;
                                if (!z4) {
                                }
                                boolean z72 = z4;
                                a = d.a(iArr11[i38], false);
                                if (a) {
                                }
                                if (i6 <= i31) {
                                }
                                if (i6 != i31) {
                                }
                                if (z5) {
                                }
                            } else {
                                i5 = i31;
                                yVar = yVar4;
                                arrayList = arrayList2;
                            }
                            i31 = i5;
                            i37 = i38 + 1;
                            yVar4 = yVar;
                            arrayList2 = arrayList;
                        }
                        int i41 = i31;
                        i25++;
                        i28 = i34;
                        i24 = i33;
                        i29 = i36;
                        zVar2 = zVar3;
                        cVar4 = cVar5;
                        iArr5 = iArr10;
                        yVar3 = yVar5;
                        i27 = i41;
                        i21 = 1;
                    }
                    cVar = cVar4;
                    iArr2 = iArr5;
                    i4 = i24;
                    e eVar = yVar3 == null ? null : new e(yVar3, i26);
                    bVarArr[i4] = eVar;
                    z6 = eVar != null;
                }
                int i42 = zVarArr[i4].a;
            } else {
                cVar = cVar4;
                iArr2 = iArr5;
                i4 = i24;
            }
            i24 = i4 + 1;
            cVar4 = cVar;
            iArr5 = iArr2;
            i21 = 1;
        }
        c cVar6 = cVar4;
        int[][][] iArr12 = iArr5;
        boolean z8 = false;
        boolean z9 = false;
        int i43 = 0;
        while (i43 < length4) {
            int i44 = aVarArr[i43].a;
            if (i44 == 1) {
                z = z8;
                i = length4;
                z2 = z9;
                if (!z2) {
                    z zVar4 = zVarArr[i43];
                    int[][] iArr13 = iArr12[i43];
                    cVar6.getClass();
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = -1;
                    int i48 = -1;
                    while (i45 < zVar4.a) {
                        y yVar6 = zVar4.b[i45];
                        int[] iArr14 = iArr13[i45];
                        int i49 = i48;
                        int i50 = 0;
                        while (i50 < yVar6.a) {
                            int[][] iArr15 = iArr13;
                            if (d.a(iArr14[i50], true)) {
                                o oVar4 = yVar6.b[i50];
                                int i51 = iArr14[i50];
                                int i52 = (oVar4.x & 1) != 0 ? 2 : 1;
                                i2 = i45;
                                if (d.a(i51, false)) {
                                    i52 += 1000;
                                }
                                if (i52 > i46) {
                                    i47 = i50;
                                    i46 = i52;
                                    i49 = i2;
                                }
                            } else {
                                i2 = i45;
                            }
                            i50++;
                            i45 = i2;
                            iArr13 = iArr15;
                        }
                        i45++;
                        i48 = i49;
                        iArr13 = iArr13;
                    }
                    e eVar2 = i48 == -1 ? null : new e(zVar4.b[i48], i47);
                    bVarArr[i43] = eVar2;
                    z2 = eVar2 != null;
                    z8 = z;
                    i43++;
                    length4 = i;
                    z9 = z2;
                }
            } else if (i44 == 2) {
                z = z8;
                i = length4;
                z2 = z9;
            } else if (i44 != 3) {
                z zVar5 = zVarArr[i43];
                int[][] iArr16 = iArr12[i43];
                cVar6.getClass();
                y yVar7 = null;
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                while (i53 < zVar5.a) {
                    y yVar8 = zVar5.b[i53];
                    int[] iArr17 = iArr16[i53];
                    boolean z10 = z8;
                    int i56 = length4;
                    int i57 = 0;
                    while (i57 < yVar8.a) {
                        int i58 = i57;
                        if (d.a(iArr17[i57], true)) {
                            int i59 = (yVar8.b[i58].x & 1) != 0 ? 2 : 1;
                            z3 = z9;
                            if (d.a(iArr17[i58], false)) {
                                i59 += 1000;
                            }
                            if (i59 > i55) {
                                i55 = i59;
                                yVar7 = yVar8;
                                i54 = i58;
                            }
                        } else {
                            z3 = z9;
                        }
                        i57 = i58 + 1;
                        z9 = z3;
                    }
                    i53++;
                    z8 = z10;
                    length4 = i56;
                }
                z = z8;
                i = length4;
                z2 = z9;
                bVarArr[i43] = yVar7 == null ? null : new e(yVar7, i54);
            } else {
                z = z8;
                i = length4;
                z2 = z9;
                if (!z) {
                    z zVar6 = zVarArr[i43];
                    int[][] iArr18 = iArr12[i43];
                    cVar6.getClass();
                    y yVar9 = null;
                    int i60 = 0;
                    int i61 = 0;
                    int i62 = 0;
                    while (i60 < zVar6.a) {
                        y yVar10 = zVar6.b[i60];
                        int[] iArr19 = iArr18[i60];
                        y yVar11 = yVar9;
                        int i63 = 0;
                        while (i63 < yVar10.a) {
                            z zVar7 = zVar6;
                            if (d.a(iArr19[i63], true)) {
                                int i64 = yVar10.b[i63].x;
                                boolean z11 = (i64 & 1) != 0;
                                boolean z12 = (i64 & 2) != 0;
                                if (!z11) {
                                    i3 = z12 ? 1 : 3;
                                }
                                iArr = iArr18;
                                if (d.a(iArr19[i63], false)) {
                                    i3 += 1000;
                                }
                                if (i3 > i62) {
                                    i62 = i3;
                                    i61 = i63;
                                    yVar11 = yVar10;
                                }
                                i63++;
                                zVar6 = zVar7;
                                iArr18 = iArr;
                            }
                            iArr = iArr18;
                            i63++;
                            zVar6 = zVar7;
                            iArr18 = iArr;
                        }
                        i60++;
                        yVar9 = yVar11;
                    }
                    e eVar3 = yVar9 == null ? null : new e(yVar9, i61);
                    bVarArr[i43] = eVar3;
                    z8 = eVar3 != null;
                    i43++;
                    length4 = i;
                    z9 = z2;
                }
            }
            z8 = z;
            i43++;
            length4 = i;
            z9 = z2;
        }
        for (int i65 = 0; i65 < aVarArr.length; i65++) {
            if (this.b.get(i65)) {
                bVarArr[i65] = null;
            } else {
                z zVar8 = zVarArr[i65];
                Map map = (Map) this.a.get(i65);
                if (!(map != null && map.containsKey(zVar8))) {
                    continue;
                } else {
                    if (((Map) this.a.get(i65)).get(zVar8) != null) {
                        throw new ClassCastException();
                    }
                    bVarArr[i65] = null;
                }
            }
        }
        f fVar = new f(zVarArr);
        t[] tVarArr = new t[aVarArr.length];
        for (int i66 = 0; i66 < aVarArr.length; i66++) {
            tVarArr[i66] = bVarArr[i66] != null ? t.b : null;
        }
        return new j(zVar, new h(bVarArr), fVar, tVarArr);
    }
}
