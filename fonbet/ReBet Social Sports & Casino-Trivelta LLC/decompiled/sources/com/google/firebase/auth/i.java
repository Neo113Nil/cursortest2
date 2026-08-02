package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import eb.C4196f;
import java.util.Objects;
import lb.K;
import lb.c0;

/* loaded from: classes3.dex */
public final class i extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f37654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmailAuthCredential f37655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37656c;

    public i(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.f37654a = firebaseUser;
        this.f37655b = emailAuthCredential;
        Objects.requireNonNull(firebaseAuth);
        this.f37656c = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    @Override // lb.K
    public final Task c(String str) {
        C4196f c4196f;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        FirebaseAuth firebaseAuth = this.f37656c;
        zzacq zzacqVar = firebaseAuth.f37561e;
        c4196f = firebaseAuth.f37557a;
        return zzacqVar.zza(c4196f, this.f37654a, (AuthCredential) this.f37655b, str, (c0) new FirebaseAuth.d(this.f37656c));
    }
}
