package com.vk.movika.sdk.android.defaultplayer.container;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.telephony.CellInfo;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.articles.a;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.home.HomeFragment2;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.log.L;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.profile.community.impl.ui.item.header.model.CommunityTrustMarkItemModel;
import com.vk.qrcode.QRStatsTracker;
import com.vk.reefton.dto.network.ReefMobileNetworkDataState;
import com.vk.reefton.dto.network.ReefNetworkType;
import com.vk.reefton.utils.ReefNetworkUtil;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunitiesTrustMarksView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModalInternalComponent;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import defpackage.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.AsrInfo;
import xsna.adx0;
import xsna.aj4;
import xsna.awt0;
import xsna.azb;
import xsna.c17;
import xsna.c5g;
import xsna.c810;
import xsna.cfd0;
import xsna.ckc0;
import xsna.cl40;
import xsna.d4h;
import xsna.dnf0;
import xsna.dw20;
import xsna.dz40;
import xsna.e43;
import xsna.enf0;
import xsna.epx;
import xsna.fkq0;
import xsna.fw3;
import xsna.g07;
import xsna.g4a0;
import xsna.gw3;
import xsna.gzs;
import xsna.hof0;
import xsna.hzp0;
import xsna.izs;
import xsna.j5g;
import xsna.jfd0;
import xsna.jjc;
import xsna.k560;
import xsna.kb70;
import xsna.kbx0;
import xsna.l19;
import xsna.l4i;
import xsna.lt10;
import xsna.mqp;
import xsna.msy;
import xsna.myc0;
import xsna.n3q;
import xsna.o1d;
import xsna.pbc0;
import xsna.ptk;
import xsna.qcy;
import xsna.qn3;
import xsna.r090;
import xsna.s3q0;
import xsna.s90;
import xsna.snv;
import xsna.sof0;
import xsna.sx40;
import xsna.tho0;
import xsna.tsu;
import xsna.u620;
import xsna.uet;
import xsna.uhw0;
import xsna.uof0;
import xsna.vab0;
import xsna.vhw0;
import xsna.vof0;
import xsna.w8t;
import xsna.w9z;
import xsna.wab0;
import xsna.wh50;
import xsna.ww50;
import xsna.x3a0;
import xsna.xq1;
import xsna.xy0;
import xsna.yvj;
import xsna.z1d;
import xsna.z4g;
import xsna.z520;
import xsna.z9r;
import xsna.zak0;
import xsna.zb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(59:23|(1:25)(1:234)|26|(1:28)(1:233)|(1:30)|31|(1:232)(1:34)|(3:36|(1:38)(1:41)|(1:40))|42|(4:45|(3:51|52|53)(3:47|48|49)|50|43)|54|55|e4|60|fd|65|(1:225)(1:69)|70|(1:224)(3:76|(4:78|(1:222)(1:81)|82|(1:84)(1:221))(1:223)|85)|86|87|(37:89|90|91|92|(1:94)(1:216)|95|(22:215|104|(1:106)(1:191)|107|108|(1:190)(1:112)|113|114|(1:189)(1:118)|119|(1:121)(1:188)|122|(2:186|187)(2:126|(1:185)(4:130|(2:133|131)|134|135))|136|(1:138)(1:184)|139|(1:141)(1:(1:183)(4:177|(2:180|178)|181|182))|142|(1:144)(1:173)|(3:146|(1:148)(4:152|(5:155|(1:157)(2:163|(1:165)(2:166|(1:168)(1:169)))|(2:159|160)(1:162)|161|153)|170|171)|149)(1:172)|150|151)|210|(26:212|104|(0)(0)|107|108|(1:110)|190|113|114|(1:116)|189|119|(0)(0)|122|(1:124)|186|187|136|(0)(0)|139|(0)(0)|142|(0)(0)|(0)(0)|150|151)|(26:209|104|(0)(0)|107|108|(0)|190|113|114|(0)|189|119|(0)(0)|122|(0)|186|187|136|(0)(0)|139|(0)(0)|142|(0)(0)|(0)(0)|150|151)|204|(1:206)|104|(0)(0)|107|108|(0)|190|113|114|(0)|189|119|(0)(0)|122|(0)|186|187|136|(0)(0)|139|(0)(0)|142|(0)(0)|(0)(0)|150|151)|219|90|91|92|(0)(0)|95|(1:97)(27:213|215|104|(0)(0)|107|108|(0)|190|113|114|(0)|189|119|(0)(0)|122|(0)|186|187|136|(0)(0)|139|(0)(0)|142|(0)(0)|(0)(0)|150|151)|210|(0)|(1:101)(27:207|209|104|(0)(0)|107|108|(0)|190|113|114|(0)|189|119|(0)(0)|122|(0)|186|187|136|(0)(0)|139|(0)(0)|142|(0)(0)|(0)(0)|150|151)|204|(0)|104|(0)(0)|107|108|(0)|190|113|114|(0)|189|119|(0)(0)|122|(0)|186|187|136|(0)(0)|139|(0)(0)|142|(0)(0)|(0)(0)|150|151) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01d9 A[Catch: SecurityException -> 0x01db, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x01db, blocks: (B:92:0x0197, B:94:0x019d, B:95:0x01a7, B:204:0x01d2, B:206:0x01d9, B:207:0x01c5, B:209:0x01cc, B:210:0x01b9, B:212:0x01bf, B:213:0x01ad, B:215:0x01b3), top: B:91:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01bf A[Catch: SecurityException -> 0x01db, TryCatch #1 {SecurityException -> 0x01db, blocks: (B:92:0x0197, B:94:0x019d, B:95:0x01a7, B:204:0x01d2, B:206:0x01d9, B:207:0x01c5, B:209:0x01cc, B:210:0x01b9, B:212:0x01bf, B:213:0x01ad, B:215:0x01b3), top: B:91:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019d A[Catch: SecurityException -> 0x01db, TryCatch #1 {SecurityException -> 0x01db, blocks: (B:92:0x0197, B:94:0x019d, B:95:0x01a7, B:204:0x01d2, B:206:0x01d9, B:207:0x01c5, B:209:0x01cc, B:210:0x01b9, B:212:0x01bf, B:213:0x01ad, B:215:0x01b3), top: B:91:0x0197 }] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, xsna.inv] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        a.InterfaceC0377a callback;
        a.InterfaceC0377a callback2;
        CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType blockType;
        long totalRxBytes;
        long j;
        long uidRxBytes;
        long j2;
        boolean z;
        boolean z2;
        Integer num;
        Integer num2;
        boolean z3;
        int i;
        ReefMobileNetworkDataState reefMobileNetworkDataState;
        ReefNetworkType reefNetworkType;
        TelephonyManager telephonyManager;
        long j3;
        String str;
        TelephonyManager telephonyManager2;
        long j4;
        boolean z4;
        ReefNetworkUtil reefNetworkUtil;
        long j5;
        EmptyList emptyList;
        Boolean bool;
        EmptyList emptyList2;
        EmptyList emptyList3;
        List<CellInfo> allCellInfo;
        TelephonyManager telephonyManager3;
        long j6;
        String str2;
        EmptyList emptyList4;
        ArrayList arrayList;
        List cellSignalStrengths;
        ArrayList arrayList2;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        String networkOperator;
        String simOperator;
        Integer valueOf;
        TelephonyManager telephonyManager4;
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        Integer num3;
        boolean z5;
        Integer num4;
        int signalStrength;
        TelephonyManager telephonyManager5;
        int i2 = 6;
        int i3 = 15;
        switch (this.b) {
            case 0:
                g gVar = (g) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                    com.vk.movika.sdk.utils.c.a(gVar, "InteractiveView");
                }
                if (gVar.g) {
                    throw new IllegalArgumentException("Can not attach detached view");
                }
                if (!gVar.f) {
                    gVar.f = true;
                    gVar.c = viewGroup;
                    com.vk.movika.sdk.android.defaultplayer.view.b bVar = ((b) gVar).m.a;
                    if (bVar != null) {
                        viewGroup.addView(bVar);
                    }
                } else if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
                    com.vk.movika.sdk.utils.c.a(gVar, "InteractiveView");
                    gVar.toString();
                }
                return s3q0.a;
            case 1:
                String str3 = (String) this.c;
                qn3 qn3Var = (qn3) this.d;
                com.vk.articles.a aVar = qn3Var.p;
                JSONObject jSONObject = new JSONObject(str3);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                String string = jSONObject.getString("type");
                if (epx.f(string, "article")) {
                    Article s = qn3Var.q.s(jSONObject2);
                    if (s != null && (callback2 = aVar.getCallback()) != null) {
                        callback2.R2(new ArticleAttachment(s));
                    }
                } else if (epx.f(string, "poll") && (callback = aVar.getCallback()) != null) {
                    callback.R2(qn3Var.s.a(jSONObject2));
                }
                return s3q0.a;
            case 2:
                gw3 gw3Var = (gw3) this.c;
                AsrInfo asrInfo = (AsrInfo) this.d;
                StringBuilder sb = new StringBuilder("asrRecordListeners: ");
                CopyOnWriteArraySet<l19> copyOnWriteArraySet = gw3Var.a;
                L.e("AsrRecordListenerProxyImpl", fw3.d(copyOnWriteArraySet, sb));
                Iterator<l19> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().onAsrRecordStarted(asrInfo);
                }
                return s3q0.a;
            case 3:
                aj4 aj4Var = (aj4) this.c;
                izs izsVar = (izs) this.d;
                if (((Boolean) ((zak0) aj4Var.b).getValue()).booleanValue()) {
                    izsVar.invoke(sx40.p0.b);
                } else {
                    izsVar.invoke(new sx40.l(((dz40.o.a) ((zak0) aj4Var.a).getValue()).a));
                }
                return s3q0.a;
            case 4:
                g07 g07Var = (g07) this.c;
                yvj yvjVar = (yvj) this.d;
                if (g07Var.b.invoke(BigPlayerBottomSheetValue.Collapsed).booleanValue()) {
                    myc0.h(yvjVar, null, null, new c17(g07Var, null), 3);
                }
                return Boolean.TRUE;
            case 5:
                azb azbVar = (azb) this.c;
                AvatarAction avatarAction = (AvatarAction) this.d;
                tsu tsuVar = azbVar.k;
                if (tsuVar != null) {
                    tsuVar.e(avatarAction);
                }
                return s3q0.a;
            case 6:
                o1d o1dVar = (o1d) this.c;
                Context context = (Context) this.d;
                j jVar = new j(o1dVar, i3);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a = msy.a(lazyThreadSafetyMode, jVar);
                return new z1d(msy.a(lazyThreadSafetyMode, new xy0(i2, o1dVar, context)), msy.a(lazyThreadSafetyMode, new xq1(2, o1dVar, a)), a, o1dVar.R);
            case 7:
                d4h d4hVar = (d4h) this.c;
                CommunityTrustMarkItemModel communityTrustMarkItemModel = (CommunityTrustMarkItemModel) this.d;
                d4hVar.c.invoke();
                GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code code = communityTrustMarkItemModel.b;
                UserId userId = d4hVar.d.a.c;
                switch (l4i.$EnumSwitchMapping$0[code.ordinal()]) {
                    case 1:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.VERIFIED_BUSINESS;
                        break;
                    case 2:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.POPULAR_SHOP;
                        break;
                    case 3:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.FRIENDS_TRUST_MARK;
                        break;
                    case 4:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.MANY_YEARS_IN_VK;
                        break;
                    case 5:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.YC_INTEGRATION;
                        break;
                    case 6:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.EXTERNAL_INTEGRATION;
                        break;
                    case 7:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.HAS_DERLIVERY;
                        break;
                    case 8:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.FREE_DELIVERY;
                        break;
                    case 9:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.SELF_DELIVERY;
                        break;
                    case 10:
                    case 11:
                    case 12:
                        blockType = CommonCommunitiesStat$TypeCommunitiesTrustMarksView.BlockType.PURCHASE_INFO;
                        break;
                    default:
                        blockType = null;
                        break;
                }
                if (blockType != null) {
                    new hzp0.k(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, Long.valueOf(userId.b), null, null, null, 58, null), new CommonCommunitiesStat$TypeCommunitiesTrustMarksView(CommonCommunitiesStat$TypeCommunitiesTrustMarksView.Event.VIEW_COMMUNITY_TRUST_MARKS, fkq0.a(userId).b, blockType)).a();
                }
                return s3q0.a;
            case 8:
                gzs gzsVar = (gzs) this.c;
                DescriptionModalInternalComponent descriptionModalInternalComponent = (DescriptionModalInternalComponent) this.d;
                DescriptionModalInternalComponent.a aVar2 = DescriptionModalInternalComponent.c;
                DescriptionState descriptionState = (DescriptionState) gzsVar.invoke();
                if (descriptionState != null) {
                    return descriptionState;
                }
                String str4 = descriptionModalInternalComponent.a.a.b;
                return new DescriptionState(str4, str4, false, 4, null);
            case 9:
                List list = (List) this.c;
                mqp mqpVar = (mqp) this.d;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    mqpVar.b.y0((NewsEntry) it2.next());
                }
                return s3q0.a;
            case 10:
                return Long.valueOf(((n3q) this.c).p((adx0) this.d));
            case 11:
                s90 s90Var = (s90) this.c;
                w8t w8tVar = (w8t) this.d;
                uet uetVar = s90Var.b;
                if (uetVar != null) {
                    w8tVar.b.invoke(uetVar);
                }
                return s3q0.a;
            case 12:
                HomeFragment2 homeFragment2 = (HomeFragment2) this.c;
                View view = (View) this.d;
                int i4 = HomeFragment2.x0;
                ((zb70) homeFragment2.n0.getValue()).a(view.getContext());
                ?? r2 = homeFragment2.V;
                if (r2 != 0) {
                    r2.j(0, homeFragment2.ko());
                }
                return s3q0.a;
            case 13:
                w9z w9zVar = (w9z) this.c;
                w9zVar.j1.invoke(((tho0) ((wh50) this.d).getValue()).a.c);
                w9zVar.hide();
                return s3q0.a;
            case 14:
                ww50 ww50Var = (ww50) this.c;
                c810.a.b bVar2 = (c810.a.b) this.d;
                if (ww50Var != null) {
                    ww50Var.H(bVar2);
                }
                return s3q0.a;
            case 15:
                gzs gzsVar2 = (gzs) this.c;
                lt10 lt10Var = (lt10) this.d;
                MediaPickerMviState mediaPickerMviState = (MediaPickerMviState) gzsVar2.invoke();
                return mediaPickerMviState == null ? new MediaPickerMviState(lt10Var.getConfig().c, 0, null, false, null, null, 62, null) : mediaPickerMviState;
            case 16:
                ((z520) this.c).j((AttachmentWithMedia) this.d);
                return s3q0.a;
            case 17:
                kb70.d dVar = (kb70.d) this.c;
                izs izsVar2 = (izs) this.d;
                if (!jjc.d().a()) {
                    snv snvVar = dVar.c;
                    if (snvVar != null) {
                        izsVar2.invoke(snvVar);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 18:
                x3a0 x3a0Var = (x3a0) this.c;
                VkPhoneValidationErrorReason vkPhoneValidationErrorReason = (VkPhoneValidationErrorReason) this.d;
                g4a0 g4a0Var = x3a0Var.A;
                g4a0Var.getClass();
                g4a0Var.a(new r090(com.vk.registration.funnels.b.a, 1));
                x3a0Var.B.invoke(vkPhoneValidationErrorReason);
                return s3q0.a;
            case 19:
                wab0 wab0Var = (wab0) this.c;
                izs izsVar3 = (izs) this.d;
                cl40.a(wab0Var.c(), MusicHapticEvent.LIGHT);
                izsVar3.invoke(vab0.b.l.b);
                return s3q0.a;
            case 20:
                pbc0 pbc0Var = (pbc0) this.c;
                View view2 = (View) this.d;
                pbc0Var.getClass();
                View l = awt0.l(view2, new u620(14));
                RLottieDrawable rLottieDrawable = l != null ? (RLottieDrawable) ((ImageView) l).getDrawable() : null;
                if (rLottieDrawable != null) {
                    rLottieDrawable.j();
                }
                return s3q0.a;
            case 21:
                return new Pair(((ExtendedUserProfile) ((ptk) this.c).a).Z0, ((ExtendedCommunityProfile) ((ptk) this.d).a).Z0);
            case 22:
                cfd0 cfd0Var = (cfd0) this.c;
                jfd0 jfd0Var = (jfd0) this.d;
                qcy<Object>[] qcyVarArr = cfd0.q1;
                ckc0.c((ckc0) cfd0Var.l1.getValue(), ((jfd0.c) jfd0Var).a, null, null, 6);
                return s3q0.a;
            case 23:
                z4g.d().i((Activity) this.c, null, -((Group) this.d).c.b, false);
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.SEND_MESSAGE);
                return s3q0.a;
            case 24:
                com.vk.reefton.trackers.h hVar = (com.vk.reefton.trackers.h) this.c;
                vof0 vof0Var = (vof0) this.d;
                ConnectivityManager connectivityManager2 = hVar.b;
                NetworkInfo activeNetworkInfo = connectivityManager2 != null ? connectivityManager2.getActiveNetworkInfo() : null;
                int type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
                int subtype = activeNetworkInfo != null ? activeNetworkInfo.getSubtype() : -1;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                enf0 enf0Var = hVar.d;
                dnf0 dnf0Var = enf0Var.d;
                dnf0 dnf0Var2 = enf0Var.e;
                List<dnf0> l2 = (dnf0Var == null || dnf0Var2 == null) ? null : e43.l(dnf0Var.a(), dnf0Var2.a());
                if (l2 == null) {
                    dnf0 dnf0Var3 = enf0Var.d;
                    l2 = dnf0Var3 != null ? Collections.singletonList(dnf0Var3.a()) : null;
                    if (l2 == null) {
                        l2 = EmptyList.b;
                    }
                }
                for (dnf0 dnf0Var4 : l2) {
                    if (dnf0Var4.i) {
                        arrayList3.add(dnf0Var4);
                    } else {
                        arrayList4.add(dnf0Var4);
                    }
                }
                synchronized (Long.valueOf(com.vk.reefton.trackers.h.l)) {
                    hVar.e.getClass();
                    totalRxBytes = TrafficStats.getTotalRxBytes();
                    j = totalRxBytes - com.vk.reefton.trackers.h.l;
                    com.vk.reefton.trackers.h.l = totalRxBytes;
                    s3q0 s3q0Var2 = s3q0.a;
                }
                synchronized (Long.valueOf(com.vk.reefton.trackers.h.m)) {
                    uidRxBytes = TrafficStats.getUidRxBytes(hVar.e.b.i());
                    j2 = uidRxBytes - com.vk.reefton.trackers.h.m;
                    com.vk.reefton.trackers.h.m = uidRxBytes;
                }
                SignalStrength signalStrength2 = (hVar.f.a() < 29 || (telephonyManager5 = hVar.c) == null) ? null : telephonyManager5.getSignalStrength();
                if (hVar.f.a() < 23 || (connectivityManager = hVar.b) == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
                    z = false;
                    z2 = false;
                    num = null;
                    num2 = null;
                    z3 = false;
                } else {
                    NetworkCapabilities networkCapabilities = hVar.b.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities != null) {
                        z = networkCapabilities.hasTransport(0);
                        z2 = networkCapabilities.hasTransport(1);
                        num4 = Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps());
                        z5 = networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15);
                        if (hVar.f.a() >= 29) {
                            signalStrength = networkCapabilities.getSignalStrength();
                            num3 = Integer.valueOf(signalStrength);
                        } else {
                            num3 = null;
                        }
                    } else {
                        num3 = null;
                        z5 = false;
                        z = false;
                        z2 = false;
                        num4 = null;
                    }
                    num2 = num3;
                    z3 = z5;
                    num = num4;
                }
                try {
                    telephonyManager4 = hVar.c;
                } catch (SecurityException unused) {
                }
                if (telephonyManager4 != null) {
                    i = telephonyManager4.getDataNetworkType();
                    reefMobileNetworkDataState = ReefMobileNetworkDataState.DATA_UNKNOWN;
                    ReefNetworkUtil reefNetworkUtil2 = hVar.e;
                    TelephonyManager telephonyManager6 = hVar.c;
                    valueOf = telephonyManager6 == null ? Integer.valueOf(telephonyManager6.getDataState()) : null;
                    reefNetworkUtil2.getClass();
                    if (valueOf != null && valueOf.intValue() == 0) {
                        reefMobileNetworkDataState = ReefMobileNetworkDataState.DATA_DISCONNECTED;
                        k560 k560Var = hVar.j;
                        hVar.e.getClass();
                        if (type != 1) {
                            switch (subtype) {
                                case 1:
                                    reefNetworkType = ReefNetworkType.GPRS;
                                    break;
                                case 2:
                                    reefNetworkType = ReefNetworkType.EDGE;
                                    break;
                                case 3:
                                    reefNetworkType = ReefNetworkType.WCDMA_UMTS;
                                    break;
                                case 4:
                                    reefNetworkType = ReefNetworkType.CDMA;
                                    break;
                                case 5:
                                    reefNetworkType = ReefNetworkType.CDMAEVDOREV0;
                                    break;
                                case 6:
                                    reefNetworkType = ReefNetworkType.CDMAEVDOREVA;
                                    break;
                                case 7:
                                case 10:
                                case 11:
                                default:
                                    reefNetworkType = ReefNetworkType.UNKNOWN;
                                    break;
                                case 8:
                                    reefNetworkType = ReefNetworkType.HSDPA;
                                    break;
                                case 9:
                                    reefNetworkType = ReefNetworkType.HSUPA;
                                    break;
                                case 12:
                                    reefNetworkType = ReefNetworkType.CDMAEVDOREVB;
                                    break;
                                case 13:
                                    reefNetworkType = ReefNetworkType.LTE;
                                    break;
                                case 14:
                                    reefNetworkType = ReefNetworkType.EHRPD;
                                    break;
                            }
                        } else {
                            reefNetworkType = ReefNetworkType.WIFI;
                        }
                        ReefNetworkType reefNetworkType2 = reefNetworkType;
                        telephonyManager = hVar.c;
                        if (telephonyManager != null || (simOperator = telephonyManager.getSimOperator()) == null) {
                            j3 = j;
                            str = null;
                        } else {
                            str = simOperator;
                            j3 = j;
                        }
                        int i5 = i;
                        TelephonyManager telephonyManager7 = hVar.c;
                        String str5 = (telephonyManager7 != null || (networkOperator = telephonyManager7.getNetworkOperator()) == null) ? null : networkOperator;
                        telephonyManager2 = hVar.c;
                        if (telephonyManager2 != null) {
                            j4 = uidRxBytes;
                            z4 = telephonyManager2.isNetworkRoaming();
                        } else {
                            j4 = uidRxBytes;
                            z4 = false;
                        }
                        reefNetworkUtil = hVar.e;
                        ReefMobileNetworkDataState reefMobileNetworkDataState2 = reefMobileNetworkDataState;
                        boolean z6 = z;
                        if (reefNetworkUtil.b.a() >= 22 || !reefNetworkUtil.a.b.l("android.permission.READ_PHONE_STATE")) {
                            j5 = j3;
                            emptyList = EmptyList.b;
                        } else {
                            SubscriptionManager subscriptionManager = reefNetworkUtil.c;
                            if (subscriptionManager == null || (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) == null) {
                                j5 = j3;
                                emptyList = EmptyList.b;
                            } else {
                                List V = j5g.V(activeSubscriptionInfoList);
                                ArrayList arrayList5 = new ArrayList(c5g.u(V, 10));
                                Iterator it3 = V.iterator();
                                while (it3.hasNext()) {
                                    SubscriptionInfo subscriptionInfo = (SubscriptionInfo) it3.next();
                                    arrayList5.add(new uof0(Integer.valueOf(subscriptionInfo.getMcc()), Integer.valueOf(subscriptionInfo.getMnc())));
                                    it3 = it3;
                                    j3 = j3;
                                }
                                j5 = j3;
                                emptyList = arrayList5;
                            }
                        }
                        ReefNetworkUtil reefNetworkUtil3 = hVar.e;
                        TelephonyManager telephonyManager8 = hVar.c;
                        hof0 hof0Var = reefNetworkUtil3.a;
                        hof0Var.a.getClass();
                        bool = hof0Var.d;
                        if (bool == null) {
                            emptyList2 = emptyList;
                            bool = Boolean.valueOf(hof0Var.b.l("android.permission.ACCESS_FINE_LOCATION"));
                        } else {
                            emptyList2 = emptyList;
                        }
                        hof0Var.d = bool;
                        if (!bool.booleanValue()) {
                            emptyList3 = EmptyList.b;
                        } else if (telephonyManager8 == null || (allCellInfo = telephonyManager8.getAllCellInfo()) == null) {
                            emptyList3 = EmptyList.b;
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator<T> it4 = allCellInfo.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(reefNetworkUtil3.a((CellInfo) it4.next()));
                            }
                            emptyList3 = arrayList6;
                        }
                        telephonyManager3 = hVar.c;
                        if (telephonyManager3 != null) {
                            j6 = j5;
                            str2 = telephonyManager3.getNetworkOperatorName();
                        } else {
                            j6 = j5;
                            str2 = null;
                        }
                        if (signalStrength2 != null) {
                            ReefNetworkUtil reefNetworkUtil4 = hVar.e;
                            emptyList4 = emptyList3;
                            if (reefNetworkUtil4.b.a() < 29) {
                                arrayList2 = null;
                            } else {
                                cellSignalStrengths = signalStrength2.getCellSignalStrengths();
                                ArrayList arrayList7 = new ArrayList();
                                Iterator it5 = cellSignalStrengths.iterator();
                                while (it5.hasNext()) {
                                    CellSignalStrength cellSignalStrength = (CellSignalStrength) it5.next();
                                    Iterator it6 = it5;
                                    sof0 c = cellSignalStrength instanceof CellSignalStrengthLte ? reefNetworkUtil4.c((CellSignalStrengthLte) cellSignalStrength) : cellSignalStrength instanceof CellSignalStrengthWcdma ? ReefNetworkUtil.d((CellSignalStrengthWcdma) cellSignalStrength) : cellSignalStrength instanceof CellSignalStrengthGsm ? reefNetworkUtil4.b((CellSignalStrengthGsm) cellSignalStrength) : null;
                                    if (c != null) {
                                        arrayList7.add(c);
                                    }
                                    it5 = it6;
                                }
                                arrayList2 = arrayList7;
                            }
                            arrayList = arrayList2;
                        } else {
                            emptyList4 = emptyList3;
                            arrayList = null;
                        }
                        k560 a2 = k560.a(k560Var, reefNetworkType2, Integer.valueOf(type), Integer.valueOf(i5), Integer.valueOf(subtype), str, str5, z4, reefMobileNetworkDataState2, emptyList2, Long.valueOf(totalRxBytes), Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j2), null, null, arrayList3, arrayList4, emptyList4, Boolean.valueOf(z6), Boolean.valueOf(z2), num, num2, str2, arrayList, z3, 24576);
                        hVar.j = a2;
                        vof0Var.a(k560.a(a2, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431));
                        hVar.j = k560.a(hVar.j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33532927);
                        return s3q0.a;
                    }
                    if (valueOf.intValue() == 1) {
                        reefMobileNetworkDataState = ReefMobileNetworkDataState.DATA_CONNECTING;
                        k560 k560Var2 = hVar.j;
                        hVar.e.getClass();
                        if (type != 1) {
                        }
                        ReefNetworkType reefNetworkType22 = reefNetworkType;
                        telephonyManager = hVar.c;
                        if (telephonyManager != null) {
                        }
                        j3 = j;
                        str = null;
                        int i52 = i;
                        TelephonyManager telephonyManager72 = hVar.c;
                        if (telephonyManager72 != null) {
                        }
                        telephonyManager2 = hVar.c;
                        if (telephonyManager2 != null) {
                        }
                        reefNetworkUtil = hVar.e;
                        ReefMobileNetworkDataState reefMobileNetworkDataState22 = reefMobileNetworkDataState;
                        boolean z62 = z;
                        if (reefNetworkUtil.b.a() >= 22) {
                        }
                        j5 = j3;
                        emptyList = EmptyList.b;
                        ReefNetworkUtil reefNetworkUtil32 = hVar.e;
                        TelephonyManager telephonyManager82 = hVar.c;
                        hof0 hof0Var2 = reefNetworkUtil32.a;
                        hof0Var2.a.getClass();
                        bool = hof0Var2.d;
                        if (bool == null) {
                        }
                        hof0Var2.d = bool;
                        if (!bool.booleanValue()) {
                        }
                        telephonyManager3 = hVar.c;
                        if (telephonyManager3 != null) {
                        }
                        if (signalStrength2 != null) {
                        }
                        k560 a22 = k560.a(k560Var2, reefNetworkType22, Integer.valueOf(type), Integer.valueOf(i52), Integer.valueOf(subtype), str, str5, z4, reefMobileNetworkDataState22, emptyList2, Long.valueOf(totalRxBytes), Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j2), null, null, arrayList3, arrayList4, emptyList4, Boolean.valueOf(z62), Boolean.valueOf(z2), num, num2, str2, arrayList, z3, 24576);
                        hVar.j = a22;
                        vof0Var.a(k560.a(a22, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431));
                        hVar.j = k560.a(hVar.j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33532927);
                        return s3q0.a;
                    }
                    if (valueOf != null && valueOf.intValue() == 2) {
                        reefMobileNetworkDataState = ReefMobileNetworkDataState.DATA_CONNECTED;
                        k560 k560Var22 = hVar.j;
                        hVar.e.getClass();
                        if (type != 1) {
                        }
                        ReefNetworkType reefNetworkType222 = reefNetworkType;
                        telephonyManager = hVar.c;
                        if (telephonyManager != null) {
                        }
                        j3 = j;
                        str = null;
                        int i522 = i;
                        TelephonyManager telephonyManager722 = hVar.c;
                        if (telephonyManager722 != null) {
                        }
                        telephonyManager2 = hVar.c;
                        if (telephonyManager2 != null) {
                        }
                        reefNetworkUtil = hVar.e;
                        ReefMobileNetworkDataState reefMobileNetworkDataState222 = reefMobileNetworkDataState;
                        boolean z622 = z;
                        if (reefNetworkUtil.b.a() >= 22) {
                        }
                        j5 = j3;
                        emptyList = EmptyList.b;
                        ReefNetworkUtil reefNetworkUtil322 = hVar.e;
                        TelephonyManager telephonyManager822 = hVar.c;
                        hof0 hof0Var22 = reefNetworkUtil322.a;
                        hof0Var22.a.getClass();
                        bool = hof0Var22.d;
                        if (bool == null) {
                        }
                        hof0Var22.d = bool;
                        if (!bool.booleanValue()) {
                        }
                        telephonyManager3 = hVar.c;
                        if (telephonyManager3 != null) {
                        }
                        if (signalStrength2 != null) {
                        }
                        k560 a222 = k560.a(k560Var22, reefNetworkType222, Integer.valueOf(type), Integer.valueOf(i522), Integer.valueOf(subtype), str, str5, z4, reefMobileNetworkDataState222, emptyList2, Long.valueOf(totalRxBytes), Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j2), null, null, arrayList3, arrayList4, emptyList4, Boolean.valueOf(z622), Boolean.valueOf(z2), num, num2, str2, arrayList, z3, 24576);
                        hVar.j = a222;
                        vof0Var.a(k560.a(a222, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431));
                        hVar.j = k560.a(hVar.j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33532927);
                        return s3q0.a;
                    }
                    if (valueOf.intValue() == 3) {
                        reefMobileNetworkDataState = ReefMobileNetworkDataState.DATA_SUSPENDED;
                    }
                    k560 k560Var222 = hVar.j;
                    hVar.e.getClass();
                    if (type != 1) {
                    }
                    ReefNetworkType reefNetworkType2222 = reefNetworkType;
                    telephonyManager = hVar.c;
                    if (telephonyManager != null) {
                    }
                    j3 = j;
                    str = null;
                    int i5222 = i;
                    TelephonyManager telephonyManager7222 = hVar.c;
                    if (telephonyManager7222 != null) {
                    }
                    telephonyManager2 = hVar.c;
                    if (telephonyManager2 != null) {
                    }
                    reefNetworkUtil = hVar.e;
                    ReefMobileNetworkDataState reefMobileNetworkDataState2222 = reefMobileNetworkDataState;
                    boolean z6222 = z;
                    if (reefNetworkUtil.b.a() >= 22) {
                    }
                    j5 = j3;
                    emptyList = EmptyList.b;
                    ReefNetworkUtil reefNetworkUtil3222 = hVar.e;
                    TelephonyManager telephonyManager8222 = hVar.c;
                    hof0 hof0Var222 = reefNetworkUtil3222.a;
                    hof0Var222.a.getClass();
                    bool = hof0Var222.d;
                    if (bool == null) {
                    }
                    hof0Var222.d = bool;
                    if (!bool.booleanValue()) {
                    }
                    telephonyManager3 = hVar.c;
                    if (telephonyManager3 != null) {
                    }
                    if (signalStrength2 != null) {
                    }
                    k560 a2222 = k560.a(k560Var222, reefNetworkType2222, Integer.valueOf(type), Integer.valueOf(i5222), Integer.valueOf(subtype), str, str5, z4, reefMobileNetworkDataState2222, emptyList2, Long.valueOf(totalRxBytes), Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j2), null, null, arrayList3, arrayList4, emptyList4, Boolean.valueOf(z6222), Boolean.valueOf(z2), num, num2, str2, arrayList, z3, 24576);
                    hVar.j = a2222;
                    vof0Var.a(k560.a(a2222, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431));
                    hVar.j = k560.a(hVar.j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33532927);
                    return s3q0.a;
                }
                i = 0;
                reefMobileNetworkDataState = ReefMobileNetworkDataState.DATA_UNKNOWN;
                ReefNetworkUtil reefNetworkUtil22 = hVar.e;
                TelephonyManager telephonyManager62 = hVar.c;
                if (telephonyManager62 == null) {
                }
                reefNetworkUtil22.getClass();
                if (valueOf != null) {
                    reefMobileNetworkDataState = ReefMobileNetworkDataState.DATA_DISCONNECTED;
                    k560 k560Var2222 = hVar.j;
                    hVar.e.getClass();
                    if (type != 1) {
                    }
                    ReefNetworkType reefNetworkType22222 = reefNetworkType;
                    telephonyManager = hVar.c;
                    if (telephonyManager != null) {
                    }
                    j3 = j;
                    str = null;
                    int i52222 = i;
                    TelephonyManager telephonyManager72222 = hVar.c;
                    if (telephonyManager72222 != null) {
                    }
                    telephonyManager2 = hVar.c;
                    if (telephonyManager2 != null) {
                    }
                    reefNetworkUtil = hVar.e;
                    ReefMobileNetworkDataState reefMobileNetworkDataState22222 = reefMobileNetworkDataState;
                    boolean z62222 = z;
                    if (reefNetworkUtil.b.a() >= 22) {
                    }
                    j5 = j3;
                    emptyList = EmptyList.b;
                    ReefNetworkUtil reefNetworkUtil32222 = hVar.e;
                    TelephonyManager telephonyManager82222 = hVar.c;
                    hof0 hof0Var2222 = reefNetworkUtil32222.a;
                    hof0Var2222.a.getClass();
                    bool = hof0Var2222.d;
                    if (bool == null) {
                    }
                    hof0Var2222.d = bool;
                    if (!bool.booleanValue()) {
                    }
                    telephonyManager3 = hVar.c;
                    if (telephonyManager3 != null) {
                    }
                    if (signalStrength2 != null) {
                    }
                    k560 a22222 = k560.a(k560Var2222, reefNetworkType22222, Integer.valueOf(type), Integer.valueOf(i52222), Integer.valueOf(subtype), str, str5, z4, reefMobileNetworkDataState22222, emptyList2, Long.valueOf(totalRxBytes), Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j2), null, null, arrayList3, arrayList4, emptyList4, Boolean.valueOf(z62222), Boolean.valueOf(z2), num, num2, str2, arrayList, z3, 24576);
                    hVar.j = a22222;
                    vof0Var.a(k560.a(a22222, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431));
                    hVar.j = k560.a(hVar.j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33532927);
                    return s3q0.a;
                }
                if (valueOf.intValue() == 1) {
                }
                if (valueOf != null) {
                    reefMobileNetworkDataState = ReefMobileNetworkDataState.DATA_CONNECTED;
                    k560 k560Var22222 = hVar.j;
                    hVar.e.getClass();
                    if (type != 1) {
                    }
                    ReefNetworkType reefNetworkType222222 = reefNetworkType;
                    telephonyManager = hVar.c;
                    if (telephonyManager != null) {
                    }
                    j3 = j;
                    str = null;
                    int i522222 = i;
                    TelephonyManager telephonyManager722222 = hVar.c;
                    if (telephonyManager722222 != null) {
                    }
                    telephonyManager2 = hVar.c;
                    if (telephonyManager2 != null) {
                    }
                    reefNetworkUtil = hVar.e;
                    ReefMobileNetworkDataState reefMobileNetworkDataState222222 = reefMobileNetworkDataState;
                    boolean z622222 = z;
                    if (reefNetworkUtil.b.a() >= 22) {
                    }
                    j5 = j3;
                    emptyList = EmptyList.b;
                    ReefNetworkUtil reefNetworkUtil322222 = hVar.e;
                    TelephonyManager telephonyManager822222 = hVar.c;
                    hof0 hof0Var22222 = reefNetworkUtil322222.a;
                    hof0Var22222.a.getClass();
                    bool = hof0Var22222.d;
                    if (bool == null) {
                    }
                    hof0Var22222.d = bool;
                    if (!bool.booleanValue()) {
                    }
                    telephonyManager3 = hVar.c;
                    if (telephonyManager3 != null) {
                    }
                    if (signalStrength2 != null) {
                    }
                    k560 a222222 = k560.a(k560Var22222, reefNetworkType222222, Integer.valueOf(type), Integer.valueOf(i522222), Integer.valueOf(subtype), str, str5, z4, reefMobileNetworkDataState222222, emptyList2, Long.valueOf(totalRxBytes), Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j2), null, null, arrayList3, arrayList4, emptyList4, Boolean.valueOf(z622222), Boolean.valueOf(z2), num, num2, str2, arrayList, z3, 24576);
                    hVar.j = a222222;
                    vof0Var.a(k560.a(a222222, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431));
                    hVar.j = k560.a(hVar.j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33532927);
                    return s3q0.a;
                }
                if (valueOf.intValue() == 3) {
                }
                k560 k560Var222222 = hVar.j;
                hVar.e.getClass();
                if (type != 1) {
                }
                ReefNetworkType reefNetworkType2222222 = reefNetworkType;
                telephonyManager = hVar.c;
                if (telephonyManager != null) {
                }
                j3 = j;
                str = null;
                int i5222222 = i;
                TelephonyManager telephonyManager7222222 = hVar.c;
                if (telephonyManager7222222 != null) {
                }
                telephonyManager2 = hVar.c;
                if (telephonyManager2 != null) {
                }
                reefNetworkUtil = hVar.e;
                ReefMobileNetworkDataState reefMobileNetworkDataState2222222 = reefMobileNetworkDataState;
                boolean z6222222 = z;
                if (reefNetworkUtil.b.a() >= 22) {
                }
                j5 = j3;
                emptyList = EmptyList.b;
                ReefNetworkUtil reefNetworkUtil3222222 = hVar.e;
                TelephonyManager telephonyManager8222222 = hVar.c;
                hof0 hof0Var222222 = reefNetworkUtil3222222.a;
                hof0Var222222.a.getClass();
                bool = hof0Var222222.d;
                if (bool == null) {
                }
                hof0Var222222.d = bool;
                if (!bool.booleanValue()) {
                }
                telephonyManager3 = hVar.c;
                if (telephonyManager3 != null) {
                }
                if (signalStrength2 != null) {
                }
                k560 a2222222 = k560.a(k560Var222222, reefNetworkType2222222, Integer.valueOf(type), Integer.valueOf(i5222222), Integer.valueOf(subtype), str, str5, z4, reefMobileNetworkDataState2222222, emptyList2, Long.valueOf(totalRxBytes), Long.valueOf(j6), Long.valueOf(j4), Long.valueOf(j2), null, null, arrayList3, arrayList4, emptyList4, Boolean.valueOf(z6222222), Boolean.valueOf(z2), num, num2, str2, arrayList, z3, 24576);
                hVar.j = a2222222;
                vof0Var.a(k560.a(a2222222, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431));
                hVar.j = k560.a(hVar.j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33532927);
                return s3q0.a;
            case 25:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) this.c).U((StoryUserViewer) this.d, false);
                return s3q0.a;
            case 26:
                izs izsVar4 = (izs) this.c;
                com.vk.video.profile.presentation.views.a aVar3 = (com.vk.video.profile.presentation.views.a) this.d;
                if (izsVar4 != null) {
                    izsVar4.invoke(aVar3);
                }
                return s3q0.a;
            case 27:
                IOException iOException = (IOException) this.c;
                File file = (File) this.d;
                String message = iOException.getMessage();
                return message == null ? z9r.a(file, "Could not read file ") : message;
            case 28:
                ((uhw0.b) this.c).l.h((vhw0) this.d);
                return s3q0.a;
            default:
                kbx0 kbx0Var = (kbx0) this.c;
                gzs gzsVar3 = (gzs) this.d;
                dw20 dw20Var = kbx0Var.b;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                gzsVar3.invoke();
                return s3q0.a;
        }
    }
}
