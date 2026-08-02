package defpackage;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k12 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static k12 b(String str) {
        char c;
        qx9.r(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String W = rz8.W(split[i5].trim());
            W.getClass();
            switch (W.hashCode()) {
                case 100571:
                    if (W.equals(TtmlNode.END)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (W.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (W.equals("start")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (W.equals(TtmlNode.TAG_STYLE)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = i5;
                    break;
                case 1:
                    i3 = i5;
                    break;
                case 2:
                    i = i5;
                    break;
                case 3:
                    i4 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i3 == -1) {
            return null;
        }
        int length = split.length;
        k12 k12Var = new k12();
        k12Var.a = i;
        k12Var.b = i2;
        k12Var.c = i4;
        k12Var.d = i3;
        k12Var.e = length;
        return k12Var;
    }

    public boolean a() {
        int i = this.a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.d;
            int i4 = this.b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.d;
            int i6 = this.c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.e;
            int i8 = this.b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.e;
            int i10 = this.c;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if (((i2 << 12) & i) == 0) {
                return false;
            }
        }
        return true;
    }
}
