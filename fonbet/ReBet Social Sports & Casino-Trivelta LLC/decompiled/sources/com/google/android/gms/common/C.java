package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class C extends z {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakReference f32214c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f32215b;

    public C(byte[] bArr) {
        super(bArr);
        this.f32215b = f32214c;
    }

    @Override // com.google.android.gms.common.z
    public final byte[] g() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f32215b.get();
                if (bArr == null) {
                    bArr = i0();
                    this.f32215b = new WeakReference(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public abstract byte[] i0();
}
