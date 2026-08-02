package com.vk.push.core.network.data.model;

import xsna.zcl;

/* compiled from: AppInfoRemote.kt */
/* loaded from: classes5.dex */
public final class AppInfoRemote {
    public final String a;
    public final String b;
    public final boolean c;

    public AppInfoRemote(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final String getPackageName() {
        return this.a;
    }

    public final String getPubKey() {
        return this.b;
    }

    public final boolean isArbiter() {
        return this.c;
    }

    public /* synthetic */ AppInfoRemote(String str, String str2, boolean z, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
