package com.vk.movika.sdk.base.observable;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.content.design.view.camera.AttachWithCounterView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.cart.impl.checkout.feature.state.ActionField;
import com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenFragment;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.posting.mediapicker.photovk.albums_list.VkAlbumsFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.abq0;
import xsna.ad0;
import xsna.am9;
import xsna.b7r;
import xsna.b8e;
import xsna.bdb;
import xsna.boy0;
import xsna.bzb0;
import xsna.cwb0;
import xsna.d1r;
import xsna.d4h;
import xsna.d8e;
import xsna.di60;
import xsna.dqe;
import xsna.drf;
import xsna.e43;
import xsna.em1;
import xsna.epx;
import xsna.erf;
import xsna.etv0;
import xsna.f5b;
import xsna.g3c;
import xsna.g9m;
import xsna.gg1;
import xsna.gm50;
import xsna.h7o0;
import xsna.hfz;
import xsna.ikd;
import xsna.izs;
import xsna.l5b;
import xsna.l9c;
import xsna.lfg;
import xsna.lw8;
import xsna.m99;
import xsna.mm7;
import xsna.mvl;
import xsna.nf9;
import xsna.o1d;
import xsna.o6d0;
import xsna.ogh;
import xsna.paq0;
import xsna.r46;
import xsna.ro1;
import xsna.rv9;
import xsna.rxd;
import xsna.ryb;
import xsna.s3q0;
import xsna.sqr0;
import xsna.tc6;
import xsna.tlo0;
import xsna.uuf;
import xsna.uxd0;
import xsna.v8s;
import xsna.vj90;
import xsna.vke;
import xsna.vsb;
import xsna.vx3;
import xsna.w7c;
import xsna.w8c;
import xsna.w9y;
import xsna.wf8;
import xsna.wgb;
import xsna.wr7;
import xsna.x7i;
import xsna.xf8;
import xsna.xgl0;
import xsna.xzz;
import xsna.yf8;
import xsna.yw9;
import xsna.zk70;
import xsna.zv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.ecomm.cart.impl.checkout.feature.state.b bVar;
        int i = this.b;
        Throwable th = null;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.listener.k) obj).u((com.vk.movika.sdk.base.model.o) obj2);
                return s3q0.a;
            case 1:
                ikd ikdVar = (ikd) obj2;
                Activity activity = (Activity) obj;
                if (activity != null) {
                    zv0.b.b(activity, ikdVar, null);
                }
                return s3q0.a;
            case 2:
                gg1 gg1Var = (gg1) obj2;
                h7o0 h7o0Var = (h7o0) obj;
                if (h7o0Var instanceof paq0) {
                    gg1Var.C(new a.c0((paq0) h7o0Var));
                } else if (h7o0Var instanceof abq0) {
                    tlo0.Companion.getClass();
                    gg1Var.Z(null, null, new tlo0.f(R.string.photo_flow_photos_upload_error));
                }
                return s3q0.a;
            case 3:
                PhotosGetAlbums.a aVar = (PhotosGetAlbums.a) obj;
                VkAlbumsFragment vkAlbumsFragment = ((ro1) obj2).b;
                em1 em1Var = vkAlbumsFragment.U;
                if (em1Var == null) {
                    em1Var = null;
                }
                em1Var.clear();
                em1 em1Var2 = vkAlbumsFragment.U;
                if (em1Var2 == null) {
                    em1Var2 = null;
                }
                em1Var2.n0(aVar.a);
                em1 em1Var3 = vkAlbumsFragment.U;
                if (em1Var3 == null) {
                    em1Var3 = null;
                }
                em1Var3.n0(aVar.b);
                PickerRecyclerPaginatedView pickerRecyclerPaginatedView = vkAlbumsFragment.T;
                if (pickerRecyclerPaginatedView == null) {
                    pickerRecyclerPaginatedView = null;
                }
                pickerRecyclerPaginatedView.f0();
                PickerRecyclerPaginatedView pickerRecyclerPaginatedView2 = vkAlbumsFragment.T;
                if (pickerRecyclerPaginatedView2 == null) {
                    pickerRecyclerPaginatedView2 = null;
                }
                pickerRecyclerPaginatedView2.getRecyclerView().setVerticalScrollBarEnabled(false);
                PickerRecyclerPaginatedView pickerRecyclerPaginatedView3 = vkAlbumsFragment.T;
                (pickerRecyclerPaginatedView3 != null ? pickerRecyclerPaginatedView3 : null).Mk();
                return s3q0.a;
            case 4:
                int i3 = AppearanceSettingsWithBackgroundsFragment.b0;
                ((AppearanceSettingsWithBackgroundsFragment) obj2).eo();
                return s3q0.a;
            case 5:
                JSONObject jSONObject = (JSONObject) obj;
                return vj90.a(jSONObject, (Owner) ((Map) obj2).get(new UserId(jSONObject.optLong("owner_id"))));
            case 6:
                ((r46) obj2).k(new uxd0.w((Throwable) obj));
                return s3q0.a;
            case 7:
                ((tc6) obj2).u((g9m.a) obj);
                return s3q0.a;
            case 8:
                VkBlurView vkBlurView = new VkBlurView((Context) obj, null, 6);
                vkBlurView.setupWithContent((VkBlurContentView) obj2);
                return vkBlurView;
            case 9:
                BookingRecordsScreenFragment bookingRecordsScreenFragment = (BookingRecordsScreenFragment) obj2;
                wr7.b(bookingRecordsScreenFragment, bookingRecordsScreenFragment.Q, (mm7) obj);
                return s3q0.a;
            case 10:
                BotButton.Text text = (BotButton.Text) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(text.g.h()), "type");
                w9yVar.e(text.h, "payload");
                w9yVar.c(Integer.valueOf(text.i), TtmlNode.TAG_SPAN);
                w9yVar.e(text.j, "key");
                w9yVar.c(Integer.valueOf(text.k.h()), "color_id");
                w9yVar.b(Boolean.valueOf(text.l), "inline");
                w9yVar.d(Long.valueOf(text.m.b), "author");
                return s3q0.a;
            case 11:
                wf8 wf8Var = (wf8) obj2;
                bzb0 bzb0Var = wf8Var.z;
                yf8.b bVar2 = (yf8.b) obj;
                mvl mvlVar = bVar2.a;
                boolean z = bVar2.g;
                boolean z2 = mvlVar instanceof mvl.c;
                int i4 = R.string.voip_broadcast_has_finished;
                if (z2) {
                    if (z) {
                        i4 = R.string.voip_broadcast_record_has_finished;
                    }
                } else if (mvlVar instanceof mvl.a) {
                    i4 = z ? R.string.voip_broadcast_record_has_deleted : R.string.voip_broadcast_has_deleted;
                }
                wf8Var.i.setText(i4);
                if (mvlVar instanceof mvl.d) {
                    bzb0Var.a();
                    bzb0Var.a();
                    bzb0Var.c(new cwb0.s0(null, R.string.voip_broadcast_delete_in_progress_description, 5), new defpackage.r(wf8Var, 12));
                } else if (mvlVar instanceof mvl.b) {
                    bzb0Var.a();
                    zk70.e(((mvl.b) mvlVar).a);
                    wf8Var.d(xf8.c.a);
                } else {
                    bzb0Var.a();
                }
                return s3q0.a;
            case 12:
                long j = ((bdb) obj).b;
                xgl0 I0 = ((lw8) obj2).a.I0();
                return Integer.valueOf(ad0.B(I0.a().B(j)) ? I0.system().r(j) : I0.system().j());
            case 13:
                ((m99) obj2).p();
                return s3q0.a;
            case 14:
                b.d dVar = (b.d) obj;
                Integer num = ((am9) obj2).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                return s3q0.a;
            case 15:
                float f = CameraUIView.w1;
                ((etv0) obj).b(false);
                AttachWithCounterView collectionButton = ((CameraUIView) obj2).getCollectionButton();
                if (collectionButton != null) {
                    collectionButton.performClick();
                }
                return s3q0.a;
            case 16:
                JSONObject jSONObject2 = (JSONObject) obj;
                ((yw9) obj2).e.invoke(new rv9.f(jSONObject2));
                return jSONObject2;
            case 17:
                int i5 = l5b.l;
                return new l5b(((f5b) obj2).i.inflate(R.layout.vkim_msg_search_hint, (ViewGroup) obj, false));
            case 18:
                wgb wgbVar = (wgb) obj2;
                wgbVar.d();
                wgbVar.e(wgb.b.a((wgb.b) obj, null, null, null, 0, false, false, false, 159));
                return s3q0.a;
            case 19:
                ((vsb) obj2).a.a();
                return s3q0.a;
            case 20:
                return new sqr0(((ryb) obj2).i, (ViewGroup) obj);
            case 21:
                w8c w8cVar = (w8c) obj;
                com.vk.ecomm.cart.impl.checkout.feature.state.b bVar3 = ((w7c) obj2).d;
                bVar3.getClass();
                com.vk.ecomm.cart.impl.checkout.feature.state.f fVar = w8cVar.g;
                if (!((Boolean) bVar3.c.getValue()).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = fVar.a.entrySet().iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            e43.t();
                            throw null;
                        }
                        Map.Entry entry = (Map.Entry) next;
                        String str = (String) entry.getKey();
                        LinkedHashMap linkedHashMap = (LinkedHashMap) entry.getValue();
                        int i8 = 0;
                        for (Object obj3 : linkedHashMap.entrySet()) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                e43.t();
                                throw null;
                            }
                            Map.Entry entry2 = (Map.Entry) obj3;
                            String str2 = (String) entry2.getKey();
                            b7r b7rVar = (b7r) entry2.getValue();
                            Iterator it2 = it;
                            int d = com.vk.ecomm.cart.impl.checkout.feature.state.b.d(i6, fVar.a.size(), i8, linkedHashMap.size());
                            if (b7rVar instanceof ActionField) {
                                ActionField actionField = (ActionField) b7rVar;
                                if (actionField.f.i()) {
                                    arrayList2.add(new x7i(actionField.d, actionField.c));
                                    it = it2;
                                    i8 = i9;
                                }
                            }
                            bVar3.a(arrayList, b7rVar, str2, str, d);
                            it = it2;
                            i8 = i9;
                        }
                        i6 = i7;
                    }
                    return new v8s(arrayList, arrayList2, w8cVar.f, w8cVar.h, EmptyList.b);
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = 0;
                for (Object obj4 : fVar.a.entrySet()) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        Throwable th2 = th;
                        e43.t();
                        throw th2;
                    }
                    Map.Entry entry3 = (Map.Entry) obj4;
                    String str3 = (String) entry3.getKey();
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) entry3.getValue();
                    int i12 = i2;
                    for (Object obj5 : linkedHashMap2.entrySet()) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            Throwable th3 = th;
                            e43.t();
                            throw th3;
                        }
                        Map.Entry entry4 = (Map.Entry) obj5;
                        String str4 = (String) entry4.getKey();
                        b7r b7rVar2 = (b7r) entry4.getValue();
                        Throwable th4 = th;
                        if (b7rVar2 instanceof ActionField) {
                            ActionField actionField2 = (ActionField) b7rVar2;
                            ActionField.Type type = actionField2.f;
                            if (type.i()) {
                                bVar = bVar3;
                                arrayList4.add(new g3c(actionField2.d, actionField2.c, type));
                            } else {
                                bVar = bVar3;
                            }
                        } else {
                            bVar = bVar3;
                            if (b7rVar2 instanceof o6d0) {
                                o6d0 o6d0Var = (o6d0) b7rVar2;
                                if (epx.f(o6d0Var.a, "price_row_total")) {
                                    arrayList4.add(new l9c(o6d0Var.b, o6d0Var.d));
                                }
                            }
                        }
                        bVar3 = bVar;
                        bVar3.a(arrayList3, b7rVar2, str4, str3, com.vk.ecomm.cart.impl.checkout.feature.state.b.d(i10, fVar.a.size(), i12, linkedHashMap2.size()));
                        i12 = i13;
                        th = th4;
                        i2 = 0;
                    }
                    i10 = i11;
                }
                return new v8s(arrayList3, EmptyList.b, w8cVar.f, w8cVar.h, arrayList4);
            case 22:
                ((o1d) obj2).h.ai(new ClipViewerAnalyticsEvent.h.a((SdkClipVideoFile) obj));
                return s3q0.a;
            case 23:
                rxd rxdVar = (rxd) obj2;
                rxdVar.d.onNext(Boolean.TRUE);
                rxdVar.d.onComplete();
                return s3q0.a;
            case 24:
                d8e d8eVar = (d8e) obj2;
                d1r d1rVar = (d1r) obj;
                List<FeedItem> list = d1rVar.a;
                d8eVar.o = list;
                Integer num2 = d1rVar.b;
                b8e b8eVar = num2 != null ? new b8e(d8eVar, num2.intValue(), i2) : null;
                if (d8eVar.getAdapter().h.f.isEmpty() || list.isEmpty()) {
                    defpackage.k kVar = b8eVar != null ? new defpackage.k(b8eVar, 17) : null;
                    ClipFeedAdapter adapter = d8eVar.getAdapter();
                    xzz xzzVar = adapter.j;
                    if (xzzVar.b.get()) {
                        xzzVar.execute(new boy0(adapter, list, kVar));
                    } else {
                        androidx.recyclerview.widget.d<hfz> dVar2 = adapter.h;
                        dVar2.b(null, null);
                        if (kVar != null) {
                            adapter.J0(list, new vx3(0, kVar));
                        } else {
                            dVar2.b(list, null);
                        }
                    }
                } else {
                    ClipFeedAdapter adapter2 = d8eVar.getAdapter();
                    xzz xzzVar2 = adapter2.j;
                    if (b8eVar == null) {
                        adapter2.N0(list);
                    } else if (xzzVar2.b.get()) {
                        xzzVar2.execute(new vke(adapter2, list, b8eVar, i2));
                    } else {
                        adapter2.J0(list, b8eVar);
                    }
                }
                return s3q0.a;
            case 25:
                int i14 = ClipsTemplateEditorFragment.h0;
                ((ClipsTemplateEditorFragment) obj2).eo().x();
                return s3q0.a;
            case 26:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj2;
                uuf.a aVar2 = (uuf.a) obj;
                int i15 = ClipsWrapperFragment.Q0;
                gm50.a.a(clipsWrapperFragment, aVar2.a, new drf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "renderNavigationButton", "renderNavigationButton(Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$NavigationButtonData;)V", 0));
                gm50.a.a(clipsWrapperFragment, aVar2.b, new erf(1, clipsWrapperFragment, ClipsWrapperFragment.class, "renderExtraButtons", "renderExtraButtons(Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$ExtraButtonsData;)V", 0));
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((lfg) obj2).k0.contains((NewsComment) obj));
            case 28:
                di60.w((Action) obj, ((d4h) obj2).a, null, null, null, null, 62);
                return s3q0.a;
            default:
                ogh oghVar = (ogh) obj2;
                ClipsPlaylist clipsPlaylist = (ClipsPlaylist) obj;
                Clips clips = (Clips) oghVar.t;
                if (clips != null) {
                    oghVar.E.f(clips, new dqe(clipsPlaylist, clips), null, 0);
                }
                return s3q0.a;
        }
    }
}
