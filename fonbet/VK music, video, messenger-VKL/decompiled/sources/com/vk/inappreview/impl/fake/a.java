package com.vk.inappreview.impl.fake;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.c;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.R;
import xsna.bym;
import xsna.pjq;
import xsna.yn3;
import xsna.zqf;

/* compiled from: FakeIARDialog.kt */
/* loaded from: classes2.dex */
public final class a extends c {
    public Drawable B;
    public int y;
    public final zqf z = new zqf(this, 20);
    public CharSequence A = "";

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            this.A = applicationInfo.loadLabel(packageManager);
            this.B = applicationInfo.loadIcon(packageManager);
        } catch (Throwable unused) {
            this.A = context.getString(R.string.iar_app_name);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.iar_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        final View findViewById = view.findViewById(R.id.iar_rate_layout);
        final View findViewById2 = view.findViewById(R.id.iar_thank_layout);
        Button button = (Button) view.findViewById(R.id.cancel_button);
        button.setOnClickListener(new yn3(this, 10));
        Button button2 = (Button) view.findViewById(R.id.send_button);
        button2.setOnClickListener(new View.OnClickListener() { // from class: xsna.ojq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                String h = DevNullEventKey.FAKE_IAR.h();
                com.vk.inappreview.impl.fake.a aVar = com.vk.inappreview.impl.fake.a.this;
                int i = aVar.y;
                Bundle arguments = aVar.getArguments();
                if (arguments == null || (str = arguments.getString("condition_key")) == null) {
                    str = DeviceInfo.STR_TYPE_UNKNOWN;
                }
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, null, str, Integer.valueOf(i), (String) com.vk.core.apps.a.c.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -30, 3, null);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
                aVar.An(true);
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                view.postDelayed(new mf3(aVar.z, 6), 3000L);
            }
        });
        ((Button) view.findViewById(R.id.close_button)).setOnClickListener(new bym(1, this, view));
        ((RatingBar) view.findViewById(R.id.rating_bar)).setOnSelectListener(new pjq(this, button, button2));
        ((TextView) view.findViewById(R.id.app_title)).setText(this.A);
        Drawable drawable = this.B;
        if (drawable != null) {
            ((ImageView) view.findViewById(R.id.app_icon_medium)).setImageDrawable(drawable);
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.IarDialogStyle;
    }
}
