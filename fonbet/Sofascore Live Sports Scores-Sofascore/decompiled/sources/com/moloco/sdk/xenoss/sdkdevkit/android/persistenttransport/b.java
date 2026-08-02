package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import defpackage.sq3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b extends sq3 {
    public UrlPostRequestWorker r;
    public Map s;
    public /* synthetic */ Object t;
    public final /* synthetic */ UrlPostRequestWorker u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UrlPostRequestWorker urlPostRequestWorker, sq3 sq3Var) {
        super(sq3Var);
        this.u = urlPostRequestWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.doWork(this);
    }
}
