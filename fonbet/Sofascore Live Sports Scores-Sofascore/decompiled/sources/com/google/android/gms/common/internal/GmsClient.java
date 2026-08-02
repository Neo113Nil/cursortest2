package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import defpackage.a70;
import defpackage.n2p;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zam {
    public final ClientSettings F;
    public final Set G;
    public final Account H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GmsClient(Context context, Looper looper, int i, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, r3, r4, i, new a(connectionCallbacks), new b(onConnectionFailedListener), clientSettings.f);
        n2p a = GmsClientSupervisor.a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.e;
        Preconditions.i(connectionCallbacks);
        Preconditions.i(onConnectionFailedListener);
        this.F = clientSettings;
        this.H = clientSettings.a;
        Set set = clientSettings.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                a70.r("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.G = set;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Executor c() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set f() {
        return this.G;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.H;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set m() {
        return requiresSignIn() ? this.G : Collections.EMPTY_SET;
    }
}
