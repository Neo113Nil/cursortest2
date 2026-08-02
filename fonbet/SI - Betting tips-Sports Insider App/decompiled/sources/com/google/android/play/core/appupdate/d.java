package com.google.android.play.core.appupdate;

import android.content.IntentFilter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements y7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5995a;

    /* renamed from: b, reason: collision with root package name */
    public final h9.c f5996b;

    public /* synthetic */ d(h9.c cVar, int i5) {
        this.f5995a = i5;
        this.f5996b = cVar;
    }

    @Override // y7.c
    public final Object a() {
        switch (this.f5995a) {
            case 0:
                return new c(new com.android.billingclient.api.a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), ((b2.e) this.f5996b.f10430b).f2968a);
            default:
                return new l(((b2.e) this.f5996b.f10430b).f2968a);
        }
    }
}
