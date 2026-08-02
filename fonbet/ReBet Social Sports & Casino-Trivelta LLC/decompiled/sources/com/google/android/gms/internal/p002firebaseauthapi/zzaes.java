package com.google.android.gms.internal.p002firebaseauthapi;

import G9.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import wb.InterfaceC6736b;

/* loaded from: classes2.dex */
public interface zzaes {
    public static final a zza = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, InterfaceC6736b interfaceC6736b);

    void zza(String str, Status status);
}
