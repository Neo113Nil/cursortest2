package com.vk.feed.design.view.newsfeed.clips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: ClipRepostView.kt */
/* loaded from: classes18.dex */
public final class ClipRepostView extends ConstraintLayout {
    public String t;
    public final VkText u;
    public final VkImageSimple v;

    public ClipRepostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.clip_repost_view, this);
        this.u = (VkText) findViewById(R.id.clip_repost_clip_owner_name);
        this.v = (VkImageSimple) findViewById(R.id.clip_repost_clip_owner_verified);
    }

    public final String getOwnerName() {
        return this.t;
    }

    public final void setOwnerName(String str) {
        this.t = str;
        this.u.setText(str);
    }

    public final void setOwnerVerified(boolean z) {
        bwt0.p0(this.v, z);
    }
}
