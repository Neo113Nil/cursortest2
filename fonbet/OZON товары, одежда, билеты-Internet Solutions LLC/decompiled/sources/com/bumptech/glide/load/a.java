package com.bumptech.glide.load;

import c6.y;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ParcelFileDescriptorRewinder f57614a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W5.b f57615b;

    a(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, W5.b bVar) {
        this.f57614a = parcelFileDescriptorRewinder;
        this.f57615b = bVar;
    }

    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f57614a;
        y yVar = null;
        try {
            y yVar2 = new y(new FileInputStream(parcelFileDescriptorRewinder.b().getFileDescriptor()), this.f57615b);
            try {
                ImageHeaderParser.ImageType b11 = imageHeaderParser.b(yVar2);
                yVar2.release();
                parcelFileDescriptorRewinder.b();
                return b11;
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
