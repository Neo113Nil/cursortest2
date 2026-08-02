package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dxc {
    public final isj a;
    public final wsj b;
    public final usj c;
    public final s1k d;
    public int e;

    public dxc(isj isjVar, wsj wsjVar, usj usjVar) {
        this.a = isjVar;
        this.b = wsjVar;
        this.c = usjVar;
        this.d = MimeTypes.AUDIO_TRUEHD.equals(isjVar.f.l) ? new s1k(0) : null;
    }
}
