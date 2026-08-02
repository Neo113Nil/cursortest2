package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class c1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f32474e;

    public c1(InterfaceC3138k interfaceC3138k) {
        super(interfaceC3138k, GoogleApiAvailability.r());
        this.f32474e = new SparseArray();
        this.mLifecycleFragment.h("AutoManageHelper", this);
    }

    public static c1 i(C3134i c3134i) {
        InterfaceC3138k fragment = AbstractC3136j.getFragment(c3134i);
        c1 c1Var = (c1) fragment.s("AutoManageHelper", c1.class);
        return c1Var != null ? c1Var : new c1(fragment);
    }

    @Override // com.google.android.gms.common.api.internal.g1
    public final void b(ConnectionResult connectionResult, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        b1 b1Var = (b1) this.f32474e.get(i10);
        if (b1Var != null) {
            k(i10);
            f.c cVar = b1Var.f32443c;
            if (cVar != null) {
                cVar.c(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g1
    public final void c() {
        for (int i10 = 0; i10 < this.f32474e.size(); i10++) {
            b1 l10 = l(i10);
            if (l10 != null) {
                l10.f32442b.d();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3136j
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.f32474e.size(); i10++) {
            b1 l10 = l(i10);
            if (l10 != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(l10.f32441a);
                printWriter.println(":");
                l10.f32442b.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void j(int i10, com.google.android.gms.common.api.f fVar, f.c cVar) {
        AbstractC3191o.n(fVar, "GoogleApiClient instance cannot be null");
        AbstractC3191o.q(this.f32474e.indexOfKey(i10) < 0, "Already managing a GoogleApiClient with id " + i10);
        d1 d1Var = (d1) this.f32518b.get();
        String.valueOf(d1Var);
        b1 b1Var = new b1(this, i10, fVar, cVar);
        fVar.p(b1Var);
        this.f32474e.put(i10, b1Var);
        if (this.f32517a && d1Var == null) {
            "connecting ".concat(fVar.toString());
            fVar.d();
        }
    }

    public final void k(int i10) {
        b1 b1Var = (b1) this.f32474e.get(i10);
        this.f32474e.remove(i10);
        if (b1Var != null) {
            b1Var.f32442b.q(b1Var);
            b1Var.f32442b.e();
        }
    }

    public final b1 l(int i10) {
        if (this.f32474e.size() <= i10) {
            return null;
        }
        SparseArray sparseArray = this.f32474e;
        return (b1) sparseArray.get(sparseArray.keyAt(i10));
    }

    @Override // com.google.android.gms.common.api.internal.g1, com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onStart() {
        super.onStart();
        String.valueOf(this.f32474e);
        if (this.f32518b.get() == null) {
            for (int i10 = 0; i10 < this.f32474e.size(); i10++) {
                b1 l10 = l(i10);
                if (l10 != null) {
                    l10.f32442b.d();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g1, com.google.android.gms.common.api.internal.AbstractC3136j
    public final void onStop() {
        super.onStop();
        for (int i10 = 0; i10 < this.f32474e.size(); i10++) {
            b1 l10 = l(i10);
            if (l10 != null) {
                l10.f32442b.e();
            }
        }
    }
}
