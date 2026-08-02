package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3899y2 implements N0 {
    public final AdConfig.AdQualityConfig a;

    public AbstractC3899y2(AdConfig.AdQualityConfig adQualityConfig) {
        adQualityConfig.getClass();
        this.a = adQualityConfig;
    }

    public final Bitmap a(Bitmap bitmap) {
        bitmap.getClass();
        double resizedPercentage = (this.a.getResizedPercentage() / 100.0d) * bitmap.getWidth();
        double resizedPercentage2 = (this.a.getResizedPercentage() / 100.0d) * bitmap.getHeight();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        createScaledBitmap.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.a.getMaxImageSize()) {
            return createScaledBitmap;
        }
        while (length > this.a.getMaxImageSize()) {
            double sqrt = Math.sqrt(this.a.getMaxImageSize() / length);
            resizedPercentage *= sqrt;
            resizedPercentage2 *= sqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return createScaledBitmap;
            }
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            createScaledBitmap.getClass();
            byteArrayOutputStream.reset();
            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            length = byteArrayOutputStream.toByteArray().length;
        }
        byteArrayOutputStream.size();
        return createScaledBitmap;
    }
}
