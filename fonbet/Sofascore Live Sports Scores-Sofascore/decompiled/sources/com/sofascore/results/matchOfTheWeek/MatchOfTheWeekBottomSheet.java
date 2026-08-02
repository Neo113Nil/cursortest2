package com.sofascore.results.matchOfTheWeek;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.newNetwork.VoteChoices;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.results.R;
import com.sofascore.results.matchOfTheWeek.MatchOfTheWeekBottomSheet;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a5f;
import defpackage.abb;
import defpackage.axb;
import defpackage.bv;
import defpackage.ccd;
import defpackage.duf;
import defpackage.faa;
import defpackage.fdi;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.ke;
import defpackage.kv;
import defpackage.mwb;
import defpackage.n9e;
import defpackage.nv;
import defpackage.nwb;
import defpackage.otk;
import defpackage.rha;
import defpackage.snb;
import defpackage.swb;
import defpackage.tc3;
import defpackage.uic;
import defpackage.un0;
import defpackage.uwb;
import defpackage.v0f;
import defpackage.vnb;
import defpackage.vwb;
import defpackage.vz1;
import defpackage.w0f;
import defpackage.w3f;
import defpackage.wya;
import defpackage.xw3;
import defpackage.xwb;
import defpackage.y3f;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/matchOfTheWeek/MatchOfTheWeekBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "Lvz1;", "<init>", "()V", "Lvnb;", "Lrwb;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MatchOfTheWeekBottomSheet extends Hilt_MatchOfTheWeekBottomSheet implements vz1 {
    public final otk C;
    public boolean D;
    public final joa E;
    public final joa F;
    public final joa G;

    public MatchOfTheWeekBottomSheet() {
        hv7 hv7Var = new hv7(this, 24);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(hv7Var, 25));
        this.C = new otk(duf.a.getOrCreateKotlinClass(axb.class), new ix7(a, 23), new wya(5, this, a), new ix7(a, 24));
        final int i = 0;
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: gwb
            public final /* synthetic */ MatchOfTheWeekBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                int i2 = i;
                MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        Bundle arguments = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments != null) {
                            return arguments.getString("PRESELECTED_CHOICE");
                        }
                        return null;
                    case 1:
                        Bundle arguments2 = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments2 == null) {
                            return null;
                        }
                        if (!arguments2.containsKey("EVENT_ID")) {
                            arguments2 = null;
                        }
                        if (arguments2 != null) {
                            return Integer.valueOf(arguments2.getInt("EVENT_ID"));
                        }
                        return null;
                    default:
                        Bundle arguments3 = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments3 == null || (string = arguments3.getString("DEV_MOCK_OFFER_TYPE")) == null) {
                            return null;
                        }
                        return PartnerOfferType.INSTANCE.fromValue(string);
                }
            }
        });
        final int i2 = 1;
        this.F = ypa.a(ysaVar, new Function0(this) { // from class: gwb
            public final /* synthetic */ MatchOfTheWeekBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                int i22 = i2;
                MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Bundle arguments = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments != null) {
                            return arguments.getString("PRESELECTED_CHOICE");
                        }
                        return null;
                    case 1:
                        Bundle arguments2 = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments2 == null) {
                            return null;
                        }
                        if (!arguments2.containsKey("EVENT_ID")) {
                            arguments2 = null;
                        }
                        if (arguments2 != null) {
                            return Integer.valueOf(arguments2.getInt("EVENT_ID"));
                        }
                        return null;
                    default:
                        Bundle arguments3 = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments3 == null || (string = arguments3.getString("DEV_MOCK_OFFER_TYPE")) == null) {
                            return null;
                        }
                        return PartnerOfferType.INSTANCE.fromValue(string);
                }
            }
        });
        final int i3 = 2;
        this.G = ypa.a(ysaVar, new Function0(this) { // from class: gwb
            public final /* synthetic */ MatchOfTheWeekBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                int i22 = i3;
                MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Bundle arguments = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments != null) {
                            return arguments.getString("PRESELECTED_CHOICE");
                        }
                        return null;
                    case 1:
                        Bundle arguments2 = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments2 == null) {
                            return null;
                        }
                        if (!arguments2.containsKey("EVENT_ID")) {
                            arguments2 = null;
                        }
                        if (arguments2 != null) {
                            return Integer.valueOf(arguments2.getInt("EVENT_ID"));
                        }
                        return null;
                    default:
                        Bundle arguments3 = matchOfTheWeekBottomSheet.getArguments();
                        if (arguments3 == null || (string = arguments3.getString("DEV_MOCK_OFFER_TYPE")) == null) {
                            return null;
                        }
                        return PartnerOfferType.INSTANCE.fromValue(string);
                }
            }
        });
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getF() {
        return new tc3(-739473148, new faa(this, 20), true);
    }

    @Override // defpackage.vz1
    /* renamed from: b */
    public final KClass getX() {
        return duf.a.getOrCreateKotlinClass(((PartnerOfferType) this.G.getValue()) != null ? w0f.class : v0f.class);
    }

    @Override // defpackage.vz1
    public final bv e() {
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer intOrNull;
        uwb uwbVar;
        Integer intOrNull2;
        uwb uwbVar2;
        Object value;
        super.onCreate(bundle);
        axb axbVar = (axb) this.C.getValue();
        String str = (String) this.E.getValue();
        Integer num = (Integer) this.F.getValue();
        PartnerOfferType partnerOfferType = (PartnerOfferType) this.G.getValue();
        if (partnerOfferType != null) {
            axbVar.p = null;
            axbVar.o(new ke(new mwb(1, 17, "Football, Premier League, England", new swb(38, "Arsenal"), new swb(35, "Chelsea"), "21:00", "Today", Sports.FOOTBALL), new Brand(1, "Partner", "mozzart", new BrandColors("#2D247D", "#F00000", null, 4, null), new BrandColors("#ffffff", "#ffffff", null, 4, null), null, Boolean.FALSE, "https://www.sofascore.com", null, 288, null), axbVar, new w3f(R.string.who_will_win, y3f.e, false, new Vote(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, 3984, 8329), (FirstTeamToScoreVote) null, (WillBothTeamsScoreVote) null, str, (String) null, (String) null, false, StatusKt.STATUS_NOT_STARTED, false, (VoteChoices) WhoWillWinOptions.HOME_TEAM_WIN, (VoteChoices) WhoWillWinOptions.DRAW, (VoteChoices) WhoWillWinOptions.AWAY_TEAM_WIN, 1, true, 6192), partnerOfferType, 9));
            return;
        }
        if (num != null) {
            BrandingEvent s = ccd.s(num.intValue(), axbVar.i());
            if (s != null) {
                uwbVar = new uwb(num.intValue(), s);
            }
            uwbVar = null;
        } else {
            Map.Entry v = ccd.v(axbVar.i());
            if (v != null) {
                if (nwb.c(axbVar.i()).contains(v.getKey())) {
                    v = null;
                }
                if (v != null && (intOrNull = StringsKt.toIntOrNull((String) v.getKey())) != null) {
                    uwbVar = new uwb(intOrNull.intValue(), (BrandingEvent) v.getValue());
                }
            }
            uwbVar = null;
        }
        if (num != null) {
            BrandingEvent z = ccd.z(num.intValue(), axbVar.i());
            if (z != null) {
                uwbVar2 = new uwb(num.intValue(), z);
            }
            uwbVar2 = null;
        } else {
            Map.Entry w = ccd.w(axbVar.i());
            if (w != null) {
                if (nwb.c(axbVar.i()).contains(w.getKey())) {
                    w = null;
                }
                if (w != null && (intOrNull2 = StringsKt.toIntOrNull((String) w.getKey())) != null) {
                    uwbVar2 = new uwb(intOrNull2.intValue(), (BrandingEvent) w.getValue());
                }
            }
            uwbVar2 = null;
        }
        if (uwbVar != null) {
            xw3.L(un0.z(axbVar), null, null, new vwb(uwbVar.b, axbVar, uwbVar.a, str, null), 3);
            return;
        }
        if (uwbVar2 != null) {
            xw3.L(un0.z(axbVar), null, null, new xwb(uwbVar2.b, axbVar, uwbVar2.a, str, null), 3);
            return;
        }
        fdi fdiVar = axbVar.e;
        do {
            value = fdiVar.getValue();
            ((vnb) value).getClass();
        } while (!fdiVar.k(value, new snb()));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (this.D) {
            Context requireContext = requireContext();
            requireContext.getClass();
            nv.z0(requireContext, kv.CLICK, CampaignEx.JSON_NATIVE_VIDEO_MUTE, "match_of_the_week");
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            n9e.u(requireContext2, new abb(22));
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferences d;
        view.getClass();
        super.onViewCreated(view, bundle);
        ((LinearLayout) v().n).setVisibility(8);
        boolean z = ((String) this.E.getValue()) != null;
        if (((PartnerOfferType) this.G.getValue()) != null || z) {
            return;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putLong("PREF_LAST_MAIN_MATCHES_INTERSTITIAL_AD_SHOWN", System.currentTimeMillis());
        Unit unit = Unit.a;
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String t() {
        BrandingEvent brandingEvent;
        BrandingEvent brandingEvent2;
        String offerType;
        PartnerOfferType partnerOfferType = (PartnerOfferType) this.G.getValue();
        if (partnerOfferType != null) {
            return rha.j(partnerOfferType);
        }
        joa joaVar = this.F;
        Integer num = (Integer) joaVar.getValue();
        PartnerOfferType partnerOfferType2 = null;
        if (num != null) {
            int intValue = num.intValue();
            Context requireContext = requireContext();
            requireContext.getClass();
            brandingEvent = ccd.s(intValue, requireContext);
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        Map.Entry v = ccd.v(requireContext2);
        brandingEvent = v != null ? (BrandingEvent) v.getValue() : null;
        if (brandingEvent != null) {
            return "SuperOddsModal";
        }
        Integer num2 = (Integer) joaVar.getValue();
        if (num2 != null) {
            int intValue2 = num2.intValue();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            brandingEvent2 = ccd.z(intValue2, requireContext3);
        }
        Context requireContext4 = requireContext();
        requireContext4.getClass();
        Map.Entry w = ccd.w(requireContext4);
        brandingEvent2 = w != null ? (BrandingEvent) w.getValue() : null;
        if (brandingEvent2 != null && (offerType = brandingEvent2.getOfferType()) != null) {
            partnerOfferType2 = PartnerOfferType.INSTANCE.fromValue(offerType);
        }
        return partnerOfferType2 != null ? rha.j(partnerOfferType2) : "SuperOddsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
