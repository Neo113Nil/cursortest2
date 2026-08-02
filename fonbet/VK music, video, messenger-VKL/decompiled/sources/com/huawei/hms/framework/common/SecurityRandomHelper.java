package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import xsna.c2f0;
import xsna.kjp;

/* loaded from: classes13.dex */
public class SecurityRandomHelper {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                try {
                    if (instance == null) {
                        c2f0.a("EncryptUtil");
                        instance = new SecurityRandomHelper();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i) {
        return kjp.b(i);
    }

    public String generateSecureRandomStr(int i) {
        return kjp.c(i);
    }
}
