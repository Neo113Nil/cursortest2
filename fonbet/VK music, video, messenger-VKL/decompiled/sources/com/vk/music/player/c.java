package com.vk.music.player;

import android.os.CountDownTimer;
import com.vk.music.player.MusicCountDownTimer;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bn40;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MusicCountDownTimer.kt */
/* loaded from: classes3.dex */
public final class c extends CountDownTimer {
    public final /* synthetic */ MusicCountDownTimer a;

    /* compiled from: MusicCountDownTimer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<MusicCountDownTimer.a, s3q0> {
        public static final a b = new a(1, MusicCountDownTimer.a.class, "onTimerFinished", "onTimerFinished()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(MusicCountDownTimer.a aVar) {
            aVar.n0();
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j, MusicCountDownTimer musicCountDownTimer, long j2) {
        super(j, j2);
        this.a = musicCountDownTimer;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.b(a.b);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        MusicCountDownTimer musicCountDownTimer = this.a;
        if (Math.abs(j - musicCountDownTimer.f) > MusicCountDownTimer.h) {
            bn40.f(MusicCountDownTimer.i, "handleTick millisUntilFinished = ", Long.valueOf(j));
            musicCountDownTimer.f = j;
        }
        musicCountDownTimer.b = j;
        Iterator it = musicCountDownTimer.e.iterator();
        while (it.hasNext()) {
            ((MusicCountDownTimer.a) it.next()).s0(j);
        }
    }
}
