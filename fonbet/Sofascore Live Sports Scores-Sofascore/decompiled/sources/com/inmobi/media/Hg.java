package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.asf;
import defpackage.y99;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Hg extends AbstractC3899y2 {
    public final Window b;
    public final AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hg(Window window, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        window.getClass();
        adQualityConfig.getClass();
        this.b = window;
        this.c = new AtomicBoolean(false);
    }

    public static final void a(asf asfVar, Hg hg, int i) {
        if (i == 0) {
            asfVar.a = true;
        }
        boolean z = asfVar.a;
        hg.c.set(true);
    }

    @Override // com.inmobi.media.N0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        int width = this.b.getDecorView().getWidth();
        int height = this.b.getDecorView().getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Rect rect = new Rect(0, 0, width, height);
        asf asfVar = new asf();
        int layerType = this.b.getDecorView().getLayerType();
        this.b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.b, rect, createBitmap, new y99(0, asfVar, this), new Handler(Looper.getMainLooper()));
        while (!this.c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.b.getDecorView().setLayerType(layerType, null);
        if (asfVar.a) {
            return a(createBitmap);
        }
        return null;
    }
}
