package ru.ozon.app.android.travel.utils.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"decodeBitmap", "Landroid/graphics/Bitmap;", "schemeImage", "", "reqImageHeight", "", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DecodeBitmapUtilKt {
    @NotNull
    public static final Bitmap decodeBitmap(@NotNull String schemeImage, int i11) {
        Intrinsics.checkNotNullParameter(schemeImage, "schemeImage");
        byte[] decode = Base64.decode(schemeImage, 0);
        Intrinsics.f(decode);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decode);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(byteArrayInputStream, null, options);
            options.inSampleSize = Math.max(options.outHeight / i11, 1);
            options.inJustDecodeBounds = false;
            Unit unit = Unit.f71690a;
            byteArrayInputStream.close();
            byteArrayInputStream = new ByteArrayInputStream(decode);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream, null, options);
                byteArrayInputStream.close();
                if (decodeStream != null) {
                    return decodeStream;
                }
                throw new IllegalStateException("Can't decode bitmap.");
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
