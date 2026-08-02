package com.vk.video.music.dialog.impl.di;

import android.text.TextUtils;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.c;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.music.Thumb;
import com.vk.video.music.api.di.MusicInVideoComponent;
import com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent;
import com.vkontakte.android.R;
import xsna.a44;
import xsna.asf0;
import xsna.b7m;
import xsna.bsf0;
import xsna.c5v0;
import xsna.e7m;
import xsna.fpf0;
import xsna.fyd0;
import xsna.l1i;
import xsna.l7s;
import xsna.tlo0;
import xsna.v0s0;
import xsna.wbb0;
import xsna.wf40;
import xsna.wp40;
import xsna.x850;
import xsna.xbb0;
import xsna.yrf0;
import xsna.yus0;

/* compiled from: MusicInVideoDialogComponentImpl.kt */
/* loaded from: classes6.dex */
public final class MusicInVideoDialogComponentImpl implements MusicInVideoDialogComponent {
    public final MusicInVideoComponent a;

    /* compiled from: MusicInVideoDialogComponentImpl.kt */
    public static final class a implements b7m<MusicInVideoDialogComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MusicInVideoDialogComponentImpl((MusicInVideoComponent) e7mVar.a(fpf0.a(MusicInVideoComponent.class)));
        }
    }

    public MusicInVideoDialogComponentImpl(MusicInVideoComponent musicInVideoComponent) {
        this.a = musicInVideoComponent;
    }

    @Override // com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent
    public final bsf0 I7(l7s l7sVar, wbb0 wbb0Var, v0s0 v0s0Var) {
        c5v0.a aVar;
        xbb0 xbb0Var = new xbb0(wbb0Var, v0s0Var);
        VkModal.Mode mode = VkModal.Mode.Card;
        Thumb thumb = wbb0Var.a;
        int i = xbb0.c;
        Serializer.c<Thumb> cVar = Thumb.CREATOR;
        c5v0.a aVar2 = null;
        c5v0.c.d dVar = new c5v0.c.d(new c.d(String.valueOf(thumb.Cb(i, false)), null), i, 4);
        tlo0.a aVar3 = tlo0.Companion;
        Object[] objArr = {wbb0Var.b};
        aVar3.getClass();
        c5v0.b bVar = new c5v0.b(12, tlo0.a.c(R.string.related_music_first_added_track_in_playlisy, objArr), new tlo0.f(R.string.related_music_listen_in_vk_music));
        if (BuildInfo.s()) {
            tlo0.f fVar = new tlo0.f(R.string.related_music_open_playlist_button);
            l1i l1iVar = new l1i(xbb0Var, 24);
            VkButton.Size size = VkButton.Size.Large;
            aVar2 = new c5v0.a(new c5v0.a.C2643a(fVar, l1iVar, size, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, 284), new c5v0.a.C2643a(new tlo0.f(R.string.related_music_continue_watch_button), new wf40(xbb0Var, 11), size, VkButton.Mode.Secondary, VkButton.Appearance.Neutral, false, 284), 4);
        } else if (BuildInfo.q()) {
            aVar = new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.related_music_understand_button), new x850(xbb0Var, 8), VkButton.Size.Large, VkButton.Mode.Primary, VkButton.Appearance.Neutral, false, 284), (c5v0.a.C2643a) null, 6);
            xbb0Var.b = new VkModal(mode, new b.a.C0790b(dVar, bVar, null, aVar, 52), null, false, 28).b(l7sVar, "OnboardingPlaylistInfoModalCard");
            return xbb0Var;
        }
        aVar = aVar2;
        xbb0Var.b = new VkModal(mode, new b.a.C0790b(dVar, bVar, null, aVar, 52), null, false, 28).b(l7sVar, "OnboardingPlaylistInfoModalCard");
        return xbb0Var;
    }

    @Override // com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent
    public final bsf0 J1(l7s l7sVar, asf0 asf0Var, fyd0 fyd0Var, yus0 yus0Var, a44 a44Var) {
        boolean g = this.a.pb().g();
        yrf0 yrf0Var = new yrf0();
        VkModal.Mode mode = VkModal.Mode.Card;
        Thumb thumb = asf0Var.c;
        int i = yrf0.b;
        Serializer.c<Thumb> cVar = Thumb.CREATOR;
        c5v0.c.d dVar = new c5v0.c.d(new c.d(String.valueOf(thumb.Cb(i, false)), null), i, 4);
        tlo0.a aVar = tlo0.Companion;
        String str = asf0Var.b + " — " + asf0Var.a;
        aVar.getClass();
        tlo0.h hVar = new tlo0.h(str);
        boolean z = asf0Var.e;
        c5v0.b bVar = new c5v0.b(hVar, new tlo0.f(z ? R.string.related_music_restricted_track : R.string.related_music_track_from_video), TextUtils.TruncateAt.END, 2);
        boolean z2 = !z;
        yrf0Var.a = new VkModal(mode, new b.a.C0790b(dVar, bVar, null, new c5v0.a(yrf0Var.a(asf0Var.d ? R.string.related_music_remove_from_playlist_in_vk_music : R.string.related_music_add_in_playlist_in_vk_music, fyd0Var, z2, z2), g ? yrf0Var.a(R.string.related_music_video_with_related_music, yus0Var, z, true) : null, 4), 52), new wp40(yrf0Var, 19), false, 20).b(l7sVar, "RelatedAudioDetailsModalCard");
        return yrf0Var;
    }
}
