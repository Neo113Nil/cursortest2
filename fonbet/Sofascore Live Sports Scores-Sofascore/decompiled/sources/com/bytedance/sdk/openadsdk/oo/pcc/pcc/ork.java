package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import defpackage.ftm;
import defpackage.itm;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ork<D> extends itm {
    private static final HashSet<String> pcc;

    static {
        HashSet<String> hashSet = new HashSet<>();
        pcc = hashSet;
        hashSet.add("play_start");
        hashSet.add("feed_play");
        hashSet.add("feed_continue");
        hashSet.add("feed_pause");
        hashSet.add("feed_break");
        hashSet.add("feed_over");
    }

    public ork(String str, ftm ftmVar) {
        super(str, ftmVar);
    }

    @Override // defpackage.itm
    public final int qf() {
        if ((this instanceof hc) || sf() == 1) {
            return 4;
        }
        boolean z = this instanceof vy;
        if (z) {
            if (pcc.contains(((vy) this).kj())) {
                return 3;
            }
        }
        return z ? 2 : 1;
    }

    public ork(String str, D d) {
        super(str, d);
    }
}
