package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.vxd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n {
    public static final String[] h = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    public static final int[] i = {44100, 48000, 32000};
    public static final int[] j = {32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 288, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 352, 384, TTAdConstant.PACKAGE_NAME_CODE, 448};
    public static final int[] k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY};
    public static final int[] l = {32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384};
    public static final int[] m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE};
    public static final int[] n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static boolean a(int i2, n nVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int c;
        int i8;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = i[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            i7 = i3 == 3 ? j[i5 - 1] : k[i5 - 1];
            c = (((i7 * 12000) / i9) + i10) * 4;
            i8 = 384;
        } else {
            if (i3 == 3) {
                i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
                c = vxd.c(i7, 144000, i9, i10);
            } else {
                i7 = n[i5 - 1];
                r9 = i4 == 1 ? 576 : 1152;
                c = vxd.c(i4 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000, i7, i9, i10);
            }
            i8 = r9;
        }
        String str = h[3 - i4];
        int i11 = ((i2 >> 6) & 3) == 3 ? 1 : 2;
        nVar.a = i3;
        nVar.b = str;
        nVar.c = c;
        nVar.d = i9;
        nVar.e = i11;
        nVar.f = i7 * 1000;
        nVar.g = i8;
        return true;
    }

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? j[i5 - 1] : k[i5 - 1]) * 12000) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
        } else {
            i7 = n[i5 - 1];
        }
        if (i3 == 3) {
            return vxd.c(i7, 144000, i8, i9);
        }
        return vxd.c(i4 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000, i7, i8, i9);
    }
}
