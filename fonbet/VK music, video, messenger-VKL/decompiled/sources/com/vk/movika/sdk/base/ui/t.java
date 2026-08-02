package com.vk.movika.sdk.base.ui;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.design.view.editor.TransformOverlayView;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.views.AlbumDetailsDescriptionView;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import xsna.a6c;
import xsna.asu0;
import xsna.b96;
import xsna.bpn0;
import xsna.cmf;
import xsna.cr6;
import xsna.d27;
import xsna.dpb;
import xsna.ek;
import xsna.fe;
import xsna.fpf0;
import xsna.fvf;
import xsna.g27;
import xsna.gzs;
import xsna.hr8;
import xsna.hyd;
import xsna.irh0;
import xsna.j96;
import xsna.j9d0;
import xsna.jf0;
import xsna.k7m;
import xsna.l5f;
import xsna.m1e;
import xsna.m7m;
import xsna.myc0;
import xsna.n5f;
import xsna.na;
import xsna.njq;
import xsna.nwy;
import xsna.o0d;
import xsna.qcy;
import xsna.qdz;
import xsna.ra0;
import xsna.rgb;
import xsna.rye;
import xsna.s3q0;
import xsna.u59;
import xsna.u76;
import xsna.uvd;
import xsna.vta;
import xsna.xn50;
import xsna.y5c;
import xsna.y7m0;
import xsna.z89;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        m1e Df;
        int i = this.b;
        int i2 = 24;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((y) obj).d.v.a();
                return s3q0.a;
            case 1:
                fe feVar = (fe) obj;
                return new njq((DialogItemView) feVar.itemView, feVar.h6(), feVar.i6());
            case 2:
                int i4 = AlbumDetailsDescriptionView.q;
                return ((BridgeComponent) ((k7m) m7m.f((AlbumDetailsDescriptionView) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 3:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) obj;
                int i5 = AlbumDetailsFragment.p0;
                a.j.b.C1481b c1481b = a.j.b.C1481b.b;
                albumDetailsFragment.getClass();
                xn50.a.c(albumDetailsFragment, c1481b);
                return s3q0.a;
            case 4:
                com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) obj;
                com.vk.attachpicker.c cVar = aVar.b;
                AttachMusicFragment.a aVar2 = new AttachMusicFragment.a();
                long j = aVar.W;
                Bundle bundle = aVar2.j;
                bundle.putLong("peer_id", j);
                String str = aVar.X;
                if (str == null) {
                    str = "";
                }
                bundle.putString("peer_title", str);
                bundle.putBoolean("can_pin_attachment", aVar.Y);
                aVar2.z(cVar.a);
                aVar2.A(cVar.a);
                bundle.putParcelable("uid", aVar.a0);
                bundle.putBoolean("closeBtn", false);
                return aVar2.f();
            case 5:
                return ((SearchUiComponent) ((k7m) m7m.f((AuthorsCatalogRootVh) obj)).a(fpf0.a(SearchUiComponent.class))).W(new irh0(false, false, 495));
            case 6:
                int i6 = BaseAttachPickerFragment.y0;
                return new BaseAttachPickerFragment.g((BaseAttachPickerFragment) obj);
            case 7:
                j96 j96Var = (j96) obj;
                return new y7m0(j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke(), (u76) j96Var.e.invoke(), j96Var.d.b);
            case 8:
                int i7 = BasePhotoListFragment.m0;
                return new BasePhotoListFragment.d((BasePhotoListFragment) obj);
            case 9:
                cr6 cr6Var = (cr6) obj;
                int i8 = cr6.D;
                TextView textView = (TextView) cr6Var.findViewById(cr6Var.getSubtitleViewId());
                textView.setImportantForAccessibility(2);
                return textView;
            case 10:
                g27 g27Var = (g27) obj;
                return new jf0(g27Var.W, g27Var.V, new d27(g27Var, i3), g27Var.T, g27Var.U);
            case 11:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) obj;
                int i9 = BonusCatalogFragment.f0;
                ((qdz) bonusCatalogFragment.d0.getValue()).f().a(bonusCatalogFragment.requireContext(), "https://vk.cc/energy_description", true);
                return s3q0.a;
            case 12:
                ((zak0) ((hr8) obj).f).setValue(Boolean.valueOf(!r5.l()));
                return s3q0.a;
            case 13:
                return ((u59) obj).b.f();
            case 14:
                ((z89) obj).e(j9d0.h.a);
                return s3q0.a;
            case 15:
                CatalogGetAudioSearchRequestFactory catalogGetAudioSearchRequestFactory = (CatalogGetAudioSearchRequestFactory) obj;
                return catalogGetAudioSearchRequestFactory.d == CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInServiceKids ? CatalogGetAudioSearchRequestFactory.z : catalogGetAudioSearchRequestFactory.s.a.e;
            case 16:
                int i10 = ChannelFragment.a1;
                return new vta(new com.vk.movika.sdk.base.observable.e((ChannelFragment) obj, 20));
            case 17:
                return asu0.a.A(1, "channels-list-loader-update-" + ((rgb) obj).h.getAndIncrement());
            case 18:
                ((dpb) obj).b.invoke();
                return s3q0.a;
            case 19:
                return new y5c(((a6c) obj).k);
            case 20:
                int i11 = ClipFeedListFragment.a2;
                return ((AdStatPixelsComponent) m7m.d((ClipFeedListFragment) obj).a(fpf0.a(AdStatPixelsComponent.class))).R1();
            case 21:
                ViewParent parent = ((o0d) obj).a.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                }
                return s3q0.a;
            case 22:
                return ((cmf) ((uvd) obj).f.getValue()).a();
            case 23:
                return (TransformOverlayView) ((hyd) obj).i().findViewById(R.id.video_transform_overlay);
            case 24:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj;
                int i12 = ClipsEntryPointsFragment.i0;
                DiUnscopedComponent mo408a = m7m.d(clipsEntryPointsFragment).mo408a(fpf0.a(ClipsEntryPointsComponent.class));
                ClipsEntryPointsComponentImpl clipsEntryPointsComponentImpl = mo408a instanceof ClipsEntryPointsComponentImpl ? (ClipsEntryPointsComponentImpl) mo408a : null;
                return (clipsEntryPointsComponentImpl == null || (Df = clipsEntryPointsComponentImpl.Df()) == null) ? new m1e(new bpn0(new na(clipsEntryPointsFragment, 23)), new bpn0(new ra0(clipsEntryPointsFragment, i2))) : Df;
            case 25:
                int i13 = ClipsPlaylistPickerFragment.V;
                return ((ClipsConfigAuthorsComponent) m7m.d((ClipsPlaylistPickerFragment) obj).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 26:
                ClipsPlaylistsComponentImpl clipsPlaylistsComponentImpl = (ClipsPlaylistsComponentImpl) obj;
                qcy<Object>[] qcyVarArr = ClipsPlaylistsComponentImpl.h;
                return new com.vk.clips.playlists.b(clipsPlaylistsComponentImpl.Ff(), clipsPlaylistsComponentImpl.e());
            case 27:
                rye.b bVar = (rye.b) obj;
                gzs<s3q0> gzsVar = bVar.b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                bVar.b(0L, new ek(8), false);
                return s3q0.a;
            case 28:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                nwy nwyVar = ((ClipsViewerComponentImpl) obj).L;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[24];
                return new n5f((l5f) nwyVar.c());
            default:
                fvf fvfVar = (fvf) obj;
                myc0.h(fvfVar.W1(), null, null, new fvf.a.C2895a(fvfVar, null), 3);
                return s3q0.a;
        }
    }
}
