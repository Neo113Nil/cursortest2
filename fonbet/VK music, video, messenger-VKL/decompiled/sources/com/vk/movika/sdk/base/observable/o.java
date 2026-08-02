package com.vk.movika.sdk.base.observable;

import com.vk.clips.design.view.feed.item.owner.ClipSubscribeBtnView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.crop.CropImageView;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.VKList;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.stories.entities.StoryImSharingData;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.stickers.views.gift.AnimatedGiftView;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ao8;
import xsna.asu0;
import xsna.bp8;
import xsna.bzb0;
import xsna.cp0;
import xsna.cwb0;
import xsna.d22;
import xsna.d5v;
import xsna.d7k;
import xsna.d9;
import xsna.dhr0;
import xsna.drm0;
import xsna.dw20;
import xsna.e5;
import xsna.epx;
import xsna.fqb;
import xsna.h58;
import xsna.hg1;
import xsna.hrh;
import xsna.hu4;
import xsna.i2f;
import xsna.i5e0;
import xsna.iie;
import xsna.izs;
import xsna.kz0;
import xsna.lfk;
import xsna.ltb;
import xsna.lu1;
import xsna.m9;
import xsna.mi3;
import xsna.o9c;
import xsna.ohm;
import xsna.otb;
import xsna.pno0;
import xsna.q9x;
import xsna.qq1;
import xsna.rh3;
import xsna.rj0;
import xsna.s3q0;
import xsna.scl;
import xsna.sem;
import xsna.sz;
import xsna.tj50;
import xsna.tlo0;
import xsna.tq;
import xsna.ucd;
import xsna.uhe;
import xsna.uj2;
import xsna.um9;
import xsna.uv0;
import xsna.vj0;
import xsna.vt4;
import xsna.vua0;
import xsna.w2w;
import xsna.w48;
import xsna.w7c;
import xsna.wh1;
import xsna.xse0;
import xsna.z37;
import xsna.z9a;
import xsna.zk2;
import xsna.zk70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v84, types: [com.vk.im.ui.components.dialogs_list.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        tlo0.a aVar;
        int i;
        int i2 = 4;
        int i3 = 5;
        int i4 = 8;
        ?? r5 = 1;
        int i5 = 0;
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.h) obj).m((com.vk.movika.sdk.base.model.l) this.c);
                return s3q0.a;
            case 1:
                com.vk.photos.root.albumdetails.presentation.h hVar = (com.vk.photos.root.albumdetails.presentation.h) this.c;
                tj50.a aVar2 = (tj50.a) obj;
                wh1 wh1Var = new wh1(i5);
                ao8 ao8Var = ao8.d;
                return new k.a(aVar2.a(new com.vk.photos.root.albumdetails.presentation.e(1, hVar, com.vk.photos.root.albumdetails.presentation.h.class, "composeHeaderState", "composeHeaderState(Lcom/vk/photos/root/albumdetails/presentation/AlbumDetailsState;)Lcom/vk/photos/root/albumdetails/presentation/AlbumDetailsViewState$HeaderState;", 0), ao8Var), aVar2.a(wh1Var, ao8Var), aVar2.a(new com.vk.photos.root.albumdetails.presentation.f(1, hVar, com.vk.photos.root.albumdetails.presentation.h.class, "composeListState", "composeListState(Lcom/vk/photos/root/albumdetails/presentation/AlbumDetailsState;)Lcom/vk/photos/root/albumdetails/presentation/AlbumDetailsViewState$ListState;", 0), ao8Var));
            case 2:
                qq1 qq1Var = (qq1) this.c;
                qq1Var.c.setIsShow(true);
                qq1Var.d.setVisibility(4);
                return s3q0.a;
            case 3:
                lu1 lu1Var = (lu1) this.c;
                lu1Var.k = lu1Var.l;
                lu1Var.g.a().a(new Pair<>(lu1Var.d, new d5v.d(new VKList(lu1Var.k))));
                lu1Var.R1(false);
                return s3q0.a;
            case 4:
                AnimatedGiftView animatedGiftView = (AnimatedGiftView) this.c;
                int i6 = AnimatedGiftView.g;
                uv0 uv0Var = new uv0((int) (r5 == true ? 1 : 0));
                xse0 xse0Var = animatedGiftView.b;
                zk2 zk2Var = animatedGiftView.d;
                boolean z = animatedGiftView.e;
                boolean M = dhr0.M();
                uj2 uj2Var = new uj2(uv0Var, animatedGiftView);
                xse0Var.b = z;
                xse0Var.setAnimatedItem(zk2Var);
                xse0Var.f = uj2Var;
                xse0Var.h = Boolean.valueOf(M);
                if (xse0Var.g) {
                    xse0Var.l0(Boolean.valueOf(M));
                }
                return s3q0.a;
            case 5:
                ((rh3) this.c).T(new mi3.g((Set) obj));
                return s3q0.a;
            case 6:
                ((hu4) this.c).c.invoke(vt4.b.b);
                return s3q0.a;
            case 7:
                BaseDebugTogglesFragment baseDebugTogglesFragment = (BaseDebugTogglesFragment) this.c;
                int i7 = BaseDebugTogglesFragment.X;
                return baseDebugTogglesFragment.go(drm0.p0(((pno0) obj).d()).toString());
            case 8:
                ((z37) this.c).b((com.vk.ecomm.onlinebooking.impl.services.presentation.a) obj);
                return s3q0.a;
            case 9:
                ((h58) this.c).d();
                return s3q0.a;
            case 10:
                ((bp8) this.c).j.a(Source.NETWORK);
                return s3q0.a;
            case 11:
                com.vk.voip.ui.settings.participants_view.c cVar = (com.vk.voip.ui.settings.participants_view.c) this.c;
                bzb0 bzb0Var = cVar.p;
                CallParticipantsViewModel.c cVar2 = (CallParticipantsViewModel.c) obj;
                if (cVar2 instanceof CallParticipantsViewModel.c.C2085c) {
                    bzb0Var.a();
                } else if (cVar2 instanceof CallParticipantsViewModel.c.b) {
                    bzb0Var.c(new cwb0.s0(null, R.string.voip_share_link_loading, 5), new defpackage.h(cVar, 10));
                } else if (cVar2 instanceof CallParticipantsViewModel.c.d) {
                    bzb0Var.a();
                    if (epx.f(((CallParticipantsViewModel.c.d) cVar2).a, "ShareLink")) {
                        cVar.a(j.m.a);
                        cVar.a(j.o.a);
                    }
                } else {
                    if (!(cVar2 instanceof CallParticipantsViewModel.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zk70.e(((CallParticipantsViewModel.c.a) cVar2).a);
                    bzb0Var.a();
                    cVar.a(j.o.a);
                }
                return s3q0.a;
            case 12:
                StoryImSharingData storyImSharingData = (StoryImSharingData) obj;
                int i8 = 3;
                return new io.reactivex.rxjava3.internal.operators.maybe.z(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new um9()), new d22(new m9(i8, (com.vk.cameraui.impl.a) this.c, storyImSharingData.getUri()), 7)).l(new d9(new sz(storyImSharingData, i4), i8)).v(), new vj0(new kz0(i3), i2));
            case 13:
                z9a z9aVar = (z9a) this.c;
                vua0 vua0Var = z9aVar.j;
                String str = z9aVar.h;
                vua0Var.getClass();
                return vua0.C(str, (List) obj);
            case 14:
                return ((w2w) this.c).K().n().k(UUID.randomUUID().toString(), ReporterType.CHANNEL);
            case 15:
                ((fqb) this.c).l.f();
                return s3q0.a;
            case 16:
                otb otbVar = (otb) this.c;
                otb.b bVar = otbVar.l;
                Dialog Cb = bVar.a.Cb();
                if (Cb == null || Cb.Sb().longValue() == 0) {
                    return ltb.c.a;
                }
                if (!bVar.e && !bVar.c) {
                    if (bVar.f) {
                        return new ltb.a(otbVar.l.j);
                    }
                    throw new IllegalStateException("Unexpected init state");
                }
                otb.c cVar3 = otbVar.c;
                ?? r3 = cVar3.a.length() > 0;
                boolean z2 = (r3 == true && !cVar3.c.get()) || (!r3 == true && bVar.i);
                boolean z3 = cVar3.a.length() > 0;
                ohm ohmVar = bVar.h;
                rj0.a aVar3 = new rj0.a(ohmVar, otbVar.l.a.b, bVar.b, z2, true);
                ChatSettings Hb = Cb.Hb();
                if (Hb == null) {
                    list = EmptyList.b;
                } else {
                    ArrayList arrayList = new ArrayList(ohmVar.b.size() + 20);
                    rj0.a(arrayList, Cb, Hb, aVar3, z3);
                    list = arrayList;
                }
                return new ltb.b(list);
            case 17:
                return new o9c.b(((tj50.a) obj).a(new e5((w7c) this.c, 22), ao8.d));
            case 18:
                ucd ucdVar = ((ClipSubscribeBtnView) this.c).b;
                if (ucdVar != null) {
                    ucdVar.V();
                }
                return s3q0.a;
            case 19:
                boolean z4 = ((com.vk.clips.favorites.impl.ui.folders.content.f) this.c).d.b() instanceof FavoriteFolderId.Alias.AllClips;
                if (z4) {
                    aVar = tlo0.Companion;
                    i = R.string.clips_favorites_folder_content_list_empty_all_clips_description;
                } else {
                    aVar = tlo0.Companion;
                    i = R.string.clips_favorites_folder_content_list_empty_description;
                }
                return new ClipsFavoriteFolderContentListViewState.EmptyViewState(tq.h(aVar, i), z4 ? ClipsFavoriteFolderContentListViewState.EmptyViewState.Mode.VIEW_CLIPS : ClipsFavoriteFolderContentListViewState.EmptyViewState.Mode.ADD_CLIPS);
            case 20:
                return new io.reactivex.rxjava3.internal.operators.maybe.e0(((uhe) this.c).a.a(), io.reactivex.rxjava3.core.x.i((Throwable) obj));
            case 21:
                ((hrh) this.c).e0().k(obj);
                return s3q0.a;
            case 22:
                ((w48) this.c).a = (int) (((q9x) obj).a & 4294967295L);
                return s3q0.a;
            case 23:
                ((i2f) this.c).invoke();
                return s3q0.a;
            case 24:
                CreateChatTransferFragment createChatTransferFragment = (CreateChatTransferFragment) this.c;
                MoneyCard moneyCard = (MoneyCard) obj;
                int i9 = CreateChatTransferFragment.F0;
                Object obj2 = createChatTransferFragment.m0;
                ((d7k) (obj2 != null ? obj2 : null)).t(moneyCard);
                dw20 dw20Var = createChatTransferFragment.B0;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 25:
                com.vk.avatarpicker.a aVar4 = ((com.vk.avatarpicker.b) this.c).i;
                com.vk.avatarpicker.a aVar5 = aVar4 != null ? aVar4 : null;
                ((CropImageView) aVar5.b.invoke()).a();
                if (!hg1.d(aVar5.c)) {
                    s0 s0Var = new s0(new lfk(aVar5, i5));
                    asu0.a.getClass();
                    aVar5.c = s0Var.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cp0(new iie(aVar5, i4), 18));
                }
                return s3q0.a;
            case 26:
                scl sclVar = (scl) this.c;
                sclVar.f = 0;
                sclVar.i.r(true);
                return s3q0.a;
            case 27:
                ((com.vk.clips.sdk.shared.item.common.description.b) this.c).c.g(new c.d((String) obj));
                return s3q0.a;
            case 28:
                return ((sem) this.c).b(((com.vk.im.engine.models.messages.a) obj).q7());
            default:
                ?? r0 = (com.vk.im.ui.components.dialogs_list.c) this.c;
                r0.h.x = (i5e0) obj;
                r0.B(r0);
                return s3q0.a;
        }
    }
}
