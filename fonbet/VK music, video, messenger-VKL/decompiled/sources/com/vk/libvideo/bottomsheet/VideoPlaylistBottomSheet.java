package com.vk.libvideo.bottomsheet;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import com.facebook.soloader.MinElf;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.share.api.b;
import com.vkontakte.android.R;
import java.util.Collection;
import kotlin.collections.builders.ListBuilder;
import xsna.asp;
import xsna.av20;
import xsna.bpn0;
import xsna.cpu;
import xsna.du0;
import xsna.dw20;
import xsna.e43;
import xsna.e520;
import xsna.fkq0;
import xsna.fxc0;
import xsna.izs;
import xsna.jcf0;
import xsna.kq6;
import xsna.l4t0;
import xsna.o0r0;
import xsna.rcg0;
import xsna.s3q0;
import xsna.sua;
import xsna.tzp0;
import xsna.xg5;
import xsna.yzs;
import xsna.zrp;

/* compiled from: VideoPlaylistBottomSheet.kt */
/* loaded from: classes2.dex */
public final class VideoPlaylistBottomSheet extends kq6 {
    public static final e520 h = new e520(R.id.video_copy_link, R.drawable.vk_icon_copy_outline_28, R.string.copy_link, 1, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 i = new e520(R.id.video_copy_link, R.drawable.vk_icon_chain_outline_28, R.string.copy_link, 1, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 j = new e520(R.id.share, R.drawable.vk_icon_share_outline_28, R.string.video_share, 2, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 k = new e520(R.id.share, R.drawable.vk_icon_share_outline_28, R.string.video_share_playlist, 2, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 l = new e520(R.id.video_go_to_owner, R.drawable.vk_icon_users_outline_28, R.string.video_playlist_go_to_owner, 3, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 m = new e520(R.id.video_upload_video, R.drawable.vk_icon_upload_outline_28, R.string.video_playlist_bottom_menu_upload_video, 4, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 n = new e520(R.id.video_edit_playlist, R.drawable.vk_icon_edit_outline_28, R.string.video_edit, 4, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 o = new e520(R.id.video_delete_playlist, R.drawable.vk_icon_delete_outline_28, R.string.video_playlist_bottom_menu_delete_playlist, 5, false, R.color.vk_red, 0, false, null, 0, null, false, 8144);
    public static final e520 p = new e520(R.id.video_playlist_add_by_link, R.drawable.vk_icon_film_strip_add_outline_28, R.string.video_playlist_bottom_menu_add_by_link, 6, false, 0, 0, false, null, 0, null, false, 8176);
    public final Context c;
    public final VideoAlbum d;
    public final izs<Context, s3q0> e;
    public final izs<Action, s3q0> f;
    public final b g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoPlaylistBottomSheet.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action CopyLink;
        public static final Action Share;
        public static final Action ShowAuthor;

        static {
            Action action = new Action("ShowAuthor", 0);
            ShowAuthor = action;
            Action action2 = new Action("CopyLink", 1);
            CopyLink = action2;
            Action action3 = new Action("Share", 2);
            Share = action3;
            Action[] actionArr = {action, action2, action3};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoPlaylistBottomSheet(Context context, VideoAlbum videoAlbum, izs<? super Context, s3q0> izsVar, izs<? super Action, s3q0> izsVar2, rcg0 rcg0Var, b bVar) {
        this.c = context;
        this.d = videoAlbum;
        this.e = izsVar;
        this.f = izsVar2;
        this.g = bVar;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        Collection l2;
        av20.a aVar = new av20.a();
        final Context context = this.c;
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(context));
        aVar.d = new l4t0(context);
        final VideoAlbum videoAlbum = this.d;
        aVar.c(new yzs() { // from class: xsna.k4t0
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                com.vk.video.ui.share.api.b bVar;
                Activity h2;
                VideoPlaylistBottomSheet videoPlaylistBottomSheet = VideoPlaylistBottomSheet.this;
                Context context2 = videoPlaylistBottomSheet.c;
                VideoAlbum videoAlbum2 = videoPlaylistBottomSheet.d;
                e520 e520Var = (e520) obj2;
                ((Integer) obj3).getClass();
                izs<VideoPlaylistBottomSheet.Action, s3q0> izsVar = videoPlaylistBottomSheet.f;
                boolean f = epx.f(e520Var, VideoPlaylistBottomSheet.l);
                Context context3 = context;
                VideoAlbum videoAlbum3 = videoAlbum;
                if (f) {
                    if (izsVar != null) {
                        izsVar.invoke(VideoPlaylistBottomSheet.Action.ShowAuthor);
                    }
                    xwk.e().m(context3, videoAlbum3.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (epx.f(e520Var, VideoPlaylistBottomSheet.j) || epx.f(e520Var, VideoPlaylistBottomSheet.k)) {
                    if (izsVar != null) {
                        izsVar.invoke(VideoPlaylistBottomSheet.Action.Share);
                    }
                    if (!BuildInfo.q()) {
                        VideoFeatures videoFeatures = VideoFeatures.VIDEO_PLAYLIST_SHARING;
                        videoFeatures.getClass();
                        if (!com.vk.toggle.b.A.a(videoFeatures)) {
                            if (o25.a().b()) {
                                kbj0.c(nr4.b(), videoPlaylistBottomSheet.c, videoAlbum2.Eb(), false, null, null, false, 120);
                            } else {
                                nr4.b().y(context2, videoAlbum2.Eb());
                            }
                        }
                    }
                    nr4.b().s(context2, videoAlbum2, false);
                } else if (epx.f(e520Var, VideoPlaylistBottomSheet.h) || epx.f(e520Var, VideoPlaylistBottomSheet.i)) {
                    if (izsVar != null) {
                        izsVar.invoke(VideoPlaylistBottomSheet.Action.CopyLink);
                    }
                    ClipboardManager clipboardManager = (ClipboardManager) context3.getSystemService("clipboard");
                    String Eb = videoAlbum3.Eb();
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
                    videoFeatures2.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures2) && (bVar = videoPlaylistBottomSheet.g) != null) {
                        Eb = bVar.c(Eb);
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(Eb, Eb));
                    cvk.u(R.string.link_copied, false);
                } else if (epx.f(e520Var, VideoPlaylistBottomSheet.m)) {
                    videoPlaylistBottomSheet.e.invoke(context3);
                } else if (epx.f(e520Var, VideoPlaylistBottomSheet.n)) {
                    Activity h3 = e3m.h(context3);
                    if (h3 != null) {
                        g7s0 B = fxc0.B();
                        int i2 = g7s0.G7;
                        B.g(h3, videoAlbum3, true);
                    }
                } else if (epx.f(e520Var, VideoPlaylistBottomSheet.o)) {
                    fxc0.B().h(context3, videoAlbum3);
                } else if (epx.f(e520Var, VideoPlaylistBottomSheet.p) && (h2 = e3m.h(context3)) != null) {
                    fxc0.B().i0(h2, videoAlbum3.c, videoAlbum3.b);
                }
                videoPlaylistBottomSheet.dismiss();
                return s3q0.a;
            }
        });
        av20 b = aVar.b();
        bpn0 bpn0Var = xg5.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        cpu cpuVar = (cpu) bpn0Var.getValue();
        UserId userId = videoAlbum.c;
        UserId userId2 = videoAlbum.c;
        int i2 = videoAlbum.b;
        boolean a = cpuVar.a(userId);
        e520 e520Var = j;
        e520 e520Var2 = h;
        if (i2 < 0) {
            l2 = e43.l(e520Var, e520Var2);
        } else if (BuildInfo.r()) {
            l2 = e43.l(e520Var, e520Var2);
        } else if (a) {
            boolean l1 = fxc0.B().J().l1();
            e520 e520Var3 = n;
            e520 e520Var4 = o;
            if (l1) {
                l2 = sua.p(videoAlbum) ? e43.l(k, i, e520Var4) : e43.l(e520Var3, e520Var, e520Var2, e520Var4);
            } else {
                int i3 = videoAlbum.f;
                e520 e520Var5 = m;
                if (i3 == 0) {
                    ListBuilder e = e43.e();
                    e.add(e520Var5);
                    if (!fxc0.B().J().r0() || (!BuildInfo.q() && fkq0.d(userId2))) {
                        e.add(p);
                    }
                    e.add(e520Var3);
                    e.add(e520Var);
                    e.add(e520Var2);
                    e.add(e520Var4);
                    l2 = e.g();
                } else {
                    l2 = e43.l(e520Var5, e520Var, e520Var2, e520Var3, e520Var4);
                }
            }
        } else {
            l2 = e43.l(l, e520Var, e520Var2);
        }
        b.setItems(l2);
        return ((dw20.b) dw20.a.k(new dw20.b(context, tzp0.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.ALBUM, Long.valueOf(i2), Long.valueOf(userId2.b), null, null, null, 56, null), 2)).a0(new jcf0(this, 23)), b, 4)).I0("video_playlist_options");
    }

    public /* synthetic */ VideoPlaylistBottomSheet(Context context, VideoAlbum videoAlbum, izs izsVar, du0 du0Var, b bVar, int i2) {
        this(context, videoAlbum, (izs<? super Context, s3q0>) izsVar, (i2 & 8) != 0 ? null : du0Var, (rcg0) null, (i2 & 32) != 0 ? null : bVar);
    }
}
