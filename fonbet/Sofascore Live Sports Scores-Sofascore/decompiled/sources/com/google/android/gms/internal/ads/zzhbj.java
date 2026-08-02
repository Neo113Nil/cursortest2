package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.rko;
import defpackage.sko;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhbj {
    public static int a(long j) {
        int i = (int) j;
        zzguk.d(j, ((long) i) == j, "Out of range: %s");
        return i;
    }

    public static int b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int c(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static int[] d(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof rko) {
            rko rkoVar = (rko) abstractCollection;
            return Arrays.copyOfRange(rkoVar.a, rkoVar.b, rkoVar.c);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List e(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new rko(0, length, iArr);
    }

    public static Integer f(String str) {
        byte b;
        Long valueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i = charAt == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    b = sko.a[charAt2];
                } else {
                    byte[] bArr = sko.a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt3 = str.charAt(i2);
                            if (charAt3 < 128) {
                                b2 = sko.a[charAt3];
                            } else {
                                byte[] bArr2 = sko.a;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i2 = i3;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }
}
