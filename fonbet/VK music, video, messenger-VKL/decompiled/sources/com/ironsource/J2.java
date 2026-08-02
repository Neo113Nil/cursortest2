package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class J2 extends C4341h0 {
    private final LevelPlayAdSize g;
    private final Boolean h;
    private final Long i;

    public /* synthetic */ J2(UUID uuid, String str, C4336gd c4336gd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, Tf tf, Double d, int i, zcl zclVar) {
        this(uuid, str, (i & 4) != 0 ? null : c4336gd, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : tf, (i & 128) != 0 ? null : d);
    }

    public final LevelPlayAdSize i() {
        return this.g;
    }

    public final Boolean j() {
        return this.h;
    }

    public final Long k() {
        return this.i;
    }

    public J2(UUID uuid, String str, C4336gd c4336gd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, Tf tf, Double d) {
        super(IronSource.a.BANNER, uuid, str, c4336gd, tf, d);
        this.g = levelPlayAdSize;
        this.h = bool;
        this.i = l;
    }

    public J2() {
        this(C4616w7.a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
