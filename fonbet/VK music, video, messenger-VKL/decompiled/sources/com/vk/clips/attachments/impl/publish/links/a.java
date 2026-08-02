package com.vk.clips.attachments.impl.publish.links;

import androidx.fragment.app.FragmentManager;
import com.vk.clips.attachments.api.publish.links.ClipsLinksAttachEntryParams;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import kotlin.Pair;
import xsna.qje;
import xsna.yfb;

/* compiled from: ClipsLinksAttachLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class a implements qje {
    @Override // xsna.qje
    public final void a(ClipsLinksAttachEntryParams clipsLinksAttachEntryParams, FragmentManager fragmentManager) {
        ClipsLinksControllerRootFragment clipsLinksControllerRootFragment = new ClipsLinksControllerRootFragment();
        clipsLinksControllerRootFragment.setArguments(yfb.b(new Pair("input_params", clipsLinksAttachEntryParams), new Pair("launch_type", ClipsLinksControllerRootFragment.LaunchType.Edit)));
        clipsLinksControllerRootFragment.Td(fragmentManager, "links_controller");
    }

    @Override // xsna.qje
    public final void b(FragmentManager fragmentManager) {
        ClipsLinksControllerRootFragment clipsLinksControllerRootFragment = new ClipsLinksControllerRootFragment();
        clipsLinksControllerRootFragment.setArguments(yfb.b(new Pair("launch_type", ClipsLinksControllerRootFragment.LaunchType.Unavailable)));
        clipsLinksControllerRootFragment.Td(fragmentManager, "links_controller");
    }
}
