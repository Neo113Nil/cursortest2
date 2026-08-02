package com.vk.movika.sdk.base.logic.interactor;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.main.AuthStatSender;
import com.vk.balance.BalanceFragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockProfileClipDrafts;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVhOld;
import com.vk.channels.api.Channel;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.actionlinks.CheckLinkResponse;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.albums.presentation.a;
import com.vk.photos.root.albums.presentation.views.AlbumsRecyclerPaginatedView;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.actionlinks.views.holders.link.ItemLinkView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.b7d0;
import xsna.bn40;
import xsna.c5g;
import xsna.cm0;
import xsna.cn70;
import xsna.cr6;
import xsna.cvk;
import xsna.d06;
import xsna.dhr0;
import xsna.ecb;
import xsna.eeu0;
import xsna.f4m;
import xsna.fk1;
import xsna.fpf0;
import xsna.gg1;
import xsna.gpb;
import xsna.h7u0;
import xsna.i05;
import xsna.izs;
import xsna.j05;
import xsna.ja;
import xsna.k05;
import xsna.kea;
import xsna.kf7;
import xsna.kp7;
import xsna.krv0;
import xsna.li8;
import xsna.lxa;
import xsna.m6k;
import xsna.m7m;
import xsna.mi8;
import xsna.mm7;
import xsna.mwo0;
import xsna.mzp0;
import xsna.oga0;
import xsna.pg1;
import xsna.pli;
import xsna.pp0;
import xsna.pv4;
import xsna.q500;
import xsna.qdd;
import xsna.qg1;
import xsna.qu4;
import xsna.qv4;
import xsna.rm1;
import xsna.rtb0;
import xsna.s3q0;
import xsna.sm1;
import xsna.sq1;
import xsna.t12;
import xsna.tbj0;
import xsna.tlo0;
import xsna.tm1;
import xsna.twr0;
import xsna.u12;
import xsna.ucp;
import xsna.und;
import xsna.uqe;
import xsna.vga;
import xsna.vm1;
import xsna.vqt;
import xsna.vux;
import xsna.w19;
import xsna.w9y;
import xsna.wjs0;
import xsna.wr7;
import xsna.wux;
import xsna.xl9;
import xsna.xn50;
import xsna.xo2;
import xsna.ywo0;
import xsna.z37;
import xsna.zak0;
import xsna.zda;
import xsna.zm1;
import xsna.zo6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        View view;
        int i = this.b;
        int i2 = 3;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        r5 = null;
        View view2 = null;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((com.vk.movika.sdk.base.model.s) obj2).b((String) obj);
            case 1:
                L.A("success " + ((Boolean) obj));
                ((ja) obj2).a.d0();
                cvk.u(R.string.money_transfer_request_sent, false);
                return s3q0.a;
            case 2:
                AddLinkPresenter addLinkPresenter = (AddLinkPresenter) obj2;
                CheckLinkResponse checkLinkResponse = (CheckLinkResponse) obj;
                if (checkLinkResponse.b) {
                    cm0 cm0Var = addLinkPresenter.e;
                    if (cm0Var == null) {
                        cm0Var = null;
                    }
                    ItemLinkView itemLinkView = cm0Var.g;
                    if (itemLinkView == null) {
                        itemLinkView = null;
                    }
                    xo2.f(itemLinkView, true, true, 300L);
                    cm0 cm0Var2 = addLinkPresenter.e;
                    if (cm0Var2 == null) {
                        cm0Var2 = null;
                    }
                    cm0Var2.f(true);
                    wux wuxVar = addLinkPresenter.l;
                    if (wuxVar == null) {
                        wuxVar = null;
                    }
                    vux vuxVar = wuxVar.b;
                    (vuxVar != null ? vuxVar : null).setValid(true);
                } else {
                    cm0 cm0Var3 = addLinkPresenter.e;
                    if (cm0Var3 == null) {
                        cm0Var3 = null;
                    }
                    cm0Var3.c(true);
                    String str = checkLinkResponse.c;
                    if (str != null) {
                        cm0 cm0Var4 = addLinkPresenter.e;
                        if (cm0Var4 == null) {
                            cm0Var4 = null;
                        }
                        VkText vkText = cm0Var4.h;
                        if (vkText == null) {
                            vkText = null;
                        }
                        vkText.setText(str);
                        cm0 cm0Var5 = addLinkPresenter.e;
                        if (cm0Var5 == null) {
                            cm0Var5 = null;
                        }
                        VkText vkText2 = cm0Var5.h;
                        if (vkText2 == null) {
                            vkText2 = null;
                        }
                        xo2.f(vkText2, true, true, 300L);
                    }
                    wux wuxVar2 = addLinkPresenter.l;
                    if (wuxVar2 == null) {
                        wuxVar2 = null;
                    }
                    vux vuxVar2 = wuxVar2.b;
                    (vuxVar2 != null ? vuxVar2 : null).setValid(false);
                }
                return s3q0.a;
            case 3:
                rtb0.a aVar = (rtb0.a) obj;
                b7d0.a invoke = ((pp0) obj2).e.invoke();
                if (invoke != null) {
                    invoke.b0(aVar.a);
                }
                return s3q0.a;
            case 4:
                ((gg1) obj2).p.b(i.r.a);
                return s3q0.a;
            case 5:
                AlbumsFragment albumsFragment = (AlbumsFragment) obj2;
                ?? r1 = albumsFragment.a0;
                sq1 sq1Var = (sq1) obj;
                int i4 = AlbumsFragment.j0;
                if (sq1Var.equals(sq1.d.a)) {
                    com.vk.lists.c cVar = albumsFragment.Q;
                    if (cVar != null) {
                        cVar.p(true);
                    }
                } else if (sq1Var instanceof sq1.c) {
                    sq1.c cVar2 = (sq1.c) sq1Var;
                    int i5 = cVar2.b;
                    RecyclerView recyclerView = (RecyclerView) albumsFragment.requireView().findViewById(R.id.rv_system_albums);
                    AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) albumsFragment.requireView().findViewById(R.id.albums_recycler);
                    if (!cVar2.c) {
                        recyclerView = albumsRecyclerPaginatedView.getRecyclerView();
                    }
                    RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i5);
                    if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                        List<fk1.a> list = cVar2.d;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        for (fk1.a aVar2 : list) {
                            tlo0.f fVar = aVar2.b;
                            Context requireContext = albumsFragment.requireContext();
                            fVar.getClass();
                            arrayList.add(new VkContextMenu.a(tlo0.b.a(fVar, requireContext).toString(), dhr0.t.b(aVar2.a, aVar2.c), null, false, false, new tm1(albumsFragment, aVar2, cVar2, i3), 28));
                        }
                        int i6 = AlbumsFragment.j0;
                        boolean z2 = i5 % AlbumsFragment.b.a(albumsFragment.requireContext()) == AlbumsFragment.b.a(albumsFragment.requireContext()) / 2;
                        int l = krv0.l(R.attr.vk_ui_icon_accent);
                        view.getContext();
                        e.b bVar = new e.b(view, null, null, l, 6);
                        bVar.w = R.layout.ds_internal_context_menu_item;
                        bVar.m = cn70.b(8);
                        bVar.h(arrayList);
                        VkContextMenu a = bVar.a();
                        pg1 pg1Var = new pg1(view, c == true ? 1 : 0);
                        com.vk.core.view.components.context.menu.e eVar = (com.vk.core.view.components.context.menu.e) a;
                        eVar.p = pg1Var;
                        eVar.q = new vm1(view, 0);
                        pli.r(a, view, z2);
                    }
                } else if (sq1Var instanceof sq1.a) {
                    PhotoAlbum photoAlbum = ((sq1.a) sq1Var).a;
                    if (photoAlbum.b == -9000) {
                        xn50.a.c(albumsFragment, a.f.b);
                        ((oga0) albumsFragment.X.getValue()).h(albumsFragment.kn());
                    } else {
                        m6k m6kVar = new m6k();
                        m6kVar.C(albumsFragment.ho());
                        m6kVar.y(photoAlbum);
                        m6kVar.g(7647, albumsFragment);
                    }
                } else if (sq1Var instanceof sq1.e) {
                    PhotoAlbum photoAlbum2 = ((sq1.e) sq1Var).a;
                    ActionsInfo a2 = ((SharingComponent) r1.getValue()).v().a(photoAlbum2);
                    AttachmentInfo a3 = ((SharingComponent) r1.getValue()).u().a(photoAlbum2);
                    tbj0 a4 = ((SharingComponent) r1.getValue()).F2().a(albumsFragment.requireContext());
                    a4.d = a2;
                    a4.c = a3;
                    a4.h = Integer.valueOf(SharingDataType.ALBUM.ordinal());
                    a4.c();
                } else if (sq1Var instanceof sq1.f) {
                    sq1.f fVar2 = (sq1.f) sq1Var;
                    int i7 = h7u0.p;
                    h7u0.a c3 = h7u0.b.c(albumsFragment.requireContext());
                    tlo0.f fVar3 = fVar2.a;
                    Context requireContext2 = albumsFragment.requireContext();
                    fVar3.getClass();
                    c3.h0(tlo0.b.a(fVar3, requireContext2));
                    tlo0.f fVar4 = fVar2.b;
                    Context requireContext3 = albumsFragment.requireContext();
                    fVar4.getClass();
                    c3.a.f = tlo0.b.a(fVar4, requireContext3);
                    tlo0.f fVar5 = fVar2.c;
                    Context requireContext4 = albumsFragment.requireContext();
                    fVar5.getClass();
                    c3.d0(tlo0.b.a(fVar5, requireContext4), new rm1(fVar2, i3));
                    c3.W(R.string.cancel, new sm1(i3));
                    c3.m();
                } else if (sq1Var instanceof sq1.g) {
                    ((sq1.g) sq1Var).a.a(albumsFragment.requireContext(), new zm1(1, albumsFragment, AlbumsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0)).c();
                } else {
                    if (!(sq1Var instanceof sq1.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) m7m.d(albumsFragment).a(fpf0.a(ProfileFragmentProviderComponent.class));
                    UserId userId = ((sq1.b) sq1Var).a;
                    ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                    profileFragmentProviderComponent.ye(userId, null).l((FragmentImpl) albumsFragment.getParentFragment());
                    Fragment parentFragment = albumsFragment.getParentFragment();
                    FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                    if (fragmentImpl != null) {
                        fragmentImpl.finish();
                    }
                }
                return s3q0.a;
            case 6:
                com.vk.catalog2.common.ui.mvp.auto.a aVar3 = (com.vk.catalog2.common.ui.mvp.auto.a) obj2;
                bn40.d("Failed to load artist's popular tracks");
                aVar3.c(aVar3.a, "net_error");
                return s3q0.a;
            case 7:
                ArtistInfoVhOld artistInfoVhOld = (ArtistInfoVhOld) obj2;
                artistInfoVhOld.m = null;
                ImageView imageView = artistInfoVhOld.h;
                (imageView != null ? imageView : null).setImageDrawable(artistInfoVhOld.q);
                return s3q0.a;
            case 8:
                pv4 pv4Var = (pv4) obj2;
                if (((qv4.d) obj).h) {
                    qu4 qu4Var = pv4Var.j;
                    qu4 qu4Var2 = qu4Var != null ? qu4Var : null;
                    ViewPropertyAnimator withEndAction = qu4Var2.b.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(qu4Var2.q).setStartDelay(200L).withStartAction(new t12(qu4Var2, c2 == true ? 1 : 0)).withEndAction(new u12(qu4Var2, i2));
                    withEndAction.start();
                    xo2.b(withEndAction, qu4Var2.n);
                }
                return s3q0.a;
            case 9:
                k05 k05Var = (k05) obj2;
                int floatValue = (int) ((Float) obj).floatValue();
                j05 j05Var = (j05) k05Var.b;
                if (j05Var != null) {
                    ywo0 ywo0Var = ((mwo0) k05Var.a).d;
                    float d = ywo0Var.r.d(ywo0Var.s);
                    float f = ((i05) j05Var.b).j;
                    float f2 = floatValue / 2;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    float[] fArr = (float[]) j05Var.c;
                    int length = fArr.length;
                    float[] copyOf = Arrays.copyOf(fArr, length + 4);
                    System.arraycopy(new float[]{d, f3, d, f4}, 0, copyOf, length, 4);
                    j05Var.c = copyOf;
                    j05Var.a += 4;
                }
                return s3q0.a;
            case 10:
                d06.a aVar4 = (d06.a) obj;
                BalanceFragment balanceFragment = ((d06) obj2).b;
                int i8 = aVar4.a;
                TextView textView = balanceFragment.W;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(balanceFragment.getResources().getQuantityString(R.plurals.balance_votes, i8, Integer.valueOf(i8)));
                SwipeRefreshLayout swipeRefreshLayout = balanceFragment.V;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                swipeRefreshLayout.setRefreshing(false);
                TextView textView2 = balanceFragment.W;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setVisibility(0);
                ProgressBar progressBar = balanceFragment.X;
                if (progressBar == null) {
                    progressBar = null;
                }
                f4m.j(progressBar);
                View view3 = balanceFragment.Y;
                f4m.j(view3 != null ? view3 : null);
                balanceFragment.f0 = true;
                balanceFragment.ko(aVar4.b);
                balanceFragment.lo(aVar4.c);
                balanceFragment.jo();
                return s3q0.a;
            case 11:
                ((com.vk.auth.verification.base.b) obj2).e.g(AuthStatSender.Screen.PHONE_CODE);
                return s3q0.a;
            case 12:
                ((zo6) obj2).g();
                return s3q0.a;
            case 13:
                ((cr6) obj2).x.invoke(c.s0.a.b.b);
                return s3q0.a;
            case 14:
                kf7 kf7Var = (kf7) obj;
                if (kf7Var == ((com.vk.core.compose.component.datetime.a) obj2).f) {
                    return null;
                }
                return kf7Var.c;
            case 15:
                BookingCalendarScreenFragment bookingCalendarScreenFragment = (BookingCalendarScreenFragment) obj2;
                wr7.b(bookingCalendarScreenFragment, bookingCalendarScreenFragment.Q, (mm7) obj);
                return s3q0.a;
            case 16:
                ((izs) ((zak0) ((kp7) obj2).b).getValue()).invoke((String) obj);
                return s3q0.a;
            case 17:
                ((z37) obj2).b((com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a) obj);
                return s3q0.a;
            case 18:
                return new mi8((ViewGroup) obj, ((li8) obj2).i);
            case 19:
                return new xl9(((w19.b) obj2).b);
            case 20:
                CanvasStickerDraft.LoadableCanvasStickerDraft loadableCanvasStickerDraft = (CanvasStickerDraft.LoadableCanvasStickerDraft) obj2;
                w9y w9yVar = (w9y) obj;
                Serializer.c<CanvasStickerDraft.LoadableCanvasStickerDraft> cVar3 = CanvasStickerDraft.LoadableCanvasStickerDraft.CREATOR;
                w9yVar.e("loadable_sticker", "class_id");
                w9yVar.g("transform", loadableCanvasStickerDraft.b);
                q500 q500Var = loadableCanvasStickerDraft.c;
                w9yVar.e(q500Var != null ? q500Var.toString() : null, "range");
                w9yVar.e(loadableCanvasStickerDraft.e, "url");
                w9yVar.e(loadableCanvasStickerDraft.f.i(), "type");
                w9yVar.e(loadableCanvasStickerDraft.g, "meta_info");
                w9yVar.e(loadableCanvasStickerDraft.h, "preview_url");
                return s3q0.a;
            case 21:
                kea keaVar = (kea) obj2;
                Throwable th = (Throwable) obj;
                mzp0 mzp0Var = keaVar.i.c.g;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                zda zdaVar = keaVar.s;
                if (zdaVar != null) {
                    zdaVar.I(th);
                }
                L.j(th, "Catalog");
                return s3q0.a;
            case 22:
                ((lxa) obj2).d.onNext((Channel) obj);
                return s3q0.a;
            case 23:
                ecb ecbVar = (ecb) obj2;
                Channel channel = (Channel) obj;
                ecbVar.o = channel;
                ecbVar.q = channel.d;
                ecbVar.r = channel.v;
                ecbVar.s = channel.w;
                ecbVar.a1();
                return s3q0.a;
            case 24:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new qg1(i2, (gpb) obj2, (ProfilesInfo) obj));
                return s3q0.a;
            case 25:
                UIBlockProfileClipDrafts uIBlockProfileClipDrafts = (UIBlockProfileClipDrafts) obj2;
                ArrayList<UIBlock> arrayList2 = ((UIBlockList) obj).y;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator<T> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((UIBlock) it.next()).e == uIBlockProfileClipDrafts.e) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 26:
                View view4 = ((FragmentImpl) obj2).getView();
                if (view4 != null && view4.isAttachedToWindow()) {
                    view2 = view4;
                }
                ucp.f(view2);
                return s3q0.a;
            case 27:
                ((vga) ((qdd) obj2).a.getValue()).b(((qdd.c.C3559c) obj).a);
                return s3q0.a;
            case 28:
                und undVar = (und) obj2;
                vqt vqtVar = (vqt) obj;
                undVar.i.l(vqtVar.b);
                com.vk.lists.c cVar4 = undVar.i;
                String j = cVar4.j();
                if (j == null || j.length() == 0 || vqtVar.a.isEmpty()) {
                    cVar4.r(false);
                }
                return s3q0.a;
            default:
                final ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj2;
                uqe uqeVar = (uqe) obj;
                int i9 = ClipsPlaylistPickerFragment.V;
                if (uqeVar instanceof uqe.a) {
                    clipsPlaylistPickerFragment.setResult(0);
                    clipsPlaylistPickerFragment.finish();
                } else if (uqeVar instanceof uqe.b) {
                    (com.vk.toggle.d.R() ? new h7u0.a(clipsPlaylistPickerFragment.requireContext()) : new eeu0.a(clipsPlaylistPickerFragment.requireContext())).q(R.string.clips_playlist_dialog_delete_descrioption).setNegativeButton(R.string.clips_playlist_dialog_delete_apply, new DialogInterface.OnClickListener() { // from class: xsna.rqe
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            int i11 = ClipsPlaylistPickerFragment.V;
                            ClipsPlaylistPickerFragment clipsPlaylistPickerFragment2 = ClipsPlaylistPickerFragment.this;
                            clipsPlaylistPickerFragment2.getClass();
                            xn50.a.c(clipsPlaylistPickerFragment2, oqe.b);
                        }
                    }).v(R.string.clips_playlist_dialog_delete_cancel, null).m();
                } else {
                    if (!(uqeVar instanceof uqe.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uqe.c cVar5 = (uqe.c) uqeVar;
                    wjs0.a(new twr0(cVar5.a.f));
                    clipsPlaylistPickerFragment.setResult(-1, new Intent().putExtra("playlist_result", cVar5.a));
                    clipsPlaylistPickerFragment.finish();
                }
                return s3q0.a;
        }
    }
}
