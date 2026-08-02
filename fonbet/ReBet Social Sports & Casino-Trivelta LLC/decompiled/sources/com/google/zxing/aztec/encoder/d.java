package com.google.zxing.aztec.encoder;

import com.plaid.internal.EnumC3631g;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class d {
    static final String[] MODE_NAMES = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f38367a = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][] f38368b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f38369c;
    private final byte[] text;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f38368b = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f38368b[0][i10] = i10 - 63;
        }
        f38368b[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f38368b[1][i11] = i11 - 95;
        }
        f38368b[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f38368b[2][i12] = i12 - 46;
        }
        int[] iArr2 = f38368b[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f38368b[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f38368b[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f38369c = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f38369c;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr) {
        this.text = bArr;
    }

    public static Collection b(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList.add(fVar);
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
        return linkedList;
    }

    public static void d(f fVar, int i10, int i11, Collection collection) {
        f b10 = fVar.b(i10);
        collection.add(b10.g(4, i11));
        if (fVar.e() != 4) {
            collection.add(b10.h(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(b10.g(2, 16 - i11).g(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    public static Collection f(Iterable iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d((f) it.next(), i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Lb.a a() {
        int i10;
        Collection singletonList = Collections.singletonList(f.f38373e);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.text;
            if (i11 >= bArr.length) {
                return ((f) Collections.min(singletonList, new a())).i(this.text);
            }
            int i12 = i11 + 1;
            byte b10 = i12 < bArr.length ? bArr[i12] : (byte) 0;
            byte b11 = bArr[i11];
            if (b11 == 13) {
                if (b10 == 10) {
                    i10 = 2;
                    if (i10 <= 0) {
                    }
                    i11++;
                }
                i10 = 0;
                if (i10 <= 0) {
                }
                i11++;
            } else if (b11 == 44) {
                if (b10 == 32) {
                    i10 = 4;
                    if (i10 <= 0) {
                    }
                    i11++;
                }
                i10 = 0;
                if (i10 <= 0) {
                }
                i11++;
            } else if (b11 != 46) {
                if (b11 == 58 && b10 == 32) {
                    i10 = 5;
                    if (i10 <= 0) {
                        singletonList = f(singletonList, i11, i10);
                        i11 = i12;
                    } else {
                        singletonList = e(singletonList, i11);
                    }
                    i11++;
                }
                i10 = 0;
                if (i10 <= 0) {
                }
                i11++;
            } else {
                if (b10 == 32) {
                    i10 = 3;
                    if (i10 <= 0) {
                    }
                    i11++;
                }
                i10 = 0;
                if (i10 <= 0) {
                }
                i11++;
            }
        }
    }

    public final void c(f fVar, int i10, Collection collection) {
        char c10 = (char) (this.text[i10] & UByte.MAX_VALUE);
        boolean z10 = f38368b[fVar.e()][c10] > 0;
        f fVar2 = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f38368b[i11][c10];
            if (i12 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.b(i10);
                }
                if (!z10 || i11 == fVar.e() || i11 == 2) {
                    collection.add(fVar2.g(i11, i12));
                }
                if (!z10 && f38369c[fVar.e()][i11] >= 0) {
                    collection.add(fVar2.h(i11, i12));
                }
            }
        }
        if (fVar.c() > 0 || f38368b[fVar.e()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    public final Collection e(Iterable iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c((f) it.next(), i10, linkedList);
        }
        return b(linkedList);
    }
}
