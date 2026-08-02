package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes2.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final int f32241a;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f32241a = i10;
    }
}
