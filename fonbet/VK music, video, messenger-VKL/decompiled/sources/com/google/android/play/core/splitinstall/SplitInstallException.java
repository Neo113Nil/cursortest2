package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import xsna.fw3;
import xsna.jtz0;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public class SplitInstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitInstallException(int i) {
        super(new Status(i, String.format("Split Install Error(%d): %s", r1, r2)));
        String str;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = jtz0.a;
        Integer valueOf2 = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf2)) {
            HashMap hashMap2 = jtz0.b;
            if (hashMap2.containsKey(valueOf2)) {
                str = fw3.c((String) hashMap.get(valueOf2), " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#", (String) hashMap2.get(valueOf2), ")");
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
