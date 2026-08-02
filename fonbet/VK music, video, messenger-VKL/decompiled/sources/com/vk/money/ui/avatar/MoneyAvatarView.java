package com.vk.money.ui.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import xsna.qtd0;

/* compiled from: MoneyAvatarView.kt */
/* loaded from: classes3.dex */
public final class MoneyAvatarView extends VKAvatarView {
    public MoneyAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private final int getViewSize() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = layoutParams != null ? layoutParams.width : 0;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        return Math.min(i, layoutParams2 != null ? layoutParams2.height : 0);
    }

    public final void e1(Dialog dialog, ProfilesInfo profilesInfo, Drawable drawable) {
        ImageList C8;
        Image Bb;
        ChatSettings Hb = dialog.Hb();
        if (Hb != null) {
            Image Bb2 = Hb.c.Bb(getViewSize(), getViewSize());
            VKAvatarView.Z0(this, Bb2 != null ? Bb2.d : null, drawable, null, null, 12);
            return;
        }
        qtd0 Cb = profilesInfo.Cb(dialog.Sb());
        if (Cb != null && (C8 = Cb.C8()) != null && (Bb = C8.Bb(getViewSize(), getViewSize())) != null) {
            r1 = Bb.d;
        }
        VKAvatarView.Z0(this, r1, drawable, (Cb == null || !Cb.n9()) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON, null, 8);
    }

    public final View getView() {
        return this;
    }
}
