package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class zbti extends IOException {
    zbti() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zbti(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    zbti(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
