package defpackage;

import android.media.MediaCodecInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface n3c {
    int getCodecCount();

    MediaCodecInfo getCodecInfoAt(int i);

    boolean h(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean j(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean secureDecodersExplicit();
}
