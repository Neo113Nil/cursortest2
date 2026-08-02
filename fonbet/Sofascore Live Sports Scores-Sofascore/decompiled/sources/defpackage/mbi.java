package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.blaze.blazesdk.ads.ima.models.BlazeIMAAdRequestData;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.ima.BlazeIMAAdRequestInformation;
import com.blaze.ima.ImaHandler;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.newNetwork.NetworkResponse;
import com.sofascore.model.newNetwork.StandingsFormMultipleTournamentsResponse;
import com.sofascore.model.newNetwork.StandingsFormResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mbi extends hoi implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;
    public boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbi(StandingsResponse standingsResponse, rbi rbiVar, String str, boolean z, Integer num, Integer num2, Integer num3, boolean z2, NetworkResponse networkResponse, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = standingsResponse;
        this.u = rbiVar;
        this.v = str;
        this.w = z;
        this.x = num;
        this.y = num2;
        this.z = num3;
        this.A = z2;
        this.B = networkResponse;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.B;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        Object obj6 = this.v;
        switch (i) {
            case 0:
                return new mbi((StandingsResponse) this.t, (rbi) this.u, (String) obj6, this.w, (Integer) obj5, (Integer) obj4, (Integer) obj3, this.A, (StandingsFormResponse) obj2, rq3Var, 0);
            case 1:
                return new mbi((StandingsResponse) this.t, (rbi) this.u, (String) obj6, this.w, (Integer) obj5, (Integer) obj4, (Integer) obj3, this.A, (StandingsFormMultipleTournamentsResponse) obj2, rq3Var, 1);
            default:
                return new mbi((ImaHandler) obj6, (BlazeContentExtraInfo) obj5, (Context) obj4, (bh) obj3, (BlazeIMAAdRequestData) obj2, this.A, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((mbi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map;
        Object loadDelegateResults;
        hr9 buildImaAdsLoader;
        ExoPlayer buildExoPlayer;
        hr9 hr9Var;
        boolean z;
        Object createAdsMediaSource;
        ImaHandler imaHandler;
        ExoPlayer exoPlayer;
        int i = this.r;
        Object obj2 = this.B;
        Object obj3 = this.v;
        Object obj4 = this.x;
        Object obj5 = this.y;
        Object obj6 = this.z;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                StandingsFormResponse standingsFormResponse = (StandingsFormResponse) obj2;
                Iterator<T> it = ((StandingsResponse) this.t).getStandings().iterator();
                while (it.hasNext()) {
                    for (StandingsTableRow standingsTableRow : ((StandingsTable) it.next()).getRows()) {
                        standingsTableRow.setForm(rbi.m(standingsTableRow.getTeam().getId(), standingsFormResponse != null ? standingsFormResponse.getTeamForm(standingsTableRow.getTeam().getId()) : null));
                    }
                }
                rbi rbiVar = (rbi) this.u;
                boolean z2 = this.w;
                this.s = 1;
                Object r = s9a.r(new u8i((StandingsResponse) this.t, z2, rbiVar, (String) obj3, (Integer) obj4, (Integer) obj5, (Integer) obj6, this.A, null), this);
                return r == lu3Var ? lu3Var : r;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                StandingsFormMultipleTournamentsResponse standingsFormMultipleTournamentsResponse = (StandingsFormMultipleTournamentsResponse) obj2;
                for (StandingsTable standingsTable : ((StandingsResponse) this.t).getStandings()) {
                    for (StandingsTableRow standingsTableRow2 : standingsTable.getRows()) {
                        standingsTableRow2.setForm(rbi.m(standingsTableRow2.getTeam().getId(), standingsFormMultipleTournamentsResponse != null ? standingsFormMultipleTournamentsResponse.getTeamForm(standingsTable.getTournament().getId(), standingsTableRow2.getTeam().getId()) : null));
                    }
                }
                rbi rbiVar2 = (rbi) this.u;
                boolean z3 = this.w;
                this.s = 1;
                Object r2 = s9a.r(new u8i((StandingsResponse) this.t, z3, rbiVar2, (String) obj3, (Integer) obj4, (Integer) obj5, (Integer) obj6, this.A, null), this);
                return r2 == lu3Var2 ? lu3Var2 : r2;
            default:
                Context context = (Context) obj5;
                BlazeContentExtraInfo blazeContentExtraInfo = (BlazeContentExtraInfo) obj4;
                ImaHandler imaHandler2 = (ImaHandler) obj3;
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                try {
                } catch (Throwable th) {
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    e eVar = new e(imaHandler2, th, null, 5);
                    this.s = 2;
                    if (xw3.R(r69Var, eVar, this) != lu3Var3) {
                        return null;
                    }
                }
                if (i4 == 0) {
                    y6a.M(obj);
                    imaHandler2.extraInfo = blazeContentExtraInfo;
                    if (blazeContentExtraInfo == null || (map = blazeContentExtraInfo.getCurrent()) == null) {
                        map = lm5.a;
                        map.getClass();
                    }
                    if (blazeContentExtraInfo == null) {
                        blazeContentExtraInfo = new BlazeContentExtraInfo(null, null, null, null, null, 31, null);
                    }
                    BlazeIMAAdRequestInformation blazeIMAAdRequestInformation = new BlazeIMAAdRequestInformation(map, blazeContentExtraInfo);
                    this.s = 1;
                    loadDelegateResults = imaHandler2.loadDelegateResults(blazeIMAAdRequestInformation, this);
                    if (loadDelegateResults == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y6a.M(obj);
                            return null;
                        }
                        if (i4 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z4 = this.w;
                        imaHandler = (ImaHandler) this.u;
                        ExoPlayer exoPlayer2 = (ExoPlayer) this.t;
                        y6a.M(obj);
                        z = z4;
                        exoPlayer = exoPlayer2;
                        createAdsMediaSource = obj;
                        imaHandler.prepareWithMediaSource(exoPlayer, (wk) createAdsMediaSource, z);
                        return exoPlayer;
                    }
                    y6a.M(obj);
                    loadDelegateResults = obj;
                }
                tnm tnmVar = (tnm) loadDelegateResults;
                buildImaAdsLoader = imaHandler2.buildImaAdsLoader(context, tnmVar.c);
                imaHandler2.imaAdsLoader = buildImaAdsLoader;
                bnk bnkVar = new bnk(imaHandler2, 18);
                eo4 eo4Var = new eo4(context);
                hr4 hr4Var = new hr4(eo4Var);
                bh bhVar = (bh) obj6;
                hr4Var.d = bnkVar;
                bhVar.getClass();
                hr4Var.e = bhVar;
                buildExoPlayer = imaHandler2.buildExoPlayer(context, hr4Var);
                hr9Var = imaHandler2.imaAdsLoader;
                if (hr9Var == null) {
                    return buildExoPlayer;
                }
                bh bhVar2 = (bh) obj6;
                hr9Var.d(buildExoPlayer);
                Map map2 = tnmVar.a;
                String str = tnmVar.b;
                this.t = buildExoPlayer;
                this.u = imaHandler2;
                z = this.A;
                this.w = z;
                this.s = 3;
                createAdsMediaSource = imaHandler2.createAdsMediaSource(hr9Var, eo4Var, (BlazeIMAAdRequestData) obj2, bhVar2, map2, z, str, this);
                if (createAdsMediaSource != lu3Var3) {
                    imaHandler = imaHandler2;
                    exoPlayer = buildExoPlayer;
                    imaHandler.prepareWithMediaSource(exoPlayer, (wk) createAdsMediaSource, z);
                    return exoPlayer;
                }
                return lu3Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbi(ImaHandler imaHandler, BlazeContentExtraInfo blazeContentExtraInfo, Context context, bh bhVar, BlazeIMAAdRequestData blazeIMAAdRequestData, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.v = imaHandler;
        this.x = blazeContentExtraInfo;
        this.y = context;
        this.z = bhVar;
        this.B = blazeIMAAdRequestData;
        this.A = z;
    }
}
