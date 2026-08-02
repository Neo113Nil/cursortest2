package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements View.OnLayoutChangeListener {
        private int gm;
        private final Drawable pcc;
        private int sf;

        public pcc(Drawable drawable) {
            this.pcc = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.sf && i10 == this.gm) {
                return;
            }
            this.sf = i9;
            this.gm = i10;
            this.pcc.setBounds(0, 0, i9, i10);
        }
    }

    public static void pcc(Activity activity, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (activity == null || ofVar == null || TextUtils.isEmpty(ofVar.atb())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i = nac.sod;
            if (decorView.getTag(i) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i, Integer.valueOf(i));
            Drawable pcc2 = pcc(activity.getResources(), ofVar);
            if (pcc2 == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(pcc2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("add overlay fail", th.getMessage());
        }
    }

    public static void pcc(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (viewGroup == null || ofVar == null || TextUtils.isEmpty(ofVar.atb())) {
            return;
        }
        try {
            int i = nac.sod;
            if (viewGroup.getTag(i) != null) {
                return;
            }
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable pcc2 = pcc(viewGroup.getResources(), ofVar);
            if (pcc2 == null) {
                return;
            }
            viewGroup.setForeground(pcc2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("add overlay fail", th.getMessage());
        }
    }

    @Nullable
    private static Drawable pcc(Resources resources, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        try {
            String atb = ofVar.atb();
            if (TextUtils.isEmpty(atb)) {
                return null;
            }
            byte[] decode = Base64.decode(atb, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
