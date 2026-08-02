package o1;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;
import b1.C2350d;
import o1.InterfaceC5773z;
import o1.P;

/* loaded from: classes.dex */
public class Z implements P.f {
    @Override // o1.P.f
    public final AudioTrack b(InterfaceC5773z.a aVar, C2350d c2350d, int i10, Context context) {
        return c(aVar, c2350d, i10, context);
    }

    public final AudioTrack c(InterfaceC5773z.a aVar, C2350d c2350d, int i10, Context context) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(c2350d, aVar.f58888d)).setAudioFormat(e1.Z.M(aVar.f58886b, aVar.f58887c, aVar.f58885a)).setTransferMode(1).setBufferSizeInBytes(aVar.f58890f).setSessionId(i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            g(sessionId, aVar.f58889e);
        }
        if (i11 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return d(sessionId).build();
    }

    public final AudioAttributes e(C2350d c2350d, boolean z10) {
        return z10 ? f() : c2350d.a().f24581a;
    }

    public final AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public final void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }

    public AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}
