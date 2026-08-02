package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l0;
import com.sofascore.results.R;
import defpackage.ct8;
import defpackage.z88;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ct8 {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                z88 z88Var = (z88) obj2;
                z88 z88Var2 = (z88) obj3;
                context.getClass();
                z88Var.getClass();
                z88Var2.getClass();
                int a = (1728 & 8) != 0 ? com.facebook.appevents.g.a(context) : -1;
                int i = (1728 & 16) != 0 ? R.drawable.ic_round_volume_off_24 : R.drawable.moloco_twotone_volume_off_24;
                int i2 = (1728 & 32) != 0 ? R.drawable.ic_round_volume_up_24 : R.drawable.moloco_twotone_volume_up_24;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.moloco_mute_button_size);
                return new e0(context, z88Var, z88Var2, a, i, i2, dimensionPixelSize, dimensionPixelSize, 8388659, context.getResources().getDimensionPixelSize(R.dimen.moloco_default_ad_button_padding), context.getColor(R.color.moloco_button_background));
            case 1:
                Context context2 = (Context) obj;
                z88 z88Var3 = (z88) obj2;
                z88 z88Var4 = (z88) obj3;
                context2.getClass();
                z88Var3.getClass();
                z88Var4.getClass();
                return new l0(context2, z88Var3, z88Var4, context2.getString(R.string.moloco_playback_control_icon_content_description), context2.getString(R.string.moloco_playback_control_parent_content_description));
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                str.getClass();
                str3.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                String concat = "https://play.google.com/d?id=".concat(str);
                if (str2 != null) {
                    concat = concat + "&referrer=" + str2;
                }
                Uri parse = Uri.parse(concat);
                parse.getClass();
                intent.setData(parse);
                intent.putExtra("overlay", true);
                intent.putExtra("callerId", str3);
                return intent;
        }
    }
}
