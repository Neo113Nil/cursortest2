package l9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o9.C8659a;

/* renamed from: l9.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7900d {

    /* renamed from: b, reason: collision with root package name */
    static final String[] f73119b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c, reason: collision with root package name */
    static final int[][] f73120c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f73121d;

    /* renamed from: e, reason: collision with root package name */
    static final int[][] f73122e;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f73123a;

    /* renamed from: l9.d$a */
    final class a implements Comparator<f> {
        @Override // java.util.Comparator
        public final int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f73121d = iArr;
        iArr[0][32] = 1;
        for (int i11 = 65; i11 <= 90; i11++) {
            f73121d[0][i11] = i11 - 63;
        }
        f73121d[1][32] = 1;
        for (int i12 = 97; i12 <= 122; i12++) {
            f73121d[1][i12] = i12 - 95;
        }
        f73121d[2][32] = 1;
        for (int i13 = 48; i13 <= 57; i13++) {
            f73121d[2][i13] = i13 - 46;
        }
        int[] iArr2 = f73121d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i14 = 0; i14 < 28; i14++) {
            f73121d[3][iArr3[i14]] = i14;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i15 = 0; i15 < 31; i15++) {
            int i16 = iArr4[i15];
            if (i16 > 0) {
                f73121d[4][i16] = i15;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f73122e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f73122e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public C7900d(byte[] bArr) {
        this.f73123a = bArr;
    }

    private static LinkedList b(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.add(fVar);
                    break;
                }
                f fVar2 = (f) it2.next();
                if (fVar2.f(fVar)) {
                    break;
                }
                if (fVar.f(fVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8659a a() {
        int i11;
        List<f> singletonList = Collections.singletonList(f.f73126e);
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f73123a;
            if (i12 >= bArr.length) {
                return ((f) Collections.min(singletonList, new a())).i(bArr);
            }
            int i13 = i12 + 1;
            byte b11 = i13 < bArr.length ? bArr[i13] : (byte) 0;
            byte b12 = bArr[i12];
            if (b12 == 13) {
                if (b11 == 10) {
                    i11 = 2;
                    if (i11 <= 0) {
                    }
                    i12++;
                }
                i11 = 0;
                if (i11 <= 0) {
                }
                i12++;
            } else if (b12 == 44) {
                if (b11 == 32) {
                    i11 = 4;
                    if (i11 <= 0) {
                    }
                    i12++;
                }
                i11 = 0;
                if (i11 <= 0) {
                }
                i12++;
            } else if (b12 != 46) {
                if (b12 == 58 && b11 == 32) {
                    i11 = 5;
                    if (i11 <= 0) {
                        LinkedList linkedList = new LinkedList();
                        for (f fVar : singletonList) {
                            f b13 = fVar.b(i12);
                            linkedList.add(b13.g(4, i11));
                            if (fVar.e() != 4) {
                                linkedList.add(b13.h(4, i11));
                            }
                            if (i11 == 3 || i11 == 4) {
                                linkedList.add(b13.g(2, 16 - i11).g(2, 1));
                            }
                            if (fVar.c() > 0) {
                                linkedList.add(fVar.a(i12).a(i13));
                            }
                        }
                        singletonList = b(linkedList);
                        i12 = i13;
                    } else {
                        LinkedList linkedList2 = new LinkedList();
                        for (f fVar2 : singletonList) {
                            char c11 = (char) (bArr[i12] & 255);
                            int e11 = fVar2.e();
                            int[][] iArr = f73121d;
                            boolean z11 = iArr[e11][c11] > 0;
                            f fVar3 = null;
                            for (int i14 = 0; i14 <= 4; i14++) {
                                int i15 = iArr[i14][c11];
                                if (i15 > 0) {
                                    if (fVar3 == null) {
                                        fVar3 = fVar2.b(i12);
                                    }
                                    if (!z11 || i14 == fVar2.e() || i14 == 2) {
                                        linkedList2.add(fVar3.g(i14, i15));
                                    }
                                    if (!z11 && f73122e[fVar2.e()][i14] >= 0) {
                                        linkedList2.add(fVar3.h(i14, i15));
                                    }
                                }
                            }
                            if (fVar2.c() > 0 || iArr[fVar2.e()][c11] == 0) {
                                linkedList2.add(fVar2.a(i12));
                            }
                        }
                        singletonList = b(linkedList2);
                    }
                    i12++;
                }
                i11 = 0;
                if (i11 <= 0) {
                }
                i12++;
            } else {
                if (b11 == 32) {
                    i11 = 3;
                    if (i11 <= 0) {
                    }
                    i12++;
                }
                i11 = 0;
                if (i11 <= 0) {
                }
                i12++;
            }
        }
    }
}
