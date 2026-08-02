package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class exc {
    public final jsj a;
    public final xsj b;
    public final vsj c;
    public final s1k d;
    public int e;
    public b f;

    public exc(jsj jsjVar, xsj xsjVar, vsj vsjVar) {
        this.a = jsjVar;
        this.b = xsjVar;
        this.c = vsjVar;
        this.d = MimeTypes.AUDIO_TRUEHD.equals(jsjVar.g.o) ? new s1k(1) : null;
    }
}
