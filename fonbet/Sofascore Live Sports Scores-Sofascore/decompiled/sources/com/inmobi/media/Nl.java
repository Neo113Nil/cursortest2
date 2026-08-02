package com.inmobi.media;

import android.webkit.URLUtil;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Nl {
    public static final boolean a(String str) {
        if (str == null || StringsKt.K(StringsKt.l0(str).toString(), ' ')) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public static final String b(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.d(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        return obj == null ? "" : obj;
    }
}
