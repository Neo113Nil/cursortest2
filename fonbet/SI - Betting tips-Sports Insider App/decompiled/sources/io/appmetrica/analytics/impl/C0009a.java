package io.appmetrica.analytics.impl;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13322a;

    public C0009a(Context context) {
        this.f13322a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC0184gj.a(new StringBuilder(this.f13322a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC0184gj.a(this.f13322a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
