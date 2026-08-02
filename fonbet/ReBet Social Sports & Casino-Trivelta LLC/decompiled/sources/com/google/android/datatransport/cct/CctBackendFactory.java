package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import h9.d;
import h9.h;
import h9.m;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements d {
    @Override // h9.d
    public m create(h hVar) {
        return new e9.d(hVar.b(), hVar.e(), hVar.d());
    }
}
