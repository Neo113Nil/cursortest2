package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2324a5 {
    public static final C2324a5 a = new C2324a5();

    private C2324a5() {
    }

    public final boolean a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
