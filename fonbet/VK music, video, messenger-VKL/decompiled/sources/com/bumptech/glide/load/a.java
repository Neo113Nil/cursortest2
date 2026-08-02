package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import xsna.cl3;
import xsna.du8;
import xsna.rif0;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes12.dex */
public final class a {
    public static int a(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull cl3 cl3Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new rif0(inputStream, cl3Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int a = list.get(i).a(inputStream, cl3Var);
                if (a != -1) {
                    return a;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull cl3 cl3Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new rif0(inputStream, cl3Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType d = list.get(i).d(inputStream);
                inputStream.reset();
                if (d != ImageHeaderParser.ImageType.UNKNOWN) {
                    return d;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageHeaderParser.ImageType c(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType c = list.get(i).c(byteBuffer);
                du8.c(byteBuffer);
                if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c;
                }
            } catch (Throwable th) {
                du8.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
