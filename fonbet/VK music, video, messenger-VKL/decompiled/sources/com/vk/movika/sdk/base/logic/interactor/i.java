package com.vk.movika.sdk.base.logic.interactor;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVhOld;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.lists.c;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.metrics.eventtracking.Event;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.identity.WebCountry;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Parameters;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.webapp.community_picker.AppsCommunityPickerFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.core.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import xsna.b1a;
import xsna.b510;
import xsna.bdb;
import xsna.bwt0;
import xsna.c0v0;
import xsna.c1o;
import xsna.c200;
import xsna.c5g;
import xsna.cq;
import xsna.cvk;
import xsna.cxo;
import xsna.dvd0;
import xsna.dw20;
import xsna.e5t;
import xsna.edi;
import xsna.el3;
import xsna.epx;
import xsna.eqq;
import xsna.f370;
import xsna.f3s;
import xsna.f5z;
import xsna.fkq0;
import xsna.fsi0;
import xsna.fsk;
import xsna.fyr0;
import xsna.g2y;
import xsna.g7g0;
import xsna.g8;
import xsna.gvv;
import xsna.h010;
import xsna.h3o;
import xsna.h3t;
import xsna.h5j0;
import xsna.h5s;
import xsna.h8;
import xsna.hg1;
import xsna.hmd0;
import xsna.hyg0;
import xsna.ikv0;
import xsna.izs;
import xsna.j5g;
import xsna.jqm;
import xsna.js5;
import xsna.jsf0;
import xsna.jvv;
import xsna.ktp0;
import xsna.kyo0;
import xsna.l5g;
import xsna.le3;
import xsna.lsi0;
import xsna.mc90;
import xsna.mol0;
import xsna.myc0;
import xsna.oe5;
import xsna.pdm;
import xsna.pf80;
import xsna.pn00;
import xsna.q7u;
import xsna.qdm;
import xsna.qo6;
import xsna.qw40;
import xsna.rdm;
import xsna.rey;
import xsna.rfj;
import xsna.rg50;
import xsna.rkz;
import xsna.rpm;
import xsna.rsg0;
import xsna.s3q0;
import xsna.st1;
import xsna.ts90;
import xsna.tt1;
import xsna.u1c0;
import xsna.ulp0;
import xsna.uy9;
import xsna.uyh0;
import xsna.vs00;
import xsna.w2w;
import xsna.w3s;
import xsna.wh50;
import xsna.wjs0;
import xsna.wr00;
import xsna.wsp;
import xsna.wzs;
import xsna.x110;
import xsna.xid0;
import xsna.xpp;
import xsna.xwv0;
import xsna.yfb;
import xsna.yid0;
import xsna.yj40;
import xsna.ypt;
import xsna.yvj;
import xsna.zak0;
import xsna.zk10;
import xsna.zrz;
import xsna.zuv;
import xsna.zwl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v59, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        VkContentBadge.Appearance appearance;
        List<MediaStoreEntry> list;
        List<MediaStoreEntry> list2;
        VkUiView view;
        jvv jvvVar;
        dw20.a c;
        dw20.a i2;
        ChatFragment.j jVar;
        x w0;
        List<fsi0> list3;
        lsi0 lsi0Var;
        int i3 = 8;
        int i4 = 6;
        r8 = null;
        io.reactivex.rxjava3.disposables.b bVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                Chapter chapter = (Chapter) this.d;
                com.vk.movika.sdk.base.logic.processor.a aVar = (com.vk.movika.sdk.base.logic.processor.a) obj;
                com.vk.movika.sdk.base.model.o h = aVar.a.h(aVar.b, str);
                aVar.b = h;
                com.vk.movika.sdk.base.model.c cVar = new com.vk.movika.sdk.base.model.c(str);
                List<com.vk.movika.sdk.base.model.c> list4 = h.h;
                if (!list4.contains(cVar)) {
                    h = com.vk.movika.sdk.base.model.o.a(h, null, null, j5g.v0(cVar, list4), 127);
                }
                aVar.b = h;
                ArrayList arrayList = chapter.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((com.vk.movika.sdk.base.model.f) it.next()).a);
                }
                com.vk.ecomm.catalog.impl.geo.a aVar2 = aVar.a;
                com.vk.movika.sdk.base.model.o oVar = aVar.b;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    oVar = aVar2.a(oVar, new com.vk.movika.sdk.base.logic.processor.b((String) it2.next(), 0));
                }
                aVar.b = oVar;
                return s3q0.a;
            case 1:
                jsf0 jsf0Var = (jsf0) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                return jsf0Var.i(videoFile.o0(), new UserId(videoFile.I0().b)).l(new h8(new g8((int) (objArr2 == true ? 1 : 0)), objArr == true ? 1 : 0)).o(EmptyList.b);
            case 2:
                AbsFollowersListFragment absFollowersListFragment = (AbsFollowersListFragment) this.c;
                CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) this.d;
                w3s.d dVar = (w3s.d) obj;
                f3s f3sVar = absFollowersListFragment.V;
                if (f3sVar == null) {
                    f3sVar = null;
                }
                f3sVar.setItems(dVar.a);
                f3s f3sVar2 = absFollowersListFragment.V;
                (f3sVar2 != null ? f3sVar2 : null).notifyDataSetChanged();
                customSwipeRefreshLayout.setRefreshing(dVar.b);
                return s3q0.a;
            case 3:
                AppsCommunityPickerFragment appsCommunityPickerFragment = (AppsCommunityPickerFragment) this.c;
                AppsCommunityPickerFragment.c cVar2 = (AppsCommunityPickerFragment.c) this.d;
                le3 le3Var = (le3) appsCommunityPickerFragment.S;
                if (le3Var != null) {
                    le3Var.Y((AppsGroupsContainer) cVar2.m);
                }
                return s3q0.a;
            case 4:
                ArtistInfoVhOld artistInfoVhOld = (ArtistInfoVhOld) this.c;
                Artist artist = (Artist) this.d;
                artistInfoVhOld.m = null;
                ImageView imageView = artistInfoVhOld.h;
                if (imageView == null) {
                    imageView = null;
                }
                bwt0.p0(imageView, artist.h);
                ImageView imageView2 = artistInfoVhOld.h;
                (imageView2 != null ? imageView2 : null).setImageDrawable(artistInfoVhOld.p);
                return s3q0.a;
            case 5:
                VideoFile videoFile2 = (VideoFile) this.c;
                ActionLink actionLink = (ActionLink) this.d;
                cvk.u(R.string.attach_action_link_successed, false);
                videoFile2.u7(actionLink);
                wjs0.a(new fyr0(videoFile2));
                return s3q0.a;
            case 6:
                Boolean bool = (Boolean) this.c;
                bdb bdbVar = (bdb) obj;
                return bdb.a(bdbVar, 0, 0, 0, 0, 0, 0, null, null, null, false, bool != null ? bool.booleanValue() : bdbVar.m, null, null, 0, (ChannelActionInProgress) this.d, null, null, null, null, null, null, null, null, false, false, -264193, 7);
            case 7:
                rfj rfjVar = (rfj) this.c;
                wh50 wh50Var = rfjVar.o;
                Map map = (Map) this.d;
                Integer valueOf = Integer.valueOf(R.drawable.vk_icon_add_16);
                VkContentBadge vkContentBadge = (VkContentBadge) ((FrameLayout) obj).getTag();
                String str2 = ((Boolean) ((zak0) rfjVar.k).getValue()).booleanValue() ? rfjVar.p : rfjVar.q;
                if (!((Boolean) ((zak0) rfjVar.e).getValue()).booleanValue()) {
                    str2 = null;
                }
                vkContentBadge.setText(str2);
                vkContentBadge.g(true, ((Boolean) ((zak0) rfjVar.f).getValue()).booleanValue() ? valueOf : null);
                vkContentBadge.setSubtitle(((Boolean) ((zak0) rfjVar.i).getValue()).booleanValue() ? "1\u2009940\u2009₽" : null);
                vkContentBadge.setFade(((Boolean) ((zak0) rfjVar.j).getValue()).booleanValue());
                if (!((Boolean) ((zak0) rfjVar.h).getValue()).booleanValue()) {
                    valueOf = null;
                }
                VkContentBadge.h(vkContentBadge, valueOf);
                vkContentBadge.setCapsule(((Boolean) ((zak0) rfjVar.g).getValue()).booleanValue());
                ContentBadgeMode contentBadgeMode = (ContentBadgeMode) rfjVar.b.get((String) ((zak0) rfjVar.l).getValue());
                int i5 = contentBadgeMode == null ? -1 : rfj.a.$EnumSwitchMapping$0[contentBadgeMode.ordinal()];
                vkContentBadge.setMode(i5 != 1 ? i5 != 2 ? i5 != 3 ? VkContentBadge.Mode.Primary : VkContentBadge.Mode.Outline : VkContentBadge.Mode.Secondary : VkContentBadge.Mode.Primary);
                ContentBadgeSize contentBadgeSize = (ContentBadgeSize) rfjVar.c.get((String) ((zak0) rfjVar.m).getValue());
                i = contentBadgeSize != null ? rfj.a.$EnumSwitchMapping$1[contentBadgeSize.ordinal()] : -1;
                vkContentBadge.setSize(i != 1 ? i != 2 ? VkContentBadge.Size.Large : VkContentBadge.Size.Medium : VkContentBadge.Size.Small);
                ContentBadgeAppearance contentBadgeAppearance = (ContentBadgeAppearance) map.get((String) ((zak0) wh50Var).getValue());
                if (contentBadgeAppearance == ContentBadgeAppearance.Design.Neutral) {
                    appearance = VkContentBadge.Appearance.Design.Neutral;
                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Positive) {
                    appearance = VkContentBadge.Appearance.Design.Positive;
                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Negative) {
                    appearance = VkContentBadge.Appearance.Design.Negative;
                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Overlay) {
                    appearance = VkContentBadge.Appearance.Design.Overlay;
                } else if (contentBadgeAppearance instanceof ContentBadgeAppearance.a) {
                    Object obj2 = map.get((String) ((zak0) wh50Var).getValue());
                    ContentBadgeAppearance.a aVar3 = obj2 instanceof ContentBadgeAppearance.a ? (ContentBadgeAppearance.a) obj2 : null;
                    appearance = new VkContentBadge.Appearance.a(rfj.f(aVar3 != null ? new l5g(aVar3.c) : null), rfj.f(aVar3 != null ? new l5g(aVar3.b) : null), rfj.f(aVar3 != null ? new l5g(aVar3.d) : null), 8);
                } else {
                    appearance = VkContentBadge.Appearance.Design.Accent;
                }
                vkContentBadge.setAppearance(appearance);
                return s3q0.a;
            case 8:
                w2w w2wVar = (w2w) this.c;
                jqm jqmVar = (jqm) this.d;
                pdm c2 = w2wVar.I0().b().c();
                List<rdm> b = c2.b();
                rey k = c2.b.I0().k();
                List list5 = EmptyList.b;
                String string = k.getString("folders_order");
                if (string != null) {
                    list5 = f370.J(new JSONArray(string));
                }
                List D0 = j5g.D0(new qdm(list5), b);
                Integer j = w2wVar.I0().b().c().j();
                i = j != null ? j.intValue() : -1;
                List<rdm> list6 = D0;
                edi ediVar = jqmVar.c;
                ArrayList arrayList3 = new ArrayList(c5g.u(list6, 10));
                for (rdm rdmVar : list6) {
                    ediVar.getClass();
                    arrayList3.add(new rpm(rdmVar.a, rdmVar.b, rdmVar.c));
                }
                return new xpp(arrayList3, i < cq.a(w2wVar));
            case 9:
                h3o h3oVar = (h3o) this.c;
                c1o c1oVar = (c1o) this.d;
                VKCircleImageView vKCircleImageView = h3oVar.n;
                String a = js5.a(((VKCircleImageView) obj).getWidth(), c1oVar.c);
                if (a == null) {
                    a = "";
                }
                vKCircleImageView.o0(a, null);
                return s3q0.a;
            case 10:
                u1c0 u1c0Var = (u1c0) obj;
                return Boolean.valueOf(((Set) this.c).contains(Integer.valueOf(u1c0Var.c)) && ((HashMap) this.d).containsKey(u1c0Var.b));
            case 11:
                ((wsp) this.c).c.g((hyg0) obj, (ArrayList) this.d);
                return s3q0.a;
            case 12:
                com.vk.lists.c cVar3 = (com.vk.lists.c) this.c;
                h3t h3tVar = (h3t) this.d;
                List<? extends MediaStoreEntry> list7 = (List) obj;
                cVar3.r(true);
                ktp0 ktp0Var = cVar3.d;
                boolean z = cVar3.f;
                c.l lVar = cVar3.i;
                if (h3tVar.g) {
                    h3tVar.i = j5g.u0(h3tVar.i, list7);
                    int size = list7.size();
                    if (lVar == null) {
                        throw new IllegalStateException("You shouldn't call incrementPage with pagedDataProviderWithStartFrom");
                    }
                    if (z) {
                        ktp0Var.h(size);
                    }
                    cVar3.r(false);
                } else {
                    h3tVar.i = list7;
                    if (lVar == null) {
                        throw new IllegalStateException("You shouldn't call decrementPageBeforeFrom with pagedDataProviderWithStartFrom");
                    }
                    if (z) {
                        ktp0Var.h(ktp0Var.f.a());
                    }
                }
                GalleryFragmentImpl.c cVar4 = h3tVar.e;
                PhotoSmallAdapter photoSmallAdapter = cVar4.a;
                cVar4.d(false);
                AlbumEntry b2 = cVar4.b.b();
                List<? extends MediaStoreEntry> list8 = list7;
                if (!list8.isEmpty()) {
                    cVar4.a(list7, false);
                    photoSmallAdapter.q = false;
                    photoSmallAdapter.S(list7);
                } else if (b2 != null && (list = b2.d) != null && (!list.isEmpty()) && photoSmallAdapter.E0() == 0) {
                    cVar4.a(list, false);
                    photoSmallAdapter.q = false;
                    photoSmallAdapter.S(list);
                } else if (photoSmallAdapter.I()) {
                    photoSmallAdapter.q = true;
                    photoSmallAdapter.N0(EmptyList.b);
                }
                e5t e5tVar = GalleryFragmentImpl.this.p0;
                if (e5tVar != null) {
                    e5tVar.d = (list8.isEmpty() && (b2 == null || (list2 = b2.d) == null || !(list2.isEmpty() ^ true))) ? false : true;
                }
                h3tVar.k = false;
                cVar3.r(true);
                return s3q0.a;
            case 13:
                ypt yptVar = (ypt) this.c;
                GetAuthToken$Parameters getAuthToken$Parameters = (GetAuthToken$Parameters) this.d;
                GetAuthToken$Parameters getAuthToken$Parameters2 = (GetAuthToken$Parameters) obj;
                String g = getAuthToken$Parameters2.g();
                if (g == null) {
                    g = "";
                }
                String str3 = g;
                long d = getAuthToken$Parameters2.d();
                xwv0 xwv0Var = (xwv0) yptVar.a.get();
                if (xwv0Var != null && (view = xwv0Var.getView()) != null) {
                    bVar = view.D6();
                }
                io.reactivex.rxjava3.disposables.b bVar2 = bVar;
                g2y.a aVar4 = yptVar.b;
                Boolean e = getAuthToken$Parameters.e();
                yptVar.a(new ypt.a(new g7g0.a(d, str3, bVar2, aVar4, false, e != null ? e.booleanValue() : false), getAuthToken$Parameters2.f()), new eqq(yptVar, i4));
                return s3q0.a;
            case 14:
                ((q7u) this.c).n.c((hmd0.a) obj, (Context) this.d);
                return s3q0.a;
            case 15:
                gvv gvvVar = (gvv) this.c;
                gvv.c cVar5 = (gvv.c) this.d;
                c0v0 c0v0Var = gvvVar.e;
                String str4 = ((zuv) ((ArrayList) gvvVar.y0()).get(cVar5.getAdapterPosition())).b;
                c0v0Var.getClass();
                int hashCode = str4.hashCode();
                if (hashCode != 3053931) {
                    if (hashCode != 102727412) {
                        if (hashCode == 957831062 && str4.equals("country")) {
                            c0v0Var.i();
                        }
                    } else if (str4.equals("label") && (jvvVar = c0v0Var.l) != null) {
                        WebIdentityLabel webIdentityLabel = c0v0Var.m;
                        jvvVar.f = webIdentityLabel;
                        jvvVar.e = jvvVar.c.indexOf(webIdentityLabel) == -1;
                        c = new dw20.b(c0v0Var.b.kn(), null).v0(R.string.vk_identity_label).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                        i2 = c.i(jvvVar, (r3 & 2) == 0, false);
                        ((dw20.b) i2).I0("identity_dialog_label");
                    }
                } else if (str4.equals("city")) {
                    WebCountry webCountry = c0v0Var.n;
                    if (webCountry == null) {
                        c0v0Var.u = true;
                        c0v0Var.i();
                    } else {
                        c0v0Var.u = false;
                        c0v0Var.d.invoke(Integer.valueOf(webCountry.b));
                    }
                }
                return s3q0.a;
            case 16:
                List list9 = (List) this.d;
                String str5 = (String) this.c;
                uyh0 uyh0Var = (uyh0) obj;
                uyh0.a aVar5 = uyh0Var.d;
                return uyh0.a(uyh0Var, false, false, null, aVar5 instanceof uyh0.a.c ? new uyh0.a.c(j5g.u0(list9, ((uyh0.a.c) aVar5).a), str5) : list9.isEmpty() ? uyh0.a.b.a : new uyh0.a.c(list9, str5), 7);
            case 17:
                zrz zrzVar = (zrz) this.c;
                zrzVar.j.b(new oe5(11, (zrz.a) this.d, (Throwable) obj));
                zrzVar.b("launchCacheLoad onError");
                return s3q0.a;
            case 18:
                return (CharSequence) ((wzs) ((c200) this.c).h.getValue()).invoke((zk10) obj, ((ulp0.a) this.d).next());
            case 19:
                return new vs00((ViewGroup) obj, (f5z) this.c, ((wr00) this.d).i);
            case 20:
                com.vk.im.ui.components.msg_list.a aVar6 = (com.vk.im.ui.components.msg_list.a) this.c;
                AttachSticker attachSticker = (AttachSticker) this.d;
                if (((PopupStickersChatSettingsModel) obj).Ab() && (jVar = aVar6.s) != null) {
                    jVar.c(attachSticker);
                }
                return s3q0.a;
            case 21:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) this.c;
                Context context = (Context) this.d;
                yj40 yj40Var = (yj40) obj;
                musicOfflineCatalogRootVh.z.d();
                if (epx.f(yj40Var, tt1.a)) {
                    ikv0.a aVar7 = new ikv0.a(context);
                    aVar7.u = new ikv0.d(context.getString(R.string.music_offline_all_podcasts_deleted), (String) null, (ikv0.d.a) null, 6);
                    aVar7.n();
                } else if (epx.f(yj40Var, st1.a)) {
                    ikv0.a aVar8 = new ikv0.a(context);
                    aVar8.u = new ikv0.d(context.getString(R.string.music_offline_all_audio_books_deleted), (String) null, (ikv0.d.a) null, 6);
                    aVar8.n();
                }
                return s3q0.a;
            case 22:
                myc0.h((yvj) this.c, null, null, new pf80.f((mc90) this.d, ((Float) obj).floatValue(), null), 3);
                return s3q0.a;
            case 23:
                yid0 yid0Var = (yid0) this.c;
                Context context2 = (Context) this.d;
                int i6 = yid0Var.j;
                if (i6 == 0) {
                    return s3q0.a;
                }
                cxo cxoVar = yid0Var.a;
                if (i6 != 0) {
                    io.reactivex.rxjava3.disposables.c cVar6 = yid0Var.h;
                    if (cVar6 != null) {
                        cVar6.dispose();
                    }
                    x110 x110Var = cxoVar.e;
                    if (x110Var != null) {
                        uy9 uy9Var = x110Var.b;
                        if (i6 > 0) {
                            w0 = uy9Var.a(i6);
                        } else {
                            int abs = Math.abs(i6);
                            b510 b510Var = (b510) uy9Var.b;
                            h010 h010Var = (h010) uy9Var.c;
                            w0 = rsg0.w0(yfb.x(b510Var.a.z((int) h010Var.b, fkq0.a(h010Var.c), abs)));
                        }
                        io.reactivex.rxjava3.disposables.c subscribe = hg1.n(w0.m(io.reactivex.rxjava3.android.schedulers.a.b()), context2, false, null, 62).subscribe(new qw40(new xid0(yid0Var, context2, i6, objArr3 == true ? 1 : 0), i3), new rkz(new b1a(28, yid0Var, context2), 20));
                        yid0Var.h = subscribe;
                        if (subscribe != null) {
                            cxoVar.b.b(subscribe);
                        }
                        h010 h010Var2 = cxoVar.f;
                        if (h010Var2 != null) {
                            long j2 = h010Var2.c.b;
                            long j3 = h010Var2.b;
                            el3 el3Var = Event.b;
                            Event.a b3 = h5s.b("new_store_add_product_to_cart");
                            b3.b("product_id", Long.valueOf(j3));
                            b3.b("store_id", Long.valueOf(j2));
                            b3.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
                            com.vk.metrics.eventtracking.b.a.k(b3.e());
                        }
                    }
                }
                yid0Var.j = 0;
                return s3q0.a;
            case 24:
                ((izs) this.c).invoke(((dvd0) this.d).m);
                return s3q0.a;
            case 25:
                Object obj3 = this.c;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
                Map map2 = (Map) obj;
                synchronized (obj3) {
                    linkedHashMap.putAll(map2);
                    obj3.notify();
                }
                return s3q0.a;
            case 26:
                VkScreenSpinner vkScreenSpinner = (VkScreenSpinner) obj;
                vkScreenSpinner.setColor(vkScreenSpinner.getContext().getColor(((Number) ((List) this.c).get(((rg50) this.d).getIntValue())).intValue()));
                return s3q0.a;
            case 27:
                mol0 mol0Var = (mol0) this.c;
                lsi0 lsi0Var2 = (lsi0) this.d;
                mol0 mol0Var2 = (mol0) obj;
                lsi0 lsi0Var3 = mol0Var.e;
                if (lsi0Var3 == null) {
                    lsi0Var = lsi0Var2;
                } else if (lsi0Var2 == null) {
                    lsi0Var = lsi0Var3;
                } else {
                    List<fsi0> list10 = lsi0Var2.c;
                    List<fsi0> list11 = lsi0Var3.c;
                    if (list11 != null && list10 != null) {
                        list10 = j5g.u0(list10, list11);
                    } else if (list11 != null) {
                        list3 = list11;
                        lsi0Var = new lsi0(lsi0Var3.a, pn00.n(lsi0Var3.b, lsi0Var2.b), list3, lsi0Var2.d, null);
                    }
                    list3 = list10;
                    lsi0Var = new lsi0(lsi0Var3.a, pn00.n(lsi0Var3.b, lsi0Var2.b), list3, lsi0Var2.d, null);
                }
                return mol0.a(mol0Var2, null, null, lsi0Var, null, null, LoadingState.None, 183);
            case 28:
                com.vk.story.viewer.impl.presentation.stories.c cVar7 = (com.vk.story.viewer.impl.presentation.stories.c) this.c;
                StoryViewAction storyViewAction = (StoryViewAction) this.d;
                b.d dVar2 = (b.d) obj;
                qo6 currentStoryView = cVar7.n.getCurrentStoryView();
                Object[] objArr4 = currentStoryView != null && fsk.z(currentStoryView.getStoriesContainer());
                boolean z2 = currentStoryView != null && currentStoryView.getCurrentStory() == null;
                if (objArr4 != false && z2) {
                    zwl0.a(dVar2, storyViewAction);
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(Math.abs(((Number) ((izs) this.c).invoke(((kyo0) obj).b)).floatValue()) >= ((h5j0.b) this.d).a);
        }
    }

    public /* synthetic */ i(List list, String str) {
        this.b = 16;
        this.d = list;
        this.c = str;
    }
}
