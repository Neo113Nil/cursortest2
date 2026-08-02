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

/* loaded from: classes3.dex */
public final class m extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f37715c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f37717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37718f;

    public m(FirebaseAuth firebaseAuth, String str, boolean z10, FirebaseUser firebaseUser, String str2, String str3) {
        this.f37713a = str;
        this.f37714b = z10;
        this.f37715c = firebaseUser;
        this.f37716d = str2;
        this.f37717e = str3;
        Objects.requireNonNull(firebaseAuth);
        this.f37718f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$d, lb.c0] */
    @Override // lb.K
    public final Task c(String str) {
        C4196f c4196f;
        C4196f c4196f2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Logging in as " + this.f37713a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + this.f37713a);
        }
        if (this.f37714b) {
            FirebaseAuth firebaseAuth = this.f37718f;
            zzacq zzacqVar = firebaseAuth.f37561e;
            c4196f2 = firebaseAuth.f37557a;
            return zzacqVar.zzb(c4196f2, (FirebaseUser) AbstractC3191o.m(this.f37715c), this.f37713a, this.f37716d, this.f37717e, str, new FirebaseAuth.d(this.f37718f));
        }
        FirebaseAuth firebaseAuth2 = this.f37718f;
        zzacq zzacqVar2 = firebaseAuth2.f37561e;
        c4196f = firebaseAuth2.f37557a;
        return zzacqVar2.zzb(c4196f, this.f37713a, this.f37716d, this.f37717e, str, new FirebaseAuth.c(this.f37718f));
    }
}
