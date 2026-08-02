package com.vk.clips.design.view.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.toggle.b;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.boc;
import xsna.bwt0;
import xsna.e3m;
import xsna.gzs;
import xsna.m33;
import xsna.s3q0;
import xsna.ul1;

/* compiled from: ClipCoauthorInvitationView.kt */
/* loaded from: classes16.dex */
public final class ClipCoauthorInvitationView extends ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final VkButton t;

    public ClipCoauthorInvitationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.item_fullscreen_coauthor_invitation_view, this);
        setBackground(m33.a(R.drawable.bg_coauthor_invitation, context));
        int a = e3m.a(R.dimen.clips_coauthors_invitation_view_inner_padding, context);
        setPadding(a, a, a, a);
        VkText vkText = (VkText) findViewById(R.id.invitation_title);
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        b bVar = b.A;
        vkText.setText(bVar.a(clipsFeatures) ? R.string.clips_coauthors_invitation_fullscreen_text_redesign : R.string.clips_coauthors_invitation_fullscreen_text);
        VkButton vkButton = (VkButton) findViewById(R.id.invitation_response_button);
        this.t = vkButton;
        vkButton.setMode(bVar.a(clipsFeatures) ? VkButton.Mode.Tertiary : VkButton.Mode.Primary);
        awt0.o(vkButton, new ul1(this, 21));
    }

    public final void setReplyButtonListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.t, new boc(0, gzsVar));
    }
}
