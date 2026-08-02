package h4;

import N3.M;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f64922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64923b;

    /* renamed from: c, reason: collision with root package name */
    public final M.a f64924c;

    /* renamed from: d, reason: collision with root package name */
    public final int f64925d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f64926e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r7.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(boolean z11, String str, int i11, byte[] bArr, int i12, int i13, byte[] bArr2) {
        int i14 = 2;
        char c11 = 0;
        G10.a.c((i11 == 0) ^ (bArr2 == null));
        this.f64922a = z11;
        this.f64923b = str;
        this.f64925d = i11;
        this.f64926e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                case 1:
                    break;
                default:
                    m3.s.f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i14 = 1;
                    break;
            }
            this.f64924c = new M.a(i14, bArr, i12, i13);
        }
        i14 = 1;
        this.f64924c = new M.a(i14, bArr, i12, i13);
    }
}
