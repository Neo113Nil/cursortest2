package com.facebook.yoga;

/* loaded from: classes2.dex */
public abstract class e extends c {

    /* renamed from: c, reason: collision with root package name */
    public long f31667c;

    public e(long j10) {
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f31667c = j10;
    }

    @Override // com.facebook.yoga.c
    public void a(k kVar) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f31667c, kVar.b());
    }

    @Override // com.facebook.yoga.c
    public void b(float f10) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f31667c, f10);
    }

    public e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
