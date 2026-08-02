package com.google.android.gms.auth.api.signin.internal;

import Z0.a;
import android.os.Bundle;
import androidx.loader.content.c;
import com.google.android.gms.common.api.f;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zbv implements a.InterfaceC0302a {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbv(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.zba = signInHubActivity;
    }

    @Override // Z0.a.InterfaceC0302a
    public final c onCreateLoader(int i10, Bundle bundle) {
        return new zbc(this.zba, f.i());
    }

    @Override // Z0.a.InterfaceC0302a
    public final /* bridge */ /* synthetic */ void onLoadFinished(c cVar, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zba(), signInHubActivity.zbb());
        signInHubActivity.finish();
    }

    @Override // Z0.a.InterfaceC0302a
    public final void onLoaderReset(c cVar) {
    }
}
