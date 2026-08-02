package com.vk.stickers.bridge;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.appredirects.activity.BaseLinkRedirectActivity;
import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.catalog2.common.ui.mvp.sticker.StickersCatalogFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.gift.GiftAnimation;
import com.vk.dto.common.gift.GiftBackground;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.dto.user.UserProfile;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stickers.bottomsheets.StickersBottomSheetDialog;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.gifts.GiftModalButtonType;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.stickers.settings.StickerSettingsFragment;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.g1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.a470;
import xsna.a5l0;
import xsna.a60;
import xsna.abg0;
import xsna.ahn;
import xsna.av1;
import xsna.b6m;
import xsna.ba7;
import xsna.bbl0;
import xsna.bl;
import xsna.bpn0;
import xsna.c5g;
import xsna.c5l0;
import xsna.ci3;
import xsna.cw;
import xsna.d3m;
import xsna.da7;
import xsna.dav0;
import xsna.ddl0;
import xsna.dhr0;
import xsna.dsc;
import xsna.dw20;
import xsna.e3m;
import xsna.e43;
import xsna.e7l0;
import xsna.el3;
import xsna.el6;
import xsna.enj;
import xsna.eos;
import xsna.ey50;
import xsna.f50;
import xsna.f7l0;
import xsna.f870;
import xsna.ff3;
import xsna.fkq0;
import xsna.g1j;
import xsna.g5g;
import xsna.g86;
import xsna.gzs;
import xsna.h7l0;
import xsna.ha7;
import xsna.hg1;
import xsna.hx3;
import xsna.izs;
import xsna.j5g;
import xsna.ji3;
import xsna.jzt;
import xsna.k7x0;
import xsna.kcl0;
import xsna.kil0;
import xsna.kt8;
import xsna.l7;
import xsna.l7l0;
import xsna.lal0;
import xsna.lil0;
import xsna.m40;
import xsna.m7l0;
import xsna.m7z;
import xsna.maz;
import xsna.mf1;
import xsna.n1l0;
import xsna.n7;
import xsna.n7l0;
import xsna.n7z;
import xsna.nf1;
import xsna.nk0;
import xsna.nzt;
import xsna.o25;
import xsna.o40;
import xsna.o7l0;
import xsna.om1;
import xsna.op0;
import xsna.oz50;
import xsna.p7;
import xsna.pe1;
import xsna.q3l0;
import xsna.q40;
import xsna.qa;
import xsna.qm0;
import xsna.qr;
import xsna.qt;
import xsna.r1r0;
import xsna.rm9;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s820;
import xsna.scl0;
import xsna.sh6;
import xsna.t6g0;
import xsna.tmg;
import xsna.tp0;
import xsna.tt0;
import xsna.tzp0;
import xsna.u390;
import xsna.u6;
import xsna.ucl0;
import xsna.umg;
import xsna.vay0;
import xsna.ver0;
import xsna.vmg;
import xsna.w7;
import xsna.wf1;
import xsna.wh6;
import xsna.wmg;
import xsna.wqe;
import xsna.wr0;
import xsna.x62;
import xsna.xwk;
import xsna.y6l0;
import xsna.y90;
import xsna.yfb;
import xsna.yl0;
import xsna.ymg;
import xsna.yzt;
import xsna.z9g;
import xsna.zal0;
import xsna.zmg;
import xsna.zq70;
import xsna.zx0;

/* compiled from: CommonStickersNavigation.kt */
/* loaded from: classes5.dex */
public final class b implements zal0 {
    public static final b a = new b();

    /* compiled from: CommonStickersNavigation.kt */
    public static final class a {
        public final StickerStockItem a;
        public final GiftData b;

        public a(StickerStockItem stickerStockItem, GiftData giftData) {
            this.a = stickerStockItem;
            this.b = giftData;
        }
    }

    public static GiftData I(int i, UserId userId, Collection collection) {
        return collection.contains(Integer.valueOf(i)) ? new GiftData(Collections.singleton(userId), false) : new GiftData(Collections.EMPTY_LIST, false);
    }

