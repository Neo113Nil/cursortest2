package com.google.firebase.messaging;

import D9.C1134b;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.C4196f;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import ub.j;
import wb.InterfaceC6736b;
import x2.ExecutorC6789k;

/* loaded from: classes3.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    public final C4196f f37848a;

    /* renamed from: b, reason: collision with root package name */
    public final N f37849b;

    /* renamed from: c, reason: collision with root package name */
    public final C1134b f37850c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6736b f37851d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6736b f37852e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.firebase.installations.h f37853f;

    public I(C4196f c4196f, N n10, InterfaceC6736b interfaceC6736b, InterfaceC6736b interfaceC6736b2, com.google.firebase.installations.h hVar) {
        this(c4196f, n10, new C1134b(c4196f.l()), interfaceC6736b, interfaceC6736b2, hVar);
    }

    public static /* synthetic */ String a(I i10, Task task) {
        i10.getClass();
        return i10.h((Bundle) task.getResult(IOException.class));
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public Task c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(l(N.c(this.f37848a), "*", bundle));
    }

    public final Task d(Task task) {
        return task.continueWith(new ExecutorC6789k(), new Continuation() { // from class: com.google.firebase.messaging.H
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return I.a(I.this, task2);
            }
        });
    }

    public final String e() {
        try {
            return b(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(this.f37848a.p().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public Task f() {
        return this.f37850c.a();
    }

    public Task g() {
        return d(l(N.c(this.f37848a), "*", new Bundle()));
    }

    public final String h(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(String str, String str2, Bundle bundle) {
        ub.j jVar;
        j.a b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f37848a.q().c());
        bundle.putString("gmsv", Integer.toString(this.f37849b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f37849b.a());
        bundle.putString("app_ver_name", this.f37849b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String b11 = ((com.google.firebase.installations.m) Tasks.await(this.f37853f.a(false))).b();
            if (TextUtils.isEmpty(b11)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(this.f37853f.getId()));
            bundle.putString("cliv", "fcm-25.0.1");
            jVar = (ub.j) this.f37852e.get();
            Eb.i iVar = (Eb.i) this.f37851d.get();
            if (jVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(this.f37853f.getId()));
            bundle.putString("cliv", "fcm-25.0.1");
            jVar = (ub.j) this.f37852e.get();
            Eb.i iVar2 = (Eb.i) this.f37851d.get();
            if (jVar == null) {
            }
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(this.f37853f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        jVar = (ub.j) this.f37852e.get();
        Eb.i iVar22 = (Eb.i) this.f37851d.get();
        if (jVar == null || iVar22 == null || (b10 = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.b()));
        bundle.putString("Firebase-Client", iVar22.a());
    }

    public Task k(boolean z10) {
        return this.f37850c.d(z10);
    }

    public final Task l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f37850c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    public Task m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(l(str, "/topics/" + str2, bundle));
    }

    public Task n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(l(str, "/topics/" + str2, bundle));
    }

    public I(C4196f c4196f, N n10, C1134b c1134b, InterfaceC6736b interfaceC6736b, InterfaceC6736b interfaceC6736b2, com.google.firebase.installations.h hVar) {
        this.f37848a = c4196f;
        this.f37849b = n10;
        this.f37850c = c1134b;
        this.f37851d = interfaceC6736b;
        this.f37852e = interfaceC6736b2;
        this.f37853f = hVar;
    }
}
