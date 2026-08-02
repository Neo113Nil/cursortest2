package com.vk.media.recorder;

import android.media.MediaRecorder;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import xsna.jhu0;

/* compiled from: RecorderCamcorderCompat.java */
/* loaded from: classes3.dex */
public final class c extends RecorderBase {
    public MediaRecorder D = null;
    public jhu0 E;

    public c() {
        this.A = RecorderBase.RecordingType.ORIGINAL;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void A() {
        MediaRecorder mediaRecorder = this.D;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void m() {
        if (this.D != null) {
            A();
            try {
                this.D.release();
            } catch (Exception unused) {
            }
        }
        this.D = null;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean z() {
        try {
            MediaRecorder mediaRecorder = new MediaRecorder();
            this.D = mediaRecorder;
            mediaRecorder.setCamera(this.E.r());
            this.D.setAudioSource(5);
            this.D.setVideoSource(1);
            MediaUtils.e eVar = this.c.e;
            this.D.setVideoFrameRate(eVar.d);
            this.D.setVideoSize(eVar.a, eVar.b);
            this.D.setVideoEncodingBitRate(eVar.c);
            this.D.setAudioEncodingBitRate(eVar.e);
            this.D.setAudioChannels(2);
            this.D.setAudioSamplingRate(eVar.f);
            this.D.setOutputFile(this.m.getAbsolutePath());
            this.D.setOrientationHint(this.c.c);
            int i = this.s;
            if (i > 0) {
                this.D.setMaxDuration(i);
            }
            this.D.setOnInfoListener(this.b);
            this.D.setOnErrorListener(this.b);
            this.D.prepare();
            this.D.start();
            f(-1001);
            return true;
        } catch (Exception unused) {
            m();
            return false;
        }
    }
}
