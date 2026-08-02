package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.mediastore.system.MediaStoreEntry;
import java.lang.reflect.Field;
import xsna.f5h0;
import xsna.mcr0;
import xsna.ojt;
import xsna.owj;

/* loaded from: classes15.dex */
public class LocalImageView extends VKImageView {
    public final ColorDrawable m;
    public final owj n;
    public MediaStoreEntry o;

    public LocalImageView(Context context) {
        super(context);
        this.m = new ColorDrawable(-986638);
        this.n = new owj();
    }

    public static RectF T0(int i, int i2, int i3, int i4) {
        float f = i3;
        float f2 = i;
        float f3 = f / f2;
        float f4 = i4;
        float f5 = i2;
        float f6 = f4 / f5;
        RectF rectF = new RectF();
        if (Math.abs(f3 - f6) <= 1.0E-5f) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f5);
            return rectF;
        }
        float f7 = f / f6;
        if (f7 > f2) {
            int i5 = (int) f7;
            rectF.set((-(i5 - i)) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i5 + i) / 2, f5);
            return rectF;
        }
        int i6 = (int) (f4 / f3);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(i6 - i2)) / 2, f2, (i6 + i2) / 2);
        return rectF;
    }

    @Override // com.vk.imageloader.view.VKImageView
    public void K0(ojt ojtVar) {
        ojtVar.d = this.m;
        ojtVar.l = f5h0.i.a;
        ojtVar.h = this.n;
    }

    public void U0(MediaStoreEntry mediaStoreEntry, ImageScreenSize imageScreenSize) {
        if (mediaStoreEntry == null) {
            return;
        }
        this.o = mediaStoreEntry;
        L0(mediaStoreEntry.f(), imageScreenSize);
    }

    public void W0(MediaStoreEntry mediaStoreEntry) {
        Field field = mcr0.a;
        U0(mediaStoreEntry, ImageScreenSize.SMALL);
    }

    public MediaStoreEntry getEntry() {
        return this.o;
    }

    public LocalImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new ColorDrawable(-986638);
        this.n = new owj();
    }

    public LocalImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.m = new ColorDrawable(-986638);
        this.n = new owj();
    }
}
