package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p8n extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p8n(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder o = ljg.o("Pos: ", j, ", limit: ");
        o.append(j2);
        o.append(", len: ");
        o.append(i);
    }

    public p8n() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
