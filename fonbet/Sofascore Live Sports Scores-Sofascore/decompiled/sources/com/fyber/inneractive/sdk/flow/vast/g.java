package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.t;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g implements Comparator {
    public final int a;
    public final int b;
    public final int c;

    public g(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = 2;
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        if (!TextUtils.equals("VPAID", rVar2.f)) {
            if (!TextUtils.equals("VPAID", rVar.f)) {
                Integer num2 = rVar.e;
                int intValue = num2 == null ? 0 : num2.intValue();
                Integer num3 = rVar2.e;
                int intValue2 = num3 == null ? 0 : num3.intValue();
                int i = this.a;
                if (intValue2 <= i || intValue > i) {
                    if (intValue <= i || intValue2 > i) {
                        t a = t.a(rVar2.d);
                        t tVar = t.MEDIA_TYPE_MP4;
                        Integer num4 = a == tVar ? 3 : a == t.MEDIA_TYPE_3GPP ? num : a == t.MEDIA_TYPE_WEBM ? 1 : -1;
                        t a2 = t.a(rVar.d);
                        if (a2 == tVar) {
                            num = 3;
                        } else if (a2 != t.MEDIA_TYPE_3GPP) {
                            num = a2 == t.MEDIA_TYPE_WEBM ? 1 : -1;
                        }
                        int compareTo = num4.compareTo(num);
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        if (intValue >= intValue2) {
                            if (intValue <= intValue2) {
                                Integer num5 = rVar.b;
                                int intValue3 = num5 == null ? 0 : num5.intValue();
                                Integer num6 = rVar.c;
                                int intValue4 = num6 == null ? 0 : num6.intValue();
                                Integer num7 = rVar2.b;
                                int intValue5 = num7 == null ? 0 : num7.intValue();
                                Integer num8 = rVar2.c;
                                int intValue6 = num8 == null ? 0 : num8.intValue();
                                int i2 = intValue3 * intValue4;
                                int i3 = this.b * this.c;
                                int abs = Math.abs(i2 - i3);
                                int abs2 = Math.abs((intValue5 * intValue6) - i3);
                                if (abs >= abs2) {
                                    if (abs <= abs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
