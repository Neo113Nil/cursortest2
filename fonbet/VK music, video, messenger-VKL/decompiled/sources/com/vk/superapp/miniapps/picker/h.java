package com.vk.superapp.miniapps.picker;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.m360;

/* compiled from: OnboardingBannerViewHolder.kt */
/* loaded from: classes6.dex */
public final class h extends RecyclerView.e0 {
    public final k l;
    public final View m;
    public final ImageView n;
    public final TextView o;
    public final TextView p;

    public h(View view, b bVar) {
        super(view);
        this.l = bVar;
        View findViewById = view.findViewById(R.id.banner_dismiss_button);
        this.m = findViewById;
        this.n = (ImageView) view.findViewById(R.id.banner_image);
        this.o = (TextView) view.findViewById(R.id.banner_title);
        this.p = (TextView) view.findViewById(R.id.banner_subtitle);
        bwt0.i0(findViewById, new m360(this, 4));
    }
}
