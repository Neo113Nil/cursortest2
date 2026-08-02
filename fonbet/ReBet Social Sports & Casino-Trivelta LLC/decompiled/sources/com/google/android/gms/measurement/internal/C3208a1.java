package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3208a1 {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f33799a;

    public C3208a1(S3 s32) {
        this.f33799a = s32;
    }

    public static C3208a1 c(String str) {
        return new C3208a1((TextUtils.isEmpty(str) || str.length() > 1) ? S3.UNINITIALIZED : V3.j(str.charAt(0)));
    }

    public final S3 a() {
        return this.f33799a;
    }

    public final String b() {
        return String.valueOf(V3.m(this.f33799a));
    }
}
