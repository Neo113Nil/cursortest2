package com.google.android.gms.internal.consent_sdk;

import defpackage.f79;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzg extends Exception {
    public zzg(int i, String str) {
        super(str);
    }

    public final f79 d() {
        if (getCause() == null) {
            super.getMessage();
        } else {
            super.getMessage();
            getCause();
        }
        return new f79(super.getMessage(), 4, false);
    }

    public zzg(int i, IOException iOException, String str) {
        super(str, iOException);
    }
}
