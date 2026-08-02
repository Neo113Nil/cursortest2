package com.vk.catalog2.common.ui.holders.video.playlist.cover;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionAddVideos;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumShuffle;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.catalog2.common.ui.holders.video.playlist.cover.a;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.drm0;
import xsna.epx;
import xsna.fks0;
import xsna.fxc0;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.mba;
import xsna.q4t0;
import xsna.r4t0;
import xsna.s3q0;
import xsna.u2k0;
import xsna.u4t0;
import xsna.zak0;

/* compiled from: VideoPlaylistCoverComposeVh.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistCoverComposeVh extends VideoPlaylistCover {
    public final u4t0 e;
    public final fks0 f;
    public r4t0 g;
    public int h;

    /* compiled from: VideoPlaylistCoverComposeVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<com.vk.catalog2.common.ui.holders.video.playlist.cover.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.catalog2.common.ui.holders.video.playlist.cover.a aVar) {
            VideoPlaylistCoverComposeVh.e((VideoPlaylistCoverComposeVh) this.receiver, aVar);
            return s3q0.a;
        }
    }

    public VideoPlaylistCoverComposeVh(mba mbaVar, b5a b5aVar, u4t0 u4t0Var, fks0 fks0Var) {
        super(mbaVar, b5aVar);
        this.e = u4t0Var;
        this.f = fks0Var;
    }

    public static final void e(VideoPlaylistCoverComposeVh videoPlaylistCoverComposeVh, com.vk.catalog2.common.ui.holders.video.playlist.cover.a aVar) {
        r4t0 r4t0Var;
        videoPlaylistCoverComposeVh.getClass();
        if (epx.f(aVar, a.c.a)) {
            super.z(R.id.watch_button, videoPlaylistCoverComposeVh.d);
            return;
        }
        if (!epx.f(aVar, a.C0493a.a)) {
            if (epx.f(aVar, a.b.a)) {
                videoPlaylistCoverComposeVh.z(R.id.subscribe_button, videoPlaylistCoverComposeVh.d);
                return;
            } else {
                if (!epx.f(aVar, a.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                super.z(R.id.watch_with_shuffle_button, videoPlaylistCoverComposeVh.d);
                return;
            }
        }
        UIBlock uIBlock = videoPlaylistCoverComposeVh.d;
        UIBlockVideoAlbum uIBlockVideoAlbum = uIBlock instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) uIBlock : null;
        if (uIBlockVideoAlbum == null || uIBlockVideoAlbum.y == null || (r4t0Var = videoPlaylistCoverComposeVh.g) == null || r4t0Var.getContext() == null) {
            return;
        }
        fxc0.B().getClass();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.e.a();
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        g(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCover
    public final void c(UIBlock uIBlock) {
        this.d = uIBlock;
        g(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCover
    public final void d(float f) {
        r4t0 r4t0Var = this.g;
        if (r4t0Var != null) {
            ((zak0) r4t0Var.m).setValue(q4t0.a(r4t0Var.getViewState().getValue(), f, null, false, false, null, false, false, false, false, false, null, 2046));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fe A[EDGE_INSN: B:95:0x00fe->B:57:0x00fe BREAK  A[LOOP:3: B:48:0x00e4->B:93:0x00e4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(UIBlock uIBlock) {
        Context context;
        Context context2;
        String str;
        Iterator<T> it;
        r4t0 r4t0Var;
        boolean z;
        if (!(uIBlock instanceof UIBlockVideoAlbum)) {
            return;
        }
        UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) uIBlock;
        VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
        List<UIBlockAction> list = uIBlockVideoAlbum.z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof UIBlockActionPlayVideosFromBlock) {
                arrayList.add(obj);
            }
        }
        UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock = (UIBlockActionPlayVideosFromBlock) j5g.a0(arrayList);
        boolean z2 = fxc0.B().J().C1() && !videoAlbum.q.isEmpty();
        Object obj2 = null;
        if (uIBlockActionPlayVideosFromBlock != null) {
            String str2 = uIBlockActionPlayVideosFromBlock.z;
            if (!epx.f(uIBlockActionPlayVideosFromBlock.A, BaseLinkButtonStyleDto.SECONDARY.i())) {
                if (drm0.N(str2)) {
                    if (z2) {
                        r4t0 r4t0Var2 = this.g;
                        if (r4t0Var2 != null && (context2 = r4t0Var2.getContext()) != null) {
                            str2 = context2.getString(R.string.video_catalog_watch_from_beginning);
                        }
                    } else {
                        r4t0 r4t0Var3 = this.g;
                        if (r4t0Var3 != null && (context = r4t0Var3.getContext()) != null) {
                            str2 = context.getString(R.string.video_catalog_watch_all);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof UIBlockActionToggleAlbumSubscription) {
                            arrayList2.add(obj3);
                        }
                    }
                    UIBlockActionToggleAlbumSubscription uIBlockActionToggleAlbumSubscription = (UIBlockActionToggleAlbumSubscription) j5g.a0(arrayList2);
                    this.e.d(uIBlockActionToggleAlbumSubscription != null);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof UIBlockActionAddVideos) {
                            arrayList3.add(obj4);
                        }
                    }
                    UIBlockActionAddVideos uIBlockActionAddVideos = (UIBlockActionAddVideos) j5g.a0(arrayList3);
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if ((((UIBlockAction) next) instanceof UIBlockActionToggleAlbumShuffle) && this.f.r()) {
                            obj2 = next;
                            break;
                        }
                    }
                    UIBlockAction uIBlockAction = (UIBlockAction) obj2;
                    r4t0Var = this.g;
                    if (r4t0Var != null) {
                        ImageSize Cb = videoAlbum.h.Cb(r4t0Var.getWidth() > 0 ? r4t0Var.getWidth() : this.h, true, false);
                        if (Cb != null) {
                            Image image = Cb.d;
                            if (image.c >= image.b) {
                                z = true;
                                q4t0 value = r4t0Var.getViewState().getValue();
                                boolean z3 = uIBlockActionPlayVideosFromBlock == null;
                                boolean z4 = uIBlockActionToggleAlbumSubscription == null;
                                boolean z5 = uIBlockActionAddVideos == null;
                                boolean z6 = videoAlbum.l;
                                boolean z7 = videoAlbum.i;
                                if (Cb != null || (r2 = Cb.d.d) == null) {
                                    String str3 = "";
                                }
                                ((zak0) r4t0Var.m).setValue(q4t0.a(value, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, str3, z7, z, str, z6, z3, z4, z5, uIBlockAction == null, null, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT));
                                return;
                            }
                        }
                        z = false;
                        q4t0 value2 = r4t0Var.getViewState().getValue();
                        if (uIBlockActionPlayVideosFromBlock == null) {
                        }
                        if (uIBlockActionToggleAlbumSubscription == null) {
                        }
                        if (uIBlockActionAddVideos == null) {
                        }
                        boolean z62 = videoAlbum.l;
                        boolean z72 = videoAlbum.i;
                        if (Cb != null) {
                        }
                        String str32 = "";
                        ((zak0) r4t0Var.m).setValue(q4t0.a(value2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, str32, z72, z, str, z62, z3, z4, z5, uIBlockAction == null, null, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT));
                        return;
                    }
                    return;
                }
                str = str2;
                ArrayList arrayList22 = new ArrayList();
                while (r8.hasNext()) {
                }
                UIBlockActionToggleAlbumSubscription uIBlockActionToggleAlbumSubscription2 = (UIBlockActionToggleAlbumSubscription) j5g.a0(arrayList22);
                this.e.d(uIBlockActionToggleAlbumSubscription2 != null);
                ArrayList arrayList32 = new ArrayList();
                while (r9.hasNext()) {
                }
                UIBlockActionAddVideos uIBlockActionAddVideos2 = (UIBlockActionAddVideos) j5g.a0(arrayList32);
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                UIBlockAction uIBlockAction2 = (UIBlockAction) obj2;
                r4t0Var = this.g;
                if (r4t0Var != null) {
                }
            }
        }
        str = null;
        ArrayList arrayList222 = new ArrayList();
        while (r8.hasNext()) {
        }
        UIBlockActionToggleAlbumSubscription uIBlockActionToggleAlbumSubscription22 = (UIBlockActionToggleAlbumSubscription) j5g.a0(arrayList222);
        this.e.d(uIBlockActionToggleAlbumSubscription22 != null);
        ArrayList arrayList322 = new ArrayList();
        while (r9.hasNext()) {
        }
        UIBlockActionAddVideos uIBlockActionAddVideos22 = (UIBlockActionAddVideos) j5g.a0(arrayList322);
        it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        UIBlockAction uIBlockAction22 = (UIBlockAction) obj2;
        r4t0Var = this.g;
        if (r4t0Var != null) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r4t0 r4t0Var = new r4t0(layoutInflater.getContext());
        r4t0Var.setId(R.id.playlist_header_layout);
        r4t0Var.setFitsSystemWindows(true);
        this.g = r4t0Var;
        ((zak0) r4t0Var.m).setValue(q4t0.a(r4t0Var.getViewState().getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, false, null, false, false, false, false, false, new a(1, this, VideoPlaylistCoverComposeVh.class, "handleAction", "handleAction(Lcom/vk/catalog2/common/ui/holders/video/playlist/cover/VideoPlaylistCoverAction;)V", 0), IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
        this.e.f.add(new u2k0(r4t0Var, 23));
        int z = iah0.z(r4t0Var.getContext());
        int a2 = iah0.a(800);
        if (z > a2) {
            z = a2;
        }
        this.h = z;
        return r4t0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        VideoAlbum videoAlbum;
        r4t0 r4t0Var;
        Context context;
        super.z(i, uIBlock);
        if (i != R.id.subscribe_button || uIBlock == null) {
            return;
        }
        UIBlockVideoAlbum uIBlockVideoAlbum = uIBlock instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) uIBlock : null;
        if (uIBlockVideoAlbum == null || (videoAlbum = uIBlockVideoAlbum.y) == null || (r4t0Var = this.g) == null || (context = r4t0Var.getContext()) == null) {
            return;
        }
        u4t0 u4t0Var = this.e;
        if (u4t0Var.j.h()) {
            u4t0Var.e(context, videoAlbum);
        }
    }
}
