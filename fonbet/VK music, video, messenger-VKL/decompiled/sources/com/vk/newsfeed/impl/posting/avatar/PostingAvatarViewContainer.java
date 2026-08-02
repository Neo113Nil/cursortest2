package com.vk.newsfeed.impl.posting.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vk.sharing.api.dto.Target;
import xsna.edc0;
import xsna.fdc0;
import xsna.z66;

/* compiled from: PostingAvatarViewContainer.kt */
/* loaded from: classes4.dex */
public final class PostingAvatarViewContainer extends z66<fdc0> implements fdc0 {
    public PostingAvatarViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // xsna.z66
    public final fdc0 b(Context context, AttributeSet attributeSet, int i) {
        return new edc0(context, attributeSet, i);
    }

    @Override // xsna.ts5
    public View getView() {
        return getDelegate().getView();
    }

    @Override // xsna.fdc0
    public final void q(Target target, Drawable drawable) {
        getDelegate().q(target, drawable);
    }
}
