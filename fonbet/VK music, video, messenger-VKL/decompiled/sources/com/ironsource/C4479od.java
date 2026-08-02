package com.ironsource;

import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.mediation.LevelPlay;

/* renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4479od {
    private final String a;
    private final LevelPlay.AdFormat b;

    public C4479od(String str, LevelPlay.AdFormat adFormat) {
        this.a = str;
        this.b = adFormat;
    }

    public final String a() {
        return this.a + BundleUtil.UNDERLINE_TAG + this.b;
    }
}
