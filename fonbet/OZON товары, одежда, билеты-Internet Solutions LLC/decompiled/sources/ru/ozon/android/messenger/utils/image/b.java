package ru.ozon.android.messenger.utils.image;

import K1.G;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f91960a;

    public b(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f91960a = appContext;
    }

    private static int b(BitmapFactory.Options options, int i11, int i12) {
        Pair pair = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        int i13 = 1;
        if (intValue <= i12 && intValue2 <= i11) {
            return 1;
        }
        int i14 = intValue / 2;
        int i15 = intValue2 / 2;
        while (i14 / i13 >= i12 && i15 / i13 >= i11) {
            i13 *= 2;
        }
        return i13;
    }

    private final Bitmap c(Uri uri, int i11) {
        ContentResolver contentResolver = this.f91960a.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream == null) {
            throw new IOException(G.b(uri, "Can't open "));
        }
        try {
            BufferedInputStream bufferedInputStream = openInputStream instanceof BufferedInputStream ? (BufferedInputStream) openInputStream : new BufferedInputStream(openInputStream, 8192);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                bufferedInputStream.mark(bufferedInputStream.available());
                BitmapFactory.decodeStream(bufferedInputStream, null, options);
                options.inSampleSize = b(options, i11, i11);
                options.inJustDecodeBounds = false;
                options.inDensity = Math.max(options.outWidth, options.outHeight);
                bufferedInputStream.reset();
                Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                if (decodeStream == null) {
                    throw new IllegalStateException("Can't decode bitmap.");
                }
                bufferedInputStream.close();
                openInputStream.close();
                return decodeStream;
            } finally {
            }
        } finally {
        }
    }

    private final float d(Uri uri) {
        ContentResolver contentResolver = this.f91960a.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream == null) {
            throw new IOException(G.b(uri, "Can't open "));
        }
        try {
            int f7 = new androidx.exifinterface.media.a(openInputStream).f(1, "Orientation");
            float f11 = f7 != 3 ? f7 != 6 ? f7 != 8 ? 0.0f : 270.0f : 90.0f : 180.0f;
            openInputStream.close();
            return f11;
        } finally {
        }
    }

    @Override // ru.ozon.android.messenger.utils.image.a
    @NotNull
    public final i<ru.ozon.android.messenger.blocks.input.attachments.data.b> a(@NotNull ru.ozon.android.messenger.blocks.input.attachments.data.b attachmentImageDTO) {
        i<ru.ozon.android.messenger.blocks.input.attachments.data.b> fVar;
        i<ru.ozon.android.messenger.blocks.input.attachments.data.b> bVar;
        Intrinsics.checkNotNullParameter(attachmentImageDTO, "attachmentImageDTO");
        if (Intrinsics.d(attachmentImageDTO.e(), "image/gif")) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(attachmentImageDTO.d().toString());
                if (decodeFile == null) {
                    bVar = new i.a.f("Failed to decode gif", null);
                } else {
                    bVar = new i.b(ru.ozon.android.messenger.blocks.input.attachments.data.b.a(attachmentImageDTO, null, attachmentImageDTO.d(), null, "image/gif", Integer.valueOf(decodeFile.getWidth()), Integer.valueOf(decodeFile.getHeight()), 11));
                }
                return bVar;
            } catch (Throwable th2) {
                Lm0.a.f17149a.e(th2);
                Intrinsics.checkNotNullParameter("Failed to measure gif", "message");
                fVar = new i.a.f("Failed to measure gif", th2);
            }
        } else {
            try {
                Bitmap c11 = c(attachmentImageDTO.d(), (int) 1200.0f);
                float d11 = d(attachmentImageDTO.d());
                if (d11 != 0.0f) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(d11);
                    c11 = Bitmap.createBitmap(c11, 0, 0, c11.getWidth(), c11.getHeight(), matrix, true);
                    Intrinsics.checkNotNullExpressionValue(c11, "createBitmap(...)");
                }
                File createTempFile = File.createTempFile("ozon_tmp_", ".jpeg", this.f91960a.getCacheDir());
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                Intrinsics.f(createTempFile);
                c11.compress(compressFormat, 100, new FileOutputStream(createTempFile));
                fVar = new i.b<>(ru.ozon.android.messenger.blocks.input.attachments.data.b.a(attachmentImageDTO, null, null, createTempFile.getPath(), "image/jpeg", Integer.valueOf(c11.getWidth()), Integer.valueOf(c11.getHeight()), 7));
            } catch (Throwable th3) {
                Lm0.a.f17149a.e(th3);
                Intrinsics.checkNotNullParameter("Failed to resize bitmap", "message");
                fVar = new i.a.f("Failed to resize bitmap", th3);
            }
        }
        return fVar;
    }
}
