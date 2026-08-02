package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;

/* loaded from: classes9.dex */
final class zae extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ ComponentCallbacksC5392m zab;
    final /* synthetic */ int zac;

    zae(Intent intent, ComponentCallbacksC5392m componentCallbacksC5392m, int i11) {
        this.zaa = intent;
        this.zab = componentCallbacksC5392m;
        this.zac = i11;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
