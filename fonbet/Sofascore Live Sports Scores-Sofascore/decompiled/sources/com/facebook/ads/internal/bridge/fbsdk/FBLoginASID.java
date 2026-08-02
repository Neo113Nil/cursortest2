package com.facebook.ads.internal.bridge.fbsdk;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes2.dex */
public class FBLoginASID {
    @Nullable
    public static String getFBLoginASID() {
        try {
            Date date = AccessToken.l;
            Object invoke = AccessToken.class.getDeclaredMethod("getCurrentAccessToken", null).invoke(null, null);
            if (invoke != null) {
                return (String) AccessToken.class.getDeclaredMethod("getUserId", null).invoke(invoke, null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
