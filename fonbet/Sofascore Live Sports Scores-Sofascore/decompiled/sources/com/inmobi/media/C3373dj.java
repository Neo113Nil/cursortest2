package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.dj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3373dj extends AbstractC3899y2 {
    public final WeakReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3373dj(View view, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        view.getClass();
        adQualityConfig.getClass();
        this.b = new WeakReference(view);
    }

    @Override // com.inmobi.media.N0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        View view = (View) this.b.get();
        if (view == null) {
            System.currentTimeMillis();
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        if (createBitmap == null) {
            return null;
        }
        System.currentTimeMillis();
        return a(createBitmap);
    }
}
