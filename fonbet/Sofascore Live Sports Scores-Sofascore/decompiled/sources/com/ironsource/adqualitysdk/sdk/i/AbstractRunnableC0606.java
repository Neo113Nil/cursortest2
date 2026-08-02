package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭵ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractRunnableC0606 implements Runnable {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1975 = StringFog.decrypt("liQQ4Yo9HnOsCCLigD0=\n", "wmZDgOxYTAY=\n");

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo58();
        } catch (Throwable th) {
            try {
                mo137(th);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﾒ */
    public abstract void mo58();

    /* renamed from: ﾒ */
    public void mo137(Throwable th) {
        String str = f1975;
        String str2 = StringFog.decrypt("gpXfHai6fI7nhMETqek1\n", "x+etctqaFeA=\n") + getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("QAdKTgDx\n", "A2srPXPZ8Eg=\n"));
        sb.append(getClass().getName());
        try {
            AbstractC0356.m203(str, str2, AbstractC1133.m662("5Q==\n", "zNVRUXRnK5k=\n", sb), th, null, null, false, false, false);
        } catch (Throwable unused) {
        }
        AbstractC0420.m243(str, StringFog.decrypt("0Eg025GHJYa1WSrVkNRs\n", "lTpGtOOnTOg=\n") + getClass().getName());
        AbstractC0420.m252(str, str, StringFog.decrypt("Y8X1QUDbsO4=\n", "J6CBICm3w9Q=\n"), th, null, false);
    }
}
