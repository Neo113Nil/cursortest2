package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class K extends L {

    /* renamed from: f, reason: collision with root package name */
    public final Callable f32248f;

    public /* synthetic */ K(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f32248f = callable;
    }

    @Override // com.google.android.gms.common.L
    public final String a() {
        try {
            return (String) this.f32248f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
