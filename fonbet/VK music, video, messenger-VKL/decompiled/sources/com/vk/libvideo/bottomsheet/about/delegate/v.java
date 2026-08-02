package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.hfz;
import xsna.p1u0;
import xsna.vfz;

/* compiled from: AboutVideoRelatedAudioTitleDelegate.kt */
/* loaded from: classes2.dex */
public final class v extends p1u0<AboutVideoItem.u> {

    /* compiled from: AboutVideoRelatedAudioTitleDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.u> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(AboutVideoItem.u uVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.u> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.video_related_audio_title, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.u;
    }
}
