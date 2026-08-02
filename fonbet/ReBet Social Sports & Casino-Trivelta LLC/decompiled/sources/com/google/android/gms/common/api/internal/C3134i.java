package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC2168s;
import com.google.android.gms.common.internal.AbstractC3191o;

/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3134i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32522a;

    public C3134i(Activity activity) {
        AbstractC3191o.n(activity, "Activity must not be null");
        this.f32522a = activity;
    }

    public final boolean a() {
        return this.f32522a instanceof AbstractActivityC2168s;
    }

    public final boolean b() {
        return this.f32522a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.f32522a;
    }

    public final AbstractActivityC2168s d() {
        return (AbstractActivityC2168s) this.f32522a;
    }
}
