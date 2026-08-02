package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.loader.app.a;
import androidx.loader.content.b;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes9.dex */
final class zbw implements a.InterfaceC0801a {
    final /* synthetic */ SignInHubActivity zba;

    /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0801a
    public final b onCreateLoader(int i11, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.a.InterfaceC0801a
    public final /* bridge */ /* synthetic */ void onLoadFinished(b bVar, Object obj) {
        int i11;
        Intent intent;
        SignInHubActivity signInHubActivity = this.zba;
        i11 = signInHubActivity.zbe;
        intent = signInHubActivity.zbf;
        signInHubActivity.setResult(i11, intent);
        this.zba.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0801a
    public final void onLoaderReset(b bVar) {
    }
}
