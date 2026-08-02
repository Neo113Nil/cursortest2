package com.sofascore.results.branding;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkerParameters;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandGradientColors;
import com.sofascore.local_persistance.BrandingBackgroundColors;
import com.sofascore.local_persistance.BrandingConfig;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.local_persistance.BrandingFeaturedTournament;
import com.sofascore.local_persistance.BrandingOddsTab;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.local_persistance.ImageDisplayType;
import com.sofascore.local_persistance.MediaFeedTab;
import com.sofascore.model.branding.ServerBrandColors;
import com.sofascore.model.branding.ServerBrandGradientColors;
import com.sofascore.model.branding.ServerBrandingBackgroundColors;
import com.sofascore.model.branding.ServerBrandingConfig;
import com.sofascore.model.branding.ServerBrandingConfigResponse;
import com.sofascore.model.branding.ServerBrandingEvent;
import com.sofascore.model.branding.ServerBrandingFantasyCompetition;
import com.sofascore.model.branding.ServerBrandingFeaturedTournament;
import com.sofascore.model.branding.ServerBrandingOddsTab;
import com.sofascore.model.branding.ServerBrandingTeam;
import com.sofascore.model.branding.ServerBrandingTournament;
import com.sofascore.model.branding.ServerMediaFeedTab;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.results.service.AbstractRetryCoroutineWorker;
import defpackage.a70;
import defpackage.ccd;
import defpackage.cl;
import defpackage.el;
import defpackage.g32;
import defpackage.hdb;
import defpackage.i40;
import defpackage.ip1;
import defpackage.jdb;
import defpackage.lm5;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.t2g;
import defpackage.tub;
import defpackage.tz9;
import defpackage.v2g;
import defpackage.wi9;
import defpackage.x2g;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.ye4;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sofascore/results/branding/BrandingConfigWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lel;", "adsRepository", "Lye4;", "Lcom/sofascore/local_persistance/BrandingConfig;", "brandingDataStore", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lel;Lye4;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandingConfigWorker extends AbstractRetryCoroutineWorker {
    public final el b;
    public final ye4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingConfigWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull el elVar, @NotNull ye4 ye4Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        elVar.getClass();
        ye4Var.getClass();
        this.b = elVar;
        this.c = ye4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x04af, code lost:
    
        if (r1.a(r6, r2) == r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0061, code lost:
    
        if (r1 == r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x04d7, code lost:
    
        if (r1 == r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x04d9, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        g32 g32Var;
        int i;
        x2g x2gVar;
        ServerBrandingConfig config;
        Map map;
        Map map2;
        Map map3;
        BrandingBackgroundColors brandingBackgroundColors;
        BrandingBackgroundColors brandingBackgroundColors2;
        if (rq3Var instanceof g32) {
            g32Var = (g32) rq3Var;
            int i2 = g32Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g32Var.u = i2 - Integer.MIN_VALUE;
                Object obj = g32Var.s;
                lu3 lu3Var = lu3.a;
                i = g32Var.u;
                int i3 = 1;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    el elVar = this.b;
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    g32Var.u = 1;
                    elVar.getClass();
                    obj = yaa.P(new cl(applicationContext, elVar, rq3Var2, 0), g32Var);
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        return jdb.a();
                    }
                    x2gVar = g32Var.r;
                    y6a.M(obj);
                    if (!(x2gVar instanceof t2g)) {
                        if (!(x2gVar instanceof v2g)) {
                            zzl.b();
                            return null;
                        }
                        return jdb.a();
                    }
                    Throwable th = ((t2g) x2gVar).a;
                    if (!(th instanceof wi9) || ((wi9) th).a != 404) {
                        return new hdb();
                    }
                    ye4 ye4Var = this.c;
                    i40 i40Var = new i40(2, rq3Var2, i3);
                    g32Var.r = x2gVar;
                    g32Var.u = 3;
                    obj = ye4Var.a(i40Var, g32Var);
                }
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof t2g)) {
                    if (!(x2gVar instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    ServerBrandingConfigResponse serverBrandingConfigResponse = (ServerBrandingConfigResponse) ((v2g) x2gVar).a;
                    if (serverBrandingConfigResponse != null && (config = serverBrandingConfigResponse.getConfig()) != null) {
                        Map<String, ServerBrandingTeam> teams = config.getTeams();
                        ArrayList arrayList = new ArrayList(teams.size());
                        for (Map.Entry<String, ServerBrandingTeam> entry : teams.entrySet()) {
                            String key = entry.getKey();
                            ServerBrandingTeam value = entry.getValue();
                            int id = value.getId();
                            Brand W = tz9.W(1, value.getBrand(), value.getUrl());
                            Boolean banner = value.getBanner();
                            String url = value.getUrl();
                            Integer bannerHeight = value.getBannerHeight();
                            Integer adUnitHeight = value.getAdUnitHeight();
                            ImageDisplayType S = tz9.S(value.getImageDisplayType());
                            Boolean header = value.getHeader();
                            Boolean appHeader = value.getAppHeader();
                            Boolean contentHeader = value.getContentHeader();
                            Boolean background = value.getBackground();
                            ServerBrandColors backgroundColor = value.getBackgroundColor();
                            BrandColors U = backgroundColor != null ? tz9.U(backgroundColor) : null;
                            ServerBrandingBackgroundColors backgroundGradientColor = value.getBackgroundGradientColor();
                            if (backgroundGradientColor != null) {
                                ServerBrandGradientColors light = backgroundGradientColor.getLight();
                                light.getClass();
                                int i4 = 4;
                                DefaultConstructorMarker defaultConstructorMarker = null;
                                BrandGradientColors brandGradientColors = new BrandGradientColors(light.getColor1(), light.getColor2(), null, i4, defaultConstructorMarker);
                                ServerBrandGradientColors dark = backgroundGradientColor.getDark();
                                dark.getClass();
                                brandingBackgroundColors2 = new BrandingBackgroundColors(brandGradientColors, new BrandGradientColors(dark.getColor1(), dark.getColor2(), 0 == true ? 1 : 0, i4, defaultConstructorMarker), null, 4, 0 == true ? 1 : 0);
                            } else {
                                brandingBackgroundColors2 = null;
                            }
                            arrayList.add(new Pair(key, new BrandingTeam(id, W, banner, url, bannerHeight, adUnitHeight, S, header, appHeader, contentHeader, background, U, brandingBackgroundColors2, value.getOddsProviderId(), value.getTakeoverImage(), value.getTakeoverImageHeight(), null, C.DEFAULT_BUFFER_SEGMENT_SIZE, null)));
                        }
                        Map o = tub.o(arrayList);
                        Map<String, ServerBrandingTournament> uniqueTournaments = config.getUniqueTournaments();
                        ArrayList arrayList2 = new ArrayList(uniqueTournaments.size());
                        for (Map.Entry<String, ServerBrandingTournament> entry2 : uniqueTournaments.entrySet()) {
                            String key2 = entry2.getKey();
                            ServerBrandingTournament value2 = entry2.getValue();
                            int id2 = value2.getId();
                            Brand T = tz9.T(value2.getBrand(), value2.getStandingsText(), value2.getUrl());
                            Boolean eventList = value2.getEventList();
                            Boolean standings = value2.getStandings();
                            Boolean playerOfTheMatch = value2.getPlayerOfTheMatch();
                            Boolean teamOfTheWeek = value2.getTeamOfTheWeek();
                            Boolean header2 = value2.getHeader();
                            Boolean banner2 = value2.getBanner();
                            Boolean details = value2.getDetails();
                            String url2 = value2.getUrl();
                            Boolean background2 = value2.getBackground();
                            ServerBrandColors backgroundColor2 = value2.getBackgroundColor();
                            BrandColors U2 = backgroundColor2 != null ? tz9.U(backgroundColor2) : null;
                            ServerBrandColors eventListColor = value2.getEventListColor();
                            BrandColors U3 = eventListColor != null ? tz9.U(eventListColor) : null;
                            Boolean appHeader2 = value2.getAppHeader();
                            Boolean contentHeader2 = value2.getContentHeader();
                            ServerBrandingBackgroundColors backgroundGradientColor2 = value2.getBackgroundGradientColor();
                            if (backgroundGradientColor2 != null) {
                                ServerBrandGradientColors light2 = backgroundGradientColor2.getLight();
                                light2.getClass();
                                BrandGradientColors brandGradientColors2 = new BrandGradientColors(light2.getColor1(), light2.getColor2(), null, 4, null);
                                ServerBrandGradientColors dark2 = backgroundGradientColor2.getDark();
                                dark2.getClass();
                                brandingBackgroundColors = new BrandingBackgroundColors(brandGradientColors2, new BrandGradientColors(dark2.getColor1(), dark2.getColor2(), null, 4, null), null, 4, 0 == true ? 1 : 0);
                            } else {
                                brandingBackgroundColors = null;
                            }
                            arrayList2.add(new Pair(key2, new BrandingTournament(id2, T, eventList, standings, playerOfTheMatch, teamOfTheWeek, header2, banner2, details, url2, background2, U2, U3, appHeader2, contentHeader2, brandingBackgroundColors, value2.getBannerHeight(), value2.getAdUnitHeight(), tz9.S(value2.getImageDisplayType()), value2.getOddsProviderId(), value2.getTakeoverImage(), value2.getTakeoverImageHeight(), value2.getForceOdds(), null, 8388608, null)));
                        }
                        Map o2 = tub.o(arrayList2);
                        Map<String, ServerBrandingOddsTab> oddsTab = config.getOddsTab();
                        ArrayList arrayList3 = new ArrayList(oddsTab.size());
                        for (Map.Entry<String, ServerBrandingOddsTab> entry3 : oddsTab.entrySet()) {
                            String key3 = entry3.getKey();
                            ServerBrandingOddsTab value3 = entry3.getValue();
                            arrayList3.add(new Pair(key3, new BrandingOddsTab(value3.getId(), tz9.W(1, value3.getBrand(), value3.getUrl()), value3.getOddsTab(), value3.getUrl(), null, 16, null)));
                        }
                        Map o3 = tub.o(arrayList3);
                        ServerMediaFeedTab mediaFeedTab = config.getMediaFeedTab();
                        MediaFeedTab mediaFeedTab2 = mediaFeedTab != null ? new MediaFeedTab(mediaFeedTab.getId(), tz9.W(1, mediaFeedTab.getBrand(), mediaFeedTab.getUrl()), mediaFeedTab.getUrl(), null, 8, null) : null;
                        Map<String, ServerBrandingFantasyCompetition> fantasyCompetitions = config.getFantasyCompetitions();
                        ArrayList arrayList4 = new ArrayList(fantasyCompetitions.size());
                        for (Map.Entry<String, ServerBrandingFantasyCompetition> entry4 : fantasyCompetitions.entrySet()) {
                            String key4 = entry4.getKey();
                            ServerBrandingFantasyCompetition value4 = entry4.getValue();
                            int id3 = value4.getId();
                            int brandingType = value4.getBrandingType();
                            String termsAndConditionsUrl = value4.getTermsAndConditionsUrl();
                            String url3 = value4.getUrl();
                            Brand W2 = tz9.W(3, value4.getBrand(), null);
                            OddsProvider oddsProvider = value4.getOddsProvider();
                            arrayList4.add(new Pair(key4, new BrandingFantasyCompetition(id3, brandingType, termsAndConditionsUrl, url3, W2, oddsProvider != null ? Integer.valueOf(oddsProvider.getId()) : null, Intrinsics.c(value4.isTermsAndConditionsMandatory(), Boolean.TRUE), null, 128, null)));
                        }
                        Map o4 = tub.o(arrayList4);
                        Map<String, ServerBrandingFeaturedTournament> featuredUniqueTournaments = config.getFeaturedUniqueTournaments();
                        if (featuredUniqueTournaments != null) {
                            ArrayList arrayList5 = new ArrayList(featuredUniqueTournaments.size());
                            for (Map.Entry<String, ServerBrandingFeaturedTournament> entry5 : featuredUniqueTournaments.entrySet()) {
                                String key5 = entry5.getKey();
                                ServerBrandingFeaturedTournament value5 = entry5.getValue();
                                arrayList5.add(new Pair(key5, new BrandingFeaturedTournament(value5.getId(), tz9.W(1, value5.getBrand(), value5.getUrl()), tz9.S(value5.getUpperImageDisplayType()), value5.getUpperBannerHeight(), value5.getUpperAdUnitHeight(), tz9.S(value5.getLowerImageDisplayType()), value5.getLowerBannerHeight(), value5.getLowerAdUnitHeight(), value5.getPlayerOfTheMatch(), value5.getTimerImage(), value5.getUrl(), null, a.o, null)));
                            }
                            map = tub.o(arrayList5);
                        } else {
                            map = null;
                        }
                        if (map == null) {
                            map = lm5.a;
                            map.getClass();
                        }
                        Map map4 = map;
                        Map<String, ServerBrandingEvent> boostedOddsEvents = config.getBoostedOddsEvents();
                        if (boostedOddsEvents != null) {
                            ArrayList arrayList6 = new ArrayList(boostedOddsEvents.size());
                            for (Map.Entry<String, ServerBrandingEvent> entry6 : boostedOddsEvents.entrySet()) {
                                arrayList6.add(new Pair(entry6.getKey(), tz9.V(entry6.getValue())));
                            }
                            map2 = tub.o(arrayList6);
                        } else {
                            map2 = null;
                        }
                        if (map2 == null) {
                            map2 = lm5.a;
                            map2.getClass();
                        }
                        Map map5 = map2;
                        Map<String, ServerBrandingEvent> partnerEvents = config.getPartnerEvents();
                        if (partnerEvents != null) {
                            ArrayList arrayList7 = new ArrayList(partnerEvents.size());
                            for (Map.Entry<String, ServerBrandingEvent> entry7 : partnerEvents.entrySet()) {
                                arrayList7.add(new Pair(entry7.getKey(), tz9.V(entry7.getValue())));
                            }
                            map3 = tub.o(arrayList7);
                        } else {
                            map3 = null;
                        }
                        if (map3 == null) {
                            map3 = lm5.a;
                            map3.getClass();
                        }
                        BrandingConfig brandingConfig = new BrandingConfig(o, o2, o3, mediaFeedTab2, o4, map4, map5, map3, null, NotificationCompat.FLAG_LOCAL_ONLY, null);
                        ccd.b = brandingConfig;
                        ye4 ye4Var2 = this.c;
                        ip1 ip1Var = new ip1(brandingConfig, rq3Var2, i3);
                        g32Var.r = x2gVar;
                        g32Var.u = 2;
                    }
                }
                if (!(x2gVar instanceof t2g)) {
                }
            }
        }
        g32Var = new g32(this, (sq3) rq3Var);
        Object obj2 = g32Var.s;
        lu3 lu3Var2 = lu3.a;
        i = g32Var.u;
        int i32 = 1;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        if (!(x2gVar instanceof t2g)) {
        }
        if (!(x2gVar instanceof t2g)) {
        }
    }
}
