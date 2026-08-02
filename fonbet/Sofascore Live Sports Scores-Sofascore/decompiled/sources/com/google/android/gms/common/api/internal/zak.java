package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import defpackage.v2n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zak extends zap {
    @Override // com.google.android.gms.common.api.internal.zap
    public final void a(ConnectionResult connectionResult, int i) {
        if (i >= 0) {
            throw null;
        }
        new Exception();
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void b() {
        throw null;
    }

    public final v2n c(int i) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        boolean z = this.a;
        String valueOf = String.valueOf((Object) null);
        new StringBuilder(String.valueOf(z).length() + 9 + valueOf.length());
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.a = false;
        throw null;
    }
}
