package com.google.firebase.auth;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class PhoneAuthProvider {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f37593a;

    public static class ForceResendingToken extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<ForceResendingToken> CREATOR = new c();

        public static ForceResendingToken g() {
            return new ForceResendingToken();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            E9.b.b(parcel, E9.b.a(parcel));
        }
    }

    public static abstract class a {
        private static final G9.a zza = new G9.a("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public abstract void onCodeSent(String str, ForceResendingToken forceResendingToken);

        public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

        public abstract void onVerificationFailed(eb.k kVar);
    }

    public PhoneAuthProvider(FirebaseAuth firebaseAuth) {
        this.f37593a = firebaseAuth;
    }

    public static PhoneAuthCredential a(String str, String str2) {
        return PhoneAuthCredential.k(str, str2);
    }

    public static PhoneAuthProvider b(FirebaseAuth firebaseAuth) {
        return new PhoneAuthProvider(firebaseAuth);
    }

    public static void c(com.google.firebase.auth.a aVar) {
        AbstractC3191o.m(aVar);
        FirebaseAuth.j0(aVar);
    }

    public void d(String str, long j10, TimeUnit timeUnit, Activity activity, a aVar) {
        c(com.google.firebase.auth.a.a(this.f37593a).h(str).i(Long.valueOf(j10), timeUnit).c(activity).d(aVar).a());
    }

    public void e(String str, long j10, TimeUnit timeUnit, Activity activity, a aVar, ForceResendingToken forceResendingToken) {
        a.C0523a d10 = com.google.firebase.auth.a.a(this.f37593a).h(str).i(Long.valueOf(j10), timeUnit).c(activity).d(aVar);
        if (forceResendingToken != null) {
            d10.e(forceResendingToken);
        }
        c(d10.a());
    }
}
