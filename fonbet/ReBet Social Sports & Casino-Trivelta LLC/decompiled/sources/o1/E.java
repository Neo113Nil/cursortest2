package o1;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import b1.AbstractC2335D;
import b1.C2350d;
import e1.AbstractC4134a;
import o1.C5759k;
import o1.P;

/* loaded from: classes.dex */
public final class E implements P.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f58640a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f58641b;

    public static final class a {
        public static C5759k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            boolean isOffloadedPlaybackSupported;
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
            return !isOffloadedPlaybackSupported ? C5759k.f58845d : new C5759k.b().e(true).g(z10).d();
        }
    }

    public static final class b {
        public static C5759k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int playbackOffloadSupport;
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return C5759k.f58845d;
            }
            return new C5759k.b().e(true).f(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).g(z10).d();
        }
    }

    public E(Context context) {
        this.f58640a = context == null ? null : context.getApplicationContext();
    }

    @Override // o1.P.d
    public C5759k a(androidx.media3.common.a aVar, C2350d c2350d) {
        AbstractC4134a.e(aVar);
        AbstractC4134a.e(c2350d);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || aVar.f20519G == -1) {
            return C5759k.f58845d;
        }
        boolean b10 = b(this.f58640a);
        int f10 = AbstractC2335D.f((String) AbstractC4134a.e(aVar.f20543o), aVar.f20539k);
        if (f10 == 0 || i10 < e1.Z.K(f10)) {
            return C5759k.f58845d;
        }
        int N10 = e1.Z.N(aVar.f20518F);
        if (N10 == 0) {
            return C5759k.f58845d;
        }
        try {
            AudioFormat M10 = e1.Z.M(aVar.f20519G, N10, f10);
            return i10 >= 31 ? b.a(M10, c2350d.a().f24581a, b10) : a.a(M10, c2350d.a().f24581a, b10);
        } catch (IllegalArgumentException unused) {
            return C5759k.f58845d;
        }
    }

    public final boolean b(Context context) {
        Boolean bool = this.f58641b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = c1.m.c(context).getParameters("offloadVariableRateSupported");
            this.f58641b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f58641b = Boolean.FALSE;
        }
        return this.f58641b.booleanValue();
    }
}
