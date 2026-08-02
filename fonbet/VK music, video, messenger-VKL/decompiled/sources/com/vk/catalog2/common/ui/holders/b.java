package com.vk.catalog2.common.ui.holders;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Size;
import android.view.View;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.material.DrawerValue;
import com.ironsource.B5;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.api.communities.CatalogGetSearchGroupsRequestFactory;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastItem;
import com.vk.catalog2.feature.music.holders.podcast.PodcastSliderCellVh;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.apps.BuildInfo;
import com.vk.core.tips.Tooltip;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vk.media.pipeline.session.transform.task.transcode.TranscodeException;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.actions.e;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter;
import com.vk.search.communities.map.api.router.SearchMapPreviewStateWrapper;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.b5a;
import xsna.bjc;
import xsna.bp7;
import xsna.bpn0;
import xsna.bsd0;
import xsna.ceq0;
import xsna.cfp0;
import xsna.cih;
import xsna.d3h;
import xsna.dee;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fb7;
import xsna.fkh;
import xsna.fl4;
import xsna.fnj;
import xsna.fot;
import xsna.g8i;
import xsna.gk;
import xsna.gzs;
import xsna.h4p0;
import xsna.h8t;
import xsna.hds0;
import xsna.huo;
import xsna.hv70;
import xsna.iah0;
import xsna.iai0;
import xsna.ib7;
import xsna.ikv0;
import xsna.itg0;
import xsna.iuc0;
import xsna.iyn;
import xsna.izs;
import xsna.j5g;
import xsna.kei0;
import xsna.klo;
import xsna.l0h0;
import xsna.le70;
import xsna.lei0;
import xsna.lwf0;
import xsna.lyd;
import xsna.m340;
import xsna.me70;
import xsna.mtk0;
import xsna.myn;
import xsna.nbo;
import xsna.np1;
import xsna.o9t;
import xsna.ohy;
import xsna.pkv0;
import xsna.po5;
import xsna.q3a;
import xsna.q530;
import xsna.q6x;
import xsna.qq90;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sxo0;
import xsna.u7e0;
import xsna.u7r;
import xsna.u98;
import xsna.uwr0;
import xsna.va7;
import xsna.vq90;
import xsna.wjs0;
import xsna.wqs0;
import xsna.xga;
import xsna.xvk0;
import xsna.xyh0;
import xsna.yfb;
import xsna.yi80;
import xsna.z0o;
import xsna.zao;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20, types: [xsna.qq90$c] */
    /* JADX WARN: Type inference failed for: r11v23, types: [xsna.qq90$k] */
    /* JADX WARN: Type inference failed for: r11v4, types: [xsna.qq90$a] */
    /* JADX WARN: Type inference failed for: r11v5, types: [xsna.qq90$j] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v43, types: [xsna.qq90$i] */
    /* JADX WARN: Type inference failed for: r9v45, types: [xsna.qq90$q] */
    /* JADX WARN: Type inference failed for: r9v47, types: [xsna.qq90$g] */
    /* JADX WARN: Type inference failed for: r9v49, types: [xsna.qq90$o] */
    /* JADX WARN: Type inference failed for: r9v51, types: [xsna.qq90$h] */
    /* JADX WARN: Type inference failed for: r9v53, types: [xsna.qq90$p] */
    /* JADX WARN: Type inference failed for: r9v68, types: [xsna.qq90$s] */
    /* JADX WARN: Type inference failed for: r9v70, types: [xsna.qq90$r] */
    /* JADX WARN: Type inference failed for: r9v72, types: [xsna.qq90$d] */
    /* JADX WARN: Type inference failed for: r9v74, types: [xsna.qq90$l] */
    /* JADX WARN: Type inference failed for: r9v76, types: [xsna.qq90$e] */
    /* JADX WARN: Type inference failed for: r9v78, types: [xsna.qq90$m] */
    /* JADX WARN: Type inference failed for: r9v80, types: [xsna.qq90$f] */
    /* JADX WARN: Type inference failed for: r9v84, types: [xsna.qq90$n] */
    @Override // xsna.gzs
    public final Object invoke() {
        List list;
        qq90.b bVar;
        qq90.b bVar2;
        qq90.b bVar3;
        Thumb thumb;
        int i = 0;
        sxo0 sxo0Var = null;
        switch (this.b) {
            case 0:
                HeaderVh headerVh = (HeaderVh) this.c;
                UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) this.d;
                xga xgaVar = headerVh.e;
                String str = uIBlockHideBlockButton.A;
                List<String> list2 = uIBlockHideBlockButton.B;
                headerVh.o = itg0.m(rsg0.y0(yfb.x(xgaVar.m(str, null)), null, null, 3));
                View view = headerVh.f;
                if (view == null) {
                    view = null;
                }
                Context context = view.getContext();
                int a = iah0.a(24);
                String string = HeaderVh.a(uIBlockHideBlockButton) ? context.getString(R.string.hide_block_of_clips) : context.getString(R.string.hide_block_of_videos);
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_accent_green), new Size(a, a), 8);
                aVar.u = new ikv0.d(string, (String) r6, (ikv0.d.a) r6, 6);
                if (HeaderVh.a(uIBlockHideBlockButton)) {
                    aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.video_hide_cancel), new bp7(15, uIBlockHideBlockButton, context));
                }
                pkv0.e(aVar);
                if (fnj.b(context)) {
                    aVar.k = 1;
                    aVar.g(1);
                }
                pkv0.f(aVar);
                b5a b5aVar = headerVh.d;
                if (b5aVar != null) {
                    b5aVar.a(new cfp0(uIBlockHideBlockButton, null));
                }
                if (HeaderVh.a(uIBlockHideBlockButton)) {
                    wjs0.a(new uwr0(list2, true));
                } else {
                    q3a q3aVar = headerVh.c;
                    if (q3aVar != null) {
                        q3aVar.b(new lwf0(list2), false);
                    }
                }
                return s3q0.a;
            case 1:
                return new SimpleDateFormat(((Context) this.c).getString(R.string.vkim_accessability_time_etc), ((gk) this.d).f);
            case 2:
                va7 va7Var = (va7) this.c;
                ib7.a aVar2 = (ib7.a) this.d;
                np1 np1Var = va7Var.m;
                Object obj = va7Var.l;
                np1Var.b(new fb7.b(((ib7) (obj != null ? obj : 0)).b, aVar2.c));
                return s3q0.a;
            case 3:
                return ((l0h0) ((u98) this.c).c).b(((VideoFragment) this.d).b);
            case 4:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                MasksWrap masksWrap = (MasksWrap) this.d;
                float f = CameraUIView.w1;
                f4m.q((int) cameraUIView.G(cameraUIView.Q(false)), masksWrap);
                return s3q0.a;
            case 5:
                return dee.a((ceq0) this.c, (dee) this.d);
            case 6:
                ((d3h) this.c).i((String) this.d);
                return s3q0.a;
            case 7:
                cih cihVar = (cih) this.c;
                return new fkh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) this.d, cihVar.f);
            case 8:
                ((e) this.c).b.m(((d.b.a) ((d.b) this.d)).a);
                return s3q0.a;
            case 9:
                z0o z0oVar = (z0o) this.c;
                z0oVar.h.invoke(((iyn) this.d).g);
                myn mynVar = z0oVar.i;
                mynVar.getClass();
                new bjc(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(mynVar.a.b), null, null, null, 58, null), new CommonCommunitiesStat$TypeDonutClick(CommonCommunitiesStat$TypeDonutClick.EventType.CLICK_DONUT_FAQ, null, null, 6, null), 2)).q();
                return s3q0.a;
            case 10:
                ((izs) this.c).invoke(new zao.d(((nbo) this.d).b));
                return s3q0.a;
            case 11:
                return new klo((DrawerValue) this.c, (izs) this.d);
            case 12:
                yi80 yi80Var = (yi80) this.c;
                u7r u7rVar = (u7r) this.d;
                return "Append event " + yi80Var.a + " into file " + u7rVar.a + ". originalSize= " + u7rVar.g;
            case 13:
                ((izs) this.c).invoke(new o9t.b((h8t) this.d));
                return s3q0.a;
            case 14:
                GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh = (GlobalSearchGroupsCatalogRootVh) this.c;
                xyh0 xyh0Var = (xyh0) this.d;
                SearchCommunitiesOnMapRouter searchCommunitiesOnMapRouter = (SearchCommunitiesOnMapRouter) globalSearchGroupsCatalogRootVh.B.getValue();
                Activity activity = globalSearchGroupsCatalogRootVh.b;
                String str2 = ((CatalogGetSearchGroupsRequestFactory) globalSearchGroupsCatalogRootVh.C.getValue()).e;
                String str3 = str2 == null ? "" : str2;
                SearchMapPreviewStateWrapper searchMapPreviewStateWrapper = new SearchMapPreviewStateWrapper(xyh0Var.b);
                SearchCommunitiesOnMapRouter.MapEntrypoint mapEntrypoint = SearchCommunitiesOnMapRouter.MapEntrypoint.GlobalSearch;
                String V = globalSearchGroupsCatalogRootVh.k0().V();
                searchCommunitiesOnMapRouter.a(activity, str3, searchMapPreviewStateWrapper, mapEntrypoint, V == null ? "" : V);
                return s3q0.a;
            case 15:
                g8i g8iVar = (g8i) this.c;
                return "        " + g8iVar.id() + B5.U + ((g8i.a) this.d).e.get(g8iVar) + UcumUtils.UCUM_MILLISECODS;
            case 16:
                zrz.a aVar3 = (zrz.a) this.c;
                return "state: " + aVar3 + " while isReset = " + aVar3.f + ", on update: " + this.d;
            case 17:
                ((izs) this.c).invoke(((MembersListBanner) this.d).e);
                return s3q0.a;
            case 18:
                BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) this.c;
                m340 m340Var = (m340) this.d;
                Intent intent = baseSharingExternalActivity.N;
                if (intent != null) {
                    m340Var.getClass();
                    intent.putExtra("feature_has_been_shown", true);
                    baseSharingExternalActivity.startActivity(intent);
                }
                return s3q0.a;
            case 19:
                ((izs) this.c).invoke(new le70.g(((me70.d) this.d).a));
                return s3q0.a;
            case 20:
                ((izs) this.c).invoke(new a.e(((hv70.c) this.d).a));
                return s3q0.a;
            case 21:
                vq90 vq90Var = (vq90) this.c;
                float floatValue = ((Number) ((mtk0) this.d).getValue()).floatValue();
                ArrayList arrayList = vq90Var.a;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        ?? previous = listIterator.previous();
                        if (((sxo0) previous).a <= floatValue) {
                            sxo0Var = previous;
                        }
                    }
                }
                sxo0 sxo0Var2 = sxo0Var;
                if (sxo0Var2 == null) {
                    sxo0Var2 = (sxo0) j5g.Y(arrayList);
                }
                float f2 = (floatValue - sxo0Var2.a) / sxo0Var2.b;
                if (sxo0Var2.c != 0) {
                    int i2 = 0;
                    while (f2 > 1.0f) {
                        f2 -= 1.0f;
                        i2++;
                    }
                    if (sxo0Var2.d == RepeatMode.Reverse && i2 % 2 != 0) {
                        f2 = 1.0f - f2;
                    }
                }
                ArrayList arrayList2 = ((u7e0) sxo0Var2.e).b;
                Iterator it = arrayList2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (((ohy) it.next()).a < f2) {
                        i3++;
                    }
                }
                int i4 = i3 - 1;
                if (i4 < 0) {
                    i4 = 0;
                }
                int i5 = i4 + 1;
                huo huoVar = ((ohy) arrayList2.get(i5)).c;
                float f3 = (f2 - ((ohy) arrayList2.get(i4)).a) / (((ohy) arrayList2.get(i5)).a - ((ohy) arrayList2.get(i4)).a);
                if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = 0.0f;
                }
                float a2 = huoVar.a(f3 <= 1.0f ? f3 : 1.0f);
                List list3 = (List) ((ohy) arrayList2.get(i4)).b;
                List list4 = (List) ((ohy) arrayList2.get(i5)).b;
                int min = Math.min(list3.size(), list4.size());
                ArrayList arrayList3 = new ArrayList(min);
                while (i < min) {
                    Object obj2 = list3.get(i);
                    qq90 qq90Var = (qq90) list4.get(i);
                    qq90 qq90Var2 = (qq90) obj2;
                    if (qq90Var2 instanceof qq90.n) {
                        if (!(qq90Var instanceof qq90.n)) {
                            throw new IllegalArgumentException("start and stop path nodes have different types");
                        }
                        qq90.n nVar = (qq90.n) qq90Var2;
                        qq90.n nVar2 = (qq90.n) qq90Var;
                        bVar = new qq90.n(q6x.z(nVar.c, nVar2.c, a2), q6x.z(nVar.d, nVar2.d, a2));
                    } else if (qq90Var2 instanceof qq90.f) {
                        if (!(qq90Var instanceof qq90.f)) {
                            throw new IllegalArgumentException("start and stop path nodes have different types");
                        }
                        qq90.f fVar = (qq90.f) qq90Var2;
                        qq90.f fVar2 = (qq90.f) qq90Var;
                        bVar = new qq90.f(q6x.z(fVar.c, fVar2.c, a2), q6x.z(fVar.d, fVar2.d, a2));
                    } else if (qq90Var2 instanceof qq90.m) {
                        if (!(qq90Var instanceof qq90.m)) {
                            throw new IllegalArgumentException("start and stop path nodes have different types");
                        }
                        qq90.m mVar = (qq90.m) qq90Var2;
                        qq90.m mVar2 = (qq90.m) qq90Var;
                        bVar = new qq90.m(q6x.z(mVar.c, mVar2.c, a2), q6x.z(mVar.d, mVar2.d, a2));
                    } else if (qq90Var2 instanceof qq90.e) {
                        if (!(qq90Var instanceof qq90.e)) {
                            throw new IllegalArgumentException("start and stop path nodes have different types");
                        }
                        qq90.e eVar = (qq90.e) qq90Var2;
                        qq90.e eVar2 = (qq90.e) qq90Var;
                        bVar = new qq90.e(q6x.z(eVar.c, eVar2.c, a2), q6x.z(eVar.d, eVar2.d, a2));
                    } else if (qq90Var2 instanceof qq90.l) {
                        if (!(qq90Var instanceof qq90.l)) {
                            throw new IllegalArgumentException("start and stop path nodes have different types");
                        }
                        bVar = new qq90.l(q6x.z(((qq90.l) qq90Var2).c, ((qq90.l) qq90Var).c, a2));
                    } else if (qq90Var2 instanceof qq90.d) {
                        if (!(qq90Var instanceof qq90.d)) {
                            throw new IllegalArgumentException("start and stop path nodes have different types");
                        }
                        bVar = new qq90.d(q6x.z(((qq90.d) qq90Var2).c, ((qq90.d) qq90Var).c, a2));
                    } else if (qq90Var2 instanceof qq90.r) {
                        if (!(qq90Var instanceof qq90.r)) {
                            throw new IllegalArgumentException("start and stop path nodes have different types");
                        }
                        bVar = new qq90.r(q6x.z(((qq90.r) qq90Var2).c, ((qq90.r) qq90Var).c, a2));
                    } else if (!(qq90Var2 instanceof qq90.s)) {
                        if (qq90Var2 instanceof qq90.k) {
                            if (!(qq90Var instanceof qq90.k)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            qq90.k kVar = (qq90.k) qq90Var2;
                            qq90.k kVar2 = (qq90.k) qq90Var;
                            bVar3 = new qq90.k(q6x.z(kVar.c, kVar2.c, a2), q6x.z(kVar.d, kVar2.d, a2), q6x.z(kVar.e, kVar2.e, a2), q6x.z(kVar.f, kVar2.f, a2), q6x.z(kVar.g, kVar2.g, a2), q6x.z(kVar.h, kVar2.h, a2));
                        } else if (qq90Var2 instanceof qq90.c) {
                            if (!(qq90Var instanceof qq90.c)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            qq90.c cVar = (qq90.c) qq90Var2;
                            qq90.c cVar2 = (qq90.c) qq90Var;
                            bVar3 = new qq90.c(q6x.z(cVar.c, cVar2.c, a2), q6x.z(cVar.d, cVar2.d, a2), q6x.z(cVar.e, cVar2.e, a2), q6x.z(cVar.f, cVar2.f, a2), q6x.z(cVar.g, cVar2.g, a2), q6x.z(cVar.h, cVar2.h, a2));
                        } else if (qq90Var2 instanceof qq90.p) {
                            if (!(qq90Var instanceof qq90.p)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            qq90.p pVar = (qq90.p) qq90Var2;
                            qq90.p pVar2 = (qq90.p) qq90Var;
                            bVar = new qq90.p(q6x.z(pVar.c, pVar2.c, a2), q6x.z(pVar.d, pVar2.d, a2), q6x.z(pVar.e, pVar2.e, a2), q6x.z(pVar.f, pVar2.f, a2));
                        } else if (qq90Var2 instanceof qq90.h) {
                            if (!(qq90Var instanceof qq90.h)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            qq90.h hVar = (qq90.h) qq90Var2;
                            qq90.h hVar2 = (qq90.h) qq90Var;
                            bVar = new qq90.h(q6x.z(hVar.c, hVar2.c, a2), q6x.z(hVar.d, hVar2.d, a2), q6x.z(hVar.e, hVar2.e, a2), q6x.z(hVar.f, hVar2.f, a2));
                        } else if (qq90Var2 instanceof qq90.o) {
                            if (!(qq90Var instanceof qq90.o)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            qq90.o oVar = (qq90.o) qq90Var2;
                            qq90.o oVar2 = (qq90.o) qq90Var;
                            bVar = new qq90.o(q6x.z(oVar.c, oVar2.c, a2), q6x.z(oVar.d, oVar2.d, a2), q6x.z(oVar.e, oVar2.e, a2), q6x.z(oVar.f, oVar2.f, a2));
                        } else if (qq90Var2 instanceof qq90.g) {
                            if (!(qq90Var instanceof qq90.g)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            qq90.g gVar = (qq90.g) qq90Var2;
                            qq90.g gVar2 = (qq90.g) qq90Var;
                            bVar = new qq90.g(q6x.z(gVar.c, gVar2.c, a2), q6x.z(gVar.d, gVar2.d, a2), q6x.z(gVar.e, gVar2.e, a2), q6x.z(gVar.f, gVar2.f, a2));
                        } else if (qq90Var2 instanceof qq90.q) {
                            if (!(qq90Var instanceof qq90.q)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            qq90.q qVar = (qq90.q) qq90Var2;
                            qq90.q qVar2 = (qq90.q) qq90Var;
                            bVar = new qq90.q(q6x.z(qVar.c, qVar2.c, a2), q6x.z(qVar.d, qVar2.d, a2));
                        } else if (!(qq90Var2 instanceof qq90.i)) {
                            if (!(qq90Var2 instanceof qq90.j)) {
                                list = list4;
                                if (!(qq90Var2 instanceof qq90.a)) {
                                    bVar = qq90.b.c;
                                    if (!epx.f(qq90Var2, bVar)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    arrayList3.add(bVar);
                                    i++;
                                    list4 = list;
                                } else {
                                    if (!(qq90Var instanceof qq90.a)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    qq90.a aVar4 = (qq90.a) qq90Var2;
                                    qq90.a aVar5 = (qq90.a) qq90Var;
                                    bVar2 = new qq90.a(q6x.z(aVar4.c, aVar5.c, a2), q6x.z(aVar4.d, aVar5.d, a2), q6x.z(aVar4.e, aVar5.e, a2), aVar4.f, aVar4.g, q6x.z(aVar4.h, aVar5.h, a2), q6x.z(aVar4.i, aVar5.i, a2));
                                }
                            } else {
                                if (!(qq90Var instanceof qq90.j)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                qq90.j jVar = (qq90.j) qq90Var2;
                                qq90.j jVar2 = (qq90.j) qq90Var;
                                list = list4;
                                bVar2 = new qq90.j(q6x.z(jVar.c, jVar2.c, a2), q6x.z(jVar.d, jVar2.d, a2), q6x.z(jVar.e, jVar2.e, a2), jVar.f, jVar.g, q6x.z(jVar.h, jVar2.h, a2), q6x.z(jVar.i, jVar2.i, a2));
                            }
                            bVar = bVar2;
                            arrayList3.add(bVar);
                            i++;
                            list4 = list;
                        } else {
                            if (!(qq90Var instanceof qq90.i)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            qq90.i iVar = (qq90.i) qq90Var2;
                            qq90.i iVar2 = (qq90.i) qq90Var;
                            bVar = new qq90.i(q6x.z(iVar.c, iVar2.c, a2), q6x.z(iVar.d, iVar2.d, a2));
                        }
                        list = list4;
                        bVar2 = bVar3;
                        bVar = bVar2;
                        arrayList3.add(bVar);
                        i++;
                        list4 = list;
                    } else {
                        if (!(qq90Var instanceof qq90.s)) {
                            throw new IllegalArgumentException("start and stop path nodes have different types");
                        }
                        bVar = new qq90.s(q6x.z(((qq90.s) qq90Var2).c, ((qq90.s) qq90Var).c, a2));
                    }
                    list = list4;
                    arrayList3.add(bVar);
                    i++;
                    list4 = list;
                }
                return arrayList3;
            case 22:
                View view2 = (View) this.c;
                PodcastSliderCellVh podcastSliderCellVh = (PodcastSliderCellVh) this.d;
                Context context2 = view2.getContext();
                Activity h = context2 != null ? e3m.h(context2) : null;
                UIBlockPodcastItem uIBlockPodcastItem = podcastSliderCellVh.g;
                Podcast podcast = uIBlockPodcastItem != null ? uIBlockPodcastItem.y : null;
                if (h != null && podcast != null) {
                    String str4 = podcast.d;
                    String str5 = str4 == null ? "" : str4;
                    List<Thumb> list5 = podcast.f;
                    if (list5 != null) {
                        Iterator it2 = list5.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it2.next();
                        if (it2.hasNext()) {
                            int i6 = ((Thumb) next).c;
                            do {
                                Object next2 = it2.next();
                                int i7 = ((Thumb) next2).c;
                                if (i6 > i7) {
                                    next = next2;
                                    i6 = i7;
                                }
                            } while (it2.hasNext());
                        }
                        thumb = (Thumb) next;
                    } else {
                        thumb = null;
                    }
                    PodcastInfo podcastInfo = new PodcastInfo(str5, null, null, null, null, null, thumb, false, false, false, podcast.l, false, Integer.MIN_VALUE, null);
                    bpn0 bpn0Var = lyd.d;
                    ((fl4) (bpn0Var != null ? bpn0Var : null).getValue()).w().a(h, podcastSliderCellVh.b, podcastInfo, new PodcastSliderCellVh.a(1, podcastSliderCellVh, PodcastSliderCellVh.class, "onActionIdClick", "onActionIdClick(I)V", 0));
                }
                return s3q0.a;
            case 23:
                iai0 iai0Var = (iai0) this.c;
                kei0 kei0Var = ((lei0) this.d).b;
                q530 q530Var = iai0Var.m;
                if (!(BuildInfo.q() ? false : q530Var.b(kei0Var.d, q530Var.a(kei0Var.d)))) {
                    iai0Var.l.a(new bsd0.d(kei0Var.a));
                }
                return s3q0.a;
            case 24:
                return new fot((Context) this.c, new xvk0(((com.vk.clips.sdk.shared.item.static_ads.c) this.d).B), null);
            case 25:
                iuc0.b.F((Context) this.d, (Post) this.c);
                return s3q0.a;
            case 26:
                ((Tooltip) this.c).g((h4p0) this.d);
                return s3q0.a;
            case 27:
                gzs gzsVar = (gzs) this.c;
                hds0 hds0Var = (hds0) this.d;
                try {
                    gzsVar.invoke();
                } catch (Throwable th) {
                    hds0Var.k = new TranscodeException(th);
                }
                return s3q0.a;
            default:
                ((izs) this.c).invoke(new wqs0.k((BlockId.CompositeId) this.d));
                return s3q0.a;
        }
    }

    public /* synthetic */ b(Tooltip tooltip, Tooltip.g gVar, h4p0 h4p0Var) {
        this.b = 26;
        this.c = tooltip;
        this.d = h4p0Var;
    }
}
