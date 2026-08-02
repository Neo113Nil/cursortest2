package defpackage;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p95 {
    public ArrayList a;
    public float[] b;

    public p95(int i) {
        switch (i) {
            case 1:
                this.b = new float[64];
                break;
            default:
                this.a = new ArrayList();
                float[] fArr = new float[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    fArr[i2] = Float.NaN;
                }
                this.b = fArr;
                break;
        }
    }

    public void a(Object obj, float f) {
        ArrayList arrayList = this.a;
        arrayList.add(obj);
        if (this.b.length < arrayList.size()) {
            this.b = Arrays.copyOf(this.b, arrayList.size() + 2);
        }
        this.b[arrayList.size() - 1] = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(String str, ArrayList arrayList) {
        int i;
        char charAt;
        char c;
        float intBitsToFloat;
        int length = str.length();
        char c2 = 0;
        int i2 = 0;
        while (i2 < length && Intrinsics.d(str.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && Intrinsics.d(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                charAt = str.charAt(i2);
                int i4 = charAt | ' ';
                if ((i4 - 122) * (i4 - 97) > 0 || i4 == 101) {
                    if (i >= length) {
                        charAt = c2;
                    } else {
                        i2 = i;
                    }
                }
            }
            if (charAt != 0) {
                int i5 = charAt | ' ';
                if (i5 != 122) {
                    while (i < length && Intrinsics.d(str.charAt(i), 32) <= 0) {
                        i++;
                    }
                    char c3 = i5 == 97 ? (char) 1 : c2;
                    int i6 = c2;
                    do {
                        long L = (c3 == 0 || 3 > i6 || i6 >= 5) ? pco.L(i, length, str) : pco.L(i, Math.min(i + 1, length), str);
                        i = (int) (L >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int) (L & 4294967295L));
                        if (!Float.isNaN(intBitsToFloat)) {
                            float[] fArr = this.b;
                            int i7 = i6 + 1;
                            fArr[i6] = intBitsToFloat;
                            if (i7 >= fArr.length) {
                                float[] fArr2 = new float[i7 * 2];
                                this.b = fArr2;
                                System.arraycopy(fArr, c2, fArr2, c2, fArr.length);
                            }
                            i6 = i7;
                        }
                        while (i < length && (Intrinsics.d(str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                            i++;
                        }
                        if (i < length) {
                        }
                        i3 = i6;
                    } while (!Float.isNaN(intBitsToFloat));
                    i3 = i6;
                }
                float[] fArr3 = this.b;
                int i8 = 2;
                switch (charAt) {
                    case 'A':
                        c = c2;
                        int i9 = i3 - 7;
                        for (int i10 = c; i10 <= i9; i10 += 7) {
                            arrayList.add(new dbe(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], Float.compare(fArr3[i10 + 3], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 ? 1 : c, Float.compare(fArr3[i10 + 4], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 ? 1 : c, fArr3[i10 + 5], fArr3[i10 + 6]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'C':
                        c = c2;
                        int i11 = i3 - 6;
                        for (int i12 = c; i12 <= i11; i12 += 6) {
                            arrayList.add(new fbe(fArr3[i12], fArr3[i12 + 1], fArr3[i12 + 2], fArr3[i12 + 3], fArr3[i12 + 4], fArr3[i12 + 5]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'H':
                        c = c2;
                        int i13 = i3 - 1;
                        for (int i14 = c; i14 <= i13; i14++) {
                            arrayList.add(new gbe(fArr3[i14]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                        c = c2;
                        int i15 = i3 - 2;
                        for (int i16 = c; i16 <= i15; i16 += 2) {
                            arrayList.add(new hbe(fArr3[i16], fArr3[i16 + 1]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        c = c2;
                        int i17 = i3 - 2;
                        if (i17 >= 0) {
                            arrayList.add(new ibe(fArr3[c], fArr3[1]));
                            while (i8 <= i17) {
                                arrayList.add(new hbe(fArr3[i8], fArr3[i8 + 1]));
                                i8 += 2;
                            }
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'Q':
                        c = c2;
                        int i18 = i3 - 4;
                        for (int i19 = c; i19 <= i18; i19 += 4) {
                            arrayList.add(new jbe(fArr3[i19], fArr3[i19 + 1], fArr3[i19 + 2], fArr3[i19 + 3]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'S':
                        c = c2;
                        int i20 = i3 - 4;
                        for (int i21 = c; i21 <= i20; i21 += 4) {
                            arrayList.add(new kbe(fArr3[i21], fArr3[i21 + 1], fArr3[i21 + 2], fArr3[i21 + 3]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'T':
                        c = c2;
                        int i22 = i3 - 2;
                        for (int i23 = c; i23 <= i22; i23 += 2) {
                            arrayList.add(new lbe(fArr3[i23], fArr3[i23 + 1]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'V':
                        c = c2;
                        int i24 = i3 - 1;
                        for (int i25 = c; i25 <= i24; i25++) {
                            arrayList.add(new vbe(fArr3[i25]));
                        }
                        i2 = i;
                        c2 = c;
                        break;
                    case 'Z':
                    case INVALID_ADS_ENDPOINT_VALUE:
                        c = c2;
                        arrayList.add(ebe.c);
                        i2 = i;
                        c2 = c;
                        break;
                    case 'a':
                        int i26 = i3 - 7;
                        int i27 = c2;
                        while (i27 <= i26) {
                            char c4 = c2;
                            arrayList.add(new mbe(fArr3[i27], fArr3[i27 + 1], fArr3[i27 + 2], Float.compare(fArr3[i27 + 3], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 ? 1 : c4, Float.compare(fArr3[i27 + 4], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 ? 1 : c4, fArr3[i27 + 5], fArr3[i27 + 6]));
                            i27 += 7;
                            c2 = c4;
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'c':
                        int i28 = i3 - 6;
                        for (int i29 = c2; i29 <= i28; i29 += 6) {
                            arrayList.add(new nbe(fArr3[i29], fArr3[i29 + 1], fArr3[i29 + 2], fArr3[i29 + 3], fArr3[i29 + 4], fArr3[i29 + 5]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'h':
                        int i30 = i3 - 1;
                        for (int i31 = c2; i31 <= i30; i31++) {
                            arrayList.add(new obe(fArr3[i31]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'l':
                        int i32 = i3 - 2;
                        for (int i33 = c2; i33 <= i32; i33 += 2) {
                            arrayList.add(new pbe(fArr3[i33], fArr3[i33 + 1]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'm':
                        int i34 = i3 - 2;
                        if (i34 >= 0) {
                            arrayList.add(new qbe(fArr3[c2], fArr3[1]));
                            while (i8 <= i34) {
                                arrayList.add(new pbe(fArr3[i8], fArr3[i8 + 1]));
                                i8 += 2;
                            }
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case 'q':
                        int i35 = i3 - 4;
                        for (int i36 = c2; i36 <= i35; i36 += 4) {
                            arrayList.add(new rbe(fArr3[i36], fArr3[i36 + 1], fArr3[i36 + 2], fArr3[i36 + 3]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case INVALID_INDEX_URL_VALUE:
                        int i37 = i3 - 4;
                        for (int i38 = c2; i38 <= i37; i38 += 4) {
                            arrayList.add(new sbe(fArr3[i38], fArr3[i38 + 1], fArr3[i38 + 2], fArr3[i38 + 3]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case GZIP_ENCODE_ERROR_VALUE:
                        int i39 = i3 - 2;
                        for (int i40 = c2; i40 <= i39; i40 += 2) {
                            arrayList.add(new tbe(fArr3[i40], fArr3[i40 + 1]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        int i41 = i3 - 1;
                        for (int i42 = c2; i42 <= i41; i42++) {
                            arrayList.add(new ube(fArr3[i42]));
                        }
                        c = c2;
                        i2 = i;
                        c2 = c;
                        break;
                    default:
                        zzl.g(charAt, "Unknown command for: ");
                        break;
                }
                return;
            }
            i2 = i;
        }
    }
}
