package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.tasks.Task;
import eb.C4196f;
import java.util.List;
import kb.AbstractC5223h;
import kb.AbstractC5238x;
import kb.H;
import kb.N;
import kb.O;
import kb.P;
import kb.k0;

/* loaded from: classes3.dex */
public abstract class FirebaseUser extends AbstractSafeParcelable implements H {
    public Task N(AuthCredential authCredential) {
        AbstractC3191o.m(authCredential);
        return FirebaseAuth.getInstance(n0()).P(this, authCredential);
    }

    public Task O(AuthCredential authCredential) {
        AbstractC3191o.m(authCredential);
        return FirebaseAuth.getInstance(n0()).t0(this, authCredential);
    }

    public Task Y() {
        return FirebaseAuth.getInstance(n0()).O(this);
    }

    public Task Z() {
        return FirebaseAuth.getInstance(n0()).V(this, false).continueWithTask(new O(this));
    }

    @Override // kb.H
    public abstract String a();

    public Task a0(ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(n0()).V(this, false).continueWithTask(new N(this, actionCodeSettings));
    }

    @Override // kb.H
    public abstract String b();

    public Task d0(Activity activity, AbstractC5223h abstractC5223h) {
        AbstractC3191o.m(activity);
        AbstractC3191o.m(abstractC5223h);
        return FirebaseAuth.getInstance(n0()).L(activity, abstractC5223h, this);
    }

    public Task e0(Activity activity, AbstractC5223h abstractC5223h) {
        AbstractC3191o.m(activity);
        AbstractC3191o.m(abstractC5223h);
        return FirebaseAuth.getInstance(n0()).n0(activity, abstractC5223h, this);
    }

    public Task f0(String str) {
        AbstractC3191o.g(str);
        return FirebaseAuth.getInstance(n0()).o0(this, str);
    }

    public Task g() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(n0());
        AbstractC3191o.m(this);
        return firebaseAuth.f37561e.zza(this, new k0(firebaseAuth, this));
    }

    public Task g0(String str) {
        AbstractC3191o.g(str);
        return FirebaseAuth.getInstance(n0()).u0(this, str);
    }

    @Override // kb.H
    public abstract String getDisplayName();

    @Override // kb.H
    public abstract String getEmail();

    @Override // kb.H
    public abstract Uri getPhotoUrl();

    public Task h(boolean z10) {
        return FirebaseAuth.getInstance(n0()).V(this, z10);
    }

    public Task h0(String str) {
        AbstractC3191o.g(str);
        return FirebaseAuth.getInstance(n0()).x0(this, str);
    }

    public abstract FirebaseUserMetadata i();

    public Task i0(PhoneAuthCredential phoneAuthCredential) {
        return FirebaseAuth.getInstance(n0()).Q(this, phoneAuthCredential);
    }

    public abstract AbstractC5238x j();

    public Task j0(UserProfileChangeRequest userProfileChangeRequest) {
        AbstractC3191o.m(userProfileChangeRequest);
        return FirebaseAuth.getInstance(n0()).R(this, userProfileChangeRequest);
    }

    public abstract List k();

    public Task k0(String str) {
        return l0(str, null);
    }

    public abstract String l();

    public Task l0(String str, ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(n0()).V(this, false).continueWithTask(new P(this, str, actionCodeSettings));
    }

    public abstract boolean m();

    public abstract FirebaseUser m0(List list);

    @Override // kb.H
    public abstract String n();

    public abstract C4196f n0();

    public abstract void o0(zzahv zzahvVar);

    public abstract FirebaseUser p0();

    public abstract void q0(List list);

    public abstract zzahv r0();

    public abstract void s0(List list);

    public abstract List t0();

    public abstract String zzd();

    public abstract String zze();

    public abstract List zzg();
}
