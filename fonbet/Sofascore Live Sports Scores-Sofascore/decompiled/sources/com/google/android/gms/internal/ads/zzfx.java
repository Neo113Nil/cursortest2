package com.google.android.gms.internal.ads;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.fc6;
import defpackage.lnb;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfx implements zzao {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r8 != 78) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6.length != 8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        com.google.android.gms.internal.ads.zzguk.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5.equals("auxiliary.tracks.length") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5.equals("auxiliary.tracks.offset") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzfx(String str, byte[] bArr, int i, int i2) {
        byte b;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    if (i2 == 23) {
                        if (bArr.length == 4) {
                            i2 = 23;
                            zzguk.a(r1);
                            break;
                        } else {
                            i2 = 23;
                        }
                    }
                    r1 = false;
                    zzguk.a(r1);
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    if (i2 == 75) {
                        if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                            i2 = 75;
                            zzguk.a(r1);
                            break;
                        } else {
                            i2 = 75;
                        }
                    }
                    r1 = false;
                    zzguk.a(r1);
                }
                break;
            case 1011693540:
                break;
            case 1098277265:
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    zzguk.a(i2 == 0);
                    break;
                }
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList b() {
        zzguk.g("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i = lnb.f(bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, arrayList, i, 1)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzfx.class != obj.getClass()) {
            return false;
        }
        zzfx zzfxVar = (zzfx) obj;
        return this.a.equals(zzfxVar.a) && Arrays.equals(this.b, zzfxVar.b) && this.c == zzfxVar.c && this.d == zzfxVar.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String sb;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList b = b();
                StringBuilder q = fc6.q("track types = ");
                zzgue.a(q, b.iterator(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                sb = q.toString();
            }
            String str2 = zzfm.a;
            sb = zzhah.c.j().f(bArr.length, bArr);
        } else if (i == 1) {
            String str3 = zzfm.a;
            sb = new String(bArr, StandardCharsets.UTF_8);
        } else if (i == 23) {
            int length = bArr.length;
            if (!(length >= 4)) {
                a70.p(zzgvb.a("array too small: %s < %s", Integer.valueOf(length), 4));
                return null;
            }
            sb = String.valueOf(Float.intBitsToFloat(zzhbj.c(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i == 67) {
            int length2 = bArr.length;
            if (!(length2 >= 4)) {
                a70.p(zzgvb.a("array too small: %s < %s", Integer.valueOf(length2), 4));
                return null;
            }
            sb = String.valueOf(zzhbj.c(bArr[0], bArr[1], bArr[2], bArr[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new zzeu(bArr).j());
            }
            String str22 = zzfm.a;
            sb = zzhah.c.j().f(bArr.length, bArr);
        } else {
            sb = String.valueOf(Byte.toUnsignedInt(bArr[0]));
        }
        return fc6.o(new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(sb).length()), "mdta: key=", str, ", value=", sb);
    }
}
