package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.h2;
import com.applovin.impl.k5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* loaded from: classes4.dex */
public class a extends k5 {
    private final AppLovinNativeAdImpl g;
    private final InterfaceC0110a h;
    private final String i;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0110a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, l lVar, InterfaceC0110a interfaceC0110a) {
        super("TaskCacheNativeAd", lVar);
        this.i = UUID.randomUUID().toString();
        this.g = appLovinNativeAdImpl;
        this.h = interfaceC0110a;
    }

    private float a(Uri uri) {
        FileInputStream fileInputStream;
        int i;
        int i2;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i = options.outWidth;
                i2 = options.outHeight;
            } finally {
            }
        } catch (IOException e) {
            if (p.a()) {
                this.c.a(this.b, "Failed to calculate aspect ratio", e);
            }
        }
        if (i <= 0 || i2 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f = i / i2;
        fileInputStream.close();
        return f;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (p.a()) {
            this.c.a(this.b, "Attempting to cache resource: " + uri);
        }
        String a = this.a.I().a(a(), uri.toString(), this.g.getCachePrefix(), Collections.emptyList(), false, false, 1, this.i, h2.a(this.g));
        if (TextUtils.isEmpty(a)) {
            if (p.a()) {
                this.c.b(this.b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File a2 = this.a.I().a(a, a());
        if (a2 == null) {
            if (p.a()) {
                this.c.b(this.b, "Unable to retrieve File from cached image filename = " + a);
            }
            return null;
        }
        Uri fromFile = Uri.fromFile(a2);
        if (fromFile != null) {
            return fromFile;
        }
        if (p.a()) {
            this.c.b(this.b, "Unable to extract Uri from image file");
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (p.a()) {
            this.c.a(this.b, "Begin caching ad #" + this.g.getAdIdNumber() + "...");
        }
        Uri b = b(this.g.getIconUri());
        if (b != null) {
            this.g.setIconUri(b);
        }
        Uri b2 = b(this.g.getMainImageUri());
        if (b2 != null) {
            this.g.setMainImageUri(b2);
            float a = a(b2);
            if (a > 0.0f) {
                this.g.setMainImageAspectRatio(a);
            }
        }
        Uri b3 = b(this.g.getPrivacyIconUri());
        if (b3 != null) {
            this.g.setPrivacyIconUri(b3);
        }
        if (p.a()) {
            this.c.a(this.b, "Finished caching ad #" + this.g.getAdIdNumber());
        }
        this.h.a(this.g);
    }
}
