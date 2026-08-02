package io.seon.androidsdk.service;

import android.content.Context;

/* loaded from: classes3.dex */
class JNIHandler {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f53004a = false;

    public static void a(Context context) {
        if (f53004a) {
            return;
        }
        C8.c.a(context, "seon");
        f53004a = true;
    }

    public native byte[] encrypt(Object obj, byte[] bArr, int i10, byte[] bArr2, int i11);

    public native String getDevUrl(Object obj);

    public native String getProdUrl(Object obj);
}
