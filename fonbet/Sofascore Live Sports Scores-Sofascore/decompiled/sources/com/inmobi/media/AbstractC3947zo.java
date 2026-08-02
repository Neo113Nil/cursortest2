package com.inmobi.media;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.zo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3947zo {
    public static final FrameLayout a(Context context, byte[] bArr, float f) {
        context.getClass();
        bArr.getClass();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(bitmapDrawable);
        frameLayout.setElevation(Float.MAX_VALUE);
        frameLayout.setAlpha(f);
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        return frameLayout;
    }
}
