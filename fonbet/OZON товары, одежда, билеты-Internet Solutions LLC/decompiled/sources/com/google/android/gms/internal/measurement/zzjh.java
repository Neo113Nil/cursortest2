package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class zzjh extends IOException {
    zzjh() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzjh(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    zzjh(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
