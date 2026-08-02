package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.l;

/* loaded from: classes2.dex */
final class zbg extends zbl {
    final /* synthetic */ Context zba;
    final /* synthetic */ GoogleSignInOptions zbb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbg(f fVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(fVar);
        this.zba = context;
        this.zbb = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ l createFailedResult(Status status) {
        return new GoogleSignInResult(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* bridge */ /* synthetic */ void doExecute(C3117a.b bVar) {
        zbs zbsVar = (zbs) ((zbe) bVar).getService();
        Context context = this.zba;
        GoogleSignInOptions googleSignInOptions = this.zbb;
        zbsVar.zbc(new zbf(this, context, googleSignInOptions), googleSignInOptions);
    }
}
