package com.google.android.play.core.appupdate;

import android.os.Bundle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends h {
    @Override // com.google.android.play.core.appupdate.h, y7.h
    public final void b(Bundle bundle) {
        super.b(bundle);
        int i5 = bundle.getInt("error.code", -2);
        w7.g gVar = this.f6006g;
        if (i5 != 0) {
            gVar.c(new d6.k(bundle.getInt("error.code", -2)));
        } else {
            gVar.d(null);
        }
    }
}
