package io.seon.androidsdk.service;

import android.content.Context;

/* loaded from: classes3.dex */
public final class P6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f53106a;

    /* renamed from: b, reason: collision with root package name */
    public final JNIHandler f53107b = new JNIHandler();

    public P6(Context context) {
        this.f53106a = context;
        if (context != null) {
            JNIHandler.a(context);
        }
    }
}
