package defpackage;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.internal.ads.zzbjr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nnn extends zzbjr {
    public final /* synthetic */ int d;

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final String a(String str, String str2) {
        switch (this.d) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String b = b(str);
                String b2 = b(str2);
                if (TextUtils.isEmpty(b)) {
                    return b2;
                }
                if (TextUtils.isEmpty(b2)) {
                    return b;
                }
                return wt3.m(b, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(b2).length()), b2);
        }
    }
}
