package com.vk.movika.sdk.base.logic.interactor;

import android.view.ViewGroup;
import com.vk.channels.api.Channel;
import com.vk.clips.design.view.correction.CorrectionsRecyclerView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.im.ui.fragments.ImChatSettingsFragment;
import com.vk.libvideo.bottomsheet.about.delegate.k;
import com.vk.messagetemplates.impl.keyboard.ButtonState;
import com.vk.money.createtransfer.people.CreatePeopleTransferPresenter;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.story.WebNativeSticker;
import com.vk.superapp.api.dto.story.WebRenderableSticker;
import com.vk.superapp.api.dto.story.WebSticker;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlinx.serialization.json.JsonElement;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a60;
import xsna.alm;
import xsna.asu0;
import xsna.b4;
import xsna.bru0;
import xsna.c5g;
import xsna.di3;
import xsna.dum;
import xsna.edw;
import xsna.ef;
import xsna.efc0;
import xsna.epx;
import xsna.f1j;
import xsna.frf0;
import xsna.ftb;
import xsna.fum;
import xsna.hda;
import xsna.hfz;
import xsna.hg1;
import xsna.hwe;
import xsna.izs;
import xsna.j5g;
import xsna.jda;
import xsna.jj8;
import xsna.jo3;
import xsna.kum;
import xsna.l2f;
import xsna.l7;
import xsna.li8;
import xsna.lxa;
import xsna.m86;
import xsna.mdg;
import xsna.mkm0;
import xsna.mwa;
import xsna.no;
import xsna.np5;
import xsna.o68;
import xsna.oag;
import xsna.q50;
import xsna.q500;
import xsna.qgi0;
import xsna.r3b;
import xsna.rf1;
import xsna.s2f;
import xsna.s3q0;
import xsna.sgb;
import xsna.tak;
import xsna.tdg;
import xsna.tgi0;
import xsna.vkm;
import xsna.w9y;
import xsna.wbu0;
import xsna.web;
import xsna.wgb;
import xsna.wkm;
import xsna.xak;
import xsna.xgl0;
import xsna.xgx0;
import xsna.xyb;
import xsna.ysg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i = 6;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f(((com.vk.movika.sdk.base.model.f) obj).d, ((com.vk.movika.sdk.base.model.f) this.c).d));
            case 1:
                k.a aVar = (k.a) this.c;
                aVar.l.d(new b4.x(aVar.m));
                return s3q0.a;
            case 2:
                ef efVar = (ef) this.c;
                efVar.j0((String) j5g.i0((ArrayList) efVar.b), (JsonElement) obj);
                return s3q0.a;
            case 3:
                q50 q50Var = (q50) this.c;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    mkm0 mkm0Var = q50Var.a.i0;
                    mkm0Var.getDependencies().q.e(120, list);
                    mkm0Var.setStoriesContainer((StoriesContainer) list.get(0));
                    q50.i(q50Var, mkm0Var.getStoriesContainer().Kb(), 6);
                }
                return s3q0.a;
            case 4:
                ((Photo) this.c).E = true;
                return s3q0.a;
            case 5:
                return ((di3) this.c).b();
            case 6:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                PostingAction postingAction = (PostingAction) obj;
                int i2 = BasePhotoListFragment.l0;
                efc0 mo = basePhotoListFragment.mo();
                if (mo != null) {
                    mo.C(postingAction);
                }
                return s3q0.a;
            case 7:
                ((o68) this.c).o();
                return s3q0.a;
            case 8:
                return new jj8((ViewGroup) obj, ((li8) this.c).j);
            case 9:
                CanvasStickerDraft.NativeCanvasStickerDraft nativeCanvasStickerDraft = (CanvasStickerDraft.NativeCanvasStickerDraft) this.c;
                w9y w9yVar = (w9y) obj;
                Serializer.c<CanvasStickerDraft.NativeCanvasStickerDraft> cVar = CanvasStickerDraft.NativeCanvasStickerDraft.CREATOR;
                w9yVar.e("native_sticker", "class_id");
                WebSticker webSticker = nativeCanvasStickerDraft.e;
                JSONObject jSONObject = new JSONObject();
                if (webSticker instanceof WebRenderableSticker) {
                    str = "renderable";
                } else {
                    if (!(webSticker instanceof WebNativeSticker)) {
                        throw new JSONException("sticker " + webSticker.getClass().getSimpleName() + " not supported");
                    }
                    str = "native";
                }
                jSONObject.put("sticker_type", str);
                jSONObject.put("sticker", webSticker.e5());
                w9yVar.e(jSONObject, "web_sticker");
                q500 q500Var = nativeCanvasStickerDraft.c;
                w9yVar.e(q500Var != null ? q500Var.toString() : null, "range");
                return s3q0.a;
            case 10:
                hda hdaVar = (hda) obj;
                return new Pair(jda.a(((com.vk.catalog2.common.ui.mvp.auto.d) this.c).g, hdaVar.a, hdaVar.b, false, false, 12), hdaVar.c);
            case 11:
                ((mwa) this.c).d = (mwa.a) ((Pair) obj).j();
                return s3q0.a;
            case 12:
                ((lxa) this.c).d.onNext((Channel) obj);
                return s3q0.a;
            case 13:
                Attach attach = (Attach) this.c;
                xgl0 xgl0Var = (xgl0) obj;
                r3b y = xgl0Var.y();
                if (y.b.d(attach.xb()) != null) {
                    y.s0(attach);
                }
                r3b e = xgl0Var.e();
                if (e.b.d(attach.xb()) == null) {
                    return null;
                }
                e.s0(attach);
                return s3q0.a;
            case 14:
                sgb sgbVar = (sgb) this.c;
                web webVar = (web) obj;
                sgbVar.f.a(new no(webVar, 14));
                if (webVar.equals(web.d.a)) {
                    synchronized (sgbVar) {
                        if (!sgbVar.n) {
                            sgbVar.l.e();
                            sgbVar.m.a();
                            wgb a = sgbVar.a();
                            sgbVar.m = a;
                            if (a.l.compareAndSet(false, true)) {
                                a.b(new com.vk.movika.sdk.base.observable.p(a, 20));
                            }
                        }
                    }
                } else if (webVar instanceof web.a) {
                    sgbVar.c();
                } else if (!(webVar instanceof web.b)) {
                    if (!(webVar instanceof web.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sgbVar.c();
                }
                return s3q0.a;
            case 15:
                ((ftb) this.c).e.h0((Throwable) obj);
                return s3q0.a;
            case 16:
                xyb xybVar = (xyb) this.c;
                ImChatSettingsFragment.a aVar2 = xybVar.B;
                if (aVar2 != null) {
                    ImChatSettingsFragment imChatSettingsFragment = ImChatSettingsFragment.this;
                    imChatSettingsFragment.O.b().R(imChatSettingsFragment.kn());
                }
                edw.k(edw.a, xybVar.i, R.string.vkim_msg_report_spam_chat_toast_message);
                return s3q0.a;
            case 17:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                int i3 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.go(new np5(2, (ClipsFavoriteFolderContentListViewState.g) obj, clipsFavoriteFolderContentListFragment));
                return s3q0.a;
            case 18:
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.c;
                s3q0 s3q0Var = s3q0.a;
                fVar.onNext(s3q0Var);
                return s3q0Var;
            case 19:
                hwe hweVar = (hwe) this.c;
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s2f) hweVar.c.getValue()).c((VideoFile) it.next()));
                }
                return arrayList;
            case 20:
                VideoAttachment videoAttachment = (VideoAttachment) obj;
                tdg tdgVar = ((oag) this.c).b;
                return Boolean.valueOf(tdgVar != null ? tdgVar.X3(videoAttachment) : false);
            case 21:
                mdg mdgVar = (mdg) this.c;
                Iterator it2 = ((ArrayList) obj).iterator();
                while (it2.hasNext()) {
                    mdgVar.K.d(((Number) it2.next()).intValue());
                }
                return s3q0.a;
            case 22:
                ((l2f.a) this.c).a(Boolean.FALSE);
                return s3q0.a;
            case 23:
                CorrectionsRecyclerView correctionsRecyclerView = (CorrectionsRecyclerView) this.c;
                int intValue = ((Integer) obj).intValue();
                int i4 = CorrectionsRecyclerView.i;
                correctionsRecyclerView.smoothScrollToPosition(intValue);
                return s3q0.a;
            case 24:
                qgi0.q((tgi0) obj, ((ButtonState) this.c).name());
                return s3q0.a;
            case 25:
                CreatePeopleTransferPresenter createPeopleTransferPresenter = (CreatePeopleTransferPresenter) this.c;
                Throwable th = (Throwable) obj;
                xgx0.a.getClass();
                xgx0.d(th);
                createPeopleTransferPresenter.o.Ao(th);
                return s3q0.a;
            case 26:
                xak xakVar = (xak) this.c;
                Throwable th2 = (Throwable) obj;
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ERROR_VK_MAIL_CREATED, null, null, null, null, null, null, 254);
                xakVar.z0(false);
                tak takVar = (tak) xakVar.a;
                if (takVar != null) {
                    takVar.vf(wbu0.a(xakVar.b, th2, false));
                }
                throw new xak.c();
            case 27:
                wkm wkmVar = (wkm) ((alm) this.c).d.getValue();
                wkmVar.getClass();
                return new s0(new vkm(wkmVar, (com.vk.im.engine.models.dialogs.c) obj)).L(new jo3(new f1j(wkmVar, i), 8), false);
            case 28:
                io.reactivex.rxjava3.subjects.f<hfz> fVar2 = ((fum) this.c).q;
                hg1.d1 d1Var = new hg1.d1(m86.d);
                fVar2.getClass();
                j1 U = new i0(fVar2, d1Var).U(new l7(kum.b, 18));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                asu0.a.getClass();
                return new i0(U.d(900000L, timeUnit, asu0.i(), Integer.MAX_VALUE, new dum()), new rf1(new a60(25), 19));
            default:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) this.c;
                int i5 = DiscoverSearchFragment.s0;
                ysg0<Object> ysg0Var = ysg0.b;
                VkFeedSearchParams copy = discoverSearchFragment.Z.copy();
                copy.h5((SearchParams) obj);
                ysg0Var.a(new bru0(copy));
                return s3q0.a;
        }
    }
}
