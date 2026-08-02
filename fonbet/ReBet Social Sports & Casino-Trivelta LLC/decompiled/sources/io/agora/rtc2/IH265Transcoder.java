package io.agora.rtc2;

/* loaded from: classes3.dex */
public interface IH265Transcoder {
    int enableTranscode(String str, String str2, int i10);

    int queryChannel(String str, String str2, int i10);

    int registerTranscoderObserver(IH265TranscoderObserver iH265TranscoderObserver);

    int triggerTranscode(String str, String str2, int i10);

    int unregisterTranscoderObserver(IH265TranscoderObserver iH265TranscoderObserver);
}