    public static void J(int i) {
        rsg0.y0(yfb.x(new zq70().K(Integer.valueOf(i))), null, null, 3).subscribe(new el6(new umg(i, 0), 12), new f50(new y90(16), 18));
    }

    public static void K(b bVar, Context context, StickerStockItem stickerStockItem, GiftData giftData, ContextUser contextUser, boolean z, boolean z2, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, int i) {
        if ((i & 8) != 0) {
            contextUser = null;
        }
        boolean z3 = (i & 16) != 0;
        if ((i & 64) != 0) {
            z2 = false;
        }
        if ((i & 128) != 0) {
            str = null;
        }
        if ((i & 256) != 0) {
            searchStatsLoggingInfo = null;
        }
        String str2 = stickerStockItem.O;
        if (str2 == null) {
            str2 = str;
        }
        if (stickerStockItem.g.isEmpty() && z3) {
            L(bVar, context, stickerStockItem.b, giftData, contextUser, str2, z, z2, null, 128);
            return;
        }
        boolean z4 = z2;
        String str3 = str2;
        if (giftData.c) {
            M(context, q.T(stickerStockItem), giftData, contextUser, str3, z, z4, null);
            return;
        }
        if (e3m.h(context) instanceof BaseLinkRedirectActivity) {
            bVar.B(context, EmptyList.b, stickerStockItem, str3);
            return;
        }
        if (z4 && !stickerStockItem.Ib() && stickerStockItem.h) {
            zal0.z(bVar, context, stickerStockItem, giftData, contextUser, str, searchStatsLoggingInfo, null, 64);
            return;
        }
        StickersBottomSheetDialog.a aVar = new StickersBottomSheetDialog.a(StickersBottomSheetDialog.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("key_pack", stickerStockItem);
        bundle.putBoolean("key_show_catalog_button", z);
        bundle.putParcelable("key_context_user", contextUser);
        bundle.putParcelable("key_current_user", o25.a().c());
        bundle.putParcelable("key_gift_data", giftData);
        bundle.putString("key_ref", str);
        if (searchStatsLoggingInfo != null) {
            bundle.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
        }
        Activity h = e3m.h(context);
        FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
        if (fragmentActivity != null) {
            FragmentImpl f = aVar.f();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            int i2 = StickersBottomSheetDialog.a0;
            f.Td(supportFragmentManager, "com.vk.stickers.bottomsheets.StickersBottomSheetDialog");
        }
    }

    public static void L(b bVar, Context context, int i, GiftData giftData, ContextUser contextUser, String str, boolean z, boolean z2, SearchStatsLoggingInfo searchStatsLoggingInfo, int i2) {
        if ((i2 & 32) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = false;
        }
        M(context, rsg0.y0(new kil0(i, contextUser != null ? contextUser.f : null), null, null, 3), giftData, contextUser, str, z3, z2, (i2 & 128) != 0 ? null : searchStatsLoggingInfo);
    }

    @SuppressLint({"CheckResult"})
    public static void M(Context context, q qVar, GiftData giftData, ContextUser contextUser, String str, boolean z, boolean z2, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        q U;
        if (str != null) {
            sh6 sh6Var = new sh6(new tmg(str, 0), 15);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            qVar = qVar.E(sh6Var, lVar, kVar, kVar);
        }
        Collection<UserId> collection = giftData.b;
        if (collection != null && collection.size() == 1 && giftData.c) {
            UserId next = giftData.b.iterator().next();
            U = qr.f(next) ? qVar.U(new bl(new a60(17), 15)) : q.I0(qVar, rsg0.y0(new eos(next, 3), null, null, 3), new op0(next, 10));
        } else {
            U = qVar.U(new w7(new dsc(giftData, 10), 13));
        }
        hg1.m(U, context, 0L, false, 62).subscribe(new wf1(new zmg(context, contextUser, z, z2, searchStatsLoggingInfo), 15), new ff3(new qt(15), 10));
    }

    @Override // xsna.zal0
    public final void A(Context context, ArrayList arrayList, List list, da7 da7Var, String str) {
        t T;
        q I0;
        if (arrayList.size() == 1) {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UserProfile) it.next()).c);
            }
            zal0.e(a, context, arrayList2, str, 20);
            return;
        }
        if (da7Var != null) {
            ArrayList arrayList3 = da7Var.c;
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                g5g.y(((ha7) it2.next()).b, arrayList4);
            }
            List R = j5g.R(arrayList4);
            List singletonList = Collections.singletonList(UsersFieldsDto.PHOTO_BASE);
            if ((1 & 58) != 0) {
                R = null;
            }
            if ((58 & 4) != 0) {
                singletonList = null;
            }
            I0 = hg1.m(rsg0.y0(yfb.x(r1r0.a.a(R, null, singletonList, null, null)), null, null, 3), context, 0L, false, 62).U(new m40(new wr0(19), 17)).U(new o40(new g1j(da7Var, 12), 22));
        } else {
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                UserProfile userProfile = (UserProfile) it3.next();
                arrayList5.add(new ba7(userProfile.c, userProfile.g, userProfile.d + ' ' + userProfile.f));
            }
            g1 T2 = q.T(arrayList5);
            if (list.isEmpty()) {
                T = q.T(EmptyList.b);
            } else {
                List H0 = j5g.H0(list, 50);
                List singletonList2 = Collections.singletonList(UsersFieldsDto.PHOTO_BASE);
                if ((1 & 58) != 0) {
                    H0 = null;
                }
                if ((58 & 4) != 0) {
                    singletonList2 = null;
                }
                T = hg1.m(rsg0.y0(yfb.x(r1r0.a.a(H0, null, singletonList2, null, null)), null, null, 3), context, 0L, false, 62).U(new q40(new pe1(27), 18));
            }
            I0 = q.I0(T2, T, new yzt(new z9g(5), 0));
        }
        ver0.c(context, I0.subscribe(new cw(new nk0(15, context, str), 23), new om1(new hx3(com.vk.metrics.eventtracking.b.a, 1), 22)));
    }

    @Override // xsna.zal0
    public final void B(Context context, List list, StickerStockItem stickerStockItem, String str) {
        Activity h = e3m.h(context);
        if (h != null) {
            context = h;
        }
        StickersCatalogFragment.a aVar = new StickersCatalogFragment.a();
        long[] P0 = j5g.P0(list);
        Bundle bundle = aVar.j;
        bundle.putLongArray("gift_users", P0);
        if (str == null) {
            str = X3.i.U;
        }
        bundle.putString("ref", str);
        bundle.putParcelable("sticker_item", stickerStockItem);
        aVar.s(false);
        aVar.k(context);
    }

    @Override // xsna.zal0
    public final void C(Context context) {
        lal0.a.a(context, R.string.stickers_other_chat_ugc_title, R.string.stickers_other_chat_ugc_subtitle, R.drawable.vk_icon_ugc_chat_sticker_outline_56);
    }

    @Override // xsna.zal0
    @SuppressLint({"CheckResult"})
    public final void E(Context context, StickerStockItem stickerStockItem, Collection<UserId> collection, ContextUser contextUser, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, izs<? super Collection<Integer>, s3q0> izsVar) {
        c(context, stickerStockItem.b, collection, contextUser, z, stickerStockItem.O, searchStatsLoggingInfo, izsVar);
    }

    @Override // xsna.zal0
    public final void F(Context context, String str) {
        maz e = xwk.d().e();
        StringBuilder sb = new StringBuilder();
        sb.append(f870.v(InternalVkMiniApps.VK_UGC_PROD.h()));
        if (str == null) {
            str = "";
        }
        sb.append(str);
        maz.c(e, context, sb.toString(), LaunchContext.A, null, null, 24);
    }

    @Override // xsna.zal0
    public final void G(Context context, String str, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        int i = StickersRouletteFragment.o0;
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("referrer", str);
        }
        if (searchStatsLoggingInfo != null) {
            bundle.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
        }
        Activity h = e3m.h(context);
        if (h != null) {
            StickersRouletteFragment.a.a(h);
        }
        oz50 oz50Var = new oz50(StickersRouletteFragment.class, null, bundle);
        oz50Var.s(true);
        oz50Var.k(context);
    }

    @Override // xsna.zal0
    @SuppressLint({"CheckResult"})
    public final void a(final Context context, int i, final izs izsVar, final String str) {
        hg1.m(rsg0.y0(new lil0(i), null, null, 3), context, 0L, false, 62).subscribe(new f() { // from class: xsna.xmg
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                if (!stickerStockItem.h || !stickerStockItem.k) {
                    com.vk.stickers.bridge.b.K(com.vk.stickers.bridge.b.a, context, stickerStockItem, GiftData.d, null, true, false, str, null, 328);
                } else {
                    t6g0 t6g0Var = t6g0.b;
                    t6g0.d().h();
                    izsVar.invoke(stickerStockItem);
                }
            }
        }, new ymg(0));
    }

    @Override // xsna.zal0
    public final void b(Context context, GiftData giftData, ContextUser contextUser) {
        BonusCatalogFragment.a aVar = new BonusCatalogFragment.a();
        Bundle bundle = aVar.j;
        bundle.putParcelable("arg_gift_data", giftData);
        bundle.putParcelable("arg_context_user", contextUser);
        aVar.k(context);
    }

    @Override // xsna.zal0
    public final void c(Context context, int i, Collection<UserId> collection, ContextUser contextUser, boolean z, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, izs<? super Collection<Integer>, s3q0> izsVar) {
        q U;
        if (i == 10101) {
            G(context, str, searchStatsLoggingInfo);
            return;
        }
        m1 y0 = rsg0.y0(new kil0(i, contextUser != null ? contextUser.f : null), null, null, 3);
        Collection<Integer> collection2 = contextUser != null ? contextUser.e : null;
        yl0 yl0Var = new yl0(5, contextUser, izsVar);
        ji3 ji3Var = new ji3(new wqe(str, 1), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        b0 E = y0.E(ji3Var, lVar, kVar, kVar);
        if (collection.isEmpty()) {
            U = E.U(new l7(new wh6(14), 13));
        } else if (collection.size() > 1) {
            U = E.U(new n7(new x62(1, collection), 17));
        } else {
            UserId next = collection.iterator().next();
            U = qr.f(next) ? E.U(new p7(new qm0(15), 20)) : collection2 != null ? E.U(new tt0(new g86(6, next, collection2), 13)) : q.I0(rsg0.y0(new eos(next, 3), null, null, 3).E(new tp0(new zx0(yl0Var, 25), 15), lVar, kVar, kVar), E, new qa(new wmg(next, 0), 14));
        }
        ver0.c(context, hg1.m(U, context, 0L, false, 62).subscribe(new mf1(new vmg(context, contextUser, z, searchStatsLoggingInfo), 14), new nf1(new ci3(15), 20)));
    }

    @Override // xsna.zal0
    public final void d(Context context, List<UserId> list, boolean z, String str, String str2) {
        int i = GiftsCatalogFragment.c0;
        GiftsCatalogFragment.b.a(context, nzt.a.a(new nzt.a.C3428a(ahn.s()), list, str, str2, EmptyList.b, false), z);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.zal0
    public final void f(Context context, UserProfile userProfile, String str) {
        ProfileGiftsFragment.a aVar = new ProfileGiftsFragment.a(ProfileGiftsFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("user", userProfile);
        Context context2 = e43.a;
        bundle.putCharSequence("title", (context2 != null ? context2 : null).getResources().getString(R.string.gifts_of_placeholder, str));
        aVar.k(context);
    }

    @Override // xsna.zal0
    public final void g(Context context, Collection collection, CatalogedGift catalogedGift, String str) {
        List list;
        int i = GiftsCatalogFragment.c0;
        List singletonList = Collections.singletonList(Integer.valueOf(catalogedGift.b.c));
        if (collection == null || (list = j5g.O0(collection)) == null) {
            list = EmptyList.b;
        }
        GiftsCatalogFragment.b.b(context, singletonList, list, null, str, 40);
    }

    @Override // xsna.zal0
    public final void h(Context context) {
        List<k7x0.a> list = k7x0.a;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.votes_services_icon_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.votes_services_item_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.votes_services_text_top_margin);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.votes_services_item_margin);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.votes_services_title_top_margin);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.votes_services_description_top_margin);
        int dimensionPixelSize7 = resources.getDimensionPixelSize(R.dimen.votes_services_horizontal_padding);
        int dimensionPixelSize8 = resources.getDimensionPixelSize(R.dimen.votes_services_icons_top_margin);
        int dimensionPixelSize9 = resources.getDimensionPixelSize(R.dimen.votes_services_icons_bottom_margin);
        LinearLayout a2 = q1.a(1, context);
        a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dimensionPixelSize5;
        layoutParams.setMarginStart(dimensionPixelSize7);
        layoutParams.setMarginEnd(dimensionPixelSize7);
        textView.setLayoutParams(layoutParams);
        textView.setText(context.getString(R.string.votes_services_modal_title));
        abg0 abg0Var = dhr0.t;
        textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        textView.setGravity(17);
        textView.setTextAppearance(R.style.VkUiTypography_DisplayTitle2SemiBold);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dimensionPixelSize6;
        layoutParams2.setMarginStart(dimensionPixelSize7);
        layoutParams2.setMarginEnd(dimensionPixelSize7);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(R.string.votes_services_modal_description));
        textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        textView2.setGravity(17);
        textView2.setTextAppearance(R.style.VkUiTypography_Paragraph);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, dimensionPixelSize8, 0, dimensionPixelSize9);
        a2.addView(textView);
        a2.addView(textView2);
        a2.addView(linearLayout);
        VkModal vkModal = new VkModal(VkModal.Mode.Card, new b.a.C0789a(a2, true), null, false, 28);
        for (k7x0.a aVar : k7x0.a) {
            LinearLayout a3 = q1.a(1, context);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dimensionPixelSize2, -2);
            layoutParams3.setMarginStart(dimensionPixelSize4);
            layoutParams3.setMarginEnd(dimensionPixelSize4);
            a3.setLayoutParams(layoutParams3);
            a3.setGravity(1);
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            imageView.setImageResource(aVar.a);
            imageView.setOnClickListener(new dav0(aVar, vkModal, context, 1));
            a3.addView(imageView);
            TextView textView3 = new TextView(context);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = dimensionPixelSize3;
            textView3.setLayoutParams(layoutParams4);
            textView3.setText(context.getString(aVar.b));
            textView3.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
            textView3.setGravity(17);
            textView3.setTextAppearance(R.style.VkUiTypography_Caption1Normal);
            a3.addView(textView3);
            linearLayout.addView(a3);
        }
        vkModal.b(context, "votes_services_modal");
    }

    @Override // xsna.zal0
    public final void j(Context context, int i, GiftData giftData, ContextUser contextUser, String str) {
        L(this, context, i, giftData, contextUser, str, false, true, null, 160);
        J(i);
    }

    @Override // xsna.zal0
    public final void k(Context context, int i, Collection collection, String str, String str2) {
        List list;
        int i2 = GiftsCatalogFragment.c0;
        List singletonList = Collections.singletonList(Integer.valueOf(i));
        if (collection == null || (list = j5g.O0(collection)) == null) {
            list = EmptyList.b;
        }
        GiftsCatalogFragment.b.b(context, singletonList, list, str, str2, 32);
    }

    @Override // xsna.zal0
    @SuppressLint({"CheckResult"})
    public final void l(Context context, int i, GiftData giftData, ContextUser contextUser, String str, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        L(this, context, i, giftData, contextUser, str, z, false, searchStatsLoggingInfo, 64);
        J(i);
    }

    @Override // xsna.zal0
    public final void n(Context context, String str, Map<String, String> map) {
        int i = GiftsCatalogFragment.c0;
        new rm9(context, str, map, 2).invoke(new nzt.a.C3428a(ahn.s()));
    }

    @Override // xsna.zal0
    public final void o(final Context context, Attach attach, Boolean bool, final long j) {
        GiftRarity giftRarity;
        AttachGift attachGift = attach instanceof AttachGift ? (AttachGift) attach : null;
        if (attachGift == null || (giftRarity = attachGift.g) == null) {
            return;
        }
        GiftModalButtonType giftModalButtonType = bool == null ? GiftModalButtonType.SEND : bool.booleanValue() ? GiftModalButtonType.SEND_MORE : GiftModalButtonType.SEND_IN_RETURN;
        boolean M = dhr0.M();
        int i = m7z.c;
        String str = giftRarity.b;
        GiftRarity.Type type = giftRarity.c;
        Integer num = giftRarity.d;
        Integer num2 = giftRarity.e;
        Integer num3 = giftRarity.f;
        Integer num4 = giftRarity.g;
        String Hb = attachGift.f.Hb(m7z.d);
        GiftAnimation giftAnimation = attachGift.j;
        GiftBackground a2 = giftRarity.a(M);
        m7z.a.b(context, new n7z(str, type, num, num2, num3, num4, Hb, giftAnimation, a2 != null ? a2.c : null), new jzt(giftModalButtonType, j, (int) ((AttachGift) attach).b, null, new gzs() { // from class: xsna.wzt
            @Override // xsna.gzs
            public final Object invoke() {
                UserId userId = new UserId(j);
                int i2 = GiftsCatalogFragment.c0;
                GiftsCatalogFragment.b.a(context, nzt.a.a(new nzt.a.C3428a(ahn.s()), Collections.singletonList(userId), "limited_modal", null, EmptyList.b, false), false);
                s3q0 s3q0Var = s3q0.a;
                return s3q0.a;
            }
        }));
    }

    @Override // xsna.zal0
    public final void p(Context context, boolean z) {
        Activity h = e3m.h(context);
        if (h != null) {
            context = h;
        }
        StickerSettingsFragment.a aVar = new StickerSettingsFragment.a();
        aVar.s(z);
        if (z) {
            context.startActivity(aVar.n(context));
        } else {
            aVar.k(context);
        }
    }

    @Override // xsna.zal0
    @SuppressLint({"CheckResult"})
    public final void q(Context context, StickerStockItem stickerStockItem, GiftData giftData, ContextUser contextUser, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        if (stickerStockItem.b == 10101) {
            G(context, stickerStockItem.O, searchStatsLoggingInfo);
            return;
        }
        Activity h = e3m.h(context);
        AppCompatActivity appCompatActivity = h instanceof AppCompatActivity ? (AppCompatActivity) h : null;
        if (appCompatActivity != null) {
            K(this, appCompatActivity, stickerStockItem, giftData, contextUser, z, false, stickerStockItem.O, searchStatsLoggingInfo, 80);
        } else {
            B(context, EmptyList.b, stickerStockItem, stickerStockItem.O);
        }
        J(stickerStockItem.b);
    }

    @Override // xsna.zal0
    public final void r(Context context, UserId userId, String str) {
        int i = GiftsCatalogFragment.c0;
        GiftsCatalogFragment.b.a(context, nzt.a.a(new nzt.a.C3428a(ahn.s()), Collections.singletonList(userId), str, null, EmptyList.b, false), false);
        s3q0 s3q0Var = s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zal0
    public final void s(final Context context, StickerStockItem stickerStockItem, GiftData giftData, ContextUser contextUser, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, gzs<s3q0> gzsVar) {
        UserId c = o25.a().c();
        final ddl0 ddl0Var = new ddl0(stickerStockItem, giftData, contextUser, str, gzsVar, c, searchStatsLoggingInfo);
        View inflate = e3m.b(context).inflate(R.layout.sticker_details_bottom_container, (ViewGroup) null);
        bpn0 bpn0Var = enj.a;
        kt8 kt8Var = new kt8(e3m.h(context), inflate, giftData, contextUser, str, c);
        ddl0Var.g = kt8Var;
        ucl0 ucl0Var = ddl0Var.h;
        kt8Var.m = ucl0Var;
        stickerStockItem.O = str;
        o7l0 o7l0Var = new o7l0(context, null, 0);
        n7l0 n7l0Var = new n7l0(o7l0Var);
        kcl0 d = t6g0.d();
        o7l0Var.setPresenter((f7l0) new l7l0(o7l0Var, new h7l0(d)));
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.sticker_details_view, o7l0Var);
        o7l0Var.setOrientation(1);
        o7l0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        e7l0 e7l0Var = new e7l0(n7l0Var, d);
        o7l0Var.d = e7l0Var;
        LongtapRecyclerView longtapRecyclerView = (LongtapRecyclerView) inflate2.findViewById(R.id.longtap_recycler);
        o7l0Var.c = longtapRecyclerView;
        longtapRecyclerView.setAdapter(e7l0Var);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4, 1);
        gridLayoutManager.x = new m7l0(o7l0Var, gridLayoutManager);
        longtapRecyclerView.setLayoutManager(gridLayoutManager);
        longtapRecyclerView.setLongtapListener(new a5l0(e7l0Var, o7l0Var.getPresenter(), new y6l0(context, false)));
        o7l0Var.h = inflate2.findViewById(R.id.stickerpack_load_progress);
        o7l0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        kt8 kt8Var2 = ddl0Var.g;
        if (kt8Var2 != null) {
            o7l0Var.setStickerDetailsStateListener(kt8Var2);
        }
        o7l0Var.setPackSearchClickTracker(ucl0Var);
        o7l0Var.f = (ViewGroup) inflate;
        o7l0Var.g = 0;
        f7l0 presenter = o7l0Var.getPresenter();
        if (presenter != null) {
            presenter.U4(stickerStockItem);
        }
        dw20.b Z = new dw20.b(context, tzp0.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, Long.valueOf(stickerStockItem.b), null, null, null, null, 60, null), 2)).w0(context.getString(R.string.stickers_selector_title)).D0(o7l0Var, false).z(inflate).c(new a470()).Z(new DialogInterface.OnDismissListener() { // from class: xsna.cdl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ddl0 ddl0Var2 = ddl0.this;
                gzs<s3q0> gzsVar2 = ddl0Var2.e;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                Object obj = context;
                if (obj instanceof ey50) {
                    ((ey50) obj).Y().H(ddl0Var2);
                }
            }
        });
        if (dhr0.a.c(context)) {
            Z.u0(dhr0.u().c);
        }
        ((dw20.b) Z.F(dhr0.t.b(R.drawable.vk_icon_storefront_outline_28, R.attr.vk_ui_icon_accent_themed), null)).b0(new u6(29, ddl0Var, context));
        if (context instanceof ey50) {
            ((ey50) context).Y().S(ddl0Var);
        }
        ddl0Var.f = Z.I0("stickers_style_selector");
        kt8 kt8Var3 = ddl0Var.g;
        if (kt8Var3 != null) {
            kt8Var3.i = new vay0(ddl0Var);
        }
    }

    @Override // xsna.zal0
    public final void t(Context context, int i, UserId userId, String str, String str2) {
        if (fkq0.d(userId)) {
            b6m.e().f(userId.b, context, Integer.valueOf(i), str);
        } else {
            j(context, i, GiftData.d, null, str2);
        }
    }

    @Override // xsna.zal0
    public final void u(Context context, boolean z, List<Long> list, ContextUser contextUser, String str) {
        Activity h = e3m.h(context);
        if (h != null) {
            context = h;
        }
        StickersCatalogFragment.a aVar = new StickersCatalogFragment.a();
        long[] P0 = j5g.P0(list);
        Bundle bundle = aVar.j;
        bundle.putLongArray("gift_users", P0);
        bundle.putParcelable("context_user", contextUser);
        if (str == null) {
            str = X3.i.U;
        }
        bundle.putString("ref", str);
        aVar.s(z);
        if (z) {
            context.startActivity(aVar.n(context));
        } else {
            aVar.k(context);
        }
    }

    @Override // xsna.zal0
    public final void v(Context context, String str, String str2, List list) {
        Activity h = e3m.h(context);
        if (h != null) {
            context = h;
        }
        StickersCatalogFragment.a aVar = new StickersCatalogFragment.a();
        long[] P0 = j5g.P0(list);
        Bundle bundle = aVar.j;
        bundle.putLongArray("gift_users", P0);
        bundle.putString("ref", str2);
        if (str == null) {
            str = "";
        }
        bundle.putString("key_url", str);
        aVar.s(false);
        aVar.k(context);
    }

    @Override // xsna.zal0
    public final void w(Context context, ArrayList arrayList, Collection collection, String str) {
        List list;
        int i = GiftsCatalogFragment.c0;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue >= 0) {
                intValue *= -1;
            }
            arrayList2.add(Integer.valueOf(intValue));
        }
        if (collection == null || (list = j5g.O0(collection)) == null) {
            list = EmptyList.b;
        }
        GiftsCatalogFragment.b.b(context, arrayList2, list, null, str, 32);
    }

    @Override // xsna.zal0
    public final void x(Context context, String str, String str2, long j) {
        int i = GiftsCatalogFragment.c0;
        new av1(context, str, str2, j).invoke(new nzt.a.C3428a(ahn.s() + "#owners"));
    }

    @Override // xsna.zal0
    public final void y(c5l0 c5l0Var, List<? extends n1l0> list, int i, View view) {
        q3l0 q3l0Var = c5l0Var.b;
        u390 u390Var = c5l0Var.c;
        if (u390Var.i.isShowing()) {
            return;
        }
        u390Var.e(view);
        q3l0Var.k = view;
        s820 s820Var = q3l0Var.g;
        bbl0 bbl0Var = q3l0Var.e;
        q3l0Var.i.f = view;
        q3l0Var.h.j = view;
        d3m.c(q3l0Var.c, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        d3m.c(q3l0Var.b, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        n1l0 n1l0Var = bbl0Var.e;
        TextView textView = q3l0Var.l;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (n1l0Var instanceof UGCStickerModel) {
            s820Var.e();
        } else {
            s820Var.getClass();
            if (n1l0Var instanceof StickerItem) {
                s820Var.d((StickerItem) n1l0Var);
            }
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("UI.STICKERS.LONG_TAP_PREVIEW_SHOW");
        bVar.k(aVar.e());
        bbl0Var.f = list;
        bbl0Var.notifyDataSetChanged();
        ViewPager viewPager = q3l0Var.d;
        if (viewPager.getCurrentItem() == i) {
            q3l0Var.onPageSelected(i);
        } else {
            viewPager.setCurrentItem(i, false);
        }
        n1l0 n1l0Var2 = list.get(i);
        s820Var.q = n1l0Var2;
        if (n1l0Var2 instanceof UGCStickerModel) {
            s820Var.e();
        } else {
            if (!s820Var.c(n1l0Var2) && s820Var.f) {
                s820Var.b(false);
                s820Var.f = true;
                s820Var.o = true;
            }
            if (s820Var.o && s820Var.c(n1l0Var2) && (n1l0Var2 instanceof StickerItem)) {
                s820Var.d((StickerItem) n1l0Var2);
            }
        }
        q3l0Var.c.scrollTo(0, 0);
        scl0.a.a(new scl0.c());
    }
}
