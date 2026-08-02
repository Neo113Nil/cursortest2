package com.vk.photos.root.photoflow.presentation.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.bga0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.ee;
import xsna.f4m;
import xsna.fnj;
import xsna.iah0;
import xsna.o010;
import xsna.qcy;
import xsna.yb3;

/* compiled from: PhotoFlowRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class PhotoFlowRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public a O;
    public boolean P;

    /* compiled from: PhotoFlowRecyclerPaginatedView.kt */
    public interface a {
    }

    public PhotoFlowRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, context)));
        setPlaceholdersIcon(context.getResources().getConfiguration());
    }

    private final void setPlaceholdersIcon(Configuration configuration) {
        Context context = getContext();
        HashSet hashSet = iah0.a;
        boolean z = true;
        if (!fnj.d(context) && configuration.orientation != 1) {
            z = false;
        }
        ImageView imageView = (ImageView) this.d.findViewById(R.id.iv_icon);
        if (imageView != null) {
            bwt0.p0(imageView, z);
        }
        ee eeVar = this.c;
        bga0 bga0Var = eeVar instanceof bga0 ? (bga0) eeVar : null;
        if (bga0Var != null) {
            bga0Var.setIconVisible(z);
        }
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView, xsna.too0
    public final void Ng() {
        super.Ng();
        setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, getContext())));
        x(this.d, this.P);
        x(this.c, this.P);
        x(this.b, this.P);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.photo_flow_empty_view, (ViewGroup) this, false);
        bwt0.i0(inflate.findViewById(R.id.tv_add_photo), new o010(this, 28));
        f4m.a(inflate, new yb3(this, (Object) null, inflate, 8));
        return inflate;
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        bga0 bga0Var = new bga0(context, attributeSet, 4);
        bga0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        f4m.a(bga0Var, new yb3(this, (Object) null, bga0Var, 8));
        return bga0Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setPlaceholdersIcon(configuration);
    }

    public final void setEmptyViewAddPhotoListener(a aVar) {
        this.O = aVar;
    }

    public final void x(View view, boolean z) {
        Drawable a2;
        if (z) {
            Context context = getContext();
            a2 = context != null ? new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, context)) : null;
        } else {
            a2 = dhr0.t.a(R.drawable.photos_root_page_background);
        }
        view.setBackground(a2);
    }
}
