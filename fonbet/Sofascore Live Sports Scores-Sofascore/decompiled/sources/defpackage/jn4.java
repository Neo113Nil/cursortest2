package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jn4 {
    public final sm8 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final lo0[] i;

    public jn4(sm8 sm8Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, lo0[] lo0VarArr) {
        this.a = sm8Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = lo0VarArr;
    }

    public static AudioAttributes c(zm0 zm0Var, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        dad dadVar = zm0Var.f;
        if (dadVar == null) {
            dadVar = new dad(zm0Var);
            zm0Var.f = dadVar;
        }
        return (AudioAttributes) dadVar.b;
    }

    public final AudioTrack a(boolean z, zm0 zm0Var, int i) {
        int i2 = this.c;
        try {
            AudioTrack b = b(z, zm0Var, i);
            int state = b.getState();
            if (state == 1) {
                return b;
            }
            try {
                b.release();
            } catch (Exception unused) {
            }
            throw new uo0(state, this.e, this.f, this.h, this.a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new uo0(0, this.e, this.f, this.h, this.a, i2 == 1, e);
        }
    }

    public final AudioTrack b(boolean z, zm0 zm0Var, int i) {
        int i2 = lik.a;
        int i3 = this.g;
        int i4 = this.f;
        int i5 = this.e;
        if (i2 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(zm0Var, z)).setAudioFormat(on4.e(i5, i4, i3)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }
        if (i2 >= 21) {
            return new AudioTrack(c(zm0Var, z), on4.e(i5, i4, i3), this.h, 1, i);
        }
        int q = lik.q(zm0Var.c);
        if (i == 0) {
            return new AudioTrack(q, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(q, this.e, this.f, this.g, this.h, 1, i);
    }
}
