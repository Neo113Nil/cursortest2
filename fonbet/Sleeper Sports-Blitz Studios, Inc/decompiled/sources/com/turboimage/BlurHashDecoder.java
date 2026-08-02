package com.turboimage;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.rnlineargradient.LinearGradientManager;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: BlurHashDecoder.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\f\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ6\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0002JC\u0010\"\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0&2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010'J \u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002J \u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002J4\u0010+\u001a\u00020,*\u00020\u00072\u0006\u0010)\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0002J\u0010\u00101\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0013H\u0002R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000603X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/turboimage/BlurHashDecoder;", "", "<init>", "()V", "cacheCosinesX", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "cacheCosinesY", "clearCache", "", "decode", "Landroid/graphics/Bitmap;", "blurHash", "", "width", "height", "punch", "", "useCache", "", "decode83", "str", "from", "to", "decodeDc", "", "colorEnc", "srgbToLinear", "decodeAc", "value", "maxAc", "signedPow2", "composeBitmap", "numCompX", "numCompY", LinearGradientManager.PROP_COLORS, "", "(IIII[[FZ)Landroid/graphics/Bitmap;", "getArrayForCosinesY", "calculate", "getArrayForCosinesX", "getCos", "", "x", "numComp", "y", RRWebVideoEvent.JsonKeys.SIZE, "linearToSrgb", "charMap", "", "", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlurHashDecoder {
    public static final BlurHashDecoder INSTANCE = new BlurHashDecoder();
    private static final HashMap<Integer, double[]> cacheCosinesX = new HashMap<>();
    private static final HashMap<Integer, double[]> cacheCosinesY = new HashMap<>();
    private static final Map<Character, Integer> charMap;

    private BlurHashDecoder() {
    }

    static {
        List listOf = CollectionsKt.listOf((Object[]) new Character[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'v', 'w', 'x', 'y', 'z', '#', '$', '%', '*', Character.valueOf(SignatureVisitor.EXTENDS), Character.valueOf(AbstractJsonLexerKt.COMMA), '-', '.', Character.valueOf(AbstractJsonLexerKt.COLON), ';', Character.valueOf(SignatureVisitor.INSTANCEOF), '?', '@', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '^', '_', Character.valueOf(AbstractJsonLexerKt.BEGIN_OBJ), '|', Character.valueOf(AbstractJsonLexerKt.END_OBJ), '~'});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10));
        int i = 0;
        for (Object obj : listOf) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Character ch = (Character) obj;
            ch.charValue();
            arrayList.add(TuplesKt.to(ch, Integer.valueOf(i)));
            i = i2;
        }
        charMap = MapsKt.toMap(arrayList);
    }

    public final void clearCache() {
        cacheCosinesX.clear();
        cacheCosinesY.clear();
    }

    public static /* synthetic */ Bitmap decode$default(BlurHashDecoder blurHashDecoder, String str, int i, int i2, float f, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i3 & 16) != 0) {
            z = true;
        }
        return blurHashDecoder.decode(str, i, i2, f2, z);
    }

    public final Bitmap decode(String blurHash, int width, int height, float punch, boolean useCache) {
        float[] decodeAc;
        if (blurHash == null || blurHash.length() < 6) {
            return null;
        }
        int decode83 = decode83(blurHash, 0, 1);
        int i = (decode83 % 9) + 1;
        int i2 = (decode83 / 9) + 1;
        if (blurHash.length() != (i * 2 * i2) + 4) {
            return null;
        }
        float decode832 = (decode83(blurHash, 1, 2) + 1) / 166.0f;
        int i3 = i * i2;
        float[][] fArr = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == 0) {
                BlurHashDecoder blurHashDecoder = INSTANCE;
                decodeAc = blurHashDecoder.decodeDc(blurHashDecoder.decode83(blurHash, 2, 6));
            } else {
                int i5 = i4 * 2;
                BlurHashDecoder blurHashDecoder2 = INSTANCE;
                decodeAc = blurHashDecoder2.decodeAc(blurHashDecoder2.decode83(blurHash, i5 + 4, i5 + 6), decode832 * punch);
            }
            fArr[i4] = decodeAc;
        }
        return composeBitmap(width, height, i, i2, fArr, useCache);
    }

    static /* synthetic */ int decode83$default(BlurHashDecoder blurHashDecoder, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return blurHashDecoder.decode83(str, i, i2);
    }

    private final int decode83(String str, int from, int to) {
        int i = 0;
        while (from < to) {
            Integer num = charMap.get(Character.valueOf(str.charAt(from)));
            int intValue = num != null ? num.intValue() : -1;
            if (intValue != -1) {
                i = (i * 83) + intValue;
            }
            from++;
        }
        return i;
    }

    private final float[] decodeDc(int colorEnc) {
        return new float[]{srgbToLinear(colorEnc >> 16), srgbToLinear((colorEnc >> 8) & 255), srgbToLinear(colorEnc & 255)};
    }

    private final float srgbToLinear(int colorEnc) {
        float f = colorEnc / 255.0f;
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4f);
    }

    private final float[] decodeAc(int value, float maxAc) {
        return new float[]{signedPow2(((value / 361) - 9) / 9.0f) * maxAc, signedPow2((((value / 19) % 19) - 9) / 9.0f) * maxAc, signedPow2(((value % 19) - 9) / 9.0f) * maxAc};
    }

    private final float signedPow2(float value) {
        return Math.copySign((float) Math.pow(value, 2.0f), value);
    }

    private final Bitmap composeBitmap(int width, int height, int numCompX, int numCompY, float[][] colors, boolean useCache) {
        int i = width;
        int i2 = height;
        int i3 = numCompX;
        int i4 = numCompY;
        int[] iArr = new int[i * i2];
        boolean z = (useCache && cacheCosinesX.containsKey(Integer.valueOf(i * i3))) ? false : true;
        double[] arrayForCosinesX = getArrayForCosinesX(z, i, i3);
        boolean z2 = (useCache && cacheCosinesY.containsKey(Integer.valueOf(i2 * i4))) ? false : true;
        double[] arrayForCosinesY = getArrayForCosinesY(z2, i2, i4);
        int i5 = 0;
        while (i5 < i2) {
            int i6 = 0;
            while (i6 < i) {
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                int i7 = 0;
                while (i7 < i4) {
                    float f4 = f3;
                    float f5 = f2;
                    float f6 = f;
                    int i8 = 0;
                    while (i8 < i3) {
                        double cos = getCos(arrayForCosinesX, z, i8, i3, i6, i);
                        int i9 = i2;
                        int i10 = i4;
                        double[] dArr = arrayForCosinesX;
                        double[] dArr2 = arrayForCosinesY;
                        int i11 = i8;
                        int i12 = i7;
                        boolean z3 = z;
                        boolean z4 = z2;
                        int i13 = i6;
                        int i14 = i5;
                        float cos2 = (float) (cos * getCos(dArr2, z4, i12, i10, i14, i9));
                        float[] fArr = colors[(i12 * numCompX) + i11];
                        f6 += fArr[0] * cos2;
                        f4 += fArr[1] * cos2;
                        f5 += fArr[2] * cos2;
                        int i15 = i11 + 1;
                        i2 = i9;
                        i = i;
                        arrayForCosinesY = dArr2;
                        i5 = i14;
                        z = z3;
                        i6 = i13;
                        i3 = numCompX;
                        z2 = z4;
                        i7 = i12;
                        i8 = i15;
                        arrayForCosinesX = dArr;
                        i4 = numCompY;
                    }
                    i2 = i2;
                    i = i;
                    f = f6;
                    z = z;
                    i6 = i6;
                    f2 = f5;
                    f3 = f4;
                    i3 = numCompX;
                    z2 = z2;
                    i7++;
                    arrayForCosinesX = arrayForCosinesX;
                    i4 = numCompY;
                }
                int i16 = i2;
                int i17 = i;
                double[] dArr3 = arrayForCosinesX;
                boolean z5 = z2;
                int i18 = i6;
                iArr[(i17 * i5) + i18] = Color.rgb(linearToSrgb(f), linearToSrgb(f3), linearToSrgb(f2));
                int i19 = i18 + 1;
                i2 = i16;
                i = i17;
                z2 = z5;
                z = z;
                i3 = numCompX;
                i6 = i19;
                arrayForCosinesX = dArr3;
                i4 = numCompY;
            }
            i5++;
            i2 = i2;
            i = i;
            arrayForCosinesX = arrayForCosinesX;
            i3 = numCompX;
            i4 = numCompY;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    private final double[] getArrayForCosinesY(boolean calculate, int height, int numCompY) {
        if (calculate) {
            int i = height * numCompY;
            double[] dArr = new double[i];
            cacheCosinesY.put(Integer.valueOf(i), dArr);
            return dArr;
        }
        double[] dArr2 = cacheCosinesY.get(Integer.valueOf(height * numCompY));
        Intrinsics.checkNotNull(dArr2);
        return dArr2;
    }

    private final double[] getArrayForCosinesX(boolean calculate, int width, int numCompX) {
        if (calculate) {
            int i = width * numCompX;
            double[] dArr = new double[i];
            cacheCosinesX.put(Integer.valueOf(i), dArr);
            return dArr;
        }
        double[] dArr2 = cacheCosinesX.get(Integer.valueOf(width * numCompX));
        Intrinsics.checkNotNull(dArr2);
        return dArr2;
    }

    private final double getCos(double[] dArr, boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            dArr[(i2 * i3) + i] = Math.cos(((i3 * 3.141592653589793d) * i) / i4);
        }
        return dArr[i + (i2 * i3)];
    }

    private final int linearToSrgb(float value) {
        float pow;
        float f;
        float coerceIn = RangesKt.coerceIn(value, 0.0f, 1.0f);
        if (coerceIn <= 0.0031308f) {
            pow = coerceIn * 12.92f;
            f = 255.0f;
        } else {
            pow = (((float) Math.pow(coerceIn, 0.41666666f)) * 1.055f) - 0.055f;
            f = 255;
        }
        return (int) ((pow * f) + 0.5f);
    }
}
