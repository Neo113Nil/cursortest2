package com.vungle.ads.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a0 extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        byte[] decode = Base64.decode(str, 0);
        decode.getClass();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        decodeByteArray.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, decodeByteArray);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
