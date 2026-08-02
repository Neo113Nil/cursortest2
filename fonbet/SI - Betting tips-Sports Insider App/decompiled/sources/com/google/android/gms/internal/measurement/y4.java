package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class y4 extends IOException {
    public /* synthetic */ y4(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y4(long j, long j6, int i5, IndexOutOfBoundsException indexOutOfBoundsException, int i10) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r2.toString()), indexOutOfBoundsException);
        switch (i10) {
            case 1:
                Locale locale = Locale.US;
                StringBuilder p10 = r4.k.p(j, "Pos: ", ", limit: ");
                p10.append(j6);
                p10.append(", len: ");
                p10.append(i5);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(p10.toString()), indexOutOfBoundsException);
                break;
            default:
                Locale locale2 = Locale.US;
                StringBuilder p11 = r4.k.p(j, "Pos: ", ", limit: ");
                p11.append(j6);
                p11.append(", len: ");
                p11.append(i5);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y4(File file, File file2, String str) {
        super(r3);
        Intrinsics.checkNotNullParameter(file, "file");
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": ".concat(str));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
    }
}
