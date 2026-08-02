package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.U3;
import defpackage.fc6;
import defpackage.ilg;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k {
    public final Uri a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final int f;

    public k(Uri uri, long j, long j2, long j3, String str, int i) {
        if (j < 0) {
            ilg.c();
            throw null;
        }
        if (j2 < 0) {
            ilg.c();
            throw null;
        }
        if (j3 <= 0 && j3 != -1) {
            ilg.c();
            throw null;
        }
        this.a = uri;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(this.a);
        sb.append(", ");
        sb.append(Arrays.toString((byte[]) null));
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        return fc6.h(this.f, U3.j.e, sb);
    }
}
