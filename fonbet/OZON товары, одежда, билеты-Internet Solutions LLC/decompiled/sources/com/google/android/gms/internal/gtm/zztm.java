package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class zztm extends IOException {
    zztm() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zztm(String str, Throwable th2) {
        super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th2);
        String valueOf = String.valueOf(str);
    }

    zztm(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
