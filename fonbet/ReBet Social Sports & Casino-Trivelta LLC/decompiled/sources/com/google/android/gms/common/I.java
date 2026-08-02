package com.google.android.gms.common;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public String f32242a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f32243b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f32244c = null;

    public /* synthetic */ I(byte[] bArr) {
    }

    public final I a(String str) {
        this.f32242a = str;
        return this;
    }

    public final I b(boolean z10) {
        this.f32243b = Boolean.valueOf(z10);
        return this;
    }

    public final I c(boolean z10) {
        this.f32244c = Boolean.valueOf(z10);
        return this;
    }

    public final J d() {
        Boolean bool = this.f32243b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f32244c != null) {
            return new J(this.f32242a, bool.booleanValue(), false, false, this.f32244c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
