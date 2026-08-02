package v3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import j3.C7263e;
import j3.C7272n;
import v3.C10201C;
import v3.C10209e;

/* loaded from: classes.dex */
public final class y implements C10201C.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f101994a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f101995b;

    /* loaded from: classes8.dex */
    private static final class a {
        public static C10209e a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z11) {
            int playbackOffloadSupport;
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return C10209e.f101900d;
            }
            C10209e.a aVar = new C10209e.a();
            boolean z12 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
            aVar.e();
            aVar.f(z12);
            aVar.g(z11);
            return aVar.d();
        }
    }

    public y(Context context) {
        this.f101994a = context == null ? null : context.getApplicationContext();
    }

    @Override // v3.C10201C.a
    public final C10209e a(C7263e c7263e, C7272n c7272n) {
        int i11;
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        c7272n.getClass();
        c7263e.getClass();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 29 || (i11 = c7272n.f69103H) == -1) {
            return C10209e.f101900d;
        }
        Boolean bool = this.f101995b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = this.f101994a;
            if (context != null) {
                String parameters = k3.c.c(context).getParameters("offloadVariableRateSupported");
                this.f101995b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f101995b = Boolean.FALSE;
            }
            booleanValue = this.f101995b.booleanValue();
        }
        String str = c7272n.f69127o;
        str.getClass();
        int c11 = j3.u.c(str, c7272n.f69123k);
        if (c11 == 0 || i12 < m3.N.s(c11)) {
            return C10209e.f101900d;
        }
        int t2 = m3.N.t(c7272n.f69102G);
        if (t2 == 0) {
            return C10209e.f101900d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i11).setChannelMask(t2).setEncoding(c11).build();
            if (i12 >= 31) {
                return a.a(build, c7263e.a().f69059a, booleanValue);
            }
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, c7263e.a().f69059a);
            if (!isOffloadedPlaybackSupported) {
                return C10209e.f101900d;
            }
            C10209e.a aVar = new C10209e.a();
            aVar.e();
            aVar.g(booleanValue);
            return aVar.d();
        } catch (IllegalArgumentException unused) {
            return C10209e.f101900d;
        }
    }
}
