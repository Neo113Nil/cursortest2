package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a extends e {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public a(r rVar) {
        super(rVar);
    }

    public final boolean a(n nVar) {
        if (this.b) {
            nVar.e(nVar.b + 1);
        } else {
            int j = nVar.j();
            int i = (j >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.a.a(o.a(null, MimeTypes.AUDIO_MPEG, -1, -1, 1, e[(j >> 2) & 3], null, null, null));
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.a.a(o.a(null, i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW, -1, -1, 1, 8000, (j & 1) == 1 ? 2 : 3, -1, -1, null, null, 0, null, null));
                this.c = true;
            } else if (i != 10) {
                throw new d("Audio format not supported: " + this.d);
            }
            this.b = true;
        }
        return true;
    }

    public final void a(n nVar, long j) {
        if (this.d == 2) {
            int i = nVar.c - nVar.b;
            this.a.a(i, nVar);
            this.a.a(j, 1, i, 0, null);
            return;
        }
        int j2 = nVar.j();
        if (j2 == 0 && !this.c) {
            int i2 = nVar.c - nVar.b;
            byte[] bArr = new byte[i2];
            nVar.a(bArr, 0, i2);
            Pair a = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr);
            this.a.a(o.a(null, MimeTypes.AUDIO_AAC, -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null, null));
            this.c = true;
            return;
        }
        if (this.d != 10 || j2 == 1) {
            int i3 = nVar.c - nVar.b;
            this.a.a(i3, nVar);
            this.a.a(j, 1, i3, 0, null);
        }
    }
}
