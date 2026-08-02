package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o3c implements n3c {
    public final int a;
    public MediaCodecInfo[] b;

    public o3c(boolean z, boolean z2, boolean z3, int i) {
        switch (i) {
            case 2:
                int i2 = 1;
                if (!z && !z2 && !z3) {
                    i2 = 0;
                }
                this.a = i2;
                break;
            default:
                this.a = (z || z2 || z3) ? 1 : 0;
                break;
        }
    }

    @Override // defpackage.n3c
    public int getCodecCount() {
        MediaCodecInfo[] mediaCodecInfoArr = this.b;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.a).getCodecInfos();
            this.b = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    @Override // defpackage.n3c
    public MediaCodecInfo getCodecInfoAt(int i) {
        MediaCodecInfo[] mediaCodecInfoArr = this.b;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.a).getCodecInfos();
            this.b = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i];
    }

    @Override // defpackage.n3c
    public boolean h(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.n3c
    public boolean j(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.n3c
    public boolean secureDecodersExplicit() {
        return true;
    }

    public o3c(boolean z, boolean z2) {
        this.a = (z || z2) ? 1 : 0;
    }
}
