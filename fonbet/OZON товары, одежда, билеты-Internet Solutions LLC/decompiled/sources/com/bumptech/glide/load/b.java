package com.bumptech.glide.load;

import c6.y;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ParcelFileDescriptorRewinder f57616a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W5.b f57617b;

    b(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, W5.b bVar) {
        this.f57616a = parcelFileDescriptorRewinder;
        this.f57617b = bVar;
    }

    public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
        W5.b bVar = this.f57617b;
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f57616a;
        y yVar = null;
        try {
            y yVar2 = new y(new FileInputStream(parcelFileDescriptorRewinder.b().getFileDescriptor()), bVar);
            try {
                int d11 = imageHeaderParser.d(yVar2, bVar);
                yVar2.release();
                parcelFileDescriptorRewinder.b();
                return d11;
            } catch (Throwable th2) {
                th = th2;
                yVar = yVar2;
                if (yVar != null) {
                    yVar.release();
                }
                parcelFileDescriptorRewinder.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
