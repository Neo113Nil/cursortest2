package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public final class E implements com.bumptech.glide.load.l {

    /* renamed from: a, reason: collision with root package name */
    public final u f29991a;

    public E(u uVar) {
        this.f29991a = uVar;
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return this.f29991a.d(parcelFileDescriptor, i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, com.bumptech.glide.load.j jVar) {
        return e(parcelFileDescriptor) && this.f29991a.o(parcelFileDescriptor);
    }

    public final boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }
}
