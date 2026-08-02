package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Di implements InterfaceC0039b3 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f12148a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC0039b3 f12149b;

    public Di(@NonNull Object obj, @NonNull InterfaceC0039b3 interfaceC0039b3) {
        this.f12148a = obj;
        this.f12149b = interfaceC0039b3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0039b3
    public final int getBytesTruncated() {
        return this.f12149b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.f12148a + ", metaInfo=" + this.f12149b + '}';
    }
}
