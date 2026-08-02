package com.google.android.gms.auth.api;

import com.google.android.gms.common.internal.ShowFirstParty;

@Deprecated
/* loaded from: classes9.dex */
public final class zbc {
    protected Boolean zba;
    protected String zbb;

    public zbc() {
        this.zba = Boolean.FALSE;
    }

    @ShowFirstParty
    public final zbc zba(String str) {
        this.zbb = str;
        return this;
    }

    @ShowFirstParty
    public zbc(zbd zbdVar) {
        boolean z11;
        String str;
        this.zba = Boolean.FALSE;
        zbd.zbb(zbdVar);
        z11 = zbdVar.zbc;
        this.zba = Boolean.valueOf(z11);
        str = zbdVar.zbd;
        this.zbb = str;
    }
}
