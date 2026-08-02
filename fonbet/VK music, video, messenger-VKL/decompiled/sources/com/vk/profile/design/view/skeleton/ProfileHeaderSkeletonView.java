package com.vk.profile.design.view.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.components.text.VkText;
import com.vk.profile.design.view.skeleton.ProfileHeaderSkeletonView;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.bwt0;
import xsna.e3m;
import xsna.gzs;
import xsna.iah0;

/* compiled from: ProfileHeaderSkeletonView.kt */
/* loaded from: classes5.dex */
public final class ProfileHeaderSkeletonView extends ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public final VkText t;
    public final VkSkeleton u;
    public final AvatarViewWrapper v;

    public ProfileHeaderSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.view_skeleton_header, (ViewGroup) this, true);
        final int a = e3m.a(R.dimen.user_profile_item_corner_height, context);
        final View findViewById = findViewById(R.id.v_block);
        final VkSkeleton vkSkeleton = (VkSkeleton) findViewById(R.id.v_cover_skeleton);
        vkSkeleton.setArea(new a.C0863a(this));
        HashSet hashSet = iah0.a;
        final int i = context.getResources().getDisplayMetrics().heightPixels;
        bwt0.h(vkSkeleton, new gzs() { // from class: xsna.pxd0
            @Override // xsna.gzs
            public final Object invoke() {
                int i2 = ProfileHeaderSkeletonView.w;
                VkSkeleton vkSkeleton2 = VkSkeleton.this;
                int width = (int) (vkSkeleton2.getWidth() * 0.4f);
                int i3 = i;
                if (width > i3) {
                    width = i3;
                }
                f4m.t(cn70.b(1) + width, findViewById);
                bwt0.c0(width + a, vkSkeleton2);
                return s3q0.a;
            }
        });
        this.t = (VkText) findViewById(R.id.tv_name);
        VkSkeleton vkSkeleton2 = (VkSkeleton) findViewById(R.id.v_name_skeleton);
        vkSkeleton2.setArea(new a.C0863a(this));
        this.u = vkSkeleton2;
        this.v = (AvatarViewWrapper) findViewById(R.id.iv_avatar_skeleton);
    }
}
