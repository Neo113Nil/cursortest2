package com.google.android.datatransport.cct;

import T6.d;
import T6.h;
import T6.m;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes9.dex */
public class CctBackendFactory implements d {
    @Override // T6.d
    public m create(h hVar) {
        return new b(hVar.a(), hVar.d(), hVar.c());
    }
}
