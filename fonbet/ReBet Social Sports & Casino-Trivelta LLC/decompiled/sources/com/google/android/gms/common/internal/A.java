package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class A extends C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f32617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f32618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32619c;

    public A(Intent intent, Activity activity, int i10) {
        this.f32617a = intent;
        this.f32618b = activity;
        this.f32619c = i10;
    }

    @Override // com.google.android.gms.common.internal.C
    public final void a() {
        Intent intent = this.f32617a;
        if (intent != null) {
            this.f32618b.startActivityForResult(intent, this.f32619c);
        }
    }
}
