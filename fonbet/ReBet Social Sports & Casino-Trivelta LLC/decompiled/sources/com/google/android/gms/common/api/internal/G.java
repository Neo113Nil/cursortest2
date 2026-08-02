package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public abstract class G extends com.google.android.gms.common.api.f {

    /* renamed from: b, reason: collision with root package name */
    public final String f32356b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public G(String str) {
    }

    @Override // com.google.android.gms.common.api.f
    public final void d() {
        throw new UnsupportedOperationException(this.f32356b);
    }

    @Override // com.google.android.gms.common.api.f
    public final void e() {
        throw new UnsupportedOperationException(this.f32356b);
    }

    @Override // com.google.android.gms.common.api.f
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f32356b);
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean m() {
        throw new UnsupportedOperationException(this.f32356b);
    }

    @Override // com.google.android.gms.common.api.f
    public final void p(f.c cVar) {
        throw new UnsupportedOperationException(this.f32356b);
    }

    @Override // com.google.android.gms.common.api.f
    public final void q(f.c cVar) {
        throw new UnsupportedOperationException(this.f32356b);
    }
}
