package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import xsna.dtz0;
import xsna.fw3;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InstallException(int i) {
        super(new Status(i, String.format(r1, "Install Error(%d): %s", r2, r3)));
        String str;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = dtz0.a;
        Integer valueOf2 = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf2)) {
            HashMap hashMap2 = dtz0.b;
            if (hashMap2.containsKey(valueOf2)) {
                str = fw3.c((String) hashMap.get(valueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) hashMap2.get(valueOf2), ")");
                if (i != 0) {
                    throw new IllegalArgumentException("errorCode should not be 0.");
                }
                return;
            }
        }
        str = "";
        if (i != 0) {
        }
    }
}
