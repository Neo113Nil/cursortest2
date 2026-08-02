package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface e0 {

    public static class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final Random f21725a;
        private final int[] indexInShuffled;
        private final int[] shuffled;

        public a(int i10) {
            this(i10, new Random());
        }

        public static int[] h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // androidx.media3.exoplayer.source.e0
        public e0 a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.shuffled.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f21725a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // androidx.media3.exoplayer.source.e0
        public int b(int i10) {
            int i11 = this.indexInShuffled[i10] - 1;
            if (i11 >= 0) {
                return this.shuffled[i11];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.e0
        public int c(int i10) {
            int i11 = this.indexInShuffled[i10] + 1;
            int[] iArr = this.shuffled;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.e0
        public int d() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.e0
        public e0 e() {
            return new a(0, new Random(this.f21725a.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.e0
        public int f() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.e0
        public e0 g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f21725a.nextInt(this.shuffled.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f21725a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f21725a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // androidx.media3.exoplayer.source.e0
        public int getLength() {
            return this.shuffled.length;
        }

        public a(int i10, Random random) {
            this(h(i10, random), random);
        }

        public a(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.f21725a = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.indexInShuffled[iArr[i10]] = i10;
            }
        }
    }

    e0 a(int i10, int i11);

    int b(int i10);

    int c(int i10);

    int d();

    e0 e();

    int f();

    e0 g(int i10, int i11);

    int getLength();
}
