package com.vk.catalog2.common.ui.mvp.video;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import xsna.a0u;
import xsna.av20;
import xsna.b7w;
import xsna.cvk;
import xsna.fxc0;
import xsna.g7s0;
import xsna.h2h0;
import xsna.h7u0;
import xsna.hg1;
import xsna.kbj0;
import xsna.n240;
import xsna.nr4;
import xsna.o0r0;
import xsna.rsg0;
import xsna.v8s0;
import xsna.w8s0;
import xsna.wmg;
import xsna.xwk;

/* compiled from: VideoCatalogAlbumBottomSheet.kt */
/* loaded from: classes16.dex */
public final class b implements av20.b<VideoCatalogAlbumBottomSheet.a.EnumC0516a> {
    public final /* synthetic */ Activity a;

    public b(Activity activity) {
        this.a = activity;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        com.vk.video.ui.share.api.b bVar;
        VideoCatalogAlbumBottomSheet.a.EnumC0516a enumC0516a = (VideoCatalogAlbumBottomSheet.a.EnumC0516a) obj;
        final VideoAlbum videoAlbum = VideoCatalogAlbumBottomSheet.a.c;
        if (videoAlbum != null) {
            int i2 = enumC0516a.i();
            if (i2 == R.id.edit || i2 == R.id.video_edit_playlist) {
                fxc0.B().g(view.getContext(), videoAlbum, VideoCatalogAlbumBottomSheet.a.d);
            } else if (i2 == R.id.video_remove_playlist) {
                final Context context = view.getContext();
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: xsna.u8s0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        g7s0 B = fxc0.B();
                        VideoAlbum videoAlbum2 = videoAlbum;
                        B.v0(context, videoAlbum2.b, videoAlbum2.c, new tsk0(videoAlbum2, 20));
                    }
                };
                int i3 = h7u0.p;
                h7u0.a c = h7u0.b.c(context);
                c.g0(R.string.video_alert_title);
                c.U(R.string.video_playlist_confirm_remove);
                c.c0(R.string.delete, onClickListener);
                c.W(R.string.cancel, null);
                c.m();
            } else if (i2 == R.id.video_copy_link) {
                Context context2 = view.getContext();
                w8s0 w8s0Var = VideoCatalogAlbumBottomSheet.a.g;
                if (w8s0Var != null) {
                    w8s0Var.a(VideoCatalogAlbumBottomSheet.Action.CopyLink);
                }
                ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                String Eb = videoAlbum.Eb();
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures) && (bVar = VideoCatalogAlbumBottomSheet.a.j) != null) {
                    Eb = bVar.c(Eb);
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText(Eb, Eb));
                cvk.u(R.string.link_copied, false);
            } else if (i2 == R.id.share) {
                w8s0 w8s0Var2 = VideoCatalogAlbumBottomSheet.a.g;
                if (w8s0Var2 != null) {
                    w8s0Var2.a(VideoCatalogAlbumBottomSheet.Action.Share);
                }
                if (!BuildInfo.q()) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_PLAYLIST_SHARING;
                    videoFeatures2.getClass();
                    if (!com.vk.toggle.b.A.a(videoFeatures2)) {
                        kbj0.c(nr4.b(), view.getContext(), videoAlbum.Eb(), false, null, null, false, 120);
                    }
                }
                nr4.b().s(view.getContext(), videoAlbum, false);
            } else if (i2 == R.id.video_unsubscribe_playlist) {
                w8s0 w8s0Var3 = VideoCatalogAlbumBottomSheet.a.g;
                if (w8s0Var3 != null) {
                    w8s0Var3.a(VideoCatalogAlbumBottomSheet.Action.Unsubscribe);
                }
                UserId userId = videoAlbum.c;
                int i4 = videoAlbum.b;
                String d = UiTracker.d();
                String str = VideoCatalogAlbumBottomSheet.a.e;
                if (str == null) {
                    str = "";
                }
                hg1.b(view, rsg0.Z(new a0u(userId, i4, d, str, false, 32)).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new b7w(3, view, videoAlbum), new n240(new h2h0(11), 29)));
            } else if (i2 == R.id.video_subscribe_playlist) {
                VideoCatalogAlbumBottomSheet.a.b(view.getContext(), videoAlbum);
            } else if (i2 == R.id.video_go_to_owner) {
                w8s0 w8s0Var4 = VideoCatalogAlbumBottomSheet.a.g;
                if (w8s0Var4 != null) {
                    w8s0Var4.a(VideoCatalogAlbumBottomSheet.Action.GoToOwner);
                }
                xwk.e().m(view.getContext(), videoAlbum.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            } else if (i2 == R.id.video_playlist_add_video) {
                g7s0 B = fxc0.B();
                view.getContext();
                B.getClass();
            }
        }
        VideoCatalogAlbumBottomSheet.a.c = null;
        view.postDelayed(new v8s0(), this.a.getResources().getInteger(android.R.integer.config_shortAnimTime));
    }
}
