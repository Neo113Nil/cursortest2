package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface TransferListener<S> {
    void onBytesTransferred(S s, int i);

    void onTransferEnd(S s);

    void onTransferStart(S s, DataSpec dataSpec);
}
