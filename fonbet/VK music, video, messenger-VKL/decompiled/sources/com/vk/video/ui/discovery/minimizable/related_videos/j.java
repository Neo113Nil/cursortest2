package com.vk.video.ui.discovery.minimizable.related_videos;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Trace;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.auth.enterphone.EnterPhonePresenterInfo;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.stats.VerificationStatStartedFromReg;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionPerformClick;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;
import com.vk.im.engine.models.messages.Msg;
import com.vk.qrcode.d;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.aad0;
import xsna.ahn;
import xsna.b7;
import xsna.b9s0;
import xsna.c0e;
import xsna.c5g;
import xsna.cm70;
import xsna.cme0;
import xsna.d230;
import xsna.d9s0;
import xsna.dmh0;
import xsna.dqu;
import xsna.dw20;
import xsna.dz2;
import xsna.e040;
import xsna.epx;
import xsna.ezf;
import xsna.f4m;
import xsna.fl40;
import xsna.frf0;
import xsna.gza0;
import xsna.gzs;
import xsna.hda;
import xsna.hkp;
import xsna.hr5;
import xsna.hyg0;
import xsna.ii80;
import xsna.ir5;
import xsna.it80;
import xsna.izs;
import xsna.j2r0;
import xsna.j5g;
import xsna.j8;
import xsna.jh;
import xsna.kt0;
import xsna.ndp0;
import xsna.nzk0;
import xsna.o5t0;
import xsna.omh0;
import xsna.p4g;
import xsna.pzk0;
import xsna.qxh0;
import xsna.qyg0;
import xsna.re3;
import xsna.re4;
import xsna.rl3;
import xsna.rli0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sir0;
import xsna.skz;
import xsna.tba;
import xsna.tfx;
import xsna.tgl0;
import xsna.u4a;
import xsna.ub30;
import xsna.uft0;
import xsna.uu60;
import xsna.vcl0;
import xsna.wrl0;
import xsna.xd50;
import xsna.xlb0;
import xsna.y5r0;
import xsna.yfb;
import xsna.yyq0;
import xsna.zbi0;
import xsna.zkj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class j implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 7;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5, types: [com.vk.auth.main.b] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.vk.auth.main.b] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CodeState c;
        CodeState c2;
        SparseBooleanArray sparseBooleanArray;
        int i = this.b;
        int i2 = 2;
        int i3 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                k kVar = (k) obj4;
                String str = (String) obj3;
                VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = (VideoDiscoveryRelatedVideosSourceArgs) obj2;
                o5t0 o5t0Var = (o5t0) obj;
                hkp hkpVar = kVar.a;
                String str2 = ((VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) videoDiscoveryRelatedVideosSourceArgs).j;
                ((uft0) hkpVar.b).getClass();
                tfx tfxVar = new tfx("video.getAssistantVideosFromAlbum", new vcl0(9), new y5r0(i2));
                tfx.o(tfxVar, "temporary_uid", str, 0, 0, 12);
                if (str2 != null) {
                    tfx.o(tfxVar, "query_id", str2, 0, 0, 12);
                }
                dz2 x = yfb.x(tfxVar);
                ahn.D(x);
                return rsg0.W(x, 7).l(new fl40(new d230(20), 11)).l(new aad0(new ii80(kVar, o5t0Var, videoDiscoveryRelatedVideosSourceArgs, str, 3), 12));
            case 1:
                return new ir5.c(new hr5.b((Bitmap) obj, (RectF) obj4, (PhotosPhotoDto) obj3), (ArrayList) obj2);
            case 2:
                String str3 = (String) obj3;
                c0e.a aVar = new c0e.a((WebStickerType) obj4, (Bitmap) obj, (String) obj2, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                if (str3 != null) {
                    c0e.a.a(aVar, str3);
                }
                return aVar;
            case 3:
                com.vk.auth.enterphone.a aVar2 = (com.vk.auth.enterphone.a) obj4;
                Country country = (Country) obj2;
                String str4 = (String) obj3;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                EnterPhonePresenterInfo enterPhonePresenterInfo = aVar2.x;
                AuthStatSender authStatSender = aVar2.e;
                if (!country.equals(aVar2.c.a())) {
                    com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                    String valueOf = String.valueOf(country.b);
                    bVar.getClass();
                    SchemeStatSak$RegistrationFieldItem d = com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.SELECT_COUNTRY_NAME, valueOf);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(d);
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PROCEED_OTHER_COUNTRY_CODE, arrayList, null, null, null, null, null, 252);
                }
                authStatSender.getClass();
                authStatSender.d(AuthStatSender.Screen.PHONE);
                String a = VkPhoneFormatUtils.a(aVar2.b, str4, null, null, 28);
                if (enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.Auth) {
                    if (vkAuthValidatePhoneResult.c) {
                        sir0 sir0Var = sir0.a;
                        ?? r5 = aVar2.d;
                        sir0.e(sir0Var, r5 != 0 ? r5 : null, null, null, new LibverifyScreenData.Auth(str4, vkAuthValidatePhoneResult.b, vkAuthValidatePhoneResult.j, vkAuthValidatePhoneResult.d, vkAuthValidatePhoneResult.q, ((EnterPhonePresenterInfo.Auth) enterPhonePresenterInfo).c, a), null, 22);
                    } else {
                        sir0 sir0Var2 = sir0.a;
                        com.vk.auth.main.b bVar2 = aVar2.d;
                        com.vk.auth.main.b bVar3 = bVar2 != null ? bVar2 : null;
                        VkAuthState vkAuthState = ((EnterPhonePresenterInfo.Auth) enterPhonePresenterInfo).c;
                        String str5 = vkAuthValidatePhoneResult.b;
                        c2 = ezf.c(vkAuthValidatePhoneResult, new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null));
                        sir0.e(sir0Var2, bVar3, null, new sir0.b(vkAuthState, a, str5, c2, false), null, null, 26);
                    }
                } else if (enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.SignUp) {
                    SignUpDataHolder signUpDataHolder = aVar2.p;
                    SignUpDataHolder signUpDataHolder2 = signUpDataHolder != null ? signUpDataHolder : null;
                    if (signUpDataHolder == null) {
                        signUpDataHolder = null;
                    }
                    signUpDataHolder2.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_PHONE, null, null, 55);
                    sir0 sir0Var3 = sir0.a;
                    com.vk.auth.main.e eVar = aVar2.o;
                    com.vk.auth.main.e eVar2 = eVar != null ? eVar : null;
                    sir0.a aVar3 = new sir0.a(country, str4, vkAuthValidatePhoneResult);
                    VerificationStatStartedFromReg verificationStatStartedFromReg = new VerificationStatStartedFromReg(true);
                    boolean z = aVar2.F;
                    sir0Var3.getClass();
                    sir0.d(eVar2, aVar3, verificationStatStartedFromReg, z);
                } else {
                    if (!(enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.Validate)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sir0 sir0Var4 = sir0.a;
                    com.vk.auth.main.b bVar4 = aVar2.d;
                    com.vk.auth.main.b bVar5 = bVar4 != null ? bVar4 : null;
                    String str6 = vkAuthValidatePhoneResult.b;
                    boolean z2 = ((EnterPhonePresenterInfo.Validate) enterPhonePresenterInfo).c;
                    c = ezf.c(vkAuthValidatePhoneResult, new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null));
                    sir0.e(sir0Var4, bVar5, null, null, null, new sir0.c(str4, a, str6, z2, c), 14);
                }
                return s3q0.a;
            case 4:
                String str7 = (String) obj3;
                String str8 = (String) obj4;
                String str9 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE episode SET manifest_url = ? WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str7);
                    V0.D3(2, str8);
                    V0.D3(3, str9);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 5:
                e040 e040Var = (e040) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                Collection collection = (Collection) obj2;
                tgl0 tgl0Var = e040Var.b;
                int size = arrayList2.size();
                if (size == 0) {
                    sparseBooleanArray = new SparseBooleanArray(0);
                } else if (size != 1) {
                    Cursor d2 = tgl0Var.b().d("SELECT local_id FROM messages WHERE local_id IN(" + p4g.k(arrayList2, StringUtils.COMMA, null) + ')', null);
                    sparseBooleanArray = new SparseBooleanArray(d2.getCount());
                    Trace.beginSection(ndp0.f("Cursor.forEach"));
                    try {
                        try {
                            if (d2.moveToFirst()) {
                                while (!d2.isAfterLast()) {
                                    sparseBooleanArray.put(d2.getInt(0), true);
                                    d2.moveToNext();
                                }
                            }
                        } finally {
                            d2.close();
                        }
                    } finally {
                        Trace.endSection();
                    }
                } else {
                    SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(1);
                    int intValue = ((Number) j5g.X(arrayList2)).intValue();
                    Cursor d3 = tgl0Var.b().d("SELECT 1 FROM messages WHERE local_id = ?", new String[]{String.valueOf(intValue)});
                    int count = d3.getCount();
                    d3.close();
                    sparseBooleanArray2.put(intValue, count > 0);
                    sparseBooleanArray = sparseBooleanArray2;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : collection) {
                    if (sparseBooleanArray.get(((Msg) obj5).b)) {
                        arrayList3.add(obj5);
                    }
                }
                e040Var.a(arrayList3);
                return s3q0.a;
            case 6:
                cm70 cm70Var = (cm70) obj4;
                Context context = (Context) obj3;
                cm70Var.getClass();
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.clips_nps_survey_uploading_hide);
                View view = cm70Var.d;
                f4m.j(view);
                view.startAnimation(loadAnimation);
                cm70Var.c.a(context, (ExternalNpsCondition) obj2);
                return s3q0.a;
            case 7:
                Activity activity = (Activity) obj4;
                com.vk.qrcode.c cVar = (com.vk.qrcode.c) obj3;
                d.b bVar6 = (d.b) obj2;
                UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
                com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                String type = utilsDomainResolvedWithDataDto.getType();
                GroupsGroupFullDto f = utilsDomainResolvedWithDataDto.f();
                UsersUserFullDto i4 = utilsDomainResolvedWithDataDto.i();
                AppsAppDto d4 = utilsDomainResolvedWithDataDto.d();
                if (epx.f(type, "group") && f != null) {
                    new dqu();
                    dVar.c(activity, cVar, dqu.a(f), bVar6);
                } else if (epx.f(type, "user") && i4 != null) {
                    new j2r0();
                    dVar.f(activity, cVar, j2r0.a(i4), bVar6);
                } else if (!epx.f(type, "vk_app") || d4 == null) {
                    dVar.e(activity, cVar, bVar6);
                } else {
                    new re3();
                    dVar.g(activity, cVar, re3.b(d4), bVar6);
                }
                com.vk.qrcode.d.l = false;
                return s3q0.a;
            case 8:
                ArrayList arrayList4 = (ArrayList) obj4;
                izs izsVar = (izs) obj3;
                izs izsVar2 = (izs) obj2;
                List list = (List) obj;
                ArrayList arrayList5 = new ArrayList();
                if (arrayList4.size() > list.size()) {
                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList6.add(((gza0) it.next()).a);
                    }
                    List list2 = list;
                    ArrayList arrayList7 = new ArrayList(c5g.u(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(((xd50) it2.next()).a.Fb());
                    }
                    arrayList5.addAll(j5g.E0(arrayList6, arrayList7));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : list) {
                    if (((xd50) obj6).a.B()) {
                        arrayList8.add(obj6);
                    }
                }
                ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
                Iterator it3 = arrayList8.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(((xd50) it3.next()).a.Fb());
                }
                arrayList5.addAll(arrayList9);
                izsVar.invoke(arrayList5);
                izsVar2.invoke(list);
                return s3q0.a;
            case 9:
                dmh0 dmh0Var = (dmh0) obj4;
                kt0 kt0Var = (kt0) obj3;
                omh0 omh0Var = (omh0) obj2;
                it80 it80Var = (it80) obj;
                if (it80Var.a()) {
                    dmh0Var.j.b(new SearchAddressResult.Found(rli0.r(rli0.h(rli0.m(rl3.D(new String[]{kt0Var.c, kt0Var.b}))), ", ", null, 62), (Coordinates) it80Var.a));
                } else {
                    dmh0Var.U(dmh0.V(kt0Var), omh0Var);
                }
                return s3q0.a;
            case 10:
                ((qxh0) obj4).d((UserId) obj3, (CatalogProfileLocalState.FollowSource) obj2);
                return s3q0.a;
            case 11:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                xlb0 xlb0Var = (xlb0) obj;
                if (((ub30) obj4).d(xlb0Var.c, (zbi0) obj3)) {
                    xlb0Var.a();
                    ref$BooleanRef.element = true;
                }
                return s3q0.a;
            case 12:
                nzk0 nzk0Var = (nzk0) obj4;
                dw20 dw20Var = (dw20) obj3;
                pzk0 pzk0Var = (pzk0) obj2;
                Action action = ((LinkButton) obj).c;
                io.reactivex.rxjava3.disposables.c cVar2 = nzk0Var.i;
                if (cVar2 != null && !cVar2.h()) {
                    return s3q0.a;
                }
                if (action instanceof ActionPerformClick) {
                    dw20Var.Qn(false);
                    pzk0Var.setEnabledClickButtons(false);
                    String str10 = ((ActionPerformClick) action).c;
                    int i5 = 26;
                    tfx tfxVar2 = new tfx("specials.performAction", new j8(i5), new jh(24));
                    tfx.o(tfxVar2, "jwt", str10, 0, 0, 12);
                    nzk0Var.i = new a0(rsg0.y0(yfb.x(tfxVar2), null, null, 3), new re4(pzk0Var, 4)).subscribe(new uu60(new b7(i5, nzk0Var, dw20Var), 17), new skz(new zkj0(i3, dw20Var, nzk0Var), 27));
                } else {
                    gzs<s3q0> gzsVar = nzk0Var.g;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    dw20Var.hide();
                }
                return s3q0.a;
            default:
                UIBlock uIBlock = (UIBlock) obj4;
                b9s0 b9s0Var = (b9s0) obj3;
                boolean z3 = b9s0Var.L;
                u4a u4aVar = (u4a) obj2;
                tba<hda> tbaVar = (tba) obj;
                if (uIBlock instanceof UIBlockList) {
                    boolean z4 = u4aVar.b.c && z3;
                    TopBarVh D0 = b9s0.D0(b9s0Var, z4, u4aVar, b9s0Var.b0(u4aVar), new b9s0.h(), null, new yyq0(i3, b9s0Var, u4aVar), 16);
                    return new ShowAllListVh(u4aVar, D0, b9s0Var.E0(u4aVar, tbaVar, new d9s0(D0)), z4, false, false, null, 472);
                }
                CatalogPaginatedListViewHolder f0 = b9s0Var.f0(uIBlock, u4aVar, tbaVar, true);
                boolean z5 = u4aVar.b.c && z3;
                return new ShowAllListVh(u4aVar, b9s0.D0(b9s0Var, z5, u4aVar, b9s0Var.b0(u4aVar), new b9s0.h(), new wrl0(f0, 14), null, 32), f0, z5, false, false, null, 472);
        }
    }

    public /* synthetic */ j(com.vk.auth.enterphone.a aVar, Country country, String str) {
        this.b = 3;
        this.c = aVar;
        this.e = country;
        this.d = str;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ j(String str, String str2, String str3) {
        this.b = 4;
        this.d = str;
        this.c = str2;
        this.e = str3;
    }
}
