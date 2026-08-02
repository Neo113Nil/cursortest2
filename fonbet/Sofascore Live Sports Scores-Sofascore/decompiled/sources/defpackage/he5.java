package defpackage;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.internal.ads.zzgts;
import com.google.android.gms.internal.ads.zzguk;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class he5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ he5(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static he5 a(String str) {
        char c;
        z1a.s(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String W = rz8.W(split[i6].trim());
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
                case 102749521:
                    if (W.equals("layer")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (W.equals("start")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (W.equals(TtmlNode.TAG_STYLE)) {
                        c = 4;
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
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i = i6;
                    break;
                case 3:
                    i2 = i6;
                    break;
                case 4:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new he5(i, i2, i3, i4, i5, split.length);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static he5 b(String str) {
        zzguk.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new he5(i2, i3, i4, i5, i6, length);
            }
            String a = zzgts.a(split[i].trim());
            switch (a.hashCode()) {
                case 100571:
                    if (!a.equals(TtmlNode.END)) {
                        break;
                    } else {
                        i4 = i;
                        break;
                    }
                case 3556653:
                    if (!a.equals("text")) {
                        break;
                    } else {
                        i6 = i;
                        break;
                    }
                case 102749521:
                    if (!a.equals("layer")) {
                        break;
                    } else {
                        i2 = i;
                        break;
                    }
                case 109757538:
                    if (!a.equals("start")) {
                        break;
                    } else {
                        i3 = i;
                        break;
                    }
                case 109780401:
                    if (!a.equals(TtmlNode.TAG_STYLE)) {
                        break;
                    } else {
                        i5 = i;
                        break;
                    }
            }
            i++;
        }
    }
}
