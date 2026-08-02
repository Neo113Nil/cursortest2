package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes2.dex */
public abstract class o extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f32784a;

    public o(String str, Intent intent) {
        super(str);
        this.f32784a = intent;
    }

    public Intent a() {
        return new Intent(this.f32784a);
    }
}
