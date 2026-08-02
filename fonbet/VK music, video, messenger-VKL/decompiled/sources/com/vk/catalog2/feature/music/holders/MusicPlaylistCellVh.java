package com.vk.catalog2.feature.music.holders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a250;
import xsna.b150;
import xsna.b5a;
import xsna.bwt0;
import xsna.c150;
import xsna.c9b0;
import xsna.cfp0;
import xsna.cho;
import xsna.e3m;
import xsna.e43;
import xsna.eko;
import xsna.epx;
import xsna.fl4;
import xsna.gzs;
import xsna.hvz;
import xsna.iah0;
import xsna.j5g;
import xsna.k1u0;
import xsna.lyd;
import xsna.m33;
import xsna.myc0;
import xsna.og8;
import xsna.oq;
import xsna.s3q0;
import xsna.s9a;
import xsna.sq40;
import xsna.tlo0;
import xsna.u11;
import xsna.vq40;
import xsna.wt30;
import xsna.xx1;
import xsna.y050;
import xsna.y150;

/* compiled from: MusicPlaylistCellVh.kt */
/* loaded from: classes16.dex */
public final class MusicPlaylistCellVh implements CatalogViewHolder, View.OnClickListener, cho {
    public final int b;
    public final b5a c;
    public final boolean d;
    public final boolean e;
    public final fl4 f;
    public final SearchStatInfoProvider g;
    public final sq40 h;
    public UIBlock i;
    public Playlist j;
    public VkCell k;
    public final vq40 l;

