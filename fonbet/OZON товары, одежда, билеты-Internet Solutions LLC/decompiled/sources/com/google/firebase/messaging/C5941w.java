package com.google.firebase.messaging;

import C2.ExecutorC2715j;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import w8.i;
import y8.InterfaceC10861a;
import z8.InterfaceC10999b;

/* renamed from: com.google.firebase.messaging.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5941w {

    /* renamed from: a, reason: collision with root package name */
    private final k8.e f59743a;

    /* renamed from: b, reason: collision with root package name */
    private final C5944z f59744b;

    /* renamed from: c, reason: collision with root package name */
    private final Rpc f59745c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10861a<H8.h> f59746d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10861a<w8.i> f59747e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC10999b f59748f;

    C5941w(k8.e eVar, C5944z c5944z, InterfaceC10861a<H8.h> interfaceC10861a, InterfaceC10861a<w8.i> interfaceC10861a2, InterfaceC10999b interfaceC10999b) {
        Rpc rpc = new Rpc(eVar.i());
        this.f59743a = eVar;
        this.f59744b = c5944z;
        this.f59745c = rpc;
        this.f59746d = interfaceC10861a;
        this.f59747e = interfaceC10861a2;
        this.f59748f = interfaceC10999b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        String str3;
        w8.i iVar;
        i.a b11;
        InterfaceC10999b interfaceC10999b = this.f59748f;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        k8.e eVar = this.f59743a;
        bundle.putString("gmp_app_id", eVar.l().c());
        C5944z c5944z = this.f59744b;
        bundle.putString("gmsv", Integer.toString(c5944z.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", c5944z.a());
        bundle.putString("app_ver_name", c5944z.b());
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(eVar.k().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String a11 = ((com.google.firebase.installations.f) Tasks.await(interfaceC10999b.a())).a();
            if (TextUtils.isEmpty(a11)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", a11);
            }
        } catch (InterruptedException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(interfaceC10999b.getId()));
            bundle.putString("cliv", "fcm-24.1.1");
            iVar = this.f59747e.get();
            H8.h hVar = this.f59746d.get();
            if (iVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e12) {
            e = e12;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(interfaceC10999b.getId()));
            bundle.putString("cliv", "fcm-24.1.1");
            iVar = this.f59747e.get();
            H8.h hVar2 = this.f59746d.get();
            if (iVar == null) {
            }
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(interfaceC10999b.getId()));
        bundle.putString("cliv", "fcm-24.1.1");
        iVar = this.f59747e.get();
        H8.h hVar22 = this.f59746d.get();
        if (iVar == null || hVar22 == null || (b11 = iVar.b()) == i.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b11.a()));
        bundle.putString("Firebase-Client", hVar22.getUserAgent());
    }

    private Task<Bundle> e(String str, String str2, Bundle bundle) {
        try {
            c(str, str2, bundle);
            return this.f59745c.send(bundle);
        } catch (InterruptedException | ExecutionException e11) {
            return Tasks.forException(e11);
        }
    }

    final Task<CloudMessage> a() {
        return this.f59745c.getProxiedNotificationData();
    }

    final Task<String> b() {
        return e(C5944z.c(this.f59743a), "*", new Bundle()).continueWith(new ExecutorC2715j(), new C5940v(this));
    }

    final Task<Void> d(boolean z11) {
        return this.f59745c.setRetainProxiedNotifications(z11);
    }

    final Task<?> f(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return e(str, "/topics/" + str2, bundle).continueWith(new ExecutorC2715j(), new C5940v(this));
    }

    final Task<?> g(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return e(str, "/topics/" + str2, bundle).continueWith(new ExecutorC2715j(), new C5940v(this));
    }
}
