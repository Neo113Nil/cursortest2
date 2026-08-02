package com.vk.media.recorder.impl;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Log;
import com.vk.media.recorder.impl.Streamer;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import xsna.cyi;

/* compiled from: VideoEncoderBuilder.java */
/* loaded from: classes3.dex */
public final class g {
    public cyi a;

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a() {
        Streamer.c cVar;
        MediaCodec mediaCodec;
        cyi cyiVar = this.a;
        b bVar = null;
        if (cyiVar == null || (cVar = cyiVar.c) == null) {
            Log.e(com.vungle.ads.internal.task.g.e, "Build failed: video config is null");
            return null;
        }
        try {
            mediaCodec = MediaCodec.createEncoderByType("video/avc");
            try {
                if (mediaCodec == null) {
                    Log.e("b", "VideoEncoder18: failed to create video/avc encoder");
                } else {
                    MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                    if (codecInfo == null) {
                        Log.e("b", "VideoEncoder18: failed to get codec info");
                        mediaCodec.release();
                    } else {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType("video/avc");
                        if (capabilitiesForType == null) {
                            Log.e("b", "VideoEncoder18: failed to get codec capabilities");
                            mediaCodec.release();
                        } else {
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", cVar.a, cVar.b);
                            if (createVideoFormat == null) {
                                Log.e("b", "VideoEncoder18: failed to create video format");
                                mediaCodec.release();
                            } else {
                                b bVar2 = new b();
                                bVar2.a = mediaCodec;
                                bVar2.b = createVideoFormat;
                                bVar2.c = capabilitiesForType;
                                bVar = bVar2;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e = e;
                Log.e("b", Log.getStackTraceString(e));
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                if (bVar != null) {
                }
                return bVar;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        if (bVar != null) {
            this.a.getClass();
            bVar.b.setFloat("frame-rate", 30.0f);
            bVar.b.setFloat("capture-rate", 30.0f);
            bVar.b.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, this.a.a);
            bVar.b.setInteger("i-frame-interval", this.a.b);
            this.a.getClass();
        }
        return bVar;
    }
}
