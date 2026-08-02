package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;
import xsna.zcl;

/* renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4263cc extends C4341h0 {
    public /* synthetic */ C4263cc(UUID uuid, String str, C4336gd c4336gd, int i, zcl zclVar) {
        this(uuid, str, (i & 4) != 0 ? null : c4336gd);
    }

    public C4263cc(UUID uuid, String str, C4336gd c4336gd) {
        super(IronSource.a.NATIVE_AD, uuid, str, c4336gd, null, null, 48, null);
    }

    public C4263cc() {
        this(C4616w7.a.a(), "", null, 4, null);
    }
}
