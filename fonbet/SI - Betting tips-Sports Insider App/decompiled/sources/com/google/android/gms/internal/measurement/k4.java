package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.e f5109a = new s.e(0);

    public static synchronized Uri a() {
        synchronized (k4.class) {
            s.e eVar = f5109a;
            Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            eVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
