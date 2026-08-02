package com.vk.im.ui.components.contact.vc;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.im.ui.views.buttons.TextImageButton;
import com.vkontakte.android.R;
import xsna.ap30;
import xsna.bwt0;
import xsna.fvq0;
import xsna.mmm0;
import xsna.n8j;
import xsna.zyl0;

/* compiled from: UserProfileView.kt */
/* loaded from: classes2.dex */
public final class UserProfileView extends n8j {
    public static final /* synthetic */ int N = 0;
    public final TextImageButton K;
    public final TextImageButton L;
    public final TextImageButton M;

    /* compiled from: UserProfileView.kt */
    public interface a {
    }

    public UserProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TextImageButton textImageButton = (TextImageButton) findViewById(R.id.im_message);
        this.K = textImageButton;
        TextImageButton textImageButton2 = (TextImageButton) findViewById(R.id.im_phone);
        this.L = textImageButton2;
        TextImageButton textImageButton3 = (TextImageButton) findViewById(R.id.im_video);
        this.M = textImageButton3;
        bwt0.i0(textImageButton, new ap30(this, 26));
        bwt0.i0(textImageButton2, new mmm0(this, 8));
        bwt0.i0(textImageButton3, new zyl0(this, 11));
        bwt0.i0(getAvatarView(), new fvq0(this, 0));
    }

    public final a getCallback() {
        return null;
    }

    @Override // xsna.n8j
    public int getLayoutId() {
        return R.layout.vkim_user_profile;
    }

    public final void setAudioCallViewEnabled(boolean z) {
        this.L.setEnabled(z);
    }

    public final void setMessageViewEnabled(boolean z) {
        this.K.setEnabled(z);
    }

    public final void setVideoCallEnabled(boolean z) {
        this.M.setEnabled(z);
    }

    public final void setCallback(a aVar) {
    }
}
