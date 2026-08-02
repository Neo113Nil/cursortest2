package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒣ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0655 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final /* synthetic */ int f2248 = 0;

    static {
        StringFog.decrypt("gleNLWtTwtSvXI0tdGX92qBZiSl1UtzavUuvKGZhxN68\n", "zjjuTAcRsLs=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m395(Context context) {
        Class<?> cls;
        try {
            String decrypt = StringFog.decrypt("Z46k3SD1F8gojK/MLvARwmmBpMwu7wfdZ46hyCruXdNpjrTKIehd/GmDocMN7hzRYoOh3DvREt5n\nh6Xd\n", "BuDAr0+cc7A=\n");
            String str = AbstractC0816.f2624;
            try {
                cls = Class.forName(decrypt);
            } catch (Throwable unused) {
                cls = null;
            }
            return AbstractC0816.m505(cls, StringFog.decrypt("BKu9FWLL17kNraw=\n", "Y87JXAy4o9g=\n"), Arrays.asList(context)).invoke(null, context);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            return null;
        }
    }
}
