package io.seon.androidsdk.service;

import android.content.Context;
import android.util.Log;

/* renamed from: io.seon.androidsdk.service.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4902d {

    /* renamed from: a, reason: collision with root package name */
    public Context f53264a;

    /* renamed from: c, reason: collision with root package name */
    public String f53266c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f53267d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f53268e = 3000;

    /* renamed from: b, reason: collision with root package name */
    public Jh.a f53265b = new Jh.b().a();

    public InterfaceC4894c a() {
        String str;
        if (this.f53264a == null || (str = this.f53266c) == null || str.isEmpty()) {
            Log.e("SEON", "Seon object should be configured first with a context and a session_id!");
        }
        return new C4942i(this.f53264a, this.f53266c, this.f53267d, this.f53268e, this.f53265b);
    }

    public C4902d b(Context context) {
        this.f53264a = context;
        return this;
    }

    public C4902d c(int i10) {
        this.f53268e = i10;
        return this;
    }

    public C4902d d(String str) {
        this.f53266c = str;
        return this;
    }
}
