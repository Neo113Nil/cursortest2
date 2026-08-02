package com.yandex.mapkit.places.panorama.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes9.dex */
class ImageResourcesProvider extends ImageProvider {
    private final Bitmap bitmap;

    /* renamed from: id, reason: collision with root package name */
    private final String f60734id;

    public ImageResourcesProvider(String str) {
        this.f60734id = str;
        Context applicationContext = Runtime.getApplicationContext();
        this.bitmap = BitmapFactory.decodeResource(applicationContext.getResources(), applicationContext.getResources().getIdentifier(str, "drawable", applicationContext.getPackageName()));
    }

    public static boolean isImageResourceAvailable(String str) {
        Context applicationContext = Runtime.getApplicationContext();
        return applicationContext.getResources().getIdentifier(str, "drawable", applicationContext.getPackageName()) != 0;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public String getId() {
        return this.f60734id;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public Bitmap getImage() {
        return this.bitmap;
    }
}
