package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.ie4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements ie4 {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor b() {
        return this.a.rewind();
    }

    @Override // defpackage.ie4
    public final Object e() {
        return this.a.rewind();
    }

    @Override // defpackage.ie4
    public final void a() {
    }
}
