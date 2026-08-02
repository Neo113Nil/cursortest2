package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.a5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4220a5 {
    public static final C4220a5 a = new C4220a5();

    private C4220a5() {
    }

    public final boolean a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
