package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzam;
import java.util.Objects;
import lb.C5444x;
import lb.k0;

/* loaded from: classes3.dex */
public final class e implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f37642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37644c;

    public e(FirebaseAuth firebaseAuth, a aVar, String str) {
        this.f37642a = aVar;
        this.f37643b = str;
        Objects.requireNonNull(firebaseAuth);
        this.f37644c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String d10;
        String b10;
        String c10;
        PhoneAuthProvider.a d02;
        String str;
        String str2;
        if (task.isSuccessful()) {
            d10 = ((k0) task.getResult()).d();
            b10 = ((k0) task.getResult()).b();
            c10 = ((k0) task.getResult()).c();
        } else {
            Exception exception = task.getException();
            String str3 = "Error while validating application identity: ";
            if (exception != null) {
                str3 = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str3);
            if (exception != null && C5444x.i(exception)) {
                FirebaseAuth.l0((eb.k) exception, this.f37642a, this.f37643b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            c10 = null;
            d10 = null;
            b10 = null;
        }
        long longValue = this.f37642a.j().longValue();
        d02 = this.f37644c.d0(this.f37642a.k(), this.f37642a.h());
        if (TextUtils.isEmpty(d10)) {
            d02 = this.f37644c.c0(this.f37642a, d02, (k0) task.getResult());
        }
        PhoneAuthProvider.a aVar = d02;
        zzam zzamVar = (zzam) AbstractC3191o.m(this.f37642a.f());
        if (zzac.zzc(c10) && this.f37644c.q0() != null && this.f37644c.q0().d("PHONE_PROVIDER")) {
            c10 = "NO_RECAPTCHA";
        }
        String str4 = c10;
        if (zzamVar.k()) {
            zzacq zzacqVar = this.f37644c.f37561e;
            String str5 = (String) AbstractC3191o.m(this.f37642a.k());
            str2 = this.f37644c.f37565i;
            zzacqVar.zza(zzamVar, str5, str2, longValue, this.f37642a.g() != null, this.f37642a.n(), d10, b10, str4, this.f37644c.F0(), aVar, this.f37642a.l(), this.f37642a.b());
            return;
        }
        zzacq zzacqVar2 = this.f37644c.f37561e;
        PhoneMultiFactorInfo phoneMultiFactorInfo = (PhoneMultiFactorInfo) AbstractC3191o.m(this.f37642a.i());
        str = this.f37644c.f37565i;
        zzacqVar2.zza(zzamVar, phoneMultiFactorInfo, str, longValue, this.f37642a.g() != null, this.f37642a.n(), d10, b10, str4, this.f37644c.F0(), aVar, this.f37642a.l(), this.f37642a.b());
    }
}
