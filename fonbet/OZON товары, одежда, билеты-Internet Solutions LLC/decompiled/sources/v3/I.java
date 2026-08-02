package v3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import j3.C7263e;
import v3.C10201C;

/* loaded from: classes.dex */
public final class I implements C10201C.c {
    public final AudioTrack a(p pVar, C7263e c7263e, int i11, Context context) {
        int i12 = Build.VERSION.SDK_INT;
        int i13 = m3.N.f74289a;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(pVar.f101935d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c7263e.a().f69059a).setAudioFormat(new AudioFormat.Builder().setSampleRate(pVar.f101933b).setChannelMask(pVar.f101934c).setEncoding(pVar.f101932a).build()).setTransferMode(1).setBufferSizeInBytes(pVar.f101937f).setSessionId(i11);
        if (i12 >= 29) {
            sessionId.setOffloadedPlayback(pVar.f101936e);
        }
        if (i12 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
