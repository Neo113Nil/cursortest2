package com.vk.im.ui.components.group.vc;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.im.ui.views.buttons.TextImageButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c2u;
import xsna.f2s;
import xsna.n8j;
import xsna.o1e;

/* compiled from: GroupProfileView.kt */
/* loaded from: classes2.dex */
public final class GroupProfileView extends n8j {
    public static final /* synthetic */ int K = 0;

    /* compiled from: GroupProfileView.kt */
    public interface a {
    }

    public GroupProfileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TextImageButton textImageButton = (TextImageButton) findViewById(R.id.im_message);
        TextImageButton textImageButton2 = (TextImageButton) findViewById(R.id.im_share);
        bwt0.i0(textImageButton, new f2s(this, 8));
        bwt0.i0(textImageButton2, new o1e(this, 28));
        bwt0.i0(getAvatarView(), new c2u(this, 1));
    }

    public final a getCallback() {
        return null;
    }

    @Override // xsna.n8j
    public int getLayoutId() {
        return R.layout.vkim_group_profile;
    }

    public final void setCallback(a aVar) {
    }
}
