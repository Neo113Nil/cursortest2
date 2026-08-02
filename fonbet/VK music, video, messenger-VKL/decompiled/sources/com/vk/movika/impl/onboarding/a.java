package com.vk.movika.impl.onboarding;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.t0w0;
import xsna.tf3;

/* compiled from: InteractiveOnboardingItemViewHolder.kt */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.e0 {
    public static final float q = iah0.b(20.0f);
    public final ViewGroup l;
    public final VkText m;
    public final VkText n;
    public final VkText o;
    public final VkImageSimple p;

    public a(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.interactive_videos_onboarding_item, viewGroup, false));
        this.l = viewGroup;
        this.m = (VkText) this.itemView.findViewById(R.id.title);
        this.n = (VkText) this.itemView.findViewById(R.id.message);
        this.o = (VkText) this.itemView.findViewById(R.id.step);
        this.p = (VkImageSimple) this.itemView.findViewById(R.id.image);
        this.itemView.setOutlineProvider(new t0w0(q, false, true));
        this.itemView.setClipToOutline(true);
    }
}
