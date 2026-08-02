package org.chromium.net.impl;

import Ra.g;
import android.net.http.UrlRequest;
import java.nio.ByteBuffer;

/* renamed from: org.chromium.net.impl.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8786z extends org.chromium.net.k {

    /* renamed from: a, reason: collision with root package name */
    private final UrlRequest f78953a;

    /* renamed from: b, reason: collision with root package name */
    private final C8774m f78954b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f78955c;

    C8786z(UrlRequest urlRequest, C8774m c8774m, String str, g.d dVar) {
        this.f78953a = urlRequest;
        this.f78954b = c8774m;
        this.f78955c = dVar == null ? null : new g0(dVar);
    }

    @Override // org.chromium.net.C
    public final void a() {
        this.f78953a.cancel();
    }

    @Override // org.chromium.net.C
    public final void b() {
        this.f78953a.followRedirect();
    }

    @Override // org.chromium.net.C
    public final boolean c() {
        boolean isDone;
        isDone = this.f78953a.isDone();
        return isDone;
    }

    @Override // org.chromium.net.C
    public final void d(ByteBuffer byteBuffer) {
        this.f78953a.read(byteBuffer);
    }

    @Override // org.chromium.net.C
    public final void e() {
        this.f78953a.start();
    }

    final void f(int i11, A a11, org.chromium.net.f fVar) {
        this.f78954b.d(new C8779s(new L(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, -1L, -1L), i11, a11, fVar), this.f78955c);
    }
}
