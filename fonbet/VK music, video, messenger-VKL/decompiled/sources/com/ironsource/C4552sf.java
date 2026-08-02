package com.ironsource;

import com.huawei.hms.framework.common.BundleUtil;
import xsna.pzl;

/* renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4552sf {
    private final String a;
    private final String b;

    public C4552sf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return pzl.b(this.a, BundleUtil.UNDERLINE_TAG, this.b);
    }
}
