package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.Locale;
import xsna.fp;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzxo extends IOException {
    public zzxo() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzxo(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder b = fp.b(j, "Pos: ", ", limit: ");
        b.append(j2);
        b.append(", len: ");
        b.append(i);
    }

    public zzxo(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
