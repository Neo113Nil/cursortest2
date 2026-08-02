package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.hfz;
import xsna.p1u0;
import xsna.vfz;

/* compiled from: AboutVideoSimilarVideosTitleDelegate.kt */
/* loaded from: classes2.dex */
public final class b0 extends p1u0<AboutVideoItem.y> {

    /* compiled from: AboutVideoSimilarVideosTitleDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.y> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(AboutVideoItem.y yVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.y> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.video_about_similar_videos_title, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.y;
    }
}
