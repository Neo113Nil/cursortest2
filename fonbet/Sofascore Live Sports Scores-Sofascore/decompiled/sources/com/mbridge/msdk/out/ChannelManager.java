package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ChannelManager {
    public static void setChannel(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Aa aa = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod("b", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
