package com.google.android.gms.internal.auth;

import android.net.Uri;
import defpackage.dh0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcr {
    public static final dh0 a = new dh0(0);

    public static synchronized Uri a() {
        synchronized (zzcr.class) {
            dh0 dh0Var = a;
            Uri uri = (Uri) dh0Var.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            dh0Var.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
