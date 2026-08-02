package com.vk.channels.impl.channelselection;

import com.vk.im.mvicomponent.SingleComponentFragment;
import com.vkontakte.android.R;
import xsna.a1w;
import xsna.oz50;
import xsna.q1w;
import xsna.q6i0;
import xsna.yj50;

/* compiled from: SelectChannelFragment.kt */
/* loaded from: classes16.dex */
public final class SelectChannelFragment extends SingleComponentFragment {

    /* compiled from: SelectChannelFragment.kt */
    public static class a extends oz50 {
    }

    public SelectChannelFragment() {
        super(R.layout.im_channels_selection_fragment);
    }

    @Override // com.vk.im.mvicomponent.SingleComponentFragment
    public final yj50<?, ?, ?, ?, ?, ?, ?> jo() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return new q6i0(this, a1wVar, this);
    }
}
