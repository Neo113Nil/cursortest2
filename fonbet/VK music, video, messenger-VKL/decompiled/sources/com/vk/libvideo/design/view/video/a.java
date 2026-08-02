package com.vk.libvideo.design.view.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.vk.api.generated.market.dto.MarketUpdateCommunityReviewResponseDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.emailactualization.EmailActualizationMetadataResult;
import com.vk.catalog2.common.dto.ui.UIBlockArticle;
import com.vk.channels.impl.comments.b;
import com.vk.channels.impl.comments.g;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.articles.Article;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import com.vk.fave.fragments.FavesTabSearchFragment;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Error;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Parameters;
import com.vk.update.core.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.completable.s;
import io.reactivex.rxjava3.internal.operators.single.j;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a1g0;
import xsna.a2j;
import xsna.akv;
import xsna.asu0;
import xsna.ax1;
import xsna.b110;
import xsna.b140;
import xsna.b25;
import xsna.bi20;
import xsna.bpn0;
import xsna.c2b;
import xsna.c5g;
import xsna.cbf0;
import xsna.clj0;
import xsna.cm;
import xsna.cqa0;
import xsna.d110;
import xsna.dfw0;
import xsna.dgh;
import xsna.dw30;
import xsna.dws;
import xsna.e0o;
import xsna.e39;
import xsna.edt;
import xsna.epx;
import xsna.fa00;
import xsna.fco0;
import xsna.fh8;
import xsna.fmk;
import xsna.fvw;
import xsna.fzg;
import xsna.g30;
import xsna.gbf0;
import xsna.ggh;
import xsna.gh8;
import xsna.gy30;
import xsna.gzs;
import xsna.h2h0;
import xsna.h8i0;
import xsna.hg1;
import xsna.hq80;
import xsna.iet;
import xsna.ipm;
import xsna.izs;
import xsna.jai;
import xsna.jgp;
import xsna.k110;
import xsna.k7i0;
import xsna.kk7;
import xsna.kx30;
import xsna.lk7;
import xsna.lla;
import xsna.lx6;
import xsna.m7i0;
import xsna.n010;
import xsna.n7i0;
import xsna.n7k;
import xsna.nk00;
import xsna.nvy;
import xsna.o25;
import xsna.o280;
import xsna.o2j;
import xsna.om1;
import xsna.on00;
import xsna.p3b;
import xsna.pgn;
import xsna.pka;
import xsna.pn00;
import xsna.pvw0;
import xsna.qcy;
import xsna.qgi0;
import xsna.qwz;
import xsna.r69;
import xsna.rmy;
import xsna.rry;
import xsna.rsg0;
import xsna.s3q0;
import xsna.svp;
import xsna.t69;
import xsna.tft0;
import xsna.tgi0;
import xsna.tmz;
import xsna.tqz;
import xsna.uft0;
import xsna.uhc;
import xsna.ulz;
import xsna.umz;
import xsna.uoh;
import xsna.us2;
import xsna.v1j;
import xsna.v940;
import xsna.vhc;
import xsna.viw;
import xsna.w060;
import xsna.w2w;
import xsna.whs0;
import xsna.wow;
import xsna.wrw;
import xsna.x7a;
import xsna.xbt;
import xsna.xnt;
import xsna.xrq;
import xsna.xy2;
import xsna.ybp;
import xsna.yfb;
import xsna.ygp0;
import xsna.ykk;
import xsna.ypd0;
import xsna.yyg;
import xsna.z13;
import xsna.z1e;
import xsna.zf20;
import xsna.zpd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 5;
        int i3 = 18;
        int i4 = 1;
        Object obj2 = null;
        int i5 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                umz umzVar = (umz) obj4;
                VideoFile videoFile = (VideoFile) obj3;
                VkButton vkButton = (VkButton) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                bpn0 bpn0Var = o25.a;
                if (((b25) (bpn0Var != null ? bpn0Var : null).getValue()).b()) {
                    Boolean P8 = videoFile.P8();
                    boolean z = !(P8 != null ? P8.booleanValue() : false);
                    uft0 uft0Var = new uft0();
                    xy2 c = epx.f(videoFile.P8(), Boolean.TRUE) ? uft0Var.c(videoFile.I0(), Integer.valueOf(videoFile.o0())) : tft0.l(uft0Var, videoFile.I0(), Integer.valueOf(videoFile.o0()), 4);
                    vkButton.setLoading(true);
                    c subscribe = new j(rsg0.w0(yfb.x(c)).m(asu0.a.d()), new lx6(vkButton, i2)).subscribe(new tmz(new dws(videoFile, z, i4), i5), new om1(new z13(25), 26));
                    pgn pgnVar = umzVar.a;
                    qcy<Object> qcyVar = umz.b[0];
                    pgnVar.b(subscribe);
                } else {
                    vkButton.getContext();
                }
                return s3q0.a;
            case 1:
                AuthResult authResult = (AuthResult) obj4;
                s sVar = (s) obj3;
                ybp ybpVar = (ybp) obj;
                if (!(ybpVar instanceof ybp.b)) {
                    if (ybpVar instanceof ybp.a) {
                        return sVar;
                    }
                    if (ybpVar instanceof ybp.c) {
                        return sVar.c(io.reactivex.rxjava3.core.a.l(new g30(ybpVar, authResult)).q(io.reactivex.rxjava3.android.schedulers.a.b()));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Bundle bundle = authResult.r;
                if (bundle == null) {
                    return sVar;
                }
                EmailActualizationMetadataResult emailActualizationMetadataResult = ((ybp.b) ybpVar).a ? EmailActualizationMetadataResult.SUCCESS : EmailActualizationMetadataResult.ERROR;
                bundle.putString("email_actualization_result_key", emailActualizationMetadataResult != null ? emailActualizationMetadataResult.name() : null);
                return sVar;
            case 2:
                BonusCatalogFragment bonusCatalogFragment = ((kk7) obj4).m;
                StickerStockItemDiscount stickerStockItemDiscount = ((lk7) obj3).c;
                bonusCatalogFragment.go();
                return s3q0.a;
            case 3:
                ((e39) obj4).l.invoke(new r69.a(((t69.a.C3724a) obj3).b));
                return s3q0.a;
            case 4:
                lla llaVar = (lla) obj3;
                ((pka) obj4).a(((x7a.d.b) llaVar.getItem()).e, ((x7a.d.b) llaVar.getItem()).e.e, Integer.valueOf(((x7a.d.b) llaVar.getItem()).f));
                return s3q0.a;
            case 5:
                b bVar = (b) obj4;
                g gVar = (g) obj;
                bVar.n.remove((Integer) obj3);
                return g.a(gVar, b.s(bVar, bVar.k.a(), false, 3), null, gVar.c != null ? new g.b(g.b.a.C0535b.a) : null, false, 10);
            case 6:
                c2b c2bVar = (c2b) obj4;
                AttachWithDownload attachWithDownload = (AttachWithDownload) obj3;
                c2bVar.b.e1(c2bVar, new o280(c2bVar, pn00.n(c2b.a(c2bVar.c, attachWithDownload), c2b.a(c2bVar.d, attachWithDownload))));
                c2bVar.e.O(attachWithDownload);
                return s3q0.a;
            case 7:
                return hg1.n(new v(new uhc(i5, (vhc) obj3, (List) obj)), (Activity) obj4, false, null, 54);
            case 8:
                ((z1e) obj4).b.remove((String) obj3);
                return s3q0.a;
            case 9:
                yyg yygVar = (yyg) obj4;
                MarketUpdateCommunityReviewResponseDto marketUpdateCommunityReviewResponseDto = (MarketUpdateCommunityReviewResponseDto) obj;
                String e = marketUpdateCommunityReviewResponseDto.e();
                String d = marketUpdateCommunityReviewResponseDto.d();
                n7k n7kVar = ((fzg) obj3).e;
                yygVar.W(e, d, n7kVar != null ? n7kVar.b : null);
                return s3q0.a;
            case 10:
                return ((dgh) obj4).I((Clips) obj3, (ggh.a) obj);
            case 11:
                v1j.n nVar = (v1j.n) obj4;
                L.g("Error on rename session room " + nVar.b, (Throwable) obj);
                ((a2j) obj3).T(new o2j.l(nVar.c));
                return s3q0.a;
            case 12:
                uoh uohVar = (uoh) obj3;
                ModalActionSheetListItem modalActionSheetListItem = (ModalActionSheetListItem) obj;
                Iterator it = ((List) obj4).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((e0o) next).a == modalActionSheetListItem.a) {
                            obj2 = next;
                        }
                    }
                }
                e0o e0oVar = (e0o) obj2;
                if (e0oVar == null) {
                    return s3q0.a;
                }
                uohVar.invoke(e0oVar);
                return s3q0.a;
            case 13:
                ((v940) obj).b((ykk) obj4, (ax1) obj3);
                return s3q0.a;
            case 14:
                com.vk.lists.c cVar = (com.vk.lists.c) obj4;
                FavesTabSearchFragment favesTabSearchFragment = (FavesTabSearchFragment) obj3;
                List list = (List) obj;
                if (cVar.j() == null || epx.f(cVar.j(), "0")) {
                    favesTabSearchFragment.s();
                }
                cVar.s(String.valueOf(list.size()));
                cVar.r(false);
                xrq xrqVar = favesTabSearchFragment.Z;
                xrq xrqVar2 = xrqVar == null ? null : xrqVar;
                if (xrqVar == null) {
                    xrqVar = null;
                }
                ((ListDataSet) xrqVar2.c).B(0, xrqVar.E0());
                xrq xrqVar3 = favesTabSearchFragment.Z;
                (xrqVar3 != null ? xrqVar3 : null).n0(list);
                return s3q0.a;
            case 15:
                xbt xbtVar = (xbt) obj4;
                xbtVar.X(iet.l.a);
                xbtVar.T(new edt.f.d((GamesCatalogScreenTab) obj3));
                return s3q0.a;
            case 16:
                xnt xntVar = (xnt) obj4;
                qwz qwzVar = (qwz) obj3;
                if (((Boolean) obj).booleanValue()) {
                    xntVar.k = qwzVar;
                    d<List<qwz>> dVar = xntVar.e;
                    if (!xntVar.d) {
                        xntVar.b();
                    }
                    List<qwz> P0 = dVar.P0();
                    if (P0 == null) {
                        P0 = EmptyList.b;
                    }
                    List<qwz> list2 = P0;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (qwz qwzVar2 : list2) {
                        arrayList.add(new qwz(qwzVar2.a, qwzVar2.b, epx.f(qwzVar2.d, qwzVar.d), qwzVar2.d));
                    }
                    dVar.onNext(arrayList);
                }
                return s3q0.a;
            case 17:
                akv.a aVar = new akv.a();
                aVar.a = (String) obj;
                aVar.c((Uri) obj3, "file1", "image.jpg");
                aVar.f = true;
                aVar.e = ((viw) obj4).b.getConfig().v;
                aVar.d = 5;
                return new akv(aVar);
            case 18:
                com.vk.update.core.a aVar2 = (com.vk.update.core.a) obj4;
                wrw wrwVar = (wrw) obj;
                aVar2.g.l("new download info:" + wrwVar);
                aVar2.j.onNext(new a.C1935a(wrwVar, ((a.C1935a) obj3).b));
                return s3q0.a;
            case 19:
                b110 b110Var = (b110) obj;
                ((n010) obj4).T(new d110.b.c(b110Var.a, b110Var.b, b110Var.c, ((k110) obj3).e));
                return s3q0.a;
            case 20:
                us2 us2Var = (us2) obj4;
                izs izsVar = (izs) obj3;
                tgi0 tgi0Var = (tgi0) obj;
                String str = us2Var.c;
                List<us2.d<String>> b = us2Var.b(0, str.length());
                ArrayList arrayList2 = new ArrayList(c5g.u(b, 10));
                Iterator<T> it2 = b.iterator();
                while (it2.hasNext()) {
                    us2.d dVar2 = (us2.d) it2.next();
                    arrayList2.add(new fmk(str.substring(dVar2.b, dVar2.c), new cm(i3, izsVar, dVar2)));
                }
                qgi0.i(tgi0Var, arrayList2);
                return s3q0.a;
            case 21:
                dw30.a aVar3 = (dw30.a) obj;
                return new Pair(aVar3, (ipm) ((w2w) obj3).L0((kx30) obj4, new gy30(aVar3)));
            case 22:
                bi20 bi20Var = (bi20) obj3;
                ((w060) obj4).getClass();
                return new UIBlockArticle(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (Article) obj);
            case 23:
                hq80 hq80Var = (hq80) obj4;
                ygp0 ygp0Var = (ygp0) obj3;
                L.e("Offline", "error while receiving tracks");
                gzs<s3q0> gzsVar = hq80Var.h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                c cVar2 = hq80Var.j;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                hq80Var.g.invoke(new hq80.a(null, new whs0(0L, 0L), null, new zf20(ygp0Var, 13)));
                return s3q0.a;
            case 24:
                Throwable th = (Throwable) obj;
                svp svpVar = ((cqa0) obj4).c;
                String f = ((ConversionHit$Parameters) obj3).f();
                svpVar.getClass();
                if (fco0.d(th)) {
                    svpVar.d(fco0.h(f, th));
                } else {
                    com.vk.superapp.base.js.bridge.b.o(svpVar.a, new JsMethod("VKWebAppConversionHit"), new ConversionHit$Error(null, new ConversionHit$Error.Data(ConversionHit$Error.Data.Type.API_ERROR, f, null, fco0.g(th), 4, null), 1, null), null, null, 12);
                }
                return s3q0.a;
            case 25:
                ArrayList arrayList3 = (ArrayList) obj4;
                wow wowVar = new wow(arrayList3);
                ((rry) obj).a(arrayList3.size(), new nk00(new ulz(18), wowVar, 1), new ypd0(wowVar, 0), new jai(-1117249557, new zpd0(wowVar, (izs) obj3, i5), true));
                return s3q0.a;
            case 26:
                gbf0 gbf0Var = (gbf0) obj4;
                com.vk.lists.c cVar3 = (com.vk.lists.c) obj3;
                StickerPackRecommendationBlock stickerPackRecommendationBlock = (StickerPackRecommendationBlock) obj;
                String str2 = gbf0Var.g;
                if (str2 != null) {
                    cVar3.s(stickerPackRecommendationBlock.f);
                    cbf0 a = gbf0Var.b.a(str2);
                    if (a == null) {
                        return s3q0.a;
                    }
                    gbf0Var.h.J0(a);
                }
                return s3q0.a;
            case 27:
                p3b p3bVar = (p3b) obj4;
                AttachWithId attachWithId = (AttachWithId) obj3;
                ArrayList G = p3bVar.G(attachWithId.getClass(), attachWithId.q(), Long.valueOf(attachWithId.getId()));
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : G) {
                    if (obj5 instanceof MsgFromChannel) {
                        arrayList4.add(obj5);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return jgp.b;
                }
                b140 b140Var = new b140(attachWithId, 15);
                fa00 fa00Var = new fa00(attachWithId, 19);
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    ((MsgFromChannel) it3.next()).nc(b140Var, fa00Var);
                }
                p3bVar.a(arrayList4);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    Long valueOf = Long.valueOf(((MsgFromChannel) next2).c);
                    Object obj6 = linkedHashMap.get(valueOf);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap.put(valueOf, obj6);
                    }
                    ((List) obj6).add(next2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Iterable iterable = (Iterable) entry.getValue();
                    ArrayList arrayList5 = new ArrayList(c5g.u(iterable, 10));
                    Iterator it5 = iterable.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(Integer.valueOf(((MsgFromChannel) it5.next()).b));
                    }
                    linkedHashMap2.put(key, arrayList5);
                }
                return linkedHashMap2;
            case 28:
                List<h8i0> list3 = ((k7i0) obj4).a;
                ((nvy) obj).e(list3.size(), new tqz(new h2h0(2), list3), new m7i0(list3), new jai(802480018, new n7i0(list3, (izs) obj3), true));
                return s3q0.a;
            default:
                clj0 clj0Var = (clj0) obj4;
                rmy rmyVar = ((gh8.g) obj3).a;
                dfw0 dfw0Var = ((fvw) obj).d;
                ((pvw0) clj0Var.c.b().b).t0(dfw0Var.a, dfw0Var.b, rmyVar instanceof rmy.b);
                clj0Var.e.invoke(new fh8.j.c(rmyVar));
                return s3q0.a;
        }
    }

    public /* synthetic */ a(p3b p3bVar, AttachWithId attachWithId, a1g0 a1g0Var) {
        this.b = 27;
        this.c = p3bVar;
        this.d = attachWithId;
    }
}
