package com.vk.archive.impl.channels;

import android.os.Bundle;
import com.vk.im.mvicomponent.SingleComponentFragment;
import com.vkontakte.android.R;
import xsna.ah3;
import xsna.gi3;
import xsna.i7o0;
import xsna.kh20;
import xsna.kju0;
import xsna.oz50;
import xsna.rgb;
import xsna.tg3;
import xsna.ui3;
import xsna.yj50;
import xsna.zdw;

/* compiled from: ArchiveChannelsFragment.kt */
/* loaded from: classes15.dex */
public final class ArchiveChannelsFragment extends SingleComponentFragment {
    public boolean U;
    public boolean V;

    /* compiled from: ArchiveChannelsFragment.kt */
    public static final class a extends oz50 {
    }

    public ArchiveChannelsFragment() {
        super(R.layout.im_archive_channels_fragment);
    }

    @Override // com.vk.im.mvicomponent.SingleComponentFragment
    public final yj50<?, ?, ?, ?, ?, ?, ?> jo() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        rgb rgbVar = ((kju0) zdwVar.c()).i;
        zdw zdwVar2 = i7o0.b;
        kh20 kh20Var = (zdwVar2 != null ? zdwVar2 : null).q;
        return new tg3(this, rgbVar, kh20Var != null ? new com.vk.archive.impl.a(kh20Var.a.h) : null, new ah3((zdwVar2 != null ? zdwVar2 : null).b, (zdwVar2 != null ? zdwVar2 : null).u), new gi3((zdwVar2 != null ? zdwVar2 : null).b), new ui3((zdwVar2 != null ? zdwVar2 : null).b), this.U, this.V);
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        this.U = arguments != null ? arguments.getBoolean("channels_renamed") : false;
        Bundle arguments2 = getArguments();
        this.V = arguments2 != null ? arguments2.getBoolean("show_channel_item_as_default_dialog") : false;
        super.onCreate(bundle);
        this.o = false;
    }
}
