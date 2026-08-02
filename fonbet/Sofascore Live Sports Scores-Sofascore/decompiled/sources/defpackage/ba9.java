package defpackage;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ba9 {
    public static final String[] a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    public static final int[][] c;
    public static final int[][] d;

    static {
        int[] iArr = {5, NotificationCompat.FLAG_LOCAL_ONLY};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        c = iArr2;
        iArr2[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            c[0][i] = i - 63;
        }
        c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            c[1][i2] = i2 - 95;
        }
        c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            c[2][i3] = i3 - 46;
        }
        int[] iArr3 = c[2];
        iArr3[44] = 12;
        iArr3[46] = 13;
        int[] iArr4 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE};
        for (int i4 = 0; i4 < 28; i4++) {
            c[3][iArr4[i4]] = i4;
        }
        int[] iArr5 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr5[i5];
            if (i6 > 0) {
                c[4][i6] = i5;
            }
        }
        int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        d = iArr6;
        for (int[] iArr7 : iArr6) {
            Arrays.fill(iArr7, -1);
        }
        int[][] iArr8 = d;
        iArr8[0][4] = 0;
        int[] iArr9 = iArr8[1];
        iArr9[4] = 0;
        iArr9[0] = 28;
        iArr8[3][4] = 0;
        int[] iArr10 = iArr8[2];
        iArr10[4] = 0;
        iArr10[0] = 15;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bdi bdiVar = (bdi) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.add(bdiVar);
                    break;
                }
                bdi bdiVar2 = (bdi) it2.next();
                if (bdiVar2.c(bdiVar)) {
                    break;
                }
                if (bdiVar.c(bdiVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }
}
