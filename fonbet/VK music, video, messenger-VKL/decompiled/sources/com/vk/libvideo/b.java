package com.vk.libvideo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog2.common.dto.api.style.SearchSuggestionCatalogViewStyle;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicFollowOwnerButton;
import com.vk.catalog2.feature.music.holders.MusicFollowOwnerButtonVh;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.knet.core.http.HttpProtocol;
import com.vk.log.L;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.superapp.api.dto.auth.InitPasswordCheckAccessFactor;
import com.vk.superapp.api.dto.auth.InitPasswordCheckResponse;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Parameters;
import com.vk.superapp.common.js.bridge.api.events.ConversionHit$Response;
import com.vkontakte.android.R;
import io.opentelemetry.api.trace.StatusCode;
import io.reactivex.rxjava3.core.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.a1w;
import xsna.a2j;
import xsna.afq;
import xsna.b520;
import xsna.b630;
import xsna.b9a0;
import xsna.bi20;
import xsna.bls0;
import xsna.bn50;
import xsna.bwr0;
import xsna.bzb0;
import xsna.c0c;
import xsna.c5g;
import xsna.c80;
import xsna.c8a0;
import xsna.cbi0;
import xsna.cfz;
import xsna.ckv;
import xsna.cqa0;
import xsna.cqm0;
import xsna.cwb0;
import xsna.d5v;
import xsna.drm0;
import xsna.dw20;
import xsna.e370;
import xsna.ea10;
import xsna.fq1;
import xsna.g47;
import xsna.ge0;
import xsna.ggj;
import xsna.gm50;
import xsna.h4i;
import xsna.hd1;
import xsna.he0;
import xsna.hyg0;
import xsna.i3j;
import xsna.iag;
import xsna.ieo;
import xsna.im90;
import xsna.is8;
import xsna.iu1;
import xsna.iu50;
import xsna.iw4;
import xsna.izs;
import xsna.j5g;
import xsna.j7k0;
import xsna.jai;
import xsna.k82;
import xsna.kcl0;
import xsna.kk7;
import xsna.kq;
import xsna.krv0;
import xsna.kwg0;
import xsna.laa;
import xsna.lgg;
import xsna.lk7;
import xsna.lzk;
import xsna.mcc0;
import xsna.mkv;
import xsna.mnh0;
import xsna.mxo;
import xsna.mxr0;
import xsna.mz80;
import xsna.ngl;
import xsna.nvy;
import xsna.o25;
import xsna.o2j;
import xsna.o3w;
import xsna.ohk0;
import xsna.oio;
import xsna.p16;
import xsna.p230;
import xsna.p4g;
import xsna.par0;
import xsna.pls;
import xsna.pn00;
import xsna.pu;
import xsna.px30;
import xsna.pz80;
import xsna.q1w;
import xsna.q55;
import xsna.qls;
import xsna.qs2;
import xsna.qtd0;
import xsna.rrd0;
import xsna.rsg0;
import xsna.rxo;
import xsna.rz20;
import xsna.s25;
import xsna.s3q0;
import xsna.svz;
import xsna.t1z;
import xsna.tci;
import xsna.tlo0;
import xsna.tq;
import xsna.u0w;
import xsna.u890;
import xsna.uft0;
import xsna.ul1;
import xsna.v1j;
import xsna.vdx0;
import xsna.vh40;
import xsna.vua0;
import xsna.vxk;
import xsna.w060;
import xsna.w7x0;
import xsna.wmj;
import xsna.wow;
import xsna.x0l;
import xsna.x1n0;
import xsna.xeg;
import xsna.xx8;
import xsna.xz20;
import xsna.y89;
import xsna.ya;
import xsna.ycj;
import xsna.yfb;
import xsna.ygg;
import xsna.yjs0;
import xsna.yk8;
import xsna.yks0;
import xsna.yq;
import xsna.z4w;
import xsna.zeq;
import xsna.zjv;
import xsna.zzk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i = 25;
        int i2 = 20;
        int i3 = 8;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        switch (this.b) {
            case 0:
                yks0 yks0Var = (yks0) this.c;
                Context context = (Context) this.d;
                if (((bwr0) obj) instanceof mxr0) {
                    rsg0.y0(yfb.x(new uft0().a(yks0Var.e.o0(), yks0Var.e.I0(), o25.a().c())), null, null, 3).U(new b630(new yjs0(1), 21)).subscribe(new bls0(context, yks0Var));
                }
                return s3q0.a;
            case 1:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) this.c;
                View view = (View) this.d;
                qls.b bVar = (qls.b) obj;
                int i7 = AbsFriendsAndFollowersTabFragment.X;
                pls fo = absFriendsAndFollowersTabFragment.fo();
                fo.a.setVisibility(8);
                fo.e.setVisibility(8);
                fo.b.setVisibility(8);
                fo.c.setVisibility(8);
                fo.d.setVisibility(0);
                ViewGroup viewGroup = fo.f;
                viewGroup.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
                if (dVar != null) {
                    dVar.a = 0;
                }
                viewGroup.setLayoutParams(dVar);
                fo.g.setSeparatorAllowed(true);
                if (view != null) {
                    gm50.a.a(absFriendsAndFollowersTabFragment, bVar.a, new ya(0, absFriendsAndFollowersTabFragment, view));
                }
                return s3q0.a;
            case 2:
                bn50 bn50Var = (bn50) this.c;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bn50Var), ((hd1) this.d).b);
                g47Var.a(tci.k(bn50Var));
                g47Var.d(new hd1.a(bn50Var));
                return s3q0.a;
            case 3:
                ((iw4) this.c).b.g((hyg0) obj, (ArrayList) this.d);
                return s3q0.a;
            case 4:
                p16 p16Var = (p16) this.c;
                View view2 = (View) this.d;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view2.getContext();
                e.b bVar2 = new e.b(view2, null, null, l, 6);
                bVar2.w = R.layout.banner_companion_ad_choice_item;
                he0 he0Var = (he0) p16Var.j.getValue();
                ul1 ul1Var = new ul1(p16Var, i3);
                he0Var.getClass();
                List<b520> list = (List) obj;
                int i8 = 10;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (b520 b520Var : list) {
                    arrayList.add(new VkContextMenu.a(b520Var.a, null, null, false, !b520Var.equals(j5g.a0(r2)), new ge0(0, ul1Var, b520Var), 14));
                }
                bVar2.h(arrayList);
                VkContextMenu a = bVar2.a();
                ((e) a).q = new pu(p16Var, i8);
                a.i(false);
                p16Var.e = a;
                return s3q0.a;
            case 5:
                kk7 kk7Var = (kk7) this.c;
                lk7 lk7Var = (lk7) this.d;
                BonusCatalogFragment bonusCatalogFragment = kk7Var.m;
                StickerStockItemDiscount stickerStockItemDiscount = lk7Var.c;
                bonusCatalogFragment.go();
                return s3q0.a;
            case 6:
                c.a aVar = (c.a) this.c;
                yk8 yk8Var = (yk8) this.d;
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.u1(ggjVar, aVar.a, yk8Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 60);
                return s3q0.a;
            case 7:
                izs izsVar = (izs) this.c;
                ((mcc0) this.d).getClass();
                return (CatalogBlockState) izsVar.invoke((CatalogBlockState) obj);
            case 8:
                boolean z = true;
                laa laaVar = (laa) this.c;
                String str3 = (String) this.d;
                List list2 = (List) obj;
                vua0 vua0Var = laaVar.k;
                String str4 = laaVar.j;
                vua0Var.getClass();
                if (!drm0.N(str4)) {
                    String m = cqm0.m(drm0.p0(str4).toString());
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            String str5 = ((OfflinePodcast) next).b.d;
                            if (drm0.D(str5 != null ? str5 : "", m, z)) {
                                arrayList2.add(next);
                            }
                            z = true;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list3) {
                                String str6 = ((OfflinePodcast) obj2).b.i;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                if (drm0.D(str6, m, true)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            HashSet hashSet = new HashSet();
                            hashSet.addAll(arrayList2);
                            hashSet.addAll(arrayList3);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : list3) {
                                if (hashSet.contains((OfflinePodcast) obj3)) {
                                    arrayList4.add(obj3);
                                }
                            }
                            list2 = arrayList4;
                        }
                    }
                }
                int hashCode = str3.hashCode();
                if (hashCode != -1529764530) {
                    if (hashCode != -185433675) {
                        if (hashCode == 505811102 && str3.equals("offline_music_replacement_default")) {
                            return j5g.y0(list2);
                        }
                    } else if (str3.equals("offline_music_replacement_old_first")) {
                        return list2;
                    }
                } else if (str3.equals("offline_music_replacement_name")) {
                    return j5g.D0(new xx8(i4), list2);
                }
                throw new IllegalArgumentException("Unknown replacement = ".concat(str3));
            case 9:
                xeg xegVar = (xeg) this.c;
                iag iagVar = (iag) this.d;
                if (((Boolean) obj).booleanValue()) {
                    xegVar.m.onNext(new lgg.c(iagVar));
                }
                return s3q0.a;
            case 10:
                CommunityNameHistoryFragment communityNameHistoryFragment = (CommunityNameHistoryFragment) this.c;
                UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) this.d;
                communityNameHistoryFragment.Q.setItems((List) obj);
                usableRecyclerPaginatedView.f0();
                return s3q0.a;
            case 11:
                h4i h4iVar = (h4i) this.c;
                y89 y89Var = (y89) this.d;
                if (((Boolean) obj).booleanValue() && h4iVar.a) {
                    y89Var.invoke(new CommunityProfileAction.e.i.g());
                    y89Var.invoke(CommunityProfileAction.b0.a.b);
                }
                return s3q0.a;
            case 12:
                a2j a2jVar = (a2j) this.c;
                v1j.j jVar = (v1j.j) this.d;
                a2jVar.T(o2j.h.b);
                L.g("Standalone room " + jVar.b + " was failed to create", (Throwable) obj);
                return s3q0.a;
            case 13:
                cbi0 cbi0Var = (cbi0) this.c;
                ggj ggjVar2 = (ggj) obj;
                long j = ((vxk) this.d).v;
                u890 u890Var = x0l.a;
                float f = lzk.a;
                float I0 = ggjVar2.I0(f);
                float I02 = ggjVar2.I0(f);
                float f2 = 2;
                float I03 = (I02 - ggjVar2.I0(zzk.k)) / f2;
                float f3 = 7;
                float a2 = yq.a(f3, I0, Float.intBitsToFloat((int) (ggjVar2.d() >> 32)), f3);
                long j2 = cbi0Var.a;
                int i9 = (int) (j2 >> 32);
                int i10 = (int) (j2 & 4294967295L);
                long j3 = cbi0Var.b;
                int i11 = (int) (j3 >> 32);
                int i12 = (int) (j3 & 4294967295L);
                float f4 = I0 + a2;
                float f5 = i9 * f4;
                boolean z2 = cbi0Var.c;
                float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f7 = a2 / f2;
                float f8 = f5 + (z2 ? I0 / f2 : 0.0f) + f7;
                float f9 = (i10 * I02) + I03;
                float f10 = i11 * f4;
                if (cbi0Var.d) {
                    I0 /= f2;
                }
                float f11 = f10 + I0 + f7;
                float f12 = (i12 * I02) + I03;
                boolean z3 = ggjVar2.getLayoutDirection() == LayoutDirection.Rtl;
                if (z3) {
                    f8 = Float.intBitsToFloat((int) (ggjVar2.d() >> 32)) - f8;
                    f11 = Float.intBitsToFloat((int) (ggjVar2.d() >> 32)) - f11;
                }
                boolean z4 = z3;
                oio.P(ggjVar2, j, (Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (Float.floatToRawIntBits(i10 == i12 ? f11 - f8 : z3 ? -f8 : Float.intBitsToFloat((int) (ggjVar2.d() >> 32)) - f8) << 32) | (Float.floatToRawIntBits(r4) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                if (i10 != i12) {
                    for (int i13 = (i12 - i10) - 1; i13 > 0; i13--) {
                        oio.P(ggjVar2, j, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits((i13 * I02) + f9) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ggjVar2.d() >> 32))) << 32) | (Float.floatToRawIntBits(r4) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                    }
                    if (ggjVar2.getLayoutDirection() != LayoutDirection.Ltr) {
                        f6 = Float.intBitsToFloat((int) (ggjVar2.d() >> 32));
                    }
                    long floatToRawIntBits = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                    if (z4) {
                        f11 -= Float.intBitsToFloat((int) (ggjVar2.d() >> 32));
                    }
                    oio.P(ggjVar2, j, floatToRawIntBits, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(r4) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                }
                ggjVar2.s1();
                return s3q0.a;
            case 14:
                mxo mxoVar = (mxo) this.c;
                UserId userId = (UserId) this.d;
                Throwable th = (Throwable) obj;
                if ((th instanceof AuthException.BannedUserException) || (th instanceof AuthException.DeactivatedUserException)) {
                    return s3q0.a;
                }
                mxoVar.o.b(new rxo.b(mxoVar.n));
                mxoVar.U();
                mxoVar.g.a(userId);
                return s3q0.a;
            case 15:
                zeq zeqVar = (zeq) this.c;
                zeqVar.l.a(zeqVar.itemView.getContext(), afq.a(((FeedItem.e.a) this.d).b));
                return s3q0.a;
            case 16:
                ImDialogsSelectionFragment imDialogsSelectionFragment = (ImDialogsSelectionFragment) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                bzb0 bzb0Var = imDialogsSelectionFragment.m0;
                (bzb0Var != null ? bzb0Var : null).c(cwb0.b.e, new u0w(ref$ObjectRef, i5));
                return s3q0.a;
            case 17:
                z4w z4wVar = (z4w) this.c;
                String str7 = (String) this.d;
                qtd0 qtd0Var = (qtd0) obj;
                if (qtd0Var.v5() != null) {
                    return x.k(qtd0Var);
                }
                a1w a1wVar = q1w.a;
                return (a1wVar != null ? a1wVar : null).C(z4wVar, new ycj(str7, Source.CACHE, false, true, true, null, null, 100)).l(new fq1(new ieo(str7, i6), i2));
            case 18:
                t1z t1zVar = (t1z) this.c;
                ((kcl0) t1zVar.k.b).V0((StickerStockItem) this.d, true, new c80(i5));
                is8 is8Var = t1zVar.i;
                if (is8Var != null) {
                    is8Var.c();
                }
                return s3q0.a;
            case 19:
                p230 p230Var = (p230) this.c;
                izs izsVar2 = (izs) this.d;
                nvy nvyVar = (nvy) obj;
                ArrayList arrayList5 = p230Var.b;
                wow wowVar = new wow(arrayList5);
                nvyVar.e(arrayList5.size(), null, new ea10(wowVar, 1), new jai(2039820996, new xz20(wowVar, izsVar2), true));
                if (p230Var.c) {
                    nvy.g(nvyVar, null, null, new jai(-328242339, new i3j(izsVar2, i6), true), 3);
                }
                if (p230Var.d.c) {
                    nvy.g(nvyVar, null, null, new jai(681448774, new rz20(i5, p230Var, izsVar2), true), 3);
                }
                return s3q0.a;
            case 20:
                return ((vh40) this.d).d.V(o25.a().c(), Playlist.zb((Playlist) this.c, null, null, (List) obj, null, -8388609, 255));
            case 21:
                MusicFollowOwnerButtonVh musicFollowOwnerButtonVh = (MusicFollowOwnerButtonVh) this.c;
                UIBlockMusicFollowOwnerButton uIBlockMusicFollowOwnerButton = (UIBlockMusicFollowOwnerButton) this.d;
                musicFollowOwnerButtonVh.f = musicFollowOwnerButtonVh.d.e(uIBlockMusicFollowOwnerButton.z).subscribe(new iu1(new k82(16, musicFollowOwnerButtonVh, uIBlockMusicFollowOwnerButton), i), new qs2(new px30(musicFollowOwnerButtonVh, i4), 26));
                dw20 dw20Var = musicFollowOwnerButtonVh.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                musicFollowOwnerButtonVh.g = null;
                return s3q0.a;
            case 22:
                ((iu50) this.c).b.a(new Pair<>((UserId) this.d, new d5v.b((Narrative) obj)));
                return s3q0.a;
            case 23:
                w060 w060Var = (w060) this.c;
                bi20 bi20Var = (bi20) this.d;
                SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
                w060Var.getClass();
                return new UIBlockSearchSuggestion(bi20Var.a, bi20Var.d, bi20Var.c, new SearchSuggestionCatalogViewStyle(searchSuggestion.g), bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, searchSuggestion);
            case 24:
                ckv ckvVar = (ckv) this.c;
                zjv.a aVar2 = (zjv.a) this.d;
                ohk0 ohk0Var = (ohk0) obj;
                if (ohk0Var == null) {
                    return aVar2.c(aVar2.b);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                w7x0 w7x0Var = w7x0.f;
                wmj current = wmj.current();
                kq kqVar = pz80.b;
                w7x0Var.getClass();
                w7x0.a(current, linkedHashMap, kqVar);
                mkv c = aVar2.c(ckv.a(ckvVar, null, pn00.n(ckvVar.c, linkedHashMap), null, null, 27));
                ohk0Var.m(c.d, "http.response.status_code");
                HttpProtocol httpProtocol = c.b;
                int[] iArr = pz80.a.$EnumSwitchMapping$0;
                int i14 = iArr[httpProtocol.ordinal()];
                if (i14 == 1 || i14 == 2 || i14 == 3) {
                    str = "http";
                } else if (i14 == 4) {
                    str = "quic";
                } else {
                    if (i14 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "spdy";
                }
                ohk0Var.setAttribute("network.protocol.name", str);
                int i15 = iArr[httpProtocol.ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            str2 = "2";
                        } else if (i15 == 4) {
                            str2 = "3";
                        } else if (i15 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    str2 = "1.1";
                } else {
                    str2 = "1.0";
                }
                ohk0Var.setAttribute("network.protocol.version", str2);
                int i16 = c.d;
                if (200 <= i16 && i16 < 300) {
                    return c;
                }
                ohk0Var.l(StatusCode.ERROR);
                return c;
            case 25:
                im90 im90Var = (im90) this.c;
                PasswordCheckInitStructure passwordCheckInitStructure = (PasswordCheckInitStructure) this.d;
                c0c c0cVar = (c0c) obj;
                InitPasswordCheckResponse initPasswordCheckResponse = im90Var.f;
                if ((initPasswordCheckResponse != null ? initPasswordCheckResponse.b : null) == InitPasswordCheckResponse.AccessFactor2.SMS_CODE) {
                    im90Var.e = passwordCheckInitStructure.e;
                    vdx0 vdx0Var = e370.e;
                    im90Var.d.b(mnh0.C((vdx0Var != null ? vdx0Var : null).a().a(im90Var.e, InitPasswordCheckAccessFactor.SMS_CODE), (ygg) im90Var.h.getValue(), new mz80(i4, im90Var, passwordCheckInitStructure), new o3w(im90Var, i), new ngl(null, null, null, null, null, null, new cfz(im90Var, i3), null, null, null, 959)));
                } else {
                    im90Var.b.Jd();
                    q55 q55Var = q55.a;
                    List y0 = j5g.y0(q55.b);
                    q55.b bVar3 = new q55.b(par0.a);
                    p4g.a aVar3 = p4g.a;
                    Iterator it2 = y0.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((s25) it2.next()).b(c0cVar.a);
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable th2) {
                            bVar3.invoke(th2);
                        }
                    }
                }
                return s3q0.a;
            case 26:
                com.vk.photos.root.photoflow.presentation.b bVar4 = (com.vk.photos.root.photoflow.presentation.b) this.c;
                bVar4.h.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_delete_photo_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new com.vk.newsfeed.common.recycler.holders.attachments.a(23, bVar4, (Photo) this.d), null, 32)));
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 27:
                ((c8a0) this.c).g.invoke(new b9a0.c.a((Photo) this.d, ((PhotoAlbum) obj).g));
                return s3q0.a;
            case 28:
                cqa0 cqa0Var = (cqa0) this.c;
                ConversionHit$Parameters conversionHit$Parameters = (ConversionHit$Parameters) this.d;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    x1n0 x1n0Var = cqa0Var.b;
                    boolean booleanValue = bool.booleanValue();
                    String f13 = conversionHit$Parameters.f();
                    com.vk.superapp.base.js.bridge.b.p(x1n0Var.a, new JsMethod("VKWebAppConversionHit"), new ConversionHit$Response(null, new ConversionHit$Response.Data(booleanValue, f13), f13, 1, null), null, null, false, null, 60);
                } else {
                    cqa0Var.c.d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), conversionHit$Parameters.f(), 1, null));
                }
                return s3q0.a;
            default:
                rrd0.f fVar = (rrd0.f) this.c;
                izs izsVar3 = (izs) this.d;
                ArrayList arrayList6 = fVar.b;
                wow wowVar2 = new wow(arrayList6);
                ((nvy) obj).e(arrayList6.size(), new rrd0.c(new svz(i2), wowVar2), new rrd0.d(wowVar2), new jai(802480018, new rrd0.e(wowVar2, izsVar3), true));
                return s3q0.a;
        }
    }

    public /* synthetic */ b(ckv ckvVar, zjv.a aVar, pz80 pz80Var) {
        this.b = 24;
        this.c = ckvVar;
        this.d = aVar;
    }
}
