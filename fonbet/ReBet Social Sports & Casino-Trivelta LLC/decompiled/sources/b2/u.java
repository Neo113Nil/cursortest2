package b2;

import H1.O;
import e1.AbstractC4134a;
import e1.AbstractC4156x;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24957a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24958b;

    /* renamed from: c, reason: collision with root package name */
    public final O.a f24959c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24960d;
    public final byte[] defaultInitializationVector;

    public u(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        AbstractC4134a.a((bArr2 == null) ^ (i10 == 0));
        this.f24957a = z10;
        this.f24958b = str;
        this.f24960d = i10;
        this.defaultInitializationVector = bArr2;
        this.f24959c = new O.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                AbstractC4156x.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
