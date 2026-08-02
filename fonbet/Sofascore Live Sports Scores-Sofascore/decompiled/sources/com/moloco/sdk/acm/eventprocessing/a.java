package com.moloco.sdk.acm.eventprocessing;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a extends sq3 {
    public DBRequestWorker r;
    public /* synthetic */ Object s;
    public final /* synthetic */ DBRequestWorker t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DBRequestWorker dBRequestWorker, sq3 sq3Var) {
        super(sq3Var);
        this.t = dBRequestWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.doWork(this);
    }
}
