package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z {
    public static final /* synthetic */ int d = 0;
    public final int a;
    public final y[] b;
    public int c;

    static {
        new z(new y[0]);
    }

    public z(y... yVarArr) {
        this.b = yVarArr;
        this.a = yVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.a == zVar.a && Arrays.equals(this.b, zVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b);
        this.c = hashCode;
        return hashCode;
    }
}
