package com.mbridge.msdk.playercommon.exoplayer2.drm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class DecryptionException extends Exception {
    public final int errorCode;

    public DecryptionException(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}
