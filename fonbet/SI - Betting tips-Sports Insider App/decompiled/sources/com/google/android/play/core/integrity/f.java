package com.google.android.play.core.integrity;

import d8.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.internal.play_billing.e {

    /* renamed from: f, reason: collision with root package name */
    public final n f6035f;

    /* renamed from: g, reason: collision with root package name */
    public final w7.g f6036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f6037h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, w7.g gVar2) {
        super(1);
        this.f6037h = gVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f6035f = new n("OnRequestIntegrityTokenCallback");
        this.f6036g = gVar2;
    }
}
