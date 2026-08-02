package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC3190n;

/* loaded from: classes2.dex */
final class zba implements AbstractC3190n.a {
    public /* synthetic */ zba(byte[] bArr) {
    }

    @Override // com.google.android.gms.common.internal.AbstractC3190n.a
    public final /* synthetic */ Object convert(l lVar) {
        return ((GoogleSignInResult) lVar).getSignInAccount();
    }
}
