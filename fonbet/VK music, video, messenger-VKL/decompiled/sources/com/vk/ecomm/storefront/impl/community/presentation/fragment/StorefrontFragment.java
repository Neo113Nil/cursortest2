package com.vk.ecomm.storefront.impl.community.presentation.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.catalog.api.catalog.MarketCatalogSectionId;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.profile.community.api.router.CommunityMembersSource;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import defpackage.StorefrontArgs;
import defpackage.f0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a0a;
import xsna.aml0;
import xsna.ay00;
import xsna.b5u;
import xsna.bjc;
import xsna.bpn0;
import xsna.byo;
import xsna.c5v0;
import xsna.cgc;
import xsna.cpl0;
import xsna.cvk;
import xsna.cz00;
import xsna.d0i;
import xsna.dei0;
import xsna.dhc;
import xsna.drm0;
import xsna.dw20;
import xsna.e4h;
import xsna.evh0;
import xsna.fda0;
import xsna.fkq0;
import xsna.fpf0;
import xsna.fy00;
import xsna.fy9;
import xsna.gau;
import xsna.gko;
import xsna.h03;
import xsna.hjl0;
import xsna.hll0;
import xsna.ho8;
import xsna.ill0;
import xsna.iml0;
import xsna.izs;
import xsna.j5g;
import xsna.ja9;
import xsna.jai;
import xsna.jcf0;
import xsna.ksd0;
import xsna.l8w;
import xsna.maz;
import xsna.me10;
import xsna.mh4;
import xsna.msd0;
import xsna.myc0;
import xsna.ngc;
import xsna.nzw;
import xsna.ofc0;
import xsna.oz50;
import xsna.pyb;
import xsna.q530;
import xsna.q9h;
import xsna.qcy;
import xsna.qdz;
import xsna.rf3;
import xsna.rml0;
import xsna.rq;
import xsna.rz00;
import xsna.s3q0;
import xsna.sz00;
import xsna.t1q0;
import xsna.tlo0;
import xsna.tq;
import xsna.ull0;
import xsna.uzp0;
import xsna.vrq;
import xsna.wd3;
import xsna.wzb0;
import xsna.x750;
import xsna.x7g;
import xsna.xk6;
import xsna.xll0;
import xsna.ye80;
import xsna.yll0;
import xsna.z4d0;

