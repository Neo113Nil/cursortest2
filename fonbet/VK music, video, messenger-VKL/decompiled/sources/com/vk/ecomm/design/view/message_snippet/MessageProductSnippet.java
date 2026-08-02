package com.vk.ecomm.design.view.message_snippet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.ixj0;
import xsna.jwx;
import xsna.kci;
import xsna.krv0;
import xsna.wa20;

/* compiled from: MessageProductSnippet.kt */
/* loaded from: classes18.dex */
public final class MessageProductSnippet extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final VkPicture t;
    public final VkImageSimple u;
    public final VkFadeText v;
    public final VkFadeText w;

    public MessageProductSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.message_product_snippet, this);
        VkPicture vkPicture = (VkPicture) findViewById(R.id.product_picture);
        this.t = vkPicture;
        this.u = (VkImageSimple) findViewById(R.id.hide_icon);
        VkFadeText vkFadeText = (VkFadeText) findViewById(R.id.title_text);
        this.v = vkFadeText;
        VkFadeText vkFadeText2 = (VkFadeText) findViewById(R.id.subtitle_text);
        this.w = vkFadeText2;
        vkPicture.setBackgroundImage(new ColorDrawable(krv0.m(R.attr.vk_ui_background_secondary, getContext())));
        setBackgroundColor(krv0.m(R.attr.vk_ui_avatar_overlay, getContext()));
        setOutlineProvider(new wa20(this));
        setClipToOutline(true);
        vkFadeText.setMaxTextLines(1);
        vkFadeText.setHorizontallyScrolling(true);
        vkFadeText2.setMaxTextLines(1);
        vkFadeText2.setHorizontallyScrolling(true);
    }

    public final void P4(Image image, boolean z) {
        ArrayList arrayList;
        ImageSize imageSize;
        VkPicture vkPicture = this.t;
        if (z) {
            vkPicture.setContentDescription(null);
            kci.o(vkPicture, new jwx(2, 8));
            vkPicture.setActualColorFilter(new PorterDuffColorFilter(getContext().getColor(R.color.vk_black_alpha35), PorterDuff.Mode.SRC_ATOP));
            vkPicture.o0(ixj0.n(image != null ? image.b : null), null);
            return;
        }
        vkPicture.setContentDescription(null);
        vkPicture.setVkPostprocessor(null);
        vkPicture.getBackend().t();
        vkPicture.o0((image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) ixj0.c(arrayList, 32, 32)) == null) ? null : imageSize.d.d, null);
    }
}
