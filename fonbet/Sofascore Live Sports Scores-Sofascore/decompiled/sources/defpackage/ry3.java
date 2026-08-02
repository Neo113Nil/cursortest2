package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ry3 {
    public static ex8 a(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new cdd(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new dx8(str2, 1);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new bx8(str2);
            }
        }
        return new dx8(str2, 3);
    }

    public static void b(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }
}
