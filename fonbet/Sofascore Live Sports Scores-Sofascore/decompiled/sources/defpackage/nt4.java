package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class nt4 implements m3f {
    public final /* synthetic */ hu4 a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r1.b != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r1.equals("audio/ac4") == false) goto L16;
     */
    @Override // defpackage.m3f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z;
        yt4 yt4Var;
        hu4 hu4Var = this.a;
        sm8 sm8Var = (sm8) obj;
        synchronized (hu4Var.c) {
            try {
                z = true;
                if (hu4Var.g.J && !hu4Var.f) {
                    char c = 2;
                    if (sm8Var.y > 2) {
                        String str = sm8Var.l;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 187078296:
                                    if (str.equals(MimeTypes.AUDIO_AC3)) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 187078297:
                                    break;
                                case 1504578661:
                                    if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    if (lik.a >= 32) {
                                        yt4 yt4Var2 = hu4Var.h;
                                        if (yt4Var2 != null) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (lik.a >= 32 || (yt4Var = hu4Var.h) == null || !yt4Var.b || !yt4Var.c() || !hu4Var.h.d() || !hu4Var.h.a(hu4Var.i, sm8Var)) {
                                        z = false;
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        }
                        if (lik.a >= 32) {
                        }
                        z = false;
                    }
                }
            } finally {
            }
        }
        return z;
    }
}
