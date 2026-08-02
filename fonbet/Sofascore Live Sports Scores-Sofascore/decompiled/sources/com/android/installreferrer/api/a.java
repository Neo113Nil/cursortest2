package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import defpackage.cp4;
import defpackage.fm9;
import defpackage.gm9;
import defpackage.hm9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final InstallReferrerStateListener a;
    public final /* synthetic */ b b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.b = bVar;
        if (installReferrerStateListener != null) {
            this.a = installReferrerStateListener;
        } else {
            cp4.h("Please specify a listener to know when setup is done.");
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hm9 fm9Var;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = gm9.a;
        if (iBinder == null) {
            fm9Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            fm9Var = queryLocalInterface instanceof hm9 ? (hm9) queryLocalInterface : new fm9(iBinder);
        }
        b bVar = this.b;
        bVar.c = fm9Var;
        bVar.a = 2;
        this.a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.b;
        bVar.c = null;
        bVar.a = 0;
        this.a.onInstallReferrerServiceDisconnected();
    }
}