    /* compiled from: MusicPlaylistCellVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            Activity h;
            Playlist playlist;
            UIBlock uIBlock;
            MusicPlaylistCellVh musicPlaylistCellVh = (MusicPlaylistCellVh) this.receiver;
            if (!musicPlaylistCellVh.a()) {
                VkCell vkCell = musicPlaylistCellVh.k;
                SearchStatsLoggingInfo searchStatsLoggingInfo = null;
                if (vkCell == null) {
                    vkCell = null;
                }
                Context context = vkCell.getContext();
                if (context != null && (h = e3m.h(context)) != null && (playlist = musicPlaylistCellVh.j) != null && (uIBlock = musicPlaylistCellVh.i) != null) {
                    CatalogLaunchOrigin catalogLaunchOrigin = uIBlock.p;
                    if (playlist.B()) {
                        fl4.p(musicPlaylistCellVh.f, h, MusicPlaybackLaunchContext.Fb(uIBlock.f).Cb(catalogLaunchOrigin.h()), playlist, null, null, 24);
                    } else {
                        musicPlaylistCellVh.c.a(new cfp0(uIBlock, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
                        SearchStatInfoProvider searchStatInfoProvider = musicPlaylistCellVh.g;
                        if (searchStatInfoProvider != null) {
                            searchStatsLoggingInfo = searchStatInfoProvider.b(playlist.Eb() ? SchemeStat$EventItem.Type.ALBUM : SchemeStat$EventItem.Type.PLAYLIST, playlist.F, false);
                        }
                        musicPlaylistCellVh.f.U().a(h, new y050.b.a(playlist, uIBlock.f, uIBlock.b, searchStatsLoggingInfo, catalogLaunchOrigin.h()));
                    }
                }
            }
            return s3q0.a;
        }
    }

    public MusicPlaylistCellVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, sq40 sq40Var, int i) {
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        fl4 g = lyd.g();
        this.b = R.layout.catalog_music_playlist_list;
        this.c = b5aVar;
        this.d = z;
        this.e = z2;
        this.f = g;
        this.g = searchStatInfoProvider;
        this.h = sq40Var;
        this.l = new vq40();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkCell.Middle.e eVar;
        VkCell.Middle.d dVar;
        VkCell.Middle.c cVar;
        Size size;
        if (uIBlock instanceof UIBlockMusicPlaylist) {
            this.i = uIBlock;
            UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
            Playlist playlist = uIBlockMusicPlaylist.z;
            this.j = playlist;
            String str = playlist.h;
            String str2 = playlist.i;
            VkCell vkCell = this.k;
            if (vkCell == null) {
                vkCell = null;
            }
            Context context = vkCell.getContext();
            if (context == null && (context = e43.a) == null) {
                context = null;
            }
            String str3 = "";
            boolean z = this.d;
            String string = z ? playlist.Eb() ? context.getString(R.string.music_feed_album, c9b0.f(playlist)) : context.getString(R.string.music_feed_playlist) : xx1.u(playlist) ? str2 == null ? "" : str2 : (xx1.x(playlist) && xx1.w(playlist)) ? c9b0.d(context, playlist) : c9b0.g(context, playlist);
            if (string.length() == 0) {
                string = null;
            }
            VkCell vkCell2 = this.k;
            if (vkCell2 == null) {
                vkCell2 = null;
            }
            Context context2 = vkCell2.getContext();
            if (context2 == null && (context2 = e43.a) == null) {
                context2 = null;
            }
            if (!z) {
                if (playlist.Eb()) {
                    int i = playlist.l;
                    boolean z2 = i != 0;
                    boolean f = myc0.f(str2);
                    if (f && z2) {
                        str2 = context2.getString(R.string.music_dot_delimiter, Integer.valueOf(i), str2);
                    } else if (!f) {
                        str2 = z2 ? String.valueOf(i) : "";
                    }
                    str3 = str2;
                } else {
                    Float f2 = uIBlockMusicPlaylist.A;
                    if (f2 != null) {
                        str3 = context2.getString(R.string.music_recommended_playlist_percentage_for_list, Integer.valueOf((int) (f2.floatValue() * 100)), uIBlockMusicPlaylist.B);
                    }
                }
            }
            if (str3.length() == 0) {
                str3 = null;
            }
            VkCell vkCell3 = this.k;
            if (vkCell3 == null) {
                vkCell3 = null;
            }
            Context context3 = vkCell3.getContext();
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context3);
            VkCell vkCell4 = this.k;
            if (vkCell4 == null) {
                vkCell4 = null;
            }
            vkCell4.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new c150(playlist.m, playlist.p), VkCell.Left.Main.Size.Large)));
            VkCell vkCell5 = this.k;
            if (vkCell5 == null) {
                vkCell5 = null;
            }
            VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
            if (str == null) {
                eVar = null;
            } else {
                eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, str), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (!playlist.k || a2 == null) ? null : new VkCell.Middle.e.b.C0817b(new eko(a2), k1u0.c.a, (tlo0.f) null, (Size) null, 12), 18);
            }
            if (string == null) {
                dVar = null;
            } else {
                dVar = new VkCell.Middle.d(u11.f(tlo0.Companion, string), (gzs) null, xx1.x(playlist) ? 2 : 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50);
            }
            if (str3 == null) {
                cVar = null;
            } else {
                tlo0.h d = oq.d(tlo0.Companion, str3);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                cVar = new VkCell.Middle.c(d, null, 1, 2);
            }
            vkCell5.setMiddle(VkCell.Middle.a.a(aVar2, eVar, dVar, cVar, 8));
            float f3 = !playlist.B() ? 1.0f : 0.5f;
            boolean b = b(playlist);
            VkCell vkCell6 = this.k;
            if (vkCell6 == null) {
                vkCell6 = null;
            }
            VkCell.Right.c cVar2 = VkCell.Right.Companion;
            a250 a250Var = new a250(playlist, b, true);
            if (b) {
                size = new Size(iah0.a(36), iah0.a(16));
            } else {
                float f4 = 16;
                size = new Size(iah0.a(f4), iah0.a(f4));
            }
            vkCell6.setRight(VkCell.Right.c.a(cVar2, null, new VkCell.Right.e.d(a250Var, size), null, null, 29));
            VkCell vkCell7 = this.k;
            if (vkCell7 == null) {
                vkCell7 = null;
            }
            vkCell7.setAlpha(f3);
            VkCell vkCell8 = this.k;
            bwt0.Q(vkCell8 != null ? vkCell8 : null, R.id.catalog_ui_test_playlist, uIBlockMusicPlaylist.z.Hb());
        }
    }

    public final boolean a() {
        VkCell vkCell = this.k;
        if (vkCell == null) {
            vkCell = null;
        }
        Context context = vkCell.getContext();
        Activity h = context != null ? e3m.h(context) : null;
        if (h == null || this.h == null) {
            return false;
        }
        List<String> list = s9a.b;
        UIBlock uIBlock = this.i;
        if (!j5g.P(list, uIBlock != null ? uIBlock.b : null)) {
            UIBlock uIBlock2 = this.i;
            if (!epx.f(uIBlock2 != null ? uIBlock2.b : null, "offline_music_replacement_default")) {
                return false;
            }
        }
        return this.l.a(h);
    }

    public final boolean b(Playlist playlist) {
        if (playlist == null) {
            return false;
        }
        if (playlist.v <= 0 && playlist.y.isEmpty()) {
            return false;
        }
        DownloadingState downloadingState = playlist.H;
        return (downloadingState instanceof DownloadingState.Downloading) || (downloadingState instanceof DownloadingState.Downloaded) || (downloadingState instanceof DownloadingState.PartlyDownloaded) || (downloadingState instanceof DownloadingState.Corrupted) || this.e;
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        Size size;
        Playlist playlist = this.j;
        VkCell vkCell = this.k;
        VkCell.Right.d dVar = null;
        if (vkCell == null) {
            vkCell = null;
        }
        VkCell.Right.d right = vkCell.getRight();
        VkCell.Right.e eVar = right != null ? right.b : null;
        VkCell.Right.e.d dVar2 = eVar instanceof VkCell.Right.e.d ? (VkCell.Right.e.d) eVar : null;
        if (dVar2 == null) {
            return;
        }
        VkCell.f fVar = dVar2.a;
        a250 a250Var = fVar instanceof a250 ? (a250) fVar : null;
        if (a250Var == null) {
            return;
        }
        boolean z2 = !z && b(playlist);
        VkCell vkCell2 = this.k;
        VkCell vkCell3 = vkCell2 == null ? null : vkCell2;
        if (vkCell2 == null) {
            vkCell2 = null;
        }
        VkCell.Right.d right2 = vkCell2.getRight();
        if (right2 != null) {
            a250 a250Var2 = new a250(a250Var.a, z2, !z);
            if (z2) {
                size = new Size(iah0.a(36), iah0.a(16));
            } else {
                float f = 16;
                size = new Size(iah0.a(f), iah0.a(f));
            }
            dVar = VkCell.Right.d.a(right2, null, new VkCell.Right.e.d(a250Var2, size), null, null, null, 29);
        }
        vkCell3.setRight(dVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        inflate.setOnClickListener(new og8(this, 4));
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.cell_music_track);
        vkCell.setLeftMainPictureController(new b150());
        vkCell.setRightExtraViewController(new y150(this.e, new wt30(this, 1), new hvz(this, 14)));
        this.k = vkCell;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        Playlist playlist;
        UIBlock uIBlock;
        if (a() || view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (playlist = this.j) == null || (uIBlock = this.i) == null) {
            return;
        }
        SchemeStat$EventItem.Type type = playlist.Eb() ? SchemeStat$EventItem.Type.ALBUM : SchemeStat$EventItem.Type.PLAYLIST;
        SearchStatInfoProvider searchStatInfoProvider = this.g;
        SearchStatsLoggingInfo b = searchStatInfoProvider != null ? searchStatInfoProvider.b(type, playlist.F, false) : null;
        this.c.a(new cfp0(uIBlock, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
        this.f.U().a(h, new y050.b.a(playlist, uIBlock.f, uIBlock.b, b, null, 16));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