/* compiled from: StorefrontFragment.kt */
/* loaded from: classes18.dex */
public final class StorefrontFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] S;
    public final bpn0 N = new bpn0(new wzb0(this, 12));
    public final bpn0 O = new bpn0(new dei0(this, 9));
    public final nzw P = new nzw(fpf0.d(cpl0.class).toString(), this, new iml0(this, 0));
    public final bpn0 Q = new bpn0(new ofc0(this, 11));
    public final bpn0 R = new bpn0(new x750(this, 27));

    /* compiled from: StorefrontFragment.kt */
    public static final class a extends oz50 {
        public final StorefrontArgs m;

        public a(StorefrontArgs storefrontArgs) {
            super(StorefrontFragment.class, null, null);
            this.m = storefrontArgs;
            this.j.putParcelable("arguments_market_main_fragment", storefrontArgs);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            StorefrontArgs storefrontArgs = this.m;
            UserId userId = storefrontArgs.b;
            MarketAnalyticsParams marketAnalyticsParams = storefrontArgs.c;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = marketAnalyticsParams != null ? marketAnalyticsParams.d : null;
            MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType = marketAnalyticsParams != null ? marketAnalyticsParams.m : null;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, Long.valueOf(fkq0.a(userId).b), null, null, null, null, 60, null);
            t1q0 t1q0Var = UiTracker.j;
            UiTrackingScreen b = t1q0Var.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, null, new MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem(MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.EventType.OPEN_COMMUNITY_GOODS, blockType), 57), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
            if (storefrontArgs.d) {
                UserId userId2 = storefrontArgs.b;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = marketAnalyticsParams != null ? marketAnalyticsParams.d : null;
                SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(userId2.b), null, null, null, 58, null);
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                UiTrackingScreen b3 = t1q0Var.b();
                SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b3 != null ? b3.a : null, commonMarketStat$TypeRefSource2, c2, null, new MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem(null, null, null, null, null, 31, null), 48), 2);
                UiTracker uiTracker3 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(c3, b4, uzp0Var2.a).q();
            }
        }
    }

    /* compiled from: StorefrontFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<hjl0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(hjl0 hjl0Var) {
            ((cpl0) this.receiver).b(hjl0Var);
            return s3q0.a;
        }
    }

    /* compiled from: StorefrontFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<hjl0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(hjl0 hjl0Var) {
            ((cpl0) this.receiver).b(hjl0Var);
            return s3q0.a;
        }
    }

    /* compiled from: StorefrontFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<xll0, s3q0> {
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r3 != 7) goto L194;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke(xll0 xll0Var) {
            CallProducerButton callProducerButton;
            MarketUtmData marketUtmData;
            MarketUtmData marketUtmData2;
            MarketUtmData marketUtmData3;
            String a;
            String x1;
            xll0 xll0Var2 = xll0Var;
            yll0 yll0Var = (yll0) this.receiver;
            int i = 26;
            String str = null;
            Intent intent = null;
            r5 = null;
            String str2 = null;
            r5 = null;
            String str3 = null;
            str = null;
            if (xll0Var2 instanceof xll0.a.b) {
                hll0 hll0Var = yll0Var.b;
                xll0.a.b bVar = (xll0.a.b) xll0Var2;
                int i2 = 6;
                if (bVar instanceof xll0.a.b.C4017a) {
                    ja9 ja9Var = ((xll0.a.b.C4017a) bVar).a;
                    int i3 = ja9Var.a;
                    if (i3 == 0) {
                        try {
                            hll0Var.b.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(ja9Var.e, new StringBuilder("mailto:"))));
                        } catch (Throwable unused) {
                            cvk.u(R.string.community_market_error_open_app, false);
                        }
                    } else if (i3 != 1) {
                        if (i3 != 3) {
                            if (i3 == 5) {
                                Context context = hll0Var.b;
                                String str4 = ja9Var.i;
                                String queryParameter = str4 == null ? null : Uri.parse(str4).getQueryParameter("id");
                                if (queryParameter == null) {
                                    String str5 = ja9Var.i;
                                    if (str5 == null) {
                                        queryParameter = null;
                                    } else {
                                        Uri parse = Uri.parse(str5);
                                        queryParameter = (String) j5g.b0(parse.getPathSegments().indexOf(MBridgeConstans.DYNAMIC_VIEW_WX_APP) + 1, parse.getPathSegments());
                                    }
                                }
                                if (myc0.f(ja9Var.g) && myc0.f(queryParameter)) {
                                    intent = new Intent(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(ja9Var.g)));
                                    intent.setPackage(queryParameter);
                                    if (context.getPackageManager().queryIntentActivities(intent, 131072).isEmpty()) {
                                        intent = context.getPackageManager().getLaunchIntentForPackage(queryParameter);
                                    }
                                } else if (myc0.f(queryParameter)) {
                                    intent = context.getPackageManager().getLaunchIntentForPackage(queryParameter);
                                } else if (myc0.f(ja9Var.g)) {
                                    intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(ja9Var.g));
                                }
                                if (intent != null && !context.getPackageManager().queryIntentActivities(intent, 131072).isEmpty()) {
                                    try {
                                        context.startActivity(intent);
                                    } catch (Throwable unused2) {
                                        cvk.u(R.string.community_market_error_open_app, false);
                                    }
                                }
                                if (queryParameter == null) {
                                    queryParameter = context.getPackageName();
                                }
                                gau.e(context, 4, queryParameter);
                            } else if (i3 == 6) {
                                ((qdz) hll0Var.c.q.getValue()).e().a(hll0Var.b, "https://" + a0a.d + "/app" + ja9Var.d + '_' + hll0Var.a);
                            }
                        }
                        String str6 = ja9Var.g;
                        if (str6 != null) {
                            if (ja9Var.h) {
                                ((qdz) hll0Var.c.q.getValue()).e().a(hll0Var.b, str6);
                            } else {
                                ((qdz) hll0Var.c.q.getValue()).getBrowser().f(hll0Var.b, null, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67104767), str6);
                            }
                        }
                    } else {
                        try {
                            hll0Var.b.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(ja9Var.f, new StringBuilder("tel:"))));
                        } catch (Throwable unused3) {
                            cvk.u(R.string.community_market_error_open_app, false);
                        }
                    }
                } else if (bVar instanceof xll0.a.b.c) {
                    UsersUserFullDto usersUserFullDto = ((xll0.a.b.c) bVar).a;
                    Context context2 = hll0Var.b;
                    jcf0 jcf0Var = new jcf0(usersUserFullDto, i2);
                    dw20 dw20Var = hll0Var.d;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    String K0 = usersUserFullDto.K0();
                    if (K0 == null || K0.length() == 0 || (x1 = usersUserFullDto.x1()) == null || x1.length() == 0) {
                        a = rq.a(usersUserFullDto, new StringBuilder(), ' ');
                    } else {
                        a = usersUserFullDto.K0() + ' ' + usersUserFullDto.B1();
                    }
                    hll0Var.d = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_phone_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12), new c5v0.b(12, tq.h(tlo0.Companion, R.string.community_call_dialog_title), tlo0.a.c(R.string.community_call_dialog_subtitle, drm0.p0(a).toString())), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.vk_bottomsheet_confirmation_cancel), new z4d0(hll0Var, 9), null, VkButton.Mode.Secondary, null, false, 444), new c5v0.a.C2643a(new tlo0.f(R.string.community_call), new f0(i, hll0Var, jcf0Var), null, VkButton.Mode.Primary, null, false, 444), false), 52), new ye80(hll0Var, 21), false, 20).b(context2, "confirm_call_user_dialog");
                } else {
                    if (!(bVar instanceof xll0.a.b.C4018b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pyb.b((pyb) hll0Var.c.n.getValue(), hll0Var.b, null, (int) hll0Var.a.b, null, null, null, null, 33554426);
                }
            } else {
                if (!(xll0Var2 instanceof xll0.a)) {
                    yll0Var.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                ill0 ill0Var = yll0Var.a;
                xll0.a aVar = (xll0.a) xll0Var2;
                MarketAnalyticsParams marketAnalyticsParams = ill0Var.b;
                UserId userId = ill0Var.c;
                ull0 ull0Var = ill0Var.d;
                FragmentImpl fragmentImpl = ill0Var.a;
                if (aVar instanceof xll0.a.e) {
                    String str7 = ((xll0.a.e) aVar).a;
                    if (str7 != null && !drm0.N(str7)) {
                        StringBuilder b = ho8.b(str7, "&time=");
                        b.append(System.currentTimeMillis());
                        maz.c(((qdz) ill0Var.d.q.getValue()).e(), ill0Var.a.requireContext(), b.toString(), LaunchContext.A, null, null, 24);
                    }
                } else if (aVar instanceof xll0.a.d) {
                    ((q9h) ull0Var.l.getValue()).c(fragmentImpl.requireContext(), userId);
                } else if (aVar instanceof xll0.a.f) {
                    xll0.a.f fVar = (xll0.a.f) aVar;
                    Integer valueOf = Integer.valueOf(fVar.a);
                    boolean z = fVar.b;
                    String str8 = fVar.c;
                    dhc dhcVar = (dhc) ull0Var.k.getValue();
                    Context requireContext = fragmentImpl.requireContext();
                    String h = MarketCatalogSectionId.ALBUM.h();
                    UserId userId2 = ill0Var.c;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_GOODS;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM_ALBUM;
                    if (marketAnalyticsParams != null && (marketUtmData3 = marketAnalyticsParams.b) != null) {
                        str2 = marketUtmData3.h;
                    }
                    String str9 = null;
                    String str10 = null;
                    dhcVar.d(requireContext, new ngc(null, h, userId2, null, null, null, null, null, null, null, new MarketAnalyticsParams(new MarketUtmData(null, null, str9, null, str10, null, str2, 56, null), mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str9, false, str10, false, false, null, false, 8056, null), valueOf, z, str8, 3211235));
                } else if (aVar instanceof xll0.a.g) {
                    ((rml0) ull0Var.m.getValue()).b(fragmentImpl.requireContext(), userId);
                } else if (aVar instanceof xll0.a.h) {
                    ((vrq) ull0Var.j.getValue()).a(fragmentImpl.requireContext());
                } else if (aVar instanceof xll0.a.i) {
                    fy9.a((fy9) ull0Var.i.getValue(), fragmentImpl.requireContext(), ill0Var.c, null, null, 12);
                } else if (aVar instanceof xll0.a.m) {
                    ((d0i) ull0Var.o.getValue()).d(fragmentImpl.requireContext(), fkq0.e(userId));
                } else if (aVar instanceof xll0.a.n) {
                    MarketItemLabelActionDto marketItemLabelActionDto = ((xll0.a.n) aVar).a;
                    if (marketItemLabelActionDto != null) {
                        ((q9h) ull0Var.l.getValue()).b(fragmentImpl.requireContext(), marketItemLabelActionDto);
                    }
                } else if (aVar instanceof xll0.a.q) {
                    me10.b((me10) ull0Var.r.getValue(), fragmentImpl.requireContext(), ill0Var.c, null, null, 12);
                } else if (aVar instanceof xll0.a.o) {
                    maz.c(((qdz) ull0Var.q.getValue()).e(), ill0Var.a.requireContext(), ((xll0.a.o) aVar).a, LaunchContext.A, null, null, 24);
                } else if (aVar instanceof xll0.a.p) {
                    xll0.a.p pVar = (xll0.a.p) aVar;
                    dhc dhcVar2 = (dhc) ull0Var.k.getValue();
                    Context requireContext2 = fragmentImpl.requireContext();
                    String h2 = MarketCatalogSectionId.SEARCH_STOREFRONT.h();
                    Integer num = pVar.a;
                    UserId userId3 = ill0Var.c;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = CommonMarketStat$TypeRefSource.COMMUNITY_GOODS;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_SEARCH;
                    if (marketAnalyticsParams != null && (marketUtmData2 = marketAnalyticsParams.b) != null) {
                        str3 = marketUtmData2.h;
                    }
                    String str11 = null;
                    dhcVar2.c(requireContext2, new cgc(num, userId3, false, h2, new MarketAnalyticsParams(new MarketUtmData(null, null, null, null, str11, null, str3, 56, null), mobileOfficialAppsCoreNavStat$EventScreen2, commonMarketStat$TypeRefSource2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, pVar.b, false, str11, true, true, null, false, 6456, null), 208882));
                } else if (aVar instanceof xll0.a.r) {
                    ((d0i) ull0Var.o.getValue()).c(fragmentImpl.requireContext(), ill0Var.c, ((xll0.a.r) aVar).a, CommunityMembersSource.MARKET, null);
                } else if (aVar instanceof xll0.a.s) {
                    String str12 = ((xll0.a.s) aVar).a;
                    dhc dhcVar3 = (dhc) ull0Var.k.getValue();
                    Context requireContext3 = fragmentImpl.requireContext();
                    String h3 = MarketCatalogSectionId.VIEWED_PRODUCTS.h();
                    UserId userId4 = ill0Var.c;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource3 = CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_GOODS;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen3 = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM_ALBUM;
                    if (marketAnalyticsParams != null && (marketUtmData = marketAnalyticsParams.b) != null) {
                        str = marketUtmData.h;
                    }
                    String str13 = null;
                    String str14 = null;
                    dhcVar3.d(requireContext3, new ngc(null, h3, userId4, null, null, null, null, null, null, null, new MarketAnalyticsParams(new MarketUtmData(null, null, str13, null, str14, null, str, 56, null), mobileOfficialAppsCoreNavStat$EventScreen3, commonMarketStat$TypeRefSource3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str13, false, str14, false, false, null, false, 8056, null), null, false, str12, 3604451));
                } else if (aVar instanceof xll0.a.j) {
                    xll0.a.j jVar = (xll0.a.j) aVar;
                    ((cz00) ull0Var.c.getValue()).a(fragmentImpl.requireContext(), jVar.a, new wd3(i, ill0Var, jVar));
                } else if (aVar instanceof xll0.a.k) {
                    xll0.a.k kVar = (xll0.a.k) aVar;
                    ((cz00) ull0Var.c.getValue()).b(fragmentImpl.requireContext(), kVar.a, new evh0(2, ill0Var, kVar));
                } else if (aVar instanceof xll0.a.l) {
                    b5u b5uVar = ((xll0.a.l) aVar).a;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource4 = CommonMarketStat$TypeRefSource.COMMUNITY_GOODS;
                    if (!((q530) ull0Var.d.getValue()).b(b5uVar.b, b5uVar.d)) {
                        ((sz00) ull0Var.p.getValue()).e(fragmentImpl.requireContext(), new rz00(b5uVar.a, commonMarketStat$TypeRefSource4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532));
                    }
                } else if (aVar instanceof xll0.a.c) {
                    xll0.a.c cVar = (xll0.a.c) aVar;
                    b5u b5uVar2 = cVar.a;
                    View requireView = fragmentImpl.requireView();
                    Integer num2 = cVar.b;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource5 = CommonMarketStat$TypeRefSource.COMMUNITY_GOODS;
                    List<CallProducerButton> list = b5uVar2.a.n0;
                    if (list != null && (callProducerButton = (CallProducerButton) j5g.a0(list)) != null) {
                        ksd0 ksd0Var = (ksd0) ull0Var.s.getValue();
                        Context requireContext4 = fragmentImpl.requireContext();
                        ProductTileCtaButtonType.a aVar2 = ProductTileCtaButtonType.Companion;
                        int i4 = callProducerButton.b;
                        aVar2.getClass();
                        ProductTileCtaButtonType a2 = ProductTileCtaButtonType.a.a(i4);
                        Good good = b5uVar2.a;
                        Parcel obtain = Parcel.obtain();
                        try {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                            Serializer.g gVar = new Serializer.g(obtain);
                            gVar.i0(good);
                            obtain.setDataPosition(0);
                            Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
                            obtain.recycle();
                            Good good2 = (Good) G;
                            good2.M = new Owner(good2.c, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194302, null);
                            s3q0 s3q0Var = s3q0.a;
                            ksd0.b a3 = msd0.a(good2);
                            String str15 = callProducerButton.k;
                            String str16 = callProducerButton.d;
                            UserId userId5 = callProducerButton.i;
                            InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
                            String str17 = inaccessibilityMessage != null ? inaccessibilityMessage.b : null;
                            String str18 = inaccessibilityMessage != null ? inaccessibilityMessage.c : null;
                            Boolean bool = callProducerButton.f;
                            ksd0Var.a(requireContext4, new ksd0.c(requireView, a2, a3, str15, new ksd0.c.b(userId5, str16, str17, str18, callProducerButton.l, bool != null ? bool.booleanValue() : true), num2, new ksd0.c.a(commonMarketStat$TypeRefSource5, null, null), new byo(29), false));
                        } catch (Throwable th) {
                            obtain.recycle();
                            throw th;
                        }
                    }
                } else if (aVar instanceof xll0.a.t) {
                    h03.b(((xll0.a.t) aVar).a);
                } else if (aVar instanceof xll0.a.u) {
                    e4h.l((e4h) ull0Var.e.getValue(), fragmentImpl.requireContext(), ill0Var.c, new mh4(28, ill0Var, (xll0.a.u) aVar), null, 24);
                } else if (aVar instanceof xll0.a.C4016a) {
                    fragmentImpl.finish();
                }
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StorefrontFragment.class, X3.i.U, "getStore()Lcom/vk/ecomm/storefront/impl/community/presentation/feature/StorefrontStore;", 0);
        fpf0.a.getClass();
        S = new qcy[]{propertyReference1Impl};
    }

    public final StorefrontArgs eo() {
        return (StorefrontArgs) this.N.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aml0 aml0Var = (aml0) this.Q.getValue();
        aml0Var.d.clear();
        io.reactivex.rxjava3.disposables.c cVar = aml0Var.e;
        if (cVar != null) {
            cVar.dispose();
        }
        aml0Var.e = ((fy00) aml0Var.b.f.getValue()).a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new l8w(new fda0(aml0Var, 11), 27));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-1344378648, new xk6(this, 13), true));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        aml0 aml0Var = (aml0) this.Q.getValue();
        aml0Var.c = false;
        LinkedHashMap linkedHashMap = aml0Var.d;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            aml0Var.a((ay00) it.next());
        }
        linkedHashMap.clear();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((aml0) this.Q.getValue()).c = true;
    }
}
