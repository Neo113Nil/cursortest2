package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC2177b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class g1 extends AbstractC3136j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f32517a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f32518b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f32519c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleApiAvailability f32520d;

    public g1(InterfaceC3138k interfaceC3138k, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC3138k);
        this.f32518b = new AtomicReference(null);
        this.f32519c = new zau(Looper.getMainLooper());
        this.f32520d = googleApiAvailability;
    }

    public static final int e(d1 d1Var) {
        if (d1Var == null) {
            return -1;
        }
        return d1Var.a();
    }

    public final void a(ConnectionResult connectionResult, int i10) {
        this.f32518b.set(null);
        b(connectionResult, i10);
    }

    public abstract void b(ConnectionResult connectionResult, int i10);

    public abstract void c();

    public final void d() {
        this.f32518b.set(null);
        c();
    }

    public final void h(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        d1 d1Var = new d1(connectionResult, i10);
        do {
            atomicReference = this.f32518b;
            if (AbstractC2177b.a(atomicReference, null, d1Var)) {
                this.f32519c.post(new f1(this, d1Var));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onActivityResult(int i10, int i11, Intent intent) {
        d1 d1Var = (d1) this.f32518b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int i12 = this.f32520d.i(getActivity());
                if (i12 == 0) {
                    d();
                    return;
                } else {
                    if (d1Var == null) {
                        return;
                    }
                    if (d1Var.b().h() == 18 && i12 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (d1Var != null) {
                a(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, d1Var.b().toString()), e(d1Var));
                return;
            }
            return;
        }
        if (d1Var != null) {
            a(d1Var.b(), d1Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), e((d1) this.f32518b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f32518b.set(bundle.getBoolean("resolving_error", false) ? new d1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        d1 d1Var = (d1) this.f32518b.get();
        if (d1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", d1Var.a());
        bundle.putInt("failed_status", d1Var.b().h());
        bundle.putParcelable("failed_resolution", d1Var.b().j());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3136j
    public void onStart() {
        super.onStart();
        this.f32517a = true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3136j
    public void onStop() {
        super.onStop();
        this.f32517a = false;
    }
}
