package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import eb.C4196f;
import java.util.Objects;
import lb.K;
import lb.c0;
import lb.m0;

/* loaded from: classes3.dex */
public final class b extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f37636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f37637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmailAuthCredential f37638c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37639d;

    public b(FirebaseAuth firebaseAuth, boolean z10, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.f37636a = z10;
        this.f37637b = firebaseUser;
        this.f37638c = emailAuthCredential;
        Objects.requireNonNull(firebaseAuth);
        this.f37639d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    @Override // lb.K
    public final Task c(String str) {
        C4196f c4196f;
        C4196f c4196f2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (this.f37636a) {
            FirebaseAuth firebaseAuth = this.f37639d;
            zzacq zzacqVar = firebaseAuth.f37561e;
            c4196f2 = firebaseAuth.f37557a;
            return zzacqVar.zzb(c4196f2, (FirebaseUser) AbstractC3191o.m(this.f37637b), this.f37638c, str, (c0) new FirebaseAuth.d(this.f37639d));
        }
        FirebaseAuth firebaseAuth2 = this.f37639d;
        zzacq zzacqVar2 = firebaseAuth2.f37561e;
        c4196f = firebaseAuth2.f37557a;
        return zzacqVar2.zza(c4196f, this.f37638c, str, (m0) new FirebaseAuth.c(this.f37639d));
    }
}
