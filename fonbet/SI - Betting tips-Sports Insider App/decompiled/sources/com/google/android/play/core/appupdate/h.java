package com.google.android.play.core.appupdate;

import android.os.Bundle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h extends com.google.android.gms.internal.play_billing.e implements y7.h {

    /* renamed from: f, reason: collision with root package name */
    public final com.android.billingclient.api.a f6005f;

    /* renamed from: g, reason: collision with root package name */
    public final w7.g f6006g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f6007h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, com.android.billingclient.api.a aVar, w7.g gVar) {
        super(8);
        this.f6007h = kVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f6005f = aVar;
        this.f6006g = gVar;
    }

    @Override // y7.h
    public void b(Bundle bundle) {
        this.f6007h.f6011a.c(this.f6006g);
        this.f6005f.g("onCompleteUpdate", new Object[0]);
    }

    @Override // y7.h
    public void t(Bundle bundle) {
        this.f6007h.f6011a.c(this.f6006g);
        this.f6005f.g("onRequestInfo", new Object[0]);
    }
}
