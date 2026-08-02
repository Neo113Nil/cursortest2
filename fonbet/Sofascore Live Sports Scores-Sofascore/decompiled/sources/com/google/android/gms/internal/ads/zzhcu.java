package com.google.android.gms.internal.ads;

import defpackage.ddb;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhcu extends zzhcs implements ddb {
    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        e().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    public /* bridge */ /* synthetic */ Future d() {
        throw null;
    }

    public abstract ddb e();
}
