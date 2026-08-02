package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.o1j;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzias {
    public static final Charset a = Charset.forName(C.UTF8_NAME);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e5, code lost:
    
        if (r8 == 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e7, code lost:
    
        if (r8 == 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        if (r8 == 3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00eb, code lost:
    
        if (r8 == 4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0105, code lost:
    
        if (r10 != r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0107, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0108, code lost:
    
        r0 = new byte[r10];
        java.lang.System.arraycopy(r4, 0, r0, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ee, code lost:
    
        r0 = r10 + 1;
        r4[r10] = (byte) (r9 >> 10);
        r10 = r10 + 2;
        r4[r0] = (byte) (r9 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fd, code lost:
    
        r4[r10] = (byte) (r9 >> 4);
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(a);
        int length = bytes.length;
        int i = (length * 3) / 4;
        byte[] bArr = new byte[i];
        int[] iArr = o1j.i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (i3 == 0) {
                while (true) {
                    int i6 = i2 + 4;
                    if (i6 > length) {
                        break;
                    }
                    i4 = (iArr[bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 18) | (iArr[bytes[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 12) | (iArr[bytes[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 6) | iArr[bytes[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                    if (i4 < 0) {
                        break;
                    }
                    bArr[i5 + 2] = (byte) i4;
                    bArr[i5 + 1] = (byte) (i4 >> 8);
                    bArr[i5] = (byte) (i4 >> 16);
                    i5 += 3;
                    i2 = i6;
                }
                if (i2 >= length) {
                    i3 = 0;
                    break;
                }
                i3 = 0;
            }
            int i7 = i2 + 1;
            int i8 = iArr[bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            if (i3 == 0) {
                if (i8 < 0) {
                    if (i8 != -1) {
                        break;
                    }
                } else {
                    i3++;
                    i4 = i8;
                }
            } else {
                if (i3 == 1) {
                    if (i8 < 0) {
                        if (i8 != -1) {
                            break;
                        }
                    }
                    i3++;
                    i8 |= i4 << 6;
                } else if (i3 == 2) {
                    if (i8 < 0) {
                        if (i8 != -2) {
                            if (i8 != -1) {
                                break;
                            }
                        } else {
                            bArr[i5] = (byte) (i4 >> 4);
                            i3 = 4;
                            i5++;
                        }
                    }
                    i3++;
                    i8 |= i4 << 6;
                } else if (i3 == 3) {
                    if (i8 < 0) {
                        if (i8 != -2) {
                            if (i8 != -1) {
                                break;
                            }
                        } else {
                            bArr[i5 + 1] = (byte) (i4 >> 2);
                            bArr[i5] = (byte) (i4 >> 10);
                            i5 += 2;
                            i3 = 5;
                        }
                    } else {
                        int i9 = i8 | (i4 << 6);
                        bArr[i5 + 2] = (byte) i9;
                        bArr[i5 + 1] = (byte) (i9 >> 8);
                        bArr[i5] = (byte) (i9 >> 16);
                        i5 += 3;
                        i4 = i9;
                        i3 = 0;
                    }
                } else if (i3 == 4) {
                    if (i8 != -2) {
                        if (i8 != -1) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                } else if (i3 == 5 && i8 != -1) {
                    break;
                }
                i4 = i8;
            }
            i2 = i7;
        }
        a70.p("bad base-64");
        return null;
    }
}
