package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import c6.y;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p6.C8861a;

/* loaded from: classes.dex */
public final class c {
    public static int a(@NonNull ArrayList arrayList, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull W5.b bVar) throws IOException {
        b bVar2 = new b(parcelFileDescriptorRewinder, bVar);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            int a11 = bVar2.a((ImageHeaderParser) arrayList.get(i11));
            if (a11 != -1) {
                return a11;
            }
        }
        return -1;
    }

    public static int b(@NonNull ArrayList arrayList, InputStream inputStream, @NonNull W5.b bVar) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new y(inputStream, bVar);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    int d11 = ((ImageHeaderParser) arrayList.get(i11)).d(inputStream, bVar);
                    if (d11 != -1) {
                        return d11;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType c(@NonNull ArrayList arrayList, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull W5.b bVar) throws IOException {
        a aVar = new a(parcelFileDescriptorRewinder, bVar);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ImageHeaderParser.ImageType a11 = aVar.a((ImageHeaderParser) arrayList.get(i11));
            if (a11 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a11;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageHeaderParser.ImageType d(@NonNull ArrayList arrayList, InputStream inputStream, @NonNull W5.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                ImageHeaderParser.ImageType b11 = ((ImageHeaderParser) arrayList.get(i11)).b(inputStream);
                inputStream.reset();
                if (b11 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return b11;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageHeaderParser.ImageType e(@NonNull ArrayList arrayList, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                ImageHeaderParser.ImageType c11 = ((ImageHeaderParser) arrayList.get(i11)).c(byteBuffer);
                int i12 = C8861a.f80252b;
                if (c11 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c11;
                }
            } catch (Throwable th2) {
                int i13 = C8861a.f80252b;
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
