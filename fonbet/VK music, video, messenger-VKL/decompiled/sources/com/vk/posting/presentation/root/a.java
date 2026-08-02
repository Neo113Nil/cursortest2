package com.vk.posting.presentation.root;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.posting.presentation.model.PickerRootParams;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import java.util.HashSet;
import xsna.dhr0;
import xsna.e43;
import xsna.fnj;
import xsna.iah0;
import xsna.ilc0;
import xsna.qz50;

/* compiled from: PostingRouterImpl.kt */
/* loaded from: classes5.dex */
public final class a implements ilc0 {
    public static final int a = iah0.a(32);

    @Override // xsna.ilc0
    public final void a(PickerRootParams pickerRootParams, Activity activity) {
        PickerRootFragment.a aVar = new PickerRootFragment.a(PickerRootFragment.class, null, null);
        aVar.j.putParcelable("params_picker_id", pickerRootParams);
        aVar.s(true);
        TabletDialogActivity.a aVar2 = new TabletDialogActivity.a(0);
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(activity);
        int c = dhr0.t.c(R.attr.vk_ui_background_content);
        Bundle bundle = aVar2.b;
        bundle.putInt("window_background_color", c);
        aVar2.b();
        bundle.putInt("input_mode", 16);
        bundle.putInt("max_width", iah0.a(600.0f));
        bundle.putInt("min_spacing", a);
        bundle.putBoolean("closeOnTouchOutside", true);
        bundle.putBoolean("withoutAdjustResize", true);
        bundle.putFloat("elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (d) {
            Context context = e43.a;
            if (iah0.s(context != null ? context : null)) {
                bundle.putInt("preferred_height", (int) (iah0.f().heightPixels * 0.75d));
            } else {
                bundle.putInt("preferred_height", (int) (iah0.f().heightPixels * 0.9d));
            }
        }
        bundle.putBoolean("repaintStatusBar", false);
        qz50.a(aVar, aVar2);
        aVar.h(activity, 43);
    }
}
