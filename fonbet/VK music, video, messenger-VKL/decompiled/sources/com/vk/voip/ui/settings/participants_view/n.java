package com.vk.voip.ui.settings.participants_view;

import android.view.View;
import android.widget.TextView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem.b;
import com.vkontakte.android.R;
import xsna.uvr0;

/* compiled from: VhParticipant.kt */
/* loaded from: classes7.dex */
public abstract class n<T extends CallSettingsItem & CallSettingsItem.b> extends uvr0<T> {
    public final VoipAvatarViewContainer n;
    public final TextView o;

    public n(View view) {
        super(view);
        this.n = (VoipAvatarViewContainer) view.findViewById(R.id.voip_avatar);
        this.o = (TextView) view.findViewById(R.id.voip_name);
    }
}
