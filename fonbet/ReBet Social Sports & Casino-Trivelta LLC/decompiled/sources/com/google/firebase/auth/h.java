package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import eb.C4196f;
import java.util.Objects;
import lb.K;

/* loaded from: classes3.dex */
public final class h extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37653c;

    public h(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f37651a = str;
        this.f37652b = str2;
        Objects.requireNonNull(firebaseAuth);
        this.f37653c = firebaseAuth;
    }

    @Override // lb.K
    public final Task c(String str) {
        C4196f c4196f;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Creating user with " + this.f37651a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + this.f37651a);
        }
        FirebaseAuth firebaseAuth = this.f37653c;
        zzacq zzacqVar = firebaseAuth.f37561e;
        c4196f = firebaseAuth.f37557a;
        String str3 = this.f37651a;
        String str4 = this.f37652b;
        str2 = this.f37653c.f37567k;
        return zzacqVar.zza(c4196f, str3, str4, str2, str, new FirebaseAuth.c(this.f37653c));
    }
}
