package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207hg implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0232ig f13899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0483sg f13900b;

    public C0207hg(C0232ig c0232ig, InterfaceC0483sg interfaceC0483sg) {
        this.f13899a = c0232ig;
        this.f13900b = interfaceC0483sg;
    }

    public static final void a(C0232ig c0232ig, InterfaceC0483sg interfaceC0483sg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c0232ig.f13946b.getInstallReferrer();
                interfaceC0483sg.a(new C0359ng(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC0334mg.f14267c));
                installReferrerClient = c0232ig.f13946b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th2) {
            try {
                interfaceC0483sg.a(th2);
                installReferrerClient = c0232ig.f13946b;
            } finally {
            }
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i5) {
        if (i5 != 0) {
            this.f13899a.a(this.f13900b, new IllegalStateException(androidx.appcompat.widget.c1.i(i5, "Referrer check failed with error ")));
            return;
        }
        C0232ig c0232ig = this.f13899a;
        c0232ig.f13945a.execute(new androidx.appcompat.app.t(18, c0232ig, this.f13900b));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
