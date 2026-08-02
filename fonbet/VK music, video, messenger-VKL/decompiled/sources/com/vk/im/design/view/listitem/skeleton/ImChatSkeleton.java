package com.vk.im.design.view.listitem.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import xsna.vjv0;

/* compiled from: ImChatSkeleton.kt */
/* loaded from: classes2.dex */
public final class ImChatSkeleton extends ConstraintLayout implements vjv0 {
    public final ThemableShimmer t;
    public final VkSkeleton u;
    public final VkSkeleton v;
    public final VkSkeleton w;
    public boolean x;
    public a y;

    public ImChatSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = new ThemableShimmer.a(context).a();
        this.y = a.c.a;
        LayoutInflater.from(context).inflate(R.layout.vkim_chat_skeleton, this);
        VkSkeleton vkSkeleton = (VkSkeleton) findViewById(R.id.avatar_skeleton);
        this.u = vkSkeleton;
        VkSkeleton vkSkeleton2 = (VkSkeleton) findViewById(R.id.chat_name_skeleton);
        this.v = vkSkeleton2;
        VkSkeleton vkSkeleton3 = (VkSkeleton) findViewById(R.id.msg_two_lines_skeleton);
        this.w = vkSkeleton3;
        setUpDefaultParams(vkSkeleton);
        setUpDefaultParams(vkSkeleton2);
        setUpDefaultParams(vkSkeleton3);
        vkSkeleton.setType(VkSkeleton.a.b.a);
        vkSkeleton2.setType(new VkSkeleton.a.C0862a(8.0f));
        vkSkeleton3.setType(new VkSkeleton.a.C0862a(8.0f));
    }

    private final void setUpDefaultParams(VkSkeleton vkSkeleton) {
        vkSkeleton.setArea(getArea());
        vkSkeleton.setShimmerManagedExternally(true);
        vkSkeleton.setShimmer(this.t);
    }

    public a getArea() {
        return this.y;
    }

    public boolean getShimmerManagedExternally() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        this.t.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        this.t.c();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getShimmerManagedExternally()) {
            return;
        }
        ThemableShimmer themableShimmer = this.t;
        if (i == 0) {
            themableShimmer.b();
        } else if (i == 4 || i == 8) {
            themableShimmer.c();
        }
    }

    @Override // xsna.vjv0
    public void setArea(a aVar) {
        this.y = aVar;
        this.u.setArea(aVar);
        this.v.setArea(aVar);
        this.w.setArea(aVar);
    }

    @Override // xsna.vjv0
    public void setShimmer(ThemableShimmer themableShimmer) {
        this.u.setShimmer(themableShimmer);
        this.v.setShimmer(themableShimmer);
        this.w.setShimmer(themableShimmer);
    }

    @Override // xsna.vjv0
    public void setShimmerManagedExternally(boolean z) {
        this.x = z;
    }
}
