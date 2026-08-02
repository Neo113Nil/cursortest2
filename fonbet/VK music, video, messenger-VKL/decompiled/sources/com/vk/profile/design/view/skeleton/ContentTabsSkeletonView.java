package com.vk.profile.design.view.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.j5g;
import xsna.k9x;
import xsna.too0;

/* compiled from: ContentTabsSkeletonView.kt */
/* loaded from: classes5.dex */
public final class ContentTabsSkeletonView extends LinearLayout implements too0 {
    public ContentTabsSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        b();
        setOrientation(1);
    }

    @Override // xsna.too0
    public final void Ng() {
        b();
    }

    public final View a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_profile_with_tabs_skeleton, (ViewGroup) this, false);
        VkSkeleton vkSkeleton = (VkSkeleton) inflate.findViewById(R.id.tab_icon_skeleton);
        vkSkeleton.setType(VkSkeleton.a.b.a);
        vkSkeleton.setArea(new a.C0863a(this));
        ((VkTextSkeleton) inflate.findViewById(R.id.tab_text_skeleton)).setArea(new a.C0863a(this));
        return inflate;
    }

    public final void b() {
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.content_tabs_skeleton, (ViewGroup) this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_tab_container);
        linearLayout.removeAllViews();
        View a = a();
        a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int z = iah0.z(linearLayout.getContext()) / a.getMeasuredWidth();
        linearLayout.addView(a);
        int Q = j5g.Q(new k9x(1, z, 1));
        for (int i = 0; i < Q; i++) {
            linearLayout.addView(a());
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.ll_content_container);
        linearLayout2.removeAllViews();
        for (int i2 = 0; i2 < 2; i2++) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.wall_item_skeleton, (ViewGroup) this, false);
            VkSkeleton vkSkeleton = (VkSkeleton) inflate.findViewById(R.id.v_avatar);
            vkSkeleton.setType(VkSkeleton.a.b.a);
            vkSkeleton.setArea(new a.C0863a(this));
            linearLayout2.addView(inflate);
        }
    }
}
