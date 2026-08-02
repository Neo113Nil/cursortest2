package com.vk.auth.ui.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.mgq0;
import xsna.ngq0;

/* compiled from: UserCarouselView.kt */
/* loaded from: classes15.dex */
public final class UserCarouselView extends RecyclerView {
    public static final /* synthetic */ int d = 0;
    public mgq0 b;
    public ngq0 c;

    public UserCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.vk_auth_user_carousel_view, this);
    }

    public final void setConfiguring(boolean z) {
        mgq0 mgq0Var = this.b;
        if (mgq0Var == null) {
            mgq0Var = null;
        }
        mgq0Var.i = z;
        mgq0Var.notifyDataSetChanged();
    }
}
