package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class B0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public TaskCompletionSource f32332e;

    public B0(InterfaceC3138k interfaceC3138k) {
        super(interfaceC3138k, GoogleApiAvailability.r());
        this.f32332e = new TaskCompletionSource();
        this.mLifecycleFragment.h("GmsAvailabilityHelper", this);
    }

    public static B0 i(Activity activity) {
        InterfaceC3138k fragment = AbstractC3136j.getFragment(activity);
        B0 b02 = (B0) fragment.s("GmsAvailabilityHelper", B0.class);
        if (b02 == null) {
            return new B0(fragment);
        }
        if (b02.f32332e.getTask().isComplete()) {
            b02.f32332e = new TaskCompletionSource();
        }
        return b02;
    }

    @Override // com.google.android.gms.common.api.internal.g1
    public final void b(ConnectionResult connectionResult, int i10) {
        String i11 = connectionResult.i();
        if (i11 == null) {
            i11 = "Error connecting to Google Play services";
        }
        this.f32332e.setException(new com.google.android.gms.common.api.b(new Status(connectionResult, i11, connectionResult.h())));
    }

    @Override // com.google.android.gms.common.api.internal.g1
    public final void c() {
        Activity Q10 = this.mLifecycleFragment.Q();
        if (Q10 == null) {
            this.f32332e.trySetException(new com.google.android.gms.common.api.b(new Status(8)));
            return;
        }
        int i10 = this.f32520d.i(Q10);
        if (i10 == 0) {
            this.f32332e.trySetResult(null);
        } else {
            if (this.f32332e.getTask().isComplete()) {
                return;
            }
            h(new ConnectionResult(i10, null), 0);
        }
    }

    public final Task j() {
        return this.f32332e.getTask();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onDestroy() {
        super.onDestroy();
        this.f32332e.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }
}
