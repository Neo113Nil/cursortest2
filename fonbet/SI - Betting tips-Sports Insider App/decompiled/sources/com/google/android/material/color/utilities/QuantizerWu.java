package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class Box {

        /* renamed from: b0, reason: collision with root package name */
        int f5878b0;

        /* renamed from: b1, reason: collision with root package name */
        int f5879b1;

        /* renamed from: g0, reason: collision with root package name */
        int f5880g0;

        /* renamed from: g1, reason: collision with root package name */
        int f5881g1;

        /* renamed from: r0, reason: collision with root package name */
        int f5882r0;

        /* renamed from: r1, reason: collision with root package name */
        int f5883r1;
        int vol;

        private Box() {
            this.f5882r0 = 0;
            this.f5883r1 = 0;
            this.f5880g0 = 0;
            this.f5881g1 = 0;
            this.f5878b0 = 0;
            this.f5879b1 = 0;
            this.vol = 0;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i5, int i10) {
            this.resultCount = i10;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i5, double d10) {
            this.cutLocation = i5;
            this.maximum = d10;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i5;
        int i10;
        int ordinal = direction.ordinal();
        if (ordinal == 0) {
            i5 = (-iArr[getIndex(box.f5882r0, box.f5881g1, box.f5879b1)]) + iArr[getIndex(box.f5882r0, box.f5881g1, box.f5878b0)] + iArr[getIndex(box.f5882r0, box.f5880g0, box.f5879b1)];
            i10 = iArr[getIndex(box.f5882r0, box.f5880g0, box.f5878b0)];
        } else if (ordinal == 1) {
            i5 = (-iArr[getIndex(box.f5883r1, box.f5880g0, box.f5879b1)]) + iArr[getIndex(box.f5883r1, box.f5880g0, box.f5878b0)] + iArr[getIndex(box.f5882r0, box.f5880g0, box.f5879b1)];
            i10 = iArr[getIndex(box.f5882r0, box.f5880g0, box.f5878b0)];
        } else {
            if (ordinal != 2) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i5 = (-iArr[getIndex(box.f5883r1, box.f5881g1, box.f5878b0)]) + iArr[getIndex(box.f5883r1, box.f5880g0, box.f5878b0)] + iArr[getIndex(box.f5882r0, box.f5881g1, box.f5878b0)];
            i10 = iArr[getIndex(box.f5882r0, box.f5880g0, box.f5878b0)];
        }
        return i5 - i10;
    }

    public static int getIndex(int i5, int i10, int i11) {
        return (i5 << 10) + (i5 << 6) + i5 + (i10 << 5) + i10 + i11;
    }

    public static int top(Box box, Direction direction, int i5, int[] iArr) {
        int i10;
        int i11;
        int ordinal = direction.ordinal();
        if (ordinal == 0) {
            i10 = (iArr[getIndex(i5, box.f5881g1, box.f5879b1)] - iArr[getIndex(i5, box.f5881g1, box.f5878b0)]) - iArr[getIndex(i5, box.f5880g0, box.f5879b1)];
            i11 = iArr[getIndex(i5, box.f5880g0, box.f5878b0)];
        } else if (ordinal == 1) {
            i10 = (iArr[getIndex(box.f5883r1, i5, box.f5879b1)] - iArr[getIndex(box.f5883r1, i5, box.f5878b0)]) - iArr[getIndex(box.f5882r0, i5, box.f5879b1)];
            i11 = iArr[getIndex(box.f5882r0, i5, box.f5878b0)];
        } else {
            if (ordinal != 2) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i10 = (iArr[getIndex(box.f5883r1, box.f5881g1, i5)] - iArr[getIndex(box.f5883r1, box.f5880g0, i5)]) - iArr[getIndex(box.f5882r0, box.f5881g1, i5)];
            i11 = iArr[getIndex(box.f5882r0, box.f5880g0, i5)];
        }
        return i10 + i11;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f5883r1, box.f5881g1, box.f5879b1)] - iArr[getIndex(box.f5883r1, box.f5881g1, box.f5878b0)]) - iArr[getIndex(box.f5883r1, box.f5880g0, box.f5879b1)]) + iArr[getIndex(box.f5883r1, box.f5880g0, box.f5878b0)]) - iArr[getIndex(box.f5882r0, box.f5881g1, box.f5879b1)]) + iArr[getIndex(box.f5882r0, box.f5881g1, box.f5878b0)]) + iArr[getIndex(box.f5882r0, box.f5880g0, box.f5879b1)]) - iArr[getIndex(box.f5882r0, box.f5880g0, box.f5878b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int redFromArgb = ColorUtils.redFromArgb(intValue);
            int greenFromArgb = ColorUtils.greenFromArgb(intValue);
            int blueFromArgb = ColorUtils.blueFromArgb(intValue);
            int index = getIndex((redFromArgb >> 3) + 1, (greenFromArgb >> 3) + 1, (blueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + intValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = (redFromArgb * intValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (greenFromArgb * intValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (blueFromArgb * intValue2) + iArr4[index];
            double[] dArr = this.moments;
            int i5 = blueFromArgb * blueFromArgb;
            dArr[index] = dArr[index] + ((i5 + (greenFromArgb * greenFromArgb) + (redFromArgb * redFromArgb)) * intValue2);
        }
    }

    public CreateBoxesResult createBoxes(int i5) {
        int i10;
        this.cubes = new Box[i5];
        for (int i11 = 0; i11 < i5; i11++) {
            this.cubes[i11] = new Box();
        }
        double[] dArr = new double[i5];
        Box box = this.cubes[0];
        box.f5883r1 = 32;
        box.f5881g1 = 32;
        box.f5879b1 = 32;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            if (i13 >= i5) {
                i10 = i5;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i12], boxArr[i13]).booleanValue()) {
                Box box2 = this.cubes[i12];
                dArr[i12] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i13];
                dArr[i13] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i12] = 0.0d;
                i13--;
            }
            double d10 = dArr[0];
            int i14 = 0;
            for (int i15 = 1; i15 <= i13; i15++) {
                double d11 = dArr[i15];
                if (d11 > d10) {
                    i14 = i15;
                    d10 = d11;
                }
            }
            if (d10 <= 0.0d) {
                i10 = i13 + 1;
                break;
            }
            i13++;
            i12 = i14;
        }
        return new CreateBoxesResult(i5, i10);
    }

    public void createMoments() {
        int i5 = 1;
        while (true) {
            int i10 = INDEX_COUNT;
            if (i5 >= INDEX_COUNT) {
                return;
            }
            int[] iArr = new int[INDEX_COUNT];
            int[] iArr2 = new int[INDEX_COUNT];
            int[] iArr3 = new int[INDEX_COUNT];
            int[] iArr4 = new int[INDEX_COUNT];
            double[] dArr = new double[INDEX_COUNT];
            int i11 = 1;
            while (i11 < i10) {
                int i12 = 0;
                int i13 = 0;
                double d10 = 0.0d;
                int i14 = 1;
                int i15 = 0;
                int i16 = 0;
                while (i14 < i10) {
                    int index = getIndex(i5, i11, i14);
                    i12 += this.weights[index];
                    i15 += this.momentsR[index];
                    i16 += this.momentsG[index];
                    i13 += this.momentsB[index];
                    d10 += this.moments[index];
                    iArr[i14] = iArr[i14] + i12;
                    iArr2[i14] = iArr2[i14] + i15;
                    iArr3[i14] = iArr3[i14] + i16;
                    iArr4[i14] = iArr4[i14] + i13;
                    dArr[i14] = dArr[i14] + d10;
                    int index2 = getIndex(i5 - 1, i11, i14);
                    int i17 = i14;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i17];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i17];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i17];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i17];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i17];
                    i14 = i17 + 1;
                    i10 = INDEX_COUNT;
                }
                i11++;
                i10 = INDEX_COUNT;
            }
            i5++;
        }
    }

    public List<Integer> createResult(int i5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < i5; i10++) {
            Box box = this.cubes[i10];
            int volume = volume(box, this.weights);
            if (volume > 0) {
                int volume2 = volume(box, this.momentsR) / volume;
                int volume3 = volume(box, this.momentsG) / volume;
                int volume4 = volume(box, this.momentsB) / volume;
                arrayList.add(Integer.valueOf((volume4 & KotlinVersion.MAX_COMPONENT_VALUE) | ((volume2 & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (-16777216) | ((volume3 & KotlinVersion.MAX_COMPONENT_VALUE) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int volume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximize = maximize(box, direction, box.f5882r0 + 1, box.f5883r1, volume, volume2, volume3, volume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximize2 = maximize(box, direction2, box.f5880g0 + 1, box.f5881g1, volume, volume2, volume3, volume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximize3 = maximize(box, direction3, box.f5878b0 + 1, box.f5879b1, volume, volume2, volume3, volume4);
        double d10 = maximize.maximum;
        double d11 = maximize2.maximum;
        double d12 = maximize3.maximum;
        if (d10 < d11 || d10 < d12) {
            if (d11 >= d10 && d11 >= d12) {
                direction3 = direction2;
            }
        } else {
            if (maximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f5883r1 = box.f5883r1;
        box2.f5881g1 = box.f5881g1;
        box2.f5879b1 = box.f5879b1;
        int ordinal = direction3.ordinal();
        if (ordinal == 0) {
            int i5 = maximize.cutLocation;
            box.f5883r1 = i5;
            box2.f5882r0 = i5;
            box2.f5880g0 = box.f5880g0;
            box2.f5878b0 = box.f5878b0;
        } else if (ordinal == 1) {
            int i10 = maximize2.cutLocation;
            box.f5881g1 = i10;
            box2.f5882r0 = box.f5882r0;
            box2.f5880g0 = i10;
            box2.f5878b0 = box.f5878b0;
        } else if (ordinal == 2) {
            int i11 = maximize3.cutLocation;
            box.f5879b1 = i11;
            box2.f5882r0 = box.f5882r0;
            box2.f5880g0 = box.f5880g0;
            box2.f5878b0 = i11;
        }
        box.vol = (box.f5879b1 - box.f5878b0) * (box.f5881g1 - box.f5880g0) * (box.f5883r1 - box.f5882r0);
        box2.vol = (box2.f5879b1 - box2.f5878b0) * (box2.f5881g1 - box2.f5880g0) * (box2.f5883r1 - box2.f5882r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i5, int i10, int i11, int i12, int i13, int i14) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int bottom = bottom(box2, direction, quantizerWu.momentsR);
        int bottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int bottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int bottom4 = bottom(box2, direction, quantizerWu.weights);
        int i15 = -1;
        double d10 = 0.0d;
        int i16 = i5;
        while (i16 < i10) {
            int pVar = top(box2, direction, i16, quantizerWu.momentsR) + bottom;
            int pVar2 = top(box2, direction, i16, quantizerWu.momentsG) + bottom2;
            int pVar3 = top(box2, direction, i16, quantizerWu.momentsB) + bottom3;
            int pVar4 = top(box2, direction, i16, quantizerWu.weights) + bottom4;
            if (pVar4 != 0) {
                double d11 = ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar))) / pVar4;
                int i17 = i11 - pVar;
                int i18 = i12 - pVar2;
                int i19 = i13 - pVar3;
                int i20 = i14 - pVar4;
                if (i20 != 0) {
                    int i21 = i19 * i19;
                    double d12 = ((i21 + ((i18 * i18) + (i17 * i17))) / i20) + d11;
                    if (d12 > d10) {
                        i15 = i16;
                        d10 = d12;
                    }
                }
            }
            i16++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i15, d10);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i5) {
        constructHistogram(new QuantizerMap().quantize(iArr, i5).colorToCount);
        createMoments();
        List<Integer> createResult = createResult(createBoxes(i5).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : createResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int i5 = volume3 * volume3;
        return (((((((this.moments[getIndex(box.f5883r1, box.f5881g1, box.f5879b1)] - this.moments[getIndex(box.f5883r1, box.f5881g1, box.f5878b0)]) - this.moments[getIndex(box.f5883r1, box.f5880g0, box.f5879b1)]) + this.moments[getIndex(box.f5883r1, box.f5880g0, box.f5878b0)]) - this.moments[getIndex(box.f5882r0, box.f5881g1, box.f5879b1)]) + this.moments[getIndex(box.f5882r0, box.f5881g1, box.f5878b0)]) + this.moments[getIndex(box.f5882r0, box.f5880g0, box.f5879b1)]) - this.moments[getIndex(box.f5882r0, box.f5880g0, box.f5878b0)]) - ((i5 + ((volume2 * volume2) + (volume * volume))) / volume(box, this.weights));
    }
}
