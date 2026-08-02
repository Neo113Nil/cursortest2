package com.vk.movika.sdk.base.observable;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.channels.impl.comments.g;
import com.vk.channels.impl.list.g;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.util.NoLocation;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.photos.root.albumssettings.presentation.view.AlbumsSettingsRecyclerPaginatedView;
import com.vk.superapp.api.dto.app.AppLifecycleEvent;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.dto.call_member.CallMemberId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ao8;
import xsna.bk8;
import xsna.bpn0;
import xsna.bqh0;
import xsna.ca9;
import xsna.e5;
import xsna.epx;
import xsna.fnd;
import xsna.frn0;
import xsna.g54;
import xsna.gce0;
import xsna.h1p0;
import xsna.hfz;
import xsna.it80;
import xsna.ixg;
import xsna.izs;
import xsna.j5g;
import xsna.laa;
import xsna.nq40;
import xsna.nya;
import xsna.o9c;
import xsna.omc;
import xsna.otb;
import xsna.ph;
import xsna.pj4;
import xsna.pk1;
import xsna.qcy;
import xsna.qk1;
import xsna.qq1;
import xsna.rdi;
import xsna.re0;
import xsna.rq1;
import xsna.rxj;
import xsna.s3q0;
import xsna.t24;
import xsna.tad;
import xsna.tho0;
import xsna.tj50;
import xsna.usb;
import xsna.ux0;
import xsna.uy0;
import xsna.vod;
import xsna.w7c;
import xsna.w9y;
import xsna.wj2;
import xsna.x24;
import xsna.xgl0;
import xsna.xuo0;
import xsna.zi9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.h) obj).n((com.vk.movika.sdk.base.model.l) this.c);
                return s3q0.a;
            case 1:
                bqh0 bqh0Var = (bqh0) this.c;
                qcy<Object>[] qcyVarArr = ph.n1;
                bqh0Var.b(bqh0Var.f);
                return s3q0.a;
            case 2:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = (com.vk.superapp.browser.internal.ui.shortcats.a) this.c;
                AddActionSuggestion addActionSuggestion = (AddActionSuggestion) obj;
                aVar.f = addActionSuggestion;
                if (addActionSuggestion.a && aVar.b()) {
                    if (aVar.h) {
                        aVar.j = false;
                        aVar.g(AppLifecycleEvent.ON_START, null);
                    } else {
                        aVar.j = true;
                    }
                }
                return s3q0.a;
            case 3:
                ux0 ux0Var = (ux0) this.c;
                if (uy0.a.$EnumSwitchMapping$0[((ErrorOverlayRenderDelegate.ErrorOverlayAction) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ux0Var.a(AdsItemViewEvent.d.b);
                return s3q0.a;
            case 4:
                qq1 qq1Var = (qq1) this.c;
                rq1.b bVar = (rq1.b) obj;
                List<PhotoAlbum> list = bVar.b;
                Throwable th = bVar.d;
                if (th != null) {
                    qq1Var.e.fj(th, null);
                    return s3q0.a;
                }
                pk1 pk1Var = qq1Var.g;
                qk1 qk1Var = qq1Var.h;
                AlbumsSettingsRecyclerPaginatedView albumsSettingsRecyclerPaginatedView = qq1Var.e;
                pk1Var.setItems(list);
                if (list.isEmpty()) {
                    qk1Var.setItems(EmptyList.b);
                } else {
                    qk1Var.setItems(Collections.singletonList(new rxj(list.size())));
                }
                rq1.b.a aVar2 = bVar.c;
                if (aVar2 instanceof rq1.b.a.C3624a) {
                    albumsSettingsRecyclerPaginatedView.Fe();
                } else if (epx.f(aVar2, rq1.b.a.C3625b.a)) {
                    albumsSettingsRecyclerPaginatedView.lb();
                } else {
                    if (aVar2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    albumsSettingsRecyclerPaginatedView.t();
                }
                s3q0 s3q0Var = s3q0.a;
                if (bVar.a) {
                    albumsSettingsRecyclerPaginatedView.K9();
                } else {
                    albumsSettingsRecyclerPaginatedView.Mk();
                }
                return s3q0Var;
            case 5:
                AppsPickerFragment appsPickerFragment = (AppsPickerFragment) this.c;
                bpn0 bpn0Var = AppsPickerFragment.V;
                appsPickerFragment.dismiss();
                FragmentActivity activity = appsPickerFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return s3q0.a;
            case 6:
                x24 x24Var = (x24) this.c;
                String str = ((tho0) obj).a.c;
                x24Var.g = str;
                Iterator it = j5g.O0(x24Var.c).iterator();
                while (it.hasNext()) {
                    ((t24.d) it.next()).a(str);
                }
                return s3q0.a;
            case 7:
                gce0 gce0Var = (gce0) this.c;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                rdi.y(gce0Var, new izs() { // from class: xsna.w75
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        return PublishState.a((PublishState) obj2, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, booleanValue, false, false, false, -1, 1983);
                    }
                });
                return s3q0.a;
            case 8:
                BaseDebugTogglesFragment baseDebugTogglesFragment = (BaseDebugTogglesFragment) this.c;
                Pair pair = (Pair) obj;
                int i = BaseDebugTogglesFragment.X;
                String str2 = (String) pair.d();
                List<? extends hfz> list2 = (List) pair.g();
                baseDebugTogglesFragment.Q = str2;
                h1p0 h1p0Var = baseDebugTogglesFragment.R;
                if (h1p0Var == null) {
                    h1p0Var = null;
                }
                h1p0Var.setItems(list2);
                LinearLayoutManager linearLayoutManager = baseDebugTogglesFragment.P;
                (linearLayoutManager != null ? linearLayoutManager : null).K(0, 0);
                return s3q0.a;
            case 9:
                long j = ((bk8) this.c).e;
                xuo0.a.getClass();
                return Long.valueOf(j - xuo0.a());
            case 10:
                return ca9.c.a((ca9.c) obj, null, null, null, null, null, null, null, null, null, null, false, null, null, null, (CallMemberId) ((it80) this.c).a, false, null, false, null, false, null, Integer.MAX_VALUE, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 11:
                return new io.reactivex.rxjava3.internal.operators.single.d0(((zi9) this.c).b.z0(50L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.core.q.T(NoLocation.b)).K(), new io.reactivex.rxjava3.internal.operators.mixed.k(7), null).l(new pj4(new e5((ClipVideoItem) obj, 16), 7));
            case 12:
                return j5g.u0((List) obj, (ArrayList) this.c);
            case 13:
                nq40 nq40Var = ((laa) this.c).q;
                nq40Var.getClass();
                return nq40.a(nq40Var, MusicCollectionType.PLAYLISTS, ((laa) nq40Var.e.c).j, null, (List) obj, 20);
            case 14:
                return CatalogSectionScreenState.a((CatalogSectionScreenState) obj, null, null, null, (Throwable) this.c, null, 23);
            case 15:
                com.vk.channels.impl.comments.b bVar2 = (com.vk.channels.impl.comments.b) this.c;
                bVar2.m.clear();
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, com.vk.channels.impl.comments.b.s(bVar2, bVar2.k.a(), false, 3), new g.a(true), null, false, 12);
            case 16:
                nya nyaVar = (nya) this.c;
                xgl0 xgl0Var = (xgl0) obj;
                frn0 system = xgl0Var.system();
                system.i(system.j() + 1);
                Iterator<T> it2 = xgl0Var.a().e0(false).iterator();
                while (it2.hasNext()) {
                    nyaVar.b.b.I0().u(new wj2(String.valueOf(((Number) it2.next()).longValue()), 1));
                }
                return s3q0.a;
            case 17:
                com.vk.channels.impl.list.b bVar3 = (com.vk.channels.impl.list.b) this.c;
                Throwable th2 = (Throwable) obj;
                bVar3.s().b(th2, new re0(5));
                bVar3.n(new g.b(th2));
                return s3q0.a;
            case 18:
                ((usb) this.c).a.b();
                return s3q0.a;
            case 19:
                ((otb) this.c).e.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 20:
                return new o9c.a(((tj50.a) obj).a(new w((w7c) this.c, 21), ao8.d));
            case 21:
                ((ClassifiedsCatalogRootVh) this.c).N.b();
                return s3q0.a;
            case 22:
                ((tad) this.c).e.invoke((omc) obj);
                return s3q0.a;
            case 23:
                fnd fndVar = (fnd) this.c;
                ClipsCoauthorsSelectorMviState.c.a aVar3 = ((ClipsCoauthorsSelectorMviState.c) obj).i;
                fndVar.getClass();
                if (epx.f(aVar3, ClipsCoauthorsSelectorMviState.c.a.C0552a.a)) {
                    return SpinnerState.Done;
                }
                if (epx.f(aVar3, ClipsCoauthorsSelectorMviState.c.a.b.a)) {
                    return SpinnerState.Error;
                }
                if (epx.f(aVar3, ClipsCoauthorsSelectorMviState.c.a.C0553c.a)) {
                    return SpinnerState.Loading;
                }
                if (epx.f(aVar3, ClipsCoauthorsSelectorMviState.c.a.d.a)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                ((vod) this.c).j7();
                return s3q0.a;
            case 25:
                ClipsDraftVkExtraData clipsDraftVkExtraData = (ClipsDraftVkExtraData) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(clipsDraftVkExtraData.b, "stickers");
                w9yVar.g("editor_music", clipsDraftVkExtraData.c);
                w9yVar.g("geo_location_attachment", clipsDraftVkExtraData.d);
                w9yVar.g("link_attachment", clipsDraftVkExtraData.e);
                w9yVar.g("market_attachment", clipsDraftVkExtraData.f);
                ClipInvolvementActionButton<?> clipInvolvementActionButton = clipsDraftVkExtraData.g;
                w9yVar.e(clipInvolvementActionButton != null ? clipInvolvementActionButton.e5() : null, "involvement_attachment");
                w9yVar.g("duet_info", clipsDraftVkExtraData.h);
                w9yVar.g("template", clipsDraftVkExtraData.i);
                w9yVar.g("user_data", clipsDraftVkExtraData.j);
                w9yVar.d(clipsDraftVkExtraData.k, "deleted_at");
                return s3q0.a;
            case 26:
                return ((com.vk.clips.favorites.impl.ui.folders.content.f) this.c).f.a((ClipsFavoriteFolderContentListState.b) obj);
            case 27:
                return (ClipFeedAdapter) this.c;
            case 28:
                ((ClipsGridDraftsListFragment) this.c).k0.setItems((List) obj);
                return s3q0.a;
            default:
                return new ixg(((tj50.a) obj).a(new g54((com.vk.profile.community.details.impl.contacts.e) this.c, 12), ao8.d));
        }
    }
}
